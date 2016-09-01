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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoProformaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoProformaDetalleFormJInternalFrame extends EstadoProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoProforma;
	
	protected JMenuBar jmenuBarDetalleEstadoProforma;
	
	protected JMenu jmenuDetalleEstadoProforma;
	protected JMenu jmenuDetalleArchivoEstadoProforma;
	protected JMenu jmenuDetalleAccionesEstadoProforma;
	protected JMenu jmenuDetalleDatosEstadoProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoProforma;	
	protected GridBagConstraints gridBagConstraintsEstadoProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ColorGeneralBeanSwingJInternalFrame colorgeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_colorgeneral="";
	
	public EstadoProformaSessionBean estadoproformaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ColorGeneralSessionBean colorgeneralSessionBean;	
	
	public EstadoProformaLogic estadoproformaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoProforma;
	public JScrollPane jScrollPanelDatosEdicionEstadoProforma;
	public JScrollPane jScrollPanelDatosGeneralEstadoProforma;
	
	protected JPanel jPanelCamposEstadoProforma;    
	protected JPanel jPanelCamposOcultosEstadoProforma;    	
	protected JPanel jPanelAccionesEstadoProforma;
	protected JPanel jPanelAccionesFormularioEstadoProforma;
    
	
	
	protected Integer iXPanelCamposEstadoProforma=0;
	protected Integer iYPanelCamposEstadoProforma=0;
	
	protected Integer iXPanelCamposOcultosEstadoProforma=0;
	protected Integer iYPanelCamposOcultosEstadoProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoProforma;
	public JButton jButtonModificarEstadoProforma;
	public JButton jButtonActualizarEstadoProforma;
    public JButton jButtonEliminarEstadoProforma;
	public JButton jButtonCancelarEstadoProforma;
    public JButton jButtonGuardarCambiosEstadoProforma;
	public JButton jButtonGuardarCambiosTablaEstadoProforma;
	protected JButton jButtonCerrarEstadoProforma;
	
	
	protected JButton jButtonProcesarInformacionEstadoProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoProforma;
	protected JButton jButtonModificarToolBarEstadoProforma;
	protected JButton jButtonActualizarToolBarEstadoProforma;
    protected JButton jButtonEliminarToolBarEstadoProforma;
	protected JButton jButtonCancelarToolBarEstadoProforma;
    protected JButton jButtonGuardarCambiosToolBarEstadoProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoProforma;
	protected JButton jButtonCerrarToolBarEstadoProforma;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoProforma;
	protected JMenuItem jMenuItemModificarEstadoProforma;
	protected JMenuItem jMenuItemActualizarEstadoProforma;
    protected JMenuItem jMenuItemEliminarEstadoProforma;
	protected JMenuItem jMenuItemCancelarEstadoProforma;
    protected JMenuItem jMenuItemGuardarCambiosEstadoProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoProforma;
	protected JMenuItem jMenuItemCerrarEstadoProforma;
	protected JMenuItem jMenuItemDetalleCerrarEstadoProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoProforma;
	protected JMenuItem jMenuItemMostrarOcultarEstadoProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoProforma;
	public JLabel jLabelIdEstadoProforma;
	public JLabel jLabelidEstadoProforma;
	public JButton jButtonidEstadoProformaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoProforma;
	public JLabel jLabelcodigoEstadoProforma;
	public JTextField jTextFieldcodigoEstadoProforma;
	public JButton jButtoncodigoEstadoProformaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoProforma;
	public JLabel jLabelnombreEstadoProforma;
	public JTextArea jTextAreanombreEstadoProforma;
	public JScrollPane jscrollPanenombreEstadoProforma;
	public JButton jButtonnombreEstadoProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadoProforma;
	public JLabel jLabelid_empresaEstadoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadoProforma;
	public JButton jButtonid_empresaEstadoProforma= new JButtonMe();
	public JButton jButtonid_empresaEstadoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_color_generalEstadoProforma;
	public JLabel jLabelid_color_generalEstadoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_color_generalEstadoProforma;
	public JButton jButtonid_color_generalEstadoProforma= new JButtonMe();
	public JButton jButtonid_color_generalEstadoProformaUpdate= new JButtonMe();
	public JButton jButtonid_color_generalEstadoProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoProforma;
	
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
	
	public EstadoProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoProforma=new JPanel();
				this.jPanelAccionesFormularioEstadoProforma=new JPanel();
				this.jmenuBarDetalleEstadoProforma=new JMenuBar();
				this.jTtoolBarDetalleEstadoProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoProforma() {
		return this.jButtonActualizarToolBarEstadoProforma;
	}
	
	public JButton getjButtonEliminarToolBarEstadoProforma() {
		return this.jButtonEliminarToolBarEstadoProforma;
	}
	
	public JButton getjButtonCancelarToolBarEstadoProforma() {
		return this.jButtonCancelarToolBarEstadoProforma;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoProforma() {
		return this.jButtonProcesarInformacionEstadoProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoProforma)	{
		this.jButtonProcesarInformacionEstadoProforma = jButtonProcesarInformacionEstadoProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoProforma() {
		return this.jComboBoxTiposAccionesEstadoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoProforma(
			JComboBox jComboBoxTiposRelacionesEstadoProforma) {
		this.jComboBoxTiposRelacionesEstadoProforma = jComboBoxTiposRelacionesEstadoProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoProforma(
			JComboBox jComboBoxTiposAccionesEstadoProforma) {
		this.jComboBoxTiposAccionesEstadoProforma = jComboBoxTiposAccionesEstadoProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoProforma() {
		return this.jComboBoxTiposAccionesFormularioEstadoProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoProforma(
			JComboBox jComboBoxTiposAccionesFormularioEstadoProforma) {
		this.jComboBoxTiposAccionesFormularioEstadoProforma = jComboBoxTiposAccionesFormularioEstadoProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoproformaSessionBean=new EstadoProformaSessionBean();
		
		this.estadoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoProforma=new JButtonMe();
				this.jButtonModificarToolBarEstadoProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma,
							"actualizar","actualizar","Actualizar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma,
							"eliminar","eliminar","Eliminar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma,
							"cancelar","cancelar","Cancelar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoProforma,this.jTtoolBarDetalleEstadoProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoProforma.add(this.jMenuItemDetalleCerrarEstadoProforma);
		
		this.jmenuDetalleAccionesEstadoProforma.add(this.jMenuItemActualizarEstadoProforma);
		this.jmenuDetalleAccionesEstadoProforma.add(this.jMenuItemEliminarEstadoProforma);
		this.jmenuDetalleAccionesEstadoProforma.add(this.jMenuItemCancelarEstadoProforma);		
		
		//this.jmenuDetalleDatosEstadoProforma.add(this.jMenuItemDetalleAbrirOrderByEstadoProforma);				
		this.jmenuDetalleDatosEstadoProforma.add(this.jMenuItemDetalleMostarOcultarEstadoProforma);				
				
		//this.jmenuDetalleAccionesEstadoProforma.add(this.jMenuItemGuardarCambiosEstadoProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoProforma.add(this.jmenuDetalleArchivoEstadoProforma);		
		this.jmenuBarDetalleEstadoProforma.add(this.jmenuDetalleAccionesEstadoProforma);		
		this.jmenuBarDetalleEstadoProforma.add(this.jmenuDetalleDatosEstadoProforma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoProforma);				
	}
	
	
	public void inicializarElementosCamposEstadoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoProforma = new JLabelMe();
		jLabelIdEstadoProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoProforma.setToolTipText(EstadoProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoProforma= new GridBagLayout();

		this.jPanelidEstadoProforma.setLayout(this.gridaBagLayoutEstadoProforma);

		jLabelidEstadoProforma = new JLabel();
		jLabelidEstadoProforma.setText("Id");

		jLabelidEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoProforma = new JLabelMe();
		this.jLabelcodigoEstadoProforma.setText(""+EstadoProformaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoProforma.setToolTipText("Codigo");
		this.jLabelcodigoEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoProforma.setToolTipText(EstadoProformaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoProforma = new GridBagLayout();
		this.jPanelcodigoEstadoProforma.setLayout(this.gridaBagLayoutEstadoProforma);


		jTextFieldcodigoEstadoProforma= new JTextFieldMe();

		jTextFieldcodigoEstadoProforma.setEnabled(false);
		jTextFieldcodigoEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoProformaBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoProformaBusqueda.setText("U");
		this.jButtoncodigoEstadoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoProformaBusqueda"));

		if(this.estadoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoProformaBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoProforma = new JLabelMe();
		this.jLabelnombreEstadoProforma.setText(""+EstadoProformaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoProforma.setToolTipText("Nombre");
		this.jLabelnombreEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoProforma.setToolTipText(EstadoProformaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoProforma = new GridBagLayout();
		this.jPanelnombreEstadoProforma.setLayout(this.gridaBagLayoutEstadoProforma);


		jTextAreanombreEstadoProforma= new JTextAreaMe();
		jTextAreanombreEstadoProforma.setEnabled(false);
		jTextAreanombreEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoProforma.setLineWrap(true);
		jTextAreanombreEstadoProforma.setWrapStyleWord(true);
		jTextAreanombreEstadoProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoProforma = new JScrollPane(jTextAreanombreEstadoProforma);
		jscrollPanenombreEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoProformaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoProformaBusqueda.setText("U");
		this.jButtonnombreEstadoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoProformaBusqueda"));

		if(this.estadoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadoProforma = new JLabelMe();
		this.jLabelid_empresaEstadoProforma.setText(""+EstadoProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadoProforma.setToolTipText("Empresa");
		this.jLabelid_empresaEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadoProforma.setToolTipText(EstadoProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadoProforma = new GridBagLayout();
		this.jPanelid_empresaEstadoProforma.setLayout(this.gridaBagLayoutEstadoProforma);


		jComboBoxid_empresaEstadoProforma= new JComboBoxMe();
		jComboBoxid_empresaEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadoProforma.setEnabled(false);

		this.jButtonid_empresaEstadoProforma= new JButtonMe();
		this.jButtonid_empresaEstadoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoProforma.setText("Buscar");
		this.jButtonid_empresaEstadoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoProforma"));

		this.jButtonid_empresaEstadoProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoProformaBusqueda.setText("U");
		this.jButtonid_empresaEstadoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoProformaBusqueda"));

		if(this.estadoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadoProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadoProformaUpdate= new JButtonMe();
		this.jButtonid_empresaEstadoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoProformaUpdate.setText("U");
		this.jButtonid_empresaEstadoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoProformaUpdate"));



					
		this.jLabelid_color_generalEstadoProforma = new JLabelMe();
		this.jLabelid_color_generalEstadoProforma.setText(""+EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL+" : *");
		this.jLabelid_color_generalEstadoProforma.setToolTipText("Idcolor General");
		this.jLabelid_color_generalEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_color_generalEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_color_generalEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_color_generalEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_color_generalEstadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_color_generalEstadoProforma.setToolTipText(EstadoProformaConstantesFunciones.LABEL_IDCOLORGENERAL);
		this.gridaBagLayoutEstadoProforma = new GridBagLayout();
		this.jPanelid_color_generalEstadoProforma.setLayout(this.gridaBagLayoutEstadoProforma);


		jComboBoxid_color_generalEstadoProforma= new JComboBoxMe();
		jComboBoxid_color_generalEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_color_generalEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_color_generalEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_color_generalEstadoProforma= new JButtonMe();
		this.jButtonid_color_generalEstadoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_color_generalEstadoProforma.setText("Buscar");
		this.jButtonid_color_generalEstadoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_color_generalEstadoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_color_generalEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoProforma"));

		this.jButtonid_color_generalEstadoProformaBusqueda= new JButtonMe();
		this.jButtonid_color_generalEstadoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoProformaBusqueda.setText("U");
		this.jButtonid_color_generalEstadoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_color_generalEstadoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_color_generalEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoProformaBusqueda"));

		if(this.estadoproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_color_generalEstadoProformaBusqueda.setVisible(false);		}

		this.jButtonid_color_generalEstadoProformaUpdate= new JButtonMe();
		this.jButtonid_color_generalEstadoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_color_generalEstadoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_color_generalEstadoProformaUpdate.setText("U");
		this.jButtonid_color_generalEstadoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_color_generalEstadoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_color_generalEstadoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_color_generalEstadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_color_generalEstadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_color_generalEstadoProformaUpdate"));



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
		//this.jInternalFrameDetalleEstadoProforma = new EstadoProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoProforma= new GridBagLayout();
		

		
		String sToolTipEstadoProforma="";
		sToolTipEstadoProforma=EstadoProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoProforma+="(Facturacion.EstadoProforma)";
		}
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoProforma = new JButtonMe();
		this.jButtonModificarEstadoProforma = new JButtonMe();
        this.jButtonActualizarEstadoProforma = new JButtonMe();
        this.jButtonEliminarEstadoProforma = new JButtonMe();
        this.jButtonCancelarEstadoProforma = new JButtonMe();
        this.jButtonGuardarCambiosEstadoProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoProforma = new JButtonMe();
		this.jButtonCerrarEstadoProforma = new JButtonMe();
		
		this.jScrollPanelDatosEstadoProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoProforma = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Proforma";
		
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoProforma.setName("jPanelCamposEstadoProforma"); 

		this.jPanelCamposOcultosEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoProforma.setName("jPanelCamposOcultosEstadoProforma"); 

        this.jPanelAccionesEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoProforma.setToolTipText("Acciones");
        this.jPanelAccionesEstadoProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoProforma.setText("Nuevo");
		this.jButtonModificarEstadoProforma.setText("Editar");
        this.jButtonActualizarEstadoProforma.setText("Actualizar");
        this.jButtonEliminarEstadoProforma.setText("Eliminar");
        this.jButtonCancelarEstadoProforma.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoProforma.setText("Guardar");
		this.jButtonCerrarEstadoProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoProforma,"nuevo_button","Nuevo",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoProforma,"modificar_button","Editar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoProforma,"actualizar_button","Actualizar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoProforma,"eliminar_button","Eliminar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoProforma,"cancelar_button","Cancelar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoProforma,"guardarcambios_button","Guardar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoProforma,"guardarcambiostabla_button","Guardar",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoProforma,"cerrar_button","Salir",this.estadoproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoProforma.setToolTipText("Nuevo"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoProforma.setToolTipText("Editar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoProforma.setToolTipText("Actualizar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoProforma.setToolTipText("Eliminar)"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoProforma.setToolTipText("Cancelar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoProforma.setToolTipText("Guardar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoProforma.setToolTipText("Guardar"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoProforma.setToolTipText("Salir"+" "+EstadoProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoProforma";
		inputMap = this.jButtonNuevoEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoProforma";
		inputMap = this.jButtonActualizarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoProforma";
		inputMap = this.jButtonEliminarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoProforma";
		inputMap = this.jButtonCancelarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoProforma"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoProforma";
		inputMap = this.jButtonCerrarEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoProforma";
		inputMap = this.jButtonGuardarCambiosTablaEstadoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoProforma.setToolTipText("Nuevo EstadoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoProforma.setToolTipText("Sin Cerrar Ventana EstadoProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoProforma.setText("Accion");
		this.jComboBoxTiposAccionesEstadoProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoProforma = new JLabelMe();
		
		this.jLabelAccionesEstadoProforma.setText("Acciones");		
		this.jLabelAccionesEstadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoProforma = new GridBagLayout();
		
		this.jPanelCamposEstadoProforma.setLayout(gridaBagLayoutCamposEstadoProforma);
		this.jPanelCamposOcultosEstadoProforma.setLayout(gridaBagLayoutCamposOcultosEstadoProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 0;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoProforma.add(jLabelIdEstadoProforma, this.gridBagConstraintsEstadoProforma);



	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 1;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoProforma.add(jLabelidEstadoProforma, this.gridBagConstraintsEstadoProforma);


	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 0;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadoProforma.add(jLabelid_empresaEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 2;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoProforma.add(jButtonid_empresaEstadoProformaBusqueda, this.gridBagConstraintsEstadoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 3;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoProforma.add(jButtonid_empresaEstadoProformaUpdate, this.gridBagConstraintsEstadoProforma);
	}

	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 1;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadoProforma.add(jComboBoxid_empresaEstadoProforma, this.gridBagConstraintsEstadoProforma);


	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 0;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoProforma.add(jLabelcodigoEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 2;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoProforma.add(jButtoncodigoEstadoProformaBusqueda, this.gridBagConstraintsEstadoProforma);
	}

	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 1;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoProforma.add(jTextFieldcodigoEstadoProforma, this.gridBagConstraintsEstadoProforma);


	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 0;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoProforma.add(jLabelnombreEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 2;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoProforma.add(jButtonnombreEstadoProformaBusqueda, this.gridBagConstraintsEstadoProforma);
	}

	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 1;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoProforma.add(jscrollPanenombreEstadoProforma, this.gridBagConstraintsEstadoProforma);


	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 0;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_color_generalEstadoProforma.add(jLabelid_color_generalEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 2;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoProforma.add(jButtonid_color_generalEstadoProformaBusqueda, this.gridBagConstraintsEstadoProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = 3;
		this.gridBagConstraintsEstadoProforma.ipadx = 0;
		this.gridBagConstraintsEstadoProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_color_generalEstadoProforma.add(jButtonid_color_generalEstadoProformaUpdate, this.gridBagConstraintsEstadoProforma);
	}

	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoProforma.gridy = 0;
	this.gridBagConstraintsEstadoProforma.gridx = 1;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_color_generalEstadoProforma.add(jComboBoxid_color_generalEstadoProforma, this.gridBagConstraintsEstadoProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoProforma.gridy = iYPanelCamposEstadoProforma;
	this.gridBagConstraintsEstadoProforma.gridx = iXPanelCamposEstadoProforma++;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoProforma.add(this.jPanelidEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(iXPanelCamposEstadoProforma % 1==0) {
		iXPanelCamposEstadoProforma=0;
		iYPanelCamposEstadoProforma++;
	}
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoProforma.gridy = iYPanelCamposEstadoProforma;
	this.gridBagConstraintsEstadoProforma.gridx = iXPanelCamposEstadoProforma++;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoProforma.add(this.jPanelcodigoEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(iXPanelCamposEstadoProforma % 1==0) {
		iXPanelCamposEstadoProforma=0;
		iYPanelCamposEstadoProforma++;
	}
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoProforma.gridy = iYPanelCamposEstadoProforma;
	this.gridBagConstraintsEstadoProforma.gridx = iXPanelCamposEstadoProforma++;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoProforma.add(this.jPanelnombreEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(iXPanelCamposEstadoProforma % 1==0) {
		iXPanelCamposEstadoProforma=0;
		iYPanelCamposEstadoProforma++;
	}
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoProforma.gridy = iYPanelCamposEstadoProforma;
	this.gridBagConstraintsEstadoProforma.gridx = iXPanelCamposEstadoProforma++;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoProforma.add(this.jPanelid_color_generalEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(iXPanelCamposEstadoProforma % 1==0) {
		iXPanelCamposEstadoProforma=0;
		iYPanelCamposEstadoProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoProforma.gridy = iYPanelCamposOcultosEstadoProforma;
	this.gridBagConstraintsEstadoProforma.gridx = iXPanelCamposOcultosEstadoProforma++;
	this.gridBagConstraintsEstadoProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadoProforma.add(this.jPanelid_empresaEstadoProforma, this.gridBagConstraintsEstadoProforma);



	if(iXPanelCamposOcultosEstadoProforma % 1==0) {
		iXPanelCamposOcultosEstadoProforma=0;
		iYPanelCamposOcultosEstadoProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoProforma= new GridBagLayout();
		this.jPanelAccionesEstadoProforma.setLayout(gridaBagLayoutAccionesEstadoProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoProforma= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoProforma.setLayout(gridaBagLayoutAccionesFormularioEstadoProforma);
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoProforma.add(this.jComboBoxTiposAccionesFormularioEstadoProforma, this.gridBagConstraintsEstadoProforma);

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoProforma.add(this.jCheckBoxPostAccionNuevoEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoProforma.add(this.jCheckBoxPostAccionSinCerrarEstadoProforma, this.gridBagConstraintsEstadoProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoProforma.add(this.jCheckBoxPostAccionSinMensajeEstadoProforma, this.gridBagConstraintsEstadoProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoProforma.add(this.jButtonModificarEstadoProforma, this.gridBagConstraintsEstadoProforma);							

		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoProforma.gridy = 0;
		this.gridBagConstraintsEstadoProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoProforma.add(this.jButtonEliminarEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = 0;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoProforma.add(this.jButtonActualizarEstadoProforma, this.gridBagConstraintsEstadoProforma);


		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = 0;		
		this.gridBagConstraintsEstadoProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoProforma.add(this.jButtonGuardarCambiosEstadoProforma, this.gridBagConstraintsEstadoProforma);	
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = 0;		
		this.gridBagConstraintsEstadoProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoProforma.add(this.jButtonCancelarEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();						
			this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoProforma.gridx = 0;		
			//this.gridBagConstraintsEstadoProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoProforma.gridx =0;
		this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoProforma, this.gridBagConstraintsEstadoProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoProforma = new EstadoProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoProformaModel estadoproformaModel=new EstadoProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoProformaModel.EstadoProformaFocusTraversalPolicy estadoproformaFocusTraversalPolicy = estadoproformaModel.new EstadoProformaFocusTraversalPolicy(this);
			
			//estadoproformaFocusTraversalPolicy.setestadoproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoproformaModel);
			
			
			this.jContentPaneDetalleEstadoProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoProforma = new GridBagLayout();	
			this.jContentPaneDetalleEstadoProforma.setLayout(gridaBagLayoutDetalleEstadoProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoProforma.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoProforma.add(jTtoolBarDetalleEstadoProforma, gridBagConstraintsEstadoProforma);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoProforma=   new JScrollPane(jContentPaneDetalleEstadoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoProforma.gridx = 0;
	        
			this.jContentPaneDetalleEstadoProforma.add(jPanelCamposEstadoProforma, gridBagConstraintsEstadoProforma);
			
			
			
			
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
						&& estadoproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadoproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoProforma= new GridBagConstraints();
						this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoProforma.gridx = 0;
						this.jContentPaneDetalleEstadoProforma.add(this.jTabbedPaneRelacionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoProforma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
					this.gridBagConstraintsEstadoProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoProforma.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoProforma.add(jPanelCamposOcultosEstadoProforma, gridBagConstraintsEstadoProforma);
				
					this.jPanelCamposOcultosEstadoProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoProforma.gridx = 0;
	        this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoProforma.add(this.jPanelAccionesFormularioEstadoProforma, this.gridBagConstraintsEstadoProforma);							
			
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
	        this.gridBagConstraintsEstadoProforma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoProforma.add(this.jPanelAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoProforma=   new JScrollPane(this.jPanelCamposEstadoProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoProforma.gridx = 0;
			this.gridBagConstraintsEstadoProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoProforma, this.gridBagConstraintsEstadoProforma);			
			
			this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoProforma, this.gridBagConstraintsEstadoProforma);
			
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoProforma, this.gridBagConstraintsEstadoProforma);
		
			
		this.gridBagConstraintsEstadoProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoProforma, this.gridBagConstraintsEstadoProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoProforma;
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
