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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.EstadoAsientoContableConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class EstadoAsientoContableDetalleFormJInternalFrame extends EstadoAsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoAsientoContable;
	
	protected JMenuBar jmenuBarDetalleEstadoAsientoContable;
	
	protected JMenu jmenuDetalleEstadoAsientoContable;
	protected JMenu jmenuDetalleArchivoEstadoAsientoContable;
	protected JMenu jmenuDetalleAccionesEstadoAsientoContable;
	protected JMenu jmenuDetalleDatosEstadoAsientoContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAsientoContable;	
	protected GridBagConstraints gridBagConstraintsEstadoAsientoContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoAsientoContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoAsientoContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoAsientoContableSessionBean estadoasientocontableSessionBean;
	
	

	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroContabilidadDefecto=false;
	public ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean;
	
	
	public ColorGeneralSessionBean colorgeneralSessionBean;	
	
	public EstadoAsientoContableLogic estadoasientocontableLogic;
	
	public JScrollPane jScrollPanelDatosEstadoAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionEstadoAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralEstadoAsientoContable;
	
	protected JPanel jPanelCamposEstadoAsientoContable;    
	protected JPanel jPanelCamposOcultosEstadoAsientoContable;    	
	protected JPanel jPanelAccionesEstadoAsientoContable;
	protected JPanel jPanelAccionesFormularioEstadoAsientoContable;
    
	
	
	protected Integer iXPanelCamposEstadoAsientoContable=0;
	protected Integer iYPanelCamposEstadoAsientoContable=0;
	
	protected Integer iXPanelCamposOcultosEstadoAsientoContable=0;
	protected Integer iYPanelCamposOcultosEstadoAsientoContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoAsientoContable;
	public JButton jButtonModificarEstadoAsientoContable;
	public JButton jButtonActualizarEstadoAsientoContable;
    public JButton jButtonEliminarEstadoAsientoContable;
	public JButton jButtonCancelarEstadoAsientoContable;
    public JButton jButtonGuardarCambiosEstadoAsientoContable;
	public JButton jButtonGuardarCambiosTablaEstadoAsientoContable;
	protected JButton jButtonCerrarEstadoAsientoContable;
	
	
	protected JButton jButtonProcesarInformacionEstadoAsientoContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoAsientoContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAsientoContable;
	protected JButton jButtonModificarToolBarEstadoAsientoContable;
	protected JButton jButtonActualizarToolBarEstadoAsientoContable;
    protected JButton jButtonEliminarToolBarEstadoAsientoContable;
	protected JButton jButtonCancelarToolBarEstadoAsientoContable;
    protected JButton jButtonGuardarCambiosToolBarEstadoAsientoContable;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAsientoContable;
	protected JButton jButtonCerrarToolBarEstadoAsientoContable;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoAsientoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAsientoContable;
	protected JMenuItem jMenuItemModificarEstadoAsientoContable;
	protected JMenuItem jMenuItemActualizarEstadoAsientoContable;
    protected JMenuItem jMenuItemEliminarEstadoAsientoContable;
	protected JMenuItem jMenuItemCancelarEstadoAsientoContable;
    protected JMenuItem jMenuItemGuardarCambiosEstadoAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAsientoContable;
	protected JMenuItem jMenuItemCerrarEstadoAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAsientoContable;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAsientoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAsientoContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAsientoContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoAsientoContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoAsientoContable;
	public JLabel jLabelIdEstadoAsientoContable;
	public JTextFieldMe jTextFieldidEstadoAsientoContable;
	public JButton jButtonidEstadoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoAsientoContable;
	public JLabel jLabelcodigoEstadoAsientoContable;
	public JTextField jTextFieldcodigoEstadoAsientoContable;
	public JButton jButtoncodigoEstadoAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoAsientoContable;
	public JLabel jLabelnombreEstadoAsientoContable;
	public JTextArea jTextAreanombreEstadoAsientoContable;
	public JScrollPane jscrollPanenombreEstadoAsientoContable;
	public JButton jButtonnombreEstadoAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_color_generalEstadoAsientoContable;
	public JLabel jLabelid_color_generalEstadoAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalEstadoAsientoContable;
	public JButton jButtonid_color_generalEstadoAsientoContable= new JButtonMe();
	public JButton jButtonid_color_generalEstadoAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_color_generalEstadoAsientoContableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoAsientoContable;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoAsientoContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoAsientoContable=new JPanel();
				this.jPanelAccionesFormularioEstadoAsientoContable=new JPanel();
				this.jmenuBarDetalleEstadoAsientoContable=new JMenuBar();
				this.jTtoolBarDetalleEstadoAsientoContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoAsientoContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAsientoContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoAsientoContable() {
		return this.jButtonActualizarToolBarEstadoAsientoContable;
	}
	
	public JButton getjButtonEliminarToolBarEstadoAsientoContable() {
		return this.jButtonEliminarToolBarEstadoAsientoContable;
	}
	
	public JButton getjButtonCancelarToolBarEstadoAsientoContable() {
		return this.jButtonCancelarToolBarEstadoAsientoContable;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoAsientoContable() {
		return this.jButtonProcesarInformacionEstadoAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAsientoContable)	{
		this.jButtonProcesarInformacionEstadoAsientoContable = jButtonProcesarInformacionEstadoAsientoContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAsientoContable() {
		return this.jComboBoxTiposAccionesEstadoAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAsientoContable(
			JComboBox jComboBoxTiposRelacionesEstadoAsientoContable) {
		this.jComboBoxTiposRelacionesEstadoAsientoContable = jComboBoxTiposRelacionesEstadoAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAsientoContable(
			JComboBox jComboBoxTiposAccionesEstadoAsientoContable) {
		this.jComboBoxTiposAccionesEstadoAsientoContable = jComboBoxTiposAccionesEstadoAsientoContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoAsientoContable() {
		return this.jComboBoxTiposAccionesFormularioEstadoAsientoContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoAsientoContable(
			JComboBox jComboBoxTiposAccionesFormularioEstadoAsientoContable) {
		this.jComboBoxTiposAccionesFormularioEstadoAsientoContable = jComboBoxTiposAccionesFormularioEstadoAsientoContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoasientocontableSessionBean=new EstadoAsientoContableSessionBean();
		
		this.estadoasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoasientocontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoAsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoAsientoContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoAsientoContable=new JButtonMe();
				this.jButtonModificarToolBarEstadoAsientoContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable,
							"actualizar","actualizar","Actualizar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable,
							"eliminar","eliminar","Eliminar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable,
							"cancelar","cancelar","Cancelar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoAsientoContable,this.jTtoolBarDetalleEstadoAsientoContable,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoAsientoContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoAsientoContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoAsientoContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoAsientoContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoAsientoContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoAsientoContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoAsientoContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoAsientoContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoAsientoContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoAsientoContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoAsientoContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoAsientoContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoAsientoContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoAsientoContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoAsientoContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoAsientoContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoAsientoContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoAsientoContable.add(this.jMenuItemDetalleCerrarEstadoAsientoContable);
		
		this.jmenuDetalleAccionesEstadoAsientoContable.add(this.jMenuItemActualizarEstadoAsientoContable);
		this.jmenuDetalleAccionesEstadoAsientoContable.add(this.jMenuItemEliminarEstadoAsientoContable);
		this.jmenuDetalleAccionesEstadoAsientoContable.add(this.jMenuItemCancelarEstadoAsientoContable);		
		
		//this.jmenuDetalleDatosEstadoAsientoContable.add(this.jMenuItemDetalleAbrirOrderByEstadoAsientoContable);				
		this.jmenuDetalleDatosEstadoAsientoContable.add(this.jMenuItemDetalleMostarOcultarEstadoAsientoContable);				
				
		//this.jmenuDetalleAccionesEstadoAsientoContable.add(this.jMenuItemGuardarCambiosEstadoAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoAsientoContable.add(this.jmenuDetalleArchivoEstadoAsientoContable);		
		this.jmenuBarDetalleEstadoAsientoContable.add(this.jmenuDetalleAccionesEstadoAsientoContable);		
		this.jmenuBarDetalleEstadoAsientoContable.add(this.jmenuDetalleDatosEstadoAsientoContable);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoAsientoContable.add(this.jmenuDetalleEstadoAsientoContable);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoAsientoContable);				
	}
	
	
	public void inicializarElementosCamposEstadoAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoAsientoContable = new JLabelMe();
		jLabelIdEstadoAsientoContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoAsientoContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoAsientoContable.setToolTipText(EstadoAsientoContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoAsientoContable= new GridBagLayout();

		this.jPanelidEstadoAsientoContable.setLayout(this.gridaBagLayoutEstadoAsientoContable);

		jTextFieldidEstadoAsientoContable = new JTextFieldMe();
		jTextFieldidEstadoAsientoContable.setText("Id");

		jTextFieldidEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoAsientoContable = new JLabelMe();
		this.jLabelcodigoEstadoAsientoContable.setText(""+EstadoAsientoContableConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoAsientoContable.setToolTipText("Codigo");
		this.jLabelcodigoEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoAsientoContable.setToolTipText(EstadoAsientoContableConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoAsientoContable = new GridBagLayout();
		this.jPanelcodigoEstadoAsientoContable.setLayout(this.gridaBagLayoutEstadoAsientoContable);


		jTextFieldcodigoEstadoAsientoContable= new JTextFieldMe();

		jTextFieldcodigoEstadoAsientoContable.setEnabled(false);
		jTextFieldcodigoEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoAsientoContableBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoAsientoContableBusqueda.setText("U");
		this.jButtoncodigoEstadoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoAsientoContableBusqueda"));

		if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoAsientoContable = new JLabelMe();
		this.jLabelnombreEstadoAsientoContable.setText(""+EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoAsientoContable.setToolTipText("Nombre");
		this.jLabelnombreEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoAsientoContable.setToolTipText(EstadoAsientoContableConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoAsientoContable = new GridBagLayout();
		this.jPanelnombreEstadoAsientoContable.setLayout(this.gridaBagLayoutEstadoAsientoContable);


		jTextAreanombreEstadoAsientoContable= new JTextAreaMe();
		jTextAreanombreEstadoAsientoContable.setEnabled(false);
		jTextAreanombreEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAsientoContable.setLineWrap(true);
		jTextAreanombreEstadoAsientoContable.setWrapStyleWord(true);
		jTextAreanombreEstadoAsientoContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoAsientoContable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoAsientoContable = new JScrollPane(jTextAreanombreEstadoAsientoContable);
		jscrollPanenombreEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoAsientoContableBusqueda= new JButtonMe();
		this.jButtonnombreEstadoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoAsientoContableBusqueda.setText("U");
		this.jButtonnombreEstadoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoAsientoContableBusqueda"));

		if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoAsientoContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_color_generalEstadoAsientoContable = new JLabelMe();
		this.jLabelid_color_generalEstadoAsientoContable.setText(""+EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL+" : *");
		this.jLabelid_color_generalEstadoAsientoContable.setToolTipText("Color General");
		this.jLabelid_color_generalEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_generalEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_color_generalEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_color_generalEstadoAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_color_generalEstadoAsientoContable.setToolTipText(EstadoAsientoContableConstantesFunciones.LABEL_IDCOLORGENERAL);
		this.gridaBagLayoutEstadoAsientoContable = new GridBagLayout();
		this.jPanelid_color_generalEstadoAsientoContable.setLayout(this.gridaBagLayoutEstadoAsientoContable);


		jComboBoxid_color_generalEstadoAsientoContable= new JComboBoxMe();
		jComboBoxid_color_generalEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_color_generalEstadoAsientoContable= new JButtonMe();
		this.jButtonid_color_generalEstadoAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoAsientoContable.setText("Buscar");
		this.jButtonid_color_generalEstadoAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_color_generalEstadoAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_color_generalEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoAsientoContable"));

		this.jButtonid_color_generalEstadoAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoAsientoContableBusqueda.setText("U");
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_color_generalEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoAsientoContableBusqueda"));

		if(this.estadoasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_color_generalEstadoAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_color_generalEstadoAsientoContableUpdate= new JButtonMe();
		this.jButtonid_color_generalEstadoAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoAsientoContableUpdate.setText("U");
		this.jButtonid_color_generalEstadoAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_color_generalEstadoAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_color_generalEstadoAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoAsientoContableUpdate"));



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
		//this.jInternalFrameDetalleEstadoAsientoContable = new EstadoAsientoContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Asiento Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAsientoContable= new GridBagLayout();
		

		
		String sToolTipEstadoAsientoContable="";
		sToolTipEstadoAsientoContable=EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAsientoContable+="(Contabilidad.EstadoAsientoContable)";
		}
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAsientoContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoAsientoContable = new JButtonMe();
		this.jButtonModificarEstadoAsientoContable = new JButtonMe();
        this.jButtonActualizarEstadoAsientoContable = new JButtonMe();
        this.jButtonEliminarEstadoAsientoContable = new JButtonMe();
        this.jButtonCancelarEstadoAsientoContable = new JButtonMe();
        this.jButtonGuardarCambiosEstadoAsientoContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoAsientoContable = new JButtonMe();
		this.jButtonCerrarEstadoAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoAsientoContable = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoAsientoContable = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Asiento Contable";
		
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoAsientoContable.setName("jPanelCamposEstadoAsientoContable"); 

		this.jPanelCamposOcultosEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoAsientoContable.setName("jPanelCamposOcultosEstadoAsientoContable"); 

        this.jPanelAccionesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAsientoContable.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoAsientoContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoAsientoContable.setText("Nuevo");
		this.jButtonModificarEstadoAsientoContable.setText("Editar");
        this.jButtonActualizarEstadoAsientoContable.setText("Actualizar");
        this.jButtonEliminarEstadoAsientoContable.setText("Eliminar");
        this.jButtonCancelarEstadoAsientoContable.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoAsientoContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.setText("Guardar");
		this.jButtonCerrarEstadoAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAsientoContable,"nuevo_button","Nuevo",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoAsientoContable,"modificar_button","Editar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoAsientoContable,"actualizar_button","Actualizar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoAsientoContable,"eliminar_button","Eliminar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoAsientoContable,"cancelar_button","Cancelar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoAsientoContable,"guardarcambios_button","Guardar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAsientoContable,"guardarcambiostabla_button","Guardar",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAsientoContable,"cerrar_button","Salir",this.estadoasientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoAsientoContable.setToolTipText("Nuevo"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoAsientoContable.setToolTipText("Editar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoAsientoContable.setToolTipText("Actualizar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoAsientoContable.setToolTipText("Eliminar)"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoAsientoContable.setToolTipText("Cancelar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoAsientoContable.setToolTipText("Guardar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.setToolTipText("Guardar"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAsientoContable.setToolTipText("Salir"+" "+EstadoAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAsientoContable";
		inputMap = this.jButtonNuevoEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAsientoContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoAsientoContable";
		inputMap = this.jButtonActualizarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoAsientoContable"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoAsientoContable";
		inputMap = this.jButtonEliminarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoAsientoContable"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoAsientoContable";
		inputMap = this.jButtonCancelarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoAsientoContable"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoAsientoContable";
		inputMap = this.jButtonCerrarEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAsientoContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoAsientoContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoAsientoContable.setToolTipText("Nuevo EstadoAsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoAsientoContable.setToolTipText("Sin Cerrar Ventana EstadoAsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoAsientoContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAsientoContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoAsientoContable = new JLabelMe();
		
		this.jLabelAccionesEstadoAsientoContable.setText("Acciones");		
		this.jLabelAccionesEstadoAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoAsientoContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoAsientoContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoAsientoContable=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAsientoContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoAsientoContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoAsientoContable = new GridBagLayout();
		
		this.jPanelCamposEstadoAsientoContable.setLayout(gridaBagLayoutCamposEstadoAsientoContable);
		this.jPanelCamposOcultosEstadoAsientoContable.setLayout(gridaBagLayoutCamposOcultosEstadoAsientoContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoAsientoContable.add(jLabelIdEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoAsientoContable.add(jTextFieldidEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);


	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoAsientoContable.add(jLabelcodigoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 2;
		this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoAsientoContable.add(jButtoncodigoEstadoAsientoContableBusqueda, this.gridBagConstraintsEstadoAsientoContable);
	}

	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoAsientoContable.add(jTextFieldcodigoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);


	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoAsientoContable.add(jLabelnombreEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 2;
		this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoAsientoContable.add(jButtonnombreEstadoAsientoContableBusqueda, this.gridBagConstraintsEstadoAsientoContable);
	}

	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoAsientoContable.add(jscrollPanenombreEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);


	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_color_generalEstadoAsientoContable.add(jLabelid_color_generalEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 2;
		this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoAsientoContable.add(jButtonid_color_generalEstadoAsientoContableBusqueda, this.gridBagConstraintsEstadoAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = 3;
		this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
		this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoAsientoContable.add(jButtonid_color_generalEstadoAsientoContableUpdate, this.gridBagConstraintsEstadoAsientoContable);
	}

	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
	this.gridBagConstraintsEstadoAsientoContable.gridx = 1;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_color_generalEstadoAsientoContable.add(jComboBoxid_color_generalEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContable.gridy = iYPanelCamposEstadoAsientoContable;
	this.gridBagConstraintsEstadoAsientoContable.gridx = iXPanelCamposEstadoAsientoContable++;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContable.add(this.jPanelidEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(iXPanelCamposEstadoAsientoContable % 1==0) {
		iXPanelCamposEstadoAsientoContable=0;
		iYPanelCamposEstadoAsientoContable++;
	}
	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContable.gridy = iYPanelCamposEstadoAsientoContable;
	this.gridBagConstraintsEstadoAsientoContable.gridx = iXPanelCamposEstadoAsientoContable++;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContable.add(this.jPanelcodigoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(iXPanelCamposEstadoAsientoContable % 1==0) {
		iXPanelCamposEstadoAsientoContable=0;
		iYPanelCamposEstadoAsientoContable++;
	}
	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContable.gridy = iYPanelCamposEstadoAsientoContable;
	this.gridBagConstraintsEstadoAsientoContable.gridx = iXPanelCamposEstadoAsientoContable++;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContable.add(this.jPanelnombreEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(iXPanelCamposEstadoAsientoContable % 1==0) {
		iXPanelCamposEstadoAsientoContable=0;
		iYPanelCamposEstadoAsientoContable++;
	}
	this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAsientoContable.gridy = iYPanelCamposEstadoAsientoContable;
	this.gridBagConstraintsEstadoAsientoContable.gridx = iXPanelCamposEstadoAsientoContable++;
	this.gridBagConstraintsEstadoAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAsientoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAsientoContable.add(this.jPanelid_color_generalEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);



	if(iXPanelCamposEstadoAsientoContable % 1==0) {
		iXPanelCamposEstadoAsientoContable=0;
		iYPanelCamposEstadoAsientoContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoAsientoContable= new GridBagLayout();
		this.jPanelAccionesEstadoAsientoContable.setLayout(gridaBagLayoutAccionesEstadoAsientoContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoAsientoContable= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoAsientoContable.setLayout(gridaBagLayoutAccionesFormularioEstadoAsientoContable);
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAsientoContable.add(this.jComboBoxTiposAccionesFormularioEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAsientoContable.add(this.jCheckBoxPostAccionNuevoEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAsientoContable.add(this.jCheckBoxPostAccionSinCerrarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoasientocontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAsientoContable.add(this.jCheckBoxPostAccionSinMensajeEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonModificarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);							

		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;
		this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonEliminarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonActualizarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);


		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonGuardarCambiosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);	
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = 0;		
		this.gridBagConstraintsEstadoAsientoContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoAsientoContable.add(this.jButtonCancelarEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAsientoContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoasientocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;		
			//this.gridBagConstraintsEstadoAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAsientoContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAsientoContable.gridx =0;
		this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoAsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoAsientoContable = new EstadoAsientoContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Asiento Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Asiento Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Asiento Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoAsientoContableModel estadoasientocontableModel=new EstadoAsientoContableModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoAsientoContableModel.EstadoAsientoContableFocusTraversalPolicy estadoasientocontableFocusTraversalPolicy = estadoasientocontableModel.new EstadoAsientoContableFocusTraversalPolicy(this);
			
			//estadoasientocontableFocusTraversalPolicy.setestadoasientocontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoasientocontableModel);
			
			
			this.jContentPaneDetalleEstadoAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoAsientoContable = new GridBagLayout();	
			this.jContentPaneDetalleEstadoAsientoContable.setLayout(gridaBagLayoutDetalleEstadoAsientoContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAsientoContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoAsientoContable.add(jTtoolBarDetalleEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoAsientoContable=   new JScrollPane(jContentPaneDetalleEstadoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	        
			this.jContentPaneDetalleEstadoAsientoContable.add(jPanelCamposEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);
			
			
			
			
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
						&& estadoasientocontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(this.puedeCargarPorParteParametroContabilidadDefecto,false,-1);
					
					if(this.estadoasientocontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoAsientoContable= new GridBagConstraints();
						this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
						this.jContentPaneDetalleEstadoAsientoContable.add(this.jTabbedPaneRelacionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoAsientoContable.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoAsientoContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
					this.gridBagConstraintsEstadoAsientoContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoAsientoContable.add(jPanelCamposOcultosEstadoAsientoContable, gridBagConstraintsEstadoAsientoContable);
				
					this.jPanelCamposOcultosEstadoAsientoContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	        this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoAsientoContable.add(this.jPanelAccionesFormularioEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);							
			
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
	        this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoAsientoContable.add(this.jPanelAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoAsientoContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoAsientoContable=   new JScrollPane(this.jPanelCamposEstadoAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
			this.gridBagConstraintsEstadoAsientoContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoAsientoContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoAsientoContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);			
			
			this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
			
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		
			
		this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsEstadoAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAsientoContable, this.gridBagConstraintsEstadoAsientoContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoAsientoContable;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoAsientoContable;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setparametrocontabilidaddefectoSessionBean(this.parametrocontabilidaddefectoSessionBean);

				//this.gridBagConstraintsEstadoAsientoContable = new GridBagConstraints();
				//this.gridBagConstraintsEstadoAsientoContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoAsientoContable.gridx = 0;
				//this.jContentPaneDetalleEstadoAsientoContable.add(this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoAsientoContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoAsientoContable.add("Parametro Contabilidad Defectos",this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoAsientoContable.setComponentAt(iIndexTab,this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroContabilidadDefecto) {
					this.jTabbedPaneRelacionesEstadoAsientoContable.add("Parametro Contabilidad Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroContabilidadDefectoBeanSwingJInternalFrame(List<EstadoAsientoContable> estadoasientocontables,EstadoAsientoContable estadoasientocontable,ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocontabilidaddefectoBeanSwingJInternalFrame.getParametroContabilidadDefectoLogic().setConnexion(this.estadoasientocontableLogic.getConnexion());

					parametrocontabilidaddefectoBeanSwingJInternalFrame.setestadoasientocontablesForeignKey(estadoasientocontables);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setestadoasientocontableForeignKey(estadoasientocontable);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoAsientoContable(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setlidEstadoAsientoContableActual(estadoasientocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocontabilidaddefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroContabilidadDefecto(parametrocontabilidaddefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoAsientoContable(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setid_estado_asiento_contableFK_IdEstadoAsientoContable(estadoasientocontable.getId());

					if(!this.conCargarFormDetalle) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoAsientoContableForeignKey(estadoasientocontable,1,false,true,true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocontabilidaddefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoAsientoContable");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoAsientoContable");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n",parametrocontabilidaddefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocontabilidaddefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("relacionado");
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroContabilidadDefecto().setVisible(false);

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
