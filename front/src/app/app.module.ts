import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule} from '@angular/http';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AllregistrosComponent } from './components/allregistros/allregistros.component';
import { RegistroService} from '../app/services/registro.service';
import { HomeComponent } from './components/home/home.component';
import { BarComponent } from './components/bar/bar.component';
import { NewregistroComponent } from './components/newregistro/newregistro.component';
import { APP_ROUTING } from './app.routes';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AllregistrosComponent,
    HomeComponent,
    BarComponent,
    NewregistroComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpModule, APP_ROUTING , ReactiveFormsModule
  ],
  providers: [RegistroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
