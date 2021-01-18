import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ActivityCalendarComponent } from './activity-calendar.component';
import { ActivityCalendarModule } from './activity-calendar.module';

@Injectable({
  providedIn: 'root'
})
export class ActivityCalendarService {

  private urlAll = "http://localhost:4200/calendar/findAll";
  private urlCreate = "http://localhost:4200/calendar/add";

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get<ActivityCalendarModule[]>(this.urlAll);
  }

  create(component: ActivityCalendarModule) {
    return this.http.post<ActivityCalendarModule>(this.urlCreate, component);
  }
}
