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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.RecargoCompraConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class RecargoCompraDetalleFormJInternalFrame extends RecargoCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRecargoCompra;
	
	protected JMenuBar jmenuBarDetalleRecargoCompra;
	
	protected JMenu jmenuDetalleRecargoCompra;
	protected JMenu jmenuDetalleArchivoRecargoCompra;
	protected JMenu jmenuDetalleAccionesRecargoCompra;
	protected JMenu jmenuDetalleDatosRecargoCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRecargoCompra;	
	protected GridBagConstraints gridBagConstraintsRecargoCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RecargoCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleRecargoCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public RecargoCompraSessionBean recargocompraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public RecargoCompraLogic recargocompraLogic;
	
	public JScrollPane jScrollPanelDatosRecargoCompra;
	public JScrollPane jScrollPanelDatosEdicionRecargoCompra;
	public JScrollPane jScrollPanelDatosGeneralRecargoCompra;
	
	protected JPanel jPanelCamposRecargoCompra;    
	protected JPanel jPanelCamposOcultosRecargoCompra;    	
	protected JPanel jPanelAccionesRecargoCompra;
	protected JPanel jPanelAccionesFormularioRecargoCompra;
    
	
	
	protected Integer iXPanelCamposRecargoCompra=0;
	protected Integer iYPanelCamposRecargoCompra=0;
	
	protected Integer iXPanelCamposOcultosRecargoCompra=0;
	protected Integer iYPanelCamposOcultosRecargoCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRecargoCompra;
	public JButton jButtonModificarRecargoCompra;
	public JButton jButtonActualizarRecargoCompra;
    public JButton jButtonEliminarRecargoCompra;
	public JButton jButtonCancelarRecargoCompra;
    public JButton jButtonGuardarCambiosRecargoCompra;
	public JButton jButtonGuardarCambiosTablaRecargoCompra;
	protected JButton jButtonCerrarRecargoCompra;
	
	
	protected JButton jButtonProcesarInformacionRecargoCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRecargoCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRecargoCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRecargoCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRecargoCompra;
	protected JButton jButtonModificarToolBarRecargoCompra;
	protected JButton jButtonActualizarToolBarRecargoCompra;
    protected JButton jButtonEliminarToolBarRecargoCompra;
	protected JButton jButtonCancelarToolBarRecargoCompra;
    protected JButton jButtonGuardarCambiosToolBarRecargoCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarRecargoCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarRecargoCompra;
	protected JButton jButtonCerrarToolBarRecargoCompra;
	
	protected JButton jButtonProcesarInformacionToolBarRecargoCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRecargoCompra;
	protected JMenuItem jMenuItemModificarRecargoCompra;
	protected JMenuItem jMenuItemActualizarRecargoCompra;
    protected JMenuItem jMenuItemEliminarRecargoCompra;
	protected JMenuItem jMenuItemCancelarRecargoCompra;
    protected JMenuItem jMenuItemGuardarCambiosRecargoCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaRecargoCompra;
	protected JMenuItem jMenuItemCerrarRecargoCompra;
	protected JMenuItem jMenuItemDetalleCerrarRecargoCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarRecargoCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionRecargoCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRecargoCompra;
	protected JMenuItem jMenuItemMostrarOcultarRecargoCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRecargoCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRecargoCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRecargoCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRecargoCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRecargoCompra;
	public JLabel jLabelIdRecargoCompra;
	public JLabel jLabelidRecargoCompra;
	public JButton jButtonidRecargoCompraBusqueda= new JButtonMe();

	public JPanel jPanelnombreRecargoCompra;
	public JLabel jLabelnombreRecargoCompra;
	public JTextField jTextFieldnombreRecargoCompra;
	public JButton jButtonnombreRecargoCompraBusqueda= new JButtonMe();

	public JPanel jPaneles_servicioRecargoCompra;
	public JLabel jLabeles_servicioRecargoCompra;
	public JCheckBox jCheckBoxes_servicioRecargoCompra;
	public JButton jButtones_servicioRecargoCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRecargoCompra;
	public JLabel jLabelid_empresaRecargoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRecargoCompra;
	public JButton jButtonid_empresaRecargoCompra= new JButtonMe();
	public JButton jButtonid_empresaRecargoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaRecargoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoRecargoCompra;
	public JLabel jLabelid_cuenta_contable_debitoRecargoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoRecargoCompra;
	public JButton jButtonid_cuenta_contable_debitoRecargoCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoRecargoCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoRecargoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoRecargoCompraArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoRecargoCompra;
	public JLabel jLabelid_cuenta_contable_creditoRecargoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoRecargoCompra;
	public JButton jButtonid_cuenta_contable_creditoRecargoCompra= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoRecargoCompraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoRecargoCompraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoRecargoCompraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRecargoCompra;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RecargoCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRecargoCompra=new JPanel();
				this.jPanelAccionesFormularioRecargoCompra=new JPanel();
				this.jmenuBarDetalleRecargoCompra=new JMenuBar();
				this.jTtoolBarDetalleRecargoCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RecargoCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecargoCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RecargoCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRecargoCompra() {
		return this.jButtonActualizarToolBarRecargoCompra;
	}
	
	public JButton getjButtonEliminarToolBarRecargoCompra() {
		return this.jButtonEliminarToolBarRecargoCompra;
	}
	
	public JButton getjButtonCancelarToolBarRecargoCompra() {
		return this.jButtonCancelarToolBarRecargoCompra;
	}		
	
	public JButton getjButtonProcesarInformacionRecargoCompra() {
		return this.jButtonProcesarInformacionRecargoCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRecargoCompra)	{
		this.jButtonProcesarInformacionRecargoCompra = jButtonProcesarInformacionRecargoCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRecargoCompra() {
		return this.jComboBoxTiposAccionesRecargoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRecargoCompra(
			JComboBox jComboBoxTiposRelacionesRecargoCompra) {
		this.jComboBoxTiposRelacionesRecargoCompra = jComboBoxTiposRelacionesRecargoCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRecargoCompra(
			JComboBox jComboBoxTiposAccionesRecargoCompra) {
		this.jComboBoxTiposAccionesRecargoCompra = jComboBoxTiposAccionesRecargoCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRecargoCompra() {
		return this.jComboBoxTiposAccionesFormularioRecargoCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRecargoCompra(
			JComboBox jComboBoxTiposAccionesFormularioRecargoCompra) {
		this.jComboBoxTiposAccionesFormularioRecargoCompra = jComboBoxTiposAccionesFormularioRecargoCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.recargocompraSessionBean=new RecargoCompraSessionBean();
		
		this.recargocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recargocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recargocompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RecargoCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RecargoCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recargo Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
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
	
		RecargoCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRecargoCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRecargoCompra=new JButtonMe();
				this.jButtonModificarToolBarRecargoCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra,
							"actualizar","actualizar","Actualizar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra,
							"eliminar","eliminar","Eliminar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra,
							"cancelar","cancelar","Cancelar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRecargoCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRecargoCompra,this.jTtoolBarDetalleRecargoCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRecargoCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRecargoCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRecargoCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRecargoCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRecargoCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRecargoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRecargoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRecargoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRecargoCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRecargoCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRecargoCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRecargoCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRecargoCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRecargoCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRecargoCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRecargoCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRecargoCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRecargoCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRecargoCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRecargoCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRecargoCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRecargoCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRecargoCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRecargoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRecargoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRecargoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRecargoCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRecargoCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRecargoCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRecargoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRecargoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRecargoCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRecargoCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRecargoCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRecargoCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRecargoCompra.add(this.jMenuItemDetalleCerrarRecargoCompra);
		
		this.jmenuDetalleAccionesRecargoCompra.add(this.jMenuItemActualizarRecargoCompra);
		this.jmenuDetalleAccionesRecargoCompra.add(this.jMenuItemEliminarRecargoCompra);
		this.jmenuDetalleAccionesRecargoCompra.add(this.jMenuItemCancelarRecargoCompra);		
		
		//this.jmenuDetalleDatosRecargoCompra.add(this.jMenuItemDetalleAbrirOrderByRecargoCompra);				
		this.jmenuDetalleDatosRecargoCompra.add(this.jMenuItemDetalleMostarOcultarRecargoCompra);				
				
		//this.jmenuDetalleAccionesRecargoCompra.add(this.jMenuItemGuardarCambiosRecargoCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRecargoCompra.add(this.jmenuDetalleArchivoRecargoCompra);		
		this.jmenuBarDetalleRecargoCompra.add(this.jmenuDetalleAccionesRecargoCompra);		
		this.jmenuBarDetalleRecargoCompra.add(this.jmenuDetalleDatosRecargoCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRecargoCompra);				
	}
	
	
	public void inicializarElementosCamposRecargoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRecargoCompra = new JLabelMe();
		jLabelIdRecargoCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRecargoCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRecargoCompra= new GridBagLayout();

		this.jPanelidRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);

		jLabelidRecargoCompra = new JLabel();
		jLabelidRecargoCompra.setText("Id");

		jLabelidRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreRecargoCompra = new JLabelMe();
		this.jLabelnombreRecargoCompra.setText(""+RecargoCompraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRecargoCompra.setToolTipText("Nombre");
		this.jLabelnombreRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRecargoCompra = new GridBagLayout();
		this.jPanelnombreRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);


		jTextFieldnombreRecargoCompra= new JTextFieldMe();

		jTextFieldnombreRecargoCompra.setEnabled(false);
		jTextFieldnombreRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreRecargoCompraBusqueda= new JButtonMe();
		this.jButtonnombreRecargoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRecargoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRecargoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRecargoCompraBusqueda.setText("U");
		this.jButtonnombreRecargoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRecargoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRecargoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRecargoCompraBusqueda"));

		if(this.recargocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRecargoCompraBusqueda.setVisible(false);		}


					
		this.jLabeles_servicioRecargoCompra = new JLabelMe();
		this.jLabeles_servicioRecargoCompra.setText(""+RecargoCompraConstantesFunciones.LABEL_ESSERVICIO+" : *");
		this.jLabeles_servicioRecargoCompra.setToolTipText("Es Servicio");
		this.jLabeles_servicioRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_servicioRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_servicioRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_servicioRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_servicioRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_servicioRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_ESSERVICIO);
		this.gridaBagLayoutRecargoCompra = new GridBagLayout();
		this.jPaneles_servicioRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);


		jCheckBoxes_servicioRecargoCompra= new JCheckBoxMe();
		jCheckBoxes_servicioRecargoCompra.setEnabled(false);

		jCheckBoxes_servicioRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_servicioRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_servicioRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_servicioRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_servicioRecargoCompraBusqueda= new JButtonMe();
		this.jButtones_servicioRecargoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_servicioRecargoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_servicioRecargoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_servicioRecargoCompraBusqueda.setText("U");
		this.jButtones_servicioRecargoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_servicioRecargoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_servicioRecargoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_servicioRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_servicioRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_servicioRecargoCompraBusqueda"));

		if(this.recargocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_servicioRecargoCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRecargoCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRecargoCompra = new JLabelMe();
		this.jLabelid_empresaRecargoCompra.setText(""+RecargoCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRecargoCompra.setToolTipText("Empresa");
		this.jLabelid_empresaRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRecargoCompra = new GridBagLayout();
		this.jPanelid_empresaRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);


		jComboBoxid_empresaRecargoCompra= new JComboBoxMe();
		jComboBoxid_empresaRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRecargoCompra.setEnabled(false);

		this.jButtonid_empresaRecargoCompra= new JButtonMe();
		this.jButtonid_empresaRecargoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecargoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecargoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecargoCompra.setText("Buscar");
		this.jButtonid_empresaRecargoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRecargoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecargoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecargoCompra"));

		this.jButtonid_empresaRecargoCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaRecargoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecargoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecargoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRecargoCompraBusqueda.setText("U");
		this.jButtonid_empresaRecargoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRecargoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecargoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecargoCompraBusqueda"));

		if(this.recargocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRecargoCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaRecargoCompraUpdate= new JButtonMe();
		this.jButtonid_empresaRecargoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecargoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecargoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRecargoCompraUpdate.setText("U");
		this.jButtonid_empresaRecargoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRecargoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecargoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecargoCompraUpdate"));



					
		this.jLabelid_cuenta_contable_debitoRecargoCompra = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoRecargoCompra.setText(""+RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoRecargoCompra.setToolTipText("Cuenta C. Debito");
		this.jLabelid_cuenta_contable_debitoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutRecargoCompra = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);


		jComboBoxid_cuenta_contable_debitoRecargoCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoRecargoCompra= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoRecargoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoRecargoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoRecargoCompra"));

		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoRecargoCompraBusqueda"));

		if(this.recargocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoRecargoCompraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoRecargoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoRecargoCompraUpdate"));


		jButtonid_cuenta_contable_debitoRecargoCompraArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoRecargoCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoRecargoCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoRecargoCompraArbol"));



					
		this.jLabelid_cuenta_contable_creditoRecargoCompra = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoRecargoCompra.setText(""+RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoRecargoCompra.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoRecargoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoRecargoCompra.setToolTipText(RecargoCompraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutRecargoCompra = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoRecargoCompra.setLayout(this.gridaBagLayoutRecargoCompra);


		jComboBoxid_cuenta_contable_creditoRecargoCompra= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoRecargoCompra= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoRecargoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoRecargoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoRecargoCompra"));

		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoRecargoCompraBusqueda"));

		if(this.recargocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoRecargoCompraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoRecargoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoRecargoCompraUpdate"));


		jButtonid_cuenta_contable_creditoRecargoCompraArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoRecargoCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoRecargoCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoRecargoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoRecargoCompraArbol"));



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
		//this.jInternalFrameDetalleRecargoCompra = new RecargoCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Recargo Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRecargoCompra= new GridBagLayout();
		

		
		String sToolTipRecargoCompra="";
		sToolTipRecargoCompra=RecargoCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRecargoCompra+="(Inventario.RecargoCompra)";
		}
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRecargoCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRecargoCompra = new JButtonMe();
		this.jButtonModificarRecargoCompra = new JButtonMe();
        this.jButtonActualizarRecargoCompra = new JButtonMe();
        this.jButtonEliminarRecargoCompra = new JButtonMe();
        this.jButtonCancelarRecargoCompra = new JButtonMe();
        this.jButtonGuardarCambiosRecargoCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaRecargoCompra = new JButtonMe();
		this.jButtonCerrarRecargoCompra = new JButtonMe();
		
		this.jScrollPanelDatosRecargoCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionRecargoCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralRecargoCompra = new JScrollPane();
				
		
		
		this.jPanelCamposRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Recargo Compra";
		
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recargo Compraes" + this.sPath));
		} else {
			this.jScrollPanelDatosRecargoCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRecargoCompra.setName("jPanelCamposRecargoCompra"); 

		this.jPanelCamposOcultosRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRecargoCompra.setName("jPanelCamposOcultosRecargoCompra"); 

        this.jPanelAccionesRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRecargoCompra.setToolTipText("Acciones");
        this.jPanelAccionesRecargoCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRecargoCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRecargoCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRecargoCompra.setText("Nuevo");
		this.jButtonModificarRecargoCompra.setText("Editar");
        this.jButtonActualizarRecargoCompra.setText("Actualizar");
        this.jButtonEliminarRecargoCompra.setText("Eliminar");
        this.jButtonCancelarRecargoCompra.setText("Cancelar");
        this.jButtonGuardarCambiosRecargoCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaRecargoCompra.setText("Guardar");
		this.jButtonCerrarRecargoCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRecargoCompra,"nuevo_button","Nuevo",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRecargoCompra,"modificar_button","Editar",this.recargocompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRecargoCompra,"actualizar_button","Actualizar",this.recargocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRecargoCompra,"eliminar_button","Eliminar",this.recargocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRecargoCompra,"cancelar_button","Cancelar",this.recargocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRecargoCompra,"guardarcambios_button","Guardar",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRecargoCompra,"guardarcambiostabla_button","Guardar",this.recargocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRecargoCompra,"cerrar_button","Salir",this.recargocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRecargoCompra.setToolTipText("Nuevo"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRecargoCompra.setToolTipText("Editar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRecargoCompra.setToolTipText("Actualizar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRecargoCompra.setToolTipText("Eliminar)"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRecargoCompra.setToolTipText("Cancelar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRecargoCompra.setToolTipText("Guardar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRecargoCompra.setToolTipText("Guardar"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRecargoCompra.setToolTipText("Salir"+" "+RecargoCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRecargoCompra";
		inputMap = this.jButtonNuevoRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRecargoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRecargoCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRecargoCompra";
		inputMap = this.jButtonActualizarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRecargoCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarRecargoCompra";
		inputMap = this.jButtonEliminarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRecargoCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarRecargoCompra";
		inputMap = this.jButtonCancelarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRecargoCompra"));
		
		//CERRAR		
		sMapKey = "CerrarRecargoCompra";
		inputMap = this.jButtonCerrarRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRecargoCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRecargoCompra";
		inputMap = this.jButtonGuardarCambiosTablaRecargoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRecargoCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRecargoCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRecargoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRecargoCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRecargoCompra.setToolTipText("Nuevo RecargoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRecargoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRecargoCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRecargoCompra.setToolTipText("Sin Cerrar Ventana RecargoCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRecargoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRecargoCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRecargoCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRecargoCompra.setText("Accion");
		this.jComboBoxTiposAccionesRecargoCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRecargoCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRecargoCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRecargoCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRecargoCompra = new JLabelMe();
		
		this.jLabelAccionesRecargoCompra.setText("Acciones");		
		this.jLabelAccionesRecargoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecargoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecargoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRecargoCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRecargoCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRecargoCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesRecargoCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRecargoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRecargoCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecargoCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecargoCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRecargoCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRecargoCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRecargoCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRecargoCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRecargoCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRecargoCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRecargoCompra = new GridBagLayout();
		
		this.jPanelCamposRecargoCompra.setLayout(gridaBagLayoutCamposRecargoCompra);
		this.jPanelCamposOcultosRecargoCompra.setLayout(gridaBagLayoutCamposOcultosRecargoCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRecargoCompra.add(jLabelIdRecargoCompra, this.gridBagConstraintsRecargoCompra);



	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRecargoCompra.add(jLabelidRecargoCompra, this.gridBagConstraintsRecargoCompra);


	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRecargoCompra.add(jLabelid_empresaRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 2;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRecargoCompra.add(jButtonid_empresaRecargoCompraBusqueda, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 3;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRecargoCompra.add(jButtonid_empresaRecargoCompraUpdate, this.gridBagConstraintsRecargoCompra);
	}

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRecargoCompra.add(jComboBoxid_empresaRecargoCompra, this.gridBagConstraintsRecargoCompra);


	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRecargoCompra.add(jLabelnombreRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 2;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRecargoCompra.add(jButtonnombreRecargoCompraBusqueda, this.gridBagConstraintsRecargoCompra);
	}

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRecargoCompra.add(jTextFieldnombreRecargoCompra, this.gridBagConstraintsRecargoCompra);


	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jLabelid_cuenta_contable_debitoRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 2;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jButtonid_cuenta_contable_debitoRecargoCompra, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 3;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jButtonid_cuenta_contable_debitoRecargoCompraArbol, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 4;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jButtonid_cuenta_contable_debitoRecargoCompraBusqueda, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 5;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jButtonid_cuenta_contable_debitoRecargoCompraUpdate, this.gridBagConstraintsRecargoCompra);
	}

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoRecargoCompra.add(jComboBoxid_cuenta_contable_debitoRecargoCompra, this.gridBagConstraintsRecargoCompra);


	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jLabelid_cuenta_contable_creditoRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 2;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jButtonid_cuenta_contable_creditoRecargoCompra, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 3;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jButtonid_cuenta_contable_creditoRecargoCompraArbol, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 4;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jButtonid_cuenta_contable_creditoRecargoCompraBusqueda, this.gridBagConstraintsRecargoCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 5;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jButtonid_cuenta_contable_creditoRecargoCompraUpdate, this.gridBagConstraintsRecargoCompra);
	}

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoRecargoCompra.add(jComboBoxid_cuenta_contable_creditoRecargoCompra, this.gridBagConstraintsRecargoCompra);


	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 0;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_servicioRecargoCompra.add(jLabeles_servicioRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		//this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = 2;
		this.gridBagConstraintsRecargoCompra.ipadx = 0;
		this.gridBagConstraintsRecargoCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_servicioRecargoCompra.add(jButtones_servicioRecargoCompraBusqueda, this.gridBagConstraintsRecargoCompra);
	}

	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecargoCompra.gridy = 0;
	this.gridBagConstraintsRecargoCompra.gridx = 1;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_servicioRecargoCompra.add(jCheckBoxes_servicioRecargoCompra, this.gridBagConstraintsRecargoCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecargoCompra.add(this.jPanelidRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposRecargoCompra % 1==0) {
		iXPanelCamposRecargoCompra=0;
		iYPanelCamposRecargoCompra++;
	}
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecargoCompra.add(this.jPanelnombreRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposRecargoCompra % 1==0) {
		iXPanelCamposRecargoCompra=0;
		iYPanelCamposRecargoCompra++;
	}
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecargoCompra.add(this.jPanelid_cuenta_contable_debitoRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposRecargoCompra % 1==0) {
		iXPanelCamposRecargoCompra=0;
		iYPanelCamposRecargoCompra++;
	}
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecargoCompra.add(this.jPanelid_cuenta_contable_creditoRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposRecargoCompra % 1==0) {
		iXPanelCamposRecargoCompra=0;
		iYPanelCamposRecargoCompra++;
	}
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecargoCompra.add(this.jPaneles_servicioRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposRecargoCompra % 1==0) {
		iXPanelCamposRecargoCompra=0;
		iYPanelCamposRecargoCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecargoCompra.gridy = iYPanelCamposOcultosRecargoCompra;
	this.gridBagConstraintsRecargoCompra.gridx = iXPanelCamposOcultosRecargoCompra++;
	this.gridBagConstraintsRecargoCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecargoCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRecargoCompra.add(this.jPanelid_empresaRecargoCompra, this.gridBagConstraintsRecargoCompra);



	if(iXPanelCamposOcultosRecargoCompra % 1==0) {
		iXPanelCamposOcultosRecargoCompra=0;
		iYPanelCamposOcultosRecargoCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesRecargoCompra= new GridBagLayout();
		this.jPanelAccionesRecargoCompra.setLayout(gridaBagLayoutAccionesRecargoCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRecargoCompra= new GridBagLayout();
		this.jPanelAccionesFormularioRecargoCompra.setLayout(gridaBagLayoutAccionesFormularioRecargoCompra);
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRecargoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRecargoCompra.add(this.jComboBoxTiposAccionesFormularioRecargoCompra, this.gridBagConstraintsRecargoCompra);

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRecargoCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRecargoCompra.add(this.jCheckBoxPostAccionNuevoRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRecargoCompra.add(this.jCheckBoxPostAccionSinCerrarRecargoCompra, this.gridBagConstraintsRecargoCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.recargocompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.recargocompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRecargoCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRecargoCompra.add(this.jCheckBoxPostAccionSinMensajeRecargoCompra, this.gridBagConstraintsRecargoCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesRecargoCompra.add(this.jButtonModificarRecargoCompra, this.gridBagConstraintsRecargoCompra);							

		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecargoCompra.gridy = 0;
		this.gridBagConstraintsRecargoCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesRecargoCompra.add(this.jButtonEliminarRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = 0;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesRecargoCompra.add(this.jButtonActualizarRecargoCompra, this.gridBagConstraintsRecargoCompra);


		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = 0;		
		this.gridBagConstraintsRecargoCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesRecargoCompra.add(this.jButtonGuardarCambiosRecargoCompra, this.gridBagConstraintsRecargoCompra);	
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = 0;		
		this.gridBagConstraintsRecargoCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesRecargoCompra.add(this.jButtonCancelarRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRecargoCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRecargoCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recargocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();						
			this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRecargoCompra.gridx = 0;		
			//this.gridBagConstraintsRecargoCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRecargoCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRecargoCompra.gridx =0;
		this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRecargoCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRecargoCompra, this.gridBagConstraintsRecargoCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RecargoCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRecargoCompra = new RecargoCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Recargo Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Recargo Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recargo Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RecargoCompraModel recargocompraModel=new RecargoCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//RecargoCompraModel.RecargoCompraFocusTraversalPolicy recargocompraFocusTraversalPolicy = recargocompraModel.new RecargoCompraFocusTraversalPolicy(this);
			
			//recargocompraFocusTraversalPolicy.setrecargocompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(recargocompraModel);
			
			
			this.jContentPaneDetalleRecargoCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRecargoCompra = new GridBagLayout();	
			this.jContentPaneDetalleRecargoCompra.setLayout(gridaBagLayoutDetalleRecargoCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRecargoCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
				this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRecargoCompra.gridx = 0;
					
				
				this.jContentPaneDetalleRecargoCompra.add(jTtoolBarDetalleRecargoCompra, gridBagConstraintsRecargoCompra);								
				
}
			
			this.jScrollPanelDatosEdicionRecargoCompra=   new JScrollPane(jContentPaneDetalleRecargoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRecargoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecargoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecargoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRecargoCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRecargoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecargoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecargoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRecargoCompra.gridx = 0;
	        
			this.jContentPaneDetalleRecargoCompra.add(jPanelCamposRecargoCompra, gridBagConstraintsRecargoCompra);
			
			
			
			
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
						&& recargocompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.recargocompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRecargoCompra= new GridBagConstraints();
						this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRecargoCompra.gridx = 0;
						this.jContentPaneDetalleRecargoCompra.add(this.jTabbedPaneRelacionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRecargoCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRecargoCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
					this.gridBagConstraintsRecargoCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRecargoCompra.gridx = 0;
					
				
					this.jContentPaneDetalleRecargoCompra.add(jPanelCamposOcultosRecargoCompra, gridBagConstraintsRecargoCompra);
				
					this.jPanelCamposOcultosRecargoCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRecargoCompra.gridx = 0;
	        this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRecargoCompra.add(this.jPanelAccionesFormularioRecargoCompra, this.gridBagConstraintsRecargoCompra);							
			
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
	        this.gridBagConstraintsRecargoCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRecargoCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleRecargoCompra.add(this.jPanelAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRecargoCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRecargoCompra=   new JScrollPane(this.jPanelCamposRecargoCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRecargoCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecargoCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecargoCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRecargoCompra.gridx = 0;
			this.gridBagConstraintsRecargoCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRecargoCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRecargoCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRecargoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRecargoCompra, this.gridBagConstraintsRecargoCompra);			
			
			this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
			this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRecargoCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRecargoCompra, this.gridBagConstraintsRecargoCompra);
			
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRecargoCompra, this.gridBagConstraintsRecargoCompra);
		
			
		this.gridBagConstraintsRecargoCompra = new GridBagConstraints();
		this.gridBagConstraintsRecargoCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRecargoCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRecargoCompra, this.gridBagConstraintsRecargoCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRecargoCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionRecargoCompra;
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
