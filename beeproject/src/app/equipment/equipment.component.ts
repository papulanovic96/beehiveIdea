import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { EquipmentDialogComponent } from '../equipment-dialog/equipment-dialog.component';
import { Equipment } from './equipment';
import { EquipmentService } from './equipment.service';
import { FormControl } from '@angular/forms';

export interface DialogDataEquipment {
  quantity: number;
  name: string;
}

@Component({
  selector: 'app-equipment',
  templateUrl: './equipment.component.html',
  styleUrls: ['./equipment.component.scss']
})
export class EquipmentComponent implements OnInit {

  name = 'NeWnAME';
  quantity = 1;
  list: Equipment[];
  equipment = new Equipment(1, 'default', 0, '');

  constructor(private service: EquipmentService, public dialog: MatDialog) { }

  ngOnInit(): void {
    this.service.findAll().subscribe(
      list => this.list = list
    )
  }

  openEquipment(abc: Equipment) {
    const dialogRef = this.dialog.open(EquipmentDialogComponent, {
      width: '500px',
      data: { name: abc.name, quantity: abc.quantity}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    })
  }

}
