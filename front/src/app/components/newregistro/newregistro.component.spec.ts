import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewregistroComponent } from './newregistro.component';

describe('NewregistroComponent', () => {
  let component: NewregistroComponent;
  let fixture: ComponentFixture<NewregistroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewregistroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewregistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
