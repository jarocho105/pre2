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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.TransaccionesLocalesFacturasConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class TransaccionesLocalesFacturasDetalleFormJInternalFrame extends TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionesLocalesFacturas;
	
	protected JMenuBar jmenuBarDetalleTransaccionesLocalesFacturas;
	
	protected JMenu jmenuDetalleTransaccionesLocalesFacturas;
	protected JMenu jmenuDetalleArchivoTransaccionesLocalesFacturas;
	protected JMenu jmenuDetalleAccionesTransaccionesLocalesFacturas;
	protected JMenu jmenuDetalleDatosTransaccionesLocalesFacturas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionesLocalesFacturas;	
	protected GridBagConstraints gridBagConstraintsTransaccionesLocalesFacturas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionesLocalesFacturas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public TransaccionesLocalesFacturasSessionBean transaccioneslocalesfacturasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public TransaccionesLocalesFacturasLogic transaccioneslocalesfacturasLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionesLocalesFacturas;
	public JScrollPane jScrollPanelDatosEdicionTransaccionesLocalesFacturas;
	public JScrollPane jScrollPanelDatosGeneralTransaccionesLocalesFacturas;
	
	protected JPanel jPanelCamposTransaccionesLocalesFacturas;    
	protected JPanel jPanelCamposOcultosTransaccionesLocalesFacturas;    	
	protected JPanel jPanelAccionesTransaccionesLocalesFacturas;
	protected JPanel jPanelAccionesFormularioTransaccionesLocalesFacturas;
    
	
	
	protected Integer iXPanelCamposTransaccionesLocalesFacturas=0;
	protected Integer iYPanelCamposTransaccionesLocalesFacturas=0;
	
	protected Integer iXPanelCamposOcultosTransaccionesLocalesFacturas=0;
	protected Integer iYPanelCamposOcultosTransaccionesLocalesFacturas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionesLocalesFacturas;
	public JButton jButtonModificarTransaccionesLocalesFacturas;
	public JButton jButtonActualizarTransaccionesLocalesFacturas;
    public JButton jButtonEliminarTransaccionesLocalesFacturas;
	public JButton jButtonCancelarTransaccionesLocalesFacturas;
    public JButton jButtonGuardarCambiosTransaccionesLocalesFacturas;
	public JButton jButtonGuardarCambiosTablaTransaccionesLocalesFacturas;
	protected JButton jButtonCerrarTransaccionesLocalesFacturas;
	
	
	protected JButton jButtonProcesarInformacionTransaccionesLocalesFacturas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonModificarToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonActualizarToolBarTransaccionesLocalesFacturas;
    protected JButton jButtonEliminarToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonCancelarToolBarTransaccionesLocalesFacturas;
    protected JButton jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionesLocalesFacturas;
	protected JButton jButtonCerrarToolBarTransaccionesLocalesFacturas;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionesLocalesFacturas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemModificarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemActualizarTransaccionesLocalesFacturas;
    protected JMenuItem jMenuItemEliminarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemCancelarTransaccionesLocalesFacturas;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemCerrarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionesLocalesFacturas;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionesLocalesFacturas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionesLocalesFacturas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionesLocalesFacturas;
	public JLabel jLabelIdTransaccionesLocalesFacturas;
	public JLabel jLabelidTransaccionesLocalesFacturas;
	public JButton jButtonidTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeTransaccionesLocalesFacturas;
	public JLabel jLabelfecha_desdeTransaccionesLocalesFacturas;
	//public JFormattedTextField jDateChooserfecha_desdeTransaccionesLocalesFacturas;

	public JDateChooser jDateChooserfecha_desdeTransaccionesLocalesFacturas;
	public JButton jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaTransaccionesLocalesFacturas;
	public JLabel jLabelfecha_hastaTransaccionesLocalesFacturas;
	//public JFormattedTextField jDateChooserfecha_hastaTransaccionesLocalesFacturas;

	public JDateChooser jDateChooserfecha_hastaTransaccionesLocalesFacturas;
	public JButton jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteTransaccionesLocalesFacturas;
	public JLabel jLabelnombre_completo_clienteTransaccionesLocalesFacturas;
	public JTextArea jTextAreanombre_completo_clienteTransaccionesLocalesFacturas;
	public JScrollPane jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas;
	public JButton jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaTransaccionesLocalesFacturas;
	public JLabel jLabeltotal_ivaTransaccionesLocalesFacturas;
	public JTextField jTextFieldtotal_ivaTransaccionesLocalesFacturas;
	public JButton jButtontotal_ivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaTransaccionesLocalesFacturas;
	public JLabel jLabeltotal_sin_ivaTransaccionesLocalesFacturas;
	public JTextField jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas;
	public JButton jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoTransaccionesLocalesFacturas;
	public JLabel jLabeltotal_descuentoTransaccionesLocalesFacturas;
	public JTextField jTextFieldtotal_descuentoTransaccionesLocalesFacturas;
	public JButton jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPaneltotalTransaccionesLocalesFacturas;
	public JLabel jLabeltotalTransaccionesLocalesFacturas;
	public JTextField jTextFieldtotalTransaccionesLocalesFacturas;
	public JButton jButtontotalTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelivaTransaccionesLocalesFacturas;
	public JLabel jLabelivaTransaccionesLocalesFacturas;
	public JTextField jTextFieldivaTransaccionesLocalesFacturas;
	public JButton jButtonivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteTransaccionesLocalesFacturas;
	public JLabel jLabelruc_clienteTransaccionesLocalesFacturas;
	public JTextField jTextFieldruc_clienteTransaccionesLocalesFacturas;
	public JButton jButtonruc_clienteTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransaccionesLocalesFacturas;
	public JLabel jLabelid_empresaTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransaccionesLocalesFacturas;
	public JButton jButtonid_empresaTransaccionesLocalesFacturas= new JButtonMe();
	public JButton jButtonid_empresaTransaccionesLocalesFacturasUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioTransaccionesLocalesFacturas;
	public JLabel jLabelid_ejercicioTransaccionesLocalesFacturas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioTransaccionesLocalesFacturas;
	public JButton jButtonid_ejercicioTransaccionesLocalesFacturas= new JButtonMe();
	public JButton jButtonid_ejercicioTransaccionesLocalesFacturasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionesLocalesFacturas;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionesLocalesFacturas=new JPanel();
				this.jPanelAccionesFormularioTransaccionesLocalesFacturas=new JPanel();
				this.jmenuBarDetalleTransaccionesLocalesFacturas=new JMenuBar();
				this.jTtoolBarDetalleTransaccionesLocalesFacturas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionesLocalesFacturasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionesLocalesFacturas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccionesLocalesFacturas() {
		return this.jButtonActualizarToolBarTransaccionesLocalesFacturas;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionesLocalesFacturas() {
		return this.jButtonEliminarToolBarTransaccionesLocalesFacturas;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionesLocalesFacturas() {
		return this.jButtonCancelarToolBarTransaccionesLocalesFacturas;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionesLocalesFacturas() {
		return this.jButtonProcesarInformacionTransaccionesLocalesFacturas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionesLocalesFacturas)	{
		this.jButtonProcesarInformacionTransaccionesLocalesFacturas = jButtonProcesarInformacionTransaccionesLocalesFacturas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposRelacionesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposRelacionesTransaccionesLocalesFacturas = jComboBoxTiposRelacionesTransaccionesLocalesFacturas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposAccionesTransaccionesLocalesFacturas) {
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas = jComboBoxTiposAccionesTransaccionesLocalesFacturas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas() {
		return this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas) {
		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas = jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccioneslocalesfacturasSessionBean=new TransaccionesLocalesFacturasSessionBean();
		
		this.transaccioneslocalesfacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioneslocalesfacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionesLocalesFacturasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionesLocalesFacturasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transacciones Locales Facturas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionesLocalesFacturasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionesLocalesFacturas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionesLocalesFacturas=new JButtonMe();
				this.jButtonModificarToolBarTransaccionesLocalesFacturas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas,
							"actualizar","actualizar","Actualizar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas,
							"eliminar","eliminar","Eliminar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas,
							"cancelar","cancelar","Cancelar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionesLocalesFacturas,this.jTtoolBarDetalleTransaccionesLocalesFacturas,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionesLocalesFacturas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionesLocalesFacturas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionesLocalesFacturas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionesLocalesFacturas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionesLocalesFacturas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionesLocalesFacturas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionesLocalesFacturas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionesLocalesFacturas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionesLocalesFacturas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionesLocalesFacturas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionesLocalesFacturas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionesLocalesFacturas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionesLocalesFacturas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionesLocalesFacturas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionesLocalesFacturas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionesLocalesFacturas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionesLocalesFacturas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionesLocalesFacturas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionesLocalesFacturas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionesLocalesFacturas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionesLocalesFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionesLocalesFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionesLocalesFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionesLocalesFacturas.add(this.jMenuItemDetalleCerrarTransaccionesLocalesFacturas);
		
		this.jmenuDetalleAccionesTransaccionesLocalesFacturas.add(this.jMenuItemActualizarTransaccionesLocalesFacturas);
		this.jmenuDetalleAccionesTransaccionesLocalesFacturas.add(this.jMenuItemEliminarTransaccionesLocalesFacturas);
		this.jmenuDetalleAccionesTransaccionesLocalesFacturas.add(this.jMenuItemCancelarTransaccionesLocalesFacturas);		
		
		//this.jmenuDetalleDatosTransaccionesLocalesFacturas.add(this.jMenuItemDetalleAbrirOrderByTransaccionesLocalesFacturas);				
		this.jmenuDetalleDatosTransaccionesLocalesFacturas.add(this.jMenuItemDetalleMostarOcultarTransaccionesLocalesFacturas);				
				
		//this.jmenuDetalleAccionesTransaccionesLocalesFacturas.add(this.jMenuItemGuardarCambiosTransaccionesLocalesFacturas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionesLocalesFacturas.add(this.jmenuDetalleArchivoTransaccionesLocalesFacturas);		
		this.jmenuBarDetalleTransaccionesLocalesFacturas.add(this.jmenuDetalleAccionesTransaccionesLocalesFacturas);		
		this.jmenuBarDetalleTransaccionesLocalesFacturas.add(this.jmenuDetalleDatosTransaccionesLocalesFacturas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionesLocalesFacturas);				
	}
	
	
	public void inicializarElementosCamposTransaccionesLocalesFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionesLocalesFacturas = new JLabelMe();
		jLabelIdTransaccionesLocalesFacturas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionesLocalesFacturas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionesLocalesFacturas= new GridBagLayout();

		this.jPanelidTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);

		jLabelidTransaccionesLocalesFacturas = new JLabel();
		jLabelidTransaccionesLocalesFacturas.setText("Id");

		jLabelidTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelfecha_desdeTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeTransaccionesLocalesFacturas.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelfecha_desdeTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		//jFormattedTextFieldfecha_desdeTransaccionesLocalesFacturas= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeTransaccionesLocalesFacturas= new JDateChooser();
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setEnabled(false);
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setDate(new Date());
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeTransaccionesLocalesFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelfecha_hastaTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaTransaccionesLocalesFacturas.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelfecha_hastaTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		//jFormattedTextFieldfecha_hastaTransaccionesLocalesFacturas= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaTransaccionesLocalesFacturas= new JDateChooser();
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setEnabled(false);
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setDate(new Date());
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaTransaccionesLocalesFacturas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas= new JTextAreaMe();
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setEnabled(false);
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setLineWrap(true);
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas = new JScrollPane(jTextAreanombre_completo_clienteTransaccionesLocalesFacturas);
		jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabeltotal_ivaTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaTransaccionesLocalesFacturas.setToolTipText("Total Iva");
		this.jLabeltotal_ivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPaneltotal_ivaTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldtotal_ivaTransaccionesLocalesFacturas= new JTextFieldMe();
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaTransaccionesLocalesFacturas.setText("0.0");

		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas= new JTextFieldMe();
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.setText("0.0");

		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPaneltotal_descuentoTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldtotal_descuentoTransaccionesLocalesFacturas= new JTextFieldMe();
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.setText("0.0");

		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabeltotalTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabeltotalTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalTransaccionesLocalesFacturas.setToolTipText("Total");
		this.jLabeltotalTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPaneltotalTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldtotalTransaccionesLocalesFacturas= new JTextFieldMe();
		jTextFieldtotalTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldtotalTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalTransaccionesLocalesFacturas.setText("0.0");

		this.jButtontotalTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabelivaTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelivaTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaTransaccionesLocalesFacturas.setToolTipText("Iva");
		this.jLabelivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelivaTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldivaTransaccionesLocalesFacturas= new JTextFieldMe();
		jTextFieldivaTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldivaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaTransaccionesLocalesFacturas.setText("0.0");

		this.jButtonivaTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelruc_clienteTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clienteTransaccionesLocalesFacturas.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelruc_clienteTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jTextFieldruc_clienteTransaccionesLocalesFacturas= new JTextFieldMe();

		jTextFieldruc_clienteTransaccionesLocalesFacturas.setEnabled(false);
		jTextFieldruc_clienteTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteTransaccionesLocalesFacturasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionesLocalesFacturas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelid_empresaTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransaccionesLocalesFacturas.setToolTipText("Empresa");
		this.jLabelid_empresaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelid_empresaTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jComboBoxid_empresaTransaccionesLocalesFacturas= new JComboBoxMe();
		jComboBoxid_empresaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransaccionesLocalesFacturas.setEnabled(false);

		this.jButtonid_empresaTransaccionesLocalesFacturas= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionesLocalesFacturas.setText("Buscar");
		this.jButtonid_empresaTransaccionesLocalesFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransaccionesLocalesFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesFacturas"));

		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransaccionesLocalesFacturasBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate= new JButtonMe();
		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setText("U");
		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransaccionesLocalesFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionesLocalesFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionesLocalesFacturasUpdate"));



					
		this.jLabelid_ejercicioTransaccionesLocalesFacturas = new JLabelMe();
		this.jLabelid_ejercicioTransaccionesLocalesFacturas.setText(""+TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioTransaccionesLocalesFacturas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioTransaccionesLocalesFacturas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioTransaccionesLocalesFacturas.setToolTipText(TransaccionesLocalesFacturasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		this.jPanelid_ejercicioTransaccionesLocalesFacturas.setLayout(this.gridaBagLayoutTransaccionesLocalesFacturas);


		jComboBoxid_ejercicioTransaccionesLocalesFacturas= new JComboBoxMe();
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.setEnabled(false);

		this.jButtonid_ejercicioTransaccionesLocalesFacturas= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setText("Buscar");
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioTransaccionesLocalesFacturas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesFacturas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesFacturas"));

		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setText("U");
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesFacturasBusqueda"));

		if(this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate= new JButtonMe();
		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setText("U");
		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransaccionesLocalesFacturasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransaccionesLocalesFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransaccionesLocalesFacturasUpdate"));



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
		//this.jInternalFrameDetalleTransaccionesLocalesFacturas = new TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transacciones Locales Facturas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionesLocalesFacturas= new GridBagLayout();
		

		
		String sToolTipTransaccionesLocalesFacturas="";
		sToolTipTransaccionesLocalesFacturas=TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionesLocalesFacturas+="(Sris.TransaccionesLocalesFacturas)";
		}
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionesLocalesFacturas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonModificarTransaccionesLocalesFacturas = new JButtonMe();
        this.jButtonActualizarTransaccionesLocalesFacturas = new JButtonMe();
        this.jButtonEliminarTransaccionesLocalesFacturas = new JButtonMe();
        this.jButtonCancelarTransaccionesLocalesFacturas = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas = new JButtonMe();
		this.jButtonCerrarTransaccionesLocalesFacturas = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionesLocalesFacturas = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transacciones Locales Facturas";
		
		if(!this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transacciones Locales Facturases" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionesLocalesFacturas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionesLocalesFacturas.setName("jPanelCamposTransaccionesLocalesFacturas"); 

		this.jPanelCamposOcultosTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionesLocalesFacturas.setName("jPanelCamposOcultosTransaccionesLocalesFacturas"); 

        this.jPanelAccionesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionesLocalesFacturas.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionesLocalesFacturas.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionesLocalesFacturas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionesLocalesFacturas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionesLocalesFacturas.setText("Nuevo");
		this.jButtonModificarTransaccionesLocalesFacturas.setText("Editar");
        this.jButtonActualizarTransaccionesLocalesFacturas.setText("Actualizar");
        this.jButtonEliminarTransaccionesLocalesFacturas.setText("Eliminar");
        this.jButtonCancelarTransaccionesLocalesFacturas.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionesLocalesFacturas.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setText("Guardar");
		this.jButtonCerrarTransaccionesLocalesFacturas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionesLocalesFacturas,"nuevo_button","Nuevo",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionesLocalesFacturas,"modificar_button","Editar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionesLocalesFacturas,"actualizar_button","Actualizar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionesLocalesFacturas,"eliminar_button","Eliminar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionesLocalesFacturas,"cancelar_button","Cancelar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionesLocalesFacturas,"guardarcambios_button","Guardar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas,"guardarcambiostabla_button","Guardar",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionesLocalesFacturas,"cerrar_button","Salir",this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionesLocalesFacturas.setToolTipText("Nuevo"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionesLocalesFacturas.setToolTipText("Editar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionesLocalesFacturas.setToolTipText("Actualizar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionesLocalesFacturas.setToolTipText("Eliminar)"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionesLocalesFacturas.setToolTipText("Cancelar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionesLocalesFacturas.setToolTipText("Guardar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.setToolTipText("Guardar"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionesLocalesFacturas.setToolTipText("Salir"+" "+TransaccionesLocalesFacturasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionesLocalesFacturas";
		inputMap = this.jButtonNuevoTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionesLocalesFacturas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionesLocalesFacturas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionesLocalesFacturas";
		inputMap = this.jButtonActualizarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionesLocalesFacturas"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionesLocalesFacturas";
		inputMap = this.jButtonEliminarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionesLocalesFacturas"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCancelarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionesLocalesFacturas"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionesLocalesFacturas";
		inputMap = this.jButtonCerrarTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionesLocalesFacturas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionesLocalesFacturas";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionesLocalesFacturas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionesLocalesFacturas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas.setToolTipText("Nuevo TransaccionesLocalesFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas.setToolTipText("Sin Cerrar Ventana TransaccionesLocalesFacturas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionesLocalesFacturas = new JLabelMe();
		
		this.jLabelAccionesTransaccionesLocalesFacturas.setText("Acciones");		
		this.jLabelAccionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionesLocalesFacturas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionesLocalesFacturas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionesLocalesFacturas=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionesLocalesFacturas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionesLocalesFacturas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionesLocalesFacturas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionesLocalesFacturas = new GridBagLayout();
		
		this.jPanelCamposTransaccionesLocalesFacturas.setLayout(gridaBagLayoutCamposTransaccionesLocalesFacturas);
		this.jPanelCamposOcultosTransaccionesLocalesFacturas.setLayout(gridaBagLayoutCamposOcultosTransaccionesLocalesFacturas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionesLocalesFacturas.add(jLabelIdTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionesLocalesFacturas.add(jLabelidTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransaccionesLocalesFacturas.add(jLabelid_empresaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionesLocalesFacturas.add(jButtonid_empresaTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 3;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionesLocalesFacturas.add(jButtonid_empresaTransaccionesLocalesFacturasUpdate, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransaccionesLocalesFacturas.add(jComboBoxid_empresaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioTransaccionesLocalesFacturas.add(jLabelid_ejercicioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransaccionesLocalesFacturas.add(jButtonid_ejercicioTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 3;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransaccionesLocalesFacturas.add(jButtonid_ejercicioTransaccionesLocalesFacturasUpdate, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioTransaccionesLocalesFacturas.add(jComboBoxid_ejercicioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeTransaccionesLocalesFacturas.add(jLabelfecha_desdeTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeTransaccionesLocalesFacturas.add(jButtonfecha_desdeTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeTransaccionesLocalesFacturas.add(jDateChooserfecha_desdeTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaTransaccionesLocalesFacturas.add(jLabelfecha_hastaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaTransaccionesLocalesFacturas.add(jButtonfecha_hastaTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaTransaccionesLocalesFacturas.add(jDateChooserfecha_hastaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.add(jLabelnombre_completo_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.add(jButtonnombre_completo_clienteTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas.add(jscrollPanenombre_completo_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaTransaccionesLocalesFacturas.add(jLabeltotal_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaTransaccionesLocalesFacturas.add(jButtontotal_ivaTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaTransaccionesLocalesFacturas.add(jTextFieldtotal_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.add(jLabeltotal_sin_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.add(jButtontotal_sin_ivaTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas.add(jTextFieldtotal_sin_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoTransaccionesLocalesFacturas.add(jLabeltotal_descuentoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoTransaccionesLocalesFacturas.add(jButtontotal_descuentoTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoTransaccionesLocalesFacturas.add(jTextFieldtotal_descuentoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalTransaccionesLocalesFacturas.add(jLabeltotalTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalTransaccionesLocalesFacturas.add(jButtontotalTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalTransaccionesLocalesFacturas.add(jTextFieldtotalTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaTransaccionesLocalesFacturas.add(jLabelivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaTransaccionesLocalesFacturas.add(jButtonivaTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaTransaccionesLocalesFacturas.add(jTextFieldivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteTransaccionesLocalesFacturas.add(jLabelruc_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 2;
		this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteTransaccionesLocalesFacturas.add(jButtonruc_clienteTransaccionesLocalesFacturasBusqueda, this.gridBagConstraintsTransaccionesLocalesFacturas);
	}

	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 1;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteTransaccionesLocalesFacturas.add(jTextFieldruc_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelidTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelfecha_desdeTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelfecha_hastaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelnombre_completo_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPaneltotal_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPaneltotal_sin_ivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPaneltotal_descuentoTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPaneltotalTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelivaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionesLocalesFacturas.add(this.jPanelruc_clienteTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposTransaccionesLocalesFacturas=0;
		iYPanelCamposTransaccionesLocalesFacturas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposOcultosTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposOcultosTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionesLocalesFacturas.add(this.jPanelid_empresaTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposOcultosTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposOcultosTransaccionesLocalesFacturas=0;
		iYPanelCamposOcultosTransaccionesLocalesFacturas++;
	}
	this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iYPanelCamposOcultosTransaccionesLocalesFacturas;
	this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iXPanelCamposOcultosTransaccionesLocalesFacturas++;
	this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionesLocalesFacturas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionesLocalesFacturas.add(this.jPanelid_ejercicioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);



	if(iXPanelCamposOcultosTransaccionesLocalesFacturas % 1==0) {
		iXPanelCamposOcultosTransaccionesLocalesFacturas=0;
		iYPanelCamposOcultosTransaccionesLocalesFacturas++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccionesLocalesFacturas= new GridBagLayout();
		this.jPanelAccionesTransaccionesLocalesFacturas.setLayout(gridaBagLayoutAccionesTransaccionesLocalesFacturas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionesLocalesFacturas= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionesLocalesFacturas.setLayout(gridaBagLayoutAccionesFormularioTransaccionesLocalesFacturas);
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionesLocalesFacturas.add(this.jComboBoxTiposAccionesFormularioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonModificarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);							

		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonEliminarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonActualizarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);


		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonGuardarCambiosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);	
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = 0;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionesLocalesFacturas.add(this.jButtonCancelarTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionesLocalesFacturas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionesLocalesFacturas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioneslocalesfacturasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;		
			//this.gridBagConstraintsTransaccionesLocalesFacturas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionesLocalesFacturas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =0;
		this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionesLocalesFacturas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionesLocalesFacturasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionesLocalesFacturas = new TransaccionesLocalesFacturasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transacciones Locales Facturas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transacciones Locales Facturas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transacciones Locales Facturas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionesLocalesFacturasModel transaccioneslocalesfacturasModel=new TransaccionesLocalesFacturasModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionesLocalesFacturasModel.TransaccionesLocalesFacturasFocusTraversalPolicy transaccioneslocalesfacturasFocusTraversalPolicy = transaccioneslocalesfacturasModel.new TransaccionesLocalesFacturasFocusTraversalPolicy(this);
			
			//transaccioneslocalesfacturasFocusTraversalPolicy.settransaccioneslocalesfacturasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccioneslocalesfacturasModel);
			
			
			this.jContentPaneDetalleTransaccionesLocalesFacturas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionesLocalesFacturas = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionesLocalesFacturas.setLayout(gridaBagLayoutDetalleTransaccionesLocalesFacturas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionesLocalesFacturas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionesLocalesFacturas.add(jTtoolBarDetalleTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas=   new JScrollPane(jContentPaneDetalleTransaccionesLocalesFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	        
			this.jContentPaneDetalleTransaccionesLocalesFacturas.add(jPanelCamposTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);
			
			
			
			
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
						//&& transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transaccioneslocalesfacturasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionesLocalesFacturas= new GridBagConstraints();
						this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
						this.jContentPaneDetalleTransaccionesLocalesFacturas.add(this.jTabbedPaneRelacionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionesLocalesFacturas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionesLocalesFacturas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
					this.gridBagConstraintsTransaccionesLocalesFacturas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionesLocalesFacturas.add(jPanelCamposOcultosTransaccionesLocalesFacturas, gridBagConstraintsTransaccionesLocalesFacturas);
				
					this.jPanelCamposOcultosTransaccionesLocalesFacturas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	        this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionesLocalesFacturas.add(this.jPanelAccionesFormularioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);							
			
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionesLocalesFacturas.add(this.jPanelAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionesLocalesFacturas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas=   new JScrollPane(this.jPanelCamposTransaccionesLocalesFacturas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
			this.gridBagConstraintsTransaccionesLocalesFacturas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionesLocalesFacturas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionesLocalesFacturas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);			
			
			this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
			
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		
			
		this.gridBagConstraintsTransaccionesLocalesFacturas = new GridBagConstraints();
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionesLocalesFacturas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionesLocalesFacturas, this.gridBagConstraintsTransaccionesLocalesFacturas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionesLocalesFacturas;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionesLocalesFacturas;
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
