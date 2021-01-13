---
layout: page
title: Assignments
permalink: /assignments/
---

Assignments for the class will appear here. 

<!--
The bottom right icons link to the Github directory for the lecture (<i class="fab fa-github"></i>), the R Markdown document for the lecture (<i class="fab fa-r-project"></i>), and a PDF, embedded on Github, for the lecture (<i class="fas fa-file-pdf"></i>).
-->

<ul id="archive">
{% for assignment in site.data.assignments %}
      <li class="archiveposturl">
        <span><a href="{{ site.baseurl }}/{{ assignment.dirname }}/{{ assignment.filename }}">{{ assignment.title }}</a></span><br>
<span class = "postlower">
<!-- <strong>tl;dr:</strong> -->{{ assignment.tldr }}</span>
<strong style="font-size:100%; font-family: 'Titillium Web', sans-serif; float:right; padding-right: .5em">

<!--
	<a href="https://github.com/{{ site.githubdir}}/tree/master/{{ assignment.dirname }}"><i class="fab fa-github"></i></a>&nbsp;&nbsp;
	<a href="https://github.com/{{ site.githubdir}}/tree/master/{{ assignment.dirname }}/{{ assignment.filename}}.Rmd"><i class="fab fa-r-project"></i></a>&nbsp;&nbsp;
	<a href="https://github.com/{{ site.githubdir}}/blob/master/{{ assignment.dirname }}/{{ assignment.filename}}.pdf"><i class="fas fa-file-pdf"></i></a>&nbsp;&nbsp;
	<a href="https://github.com/{{ site.githubdir}}/blob/master/{{ assignment.dirname }}/{{ assignment.filename}}.zip"><i class="fas fa-laptop-code"></i></a>
-->
</strong> 
      </li>
{% endfor %}
</ul>
