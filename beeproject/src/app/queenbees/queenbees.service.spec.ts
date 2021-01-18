import { TestBed } from '@angular/core/testing';

import { QueenbeesService } from './queenbees.service';

describe('QueenbeesService', () => {
  let service: QueenbeesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QueenbeesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
