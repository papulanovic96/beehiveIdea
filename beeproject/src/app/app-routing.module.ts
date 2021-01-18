import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ApiaryComponent } from './apiary/apiary.component';
import { QueenbeesComponent } from './queenbees/queenbees.component';
import { EquipmentComponent } from './equipment/equipment.component';
import { StatisticsComponent } from './statistics/statistics.component';
import { HelpComponent } from './help/help.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'apiary', component: ApiaryComponent},
  {path: 'queenbees', component: QueenbeesComponent},
  {path: 'equipment', component: EquipmentComponent},
  {path: 'stats', component: StatisticsComponent},
  {path: 'help', component: HelpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})

export class AppRoutingModule { }
