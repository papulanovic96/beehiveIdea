import { Component, OnInit, Inject } from '@angular/core';
import { Router } from '@angular/router';
import { ApiaryService } from '../apiary/apiary.service';
import { Apiary } from './apiary.model';
import { FormControl } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { BeehiveDialogComponent } from '../beehive-dialog/beehive-dialog.component';
import { BeehiveDTO } from './beehive.model';
import { BeehiveEvidenceDialogComponent } from '../beehive-evidence-dialog/beehive-evidence-dialog.component';

export interface DialogData {
  animal: string;
  name: string;
}
export interface DialogDataBeehive2 {
  boxNumber: number;
  reviewType: string;
  reviewDate: string;
  beehiveInWR: number;
  beekeeperInWR: number;
}

@Component({
  selector: 'app-apiary',
  templateUrl: './apiary.component.html',
  styleUrls: ['./apiary.component.scss']
})
export class ApiaryComponent implements OnInit {
  panelOpenState = false;
  constructor(private router: Router, private apiaryService: ApiaryService, public dialog: MatDialog) { }


  animal: string;
  name: string;
  boxNumber: number;
  reviewType: string;
  reviewDate: string;
  beehiveInWR: number;
  beekeeperInWR: number;
  showIt = true;
  apiaries: Apiary[];
  stanje: string;
  _pcelinjaci = ['Пчелињак '];
  newAp: Apiary;
  beehives = [1, 2];
  
  selected = new FormControl(0);

  addTab(selectAfterAdding: boolean) {
    this.newAp = new Apiary(0, 0, false, [], []);
    this.apiaries.push(this.newAp);
    this.apiaryService.create(this.newAp).subscribe();
    if (selectAfterAdding) {
      this.selected.setValue(this.apiaries.length - 1);
    } else {
      window.location.reload();
    }
    
  }

  removeTab(index: number, id: number) {
    if(this.apiaries[index].beehiveNumber == 0) {
        this.apiaryService.delete(id).subscribe();
        this.apiaries.splice(index, 1);
    } else {
      alert("Can't delete apiary with beehives!")
    }
    
  }
  
  addBeehive(): void {
    const dialogRef = this.dialog.open(BeehiveDialogComponent, {
      width: '250px',
      data: {name: this.name, animal: this.animal}
    }
    );

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.animal = result;
    });
    
  }
  evidence(beehive: number) {
    console.log(beehive);
    const dialogRef = this.dialog.open(BeehiveEvidenceDialogComponent, {
      data: {reviewType: this.reviewType, reviewDate: this.reviewDate, beehiveInWR: beehive, beekeeperInWR: this.beekeeperInWR}
    }
    );

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.beehiveInWR = result;
    });
  }
  resetHome() {
    this.router.navigate(['']);
    this.showIt = true;
  }

  checkState(): string {
    this.apiaries.forEach(element => {
      if(element.state == true) {
        this.stanje = 'Pregledana';
      } else {
        this.stanje = 'Nepregledana';
      }
    });
    return this.stanje;
  }

  ngOnInit(): void {
    this.apiaryService.findAll().subscribe(
      apiaries => this.apiaries = apiaries
    );
  }

}
