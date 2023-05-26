import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LawsAndPrinciplesComponent } from './laws-and-principles.component';

describe('LawsAndPrinciplesComponent', () => {
  let component: LawsAndPrinciplesComponent;
  let fixture: ComponentFixture<LawsAndPrinciplesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LawsAndPrinciplesComponent]
    });
    fixture = TestBed.createComponent(LawsAndPrinciplesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
