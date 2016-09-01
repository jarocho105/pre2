/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.web.jsf.sessionbean;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Date;
import java.io.Serializable;


import com.bydan.framework.erp.util.Constantes;
import com.bydan.erp.seguridad.business.entity.*;

@SuppressWarnings("unused")
public class AuditoriaSessionBean  extends AuditoriaSessionBeanAdditional {
	private static final long serialVersionUID = 1L;
	
	protected Boolean isPermiteNavegacionHaciaForeignKeyDesdeAuditoria;
	protected Boolean isPermiteRecargarInformacion;
	protected String sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoria;
	protected Long lIdAuditoriaActualForeignKey;	
	
	protected Long lIdAuditoriaActualForeignKeyParaPosibleAtras;
	protected Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras;
	protected String sUltimaBusquedaAuditoria;
	protected String sServletGenerarHtmlReporte;
	
	protected Integer iNumeroPaginacion;
	protected Integer iNumeroPaginacionPagina;
	
	protected String sPathNavegacionActual="";	
	protected Boolean isPaginaPopup=false;	
	protected String sStyleDivArbol="";	
	protected String sStyleDivContent="";
	protected String sStyleDivOpcionesBanner="";	
	protected String sStyleDivExpandirColapsar="";	
	
	protected String sFuncionBusquedaRapida="";
	
	
	Boolean isBusquedaDesdeForeignKeySesionUsuario;
	Long lidUsuarioActual;
	
	private Long id;
	private Long id_usuario;
	private String nombre_tabla;
	private Long id_fila;
	private String proceso;
	private String nombre_p_c;
	private String ip_pc;
	private String usuario_p_c;
	private Timestamp fecha_hora;
	private Timestamp fecha_horaFinal;
	private String observacion;
	
	protected Boolean conGuardarRelaciones=false;
	protected Boolean estaModoGuardarRelaciones=false;
	protected Boolean esGuardarRelacionado=false;
	protected Boolean estaModoBusqueda=false;
	protected Boolean noMantenimiento=false;
	
					
	 	
		
	
	protected AuditoriaSessionBeanAdditional auditoriaSessionBeanAdditional=null;
	
	public AuditoriaSessionBeanAdditional getAuditoriaSessionBeanAdditional() {
		return this.auditoriaSessionBeanAdditional;
	}
	
	public void setAuditoriaSessionBeanAdditional(AuditoriaSessionBeanAdditional auditoriaSessionBeanAdditional) {
		try {
			this.auditoriaSessionBeanAdditional=auditoriaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	public AuditoriaSessionBean () {
		this.inicializarAuditoriaSessionBean();
	}
	
	public void inicializarAuditoriaSessionBean () {	
		this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoria=false;
		
		this.isPermiteRecargarInformacion=false;
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria="";
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoria=false;
		this.lIdAuditoriaActualForeignKey=0L;
		this.lIdAuditoriaActualForeignKeyParaPosibleAtras=0L;
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras=false;
		this.sUltimaBusquedaAuditoria ="";
		this.sServletGenerarHtmlReporte="";
		
		this.iNumeroPaginacion=10;
		this.iNumeroPaginacionPagina=0;
		this.sPathNavegacionActual="";
		this.sFuncionBusquedaRapida="";
		
		this.sStyleDivArbol="display:table-row;width:20%;height:800px;visibility:visible";	
		this.sStyleDivContent="height:600px;width:80%";
		this.sStyleDivOpcionesBanner="display:table-row";
		this.sStyleDivExpandirColapsar="display:table-row";		
		this.isPaginaPopup=false;
		
		this.estaModoGuardarRelaciones=true;
		
		this.conGuardarRelaciones=false;
		
		this.esGuardarRelacionado=false;
		
		this.estaModoBusqueda=false;
		this.noMantenimiento=false;
		
		
		isBusquedaDesdeForeignKeySesionUsuario=false;
		lidUsuarioActual=0L; 
		
		
		
 		this.id_usuario=-1L;
 		this.nombre_tabla="";
 		this.id_fila=0L;
 		this.proceso="";
 		this.nombre_p_c="";
 		this.ip_pc="";
 		this.usuario_p_c="";
 		this.fecha_hora=new Timestamp((new Date()).getTime());
		this.fecha_horaFinal=new Timestamp((new Date()).getTime());
 		this.observacion="";
		
		
		
		
		
    } 
	
	public void setPaginaPopupVariables(Boolean isPopupVariables) { 		
		if(isPopupVariables) {
			if(!this.isPaginaPopup) {
				this.sStyleDivArbol="display:none;width:0px;height:0px;visibility:hidden";
				this.sStyleDivContent="height:800px;width:100%";;
				this.sStyleDivOpcionesBanner="display:none";
				this.sStyleDivExpandirColapsar="display:none";
				this.isPaginaPopup=true;
			}
		} else {
			if(this.isPaginaPopup) {
				this.sStyleDivArbol="display:table-row;width:15%;height:600px;visibility:visible;overflow:auto;";	
				this.sStyleDivContent="height:600px;width:80%";
				this.sStyleDivOpcionesBanner="display:table-row";
				this.sStyleDivExpandirColapsar="display:table-row";
				this.isPaginaPopup=false;
			}
		}
	}
	
	public Boolean getisPermiteNavegacionHaciaForeignKeyDesdeAuditoria() {
		return this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoria;
	}

	public void setisPermiteNavegacionHaciaForeignKeyDesdeAuditoria(
			Boolean isPermiteNavegacionHaciaForeignKeyDesdeAuditoria) {
		this.isPermiteNavegacionHaciaForeignKeyDesdeAuditoria= isPermiteNavegacionHaciaForeignKeyDesdeAuditoria;
	}
	
	public Boolean getisPermiteRecargarInformacion() {
		return this.isPermiteRecargarInformacion;
	}

	public void setisPermiteRecargarInformacion(
			Boolean isPermiteRecargarInformacion) {
		this.isPermiteRecargarInformacion=isPermiteRecargarInformacion;
	}
	
	public String getsNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria() {
		return this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria;
	}

	public void setsNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria(String sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria) {
		this.sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria = sNombrePaginaNavegacionHaciaForeignKeyDesdeAuditoria;
	}
	
	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAuditoria() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAuditoria;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAuditoria(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoria) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoria= isBusquedaDesdeForeignKeySesionForeignKeyAuditoria;
	}
					
	public Long getlIdAuditoriaActualForeignKey() {
		return lIdAuditoriaActualForeignKey;
	}

	public void setlIdAuditoriaActualForeignKey(
			Long lIdAuditoriaActualForeignKey) {
		this.lIdAuditoriaActualForeignKey = lIdAuditoriaActualForeignKey;
	}
				    
	public Long getlIdAuditoriaActualForeignKeyParaPosibleAtras() {
		return lIdAuditoriaActualForeignKeyParaPosibleAtras;
	}

	public void setlIdAuditoriaActualForeignKeyParaPosibleAtras(
			Long lIdAuditoriaActualForeignKeyParaPosibleAtras) {
		this.lIdAuditoriaActualForeignKeyParaPosibleAtras = lIdAuditoriaActualForeignKeyParaPosibleAtras;
	}

	public Boolean getisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras() {
		return isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras;
	}

	public void setisBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras(
			Boolean isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras) {
		this.isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras = isBusquedaDesdeForeignKeySesionForeignKeyAuditoriaParaPosibleAtras;
	}
	
	public String getsUltimaBusquedaAuditoria() {
		return sUltimaBusquedaAuditoria;
	}

	public void setsUltimaBusquedaAuditoria(String sUltimaBusquedaAuditoria) {
		this.sUltimaBusquedaAuditoria = sUltimaBusquedaAuditoria;
	}
	
	public String getsServletGenerarHtmlReporte() {
		return sServletGenerarHtmlReporte;
	}

	public void setsServletGenerarHtmlReporte(String sServletGenerarHtmlReporte) {
		this.sServletGenerarHtmlReporte = sServletGenerarHtmlReporte;
	}
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	public String getsPathNavegacionActual() {
		return this.sPathNavegacionActual;
	}

	public void setsPathNavegacionActual(String sPathNavegacionActual) {
		this.sPathNavegacionActual = sPathNavegacionActual;
	}
	
	public Boolean getisPaginaPopup() {
		return this.isPaginaPopup;
	}

	public void setisPaginaPopup(Boolean isPaginaPopup) {
		this.isPaginaPopup = isPaginaPopup;
	}	
	
	public String getsStyleDivArbol() {
		return this.sStyleDivArbol;
	}

	public void setsStyleDivArbol(String sStyleDivArbol) {
		this.sStyleDivArbol = sStyleDivArbol;
	}
	
	public String getsStyleDivContent() {
		return this.sStyleDivContent;
	}

	public void setsStyleDivContent(String sStyleDivContent) {
		this.sStyleDivContent = sStyleDivContent;
	}
	
	public String getsStyleDivOpcionesBanner() {
		return this.sStyleDivOpcionesBanner;
	}

	public void setsStyleDivOpcionesBanner(String sStyleDivOpcionesBanner) {
		this.sStyleDivOpcionesBanner = sStyleDivOpcionesBanner;
	}	
	
	public String getsStyleDivExpandirColapsar() {
		return this.sStyleDivExpandirColapsar;
	}

	public void setsStyleDivExpandirColapsar(String sStyleDivExpandirColapsar) {
		this.sStyleDivExpandirColapsar = sStyleDivExpandirColapsar;
	}		
	
	public String getsFuncionBusquedaRapida() {
		return this.sFuncionBusquedaRapida;
	}

	public void setsFuncionBusquedaRapida(String sFuncionBusquedaRapida) {
		this.sFuncionBusquedaRapida = sFuncionBusquedaRapida;
	}
	
	public Boolean getConGuardarRelaciones() {
		return this.conGuardarRelaciones;
	}

	public void setConGuardarRelaciones(Boolean conGuardarRelaciones) {
		this.conGuardarRelaciones = conGuardarRelaciones;
	}	
	
	public Boolean getEstaModoGuardarRelaciones() {
		return this.estaModoGuardarRelaciones;
	}

	public void setEstaModoGuardarRelaciones(Boolean estaModoGuardarRelaciones) {
		this.estaModoGuardarRelaciones = estaModoGuardarRelaciones;
	}	
	
	public Boolean getEsGuardarRelacionado() {
		return this.esGuardarRelacionado;
	}

	public void setEsGuardarRelacionado(Boolean esGuardarRelacionado) {
		this.esGuardarRelacionado = esGuardarRelacionado;
	}	
	
	public Boolean getEstaModoBusqueda() {
		return this.estaModoBusqueda;
	}

	public void setEstaModoBusqueda(Boolean estaModoBusqueda) {
		this.estaModoBusqueda = estaModoBusqueda;
	}
	
	public Boolean getNoMantenimiento() {
		return this.noMantenimiento;
	}

	public void setNoMantenimiento(Boolean noMantenimiento) {
		this.noMantenimiento = noMantenimiento;
	}
	
    
	public Long getid() {
		return this.id;
	}
    
	public Long getid_usuario() {
		return this.id_usuario;
	}
    
	public String getnombre_tabla() {
		return this.nombre_tabla;
	}
    
	public Long getid_fila() {
		return this.id_fila;
	}
    
	public String getproceso() {
		return this.proceso;
	}
    
	public String getnombre_p_c() {
		return this.nombre_p_c;
	}
    
	public String getip_pc() {
		return this.ip_pc;
	}
    
	public String getusuario_p_c() {
		return this.usuario_p_c;
	}
    
	public Timestamp getfecha_hora() {
		return this.fecha_hora;
	}
		
	public Timestamp getfecha_horaFinal() {
		return this.fecha_horaFinal;
	}
    
	public String getobservacion() {
		return this.observacion;
	}
	
    
	public void setid(Long newid)throws Exception
	{
		try {
			if(this.id!=newid) {
				if(newid==null) {
					//newid=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id");
					}
				}

				this.id=newid;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_usuario(Long newid_usuario)throws Exception
	{
		try {
			if(this.id_usuario!=newid_usuario) {
				if(newid_usuario==null) {
					//newid_usuario=-1L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id_usuario");
					}
				}

				this.id_usuario=newid_usuario;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_tabla(String newnombre_tabla)throws Exception
	{
		try {
			if(this.nombre_tabla!=newnombre_tabla) {
				if(newnombre_tabla==null) {
					//newnombre_tabla="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_tabla");
					}
				}

				if(newnombre_tabla!=null&&newnombre_tabla.length()>150) {
					newnombre_tabla=newnombre_tabla.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna nombre_tabla");
				}

				this.nombre_tabla=newnombre_tabla;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setid_fila(Long newid_fila)throws Exception
	{
		try {
			if(this.id_fila!=newid_fila) {
				if(newid_fila==null) {
					//newid_fila=0L;
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna id_fila");
					}
				}

				this.id_fila=newid_fila;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setproceso(String newproceso)throws Exception
	{
		try {
			if(this.proceso!=newproceso) {
				if(newproceso==null) {
					//newproceso="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna proceso");
					}
				}

				if(newproceso!=null&&newproceso.length()>150) {
					newproceso=newproceso.substring(0,148);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=150 en columna proceso");
				}

				this.proceso=newproceso;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setnombre_p_c(String newnombre_p_c)throws Exception
	{
		try {
			if(this.nombre_p_c!=newnombre_p_c) {
				if(newnombre_p_c==null) {
					//newnombre_p_c="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna nombre_p_c");
					}
				}

				if(newnombre_p_c!=null&&newnombre_p_c.length()>50) {
					newnombre_p_c=newnombre_p_c.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna nombre_p_c");
				}

				this.nombre_p_c=newnombre_p_c;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setip_pc(String newip_pc)throws Exception
	{
		try {
			if(this.ip_pc!=newip_pc) {
				if(newip_pc==null) {
					//newip_pc="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna ip_pc");
					}
				}

				if(newip_pc!=null&&newip_pc.length()>20) {
					newip_pc=newip_pc.substring(0,18);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=20 en columna ip_pc");
				}

				this.ip_pc=newip_pc;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setusuario_p_c(String newusuario_p_c)throws Exception
	{
		try {
			if(this.usuario_p_c!=newusuario_p_c) {
				if(newusuario_p_c==null) {
					//newusuario_p_c="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna usuario_p_c");
					}
				}

				if(newusuario_p_c!=null&&newusuario_p_c.length()>50) {
					newusuario_p_c=newusuario_p_c.substring(0,48);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna usuario_p_c");
				}

				this.usuario_p_c=newusuario_p_c;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setfecha_hora(Timestamp newfecha_hora)throws Exception
	{
		try {
			if(this.fecha_hora!=newfecha_hora) {
				if(newfecha_hora==null) {
					//newfecha_hora=new Timestamp((new Date()).getTime());
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna fecha_hora");
					}
				}

				this.fecha_hora=newfecha_hora;
			}
		} catch(Exception e) {
			throw e;
		}
	}
		
	public void setfecha_horaFinal(Timestamp newfecha_horaFinal)throws Exception
	{
		try {
			if(this.fecha_horaFinal!=newfecha_horaFinal) {
				if(newfecha_horaFinal==null) {
					//newfecha_horaFinal=new Timestamp((new Date()).getTime());
					if(Constantes.ISDEVELOPING) {
						System.out.println("AuditoriaFinal:Valor nulo no permitido en columna fecha_horaFinal");
					}
				}

				this.fecha_horaFinal=newfecha_horaFinal;
			}
		} catch(Exception e) {
			throw e;
		}
	}
    
	public void setobservacion(String newobservacion)throws Exception
	{
		try {
			if(this.observacion!=newobservacion) {
				if(newobservacion==null) {
					//newobservacion="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("Auditoria:Valor nulo no permitido en columna observacion");
					}
				}

				if(newobservacion!=null&&newobservacion.length()>200) {
					newobservacion=newobservacion.substring(0,198);
					System.out.println("Auditoria:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=200 en columna observacion");
				}

				this.observacion=newobservacion;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public Boolean getisBusquedaDesdeForeignKeySesionUsuario() {
		return isBusquedaDesdeForeignKeySesionUsuario;
	}

	public void setisBusquedaDesdeForeignKeySesionUsuario(
		Boolean isBusquedaDesdeForeignKeySesionUsuario) {
		this.isBusquedaDesdeForeignKeySesionUsuario = isBusquedaDesdeForeignKeySesionUsuario;
	}

	public Long getlidUsuarioActual() {
		return lidUsuarioActual;
	}

	public void setlidUsuarioActual(Long lidUsuarioActual) {
		this.lidUsuarioActual = lidUsuarioActual;
	}
	
	
		
	
}
