import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QueenbeesComponent } from './queenbees.component';

describe('QueenbeesComponent', () => {
  let component: QueenbeesComponent;
  let fixture: ComponentFixture<QueenbeesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QueenbeesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QueenbeesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
