import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { WeeklyEvidenceModule } from './weekly-evidence.module';
import { WeeklyEvidenceService } from './weekly-evidence.service';



@Component({
  selector: 'app-weekly-evidence',
  templateUrl: './weekly-evidence.component.html',
  styleUrls: ['./weekly-evidence.component.scss']
})
export class WeeklyEvidenceComponent implements OnInit {

  list: WeeklyEvidenceModule[];

  constructor(private service: WeeklyEvidenceService) { }

  ngOnInit(): void {
    this.service.findAll().subscribe(
      list => this.list = list
    );
  }

  create(component: WeeklyEvidenceModule) {
    this.service.create(component).subscribe();
  }

}
