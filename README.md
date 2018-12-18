vips_java
=============

Forked from https://github.com/tpopela/vips_java - this is a JAVA implementation of the VIPS (Visual Internet Page Segmentation) algorithm by Microsoft (http://www.cad.zju.edu.cn/home/dengcai/VIPS/VIPS_July-2004.pdf).

The original implementation output a XML file that describe the visual block hierarchy of a given webpage. We added also an HTML output that is more easy to work with and can be presented in a browser as a tree. We also added a pre-processing of the examined web-page that marks all DOM nodes with special IDs, so that the blocks in the final output of the algorithm can be correlated to their original DOM elements. 
