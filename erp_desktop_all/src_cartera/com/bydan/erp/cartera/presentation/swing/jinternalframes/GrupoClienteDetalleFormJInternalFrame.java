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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.GrupoClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class GrupoClienteDetalleFormJInternalFrame extends GrupoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoCliente;
	
	protected JMenuBar jmenuBarDetalleGrupoCliente;
	
	protected JMenu jmenuDetalleGrupoCliente;
	protected JMenu jmenuDetalleArchivoGrupoCliente;
	protected JMenu jmenuDetalleAccionesGrupoCliente;
	protected JMenu jmenuDetalleDatosGrupoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoCliente;	
	protected GridBagConstraints gridBagConstraintsGrupoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public GrupoClienteSessionBean grupoclienteSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame=null;
	public GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGrupoClienteFormaPago=false;
	public GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public GrupoClienteLogic grupoclienteLogic;
	
	public JScrollPane jScrollPanelDatosGrupoCliente;
	public JScrollPane jScrollPanelDatosEdicionGrupoCliente;
	public JScrollPane jScrollPanelDatosGeneralGrupoCliente;
	
	protected JPanel jPanelCamposGrupoCliente;    
	protected JPanel jPanelCamposOcultosGrupoCliente;    	
	protected JPanel jPanelAccionesGrupoCliente;
	protected JPanel jPanelAccionesFormularioGrupoCliente;
    
	
	
	protected Integer iXPanelCamposGrupoCliente=0;
	protected Integer iYPanelCamposGrupoCliente=0;
	
	protected Integer iXPanelCamposOcultosGrupoCliente=0;
	protected Integer iYPanelCamposOcultosGrupoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoCliente;
	public JButton jButtonModificarGrupoCliente;
	public JButton jButtonActualizarGrupoCliente;
    public JButton jButtonEliminarGrupoCliente;
	public JButton jButtonCancelarGrupoCliente;
    public JButton jButtonGuardarCambiosGrupoCliente;
	public JButton jButtonGuardarCambiosTablaGrupoCliente;
	protected JButton jButtonCerrarGrupoCliente;
	
	
	protected JButton jButtonProcesarInformacionGrupoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoCliente;
	protected JButton jButtonModificarToolBarGrupoCliente;
	protected JButton jButtonActualizarToolBarGrupoCliente;
    protected JButton jButtonEliminarToolBarGrupoCliente;
	protected JButton jButtonCancelarToolBarGrupoCliente;
    protected JButton jButtonGuardarCambiosToolBarGrupoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoCliente;
	protected JButton jButtonCerrarToolBarGrupoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoCliente;
	protected JMenuItem jMenuItemModificarGrupoCliente;
	protected JMenuItem jMenuItemActualizarGrupoCliente;
    protected JMenuItem jMenuItemEliminarGrupoCliente;
	protected JMenuItem jMenuItemCancelarGrupoCliente;
    protected JMenuItem jMenuItemGuardarCambiosGrupoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoCliente;
	protected JMenuItem jMenuItemCerrarGrupoCliente;
	protected JMenuItem jMenuItemDetalleCerrarGrupoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoCliente;
	protected JMenuItem jMenuItemMostrarOcultarGrupoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoCliente;
	public JLabel jLabelIdGrupoCliente;
	public JLabel jLabelidGrupoCliente;
	public JButton jButtonidGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoGrupoCliente;
	public JLabel jLabelcodigoGrupoCliente;
	public JTextField jTextFieldcodigoGrupoCliente;
	public JButton jButtoncodigoGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreGrupoCliente;
	public JLabel jLabelnombreGrupoCliente;
	public JTextArea jTextAreanombreGrupoCliente;
	public JScrollPane jscrollPanenombreGrupoCliente;
	public JButton jButtonnombreGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelsiglasGrupoCliente;
	public JLabel jLabelsiglasGrupoCliente;
	public JTextField jTextFieldsiglasGrupoCliente;
	public JButton jButtonsiglasGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialGrupoCliente;
	public JLabel jLabelsecuencialGrupoCliente;
	public JTextField jTextFieldsecuencialGrupoCliente;
	public JButton jButtonsecuencialGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionGrupoCliente;
	public JLabel jLabeldescripcionGrupoCliente;
	public JTextArea jTextAreadescripcionGrupoCliente;
	public JScrollPane jscrollPanedescripcionGrupoCliente;
	public JButton jButtondescripcionGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_proveGrupoCliente;
	public JLabel jLabeles_proveGrupoCliente;
	public JCheckBox jCheckBoxes_proveGrupoCliente;
	public JButton jButtones_proveGrupoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGrupoCliente;
	public JLabel jLabelid_empresaGrupoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGrupoCliente;
	public JButton jButtonid_empresaGrupoCliente= new JButtonMe();
	public JButton jButtonid_empresaGrupoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloGrupoCliente;
	public JLabel jLabelid_moduloGrupoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloGrupoCliente;
	public JButton jButtonid_moduloGrupoCliente= new JButtonMe();
	public JButton jButtonid_moduloGrupoClienteUpdate= new JButtonMe();
	public JButton jButtonid_moduloGrupoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableGrupoCliente;
	public JLabel jLabelid_cuenta_contableGrupoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableGrupoCliente;
	public JButton jButtonid_cuenta_contableGrupoCliente= new JButtonMe();
	public JButton jButtonid_cuenta_contableGrupoClienteUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableGrupoClienteBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableGrupoClienteArbol= new JButtonMe();

	public JPanel jPanelid_centro_costoGrupoCliente;
	public JLabel jLabelid_centro_costoGrupoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoGrupoCliente;
	public JButton jButtonid_centro_costoGrupoCliente= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoClienteUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoClienteBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoGrupoClienteArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoCliente;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GrupoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoCliente=new JPanel();
				this.jPanelAccionesFormularioGrupoCliente=new JPanel();
				this.jmenuBarDetalleGrupoCliente=new JMenuBar();
				this.jTtoolBarDetalleGrupoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoCliente() {
		return this.jButtonActualizarToolBarGrupoCliente;
	}
	
	public JButton getjButtonEliminarToolBarGrupoCliente() {
		return this.jButtonEliminarToolBarGrupoCliente;
	}
	
	public JButton getjButtonCancelarToolBarGrupoCliente() {
		return this.jButtonCancelarToolBarGrupoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoCliente() {
		return this.jButtonProcesarInformacionGrupoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoCliente)	{
		this.jButtonProcesarInformacionGrupoCliente = jButtonProcesarInformacionGrupoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoCliente() {
		return this.jComboBoxTiposAccionesGrupoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoCliente(
			JComboBox jComboBoxTiposRelacionesGrupoCliente) {
		this.jComboBoxTiposRelacionesGrupoCliente = jComboBoxTiposRelacionesGrupoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoCliente(
			JComboBox jComboBoxTiposAccionesGrupoCliente) {
		this.jComboBoxTiposAccionesGrupoCliente = jComboBoxTiposAccionesGrupoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoCliente() {
		return this.jComboBoxTiposAccionesFormularioGrupoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoCliente(
			JComboBox jComboBoxTiposAccionesFormularioGrupoCliente) {
		this.jComboBoxTiposAccionesFormularioGrupoCliente = jComboBoxTiposAccionesFormularioGrupoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupoclienteSessionBean=new GrupoClienteSessionBean();
		
		this.grupoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoCliente=new JButtonMe();
				this.jButtonModificarToolBarGrupoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente,
							"actualizar","actualizar","Actualizar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente,
							"eliminar","eliminar","Eliminar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente,
							"cancelar","cancelar","Cancelar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoCliente,this.jTtoolBarDetalleGrupoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoCliente.add(this.jMenuItemDetalleCerrarGrupoCliente);
		
		this.jmenuDetalleAccionesGrupoCliente.add(this.jMenuItemActualizarGrupoCliente);
		this.jmenuDetalleAccionesGrupoCliente.add(this.jMenuItemEliminarGrupoCliente);
		this.jmenuDetalleAccionesGrupoCliente.add(this.jMenuItemCancelarGrupoCliente);		
		
		//this.jmenuDetalleDatosGrupoCliente.add(this.jMenuItemDetalleAbrirOrderByGrupoCliente);				
		this.jmenuDetalleDatosGrupoCliente.add(this.jMenuItemDetalleMostarOcultarGrupoCliente);				
				
		//this.jmenuDetalleAccionesGrupoCliente.add(this.jMenuItemGuardarCambiosGrupoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoCliente.add(this.jmenuDetalleArchivoGrupoCliente);		
		this.jmenuBarDetalleGrupoCliente.add(this.jmenuDetalleAccionesGrupoCliente);		
		this.jmenuBarDetalleGrupoCliente.add(this.jmenuDetalleDatosGrupoCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoCliente.add(this.jmenuDetalleGrupoCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoCliente);				
	}
	
	
	public void inicializarElementosCamposGrupoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoCliente = new JLabelMe();
		jLabelIdGrupoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoCliente= new GridBagLayout();

		this.jPanelidGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);

		jLabelidGrupoCliente = new JLabel();
		jLabelidGrupoCliente.setText("Id");

		jLabelidGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoGrupoCliente = new JLabelMe();
		this.jLabelcodigoGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoGrupoCliente.setToolTipText("Codigo");
		this.jLabelcodigoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelcodigoGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jTextFieldcodigoGrupoCliente= new JTextFieldMe();

		jTextFieldcodigoGrupoCliente.setEnabled(false);
		jTextFieldcodigoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoGrupoClienteBusqueda= new JButtonMe();
		this.jButtoncodigoGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoGrupoClienteBusqueda.setText("U");
		this.jButtoncodigoGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoGrupoClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreGrupoCliente = new JLabelMe();
		this.jLabelnombreGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreGrupoCliente.setToolTipText("Nombre");
		this.jLabelnombreGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelnombreGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jTextAreanombreGrupoCliente= new JTextAreaMe();
		jTextAreanombreGrupoCliente.setEnabled(false);
		jTextAreanombreGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoCliente.setLineWrap(true);
		jTextAreanombreGrupoCliente.setWrapStyleWord(true);
		jTextAreanombreGrupoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreGrupoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreGrupoCliente = new JScrollPane(jTextAreanombreGrupoCliente);
		jscrollPanenombreGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreGrupoClienteBusqueda= new JButtonMe();
		this.jButtonnombreGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreGrupoClienteBusqueda.setText("U");
		this.jButtonnombreGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreGrupoClienteBusqueda.setVisible(false);		}


					
		this.jLabelsiglasGrupoCliente = new JLabelMe();
		this.jLabelsiglasGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasGrupoCliente.setToolTipText("Siglas");
		this.jLabelsiglasGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelsiglasGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jTextFieldsiglasGrupoCliente= new JTextFieldMe();

		jTextFieldsiglasGrupoCliente.setEnabled(false);
		jTextFieldsiglasGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasGrupoClienteBusqueda= new JButtonMe();
		this.jButtonsiglasGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasGrupoClienteBusqueda.setText("U");
		this.jButtonsiglasGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasGrupoClienteBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialGrupoCliente = new JLabelMe();
		this.jLabelsecuencialGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialGrupoCliente.setToolTipText("Secuencial");
		this.jLabelsecuencialGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelsecuencialGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jTextFieldsecuencialGrupoCliente= new JTextFieldMe();

		jTextFieldsecuencialGrupoCliente.setEnabled(false);
		jTextFieldsecuencialGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencialGrupoCliente.setEnabled(false);
		this.jButtonsecuencialGrupoClienteBusqueda= new JButtonMe();
		this.jButtonsecuencialGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialGrupoClienteBusqueda.setText("U");
		this.jButtonsecuencialGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialGrupoClienteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionGrupoCliente = new JLabelMe();
		this.jLabeldescripcionGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionGrupoCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPaneldescripcionGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jTextAreadescripcionGrupoCliente= new JTextAreaMe();
		jTextAreadescripcionGrupoCliente.setEnabled(false);
		jTextAreadescripcionGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGrupoCliente.setLineWrap(true);
		jTextAreadescripcionGrupoCliente.setWrapStyleWord(true);
		jTextAreadescripcionGrupoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionGrupoCliente.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionGrupoCliente = new JScrollPane(jTextAreadescripcionGrupoCliente);
		jscrollPanedescripcionGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionGrupoClienteBusqueda= new JButtonMe();
		this.jButtondescripcionGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionGrupoClienteBusqueda.setText("U");
		this.jButtondescripcionGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionGrupoClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_proveGrupoCliente = new JLabelMe();
		this.jLabeles_proveGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_ESPROVE+" : *");
		this.jLabeles_proveGrupoCliente.setToolTipText("Es Proveedor");
		this.jLabeles_proveGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_ESPROVE);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPaneles_proveGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jCheckBoxes_proveGrupoCliente= new JCheckBoxMe();
		jCheckBoxes_proveGrupoCliente.setEnabled(false);

		jCheckBoxes_proveGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveGrupoClienteBusqueda= new JButtonMe();
		this.jButtones_proveGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveGrupoClienteBusqueda.setText("U");
		this.jButtones_proveGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveGrupoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGrupoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGrupoCliente = new JLabelMe();
		this.jLabelid_empresaGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGrupoCliente.setToolTipText("Empresa");
		this.jLabelid_empresaGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelid_empresaGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jComboBoxid_empresaGrupoCliente= new JComboBoxMe();
		jComboBoxid_empresaGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGrupoCliente.setEnabled(false);

		this.jButtonid_empresaGrupoCliente= new JButtonMe();
		this.jButtonid_empresaGrupoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoCliente.setText("Buscar");
		this.jButtonid_empresaGrupoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGrupoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoCliente"));

		this.jButtonid_empresaGrupoClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoClienteBusqueda.setText("U");
		this.jButtonid_empresaGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGrupoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaGrupoClienteUpdate= new JButtonMe();
		this.jButtonid_empresaGrupoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoClienteUpdate.setText("U");
		this.jButtonid_empresaGrupoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGrupoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoClienteUpdate"));



					
		this.jLabelid_moduloGrupoCliente = new JLabelMe();
		this.jLabelid_moduloGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloGrupoCliente.setToolTipText("Modulo");
		this.jLabelid_moduloGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelid_moduloGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jComboBoxid_moduloGrupoCliente= new JComboBoxMe();
		jComboBoxid_moduloGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloGrupoCliente.setEnabled(false);

		this.jButtonid_moduloGrupoCliente= new JButtonMe();
		this.jButtonid_moduloGrupoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloGrupoCliente.setText("Buscar");
		this.jButtonid_moduloGrupoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloGrupoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoCliente"));

		this.jButtonid_moduloGrupoClienteBusqueda= new JButtonMe();
		this.jButtonid_moduloGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloGrupoClienteBusqueda.setText("U");
		this.jButtonid_moduloGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloGrupoClienteBusqueda.setVisible(false);		}

		this.jButtonid_moduloGrupoClienteUpdate= new JButtonMe();
		this.jButtonid_moduloGrupoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloGrupoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloGrupoClienteUpdate.setText("U");
		this.jButtonid_moduloGrupoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloGrupoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloGrupoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloGrupoClienteUpdate"));



					
		this.jLabelid_cuenta_contableGrupoCliente = new JLabelMe();
		this.jLabelid_cuenta_contableGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableGrupoCliente.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelid_cuenta_contableGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jComboBoxid_cuenta_contableGrupoCliente= new JComboBoxMe();
		jComboBoxid_cuenta_contableGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableGrupoCliente= new JButtonMe();
		this.jButtonid_cuenta_contableGrupoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGrupoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGrupoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableGrupoCliente.setText("Buscar");
		this.jButtonid_cuenta_contableGrupoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableGrupoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGrupoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGrupoCliente"));

		this.jButtonid_cuenta_contableGrupoClienteBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableGrupoClienteBusqueda.setText("U");
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableGrupoClienteBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableGrupoClienteUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableGrupoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGrupoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableGrupoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableGrupoClienteUpdate.setText("U");
		this.jButtonid_cuenta_contableGrupoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableGrupoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGrupoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGrupoClienteUpdate"));


		jButtonid_cuenta_contableGrupoClienteArbol= new JButtonMe();
		jButtonid_cuenta_contableGrupoClienteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGrupoClienteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGrupoClienteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableGrupoClienteArbol.setText("Arbol");
		jButtonid_cuenta_contableGrupoClienteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableGrupoClienteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableGrupoClienteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableGrupoClienteArbol"));



					
		this.jLabelid_centro_costoGrupoCliente = new JLabelMe();
		this.jLabelid_centro_costoGrupoCliente.setText(""+GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoGrupoCliente.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoGrupoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoGrupoCliente.setToolTipText(GrupoClienteConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutGrupoCliente = new GridBagLayout();
		this.jPanelid_centro_costoGrupoCliente.setLayout(this.gridaBagLayoutGrupoCliente);


		jComboBoxid_centro_costoGrupoCliente= new JComboBoxMe();
		jComboBoxid_centro_costoGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoGrupoCliente= new JButtonMe();
		this.jButtonid_centro_costoGrupoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoGrupoCliente.setText("Buscar");
		this.jButtonid_centro_costoGrupoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoGrupoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoCliente"));

		this.jButtonid_centro_costoGrupoClienteBusqueda= new JButtonMe();
		this.jButtonid_centro_costoGrupoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGrupoClienteBusqueda.setText("U");
		this.jButtonid_centro_costoGrupoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoGrupoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoClienteBusqueda"));

		if(this.grupoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoGrupoClienteBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoGrupoClienteUpdate= new JButtonMe();
		this.jButtonid_centro_costoGrupoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoGrupoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoGrupoClienteUpdate.setText("U");
		this.jButtonid_centro_costoGrupoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoGrupoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoClienteUpdate"));


		jButtonid_centro_costoGrupoClienteArbol= new JButtonMe();
		jButtonid_centro_costoGrupoClienteArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoClienteArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoClienteArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoGrupoClienteArbol.setText("Arbol");
		jButtonid_centro_costoGrupoClienteArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoGrupoClienteArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoGrupoClienteArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoGrupoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoGrupoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoGrupoClienteArbol"));



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
		//this.jInternalFrameDetalleGrupoCliente = new GrupoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoCliente= new GridBagLayout();
		

		
		String sToolTipGrupoCliente="";
		sToolTipGrupoCliente=GrupoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoCliente+="(Cartera.GrupoCliente)";
		}
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoCliente = new JButtonMe();
		this.jButtonModificarGrupoCliente = new JButtonMe();
        this.jButtonActualizarGrupoCliente = new JButtonMe();
        this.jButtonEliminarGrupoCliente = new JButtonMe();
        this.jButtonCancelarGrupoCliente = new JButtonMe();
        this.jButtonGuardarCambiosGrupoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoCliente = new JButtonMe();
		this.jButtonCerrarGrupoCliente = new JButtonMe();
		
		this.jScrollPanelDatosGrupoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Cliente";
		
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoCliente.setName("jPanelCamposGrupoCliente"); 

		this.jPanelCamposOcultosGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoCliente.setName("jPanelCamposOcultosGrupoCliente"); 

        this.jPanelAccionesGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoCliente.setToolTipText("Acciones");
        this.jPanelAccionesGrupoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoCliente.setText("Nuevo");
		this.jButtonModificarGrupoCliente.setText("Editar");
        this.jButtonActualizarGrupoCliente.setText("Actualizar");
        this.jButtonEliminarGrupoCliente.setText("Eliminar");
        this.jButtonCancelarGrupoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoCliente.setText("Guardar");
		this.jButtonCerrarGrupoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoCliente,"nuevo_button","Nuevo",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoCliente,"modificar_button","Editar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoCliente,"actualizar_button","Actualizar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoCliente,"eliminar_button","Eliminar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoCliente,"cancelar_button","Cancelar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoCliente,"guardarcambios_button","Guardar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoCliente,"guardarcambiostabla_button","Guardar",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoCliente,"cerrar_button","Salir",this.grupoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoCliente.setToolTipText("Nuevo"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoCliente.setToolTipText("Editar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoCliente.setToolTipText("Actualizar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoCliente.setToolTipText("Eliminar)"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoCliente.setToolTipText("Cancelar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoCliente.setToolTipText("Guardar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoCliente.setToolTipText("Guardar"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoCliente.setToolTipText("Salir"+" "+GrupoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoCliente";
		inputMap = this.jButtonNuevoGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoCliente";
		inputMap = this.jButtonActualizarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoCliente";
		inputMap = this.jButtonEliminarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoCliente";
		inputMap = this.jButtonCancelarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoCliente";
		inputMap = this.jButtonCerrarGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoCliente";
		inputMap = this.jButtonGuardarCambiosTablaGrupoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoCliente.setToolTipText("Nuevo GrupoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoCliente.setToolTipText("Sin Cerrar Ventana GrupoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoCliente.setText("Accion");
		this.jComboBoxTiposAccionesGrupoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoCliente = new JLabelMe();
		
		this.jLabelAccionesGrupoCliente.setText("Acciones");		
		this.jLabelAccionesGrupoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoCliente = new GridBagLayout();
		
		this.jPanelCamposGrupoCliente.setLayout(gridaBagLayoutCamposGrupoCliente);
		this.jPanelCamposOcultosGrupoCliente.setLayout(gridaBagLayoutCamposOcultosGrupoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoCliente.add(jLabelIdGrupoCliente, this.gridBagConstraintsGrupoCliente);



	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoCliente.add(jLabelidGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGrupoCliente.add(jLabelid_empresaGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoCliente.add(jButtonid_empresaGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 3;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoCliente.add(jButtonid_empresaGrupoClienteUpdate, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGrupoCliente.add(jComboBoxid_empresaGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloGrupoCliente.add(jLabelid_moduloGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloGrupoCliente.add(jButtonid_moduloGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 3;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloGrupoCliente.add(jButtonid_moduloGrupoClienteUpdate, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloGrupoCliente.add(jComboBoxid_moduloGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoGrupoCliente.add(jLabelcodigoGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoGrupoCliente.add(jButtoncodigoGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoGrupoCliente.add(jTextFieldcodigoGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreGrupoCliente.add(jLabelnombreGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreGrupoCliente.add(jButtonnombreGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreGrupoCliente.add(jscrollPanenombreGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasGrupoCliente.add(jLabelsiglasGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasGrupoCliente.add(jButtonsiglasGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasGrupoCliente.add(jTextFieldsiglasGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialGrupoCliente.add(jLabelsecuencialGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialGrupoCliente.add(jButtonsecuencialGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialGrupoCliente.add(jTextFieldsecuencialGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionGrupoCliente.add(jLabeldescripcionGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionGrupoCliente.add(jButtondescripcionGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionGrupoCliente.add(jscrollPanedescripcionGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveGrupoCliente.add(jLabeles_proveGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 2;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveGrupoCliente.add(jButtones_proveGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveGrupoCliente.add(jCheckBoxes_proveGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableGrupoCliente.add(jLabelid_cuenta_contableGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 2;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableGrupoCliente.add(jButtonid_cuenta_contableGrupoCliente, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 3;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableGrupoCliente.add(jButtonid_cuenta_contableGrupoClienteArbol, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 4;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableGrupoCliente.add(jButtonid_cuenta_contableGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 5;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableGrupoCliente.add(jButtonid_cuenta_contableGrupoClienteUpdate, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableGrupoCliente.add(jComboBoxid_cuenta_contableGrupoCliente, this.gridBagConstraintsGrupoCliente);


	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 0;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoGrupoCliente.add(jLabelid_centro_costoGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 2;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoGrupoCliente.add(jButtonid_centro_costoGrupoCliente, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 3;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoGrupoCliente.add(jButtonid_centro_costoGrupoClienteArbol, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 4;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGrupoCliente.add(jButtonid_centro_costoGrupoClienteBusqueda, this.gridBagConstraintsGrupoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		//this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = 5;
		this.gridBagConstraintsGrupoCliente.ipadx = 0;
		this.gridBagConstraintsGrupoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoGrupoCliente.add(jButtonid_centro_costoGrupoClienteUpdate, this.gridBagConstraintsGrupoCliente);
	}

	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoCliente.gridy = 0;
	this.gridBagConstraintsGrupoCliente.gridx = 1;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoGrupoCliente.add(jComboBoxid_centro_costoGrupoCliente, this.gridBagConstraintsGrupoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelidGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelcodigoGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelnombreGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelsiglasGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelsecuencialGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPaneldescripcionGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPaneles_proveGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelid_cuenta_contableGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoCliente.add(this.jPanelid_centro_costoGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposGrupoCliente % 1==0) {
		iXPanelCamposGrupoCliente=0;
		iYPanelCamposGrupoCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposOcultosGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposOcultosGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoCliente.add(this.jPanelid_empresaGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposOcultosGrupoCliente % 1==0) {
		iXPanelCamposOcultosGrupoCliente=0;
		iYPanelCamposOcultosGrupoCliente++;
	}
	this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoCliente.gridy = iYPanelCamposOcultosGrupoCliente;
	this.gridBagConstraintsGrupoCliente.gridx = iXPanelCamposOcultosGrupoCliente++;
	this.gridBagConstraintsGrupoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoCliente.add(this.jPanelid_moduloGrupoCliente, this.gridBagConstraintsGrupoCliente);



	if(iXPanelCamposOcultosGrupoCliente % 1==0) {
		iXPanelCamposOcultosGrupoCliente=0;
		iYPanelCamposOcultosGrupoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoCliente= new GridBagLayout();
		this.jPanelAccionesGrupoCliente.setLayout(gridaBagLayoutAccionesGrupoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoCliente.setLayout(gridaBagLayoutAccionesFormularioGrupoCliente);
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoCliente.add(this.jComboBoxTiposAccionesFormularioGrupoCliente, this.gridBagConstraintsGrupoCliente);

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoCliente.add(this.jCheckBoxPostAccionNuevoGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoCliente.add(this.jCheckBoxPostAccionSinCerrarGrupoCliente, this.gridBagConstraintsGrupoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoCliente.add(this.jCheckBoxPostAccionSinMensajeGrupoCliente, this.gridBagConstraintsGrupoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoCliente.add(this.jButtonModificarGrupoCliente, this.gridBagConstraintsGrupoCliente);							

		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoCliente.gridy = 0;
		this.gridBagConstraintsGrupoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoCliente.add(this.jButtonEliminarGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = 0;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoCliente.add(this.jButtonActualizarGrupoCliente, this.gridBagConstraintsGrupoCliente);


		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = 0;		
		this.gridBagConstraintsGrupoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoCliente.add(this.jButtonGuardarCambiosGrupoCliente, this.gridBagConstraintsGrupoCliente);	
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = 0;		
		this.gridBagConstraintsGrupoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoCliente.add(this.jButtonCancelarGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();						
			this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoCliente.gridx = 0;		
			//this.gridBagConstraintsGrupoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoCliente.gridx =0;
		this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoCliente, this.gridBagConstraintsGrupoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoCliente = new GrupoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoClienteModel grupoclienteModel=new GrupoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoClienteModel.GrupoClienteFocusTraversalPolicy grupoclienteFocusTraversalPolicy = grupoclienteModel.new GrupoClienteFocusTraversalPolicy(this);
			
			//grupoclienteFocusTraversalPolicy.setgrupoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupoclienteModel);
			
			
			this.jContentPaneDetalleGrupoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoCliente = new GridBagLayout();	
			this.jContentPaneDetalleGrupoCliente.setLayout(gridaBagLayoutDetalleGrupoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoCliente.add(jTtoolBarDetalleGrupoCliente, gridBagConstraintsGrupoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoCliente=   new JScrollPane(jContentPaneDetalleGrupoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoCliente.gridx = 0;
	        
			this.jContentPaneDetalleGrupoCliente.add(jPanelCamposGrupoCliente, gridBagConstraintsGrupoCliente);
			
			
			
			
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
						&& grupoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(this.puedeCargarPorParteGrupoClienteFormaPago,false,-1);
					
					if(this.grupoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoCliente= new GridBagConstraints();
						this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoCliente.gridx = 0;
						this.jContentPaneDetalleGrupoCliente.add(this.jTabbedPaneRelacionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
					this.gridBagConstraintsGrupoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoCliente.add(jPanelCamposOcultosGrupoCliente, gridBagConstraintsGrupoCliente);
				
					this.jPanelCamposOcultosGrupoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsGrupoCliente.gridx = 0;
	        this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoCliente.add(this.jPanelAccionesFormularioGrupoCliente, this.gridBagConstraintsGrupoCliente);							
			
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
	        this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsGrupoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoCliente.add(this.jPanelAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoCliente=   new JScrollPane(this.jPanelCamposGrupoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoCliente.gridx = 0;
			this.gridBagConstraintsGrupoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoCliente, this.gridBagConstraintsGrupoCliente);			
			
			this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
			this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoCliente, this.gridBagConstraintsGrupoCliente);
			
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoCliente, this.gridBagConstraintsGrupoCliente);
		
			
		this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
		this.gridBagConstraintsGrupoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoCliente, this.gridBagConstraintsGrupoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				//this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoCliente.gridx = 0;
				//this.jContentPaneDetalleGrupoCliente.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoCliente.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoCliente.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesGrupoCliente.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameGrupoClienteFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(false);
		this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(true);

		this.grupoclienteformapagoBeanSwingJInternalFrame=null;//new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.grupoclienteformapagoBeanSwingJInternalFramePopup=new GrupoClienteFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.grupoclienteformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {

				GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(true);

				this.grupoclienteformapagoBeanSwingJInternalFrame=new GrupoClienteFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.grupoclienteformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.grupoclienteformapagoBeanSwingJInternalFrame.setgrupoclienteformapagoSessionBean(this.grupoclienteformapagoSessionBean);

				//this.gridBagConstraintsGrupoCliente = new GridBagConstraints();
				//this.gridBagConstraintsGrupoCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoCliente.gridx = 0;
				//this.jContentPaneDetalleGrupoCliente.add(this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoCliente.add("Grupo Cliente Forma Pagos",this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoCliente.setComponentAt(iIndexTab,this.grupoclienteformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(false);
				this.grupoclienteformapagoBeanSwingJInternalFrame=null;//new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGrupoClienteFormaPago) {
					this.jTabbedPaneRelacionesGrupoCliente.add("Grupo Cliente Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<GrupoCliente> grupoclientes,GrupoCliente grupocliente,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.grupoclienteLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setgrupoclientesForeignKey(grupoclientes);
					clienteBeanSwingJInternalFrame.setgrupoclienteForeignKey(grupocliente);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidGrupoClienteActual(grupocliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoCliente(true);
					clienteBeanSwingJInternalFrame.setid_grupo_clienteFK_IdGrupoCliente(grupocliente.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoClienteForeignKey(grupocliente,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoCliente");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoCliente");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarGrupoClienteFormaPagoBeanSwingJInternalFrame(List<GrupoCliente> grupoclientes,GrupoCliente grupocliente,GrupoClienteFormaPagoBeanSwingJInternalFrame grupoclienteformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//grupoclienteformapagoBeanSwingJInternalFrame=new GrupoClienteFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					grupoclienteformapagoBeanSwingJInternalFrame.getGrupoClienteFormaPagoLogic().setConnexion(this.grupoclienteLogic.getConnexion());

					grupoclienteformapagoBeanSwingJInternalFrame.setgrupoclientesForeignKey(grupoclientes);
					grupoclienteformapagoBeanSwingJInternalFrame.setgrupoclienteForeignKey(grupocliente);
					grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoCliente(true);
					grupoclienteformapagoBeanSwingJInternalFrame.grupoclienteformapagoSessionBean.setlidGrupoClienteActual(grupocliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					grupoclienteformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyGrupoClienteFormaPago(grupoclienteformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					grupoclienteformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoCliente(true);
					grupoclienteformapagoBeanSwingJInternalFrame.setid_grupo_clienteFK_IdGrupoCliente(grupocliente.getId());

					if(!this.conCargarFormDetalle) {
						grupoclienteformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					grupoclienteformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoClienteForeignKey(grupocliente,1,false,true,true);
					grupoclienteformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					grupoclienteformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoCliente");
					grupoclienteformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoCliente");
					grupoclienteformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoClienteFormaPago(true);
					grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGrupoClienteFormaPago("n",grupoclienteformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, grupoclienteformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					grupoclienteformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					grupoclienteformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsGrupoClienteFormaPago("relacionado");
					} else {
						grupoclienteformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsGrupoClienteFormaPago("no_relacionado");
					}

					grupoclienteformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionGrupoClienteFormaPago().setVisible(false);

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
