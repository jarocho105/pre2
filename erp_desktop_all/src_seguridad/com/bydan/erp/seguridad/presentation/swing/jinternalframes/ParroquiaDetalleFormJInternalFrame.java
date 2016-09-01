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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.ParroquiaConstantesFunciones;

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
public class ParroquiaDetalleFormJInternalFrame extends ParroquiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParroquia;
	
	protected JMenuBar jmenuBarDetalleParroquia;
	
	protected JMenu jmenuDetalleParroquia;
	protected JMenu jmenuDetalleArchivoParroquia;
	protected JMenu jmenuDetalleAccionesParroquia;
	protected JMenu jmenuDetalleDatosParroquia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParroquia;	
	protected GridBagConstraints gridBagConstraintsParroquia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParroquiaBeanSwingJInternalFrameAdditional jInternalFrameDetalleParroquia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";
	
	public ParroquiaSessionBean parroquiaSessionBean;
	
	
	
	
	public CantonSessionBean cantonSessionBean;	
	
	public ParroquiaLogic parroquiaLogic;
	
	public JScrollPane jScrollPanelDatosParroquia;
	public JScrollPane jScrollPanelDatosEdicionParroquia;
	public JScrollPane jScrollPanelDatosGeneralParroquia;
	
	protected JPanel jPanelCamposParroquia;    
	protected JPanel jPanelCamposOcultosParroquia;    	
	protected JPanel jPanelAccionesParroquia;
	protected JPanel jPanelAccionesFormularioParroquia;
    
	
	
	protected Integer iXPanelCamposParroquia=0;
	protected Integer iYPanelCamposParroquia=0;
	
	protected Integer iXPanelCamposOcultosParroquia=0;
	protected Integer iYPanelCamposOcultosParroquia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParroquia;
	public JButton jButtonModificarParroquia;
	public JButton jButtonActualizarParroquia;
    public JButton jButtonEliminarParroquia;
	public JButton jButtonCancelarParroquia;
    public JButton jButtonGuardarCambiosParroquia;
	public JButton jButtonGuardarCambiosTablaParroquia;
	protected JButton jButtonCerrarParroquia;
	
	
	protected JButton jButtonProcesarInformacionParroquia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParroquia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParroquia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParroquia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParroquia;
	protected JButton jButtonModificarToolBarParroquia;
	protected JButton jButtonActualizarToolBarParroquia;
    protected JButton jButtonEliminarToolBarParroquia;
	protected JButton jButtonCancelarToolBarParroquia;
    protected JButton jButtonGuardarCambiosToolBarParroquia;
	protected JButton jButtonGuardarCambiosTablaToolBarParroquia;
	protected JButton jButtonMostrarOcultarTablaToolBarParroquia;
	protected JButton jButtonCerrarToolBarParroquia;
	
	protected JButton jButtonProcesarInformacionToolBarParroquia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParroquia;
	protected JMenuItem jMenuItemModificarParroquia;
	protected JMenuItem jMenuItemActualizarParroquia;
    protected JMenuItem jMenuItemEliminarParroquia;
	protected JMenuItem jMenuItemCancelarParroquia;
    protected JMenuItem jMenuItemGuardarCambiosParroquia;
	protected JMenuItem jMenuItemGuardarCambiosTablaParroquia;
	protected JMenuItem jMenuItemCerrarParroquia;
	protected JMenuItem jMenuItemDetalleCerrarParroquia;
	protected JMenuItem jMenuItemDetalleMostarOcultarParroquia;
	
	protected JMenuItem jMenuItemProcesarInformacionParroquia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParroquia;
	protected JMenuItem jMenuItemMostrarOcultarParroquia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParroquia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParroquia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParroquia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParroquia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParroquia;
	public JLabel jLabelIdParroquia;
	public JLabel jLabelidParroquia;
	public JButton jButtonidParroquiaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoParroquia;
	public JLabel jLabelcodigoParroquia;
	public JTextField jTextFieldcodigoParroquia;
	public JButton jButtoncodigoParroquiaBusqueda= new JButtonMe();

	public JPanel jPanelnombreParroquia;
	public JLabel jLabelnombreParroquia;
	public JTextArea jTextAreanombreParroquia;
	public JScrollPane jscrollPanenombreParroquia;
	public JButton jButtonnombreParroquiaBusqueda= new JButtonMe();

	public JPanel jPaneles_activoParroquia;
	public JLabel jLabeles_activoParroquia;
	public JCheckBox jCheckBoxes_activoParroquia;
	public JButton jButtones_activoParroquiaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cantonParroquia;
	public JLabel jLabelid_cantonParroquia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonParroquia;
	public JButton jButtonid_cantonParroquia= new JButtonMe();
	public JButton jButtonid_cantonParroquiaUpdate= new JButtonMe();
	public JButton jButtonid_cantonParroquiaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParroquia;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParroquiaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParroquia=new JPanel();
				this.jPanelAccionesFormularioParroquia=new JPanel();
				this.jmenuBarDetalleParroquia=new JMenuBar();
				this.jTtoolBarDetalleParroquia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParroquiaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParroquiaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Parroquia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParroquia() {
		return this.jButtonActualizarToolBarParroquia;
	}
	
	public JButton getjButtonEliminarToolBarParroquia() {
		return this.jButtonEliminarToolBarParroquia;
	}
	
	public JButton getjButtonCancelarToolBarParroquia() {
		return this.jButtonCancelarToolBarParroquia;
	}		
	
	public JButton getjButtonProcesarInformacionParroquia() {
		return this.jButtonProcesarInformacionParroquia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParroquia)	{
		this.jButtonProcesarInformacionParroquia = jButtonProcesarInformacionParroquia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParroquia() {
		return this.jComboBoxTiposAccionesParroquia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParroquia(
			JComboBox jComboBoxTiposRelacionesParroquia) {
		this.jComboBoxTiposRelacionesParroquia = jComboBoxTiposRelacionesParroquia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParroquia(
			JComboBox jComboBoxTiposAccionesParroquia) {
		this.jComboBoxTiposAccionesParroquia = jComboBoxTiposAccionesParroquia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParroquia() {
		return this.jComboBoxTiposAccionesFormularioParroquia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParroquia(
			JComboBox jComboBoxTiposAccionesFormularioParroquia) {
		this.jComboBoxTiposAccionesFormularioParroquia = jComboBoxTiposAccionesFormularioParroquia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parroquiaSessionBean=new ParroquiaSessionBean();
		
		this.parroquiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parroquiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parroquiaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParroquiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parroquia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
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
	
		ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParroquia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParroquia=new JButtonMe();
				this.jButtonModificarToolBarParroquia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParroquia,this.jTtoolBarDetalleParroquia,
							"actualizar","actualizar","Actualizar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParroquia,this.jTtoolBarDetalleParroquia,
							"eliminar","eliminar","Eliminar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParroquia,this.jTtoolBarDetalleParroquia,
							"cancelar","cancelar","Cancelar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParroquia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParroquia,this.jTtoolBarDetalleParroquia,
							"guardarcambios","guardarcambios","Guardar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParroquia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParroquia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParroquia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParroquia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParroquia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParroquia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParroquia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParroquia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParroquia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParroquia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParroquia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParroquia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParroquia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParroquia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParroquia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParroquia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParroquia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParroquia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParroquia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParroquia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParroquia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParroquia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParroquia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParroquia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParroquia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParroquia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParroquia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParroquia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParroquia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParroquia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParroquia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParroquia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParroquia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParroquia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParroquia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParroquia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParroquia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParroquia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParroquia.add(this.jMenuItemDetalleCerrarParroquia);
		
		this.jmenuDetalleAccionesParroquia.add(this.jMenuItemActualizarParroquia);
		this.jmenuDetalleAccionesParroquia.add(this.jMenuItemEliminarParroquia);
		this.jmenuDetalleAccionesParroquia.add(this.jMenuItemCancelarParroquia);		
		
		//this.jmenuDetalleDatosParroquia.add(this.jMenuItemDetalleAbrirOrderByParroquia);				
		this.jmenuDetalleDatosParroquia.add(this.jMenuItemDetalleMostarOcultarParroquia);				
				
		//this.jmenuDetalleAccionesParroquia.add(this.jMenuItemGuardarCambiosParroquia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParroquia.add(this.jmenuDetalleArchivoParroquia);		
		this.jmenuBarDetalleParroquia.add(this.jmenuDetalleAccionesParroquia);		
		this.jmenuBarDetalleParroquia.add(this.jmenuDetalleDatosParroquia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParroquia);				
	}
	
	
	public void inicializarElementosCamposParroquia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParroquia = new JLabelMe();
		jLabelIdParroquia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParroquia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParroquia.setToolTipText(ParroquiaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParroquia= new GridBagLayout();

		this.jPanelidParroquia.setLayout(this.gridaBagLayoutParroquia);

		jLabelidParroquia = new JLabel();
		jLabelidParroquia.setText("Id");

		jLabelidParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoParroquia = new JLabelMe();
		this.jLabelcodigoParroquia.setText(""+ParroquiaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoParroquia.setToolTipText("Codigo");
		this.jLabelcodigoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoParroquia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoParroquia.setToolTipText(ParroquiaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutParroquia = new GridBagLayout();
		this.jPanelcodigoParroquia.setLayout(this.gridaBagLayoutParroquia);


		jTextFieldcodigoParroquia= new JTextFieldMe();

		jTextFieldcodigoParroquia.setEnabled(false);
		jTextFieldcodigoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoParroquiaBusqueda= new JButtonMe();
		this.jButtoncodigoParroquiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParroquiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoParroquiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoParroquiaBusqueda.setText("U");
		this.jButtoncodigoParroquiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoParroquiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoParroquiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoParroquiaBusqueda"));

		if(this.parroquiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoParroquiaBusqueda.setVisible(false);		}


					
		this.jLabelnombreParroquia = new JLabelMe();
		this.jLabelnombreParroquia.setText(""+ParroquiaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreParroquia.setToolTipText("Nombre");
		this.jLabelnombreParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreParroquia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreParroquia.setToolTipText(ParroquiaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutParroquia = new GridBagLayout();
		this.jPanelnombreParroquia.setLayout(this.gridaBagLayoutParroquia);


		jTextAreanombreParroquia= new JTextAreaMe();
		jTextAreanombreParroquia.setEnabled(false);
		jTextAreanombreParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreParroquia.setLineWrap(true);
		jTextAreanombreParroquia.setWrapStyleWord(true);
		jTextAreanombreParroquia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreParroquia.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreParroquia = new JScrollPane(jTextAreanombreParroquia);
		jscrollPanenombreParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreParroquiaBusqueda= new JButtonMe();
		this.jButtonnombreParroquiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParroquiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreParroquiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreParroquiaBusqueda.setText("U");
		this.jButtonnombreParroquiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreParroquiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreParroquiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreParroquiaBusqueda"));

		if(this.parroquiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreParroquiaBusqueda.setVisible(false);		}


					
		this.jLabeles_activoParroquia = new JLabelMe();
		this.jLabeles_activoParroquia.setText(""+ParroquiaConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoParroquia.setToolTipText("Es Activo");
		this.jLabeles_activoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoParroquia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoParroquia.setToolTipText(ParroquiaConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutParroquia = new GridBagLayout();
		this.jPaneles_activoParroquia.setLayout(this.gridaBagLayoutParroquia);


		jCheckBoxes_activoParroquia= new JCheckBoxMe();
		jCheckBoxes_activoParroquia.setEnabled(false);

		jCheckBoxes_activoParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoParroquiaBusqueda= new JButtonMe();
		this.jButtones_activoParroquiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoParroquiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoParroquiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoParroquiaBusqueda.setText("U");
		this.jButtones_activoParroquiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoParroquiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoParroquiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoParroquiaBusqueda"));

		if(this.parroquiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoParroquiaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParroquia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cantonParroquia = new JLabelMe();
		this.jLabelid_cantonParroquia.setText(""+ParroquiaConstantesFunciones.LABEL_IDCANTON+" : *");
		this.jLabelid_cantonParroquia.setToolTipText("Canton");
		this.jLabelid_cantonParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cantonParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cantonParroquia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cantonParroquia.setToolTipText(ParroquiaConstantesFunciones.LABEL_IDCANTON);
		this.gridaBagLayoutParroquia = new GridBagLayout();
		this.jPanelid_cantonParroquia.setLayout(this.gridaBagLayoutParroquia);


		jComboBoxid_cantonParroquia= new JComboBoxMe();
		jComboBoxid_cantonParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonParroquia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cantonParroquia= new JButtonMe();
		this.jButtonid_cantonParroquia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonParroquia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonParroquia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonParroquia.setText("Buscar");
		this.jButtonid_cantonParroquia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cantonParroquia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonParroquia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cantonParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonParroquia"));

		this.jButtonid_cantonParroquiaBusqueda= new JButtonMe();
		this.jButtonid_cantonParroquiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonParroquiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonParroquiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonParroquiaBusqueda.setText("U");
		this.jButtonid_cantonParroquiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cantonParroquiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonParroquiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cantonParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonParroquiaBusqueda"));

		if(this.parroquiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cantonParroquiaBusqueda.setVisible(false);		}

		this.jButtonid_cantonParroquiaUpdate= new JButtonMe();
		this.jButtonid_cantonParroquiaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonParroquiaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonParroquiaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonParroquiaUpdate.setText("U");
		this.jButtonid_cantonParroquiaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cantonParroquiaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonParroquiaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cantonParroquia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonParroquia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonParroquiaUpdate"));



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
		//this.jInternalFrameDetalleParroquia = new ParroquiaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parroquia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParroquia= new GridBagLayout();
		

		
		String sToolTipParroquia="";
		sToolTipParroquia=ParroquiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParroquia+="(Seguridad.Parroquia)";
		}
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			sToolTipParroquia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParroquia = new JButtonMe();
		this.jButtonModificarParroquia = new JButtonMe();
        this.jButtonActualizarParroquia = new JButtonMe();
        this.jButtonEliminarParroquia = new JButtonMe();
        this.jButtonCancelarParroquia = new JButtonMe();
        this.jButtonGuardarCambiosParroquia = new JButtonMe();
		this.jButtonGuardarCambiosTablaParroquia = new JButtonMe();
		this.jButtonCerrarParroquia = new JButtonMe();
		
		this.jScrollPanelDatosParroquia = new JScrollPane();   
        this.jScrollPanelDatosEdicionParroquia = new JScrollPane();
		this.jScrollPanelDatosGeneralParroquia = new JScrollPane();
				
		
		
		this.jPanelCamposParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parroquia";
		
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parroquias" + this.sPath));
		} else {
			this.jScrollPanelDatosParroquia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParroquia.setName("jPanelCamposParroquia"); 

		this.jPanelCamposOcultosParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParroquia.setName("jPanelCamposOcultosParroquia"); 

        this.jPanelAccionesParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParroquia.setToolTipText("Acciones");
        this.jPanelAccionesParroquia.setName("Acciones"); 

		this.jPanelAccionesFormularioParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParroquia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParroquia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParroquia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParroquia.setText("Nuevo");
		this.jButtonModificarParroquia.setText("Editar");
        this.jButtonActualizarParroquia.setText("Actualizar");
        this.jButtonEliminarParroquia.setText("Eliminar");
        this.jButtonCancelarParroquia.setText("Cancelar");
        this.jButtonGuardarCambiosParroquia.setText("Guardar");
		this.jButtonGuardarCambiosTablaParroquia.setText("Guardar");
		this.jButtonCerrarParroquia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParroquia,"nuevo_button","Nuevo",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParroquia,"modificar_button","Editar",this.parroquiaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParroquia,"actualizar_button","Actualizar",this.parroquiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParroquia,"eliminar_button","Eliminar",this.parroquiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParroquia,"cancelar_button","Cancelar",this.parroquiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParroquia,"guardarcambios_button","Guardar",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParroquia,"guardarcambiostabla_button","Guardar",this.parroquiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParroquia,"cerrar_button","Salir",this.parroquiaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParroquia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParroquia.setToolTipText("Nuevo"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParroquia.setToolTipText("Editar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParroquia.setToolTipText("Actualizar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParroquia.setToolTipText("Eliminar)"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParroquia.setToolTipText("Cancelar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParroquia.setToolTipText("Guardar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParroquia.setToolTipText("Guardar"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParroquia.setToolTipText("Salir"+" "+ParroquiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParroquia";
		inputMap = this.jButtonNuevoParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParroquia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParroquia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParroquia";
		inputMap = this.jButtonActualizarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParroquia"));
		
		//ELIMINAR
		sMapKey = "EliminarParroquia";
		inputMap = this.jButtonEliminarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParroquia"));
		
		//CANCELAR	
		sMapKey = "CancelarParroquia";
		inputMap = this.jButtonCancelarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParroquia"));
		
		//CERRAR		
		sMapKey = "CerrarParroquia";
		inputMap = this.jButtonCerrarParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParroquia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParroquia";
		inputMap = this.jButtonGuardarCambiosTablaParroquia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParroquia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParroquia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParroquia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParroquia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParroquia.setToolTipText("Nuevo Parroquia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParroquia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParroquia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParroquia.setToolTipText("Sin Cerrar Ventana Parroquia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParroquia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParroquia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParroquia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParroquia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParroquia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParroquia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParroquia.setText("Accion");
		this.jComboBoxTiposAccionesParroquia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParroquia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParroquia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParroquia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParroquia = new JLabelMe();
		
		this.jLabelAccionesParroquia.setText("Acciones");		
		this.jLabelAccionesParroquia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParroquia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParroquia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParroquia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParroquia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParroquia=new JTabbedPane();
		this.jTabbedPaneRelacionesParroquia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParroquia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParroquia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParroquia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParroquia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParroquia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParroquia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParroquia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParroquia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParroquia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParroquia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParroquia = new GridBagLayout();
		
		this.jPanelCamposParroquia.setLayout(gridaBagLayoutCamposParroquia);
		this.jPanelCamposOcultosParroquia.setLayout(gridaBagLayoutCamposOcultosParroquia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 0;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParroquia.add(jLabelIdParroquia, this.gridBagConstraintsParroquia);



	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 1;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParroquia.add(jLabelidParroquia, this.gridBagConstraintsParroquia);


	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 0;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cantonParroquia.add(jLabelid_cantonParroquia, this.gridBagConstraintsParroquia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 2;
		this.gridBagConstraintsParroquia.ipadx = 0;
		this.gridBagConstraintsParroquia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonParroquia.add(jButtonid_cantonParroquiaBusqueda, this.gridBagConstraintsParroquia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 3;
		this.gridBagConstraintsParroquia.ipadx = 0;
		this.gridBagConstraintsParroquia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonParroquia.add(jButtonid_cantonParroquiaUpdate, this.gridBagConstraintsParroquia);
	}

	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 1;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cantonParroquia.add(jComboBoxid_cantonParroquia, this.gridBagConstraintsParroquia);


	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 0;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoParroquia.add(jLabelcodigoParroquia, this.gridBagConstraintsParroquia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 2;
		this.gridBagConstraintsParroquia.ipadx = 0;
		this.gridBagConstraintsParroquia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoParroquia.add(jButtoncodigoParroquiaBusqueda, this.gridBagConstraintsParroquia);
	}

	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 1;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoParroquia.add(jTextFieldcodigoParroquia, this.gridBagConstraintsParroquia);


	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 0;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreParroquia.add(jLabelnombreParroquia, this.gridBagConstraintsParroquia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 2;
		this.gridBagConstraintsParroquia.ipadx = 0;
		this.gridBagConstraintsParroquia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreParroquia.add(jButtonnombreParroquiaBusqueda, this.gridBagConstraintsParroquia);
	}

	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 1;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreParroquia.add(jscrollPanenombreParroquia, this.gridBagConstraintsParroquia);


	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 0;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoParroquia.add(jLabeles_activoParroquia, this.gridBagConstraintsParroquia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		//this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = 2;
		this.gridBagConstraintsParroquia.ipadx = 0;
		this.gridBagConstraintsParroquia.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoParroquia.add(jButtones_activoParroquiaBusqueda, this.gridBagConstraintsParroquia);
	}

	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParroquia.gridy = 0;
	this.gridBagConstraintsParroquia.gridx = 1;
	this.gridBagConstraintsParroquia.ipadx = 0;
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoParroquia.add(jCheckBoxes_activoParroquia, this.gridBagConstraintsParroquia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParroquia.gridy = iYPanelCamposParroquia;
	this.gridBagConstraintsParroquia.gridx = iXPanelCamposParroquia++;
	this.gridBagConstraintsParroquia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParroquia.add(this.jPanelidParroquia, this.gridBagConstraintsParroquia);



	if(iXPanelCamposParroquia % 1==0) {
		iXPanelCamposParroquia=0;
		iYPanelCamposParroquia++;
	}
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParroquia.gridy = iYPanelCamposParroquia;
	this.gridBagConstraintsParroquia.gridx = iXPanelCamposParroquia++;
	this.gridBagConstraintsParroquia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParroquia.add(this.jPanelid_cantonParroquia, this.gridBagConstraintsParroquia);



	if(iXPanelCamposParroquia % 1==0) {
		iXPanelCamposParroquia=0;
		iYPanelCamposParroquia++;
	}
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParroquia.gridy = iYPanelCamposParroquia;
	this.gridBagConstraintsParroquia.gridx = iXPanelCamposParroquia++;
	this.gridBagConstraintsParroquia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParroquia.add(this.jPanelcodigoParroquia, this.gridBagConstraintsParroquia);



	if(iXPanelCamposParroquia % 1==0) {
		iXPanelCamposParroquia=0;
		iYPanelCamposParroquia++;
	}
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParroquia.gridy = iYPanelCamposParroquia;
	this.gridBagConstraintsParroquia.gridx = iXPanelCamposParroquia++;
	this.gridBagConstraintsParroquia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParroquia.add(this.jPanelnombreParroquia, this.gridBagConstraintsParroquia);



	if(iXPanelCamposParroquia % 1==0) {
		iXPanelCamposParroquia=0;
		iYPanelCamposParroquia++;
	}
	this.gridBagConstraintsParroquia = new GridBagConstraints();
	this.gridBagConstraintsParroquia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParroquia.gridy = iYPanelCamposParroquia;
	this.gridBagConstraintsParroquia.gridx = iXPanelCamposParroquia++;
	this.gridBagConstraintsParroquia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParroquia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParroquia.add(this.jPaneles_activoParroquia, this.gridBagConstraintsParroquia);



	if(iXPanelCamposParroquia % 1==0) {
		iXPanelCamposParroquia=0;
		iYPanelCamposParroquia++;
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
			
		GridBagLayout gridaBagLayoutAccionesParroquia= new GridBagLayout();
		this.jPanelAccionesParroquia.setLayout(gridaBagLayoutAccionesParroquia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParroquia= new GridBagLayout();
		this.jPanelAccionesFormularioParroquia.setLayout(gridaBagLayoutAccionesFormularioParroquia);
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParroquia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParroquia.add(this.jComboBoxTiposAccionesFormularioParroquia, this.gridBagConstraintsParroquia);

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParroquia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParroquia.add(this.jCheckBoxPostAccionNuevoParroquia, this.gridBagConstraintsParroquia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parroquiaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParroquia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParroquia.add(this.jCheckBoxPostAccionSinCerrarParroquia, this.gridBagConstraintsParroquia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parroquiaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parroquiaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParroquia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParroquia.add(this.jCheckBoxPostAccionSinMensajeParroquia, this.gridBagConstraintsParroquia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx = iPosXAccion++;
			
		this.jPanelAccionesParroquia.add(this.jButtonModificarParroquia, this.gridBagConstraintsParroquia);							

		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParroquia.gridy = 0;
		this.gridBagConstraintsParroquia.gridx =iPosXAccion++;
			
		this.jPanelAccionesParroquia.add(this.jButtonEliminarParroquia, this.gridBagConstraintsParroquia);
		
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = 0;		
		this.gridBagConstraintsParroquia.gridx = iPosXAccion++;
		
		this.jPanelAccionesParroquia.add(this.jButtonActualizarParroquia, this.gridBagConstraintsParroquia);


		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = 0;		
		this.gridBagConstraintsParroquia.gridx = iPosXAccion++;
		
		this.jPanelAccionesParroquia.add(this.jButtonGuardarCambiosParroquia, this.gridBagConstraintsParroquia);	
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = 0;		
		this.gridBagConstraintsParroquia.gridx =iPosXAccion++;
		
		this.jPanelAccionesParroquia.add(this.jButtonCancelarParroquia, this.gridBagConstraintsParroquia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParroquia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParroquia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parroquiaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParroquia = new GridBagConstraints();						
			this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParroquia.gridx = 0;		
			//this.gridBagConstraintsParroquia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParroquia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParroquia.gridx =0;
		this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParroquia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParroquia, this.gridBagConstraintsParroquia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParroquiaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParroquia = new ParroquiaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parroquia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parroquia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parroquia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParroquiaModel parroquiaModel=new ParroquiaModel(this);
			
			//SI USARA CLASE INTERNA
			//ParroquiaModel.ParroquiaFocusTraversalPolicy parroquiaFocusTraversalPolicy = parroquiaModel.new ParroquiaFocusTraversalPolicy(this);
			
			//parroquiaFocusTraversalPolicy.setparroquiaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parroquiaModel);
			
			
			this.jContentPaneDetalleParroquia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParroquia = new GridBagLayout();	
			this.jContentPaneDetalleParroquia.setLayout(gridaBagLayoutDetalleParroquia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParroquia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParroquia = new GridBagConstraints();
				this.gridBagConstraintsParroquia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParroquia.gridx = 0;
					
				
				this.jContentPaneDetalleParroquia.add(jTtoolBarDetalleParroquia, gridBagConstraintsParroquia);								
				
}
			
			this.jScrollPanelDatosEdicionParroquia=   new JScrollPane(jContentPaneDetalleParroquia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParroquia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParroquia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParroquia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParroquia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParroquia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParroquia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParroquia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParroquia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParroquia.gridx = 0;
	        
			this.jContentPaneDetalleParroquia.add(jPanelCamposParroquia, gridBagConstraintsParroquia);
			
			
			
			
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
						&& parroquiaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.parroquiaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParroquia= new GridBagConstraints();
						this.gridBagConstraintsParroquia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParroquia.gridx = 0;
						this.jContentPaneDetalleParroquia.add(this.jTabbedPaneRelacionesParroquia, this.gridBagConstraintsParroquia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParroquia.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParroquia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParroquia = new GridBagConstraints();
					this.gridBagConstraintsParroquia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParroquia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParroquia.gridx = 0;
					
				
					this.jContentPaneDetalleParroquia.add(jPanelCamposOcultosParroquia, gridBagConstraintsParroquia);
				
					this.jPanelCamposOcultosParroquia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParroquia.gridx = 0;
	        this.gridBagConstraintsParroquia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParroquia.add(this.jPanelAccionesFormularioParroquia, this.gridBagConstraintsParroquia);							
			
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
	        this.gridBagConstraintsParroquia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParroquia.gridx = 0;
	        
			
			this.jContentPaneDetalleParroquia.add(this.jPanelAccionesParroquia, this.gridBagConstraintsParroquia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParroquia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParroquia=   new JScrollPane(this.jPanelCamposParroquia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParroquia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParroquia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParroquia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParroquia.gridx = 0;
			this.gridBagConstraintsParroquia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParroquia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParroquia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParroquia, this.gridBagConstraintsParroquia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParroquia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParroquia, this.gridBagConstraintsParroquia);			
			
			this.gridBagConstraintsParroquia = new GridBagConstraints();
			this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParroquia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParroquia, this.gridBagConstraintsParroquia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParroquia, this.gridBagConstraintsParroquia);
			
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParroquia, this.gridBagConstraintsParroquia);
		
			
		this.gridBagConstraintsParroquia = new GridBagConstraints();
		this.gridBagConstraintsParroquia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParroquia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParroquia, this.gridBagConstraintsParroquia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParroquia;//jContentPane;
		
		return jScrollPanelDatosEdicionParroquia;
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
