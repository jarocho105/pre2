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



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.facturacion.util.EstadoDetalleProformaConstantesFunciones;

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
public class EstadoDetalleProformaDetalleFormJInternalFrame extends EstadoDetalleProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleProforma;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleProforma;
	
	protected JMenu jmenuDetalleEstadoDetalleProforma;
	protected JMenu jmenuDetalleArchivoEstadoDetalleProforma;
	protected JMenu jmenuDetalleAccionesEstadoDetalleProforma;
	protected JMenu jmenuDetalleDatosEstadoDetalleProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleProforma;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleProformaSessionBean estadodetalleproformaSessionBean;
	
	

	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=null;
	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleProforma=false;
	public DetalleProformaSessionBean detalleproformaSessionBean;
	
		
	
	public EstadoDetalleProformaLogic estadodetalleproformaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleProforma;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleProforma;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleProforma;
	
	protected JPanel jPanelCamposEstadoDetalleProforma;    
	protected JPanel jPanelCamposOcultosEstadoDetalleProforma;    	
	protected JPanel jPanelAccionesEstadoDetalleProforma;
	protected JPanel jPanelAccionesFormularioEstadoDetalleProforma;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleProforma=0;
	protected Integer iYPanelCamposEstadoDetalleProforma=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleProforma=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleProforma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleProforma;
	public JButton jButtonModificarEstadoDetalleProforma;
	public JButton jButtonActualizarEstadoDetalleProforma;
    public JButton jButtonEliminarEstadoDetalleProforma;
	public JButton jButtonCancelarEstadoDetalleProforma;
    public JButton jButtonGuardarCambiosEstadoDetalleProforma;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleProforma;
	protected JButton jButtonCerrarEstadoDetalleProforma;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleProforma;
	protected JButton jButtonModificarToolBarEstadoDetalleProforma;
	protected JButton jButtonActualizarToolBarEstadoDetalleProforma;
    protected JButton jButtonEliminarToolBarEstadoDetalleProforma;
	protected JButton jButtonCancelarToolBarEstadoDetalleProforma;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleProforma;
	protected JButton jButtonCerrarToolBarEstadoDetalleProforma;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleProforma;
	protected JMenuItem jMenuItemModificarEstadoDetalleProforma;
	protected JMenuItem jMenuItemActualizarEstadoDetalleProforma;
    protected JMenuItem jMenuItemEliminarEstadoDetalleProforma;
	protected JMenuItem jMenuItemCancelarEstadoDetalleProforma;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleProforma;
	protected JMenuItem jMenuItemCerrarEstadoDetalleProforma;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleProforma;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleProforma;
	public JLabel jLabelIdEstadoDetalleProforma;
	public JLabel jLabelidEstadoDetalleProforma;
	public JButton jButtonidEstadoDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleProforma;
	public JLabel jLabelcodigoEstadoDetalleProforma;
	public JTextField jTextFieldcodigoEstadoDetalleProforma;
	public JButton jButtoncodigoEstadoDetalleProformaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleProforma;
	public JLabel jLabelnombreEstadoDetalleProforma;
	public JTextArea jTextAreanombreEstadoDetalleProforma;
	public JScrollPane jscrollPanenombreEstadoDetalleProforma;
	public JButton jButtonnombreEstadoDetalleProformaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleProforma;
	
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
	
	public EstadoDetalleProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleProforma=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleProforma=new JPanel();
				this.jmenuBarDetalleEstadoDetalleProforma=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleProforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleProforma() {
		return this.jButtonActualizarToolBarEstadoDetalleProforma;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleProforma() {
		return this.jButtonEliminarToolBarEstadoDetalleProforma;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleProforma() {
		return this.jButtonCancelarToolBarEstadoDetalleProforma;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleProforma() {
		return this.jButtonProcesarInformacionEstadoDetalleProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleProforma)	{
		this.jButtonProcesarInformacionEstadoDetalleProforma = jButtonProcesarInformacionEstadoDetalleProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleProforma() {
		return this.jComboBoxTiposAccionesEstadoDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleProforma(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleProforma) {
		this.jComboBoxTiposRelacionesEstadoDetalleProforma = jComboBoxTiposRelacionesEstadoDetalleProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleProforma(
			JComboBox jComboBoxTiposAccionesEstadoDetalleProforma) {
		this.jComboBoxTiposAccionesEstadoDetalleProforma = jComboBoxTiposAccionesEstadoDetalleProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleProforma() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleProforma(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleProforma) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma = jComboBoxTiposAccionesFormularioEstadoDetalleProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetalleproformaSessionBean=new EstadoDetalleProformaSessionBean();
		
		this.estadodetalleproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleproformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleProforma=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleProforma,this.jTtoolBarDetalleEstadoDetalleProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleProforma.add(this.jMenuItemDetalleCerrarEstadoDetalleProforma);
		
		this.jmenuDetalleAccionesEstadoDetalleProforma.add(this.jMenuItemActualizarEstadoDetalleProforma);
		this.jmenuDetalleAccionesEstadoDetalleProforma.add(this.jMenuItemEliminarEstadoDetalleProforma);
		this.jmenuDetalleAccionesEstadoDetalleProforma.add(this.jMenuItemCancelarEstadoDetalleProforma);		
		
		//this.jmenuDetalleDatosEstadoDetalleProforma.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleProforma);				
		this.jmenuDetalleDatosEstadoDetalleProforma.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleProforma);				
				
		//this.jmenuDetalleAccionesEstadoDetalleProforma.add(this.jMenuItemGuardarCambiosEstadoDetalleProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleProforma.add(this.jmenuDetalleArchivoEstadoDetalleProforma);		
		this.jmenuBarDetalleEstadoDetalleProforma.add(this.jmenuDetalleAccionesEstadoDetalleProforma);		
		this.jmenuBarDetalleEstadoDetalleProforma.add(this.jmenuDetalleDatosEstadoDetalleProforma);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoDetalleProforma.add(this.jmenuDetalleEstadoDetalleProforma);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleProforma);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleProforma = new JLabelMe();
		jLabelIdEstadoDetalleProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleProforma.setToolTipText(EstadoDetalleProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleProforma= new GridBagLayout();

		this.jPanelidEstadoDetalleProforma.setLayout(this.gridaBagLayoutEstadoDetalleProforma);

		jLabelidEstadoDetalleProforma = new JLabel();
		jLabelidEstadoDetalleProforma.setText("Id");

		jLabelidEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleProforma = new JLabelMe();
		this.jLabelcodigoEstadoDetalleProforma.setText(""+EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleProforma.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleProforma.setToolTipText(EstadoDetalleProformaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleProforma = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleProforma.setLayout(this.gridaBagLayoutEstadoDetalleProforma);


		jTextFieldcodigoEstadoDetalleProforma= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleProforma.setEnabled(false);
		jTextFieldcodigoEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleProformaBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleProformaBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleProformaBusqueda"));

		if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleProformaBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleProforma = new JLabelMe();
		this.jLabelnombreEstadoDetalleProforma.setText(""+EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleProforma.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleProforma.setToolTipText(EstadoDetalleProformaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleProforma = new GridBagLayout();
		this.jPanelnombreEstadoDetalleProforma.setLayout(this.gridaBagLayoutEstadoDetalleProforma);


		jTextAreanombreEstadoDetalleProforma= new JTextAreaMe();
		jTextAreanombreEstadoDetalleProforma.setEnabled(false);
		jTextAreanombreEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoDetalleProforma.setLineWrap(true);
		jTextAreanombreEstadoDetalleProforma.setWrapStyleWord(true);
		jTextAreanombreEstadoDetalleProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoDetalleProforma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoDetalleProforma = new JScrollPane(jTextAreanombreEstadoDetalleProforma);
		jscrollPanenombreEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoDetalleProformaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleProformaBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoDetalleProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoDetalleProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleProformaBusqueda"));

		if(this.estadodetalleproformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleProforma() {
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
		//this.jInternalFrameDetalleEstadoDetalleProforma = new EstadoDetalleProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleProforma= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleProforma="";
		sToolTipEstadoDetalleProforma=EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleProforma+="(Facturacion.EstadoDetalleProforma)";
		}
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleProforma = new JButtonMe();
		this.jButtonModificarEstadoDetalleProforma = new JButtonMe();
        this.jButtonActualizarEstadoDetalleProforma = new JButtonMe();
        this.jButtonEliminarEstadoDetalleProforma = new JButtonMe();
        this.jButtonCancelarEstadoDetalleProforma = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma = new JButtonMe();
		this.jButtonCerrarEstadoDetalleProforma = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleProforma = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Proforma";
		
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleProforma.setName("jPanelCamposEstadoDetalleProforma"); 

		this.jPanelCamposOcultosEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleProforma.setName("jPanelCamposOcultosEstadoDetalleProforma"); 

        this.jPanelAccionesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleProforma.setText("Nuevo");
		this.jButtonModificarEstadoDetalleProforma.setText("Editar");
        this.jButtonActualizarEstadoDetalleProforma.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleProforma.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleProforma.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setText("Guardar");
		this.jButtonCerrarEstadoDetalleProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleProforma,"nuevo_button","Nuevo",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleProforma,"modificar_button","Editar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleProforma,"actualizar_button","Actualizar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleProforma,"eliminar_button","Eliminar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleProforma,"cancelar_button","Cancelar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleProforma,"guardarcambios_button","Guardar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleProforma,"guardarcambiostabla_button","Guardar",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleProforma,"cerrar_button","Salir",this.estadodetalleproformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleProforma.setToolTipText("Nuevo"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleProforma.setToolTipText("Editar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleProforma.setToolTipText("Actualizar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleProforma.setToolTipText("Eliminar)"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleProforma.setToolTipText("Cancelar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleProforma.setToolTipText("Guardar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.setToolTipText("Guardar"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleProforma.setToolTipText("Salir"+" "+EstadoDetalleProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleProforma";
		inputMap = this.jButtonNuevoEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleProforma";
		inputMap = this.jButtonActualizarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleProforma";
		inputMap = this.jButtonEliminarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleProforma";
		inputMap = this.jButtonCancelarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleProforma"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleProforma";
		inputMap = this.jButtonCerrarEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleProforma";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleProforma.setToolTipText("Nuevo EstadoDetalleProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma.setToolTipText("Sin Cerrar Ventana EstadoDetalleProforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleProforma.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleProforma = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleProforma.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleProforma = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleProforma.setLayout(gridaBagLayoutCamposEstadoDetalleProforma);
		this.jPanelCamposOcultosEstadoDetalleProforma.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleProforma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleProforma.add(jLabelIdEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 1;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleProforma.add(jLabelidEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);


	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleProforma.add(jLabelcodigoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 2;
		this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleProforma.add(jButtoncodigoEstadoDetalleProformaBusqueda, this.gridBagConstraintsEstadoDetalleProforma);
	}

	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 1;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleProforma.add(jTextFieldcodigoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);


	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleProforma.add(jLabelnombreEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 2;
		this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleProforma.add(jButtonnombreEstadoDetalleProformaBusqueda, this.gridBagConstraintsEstadoDetalleProforma);
	}

	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = 1;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleProforma.add(jscrollPanenombreEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = iYPanelCamposEstadoDetalleProforma;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = iXPanelCamposEstadoDetalleProforma++;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleProforma.add(this.jPanelidEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	if(iXPanelCamposEstadoDetalleProforma % 1==0) {
		iXPanelCamposEstadoDetalleProforma=0;
		iYPanelCamposEstadoDetalleProforma++;
	}
	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = iYPanelCamposEstadoDetalleProforma;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = iXPanelCamposEstadoDetalleProforma++;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleProforma.add(this.jPanelcodigoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	if(iXPanelCamposEstadoDetalleProforma % 1==0) {
		iXPanelCamposEstadoDetalleProforma=0;
		iYPanelCamposEstadoDetalleProforma++;
	}
	this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleProforma.gridy = iYPanelCamposEstadoDetalleProforma;
	this.gridBagConstraintsEstadoDetalleProforma.gridx = iXPanelCamposEstadoDetalleProforma++;
	this.gridBagConstraintsEstadoDetalleProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleProforma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleProforma.add(this.jPanelnombreEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);



	if(iXPanelCamposEstadoDetalleProforma % 1==0) {
		iXPanelCamposEstadoDetalleProforma=0;
		iYPanelCamposEstadoDetalleProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleProforma= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleProforma.setLayout(gridaBagLayoutAccionesEstadoDetalleProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleProforma= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleProforma.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleProforma);
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleProforma.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);

		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleProforma.add(this.jCheckBoxPostAccionNuevoEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleProforma.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetalleproformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleProforma.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonModificarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);							

		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;
		this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonEliminarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonActualizarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);


		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonGuardarCambiosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);	
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleProforma.add(this.jButtonCancelarEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleproformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleProforma.gridx =0;
		this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleProforma = new EstadoDetalleProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleProformaModel estadodetalleproformaModel=new EstadoDetalleProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleProformaModel.EstadoDetalleProformaFocusTraversalPolicy estadodetalleproformaFocusTraversalPolicy = estadodetalleproformaModel.new EstadoDetalleProformaFocusTraversalPolicy(this);
			
			//estadodetalleproformaFocusTraversalPolicy.setestadodetalleproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetalleproformaModel);
			
			
			this.jContentPaneDetalleEstadoDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleProforma = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleProforma.setLayout(gridaBagLayoutDetalleEstadoDetalleProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleProforma.add(jTtoolBarDetalleEstadoDetalleProforma, gridBagConstraintsEstadoDetalleProforma);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleProforma=   new JScrollPane(jContentPaneDetalleEstadoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleProforma.add(jPanelCamposEstadoDetalleProforma, gridBagConstraintsEstadoDetalleProforma);
			
			
			
			
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
						&& estadodetalleproformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(this.puedeCargarPorParteDetalleProforma,false,-1);
					
					if(this.estadodetalleproformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleProforma= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleProforma.add(this.jTabbedPaneRelacionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleProforma.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleProforma.add(jPanelCamposOcultosEstadoDetalleProforma, gridBagConstraintsEstadoDetalleProforma);
				
					this.jPanelCamposOcultosEstadoDetalleProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleProforma.add(this.jPanelAccionesFormularioEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);							
			
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleProforma.add(this.jPanelAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleProforma=   new JScrollPane(this.jPanelCamposEstadoDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
			this.gridBagConstraintsEstadoDetalleProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);			
			
			this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
			
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		
			
		this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleProforma, this.gridBagConstraintsEstadoDetalleProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleProforma;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		this.detalleproformaSessionBean.setConGuardarRelaciones(false);
		this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

		this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleproformaBeanSwingJInternalFramePopup=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleproformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {

				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoDetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

				this.detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleproformaBeanSwingJInternalFrame.setdetalleproformaSessionBean(this.detalleproformaSessionBean);

				//this.gridBagConstraintsEstadoDetalleProforma = new GridBagConstraints();
				//this.gridBagConstraintsEstadoDetalleProforma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoDetalleProforma.gridx = 0;
				//this.jContentPaneDetalleEstadoDetalleProforma.add(this.detalleproformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoDetalleProforma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoDetalleProforma.add("Detalle Proformas",this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoDetalleProforma.setComponentAt(iIndexTab,this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleproformaSessionBean.setEsGuardarRelacionado(false);
				this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleProforma) {
					this.jTabbedPaneRelacionesEstadoDetalleProforma.add("Detalle Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleProformaBeanSwingJInternalFrame(List<EstadoDetalleProforma> estadodetalleproformas,EstadoDetalleProforma estadodetalleproforma,DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleproformaBeanSwingJInternalFrame.getDetalleProformaLogic().setConnexion(this.estadodetalleproformaLogic.getConnexion());

					detalleproformaBeanSwingJInternalFrame.setestadodetalleproformasForeignKey(estadodetalleproformas);
					detalleproformaBeanSwingJInternalFrame.setestadodetalleproformaForeignKey(estadodetalleproforma);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDetalleProforma(true);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setlidEstadoDetalleProformaActual(estadodetalleproforma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleproformaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleProforma(detalleproformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleproformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoDetalleProforma(true);
					detalleproformaBeanSwingJInternalFrame.setid_estado_detalle_proformaFK_IdEstadoDetalleProforma(estadodetalleproforma.getId());

					if(!this.conCargarFormDetalle) {
						detalleproformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleproformaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoDetalleProformaForeignKey(estadodetalleproforma,1,false,true,true);
					detalleproformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleproformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoDetalleProforma");
					detalleproformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoDetalleProforma");
					detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(true);
					detalleproformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleProforma("n",detalleproformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleproformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleproformaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleproformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("relacionado");
					} else {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("no_relacionado");
					}

					detalleproformaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleProforma().setVisible(false);

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
