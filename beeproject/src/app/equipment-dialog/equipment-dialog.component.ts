import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { DialogData } from '../apiary/apiary.component';
import { Equipment } from '../equipment/equipment';
import { EquipmentService } from '../equipment/equipment.service';
import { FormControl } from '@angular/forms';
import { DialogDataEquipment } from '../equipment/equipment.component';

@Component({
  selector: 'app-equipment-dialog',
  templateUrl: './equipment-dialog.component.html',
  styleUrls: ['./equipment-dialog.component.scss']
})
export class EquipmentDialogComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<EquipmentDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogDataEquipment, public eqs: EquipmentService) { }

  list: Equipment[];
  equipment = new Equipment(0, 'neko ime', 0, '');
  name = this.equipment.name;
  quantity = this.equipment.quantity;

  ngOnInit(): void {
    this.eqs.findAll().subscribe(
      list => this.list = list
    )
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
