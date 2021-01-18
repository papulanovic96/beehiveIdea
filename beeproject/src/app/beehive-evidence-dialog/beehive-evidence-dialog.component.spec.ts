import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeehiveEvidenceDialogComponent } from './beehive-evidence-dialog.component';

describe('BeehiveEvidenceDialogComponent', () => {
  let component: BeehiveEvidenceDialogComponent;
  let fixture: ComponentFixture<BeehiveEvidenceDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeehiveEvidenceDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeehiveEvidenceDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
