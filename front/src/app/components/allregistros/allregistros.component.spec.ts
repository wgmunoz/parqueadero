import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllregistrosComponent } from './allregistros.component';

describe('AllregistrosComponent', () => {
  let component: AllregistrosComponent;
  let fixture: ComponentFixture<AllregistrosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllregistrosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllregistrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
