import { Component, OnInit } from '@angular/core';
import { RegistroService } from '../../services/registro.service';
import { Registro } from '../../entities/registro';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class RegistroComponent implements OnInit {

  Allregistros: Registro[];
  statusCode: number;
  bandera: boolean;
  constructor( private registroService: RegistroService) { }

  ngOnInit() {
     this.getAllregistros();
  }

  getAllregistros() {
    this.registroService.getAllregistros()
      .subscribe(
      data => this.Allregistros = data,
      errorCode => this.statusCode = errorCode
      );
  }

}
