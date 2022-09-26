import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ElementsCardsComponent } from './elements-cards.component';

describe('ElementsCardsComponent', () => {
  let component: ElementsCardsComponent;
  let fixture: ComponentFixture<ElementsCardsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ElementsCardsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ElementsCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
