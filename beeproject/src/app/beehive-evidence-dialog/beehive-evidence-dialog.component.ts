import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { DialogDataBeehive2 } from '../apiary/apiary.component';
import { ApiaryService } from '../apiary/apiary.service';
import { BeehiveDTO } from '../apiary/beehive.model';
import { WeeklyEvidenceModule } from '../weekly-evidence/weekly-evidence.module';
import { WeeklyEvidenceService } from '../weekly-evidence/weekly-evidence.service';

@Component({
  selector: 'app-beehive-evidence-dialog',
  templateUrl: './beehive-evidence-dialog.component.html',
  styleUrls: ['./beehive-evidence-dialog.component.scss']
})
export class BeehiveEvidenceDialogComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<BeehiveEvidenceDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogDataBeehive2, public bps: ApiaryService,
    public eps: WeeklyEvidenceService) { }

    list: WeeklyEvidenceModule[];
    newEvidence = new WeeklyEvidenceModule(1, '2020-09-20', '', 3, 15);
    newBeehiveDTO = new BeehiveDTO(1, 1, '', 3);

    ngOnInit(): void {
      this.eps.findAll().subscribe(
        list => this.list = list
      )
  
  }
  evidence(podatak: number) {
    this.dialogRef.close();
    this.newEvidence.beehiveInWR = podatak;
    window.location.reload();
    return this.eps.create(this.newEvidence).subscribe();
  }

  onNoClick(): void {
    this.dialogRef.close();
  }
}
