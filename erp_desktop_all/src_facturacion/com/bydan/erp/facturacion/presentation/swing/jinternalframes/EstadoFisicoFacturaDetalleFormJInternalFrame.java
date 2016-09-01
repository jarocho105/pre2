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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaConstantesFunciones;

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
public class EstadoFisicoFacturaDetalleFormJInternalFrame extends EstadoFisicoFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoFisicoFactura;
	
	protected JMenuBar jmenuBarDetalleEstadoFisicoFactura;
	
	protected JMenu jmenuDetalleEstadoFisicoFactura;
	protected JMenu jmenuDetalleArchivoEstadoFisicoFactura;
	protected JMenu jmenuDetalleAccionesEstadoFisicoFactura;
	protected JMenu jmenuDetalleDatosEstadoFisicoFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFisicoFactura;	
	protected GridBagConstraints gridBagConstraintsEstadoFisicoFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoFisicoFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoFisicoFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public EstadoFisicoFacturaSessionBean estadofisicofacturaSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public EstadoFisicoFacturaLogic estadofisicofacturaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoFisicoFactura;
	public JScrollPane jScrollPanelDatosEdicionEstadoFisicoFactura;
	public JScrollPane jScrollPanelDatosGeneralEstadoFisicoFactura;
	
	protected JPanel jPanelCamposEstadoFisicoFactura;    
	protected JPanel jPanelCamposOcultosEstadoFisicoFactura;    	
	protected JPanel jPanelAccionesEstadoFisicoFactura;
	protected JPanel jPanelAccionesFormularioEstadoFisicoFactura;
    
	
	
	protected Integer iXPanelCamposEstadoFisicoFactura=0;
	protected Integer iYPanelCamposEstadoFisicoFactura=0;
	
	protected Integer iXPanelCamposOcultosEstadoFisicoFactura=0;
	protected Integer iYPanelCamposOcultosEstadoFisicoFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoFisicoFactura;
	public JButton jButtonModificarEstadoFisicoFactura;
	public JButton jButtonActualizarEstadoFisicoFactura;
    public JButton jButtonEliminarEstadoFisicoFactura;
	public JButton jButtonCancelarEstadoFisicoFactura;
    public JButton jButtonGuardarCambiosEstadoFisicoFactura;
	public JButton jButtonGuardarCambiosTablaEstadoFisicoFactura;
	protected JButton jButtonCerrarEstadoFisicoFactura;
	
	
	protected JButton jButtonProcesarInformacionEstadoFisicoFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoFisicoFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoFisicoFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoFisicoFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFisicoFactura;
	protected JButton jButtonModificarToolBarEstadoFisicoFactura;
	protected JButton jButtonActualizarToolBarEstadoFisicoFactura;
    protected JButton jButtonEliminarToolBarEstadoFisicoFactura;
	protected JButton jButtonCancelarToolBarEstadoFisicoFactura;
    protected JButton jButtonGuardarCambiosToolBarEstadoFisicoFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFisicoFactura;
	protected JButton jButtonCerrarToolBarEstadoFisicoFactura;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoFisicoFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFisicoFactura;
	protected JMenuItem jMenuItemModificarEstadoFisicoFactura;
	protected JMenuItem jMenuItemActualizarEstadoFisicoFactura;
    protected JMenuItem jMenuItemEliminarEstadoFisicoFactura;
	protected JMenuItem jMenuItemCancelarEstadoFisicoFactura;
    protected JMenuItem jMenuItemGuardarCambiosEstadoFisicoFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFisicoFactura;
	protected JMenuItem jMenuItemCerrarEstadoFisicoFactura;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFisicoFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFisicoFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoFisicoFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFisicoFactura;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFisicoFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFisicoFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFisicoFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoFisicoFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoFisicoFactura;
	public JLabel jLabelIdEstadoFisicoFactura;
	public JTextFieldMe jTextFieldidEstadoFisicoFactura;
	public JButton jButtonidEstadoFisicoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoFisicoFactura;
	public JLabel jLabelnombreEstadoFisicoFactura;
	public JTextArea jTextAreanombreEstadoFisicoFactura;
	public JScrollPane jscrollPanenombreEstadoFisicoFactura;
	public JButton jButtonnombreEstadoFisicoFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisEstadoFisicoFactura;
	public JLabel jLabelid_paisEstadoFisicoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisEstadoFisicoFactura;
	public JButton jButtonid_paisEstadoFisicoFactura= new JButtonMe();
	public JButton jButtonid_paisEstadoFisicoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_paisEstadoFisicoFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoFisicoFactura;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoFisicoFactura=new JPanel();
				this.jPanelAccionesFormularioEstadoFisicoFactura=new JPanel();
				this.jmenuBarDetalleEstadoFisicoFactura=new JMenuBar();
				this.jTtoolBarDetalleEstadoFisicoFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoFisicoFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFisicoFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFisicoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoFisicoFactura() {
		return this.jButtonActualizarToolBarEstadoFisicoFactura;
	}
	
	public JButton getjButtonEliminarToolBarEstadoFisicoFactura() {
		return this.jButtonEliminarToolBarEstadoFisicoFactura;
	}
	
	public JButton getjButtonCancelarToolBarEstadoFisicoFactura() {
		return this.jButtonCancelarToolBarEstadoFisicoFactura;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoFisicoFactura() {
		return this.jButtonProcesarInformacionEstadoFisicoFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFisicoFactura)	{
		this.jButtonProcesarInformacionEstadoFisicoFactura = jButtonProcesarInformacionEstadoFisicoFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFisicoFactura() {
		return this.jComboBoxTiposAccionesEstadoFisicoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFisicoFactura(
			JComboBox jComboBoxTiposRelacionesEstadoFisicoFactura) {
		this.jComboBoxTiposRelacionesEstadoFisicoFactura = jComboBoxTiposRelacionesEstadoFisicoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFisicoFactura(
			JComboBox jComboBoxTiposAccionesEstadoFisicoFactura) {
		this.jComboBoxTiposAccionesEstadoFisicoFactura = jComboBoxTiposAccionesEstadoFisicoFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoFisicoFactura() {
		return this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoFisicoFactura(
			JComboBox jComboBoxTiposAccionesFormularioEstadoFisicoFactura) {
		this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura = jComboBoxTiposAccionesFormularioEstadoFisicoFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		
		this.estadofisicofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofisicofacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFisicoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFisicoFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Fisico Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoFisicoFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoFisicoFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoFisicoFactura=new JButtonMe();
				this.jButtonModificarToolBarEstadoFisicoFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura,
							"actualizar","actualizar","Actualizar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura,
							"eliminar","eliminar","Eliminar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura,
							"cancelar","cancelar","Cancelar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoFisicoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoFisicoFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoFisicoFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoFisicoFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoFisicoFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoFisicoFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFisicoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFisicoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFisicoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoFisicoFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoFisicoFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoFisicoFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoFisicoFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoFisicoFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoFisicoFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoFisicoFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoFisicoFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoFisicoFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoFisicoFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoFisicoFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoFisicoFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoFisicoFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFisicoFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFisicoFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFisicoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFisicoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFisicoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoFisicoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoFisicoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoFisicoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFisicoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFisicoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFisicoFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoFisicoFactura.add(this.jMenuItemDetalleCerrarEstadoFisicoFactura);
		
		this.jmenuDetalleAccionesEstadoFisicoFactura.add(this.jMenuItemActualizarEstadoFisicoFactura);
		this.jmenuDetalleAccionesEstadoFisicoFactura.add(this.jMenuItemEliminarEstadoFisicoFactura);
		this.jmenuDetalleAccionesEstadoFisicoFactura.add(this.jMenuItemCancelarEstadoFisicoFactura);		
		
		//this.jmenuDetalleDatosEstadoFisicoFactura.add(this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura);				
		this.jmenuDetalleDatosEstadoFisicoFactura.add(this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura);				
				
		//this.jmenuDetalleAccionesEstadoFisicoFactura.add(this.jMenuItemGuardarCambiosEstadoFisicoFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoFisicoFactura.add(this.jmenuDetalleArchivoEstadoFisicoFactura);		
		this.jmenuBarDetalleEstadoFisicoFactura.add(this.jmenuDetalleAccionesEstadoFisicoFactura);		
		this.jmenuBarDetalleEstadoFisicoFactura.add(this.jmenuDetalleDatosEstadoFisicoFactura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoFisicoFactura);				
	}
	
	
	public void inicializarElementosCamposEstadoFisicoFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoFisicoFactura = new JLabelMe();
		jLabelIdEstadoFisicoFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoFisicoFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoFisicoFactura.setToolTipText(EstadoFisicoFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoFisicoFactura= new GridBagLayout();

		this.jPanelidEstadoFisicoFactura.setLayout(this.gridaBagLayoutEstadoFisicoFactura);

		jTextFieldidEstadoFisicoFactura = new JTextFieldMe();
		jTextFieldidEstadoFisicoFactura.setText("Id");

		jTextFieldidEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEstadoFisicoFactura = new JLabelMe();
		this.jLabelnombreEstadoFisicoFactura.setText(""+EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoFisicoFactura.setToolTipText("Nombre");
		this.jLabelnombreEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoFisicoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoFisicoFactura.setToolTipText(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoFisicoFactura = new GridBagLayout();
		this.jPanelnombreEstadoFisicoFactura.setLayout(this.gridaBagLayoutEstadoFisicoFactura);


		jTextAreanombreEstadoFisicoFactura= new JTextAreaMe();
		jTextAreanombreEstadoFisicoFactura.setEnabled(false);
		jTextAreanombreEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFisicoFactura.setLineWrap(true);
		jTextAreanombreEstadoFisicoFactura.setWrapStyleWord(true);
		jTextAreanombreEstadoFisicoFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoFisicoFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoFisicoFactura = new JScrollPane(jTextAreanombreEstadoFisicoFactura);
		jscrollPanenombreEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoFisicoFacturaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoFisicoFacturaBusqueda.setText("U");
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoFisicoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoFisicoFacturaBusqueda"));

		if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoFisicoFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoFisicoFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisEstadoFisicoFactura = new JLabelMe();
		this.jLabelid_paisEstadoFisicoFactura.setText(""+EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisEstadoFisicoFactura.setToolTipText("Pais");
		this.jLabelid_paisEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisEstadoFisicoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisEstadoFisicoFactura.setToolTipText(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutEstadoFisicoFactura = new GridBagLayout();
		this.jPanelid_paisEstadoFisicoFactura.setLayout(this.gridaBagLayoutEstadoFisicoFactura);


		jComboBoxid_paisEstadoFisicoFactura= new JComboBoxMe();
		jComboBoxid_paisEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisEstadoFisicoFactura= new JButtonMe();
		this.jButtonid_paisEstadoFisicoFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstadoFisicoFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstadoFisicoFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstadoFisicoFactura.setText("Buscar");
		this.jButtonid_paisEstadoFisicoFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisEstadoFisicoFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstadoFisicoFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstadoFisicoFactura"));

		this.jButtonid_paisEstadoFisicoFacturaBusqueda= new JButtonMe();
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEstadoFisicoFacturaBusqueda.setText("U");
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstadoFisicoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstadoFisicoFacturaBusqueda"));

		if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisEstadoFisicoFacturaBusqueda.setVisible(false);		}

		this.jButtonid_paisEstadoFisicoFacturaUpdate= new JButtonMe();
		this.jButtonid_paisEstadoFisicoFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstadoFisicoFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstadoFisicoFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEstadoFisicoFacturaUpdate.setText("U");
		this.jButtonid_paisEstadoFisicoFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisEstadoFisicoFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstadoFisicoFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstadoFisicoFacturaUpdate"));



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
		//this.jInternalFrameDetalleEstadoFisicoFactura = new EstadoFisicoFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Fisico Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFisicoFactura= new GridBagLayout();
		

		
		String sToolTipEstadoFisicoFactura="";
		sToolTipEstadoFisicoFactura=EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFisicoFactura+="(Facturacion.EstadoFisicoFactura)";
		}
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFisicoFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoFisicoFactura = new JButtonMe();
		this.jButtonModificarEstadoFisicoFactura = new JButtonMe();
        this.jButtonActualizarEstadoFisicoFactura = new JButtonMe();
        this.jButtonEliminarEstadoFisicoFactura = new JButtonMe();
        this.jButtonCancelarEstadoFisicoFactura = new JButtonMe();
        this.jButtonGuardarCambiosEstadoFisicoFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura = new JButtonMe();
		this.jButtonCerrarEstadoFisicoFactura = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFisicoFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoFisicoFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoFisicoFactura = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Fisico Factura";
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Fisico Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFisicoFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoFisicoFactura.setName("jPanelCamposEstadoFisicoFactura"); 

		this.jPanelCamposOcultosEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoFisicoFactura.setName("jPanelCamposOcultosEstadoFisicoFactura"); 

        this.jPanelAccionesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFisicoFactura.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFisicoFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoFisicoFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoFisicoFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoFisicoFactura.setText("Nuevo");
		this.jButtonModificarEstadoFisicoFactura.setText("Editar");
        this.jButtonActualizarEstadoFisicoFactura.setText("Actualizar");
        this.jButtonEliminarEstadoFisicoFactura.setText("Eliminar");
        this.jButtonCancelarEstadoFisicoFactura.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoFisicoFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setText("Guardar");
		this.jButtonCerrarEstadoFisicoFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFisicoFactura,"nuevo_button","Nuevo",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoFisicoFactura,"modificar_button","Editar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoFisicoFactura,"actualizar_button","Actualizar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoFisicoFactura,"eliminar_button","Eliminar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoFisicoFactura,"cancelar_button","Cancelar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoFisicoFactura,"guardarcambios_button","Guardar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFisicoFactura,"guardarcambiostabla_button","Guardar",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFisicoFactura,"cerrar_button","Salir",this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoFisicoFactura.setToolTipText("Nuevo"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoFisicoFactura.setToolTipText("Editar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoFisicoFactura.setToolTipText("Actualizar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoFisicoFactura.setToolTipText("Eliminar)"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoFisicoFactura.setToolTipText("Cancelar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoFisicoFactura.setToolTipText("Guardar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setToolTipText("Guardar"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFisicoFactura.setToolTipText("Salir"+" "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFisicoFactura";
		inputMap = this.jButtonNuevoEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFisicoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFisicoFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoFisicoFactura";
		inputMap = this.jButtonActualizarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoFisicoFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoFisicoFactura";
		inputMap = this.jButtonEliminarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoFisicoFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoFisicoFactura";
		inputMap = this.jButtonCancelarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoFisicoFactura"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoFisicoFactura";
		inputMap = this.jButtonCerrarEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFisicoFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFisicoFactura";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFisicoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFisicoFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoFisicoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoFisicoFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoFisicoFactura.setToolTipText("Nuevo EstadoFisicoFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura.setToolTipText("Sin Cerrar Ventana EstadoFisicoFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFisicoFactura.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoFisicoFactura = new JLabelMe();
		
		this.jLabelAccionesEstadoFisicoFactura.setText("Acciones");		
		this.jLabelAccionesEstadoFisicoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFisicoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoFisicoFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoFisicoFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoFisicoFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoFisicoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoFisicoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFisicoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoFisicoFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoFisicoFactura = new GridBagLayout();
		
		this.jPanelCamposEstadoFisicoFactura.setLayout(gridaBagLayoutCamposEstadoFisicoFactura);
		this.jPanelCamposOcultosEstadoFisicoFactura.setLayout(gridaBagLayoutCamposOcultosEstadoFisicoFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoFisicoFactura.add(jLabelIdEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoFisicoFactura.add(jTextFieldidEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);


	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisEstadoFisicoFactura.add(jLabelid_paisEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEstadoFisicoFactura.add(jButtonid_paisEstadoFisicoFacturaBusqueda, this.gridBagConstraintsEstadoFisicoFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 3;
		this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEstadoFisicoFactura.add(jButtonid_paisEstadoFisicoFacturaUpdate, this.gridBagConstraintsEstadoFisicoFactura);
	}

	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisEstadoFisicoFactura.add(jComboBoxid_paisEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);


	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoFisicoFactura.add(jLabelnombreEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 2;
		this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
		this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoFisicoFactura.add(jButtonnombreEstadoFisicoFacturaBusqueda, this.gridBagConstraintsEstadoFisicoFactura);
	}

	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = 1;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoFisicoFactura.add(jscrollPanenombreEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = iYPanelCamposEstadoFisicoFactura;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = iXPanelCamposEstadoFisicoFactura++;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFactura.add(this.jPanelidEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	if(iXPanelCamposEstadoFisicoFactura % 1==0) {
		iXPanelCamposEstadoFisicoFactura=0;
		iYPanelCamposEstadoFisicoFactura++;
	}
	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = iYPanelCamposEstadoFisicoFactura;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = iXPanelCamposEstadoFisicoFactura++;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFactura.add(this.jPanelid_paisEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	if(iXPanelCamposEstadoFisicoFactura % 1==0) {
		iXPanelCamposEstadoFisicoFactura=0;
		iYPanelCamposEstadoFisicoFactura++;
	}
	this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFisicoFactura.gridy = iYPanelCamposEstadoFisicoFactura;
	this.gridBagConstraintsEstadoFisicoFactura.gridx = iXPanelCamposEstadoFisicoFactura++;
	this.gridBagConstraintsEstadoFisicoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFisicoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFisicoFactura.add(this.jPanelnombreEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);



	if(iXPanelCamposEstadoFisicoFactura % 1==0) {
		iXPanelCamposEstadoFisicoFactura=0;
		iYPanelCamposEstadoFisicoFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoFisicoFactura= new GridBagLayout();
		this.jPanelAccionesEstadoFisicoFactura.setLayout(gridaBagLayoutAccionesEstadoFisicoFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoFisicoFactura= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoFisicoFactura.setLayout(gridaBagLayoutAccionesFormularioEstadoFisicoFactura);
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFisicoFactura.add(this.jComboBoxTiposAccionesFormularioEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFisicoFactura.add(this.jCheckBoxPostAccionNuevoEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFisicoFactura.add(this.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFisicoFactura.add(this.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonModificarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);							

		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;
		this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonEliminarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonActualizarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);


		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonGuardarCambiosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);	
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = 0;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoFisicoFactura.add(this.jButtonCancelarEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFisicoFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFisicoFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;		
			//this.gridBagConstraintsEstadoFisicoFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFisicoFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFisicoFactura.gridx =0;
		this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFisicoFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoFisicoFactura = new EstadoFisicoFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Fisico Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Fisico Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Fisico Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoFisicoFacturaModel estadofisicofacturaModel=new EstadoFisicoFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoFisicoFacturaModel.EstadoFisicoFacturaFocusTraversalPolicy estadofisicofacturaFocusTraversalPolicy = estadofisicofacturaModel.new EstadoFisicoFacturaFocusTraversalPolicy(this);
			
			//estadofisicofacturaFocusTraversalPolicy.setestadofisicofacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadofisicofacturaModel);
			
			
			this.jContentPaneDetalleEstadoFisicoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoFisicoFactura = new GridBagLayout();	
			this.jContentPaneDetalleEstadoFisicoFactura.setLayout(gridaBagLayoutDetalleEstadoFisicoFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFisicoFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
				this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoFisicoFactura.add(jTtoolBarDetalleEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoFisicoFactura=   new JScrollPane(jContentPaneDetalleEstadoFisicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoFisicoFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	        
			this.jContentPaneDetalleEstadoFisicoFactura.add(jPanelCamposEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);
			
			
			
			
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
						&& estadofisicofacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoFisicoFactura= new GridBagConstraints();
						this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
						this.jContentPaneDetalleEstadoFisicoFactura.add(this.jTabbedPaneRelacionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoFisicoFactura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoFisicoFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
					this.gridBagConstraintsEstadoFisicoFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoFisicoFactura.add(jPanelCamposOcultosEstadoFisicoFactura, gridBagConstraintsEstadoFisicoFactura);
				
					this.jPanelCamposOcultosEstadoFisicoFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	        this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoFisicoFactura.add(this.jPanelAccionesFormularioEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);							
			
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
	        this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoFisicoFactura.add(this.jPanelAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoFisicoFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoFisicoFactura=   new JScrollPane(this.jPanelCamposEstadoFisicoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFisicoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
			this.gridBagConstraintsEstadoFisicoFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoFisicoFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoFisicoFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);			
			
			this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
			this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
			
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		
			
		this.gridBagConstraintsEstadoFisicoFactura = new GridBagConstraints();
		this.gridBagConstraintsEstadoFisicoFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFisicoFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFisicoFactura, this.gridBagConstraintsEstadoFisicoFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoFisicoFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoFisicoFactura;
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
