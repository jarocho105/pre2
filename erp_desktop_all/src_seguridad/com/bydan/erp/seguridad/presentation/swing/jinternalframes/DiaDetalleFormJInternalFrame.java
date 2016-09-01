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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.DiaConstantesFunciones;

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
public class DiaDetalleFormJInternalFrame extends DiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDia;
	
	protected JMenuBar jmenuBarDetalleDia;
	
	protected JMenu jmenuDetalleDia;
	protected JMenu jmenuDetalleArchivoDia;
	protected JMenu jmenuDetalleAccionesDia;
	protected JMenu jmenuDetalleDatosDia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDia;	
	protected GridBagConstraints gridBagConstraintsDia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DiaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public DiaSessionBean diaSessionBean;
	
	
	
		
	
	public DiaLogic diaLogic;
	
	public JScrollPane jScrollPanelDatosDia;
	public JScrollPane jScrollPanelDatosEdicionDia;
	public JScrollPane jScrollPanelDatosGeneralDia;
	
	protected JPanel jPanelCamposDia;    
	protected JPanel jPanelCamposOcultosDia;    	
	protected JPanel jPanelAccionesDia;
	protected JPanel jPanelAccionesFormularioDia;
    
	
	
	protected Integer iXPanelCamposDia=0;
	protected Integer iYPanelCamposDia=0;
	
	protected Integer iXPanelCamposOcultosDia=0;
	protected Integer iYPanelCamposOcultosDia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDia;
	public JButton jButtonModificarDia;
	public JButton jButtonActualizarDia;
    public JButton jButtonEliminarDia;
	public JButton jButtonCancelarDia;
    public JButton jButtonGuardarCambiosDia;
	public JButton jButtonGuardarCambiosTablaDia;
	protected JButton jButtonCerrarDia;
	
	
	protected JButton jButtonProcesarInformacionDia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDia;
	protected JButton jButtonModificarToolBarDia;
	protected JButton jButtonActualizarToolBarDia;
    protected JButton jButtonEliminarToolBarDia;
	protected JButton jButtonCancelarToolBarDia;
    protected JButton jButtonGuardarCambiosToolBarDia;
	protected JButton jButtonGuardarCambiosTablaToolBarDia;
	protected JButton jButtonMostrarOcultarTablaToolBarDia;
	protected JButton jButtonCerrarToolBarDia;
	
	protected JButton jButtonProcesarInformacionToolBarDia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDia;
	protected JMenuItem jMenuItemModificarDia;
	protected JMenuItem jMenuItemActualizarDia;
    protected JMenuItem jMenuItemEliminarDia;
	protected JMenuItem jMenuItemCancelarDia;
    protected JMenuItem jMenuItemGuardarCambiosDia;
	protected JMenuItem jMenuItemGuardarCambiosTablaDia;
	protected JMenuItem jMenuItemCerrarDia;
	protected JMenuItem jMenuItemDetalleCerrarDia;
	protected JMenuItem jMenuItemDetalleMostarOcultarDia;
	
	protected JMenuItem jMenuItemProcesarInformacionDia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDia;
	protected JMenuItem jMenuItemMostrarOcultarDia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDia;
	public JLabel jLabelIdDia;
	public JTextFieldMe jTextFieldidDia;
	public JButton jButtonidDiaBusqueda= new JButtonMe();

	public JPanel jPanelnombreDia;
	public JLabel jLabelnombreDia;
	public JTextField jTextFieldnombreDia;
	public JButton jButtonnombreDiaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDia;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DiaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDia=new JPanel();
				this.jPanelAccionesFormularioDia=new JPanel();
				this.jmenuBarDetalleDia=new JMenuBar();
				this.jTtoolBarDetalleDia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DiaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Dia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDia() {
		return this.jButtonActualizarToolBarDia;
	}
	
	public JButton getjButtonEliminarToolBarDia() {
		return this.jButtonEliminarToolBarDia;
	}
	
	public JButton getjButtonCancelarToolBarDia() {
		return this.jButtonCancelarToolBarDia;
	}		
	
	public JButton getjButtonProcesarInformacionDia() {
		return this.jButtonProcesarInformacionDia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDia)	{
		this.jButtonProcesarInformacionDia = jButtonProcesarInformacionDia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDia() {
		return this.jComboBoxTiposAccionesDia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDia(
			JComboBox jComboBoxTiposRelacionesDia) {
		this.jComboBoxTiposRelacionesDia = jComboBoxTiposRelacionesDia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDia(
			JComboBox jComboBoxTiposAccionesDia) {
		this.jComboBoxTiposAccionesDia = jComboBoxTiposAccionesDia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDia() {
		return this.jComboBoxTiposAccionesFormularioDia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDia(
			JComboBox jComboBoxTiposAccionesFormularioDia) {
		this.jComboBoxTiposAccionesFormularioDia = jComboBoxTiposAccionesFormularioDia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.diaSessionBean=new DiaSessionBean();
		
		this.diaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
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
	
		DiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDia=new JButtonMe();
				this.jButtonModificarToolBarDia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDia,this.jTtoolBarDetalleDia,
							"actualizar","actualizar","Actualizar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDia,this.jTtoolBarDetalleDia,
							"eliminar","eliminar","Eliminar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDia,this.jTtoolBarDetalleDia,
							"cancelar","cancelar","Cancelar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDia,this.jTtoolBarDetalleDia,
							"guardarcambios","guardarcambios","Guardar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDia.add(this.jMenuItemDetalleCerrarDia);
		
		this.jmenuDetalleAccionesDia.add(this.jMenuItemActualizarDia);
		this.jmenuDetalleAccionesDia.add(this.jMenuItemEliminarDia);
		this.jmenuDetalleAccionesDia.add(this.jMenuItemCancelarDia);		
		
		//this.jmenuDetalleDatosDia.add(this.jMenuItemDetalleAbrirOrderByDia);				
		this.jmenuDetalleDatosDia.add(this.jMenuItemDetalleMostarOcultarDia);				
				
		//this.jmenuDetalleAccionesDia.add(this.jMenuItemGuardarCambiosDia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDia.add(this.jmenuDetalleArchivoDia);		
		this.jmenuBarDetalleDia.add(this.jmenuDetalleAccionesDia);		
		this.jmenuBarDetalleDia.add(this.jmenuDetalleDatosDia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDia);				
	}
	
	
	public void inicializarElementosCamposDia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDia = new JLabelMe();
		jLabelIdDia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDia.setToolTipText(DiaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDia= new GridBagLayout();

		this.jPanelidDia.setLayout(this.gridaBagLayoutDia);

		jTextFieldidDia = new JTextFieldMe();
		jTextFieldidDia.setText("Id");

		jTextFieldidDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDia = new JLabelMe();
		this.jLabelnombreDia.setText(""+DiaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDia.setToolTipText("Nombre");
		this.jLabelnombreDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDia.setToolTipText(DiaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDia = new GridBagLayout();
		this.jPanelnombreDia.setLayout(this.gridaBagLayoutDia);


		jTextFieldnombreDia= new JTextFieldMe();

		jTextFieldnombreDia.setEnabled(false);
		jTextFieldnombreDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreDia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreDiaBusqueda= new JButtonMe();
		this.jButtonnombreDiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDiaBusqueda.setText("U");
		this.jButtonnombreDiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreDia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreDia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDiaBusqueda"));

		if(this.diaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDiaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDia() {
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
		//this.jInternalFrameDetalleDia = new DiaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDia= new GridBagLayout();
		

		
		String sToolTipDia="";
		sToolTipDia=DiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDia+="(Seguridad.Dia)";
		}
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDia = new JButtonMe();
		this.jButtonModificarDia = new JButtonMe();
        this.jButtonActualizarDia = new JButtonMe();
        this.jButtonEliminarDia = new JButtonMe();
        this.jButtonCancelarDia = new JButtonMe();
        this.jButtonGuardarCambiosDia = new JButtonMe();
		this.jButtonGuardarCambiosTablaDia = new JButtonMe();
		this.jButtonCerrarDia = new JButtonMe();
		
		this.jScrollPanelDatosDia = new JScrollPane();   
        this.jScrollPanelDatosEdicionDia = new JScrollPane();
		this.jScrollPanelDatosGeneralDia = new JScrollPane();
				
		
		
		this.jPanelCamposDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dia";
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias" + this.sPath));
		} else {
			this.jScrollPanelDatosDia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDia.setName("jPanelCamposDia"); 

		this.jPanelCamposOcultosDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDia.setName("jPanelCamposOcultosDia"); 

        this.jPanelAccionesDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDia.setToolTipText("Acciones");
        this.jPanelAccionesDia.setName("Acciones"); 

		this.jPanelAccionesFormularioDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDia.setText("Nuevo");
		this.jButtonModificarDia.setText("Editar");
        this.jButtonActualizarDia.setText("Actualizar");
        this.jButtonEliminarDia.setText("Eliminar");
        this.jButtonCancelarDia.setText("Cancelar");
        this.jButtonGuardarCambiosDia.setText("Guardar");
		this.jButtonGuardarCambiosTablaDia.setText("Guardar");
		this.jButtonCerrarDia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDia,"nuevo_button","Nuevo",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDia,"modificar_button","Editar",this.diaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDia,"actualizar_button","Actualizar",this.diaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDia,"eliminar_button","Eliminar",this.diaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDia,"cancelar_button","Cancelar",this.diaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDia,"guardarcambios_button","Guardar",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDia,"guardarcambiostabla_button","Guardar",this.diaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDia,"cerrar_button","Salir",this.diaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDia.setToolTipText("Nuevo"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDia.setToolTipText("Editar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDia.setToolTipText("Actualizar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDia.setToolTipText("Eliminar)"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDia.setToolTipText("Cancelar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDia.setToolTipText("Guardar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDia.setToolTipText("Guardar"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDia.setToolTipText("Salir"+" "+DiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDia";
		inputMap = this.jButtonNuevoDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDia";
		inputMap = this.jButtonActualizarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDia"));
		
		//ELIMINAR
		sMapKey = "EliminarDia";
		inputMap = this.jButtonEliminarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDia"));
		
		//CANCELAR	
		sMapKey = "CancelarDia";
		inputMap = this.jButtonCancelarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDia"));
		
		//CERRAR		
		sMapKey = "CerrarDia";
		inputMap = this.jButtonCerrarDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDia";
		inputMap = this.jButtonGuardarCambiosTablaDia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDia.setToolTipText("Nuevo Dia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDia.setToolTipText("Sin Cerrar Ventana Dia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDia.setText("Accion");
		this.jComboBoxTiposAccionesDia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDia = new JLabelMe();
		
		this.jLabelAccionesDia.setText("Acciones");		
		this.jLabelAccionesDia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDia=new JTabbedPane();
		this.jTabbedPaneRelacionesDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDia = new GridBagLayout();
		
		this.jPanelCamposDia.setLayout(gridaBagLayoutCamposDia);
		this.jPanelCamposOcultosDia.setLayout(gridaBagLayoutCamposOcultosDia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDia.gridy = 0;
	this.gridBagConstraintsDia.gridx = 0;
	this.gridBagConstraintsDia.ipadx = 0;
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDia.add(jLabelIdDia, this.gridBagConstraintsDia);



	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDia.gridy = 0;
	this.gridBagConstraintsDia.gridx = 1;
	this.gridBagConstraintsDia.ipadx = 0;
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDia.add(jTextFieldidDia, this.gridBagConstraintsDia);


	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDia.gridy = 0;
	this.gridBagConstraintsDia.gridx = 0;
	this.gridBagConstraintsDia.ipadx = 0;
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDia.add(jLabelnombreDia, this.gridBagConstraintsDia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDia = new GridBagConstraints();
		//this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDia.gridy = 0;
		this.gridBagConstraintsDia.gridx = 2;
		this.gridBagConstraintsDia.ipadx = 0;
		this.gridBagConstraintsDia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDia.add(jButtonnombreDiaBusqueda, this.gridBagConstraintsDia);
	}

	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDia.gridy = 0;
	this.gridBagConstraintsDia.gridx = 1;
	this.gridBagConstraintsDia.ipadx = 0;
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDia.add(jTextFieldnombreDia, this.gridBagConstraintsDia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDia.gridy = iYPanelCamposDia;
	this.gridBagConstraintsDia.gridx = iXPanelCamposDia++;
	this.gridBagConstraintsDia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDia.add(this.jPanelidDia, this.gridBagConstraintsDia);



	if(iXPanelCamposDia % 1==0) {
		iXPanelCamposDia=0;
		iYPanelCamposDia++;
	}
	this.gridBagConstraintsDia = new GridBagConstraints();
	this.gridBagConstraintsDia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDia.gridy = iYPanelCamposDia;
	this.gridBagConstraintsDia.gridx = iXPanelCamposDia++;
	this.gridBagConstraintsDia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDia.add(this.jPanelnombreDia, this.gridBagConstraintsDia);



	if(iXPanelCamposDia % 1==0) {
		iXPanelCamposDia=0;
		iYPanelCamposDia++;
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
			
		GridBagLayout gridaBagLayoutAccionesDia= new GridBagLayout();
		this.jPanelAccionesDia.setLayout(gridaBagLayoutAccionesDia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDia= new GridBagLayout();
		this.jPanelAccionesFormularioDia.setLayout(gridaBagLayoutAccionesFormularioDia);
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDia.add(this.jComboBoxTiposAccionesFormularioDia, this.gridBagConstraintsDia);

		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDia.add(this.jCheckBoxPostAccionNuevoDia, this.gridBagConstraintsDia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.diaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDia.add(this.jCheckBoxPostAccionSinCerrarDia, this.gridBagConstraintsDia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.diaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.diaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDia.add(this.jCheckBoxPostAccionSinMensajeDia, this.gridBagConstraintsDia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = 0;
		this.gridBagConstraintsDia.gridx = iPosXAccion++;
			
		this.jPanelAccionesDia.add(this.jButtonModificarDia, this.gridBagConstraintsDia);							

		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDia.gridy = 0;
		this.gridBagConstraintsDia.gridx =iPosXAccion++;
			
		this.jPanelAccionesDia.add(this.jButtonEliminarDia, this.gridBagConstraintsDia);
		
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = 0;		
		this.gridBagConstraintsDia.gridx = iPosXAccion++;
		
		this.jPanelAccionesDia.add(this.jButtonActualizarDia, this.gridBagConstraintsDia);


		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = 0;		
		this.gridBagConstraintsDia.gridx = iPosXAccion++;
		
		this.jPanelAccionesDia.add(this.jButtonGuardarCambiosDia, this.gridBagConstraintsDia);	
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = 0;		
		this.gridBagConstraintsDia.gridx =iPosXAccion++;
		
		this.jPanelAccionesDia.add(this.jButtonCancelarDia, this.gridBagConstraintsDia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDia = new GridBagConstraints();						
			this.gridBagConstraintsDia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDia.gridx = 0;		
			//this.gridBagConstraintsDia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDia.gridx =0;
		this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDia, this.gridBagConstraintsDia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DiaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDia = new DiaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DiaModel diaModel=new DiaModel(this);
			
			//SI USARA CLASE INTERNA
			//DiaModel.DiaFocusTraversalPolicy diaFocusTraversalPolicy = diaModel.new DiaFocusTraversalPolicy(this);
			
			//diaFocusTraversalPolicy.setdiaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(diaModel);
			
			
			this.jContentPaneDetalleDia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDia = new GridBagLayout();	
			this.jContentPaneDetalleDia.setLayout(gridaBagLayoutDetalleDia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDia = new GridBagConstraints();
				this.gridBagConstraintsDia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDia.gridx = 0;
					
				
				this.jContentPaneDetalleDia.add(jTtoolBarDetalleDia, gridBagConstraintsDia);								
				
}
			
			this.jScrollPanelDatosEdicionDia=   new JScrollPane(jContentPaneDetalleDia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDia.gridx = 0;
	        
			this.jContentPaneDetalleDia.add(jPanelCamposDia, gridBagConstraintsDia);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& diaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.diaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDia= new GridBagConstraints();
						this.gridBagConstraintsDia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDia.gridx = 0;
						this.jContentPaneDetalleDia.add(this.jTabbedPaneRelacionesDia, this.gridBagConstraintsDia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDia.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDia = new GridBagConstraints();
					this.gridBagConstraintsDia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDia.gridx = 0;
					
				
					this.jContentPaneDetalleDia.add(jPanelCamposOcultosDia, gridBagConstraintsDia);
				
					this.jPanelCamposOcultosDia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDia.gridx = 0;
	        this.gridBagConstraintsDia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDia.add(this.jPanelAccionesFormularioDia, this.gridBagConstraintsDia);							
			
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
	        this.gridBagConstraintsDia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDia.gridx = 0;
	        
			
			this.jContentPaneDetalleDia.add(this.jPanelAccionesDia, this.gridBagConstraintsDia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDia=   new JScrollPane(this.jPanelCamposDia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDia.gridx = 0;
			this.gridBagConstraintsDia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDia, this.gridBagConstraintsDia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDia, this.gridBagConstraintsDia);			
			
			this.gridBagConstraintsDia = new GridBagConstraints();
			this.gridBagConstraintsDia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDia, this.gridBagConstraintsDia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDia, this.gridBagConstraintsDia);
			
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDia, this.gridBagConstraintsDia);
		
			
		this.gridBagConstraintsDia = new GridBagConstraints();
		this.gridBagConstraintsDia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDia, this.gridBagConstraintsDia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDia;//jContentPane;
		
		return jScrollPanelDatosEdicionDia;
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
