import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeeklyEvidenceComponent } from './weekly-evidence.component';

describe('WeeklyEvidenceComponent', () => {
  let component: WeeklyEvidenceComponent;
  let fixture: ComponentFixture<WeeklyEvidenceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeeklyEvidenceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeeklyEvidenceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
