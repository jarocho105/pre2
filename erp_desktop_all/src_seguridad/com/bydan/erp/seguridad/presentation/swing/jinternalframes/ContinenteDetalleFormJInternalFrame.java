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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ContinenteConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ContinenteDetalleFormJInternalFrame extends ContinenteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleContinente;
	
	protected JMenuBar jmenuBarDetalleContinente;
	
	protected JMenu jmenuDetalleContinente;
	protected JMenu jmenuDetalleArchivoContinente;
	protected JMenu jmenuDetalleAccionesContinente;
	protected JMenu jmenuDetalleDatosContinente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContinente;	
	protected GridBagConstraints gridBagConstraintsContinente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ContinenteBeanSwingJInternalFrameAdditional jInternalFrameDetalleContinente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ContinenteSessionBean continenteSessionBean;
	
	

	public PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame=null;
	public PaisBeanSwingJInternalFrame paisBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePais=false;
	public PaisSessionBean paisSessionBean;
	
		
	
	public ContinenteLogic continenteLogic;
	
	public JScrollPane jScrollPanelDatosContinente;
	public JScrollPane jScrollPanelDatosEdicionContinente;
	public JScrollPane jScrollPanelDatosGeneralContinente;
	
	protected JPanel jPanelCamposContinente;    
	protected JPanel jPanelCamposOcultosContinente;    	
	protected JPanel jPanelAccionesContinente;
	protected JPanel jPanelAccionesFormularioContinente;
    
	
	
	protected Integer iXPanelCamposContinente=0;
	protected Integer iYPanelCamposContinente=0;
	
	protected Integer iXPanelCamposOcultosContinente=0;
	protected Integer iYPanelCamposOcultosContinente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoContinente;
	public JButton jButtonModificarContinente;
	public JButton jButtonActualizarContinente;
    public JButton jButtonEliminarContinente;
	public JButton jButtonCancelarContinente;
    public JButton jButtonGuardarCambiosContinente;
	public JButton jButtonGuardarCambiosTablaContinente;
	protected JButton jButtonCerrarContinente;
	
	
	protected JButton jButtonProcesarInformacionContinente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoContinente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarContinente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeContinente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContinente;
	protected JButton jButtonModificarToolBarContinente;
	protected JButton jButtonActualizarToolBarContinente;
    protected JButton jButtonEliminarToolBarContinente;
	protected JButton jButtonCancelarToolBarContinente;
    protected JButton jButtonGuardarCambiosToolBarContinente;
	protected JButton jButtonGuardarCambiosTablaToolBarContinente;
	protected JButton jButtonMostrarOcultarTablaToolBarContinente;
	protected JButton jButtonCerrarToolBarContinente;
	
	protected JButton jButtonProcesarInformacionToolBarContinente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContinente;
	protected JMenuItem jMenuItemModificarContinente;
	protected JMenuItem jMenuItemActualizarContinente;
    protected JMenuItem jMenuItemEliminarContinente;
	protected JMenuItem jMenuItemCancelarContinente;
    protected JMenuItem jMenuItemGuardarCambiosContinente;
	protected JMenuItem jMenuItemGuardarCambiosTablaContinente;
	protected JMenuItem jMenuItemCerrarContinente;
	protected JMenuItem jMenuItemDetalleCerrarContinente;
	protected JMenuItem jMenuItemDetalleMostarOcultarContinente;
	
	protected JMenuItem jMenuItemProcesarInformacionContinente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContinente;
	protected JMenuItem jMenuItemMostrarOcultarContinente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContinente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContinente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContinente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioContinente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidContinente;
	public JLabel jLabelIdContinente;
	public JTextFieldMe jTextFieldidContinente;
	public JButton jButtonidContinenteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoContinente;
	public JLabel jLabelcodigoContinente;
	public JTextField jTextFieldcodigoContinente;
	public JButton jButtoncodigoContinenteBusqueda= new JButtonMe();

	public JPanel jPanelnombreContinente;
	public JLabel jLabelnombreContinente;
	public JTextField jTextFieldnombreContinente;
	public JButton jButtonnombreContinenteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesContinente;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ContinenteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposContinente=new JPanel();
				this.jPanelAccionesFormularioContinente=new JPanel();
				this.jmenuBarDetalleContinente=new JMenuBar();
				this.jTtoolBarDetalleContinente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ContinenteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContinenteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Continente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarContinente() {
		return this.jButtonActualizarToolBarContinente;
	}
	
	public JButton getjButtonEliminarToolBarContinente() {
		return this.jButtonEliminarToolBarContinente;
	}
	
	public JButton getjButtonCancelarToolBarContinente() {
		return this.jButtonCancelarToolBarContinente;
	}		
	
	public JButton getjButtonProcesarInformacionContinente() {
		return this.jButtonProcesarInformacionContinente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContinente)	{
		this.jButtonProcesarInformacionContinente = jButtonProcesarInformacionContinente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContinente() {
		return this.jComboBoxTiposAccionesContinente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContinente(
			JComboBox jComboBoxTiposRelacionesContinente) {
		this.jComboBoxTiposRelacionesContinente = jComboBoxTiposRelacionesContinente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContinente(
			JComboBox jComboBoxTiposAccionesContinente) {
		this.jComboBoxTiposAccionesContinente = jComboBoxTiposAccionesContinente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioContinente() {
		return this.jComboBoxTiposAccionesFormularioContinente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioContinente(
			JComboBox jComboBoxTiposAccionesFormularioContinente) {
		this.jComboBoxTiposAccionesFormularioContinente = jComboBoxTiposAccionesFormularioContinente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.continenteSessionBean=new ContinenteSessionBean();
		
		this.continenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.continenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.continenteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.paisSessionBean=new PaisSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContinenteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Continente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ContinenteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleContinente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarContinente=new JButtonMe();
				this.jButtonModificarToolBarContinente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarContinente,this.jTtoolBarDetalleContinente,
							"actualizar","actualizar","Actualizar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarContinente,this.jTtoolBarDetalleContinente,
							"eliminar","eliminar","Eliminar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarContinente,this.jTtoolBarDetalleContinente,
							"cancelar","cancelar","Cancelar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarContinente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarContinente,this.jTtoolBarDetalleContinente,
							"guardarcambios","guardarcambios","Guardar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarContinente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarContinente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarContinente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleContinente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleContinente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoContinente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesContinente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosContinente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContinente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContinente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContinente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarContinente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarContinente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarContinente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarContinente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarContinente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarContinente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarContinente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarContinente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarContinente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarContinente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarContinente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarContinente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosContinente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContinente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContinente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContinente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContinente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContinente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarContinente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarContinente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarContinente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContinente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContinente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContinente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContinente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContinente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContinente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContinente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoContinente.add(this.jMenuItemDetalleCerrarContinente);
		
		this.jmenuDetalleAccionesContinente.add(this.jMenuItemActualizarContinente);
		this.jmenuDetalleAccionesContinente.add(this.jMenuItemEliminarContinente);
		this.jmenuDetalleAccionesContinente.add(this.jMenuItemCancelarContinente);		
		
		//this.jmenuDetalleDatosContinente.add(this.jMenuItemDetalleAbrirOrderByContinente);				
		this.jmenuDetalleDatosContinente.add(this.jMenuItemDetalleMostarOcultarContinente);				
				
		//this.jmenuDetalleAccionesContinente.add(this.jMenuItemGuardarCambiosContinente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleContinente.add(this.jmenuDetalleArchivoContinente);		
		this.jmenuBarDetalleContinente.add(this.jmenuDetalleAccionesContinente);		
		this.jmenuBarDetalleContinente.add(this.jmenuDetalleDatosContinente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleContinente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleContinente.add(this.jmenuDetalleContinente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleContinente);				
	}
	
	
	public void inicializarElementosCamposContinente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdContinente = new JLabelMe();
		jLabelIdContinente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdContinente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidContinente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidContinente.setToolTipText(ContinenteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutContinente= new GridBagLayout();

		this.jPanelidContinente.setLayout(this.gridaBagLayoutContinente);

		jTextFieldidContinente = new JTextFieldMe();
		jTextFieldidContinente.setText("Id");

		jTextFieldidContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoContinente = new JLabelMe();
		this.jLabelcodigoContinente.setText(""+ContinenteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoContinente.setToolTipText("Codigo");
		this.jLabelcodigoContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoContinente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoContinente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoContinente.setToolTipText(ContinenteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutContinente = new GridBagLayout();
		this.jPanelcodigoContinente.setLayout(this.gridaBagLayoutContinente);


		jTextFieldcodigoContinente= new JTextFieldMe();

		jTextFieldcodigoContinente.setEnabled(false);
		jTextFieldcodigoContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoContinente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoContinenteBusqueda= new JButtonMe();
		this.jButtoncodigoContinenteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoContinenteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoContinenteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoContinenteBusqueda.setText("U");
		this.jButtoncodigoContinenteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoContinenteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoContinenteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoContinente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoContinente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoContinenteBusqueda"));

		if(this.continenteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoContinenteBusqueda.setVisible(false);		}


					
		this.jLabelnombreContinente = new JLabelMe();
		this.jLabelnombreContinente.setText(""+ContinenteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreContinente.setToolTipText("Nombre");
		this.jLabelnombreContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreContinente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreContinente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreContinente.setToolTipText(ContinenteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutContinente = new GridBagLayout();
		this.jPanelnombreContinente.setLayout(this.gridaBagLayoutContinente);


		jTextFieldnombreContinente= new JTextFieldMe();

		jTextFieldnombreContinente.setEnabled(false);
		jTextFieldnombreContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreContinente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreContinenteBusqueda= new JButtonMe();
		this.jButtonnombreContinenteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreContinenteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreContinenteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreContinenteBusqueda.setText("U");
		this.jButtonnombreContinenteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreContinenteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreContinenteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreContinente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreContinente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreContinenteBusqueda"));

		if(this.continenteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreContinenteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysContinente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleContinente = new ContinenteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Continente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContinente= new GridBagLayout();
		

		
		String sToolTipContinente="";
		sToolTipContinente=ContinenteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContinente+="(Seguridad.Continente)";
		}
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			sToolTipContinente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoContinente = new JButtonMe();
		this.jButtonModificarContinente = new JButtonMe();
        this.jButtonActualizarContinente = new JButtonMe();
        this.jButtonEliminarContinente = new JButtonMe();
        this.jButtonCancelarContinente = new JButtonMe();
        this.jButtonGuardarCambiosContinente = new JButtonMe();
		this.jButtonGuardarCambiosTablaContinente = new JButtonMe();
		this.jButtonCerrarContinente = new JButtonMe();
		
		this.jScrollPanelDatosContinente = new JScrollPane();   
        this.jScrollPanelDatosEdicionContinente = new JScrollPane();
		this.jScrollPanelDatosGeneralContinente = new JScrollPane();
				
		
		
		this.jPanelCamposContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Continente";
		
		if(!this.continenteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Continentes" + this.sPath));
		} else {
			this.jScrollPanelDatosContinente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposContinente.setName("jPanelCamposContinente"); 

		this.jPanelCamposOcultosContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosContinente.setName("jPanelCamposOcultosContinente"); 

        this.jPanelAccionesContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContinente.setToolTipText("Acciones");
        this.jPanelAccionesContinente.setName("Acciones"); 

		this.jPanelAccionesFormularioContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioContinente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioContinente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContinente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposContinente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosContinente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoContinente.setText("Nuevo");
		this.jButtonModificarContinente.setText("Editar");
        this.jButtonActualizarContinente.setText("Actualizar");
        this.jButtonEliminarContinente.setText("Eliminar");
        this.jButtonCancelarContinente.setText("Cancelar");
        this.jButtonGuardarCambiosContinente.setText("Guardar");
		this.jButtonGuardarCambiosTablaContinente.setText("Guardar");
		this.jButtonCerrarContinente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContinente,"nuevo_button","Nuevo",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarContinente,"modificar_button","Editar",this.continenteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarContinente,"actualizar_button","Actualizar",this.continenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarContinente,"eliminar_button","Eliminar",this.continenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarContinente,"cancelar_button","Cancelar",this.continenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosContinente,"guardarcambios_button","Guardar",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContinente,"guardarcambiostabla_button","Guardar",this.continenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContinente,"cerrar_button","Salir",this.continenteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContinente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarContinente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoContinente.setToolTipText("Nuevo"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarContinente.setToolTipText("Editar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarContinente.setToolTipText("Actualizar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarContinente.setToolTipText("Eliminar)"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarContinente.setToolTipText("Cancelar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosContinente.setToolTipText("Guardar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaContinente.setToolTipText("Guardar"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContinente.setToolTipText("Salir"+" "+ContinenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoContinente";
		inputMap = this.jButtonNuevoContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContinente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContinente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarContinente";
		inputMap = this.jButtonActualizarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarContinente"));
		
		//ELIMINAR
		sMapKey = "EliminarContinente";
		inputMap = this.jButtonEliminarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarContinente"));
		
		//CANCELAR	
		sMapKey = "CancelarContinente";
		inputMap = this.jButtonCancelarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarContinente"));
		
		//CERRAR		
		sMapKey = "CerrarContinente";
		inputMap = this.jButtonCerrarContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContinente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContinente";
		inputMap = this.jButtonGuardarCambiosTablaContinente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContinente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContinente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoContinente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoContinente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoContinente.setToolTipText("Nuevo Continente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoContinente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarContinente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarContinente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarContinente.setToolTipText("Sin Cerrar Ventana Continente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarContinente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeContinente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeContinente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeContinente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeContinente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesContinente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContinente.setText("Accion");
		this.jComboBoxTiposAccionesContinente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioContinente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioContinente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioContinente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesContinente = new JLabelMe();
		
		this.jLabelAccionesContinente.setText("Acciones");		
		this.jLabelAccionesContinente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContinente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContinente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposContinente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysContinente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesContinente=new JTabbedPane();
		this.jTabbedPaneRelacionesContinente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesContinente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesContinente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContinente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContinente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContinente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioContinente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContinente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContinente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioContinente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposContinente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosContinente = new GridBagLayout();
		
		this.jPanelCamposContinente.setLayout(gridaBagLayoutCamposContinente);
		this.jPanelCamposOcultosContinente.setLayout(gridaBagLayoutCamposOcultosContinente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 0;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidContinente.add(jLabelIdContinente, this.gridBagConstraintsContinente);



	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 1;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidContinente.add(jTextFieldidContinente, this.gridBagConstraintsContinente);


	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 0;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoContinente.add(jLabelcodigoContinente, this.gridBagConstraintsContinente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContinente = new GridBagConstraints();
		//this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = 0;
		this.gridBagConstraintsContinente.gridx = 2;
		this.gridBagConstraintsContinente.ipadx = 0;
		this.gridBagConstraintsContinente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoContinente.add(jButtoncodigoContinenteBusqueda, this.gridBagConstraintsContinente);
	}

	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 1;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoContinente.add(jTextFieldcodigoContinente, this.gridBagConstraintsContinente);


	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 0;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreContinente.add(jLabelnombreContinente, this.gridBagConstraintsContinente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContinente = new GridBagConstraints();
		//this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContinente.gridy = 0;
		this.gridBagConstraintsContinente.gridx = 2;
		this.gridBagConstraintsContinente.ipadx = 0;
		this.gridBagConstraintsContinente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreContinente.add(jButtonnombreContinenteBusqueda, this.gridBagConstraintsContinente);
	}

	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContinente.gridy = 0;
	this.gridBagConstraintsContinente.gridx = 1;
	this.gridBagConstraintsContinente.ipadx = 0;
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreContinente.add(jTextFieldnombreContinente, this.gridBagConstraintsContinente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContinente.gridy = iYPanelCamposContinente;
	this.gridBagConstraintsContinente.gridx = iXPanelCamposContinente++;
	this.gridBagConstraintsContinente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContinente.add(this.jPanelidContinente, this.gridBagConstraintsContinente);



	if(iXPanelCamposContinente % 1==0) {
		iXPanelCamposContinente=0;
		iYPanelCamposContinente++;
	}
	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContinente.gridy = iYPanelCamposContinente;
	this.gridBagConstraintsContinente.gridx = iXPanelCamposContinente++;
	this.gridBagConstraintsContinente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContinente.add(this.jPanelcodigoContinente, this.gridBagConstraintsContinente);



	if(iXPanelCamposContinente % 1==0) {
		iXPanelCamposContinente=0;
		iYPanelCamposContinente++;
	}
	this.gridBagConstraintsContinente = new GridBagConstraints();
	this.gridBagConstraintsContinente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContinente.gridy = iYPanelCamposContinente;
	this.gridBagConstraintsContinente.gridx = iXPanelCamposContinente++;
	this.gridBagConstraintsContinente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContinente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContinente.add(this.jPanelnombreContinente, this.gridBagConstraintsContinente);



	if(iXPanelCamposContinente % 1==0) {
		iXPanelCamposContinente=0;
		iYPanelCamposContinente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesContinente= new GridBagLayout();
		this.jPanelAccionesContinente.setLayout(gridaBagLayoutAccionesContinente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioContinente= new GridBagLayout();
		this.jPanelAccionesFormularioContinente.setLayout(gridaBagLayoutAccionesFormularioContinente);
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContinente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContinente.add(this.jComboBoxTiposAccionesFormularioContinente, this.gridBagConstraintsContinente);

		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContinente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContinente.add(this.jCheckBoxPostAccionNuevoContinente, this.gridBagConstraintsContinente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.continenteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContinente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContinente.add(this.jCheckBoxPostAccionSinCerrarContinente, this.gridBagConstraintsContinente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.continenteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.continenteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContinente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContinente.add(this.jCheckBoxPostAccionSinMensajeContinente, this.gridBagConstraintsContinente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = 0;
		this.gridBagConstraintsContinente.gridx = iPosXAccion++;
			
		this.jPanelAccionesContinente.add(this.jButtonModificarContinente, this.gridBagConstraintsContinente);							

		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContinente.gridy = 0;
		this.gridBagConstraintsContinente.gridx =iPosXAccion++;
			
		this.jPanelAccionesContinente.add(this.jButtonEliminarContinente, this.gridBagConstraintsContinente);
		
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = 0;		
		this.gridBagConstraintsContinente.gridx = iPosXAccion++;
		
		this.jPanelAccionesContinente.add(this.jButtonActualizarContinente, this.gridBagConstraintsContinente);


		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = 0;		
		this.gridBagConstraintsContinente.gridx = iPosXAccion++;
		
		this.jPanelAccionesContinente.add(this.jButtonGuardarCambiosContinente, this.gridBagConstraintsContinente);	
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = 0;		
		this.gridBagConstraintsContinente.gridx =iPosXAccion++;
		
		this.jPanelAccionesContinente.add(this.jButtonCancelarContinente, this.gridBagConstraintsContinente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContinente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContinente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.continenteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContinente = new GridBagConstraints();						
			this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContinente.gridx = 0;		
			//this.gridBagConstraintsContinente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContinente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContinente.gridx =0;
		this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContinente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContinente, this.gridBagConstraintsContinente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ContinenteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleContinente = new ContinenteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Continente DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Continente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Continente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ContinenteModel continenteModel=new ContinenteModel(this);
			
			//SI USARA CLASE INTERNA
			//ContinenteModel.ContinenteFocusTraversalPolicy continenteFocusTraversalPolicy = continenteModel.new ContinenteFocusTraversalPolicy(this);
			
			//continenteFocusTraversalPolicy.setcontinenteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(continenteModel);
			
			
			this.jContentPaneDetalleContinente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleContinente = new GridBagLayout();	
			this.jContentPaneDetalleContinente.setLayout(gridaBagLayoutDetalleContinente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContinente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsContinente = new GridBagConstraints();
				this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsContinente.gridx = 0;
					
				
				this.jContentPaneDetalleContinente.add(jTtoolBarDetalleContinente, gridBagConstraintsContinente);								
				
}
			
			this.jScrollPanelDatosEdicionContinente=   new JScrollPane(jContentPaneDetalleContinente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContinente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContinente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContinente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralContinente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContinente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContinente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContinente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsContinente.gridx = 0;
	        
			this.jContentPaneDetalleContinente.add(jPanelCamposContinente, gridBagConstraintsContinente);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& continenteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePais(this.puedeCargarPorPartePais,false,-1);
					
					if(this.continenteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsContinente= new GridBagConstraints();
						this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsContinente.gridx = 0;
						this.jContentPaneDetalleContinente.add(this.jTabbedPaneRelacionesContinente, this.gridBagConstraintsContinente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesContinente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePais(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosContinente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsContinente = new GridBagConstraints();
					this.gridBagConstraintsContinente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsContinente.gridx = 0;
					
				
					this.jContentPaneDetalleContinente.add(jPanelCamposOcultosContinente, gridBagConstraintsContinente);
				
					this.jPanelCamposOcultosContinente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsContinente.gridx = 0;
	        this.gridBagConstraintsContinente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleContinente.add(this.jPanelAccionesFormularioContinente, this.gridBagConstraintsContinente);							
			
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
	        this.gridBagConstraintsContinente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsContinente.gridx = 0;
	        
			
			this.jContentPaneDetalleContinente.add(this.jPanelAccionesContinente, this.gridBagConstraintsContinente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionContinente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionContinente=   new JScrollPane(this.jPanelCamposContinente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContinente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContinente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContinente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsContinente.gridx = 0;
			this.gridBagConstraintsContinente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsContinente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsContinente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionContinente, this.gridBagConstraintsContinente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContinente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioContinente, this.gridBagConstraintsContinente);			
			
			this.gridBagConstraintsContinente = new GridBagConstraints();
			this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContinente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesContinente, this.gridBagConstraintsContinente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContinente, this.gridBagConstraintsContinente);
			
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContinente, this.gridBagConstraintsContinente);
		
			
		this.gridBagConstraintsContinente = new GridBagConstraints();
		this.gridBagConstraintsContinente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContinente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContinente, this.gridBagConstraintsContinente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralContinente;//jContentPane;
		
		return jScrollPanelDatosEdicionContinente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePais(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.paisSessionBean=new PaisSessionBean();
		this.paisSessionBean.setConGuardarRelaciones(false);
		this.paisSessionBean.setEsGuardarRelacionado(true);

		this.paisBeanSwingJInternalFrame=null;//new PaisBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.paisBeanSwingJInternalFramePopup=new PaisBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.paisBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.paisSessionBean.getEsGuardarRelacionado()) {

				PaisJInternalFrame.STIPO_TAMANIO_GENERAL=ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PaisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ContinenteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.paisSessionBean.setEsGuardarRelacionado(true);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.paisBeanSwingJInternalFrame.setpaisSessionBean(this.paisSessionBean);

				//this.gridBagConstraintsContinente = new GridBagConstraints();
				//this.gridBagConstraintsContinente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsContinente.gridx = 0;
				//this.jContentPaneDetalleContinente.add(this.paisBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsContinente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesContinente.add("Paises",this.paisBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesContinente.setComponentAt(iIndexTab,this.paisBeanSwingJInternalFrame.getContentPane());
				}

				//PaisJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.paisSessionBean.setEsGuardarRelacionado(false);
				this.paisBeanSwingJInternalFrame=null;//new PaisBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.paisSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePais) {
					this.jTabbedPaneRelacionesContinente.add("Paises",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPaisBeanSwingJInternalFrame(List<Continente> continentes,Continente continente,PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.continenteLogic.getConnexion());

					paisBeanSwingJInternalFrame.setcontinentesForeignKey(continentes);
					paisBeanSwingJInternalFrame.setcontinenteForeignKey(continente);
					paisBeanSwingJInternalFrame.paisSessionBean.setisBusquedaDesdeForeignKeySesionContinente(true);
					paisBeanSwingJInternalFrame.paisSessionBean.setlidContinenteActual(continente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					paisBeanSwingJInternalFrame.cargarCombosForeignKeyPais(paisBeanSwingJInternalFrame.isCargarCombosDependencia);
					paisBeanSwingJInternalFrame.setVisibilidadBusquedasParaContinente(true);
					paisBeanSwingJInternalFrame.setid_continenteFK_IdContinente(continente.getId());

					if(!this.conCargarFormDetalle) {
						paisBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					paisBeanSwingJInternalFrame.setSelectedItemCombosFrameContinenteForeignKey(continente,1,false,true,true);
					paisBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					paisBeanSwingJInternalFrame.procesarBusqueda("FK_IdContinente");
					paisBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdContinente");
					paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais(true);
					paisBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPais("n",paisBeanSwingJInternalFrame.isGuardarCambiosEnLote, paisBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					paisBeanSwingJInternalFrame.setAutoscrolls(true);
					paisBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						paisBeanSwingJInternalFrame.actualizarEstadoPanelsPais("relacionado");
					} else {
						paisBeanSwingJInternalFrame.actualizarEstadoPanelsPais("no_relacionado");
					}

					paisBeanSwingJInternalFrame.getjButtonRecargarInformacionPais().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
