import {Component, OnInit} from '@angular/core';
import {RegistroService} from '../../services/registro.service';
import {Registro} from '../../entities/registro';
import {FormControl, FormGroup, Validators, ReactiveFormsModule, NgForm} from '@angular/forms';


@Component({
  selector: 'app-newregistro',
  templateUrl: './newregistro.component.html',
  styleUrls: ['./newregistro.component.css'],

})
export class NewregistroComponent implements OnInit {
  res: any;
  mensaje: string;
  statusCode: Number;
  bandera: boolean;

  boCode = false;

  requestProcessing = false;
  articleIdToUpdate = null;
  processValidation = false;

  constructor() {}

  ngOnInit() {
  }



}



