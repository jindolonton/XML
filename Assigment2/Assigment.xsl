<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
	<html>
		<body>
			<div style="width:100%" >
			<div style="width:50%;color:red; float:left;">

						<div style="height:300px;width:300px; color:blue">
							<img>
								<xsl:attribute name="src">
   								 	<xsl:value-of select="HomePage/HotNews/FocusNews/image"/>
 								 </xsl:attribute>
 							</img>
						</div>

						<h1><xsl:value-of select="HomePage/HotNews/FocusNews/Tittle"/></h1>
						<p><xsl:value-of select="HomePage/HotNews/FocusNews/Desc"/></p>
						<li><p><xsl:value-of select="HomePage/HotNews/FocusNews/Dependent/Item/Title"/></p></li>

				</div>

			<div  style="width:25%; :blue; float:left;display:block;border: 1px solid red;padding:5px;margin-top:5px;height:400px;verflow:scroll;">
				
				 <xsl:for-each select="HomePage/HotNews/hotNewsList">
					<ul >
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
						<li><xsl:value-of select="Item/Title"/></li>
					</ul>
				</xsl:for-each>
					
				
			</div>
		</div>
	
		</body>

	</html>
</xsl:template>
</xsl:stylesheet>