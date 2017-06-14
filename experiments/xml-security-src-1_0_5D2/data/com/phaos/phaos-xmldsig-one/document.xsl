
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                >

<xsl:strip-space elements="player name position team"/>
<xsl:output
   method="xml"
   indent="yes"
   encoding="iso-8859-1"
/>

<xsl:template match="player">
 <html>
   <head>
     <title>
       <xsl:value-of select="name"/>
     </title>
   </head>
   <body>
     <xsl:apply-templates/>
   </body>
 </html>
</xsl:template>

<xsl:template match="player/name">
  <h1>
    <xsl:apply-templates/>
  </h1>
</xsl:template>

<xsl:template match="player/position">
  <h2>
    <xsl:apply-templates/>
  </h2>
</xsl:template>

<xsl:template match="player/team">
  <h3>
    <xsl:apply-templates/>
  </h3>
</xsl:template>



</xsl:stylesheet>
