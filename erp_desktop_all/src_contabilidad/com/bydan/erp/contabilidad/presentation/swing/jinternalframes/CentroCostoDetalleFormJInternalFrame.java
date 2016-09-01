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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.CentroCostoConstantesFunciones;

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
public class CentroCostoDetalleFormJInternalFrame extends CentroCostoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCentroCosto;
	
	protected JMenuBar jmenuBarDetalleCentroCosto;
	
	protected JMenu jmenuDetalleCentroCosto;
	protected JMenu jmenuDetalleArchivoCentroCosto;
	protected JMenu jmenuDetalleAccionesCentroCosto;
	protected JMenu jmenuDetalleDatosCentroCosto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCosto;	
	protected GridBagConstraints gridBagConstraintsCentroCosto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CentroCostoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCentroCosto;		
	
	public CentroCostoBeanSwingJInternalFrameTree jInternalFrameTreeCentroCosto;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoSessionBean centrocostoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CentroCostoLogic centrocostoLogic;
	
	public JScrollPane jScrollPanelDatosCentroCosto;
	public JScrollPane jScrollPanelDatosEdicionCentroCosto;
	public JScrollPane jScrollPanelDatosGeneralCentroCosto;
	
	protected JPanel jPanelCamposCentroCosto;    
	protected JPanel jPanelCamposOcultosCentroCosto;    	
	protected JPanel jPanelAccionesCentroCosto;
	protected JPanel jPanelAccionesFormularioCentroCosto;
    
	
	
	protected Integer iXPanelCamposCentroCosto=0;
	protected Integer iYPanelCamposCentroCosto=0;
	
	protected Integer iXPanelCamposOcultosCentroCosto=0;
	protected Integer iYPanelCamposOcultosCentroCosto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCentroCosto;
	public JButton jButtonModificarCentroCosto;
	public JButton jButtonActualizarCentroCosto;
    public JButton jButtonEliminarCentroCosto;
	public JButton jButtonCancelarCentroCosto;
    public JButton jButtonGuardarCambiosCentroCosto;
	public JButton jButtonGuardarCambiosTablaCentroCosto;
	protected JButton jButtonCerrarCentroCosto;
	
	
	protected JButton jButtonProcesarInformacionCentroCosto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCentroCosto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCentroCosto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCosto;
	protected JButton jButtonModificarToolBarCentroCosto;
	protected JButton jButtonActualizarToolBarCentroCosto;
    protected JButton jButtonEliminarToolBarCentroCosto;
	protected JButton jButtonCancelarToolBarCentroCosto;
    protected JButton jButtonGuardarCambiosToolBarCentroCosto;
	protected JButton jButtonGuardarCambiosTablaToolBarCentroCosto;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCosto;
	protected JButton jButtonCerrarToolBarCentroCosto;
	
	protected JButton jButtonProcesarInformacionToolBarCentroCosto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCosto;
	protected JMenuItem jMenuItemModificarCentroCosto;
	protected JMenuItem jMenuItemActualizarCentroCosto;
    protected JMenuItem jMenuItemEliminarCentroCosto;
	protected JMenuItem jMenuItemCancelarCentroCosto;
    protected JMenuItem jMenuItemGuardarCambiosCentroCosto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCosto;
	protected JMenuItem jMenuItemCerrarCentroCosto;
	protected JMenuItem jMenuItemDetalleCerrarCentroCosto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCosto;
	
	protected JMenuItem jMenuItemProcesarInformacionCentroCosto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCosto;
	protected JMenuItem jMenuItemMostrarOcultarCentroCosto;
	
	
	//MENU
	
	protected JButton jButtonArbolCentroCosto;	
	
	protected JLabel jLabelAccionesCentroCosto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCosto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCosto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCentroCosto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCentroCosto;
	public JLabel jLabelIdCentroCosto;
	public JLabel jLabelidCentroCosto;
	public JButton jButtonidCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCentroCosto;
	public JLabel jLabelcodigoCentroCosto;
	public JTextField jTextFieldcodigoCentroCosto;
	public JButton jButtoncodigoCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCentroCosto;
	public JLabel jLabelnombreCentroCosto;
	public JTextArea jTextAreanombreCentroCosto;
	public JScrollPane jscrollPanenombreCentroCosto;
	public JButton jButtonnombreCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeCentroCosto;
	public JLabel jLabelporcentajeCentroCosto;
	public JTextField jTextFieldporcentajeCentroCosto;
	public JButton jButtonporcentajeCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelvalorCentroCosto;
	public JLabel jLabelvalorCentroCosto;
	public JTextField jTextFieldvalorCentroCosto;
	public JButton jButtonvalorCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelordenCentroCosto;
	public JLabel jLabelordenCentroCosto;
	public JTextField jTextFieldordenCentroCosto;
	public JButton jButtonordenCentroCostoBusqueda= new JButtonMe();

	public JPanel jPaneles_finalCentroCosto;
	public JLabel jLabeles_finalCentroCosto;
	public JCheckBox jCheckBoxes_finalCentroCosto;
	public JButton jButtones_finalCentroCostoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCentroCosto;
	public JLabel jLabeldescripcionCentroCosto;
	public JTextArea jTextAreadescripcionCentroCosto;
	public JScrollPane jscrollPanedescripcionCentroCosto;
	public JButton jButtondescripcionCentroCostoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCentroCosto;
	public JLabel jLabelid_empresaCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCentroCosto;
	public JButton jButtonid_empresaCentroCosto= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoCentroCosto;
	public JLabel jLabelid_centro_costoCentroCosto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCentroCosto;
	public JButton jButtonid_centro_costoCentroCosto= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCentroCosto;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CentroCostoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCentroCosto=new JPanel();
				this.jPanelAccionesFormularioCentroCosto=new JPanel();
				this.jmenuBarDetalleCentroCosto=new JMenuBar();
				this.jTtoolBarDetalleCentroCosto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CentroCostoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCosto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCentroCosto() {
		return this.jButtonActualizarToolBarCentroCosto;
	}
	
	public JButton getjButtonEliminarToolBarCentroCosto() {
		return this.jButtonEliminarToolBarCentroCosto;
	}
	
	public JButton getjButtonCancelarToolBarCentroCosto() {
		return this.jButtonCancelarToolBarCentroCosto;
	}		
	
	public JButton getjButtonProcesarInformacionCentroCosto() {
		return this.jButtonProcesarInformacionCentroCosto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCosto)	{
		this.jButtonProcesarInformacionCentroCosto = jButtonProcesarInformacionCentroCosto;
	}
	
	
	public JButton getjButtonArbolCentroCosto() {
		return this.jButtonArbolCentroCosto;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCentroCosto)	{
		this.jButtonArbolCentroCosto = jButtonArbolCentroCosto;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCosto() {
		return this.jComboBoxTiposAccionesCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCosto(
			JComboBox jComboBoxTiposRelacionesCentroCosto) {
		this.jComboBoxTiposRelacionesCentroCosto = jComboBoxTiposRelacionesCentroCosto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCosto(
			JComboBox jComboBoxTiposAccionesCentroCosto) {
		this.jComboBoxTiposAccionesCentroCosto = jComboBoxTiposAccionesCentroCosto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCentroCosto() {
		return this.jComboBoxTiposAccionesFormularioCentroCosto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCentroCosto(
			JComboBox jComboBoxTiposAccionesFormularioCentroCosto) {
		this.jComboBoxTiposAccionesFormularioCentroCosto = jComboBoxTiposAccionesFormularioCentroCosto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.centrocostoSessionBean=new CentroCostoSessionBean();
		
		this.centrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
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
	
		CentroCostoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCentroCosto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCentroCosto=new JButtonMe();
				this.jButtonModificarToolBarCentroCosto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCentroCosto,this.jTtoolBarDetalleCentroCosto,
							"actualizar","actualizar","Actualizar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCentroCosto,this.jTtoolBarDetalleCentroCosto,
							"eliminar","eliminar","Eliminar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCentroCosto,this.jTtoolBarDetalleCentroCosto,
							"cancelar","cancelar","Cancelar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCentroCosto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCentroCosto,this.jTtoolBarDetalleCentroCosto,
							"guardarcambios","guardarcambios","Guardar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCentroCosto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCentroCosto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCentroCosto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCentroCosto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCentroCosto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCosto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCosto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCosto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCentroCosto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCentroCosto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCentroCosto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCentroCosto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCentroCosto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCentroCosto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCentroCosto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCentroCosto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCentroCosto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCentroCosto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCentroCosto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCentroCosto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCentroCosto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCosto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCosto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCentroCosto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCentroCosto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCentroCosto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCosto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCosto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCosto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCentroCosto.add(this.jMenuItemDetalleCerrarCentroCosto);
		
		this.jmenuDetalleAccionesCentroCosto.add(this.jMenuItemActualizarCentroCosto);
		this.jmenuDetalleAccionesCentroCosto.add(this.jMenuItemEliminarCentroCosto);
		this.jmenuDetalleAccionesCentroCosto.add(this.jMenuItemCancelarCentroCosto);		
		
		//this.jmenuDetalleDatosCentroCosto.add(this.jMenuItemDetalleAbrirOrderByCentroCosto);				
		this.jmenuDetalleDatosCentroCosto.add(this.jMenuItemDetalleMostarOcultarCentroCosto);				
				
		//this.jmenuDetalleAccionesCentroCosto.add(this.jMenuItemGuardarCambiosCentroCosto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCentroCosto.add(this.jmenuDetalleArchivoCentroCosto);		
		this.jmenuBarDetalleCentroCosto.add(this.jmenuDetalleAccionesCentroCosto);		
		this.jmenuBarDetalleCentroCosto.add(this.jmenuDetalleDatosCentroCosto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCentroCosto);				
	}
	
	
	public void inicializarElementosCamposCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCentroCosto = new JLabelMe();
		jLabelIdCentroCosto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCentroCosto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCentroCosto= new GridBagLayout();

		this.jPanelidCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);

		jLabelidCentroCosto = new JLabel();
		jLabelidCentroCosto.setText("Id");

		jLabelidCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCentroCosto = new JLabelMe();
		this.jLabelcodigoCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCentroCosto.setToolTipText("Codigo");
		this.jLabelcodigoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelcodigoCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextFieldcodigoCentroCosto= new JTextFieldMe();

		jTextFieldcodigoCentroCosto.setEnabled(false);
		jTextFieldcodigoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCentroCostoBusqueda= new JButtonMe();
		this.jButtoncodigoCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCentroCostoBusqueda.setText("U");
		this.jButtoncodigoCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelnombreCentroCosto = new JLabelMe();
		this.jLabelnombreCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCentroCosto.setToolTipText("Nombre");
		this.jLabelnombreCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelnombreCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextAreanombreCentroCosto= new JTextAreaMe();
		jTextAreanombreCentroCosto.setEnabled(false);
		jTextAreanombreCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroCosto.setLineWrap(true);
		jTextAreanombreCentroCosto.setWrapStyleWord(true);
		jTextAreanombreCentroCosto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCentroCosto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCentroCosto = new JScrollPane(jTextAreanombreCentroCosto);
		jscrollPanenombreCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreCentroCostoBusqueda= new JButtonMe();
		this.jButtonnombreCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCentroCostoBusqueda.setText("U");
		this.jButtonnombreCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeCentroCosto = new JLabelMe();
		this.jLabelporcentajeCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeCentroCosto.setToolTipText("Porcentaje");
		this.jLabelporcentajeCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelporcentajeCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextFieldporcentajeCentroCosto= new JTextFieldMe();
		jTextFieldporcentajeCentroCosto.setEnabled(false);
		jTextFieldporcentajeCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeCentroCosto.setText("0.0");

		this.jButtonporcentajeCentroCostoBusqueda= new JButtonMe();
		this.jButtonporcentajeCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeCentroCostoBusqueda.setText("U");
		this.jButtonporcentajeCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelvalorCentroCosto = new JLabelMe();
		this.jLabelvalorCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCentroCosto.setToolTipText("Valor");
		this.jLabelvalorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelvalorCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextFieldvalorCentroCosto= new JTextFieldMe();
		jTextFieldvalorCentroCosto.setEnabled(false);
		jTextFieldvalorCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCentroCosto.setText("0.0");

		this.jButtonvalorCentroCostoBusqueda= new JButtonMe();
		this.jButtonvalorCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCentroCostoBusqueda.setText("U");
		this.jButtonvalorCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabelordenCentroCosto = new JLabelMe();
		this.jLabelordenCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenCentroCosto.setToolTipText("Orden");
		this.jLabelordenCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelordenCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextFieldordenCentroCosto= new JTextFieldMe();
		jTextFieldordenCentroCosto.setEnabled(false);
		jTextFieldordenCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenCentroCosto.setText("0");

		this.jButtonordenCentroCostoBusqueda= new JButtonMe();
		this.jButtonordenCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenCentroCostoBusqueda.setText("U");
		this.jButtonordenCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabeles_finalCentroCosto = new JLabelMe();
		this.jLabeles_finalCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_ESFINAL+" : *");
		this.jLabeles_finalCentroCosto.setToolTipText("Es Final");
		this.jLabeles_finalCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_finalCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_finalCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_finalCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_finalCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_finalCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_ESFINAL);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPaneles_finalCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jCheckBoxes_finalCentroCosto= new JCheckBoxMe();
		jCheckBoxes_finalCentroCosto.setEnabled(false);

		jCheckBoxes_finalCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_finalCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_finalCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_finalCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_finalCentroCostoBusqueda= new JButtonMe();
		this.jButtones_finalCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_finalCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_finalCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_finalCentroCostoBusqueda.setText("U");
		this.jButtones_finalCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_finalCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_finalCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_finalCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_finalCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_finalCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_finalCentroCostoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCentroCosto = new JLabelMe();
		this.jLabeldescripcionCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCentroCosto.setToolTipText("Descripcion");
		this.jLabeldescripcionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPaneldescripcionCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jTextAreadescripcionCentroCosto= new JTextAreaMe();
		jTextAreadescripcionCentroCosto.setEnabled(false);
		jTextAreadescripcionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCentroCosto.setLineWrap(true);
		jTextAreadescripcionCentroCosto.setWrapStyleWord(true);
		jTextAreadescripcionCentroCosto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCentroCosto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCentroCosto = new JScrollPane(jTextAreadescripcionCentroCosto);
		jscrollPanedescripcionCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionCentroCostoBusqueda= new JButtonMe();
		this.jButtondescripcionCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCentroCostoBusqueda.setText("U");
		this.jButtondescripcionCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCentroCostoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCentroCosto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCentroCosto = new JLabelMe();
		this.jLabelid_empresaCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCentroCosto.setToolTipText("Empresa");
		this.jLabelid_empresaCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelid_empresaCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jComboBoxid_empresaCentroCosto= new JComboBoxMe();
		jComboBoxid_empresaCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCentroCosto.setEnabled(false);

		this.jButtonid_empresaCentroCosto= new JButtonMe();
		this.jButtonid_empresaCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCosto.setText("Buscar");
		this.jButtonid_empresaCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCosto"));

		this.jButtonid_empresaCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_empresaCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoBusqueda.setText("U");
		this.jButtonid_empresaCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCentroCostoUpdate= new JButtonMe();
		this.jButtonid_empresaCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoUpdate.setText("U");
		this.jButtonid_empresaCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoUpdate"));



					
		this.jLabelid_centro_costoCentroCosto = new JLabelMe();
		this.jLabelid_centro_costoCentroCosto.setText(""+CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoCentroCosto.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCentroCosto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCentroCosto.setToolTipText(CentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCentroCosto = new GridBagLayout();
		this.jPanelid_centro_costoCentroCosto.setLayout(this.gridaBagLayoutCentroCosto);


		jComboBoxid_centro_costoCentroCosto= new JComboBoxMe();
		jComboBoxid_centro_costoCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCentroCosto= new JButtonMe();
		this.jButtonid_centro_costoCentroCosto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCosto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCosto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCosto.setText("Buscar");
		this.jButtonid_centro_costoCentroCosto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCentroCosto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCosto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCosto"));

		this.jButtonid_centro_costoCentroCostoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoBusqueda.setText("U");
		this.jButtonid_centro_costoCentroCostoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCentroCostoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoBusqueda"));

		if(this.centrocostoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCentroCostoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCentroCostoUpdate= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoUpdate.setText("U");
		this.jButtonid_centro_costoCentroCostoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCentroCostoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoUpdate"));


		jButtonid_centro_costoCentroCostoArbol= new JButtonMe();
		jButtonid_centro_costoCentroCostoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoArbol.setText("Arbol");
		jButtonid_centro_costoCentroCostoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCentroCostoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoArbol"));



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
		//this.jInternalFrameDetalleCentroCosto = new CentroCostoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Centro Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCosto= new GridBagLayout();
		

		
		String sToolTipCentroCosto="";
		sToolTipCentroCosto=CentroCostoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCosto+="(Contabilidad.CentroCosto)";
		}
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCosto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCentroCosto = new JButtonMe();
		this.jButtonModificarCentroCosto = new JButtonMe();
        this.jButtonActualizarCentroCosto = new JButtonMe();
        this.jButtonEliminarCentroCosto = new JButtonMe();
        this.jButtonCancelarCentroCosto = new JButtonMe();
        this.jButtonGuardarCambiosCentroCosto = new JButtonMe();
		this.jButtonGuardarCambiosTablaCentroCosto = new JButtonMe();
		this.jButtonCerrarCentroCosto = new JButtonMe();
		
		this.jScrollPanelDatosCentroCosto = new JScrollPane();   
        this.jScrollPanelDatosEdicionCentroCosto = new JScrollPane();
		this.jScrollPanelDatosGeneralCentroCosto = new JScrollPane();
				
		
		
		this.jPanelCamposCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo";
		
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCosto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCentroCosto.setName("jPanelCamposCentroCosto"); 

		this.jPanelCamposOcultosCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCentroCosto.setName("jPanelCamposOcultosCentroCosto"); 

        this.jPanelAccionesCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesCentroCosto.setName("Acciones"); 

		this.jPanelAccionesFormularioCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCentroCosto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCentroCosto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCentroCosto.setText("Nuevo");
		this.jButtonModificarCentroCosto.setText("Editar");
        this.jButtonActualizarCentroCosto.setText("Actualizar");
        this.jButtonEliminarCentroCosto.setText("Eliminar");
        this.jButtonCancelarCentroCosto.setText("Cancelar");
        this.jButtonGuardarCambiosCentroCosto.setText("Guardar");
		this.jButtonGuardarCambiosTablaCentroCosto.setText("Guardar");
		this.jButtonCerrarCentroCosto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCosto,"nuevo_button","Nuevo",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCentroCosto,"modificar_button","Editar",this.centrocostoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCentroCosto,"actualizar_button","Actualizar",this.centrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCentroCosto,"eliminar_button","Eliminar",this.centrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCentroCosto,"cancelar_button","Cancelar",this.centrocostoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCentroCosto,"guardarcambios_button","Guardar",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCosto,"guardarcambiostabla_button","Guardar",this.centrocostoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCosto,"cerrar_button","Salir",this.centrocostoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCentroCosto.setToolTipText("Nuevo"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCentroCosto.setToolTipText("Editar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCentroCosto.setToolTipText("Actualizar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCentroCosto.setToolTipText("Eliminar)"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCentroCosto.setToolTipText("Cancelar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCentroCosto.setToolTipText("Guardar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCentroCosto.setToolTipText("Guardar"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCosto.setToolTipText("Salir"+" "+CentroCostoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCosto";
		inputMap = this.jButtonNuevoCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCosto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCosto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCentroCosto";
		inputMap = this.jButtonActualizarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCentroCosto"));
		
		//ELIMINAR
		sMapKey = "EliminarCentroCosto";
		inputMap = this.jButtonEliminarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCentroCosto"));
		
		//CANCELAR	
		sMapKey = "CancelarCentroCosto";
		inputMap = this.jButtonCancelarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCentroCosto"));
		
		//CERRAR		
		sMapKey = "CerrarCentroCosto";
		inputMap = this.jButtonCerrarCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCosto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCosto";
		inputMap = this.jButtonGuardarCambiosTablaCentroCosto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCosto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCosto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCentroCosto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCentroCosto.setToolTipText("Nuevo CentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCentroCosto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCentroCosto.setToolTipText("Sin Cerrar Ventana CentroCosto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCentroCosto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCentroCosto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCentroCosto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolCentroCosto = new JButtonMe();
		this.jButtonArbolCentroCosto.setText("Arbol");		
		this.jButtonArbolCentroCosto.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCosto.setText("Accion");
		this.jComboBoxTiposAccionesCentroCosto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCentroCosto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCentroCosto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCentroCosto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCentroCosto = new JLabelMe();
		
		this.jLabelAccionesCentroCosto.setText("Acciones");		
		this.jLabelAccionesCentroCosto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCosto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCosto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCentroCosto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCentroCosto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCentroCosto=new JTabbedPane();
		this.jTabbedPaneRelacionesCentroCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCentroCosto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolCentroCosto.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCentroCosto.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCentroCosto.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesCentroCosto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCosto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCosto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCosto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCentroCosto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCosto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCosto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCentroCosto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCentroCosto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCentroCosto = new GridBagLayout();
		
		this.jPanelCamposCentroCosto.setLayout(gridaBagLayoutCamposCentroCosto);
		this.jPanelCamposOcultosCentroCosto.setLayout(gridaBagLayoutCamposOcultosCentroCosto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCentroCosto.add(jLabelIdCentroCosto, this.gridBagConstraintsCentroCosto);



	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCentroCosto.add(jLabelidCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCentroCosto.add(jLabelid_empresaCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCosto.add(jButtonid_empresaCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 3;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCosto.add(jButtonid_empresaCentroCostoUpdate, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCentroCosto.add(jComboBoxid_empresaCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCentroCosto.add(jLabelcodigoCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCentroCosto.add(jButtoncodigoCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCentroCosto.add(jTextFieldcodigoCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCentroCosto.add(jLabelnombreCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCentroCosto.add(jButtonnombreCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCentroCosto.add(jscrollPanenombreCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCentroCosto.add(jLabelid_centro_costoCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 2;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCosto.add(jButtonid_centro_costoCentroCosto, this.gridBagConstraintsCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 3;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCosto.add(jButtonid_centro_costoCentroCostoArbol, this.gridBagConstraintsCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 4;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCosto.add(jButtonid_centro_costoCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 5;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCosto.add(jButtonid_centro_costoCentroCostoUpdate, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCentroCosto.add(jComboBoxid_centro_costoCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeCentroCosto.add(jLabelporcentajeCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeCentroCosto.add(jButtonporcentajeCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeCentroCosto.add(jTextFieldporcentajeCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCentroCosto.add(jLabelvalorCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCentroCosto.add(jButtonvalorCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCentroCosto.add(jTextFieldvalorCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenCentroCosto.add(jLabelordenCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenCentroCosto.add(jButtonordenCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenCentroCosto.add(jTextFieldordenCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_finalCentroCosto.add(jLabeles_finalCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_finalCentroCosto.add(jButtones_finalCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_finalCentroCosto.add(jCheckBoxes_finalCentroCosto, this.gridBagConstraintsCentroCosto);


	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 0;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCentroCosto.add(jLabeldescripcionCentroCosto, this.gridBagConstraintsCentroCosto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		//this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = 2;
		this.gridBagConstraintsCentroCosto.ipadx = 0;
		this.gridBagConstraintsCentroCosto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCentroCosto.add(jButtondescripcionCentroCostoBusqueda, this.gridBagConstraintsCentroCosto);
	}

	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCosto.gridy = 0;
	this.gridBagConstraintsCentroCosto.gridx = 1;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCentroCosto.add(jscrollPanedescripcionCentroCosto, this.gridBagConstraintsCentroCosto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelidCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelcodigoCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelnombreCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelid_centro_costoCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelporcentajeCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelvalorCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPanelordenCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPaneles_finalCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCosto.add(this.jPaneldescripcionCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposCentroCosto % 1==0) {
		iXPanelCamposCentroCosto=0;
		iYPanelCamposCentroCosto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCosto.gridy = iYPanelCamposOcultosCentroCosto;
	this.gridBagConstraintsCentroCosto.gridx = iXPanelCamposOcultosCentroCosto++;
	this.gridBagConstraintsCentroCosto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCosto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCosto.add(this.jPanelid_empresaCentroCosto, this.gridBagConstraintsCentroCosto);



	if(iXPanelCamposOcultosCentroCosto % 1==0) {
		iXPanelCamposOcultosCentroCosto=0;
		iYPanelCamposOcultosCentroCosto++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesCentroCosto= new GridBagLayout();
		this.jPanelAccionesCentroCosto.setLayout(gridaBagLayoutAccionesCentroCosto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCentroCosto= new GridBagLayout();
		this.jPanelAccionesFormularioCentroCosto.setLayout(gridaBagLayoutAccionesFormularioCentroCosto);
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCosto.add(this.jComboBoxTiposAccionesFormularioCentroCosto, this.gridBagConstraintsCentroCosto);

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCosto.add(this.jCheckBoxPostAccionNuevoCentroCosto, this.gridBagConstraintsCentroCosto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.centrocostoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCosto.add(this.jCheckBoxPostAccionSinCerrarCentroCosto, this.gridBagConstraintsCentroCosto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.centrocostoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.centrocostoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCosto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCosto.add(this.jCheckBoxPostAccionSinMensajeCentroCosto, this.gridBagConstraintsCentroCosto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx = iPosXAccion++;
			
		this.jPanelAccionesCentroCosto.add(this.jButtonModificarCentroCosto, this.gridBagConstraintsCentroCosto);							

		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCosto.gridy = 0;
		this.gridBagConstraintsCentroCosto.gridx =iPosXAccion++;
			
		this.jPanelAccionesCentroCosto.add(this.jButtonEliminarCentroCosto, this.gridBagConstraintsCentroCosto);
		
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = 0;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCosto.add(this.jButtonActualizarCentroCosto, this.gridBagConstraintsCentroCosto);


		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = 0;		
		this.gridBagConstraintsCentroCosto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCosto.add(this.jButtonGuardarCambiosCentroCosto, this.gridBagConstraintsCentroCosto);	
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = 0;		
		this.gridBagConstraintsCentroCosto.gridx =iPosXAccion++;
		
		this.jPanelAccionesCentroCosto.add(this.jButtonCancelarCentroCosto, this.gridBagConstraintsCentroCosto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCosto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCosto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();						
			this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCosto.gridx = 0;		
			//this.gridBagConstraintsCentroCosto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCosto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCosto.gridx =0;
		this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCosto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCosto, this.gridBagConstraintsCentroCosto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCentroCosto = new CentroCostoBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCentroCosto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCentroCosto.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCentroCosto.setTitle("Centro Costo ARBOL");
		this.jInternalFrameTreeCentroCosto.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCentroCosto.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCentroCosto.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCentroCosto.setResizable(true);
	    this.jInternalFrameTreeCentroCosto.setClosable(true);
	    this.jInternalFrameTreeCentroCosto.setMaximizable(true);
			
			
		//if(CentroCostoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCentroCosto = new CentroCostoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Centro Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Centro Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CentroCostoModel centrocostoModel=new CentroCostoModel(this);
			
			//SI USARA CLASE INTERNA
			//CentroCostoModel.CentroCostoFocusTraversalPolicy centrocostoFocusTraversalPolicy = centrocostoModel.new CentroCostoFocusTraversalPolicy(this);
			
			//centrocostoFocusTraversalPolicy.setcentrocostoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(centrocostoModel);
			
			
			this.jContentPaneDetalleCentroCosto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCentroCosto = new GridBagLayout();	
			this.jContentPaneDetalleCentroCosto.setLayout(gridaBagLayoutDetalleCentroCosto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCosto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCentroCosto = new GridBagConstraints();
				this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCentroCosto.gridx = 0;
					
				
				this.jContentPaneDetalleCentroCosto.add(jTtoolBarDetalleCentroCosto, gridBagConstraintsCentroCosto);								
				
}
			
			this.jScrollPanelDatosEdicionCentroCosto=   new JScrollPane(jContentPaneDetalleCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCentroCosto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCentroCosto.gridx = 0;
	        
			this.jContentPaneDetalleCentroCosto.add(jPanelCamposCentroCosto, gridBagConstraintsCentroCosto);
			
			
			
			
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
						&& centrocostoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.centrocostoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCentroCosto= new GridBagConstraints();
						this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCentroCosto.gridx = 0;
						this.jContentPaneDetalleCentroCosto.add(this.jTabbedPaneRelacionesCentroCosto, this.gridBagConstraintsCentroCosto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCentroCosto.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCentroCosto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCentroCosto = new GridBagConstraints();
					this.gridBagConstraintsCentroCosto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCentroCosto.gridx = 0;
					
				
					this.jContentPaneDetalleCentroCosto.add(jPanelCamposOcultosCentroCosto, gridBagConstraintsCentroCosto);
				
					this.jPanelCamposOcultosCentroCosto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCentroCosto.gridx = 0;
	        this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCentroCosto.add(this.jPanelAccionesFormularioCentroCosto, this.gridBagConstraintsCentroCosto);							
			
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
	        this.gridBagConstraintsCentroCosto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCentroCosto.gridx = 0;
	        
			
			this.jContentPaneDetalleCentroCosto.add(this.jPanelAccionesCentroCosto, this.gridBagConstraintsCentroCosto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCentroCosto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCentroCosto=   new JScrollPane(this.jPanelCamposCentroCosto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCosto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCosto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCosto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCentroCosto.gridx = 0;
			this.gridBagConstraintsCentroCosto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCentroCosto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCentroCosto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCentroCosto, this.gridBagConstraintsCentroCosto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCentroCosto, this.gridBagConstraintsCentroCosto);			
			
			this.gridBagConstraintsCentroCosto = new GridBagConstraints();
			this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCosto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCentroCosto, this.gridBagConstraintsCentroCosto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCosto, this.gridBagConstraintsCentroCosto);
			
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCosto, this.gridBagConstraintsCentroCosto);
		
			
		this.gridBagConstraintsCentroCosto = new GridBagConstraints();
		this.gridBagConstraintsCentroCosto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCosto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCosto, this.gridBagConstraintsCentroCosto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCentroCosto;//jContentPane;
		
		return jScrollPanelDatosEdicionCentroCosto;
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
