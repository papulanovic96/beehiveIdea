import { TestBed } from '@angular/core/testing';

import { WeeklyEvidenceService } from './weekly-evidence.service';

describe('WeeklyEvidenceService', () => {
  let service: WeeklyEvidenceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WeeklyEvidenceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
