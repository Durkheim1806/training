import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LawsAndPrinciplesDetailsComponent } from './laws-and-principles-details.component';

describe('LawsAndPrinciplesDetailsComponent', () => {
  let component: LawsAndPrinciplesDetailsComponent;
  let fixture: ComponentFixture<LawsAndPrinciplesDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LawsAndPrinciplesDetailsComponent]
    });
    fixture = TestBed.createComponent(LawsAndPrinciplesDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
