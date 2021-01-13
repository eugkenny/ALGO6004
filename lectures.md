---
layout: page
title: Lectures
permalink: /lectures/
---

Lectures notes will appear here.

<!--
This page contains link to the lectures slides for the semester. Clicking the title of the week's lecture will go to a PDF, embedded in the your browser. 

The bottom right icons link to the Github directory for the lecture (<i class="fab fa-github"></i>), the R Markdown document for the lecture (<i class="fab fa-r-project"></i>), and a PDF, embedded on Github, for the lecture (<i class="fas fa-file-pdf"></i>).
-->

<ul id="archive">
{% for lectures in site.data.lectures %}
      <li class="archiveposturl">
        <span><a href="{{ site.baseurl }}/{{ lectures.dirname }}/{{ lectures.filename }}">{{ lectures.title }}</a></span><br>
<span class = "postlower">
<!-- <strong>tl;dr:</strong> -->{{ lectures.tldr }}</span>
<strong style="font-size:100%; font-family: 'Titillium Web', sans-serif; float:right; padding-right: .5em">
<!--
	<a href="https://github.com/{{ site.githubdir}}/tree/master/{{ lectures.dirname }}"><i class="fab fa-github"></i></a>&nbsp;&nbsp;
	<a href="https://github.com/{{ site.githubdir}}/tree/master/{{ lectures.dirname }}/{{ lectures.filename}}.Rmd"><i class="fab fa-r-project"></i></a>&nbsp;&nbsp;
	<a href="https://github.com/{{ site.githubdir}}/blob/master/{{ lectures.dirname }}/{{ lectures.filename}}.pdf"><i class="fas fa-file-pdf"></i></a>
-->
</strong> 
      </li>
{% endfor %}
</ul>
