import { Component, OnInit } from '@angular/core';
import { ActivityCalendarService } from '../activity-calendar/activity-calendar.service';
import { ActivityCalendarModule } from '../activity-calendar/activity-calendar.module';

@Component({
  selector: 'app-queenbees',
  templateUrl: './queenbees.component.html',
  styleUrls: ['./queenbees.component.scss']
})
export class QueenbeesComponent implements OnInit {

  constructor(private acs: ActivityCalendarService) { }

  days = ['Субота', 'Недјеља', 'Понедјељак', 'Уторак', 'Сриједа', 'Четвртак', 'Петак'];
  daysNumbers = ['A', 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28];
  activity = ['Ставити апарат, без поклопца, у средину одабраног друштва', 'Затворити матицу у апарат', 'Контрола заложености апарата. Ослободити матицу',
              'Формирање одграјивачких друштава', 'Пресађивање ларвица', 'Од 3. до 8. дана стално траба да има сирупа у хранилицама одгајивачких друштава',
              'Контрола броја изграђених матичњака ради планирања броја нуклеуса', 'По подне - формирање нуклеуса', 'По подне - изграђивање матичњака', 
              'Извођење матица', 'По подне - контрола излежености матица и вађење основа матичњака', 'Прије подне - контрола оплодње и квалитета матица, и одузимање матица из нуклеуса'+
              'По подне - пресађивање матичњака']; 
  hour: number[];

  activityCalendar: ActivityCalendarModule[];
  calendarNew = new ActivityCalendarModule(1, '', 0, 0, '', 15);
  displayedColumns: string[] = ['Дан', 'Р. бр. дана', 'Сат', 'Активност'];
  ngOnInit(): void {
    this.acs.findAll().subscribe(
      activityCalendar => this.activityCalendar = activityCalendar
    );
    this.hour = [7, 12, 18];
  }

  create() {
    this.acs.create(this.calendarNew).subscribe();
    window.location.reload();
  }

}
