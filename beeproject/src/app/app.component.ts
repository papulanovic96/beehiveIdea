import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'beeproject';
  showIt = true;

  ifClicked() {
    this.showIt = false;
  }

  constructor(private router: Router) {}
  onSubmit() {
    this.router.navigate(['/apiary']);
  }
}
