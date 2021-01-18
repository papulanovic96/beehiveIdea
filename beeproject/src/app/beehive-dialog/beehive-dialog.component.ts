import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { DialogData } from '../apiary/apiary.component';
import { Apiary } from '../apiary/apiary.model';
import { ApiaryService } from '../apiary/apiary.service';
import { BeehiveDTO } from '../apiary/beehive.model';

@Component({
  selector: 'app-beehive-dialog',
  templateUrl: './beehive-dialog.component.html',
  styleUrls: ['./beehive-dialog.component.scss']
})
export class BeehiveDialogComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<BeehiveDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData, public aps: ApiaryService) {}

  list: Apiary[];
  newBeehiveDTO = new BeehiveDTO(1, 0, '', 0);;
  
  ngOnInit(): void {
    this.aps.findAll().subscribe(
      list => this.list = list
    )
  }

  newBeehive() {
    this.dialogRef.close();
    return this.aps.createBeeHive(this.newBeehiveDTO).subscribe();
    
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

}