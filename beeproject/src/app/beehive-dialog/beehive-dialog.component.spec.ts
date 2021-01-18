import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeehiveDialogComponent } from './beehive-dialog.component';

describe('BeehiveDialogComponent', () => {
  let component: BeehiveDialogComponent;
  let fixture: ComponentFixture<BeehiveDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeehiveDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeehiveDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
