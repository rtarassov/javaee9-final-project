import { Component } from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";

@Component({
  selector: 'app-news-form',
  templateUrl: './news-form.component.html',
  styleUrls: ['./news-form.component.css']
})
export class NewsFormComponent {

  postForm = this.formBuilder.group({
    header: ['', Validators.required],
    content: ['', Validators.required],
    author: ['', Validators.required]
  });
  constructor(private formBuilder: FormBuilder) { }

  createPost() {
    console.log("Trying to create post...")
  }
}
