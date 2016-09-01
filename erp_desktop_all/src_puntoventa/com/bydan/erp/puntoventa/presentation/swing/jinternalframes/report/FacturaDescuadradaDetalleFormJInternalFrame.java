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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.FacturaDescuadradaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class FacturaDescuadradaDetalleFormJInternalFrame extends FacturaDescuadradaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaDescuadrada;
	
	protected JMenuBar jmenuBarDetalleFacturaDescuadrada;
	
	protected JMenu jmenuDetalleFacturaDescuadrada;
	protected JMenu jmenuDetalleArchivoFacturaDescuadrada;
	protected JMenu jmenuDetalleAccionesFacturaDescuadrada;
	protected JMenu jmenuDetalleDatosFacturaDescuadrada;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaDescuadrada;	
	protected GridBagConstraints gridBagConstraintsFacturaDescuadrada;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaDescuadradaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaDescuadrada;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FacturaDescuadradaSessionBean facturadescuadradaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public FacturaDescuadradaLogic facturadescuadradaLogic;
	
	public JScrollPane jScrollPanelDatosFacturaDescuadrada;
	public JScrollPane jScrollPanelDatosEdicionFacturaDescuadrada;
	public JScrollPane jScrollPanelDatosGeneralFacturaDescuadrada;
	
	protected JPanel jPanelCamposFacturaDescuadrada;    
	protected JPanel jPanelCamposOcultosFacturaDescuadrada;    	
	protected JPanel jPanelAccionesFacturaDescuadrada;
	protected JPanel jPanelAccionesFormularioFacturaDescuadrada;
    
	
	
	protected Integer iXPanelCamposFacturaDescuadrada=0;
	protected Integer iYPanelCamposFacturaDescuadrada=0;
	
	protected Integer iXPanelCamposOcultosFacturaDescuadrada=0;
	protected Integer iYPanelCamposOcultosFacturaDescuadrada=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaDescuadrada;
	public JButton jButtonModificarFacturaDescuadrada;
	public JButton jButtonActualizarFacturaDescuadrada;
    public JButton jButtonEliminarFacturaDescuadrada;
	public JButton jButtonCancelarFacturaDescuadrada;
    public JButton jButtonGuardarCambiosFacturaDescuadrada;
	public JButton jButtonGuardarCambiosTablaFacturaDescuadrada;
	protected JButton jButtonCerrarFacturaDescuadrada;
	
	
	protected JButton jButtonProcesarInformacionFacturaDescuadrada;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaDescuadrada;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaDescuadrada;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaDescuadrada;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaDescuadrada;
	protected JButton jButtonModificarToolBarFacturaDescuadrada;
	protected JButton jButtonActualizarToolBarFacturaDescuadrada;
    protected JButton jButtonEliminarToolBarFacturaDescuadrada;
	protected JButton jButtonCancelarToolBarFacturaDescuadrada;
    protected JButton jButtonGuardarCambiosToolBarFacturaDescuadrada;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaDescuadrada;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaDescuadrada;
	protected JButton jButtonCerrarToolBarFacturaDescuadrada;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaDescuadrada;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaDescuadrada;
	protected JMenuItem jMenuItemModificarFacturaDescuadrada;
	protected JMenuItem jMenuItemActualizarFacturaDescuadrada;
    protected JMenuItem jMenuItemEliminarFacturaDescuadrada;
	protected JMenuItem jMenuItemCancelarFacturaDescuadrada;
    protected JMenuItem jMenuItemGuardarCambiosFacturaDescuadrada;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaDescuadrada;
	protected JMenuItem jMenuItemCerrarFacturaDescuadrada;
	protected JMenuItem jMenuItemDetalleCerrarFacturaDescuadrada;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaDescuadrada;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaDescuadrada;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaDescuadrada;
	protected JMenuItem jMenuItemMostrarOcultarFacturaDescuadrada;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaDescuadrada;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaDescuadrada;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaDescuadrada;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaDescuadrada;
	public JLabel jLabelIdFacturaDescuadrada;
	public JLabel jLabelidFacturaDescuadrada;
	public JButton jButtonidFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioFacturaDescuadrada;
	public JLabel jLabelfecha_inicioFacturaDescuadrada;
	//public JFormattedTextField jDateChooserfecha_inicioFacturaDescuadrada;

	public JDateChooser jDateChooserfecha_inicioFacturaDescuadrada;
	public JButton jButtonfecha_inicioFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finFacturaDescuadrada;
	public JLabel jLabelfecha_finFacturaDescuadrada;
	//public JFormattedTextField jDateChooserfecha_finFacturaDescuadrada;

	public JDateChooser jDateChooserfecha_finFacturaDescuadrada;
	public JButton jButtonfecha_finFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialFacturaDescuadrada;
	public JLabel jLabelsecuencialFacturaDescuadrada;
	public JTextField jTextFieldsecuencialFacturaDescuadrada;
	public JButton jButtonsecuencialFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelfechaFacturaDescuadrada;
	public JLabel jLabelfechaFacturaDescuadrada;
	//public JFormattedTextField jDateChooserfechaFacturaDescuadrada;

	public JDateChooser jDateChooserfechaFacturaDescuadrada;
	public JButton jButtonfechaFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalFacturaDescuadrada;
	public JLabel jLabelsubtotalFacturaDescuadrada;
	public JTextField jTextFieldsubtotalFacturaDescuadrada;
	public JButton jButtonsubtotalFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelivaFacturaDescuadrada;
	public JLabel jLabelivaFacturaDescuadrada;
	public JTextField jTextFieldivaFacturaDescuadrada;
	public JButton jButtonivaFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoFacturaDescuadrada;
	public JLabel jLabeldescuentoFacturaDescuadrada;
	public JTextField jTextFielddescuentoFacturaDescuadrada;
	public JButton jButtondescuentoFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoFacturaDescuadrada;
	public JLabel jLabelfinanciamientoFacturaDescuadrada;
	public JTextField jTextFieldfinanciamientoFacturaDescuadrada;
	public JButton jButtonfinanciamientoFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPanelfleteFacturaDescuadrada;
	public JLabel jLabelfleteFacturaDescuadrada;
	public JTextField jTextFieldfleteFacturaDescuadrada;
	public JButton jButtonfleteFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPaneliceFacturaDescuadrada;
	public JLabel jLabeliceFacturaDescuadrada;
	public JTextField jTextFieldiceFacturaDescuadrada;
	public JButton jButtoniceFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturaDescuadrada;
	public JLabel jLabeltotalFacturaDescuadrada;
	public JTextField jTextFieldtotalFacturaDescuadrada;
	public JButton jButtontotalFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_formas_pagoFacturaDescuadrada;
	public JLabel jLabeltotal_formas_pagoFacturaDescuadrada;
	public JTextField jTextFieldtotal_formas_pagoFacturaDescuadrada;
	public JButton jButtontotal_formas_pagoFacturaDescuadradaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_realFacturaDescuadrada;
	public JLabel jLabeldescuento_realFacturaDescuadrada;
	public JTextField jTextFielddescuento_realFacturaDescuadrada;
	public JButton jButtondescuento_realFacturaDescuadradaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaDescuadrada;
	public JLabel jLabelid_empresaFacturaDescuadrada;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaDescuadrada;
	public JButton jButtonid_empresaFacturaDescuadrada= new JButtonMe();
	public JButton jButtonid_empresaFacturaDescuadradaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaDescuadradaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaDescuadrada;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturaDescuadradaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaDescuadrada=new JPanel();
				this.jPanelAccionesFormularioFacturaDescuadrada=new JPanel();
				this.jmenuBarDetalleFacturaDescuadrada=new JMenuBar();
				this.jTtoolBarDetalleFacturaDescuadrada=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaDescuadradaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDescuadradaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaDescuadrada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaDescuadrada() {
		return this.jButtonActualizarToolBarFacturaDescuadrada;
	}
	
	public JButton getjButtonEliminarToolBarFacturaDescuadrada() {
		return this.jButtonEliminarToolBarFacturaDescuadrada;
	}
	
	public JButton getjButtonCancelarToolBarFacturaDescuadrada() {
		return this.jButtonCancelarToolBarFacturaDescuadrada;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaDescuadrada() {
		return this.jButtonProcesarInformacionFacturaDescuadrada;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaDescuadrada)	{
		this.jButtonProcesarInformacionFacturaDescuadrada = jButtonProcesarInformacionFacturaDescuadrada;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaDescuadrada() {
		return this.jComboBoxTiposAccionesFacturaDescuadrada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaDescuadrada(
			JComboBox jComboBoxTiposRelacionesFacturaDescuadrada) {
		this.jComboBoxTiposRelacionesFacturaDescuadrada = jComboBoxTiposRelacionesFacturaDescuadrada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaDescuadrada(
			JComboBox jComboBoxTiposAccionesFacturaDescuadrada) {
		this.jComboBoxTiposAccionesFacturaDescuadrada = jComboBoxTiposAccionesFacturaDescuadrada;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaDescuadrada() {
		return this.jComboBoxTiposAccionesFormularioFacturaDescuadrada;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaDescuadrada(
			JComboBox jComboBoxTiposAccionesFormularioFacturaDescuadrada) {
		this.jComboBoxTiposAccionesFormularioFacturaDescuadrada = jComboBoxTiposAccionesFormularioFacturaDescuadrada;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturadescuadradaSessionBean=new FacturaDescuadradaSessionBean();
		
		this.facturadescuadradaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturadescuadradaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturadescuadradaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaDescuadradaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaDescuadradaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Descuadrada MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaDescuadradaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaDescuadrada= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaDescuadrada=new JButtonMe();
				this.jButtonModificarToolBarFacturaDescuadrada=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada,
							"actualizar","actualizar","Actualizar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada,
							"eliminar","eliminar","Eliminar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada,
							"cancelar","cancelar","Cancelar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaDescuadrada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaDescuadrada,this.jTtoolBarDetalleFacturaDescuadrada,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaDescuadrada=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaDescuadrada=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaDescuadrada=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaDescuadrada=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaDescuadrada=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaDescuadrada= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaDescuadrada.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaDescuadrada,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaDescuadrada= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaDescuadrada.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaDescuadrada,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaDescuadrada= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaDescuadrada.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaDescuadrada,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaDescuadrada= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaDescuadrada.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaDescuadrada,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaDescuadrada= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaDescuadrada.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaDescuadrada,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaDescuadrada= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaDescuadrada.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaDescuadrada,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaDescuadrada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaDescuadrada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaDescuadrada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaDescuadrada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaDescuadrada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaDescuadrada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaDescuadrada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaDescuadrada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaDescuadrada,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaDescuadrada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaDescuadrada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaDescuadrada,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaDescuadrada.add(this.jMenuItemDetalleCerrarFacturaDescuadrada);
		
		this.jmenuDetalleAccionesFacturaDescuadrada.add(this.jMenuItemActualizarFacturaDescuadrada);
		this.jmenuDetalleAccionesFacturaDescuadrada.add(this.jMenuItemEliminarFacturaDescuadrada);
		this.jmenuDetalleAccionesFacturaDescuadrada.add(this.jMenuItemCancelarFacturaDescuadrada);		
		
		//this.jmenuDetalleDatosFacturaDescuadrada.add(this.jMenuItemDetalleAbrirOrderByFacturaDescuadrada);				
		this.jmenuDetalleDatosFacturaDescuadrada.add(this.jMenuItemDetalleMostarOcultarFacturaDescuadrada);				
				
		//this.jmenuDetalleAccionesFacturaDescuadrada.add(this.jMenuItemGuardarCambiosFacturaDescuadrada);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaDescuadrada.add(this.jmenuDetalleArchivoFacturaDescuadrada);		
		this.jmenuBarDetalleFacturaDescuadrada.add(this.jmenuDetalleAccionesFacturaDescuadrada);		
		this.jmenuBarDetalleFacturaDescuadrada.add(this.jmenuDetalleDatosFacturaDescuadrada);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturaDescuadrada);				
	}
	
	
	public void inicializarElementosCamposFacturaDescuadrada() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaDescuadrada = new JLabelMe();
		jLabelIdFacturaDescuadrada.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaDescuadrada = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaDescuadrada= new GridBagLayout();

		this.jPanelidFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);

		jLabelidFacturaDescuadrada = new JLabel();
		jLabelidFacturaDescuadrada.setText("Id");

		jLabelidFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioFacturaDescuadrada = new JLabelMe();
		this.jLabelfecha_inicioFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioFacturaDescuadrada.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelfecha_inicioFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		//jFormattedTextFieldfecha_inicioFacturaDescuadrada= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioFacturaDescuadrada= new JDateChooser();
		jDateChooserfecha_inicioFacturaDescuadrada.setEnabled(false);
		jDateChooserfecha_inicioFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioFacturaDescuadrada.setDate(new Date());
		jDateChooserfecha_inicioFacturaDescuadrada.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioFacturaDescuadrada.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setText("U");
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finFacturaDescuadrada = new JLabelMe();
		this.jLabelfecha_finFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finFacturaDescuadrada.setToolTipText("Fecha Fin");
		this.jLabelfecha_finFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelfecha_finFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		//jFormattedTextFieldfecha_finFacturaDescuadrada= new JFormattedTextFieldMe();

		jDateChooserfecha_finFacturaDescuadrada= new JDateChooser();
		jDateChooserfecha_finFacturaDescuadrada.setEnabled(false);
		jDateChooserfecha_finFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finFacturaDescuadrada.setDate(new Date());
		jDateChooserfecha_finFacturaDescuadrada.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finFacturaDescuadrada.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finFacturaDescuadradaBusqueda.setText("U");
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialFacturaDescuadrada = new JLabelMe();
		this.jLabelsecuencialFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialFacturaDescuadrada.setToolTipText("Secuencial");
		this.jLabelsecuencialFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelsecuencialFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldsecuencialFacturaDescuadrada= new JTextFieldMe();

		jTextFieldsecuencialFacturaDescuadrada.setEnabled(false);
		jTextFieldsecuencialFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialFacturaDescuadradaBusqueda.setText("U");
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelfechaFacturaDescuadrada = new JLabelMe();
		this.jLabelfechaFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFacturaDescuadrada.setToolTipText("Fecha");
		this.jLabelfechaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelfechaFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		//jFormattedTextFieldfechaFacturaDescuadrada= new JFormattedTextFieldMe();

		jDateChooserfechaFacturaDescuadrada= new JDateChooser();
		jDateChooserfechaFacturaDescuadrada.setEnabled(false);
		jDateChooserfechaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFacturaDescuadrada.setDate(new Date());
		jDateChooserfechaFacturaDescuadrada.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFacturaDescuadrada.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonfechaFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFacturaDescuadradaBusqueda.setText("U");
		this.jButtonfechaFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalFacturaDescuadrada = new JLabelMe();
		this.jLabelsubtotalFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalFacturaDescuadrada.setToolTipText("Subtotal");
		this.jLabelsubtotalFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelsubtotalFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldsubtotalFacturaDescuadrada= new JTextFieldMe();
		jTextFieldsubtotalFacturaDescuadrada.setEnabled(false);
		jTextFieldsubtotalFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalFacturaDescuadrada.setText("0.0");

		this.jButtonsubtotalFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalFacturaDescuadradaBusqueda.setText("U");
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelivaFacturaDescuadrada = new JLabelMe();
		this.jLabelivaFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFacturaDescuadrada.setToolTipText("Iva");
		this.jLabelivaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelivaFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldivaFacturaDescuadrada= new JTextFieldMe();
		jTextFieldivaFacturaDescuadrada.setEnabled(false);
		jTextFieldivaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFacturaDescuadrada.setText("0.0");

		this.jButtonivaFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonivaFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturaDescuadradaBusqueda.setText("U");
		this.jButtonivaFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoFacturaDescuadrada = new JLabelMe();
		this.jLabeldescuentoFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoFacturaDescuadrada.setToolTipText("Descuento");
		this.jLabeldescuentoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPaneldescuentoFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFielddescuentoFacturaDescuadrada= new JTextFieldMe();
		jTextFielddescuentoFacturaDescuadrada.setEnabled(false);
		jTextFielddescuentoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoFacturaDescuadrada.setText("0.0");

		this.jButtondescuentoFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtondescuentoFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoFacturaDescuadradaBusqueda.setText("U");
		this.jButtondescuentoFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoFacturaDescuadrada = new JLabelMe();
		this.jLabelfinanciamientoFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoFacturaDescuadrada.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelfinanciamientoFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldfinanciamientoFacturaDescuadrada= new JTextFieldMe();
		jTextFieldfinanciamientoFacturaDescuadrada.setEnabled(false);
		jTextFieldfinanciamientoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoFacturaDescuadrada.setText("0.0");

		this.jButtonfinanciamientoFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setText("U");
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabelfleteFacturaDescuadrada = new JLabelMe();
		this.jLabelfleteFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteFacturaDescuadrada.setToolTipText("Flete");
		this.jLabelfleteFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelfleteFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldfleteFacturaDescuadrada= new JTextFieldMe();
		jTextFieldfleteFacturaDescuadrada.setEnabled(false);
		jTextFieldfleteFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteFacturaDescuadrada.setText("0.0");

		this.jButtonfleteFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonfleteFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteFacturaDescuadradaBusqueda.setText("U");
		this.jButtonfleteFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabeliceFacturaDescuadrada = new JLabelMe();
		this.jLabeliceFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceFacturaDescuadrada.setToolTipText("Ice");
		this.jLabeliceFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPaneliceFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldiceFacturaDescuadrada= new JTextFieldMe();
		jTextFieldiceFacturaDescuadrada.setEnabled(false);
		jTextFieldiceFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceFacturaDescuadrada.setText("0.0");

		this.jButtoniceFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtoniceFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceFacturaDescuadradaBusqueda.setText("U");
		this.jButtoniceFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturaDescuadrada = new JLabelMe();
		this.jLabeltotalFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturaDescuadrada.setToolTipText("Total");
		this.jLabeltotalFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPaneltotalFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldtotalFacturaDescuadrada= new JTextFieldMe();
		jTextFieldtotalFacturaDescuadrada.setEnabled(false);
		jTextFieldtotalFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturaDescuadrada.setText("0.0");

		this.jButtontotalFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtontotalFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturaDescuadradaBusqueda.setText("U");
		this.jButtontotalFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_formas_pagoFacturaDescuadrada = new JLabelMe();
		this.jLabeltotal_formas_pagoFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO+" : *");
		this.jLabeltotal_formas_pagoFacturaDescuadrada.setToolTipText("Total Formas Pago");
		this.jLabeltotal_formas_pagoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_formas_pagoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_formas_pagoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_formas_pagoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_formas_pagoFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_formas_pagoFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_TOTALFORMASPAGO);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPaneltotal_formas_pagoFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFieldtotal_formas_pagoFacturaDescuadrada= new JTextFieldMe();
		jTextFieldtotal_formas_pagoFacturaDescuadrada.setEnabled(false);
		jTextFieldtotal_formas_pagoFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_formas_pagoFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_formas_pagoFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_formas_pagoFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_formas_pagoFacturaDescuadrada.setText("0.0");

		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setText("U");
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_formas_pagoFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_formas_pagoFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_formas_pagoFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_formas_pagoFacturaDescuadradaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_realFacturaDescuadrada = new JLabelMe();
		this.jLabeldescuento_realFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL+" : *");
		this.jLabeldescuento_realFacturaDescuadrada.setToolTipText("Descuento Real");
		this.jLabeldescuento_realFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_realFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_realFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_realFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_realFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_realFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_DESCUENTOREAL);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPaneldescuento_realFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jTextFielddescuento_realFacturaDescuadrada= new JTextFieldMe();
		jTextFielddescuento_realFacturaDescuadrada.setEnabled(false);
		jTextFielddescuento_realFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_realFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_realFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_realFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_realFacturaDescuadrada.setText("0.0");

		this.jButtondescuento_realFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_realFacturaDescuadradaBusqueda.setText("U");
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_realFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_realFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_realFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_realFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_realFacturaDescuadradaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturaDescuadrada() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaDescuadrada = new JLabelMe();
		this.jLabelid_empresaFacturaDescuadrada.setText(""+FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaDescuadrada.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaDescuadrada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaDescuadrada.setToolTipText(FacturaDescuadradaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		this.jPanelid_empresaFacturaDescuadrada.setLayout(this.gridaBagLayoutFacturaDescuadrada);


		jComboBoxid_empresaFacturaDescuadrada= new JComboBoxMe();
		jComboBoxid_empresaFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaDescuadrada.setEnabled(false);

		this.jButtonid_empresaFacturaDescuadrada= new JButtonMe();
		this.jButtonid_empresaFacturaDescuadrada.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDescuadrada.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDescuadrada.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaDescuadrada.setText("Buscar");
		this.jButtonid_empresaFacturaDescuadrada.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaDescuadrada.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDescuadrada,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDescuadrada"));

		this.jButtonid_empresaFacturaDescuadradaBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaDescuadradaBusqueda.setText("U");
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDescuadradaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDescuadradaBusqueda"));

		if(this.facturadescuadradaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaDescuadradaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaDescuadradaUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaDescuadradaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDescuadradaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaDescuadradaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaDescuadradaUpdate.setText("U");
		this.jButtonid_empresaFacturaDescuadradaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaDescuadradaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaDescuadradaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaDescuadrada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaDescuadrada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaDescuadradaUpdate"));



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
		//this.jInternalFrameDetalleFacturaDescuadrada = new FacturaDescuadradaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Descuadrada DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaDescuadrada= new GridBagLayout();
		

		
		String sToolTipFacturaDescuadrada="";
		sToolTipFacturaDescuadrada=FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaDescuadrada+="(PuntoVenta.FacturaDescuadrada)";
		}
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaDescuadrada+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaDescuadrada = new JButtonMe();
		this.jButtonModificarFacturaDescuadrada = new JButtonMe();
        this.jButtonActualizarFacturaDescuadrada = new JButtonMe();
        this.jButtonEliminarFacturaDescuadrada = new JButtonMe();
        this.jButtonCancelarFacturaDescuadrada = new JButtonMe();
        this.jButtonGuardarCambiosFacturaDescuadrada = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaDescuadrada = new JButtonMe();
		this.jButtonCerrarFacturaDescuadrada = new JButtonMe();
		
		this.jScrollPanelDatosFacturaDescuadrada = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaDescuadrada = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaDescuadrada = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Descuadrada";
		
		if(!this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Descuadradas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaDescuadrada.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturaDescuadrada.setName("jPanelCamposFacturaDescuadrada"); 

		this.jPanelCamposOcultosFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaDescuadrada.setName("jPanelCamposOcultosFacturaDescuadrada"); 

        this.jPanelAccionesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaDescuadrada.setToolTipText("Acciones");
        this.jPanelAccionesFacturaDescuadrada.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaDescuadrada.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaDescuadrada.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaDescuadrada.setText("Nuevo");
		this.jButtonModificarFacturaDescuadrada.setText("Editar");
        this.jButtonActualizarFacturaDescuadrada.setText("Actualizar");
        this.jButtonEliminarFacturaDescuadrada.setText("Eliminar");
        this.jButtonCancelarFacturaDescuadrada.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaDescuadrada.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.setText("Guardar");
		this.jButtonCerrarFacturaDescuadrada.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaDescuadrada,"nuevo_button","Nuevo",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaDescuadrada,"modificar_button","Editar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaDescuadrada,"actualizar_button","Actualizar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaDescuadrada,"eliminar_button","Eliminar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaDescuadrada,"cancelar_button","Cancelar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaDescuadrada,"guardarcambios_button","Guardar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaDescuadrada,"guardarcambiostabla_button","Guardar",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaDescuadrada,"cerrar_button","Salir",this.facturadescuadradaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaDescuadrada.setToolTipText("Nuevo"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaDescuadrada.setToolTipText("Editar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaDescuadrada.setToolTipText("Actualizar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaDescuadrada.setToolTipText("Eliminar)"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaDescuadrada.setToolTipText("Cancelar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaDescuadrada.setToolTipText("Guardar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.setToolTipText("Guardar"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaDescuadrada.setToolTipText("Salir"+" "+FacturaDescuadradaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaDescuadrada";
		inputMap = this.jButtonNuevoFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaDescuadrada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaDescuadrada"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaDescuadrada";
		inputMap = this.jButtonActualizarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaDescuadrada"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaDescuadrada";
		inputMap = this.jButtonEliminarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaDescuadrada"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaDescuadrada";
		inputMap = this.jButtonCancelarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaDescuadrada"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaDescuadrada";
		inputMap = this.jButtonCerrarFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaDescuadrada"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaDescuadrada";
		inputMap = this.jButtonGuardarCambiosTablaFacturaDescuadrada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaDescuadrada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaDescuadrada"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaDescuadrada.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaDescuadrada.setToolTipText("Nuevo FacturaDescuadrada");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaDescuadrada.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaDescuadrada.setToolTipText("Sin Cerrar Ventana FacturaDescuadrada");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaDescuadrada = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaDescuadrada.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaDescuadrada.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaDescuadrada.setText("Accion");
		this.jComboBoxTiposAccionesFacturaDescuadrada.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaDescuadrada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaDescuadrada = new JLabelMe();
		
		this.jLabelAccionesFacturaDescuadrada.setText("Acciones");		
		this.jLabelAccionesFacturaDescuadrada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDescuadrada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaDescuadrada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaDescuadrada();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaDescuadrada();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaDescuadrada=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaDescuadrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaDescuadrada,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaDescuadrada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaDescuadrada.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaDescuadrada, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaDescuadrada = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaDescuadrada = new GridBagLayout();
		
		this.jPanelCamposFacturaDescuadrada.setLayout(gridaBagLayoutCamposFacturaDescuadrada);
		this.jPanelCamposOcultosFacturaDescuadrada.setLayout(gridaBagLayoutCamposOcultosFacturaDescuadrada);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturaDescuadrada.add(jLabelIdFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturaDescuadrada.add(jLabelidFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturaDescuadrada.add(jLabelid_empresaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaDescuadrada.add(jButtonid_empresaFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 3;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaDescuadrada.add(jButtonid_empresaFacturaDescuadradaUpdate, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturaDescuadrada.add(jComboBoxid_empresaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioFacturaDescuadrada.add(jLabelfecha_inicioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioFacturaDescuadrada.add(jButtonfecha_inicioFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioFacturaDescuadrada.add(jDateChooserfecha_inicioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finFacturaDescuadrada.add(jLabelfecha_finFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finFacturaDescuadrada.add(jButtonfecha_finFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finFacturaDescuadrada.add(jDateChooserfecha_finFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialFacturaDescuadrada.add(jLabelsecuencialFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialFacturaDescuadrada.add(jButtonsecuencialFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialFacturaDescuadrada.add(jTextFieldsecuencialFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFacturaDescuadrada.add(jLabelfechaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFacturaDescuadrada.add(jButtonfechaFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFacturaDescuadrada.add(jDateChooserfechaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalFacturaDescuadrada.add(jLabelsubtotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalFacturaDescuadrada.add(jButtonsubtotalFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalFacturaDescuadrada.add(jTextFieldsubtotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaFacturaDescuadrada.add(jLabelivaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFacturaDescuadrada.add(jButtonivaFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaFacturaDescuadrada.add(jTextFieldivaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoFacturaDescuadrada.add(jLabeldescuentoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoFacturaDescuadrada.add(jButtondescuentoFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoFacturaDescuadrada.add(jTextFielddescuentoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoFacturaDescuadrada.add(jLabelfinanciamientoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoFacturaDescuadrada.add(jButtonfinanciamientoFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoFacturaDescuadrada.add(jTextFieldfinanciamientoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteFacturaDescuadrada.add(jLabelfleteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteFacturaDescuadrada.add(jButtonfleteFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteFacturaDescuadrada.add(jTextFieldfleteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceFacturaDescuadrada.add(jLabeliceFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceFacturaDescuadrada.add(jButtoniceFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceFacturaDescuadrada.add(jTextFieldiceFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFacturaDescuadrada.add(jLabeltotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturaDescuadrada.add(jButtontotalFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFacturaDescuadrada.add(jTextFieldtotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_formas_pagoFacturaDescuadrada.add(jLabeltotal_formas_pagoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_formas_pagoFacturaDescuadrada.add(jButtontotal_formas_pagoFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_formas_pagoFacturaDescuadrada.add(jTextFieldtotal_formas_pagoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_realFacturaDescuadrada.add(jLabeldescuento_realFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		//this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = 2;
		this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
		this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_realFacturaDescuadrada.add(jButtondescuento_realFacturaDescuadradaBusqueda, this.gridBagConstraintsFacturaDescuadrada);
	}

	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
	this.gridBagConstraintsFacturaDescuadrada.gridx = 1;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_realFacturaDescuadrada.add(jTextFielddescuento_realFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelidFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelfecha_inicioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelfecha_finFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelsecuencialFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelfechaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelsubtotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelivaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPaneldescuentoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelfinanciamientoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPanelfleteFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPaneliceFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPaneltotalFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPaneltotal_formas_pagoFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaDescuadrada.add(this.jPaneldescuento_realFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposFacturaDescuadrada % 2==0) {
		iXPanelCamposFacturaDescuadrada=0;
		iYPanelCamposFacturaDescuadrada++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaDescuadrada.gridy = iYPanelCamposOcultosFacturaDescuadrada;
	this.gridBagConstraintsFacturaDescuadrada.gridx = iXPanelCamposOcultosFacturaDescuadrada++;
	this.gridBagConstraintsFacturaDescuadrada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaDescuadrada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturaDescuadrada.add(this.jPanelid_empresaFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);



	if(iXPanelCamposOcultosFacturaDescuadrada % 2==0) {
		iXPanelCamposOcultosFacturaDescuadrada=0;
		iYPanelCamposOcultosFacturaDescuadrada++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaDescuadrada= new GridBagLayout();
		this.jPanelAccionesFacturaDescuadrada.setLayout(gridaBagLayoutAccionesFacturaDescuadrada);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaDescuadrada= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaDescuadrada.setLayout(gridaBagLayoutAccionesFormularioFacturaDescuadrada);
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaDescuadrada.add(this.jComboBoxTiposAccionesFormularioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonModificarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);							

		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;
		this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonEliminarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonActualizarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);


		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonGuardarCambiosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);	
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = 0;		
		this.gridBagConstraintsFacturaDescuadrada.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaDescuadrada.add(this.jButtonCancelarFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaDescuadrada = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaDescuadrada);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturadescuadradaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();						
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;		
			//this.gridBagConstraintsFacturaDescuadrada.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaDescuadrada.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaDescuadrada.gridx =0;
		this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaDescuadrada.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaDescuadradaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaDescuadrada = new FacturaDescuadradaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Descuadrada DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura Descuadrada DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Descuadrada Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaDescuadradaModel facturadescuadradaModel=new FacturaDescuadradaModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaDescuadradaModel.FacturaDescuadradaFocusTraversalPolicy facturadescuadradaFocusTraversalPolicy = facturadescuadradaModel.new FacturaDescuadradaFocusTraversalPolicy(this);
			
			//facturadescuadradaFocusTraversalPolicy.setfacturadescuadradaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturadescuadradaModel);
			
			
			this.jContentPaneDetalleFacturaDescuadrada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaDescuadrada = new GridBagLayout();	
			this.jContentPaneDetalleFacturaDescuadrada.setLayout(gridaBagLayoutDetalleFacturaDescuadrada);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaDescuadrada = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
				this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
					
				
				this.jContentPaneDetalleFacturaDescuadrada.add(jTtoolBarDetalleFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);								
				
}
			
			this.jScrollPanelDatosEdicionFacturaDescuadrada=   new JScrollPane(jContentPaneDetalleFacturaDescuadrada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaDescuadrada=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaDescuadrada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	        
			this.jContentPaneDetalleFacturaDescuadrada.add(jPanelCamposFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);
			
			
			
			
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
						//&& facturadescuadradaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturadescuadradaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaDescuadrada= new GridBagConstraints();
						this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
						this.jContentPaneDetalleFacturaDescuadrada.add(this.jTabbedPaneRelacionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaDescuadrada.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaDescuadrada.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
					this.gridBagConstraintsFacturaDescuadrada.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
					
				
					this.jContentPaneDetalleFacturaDescuadrada.add(jPanelCamposOcultosFacturaDescuadrada, gridBagConstraintsFacturaDescuadrada);
				
					this.jPanelCamposOcultosFacturaDescuadrada.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	        this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturaDescuadrada.add(this.jPanelAccionesFormularioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);							
			
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
	        this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturaDescuadrada.add(this.jPanelAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaDescuadrada);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaDescuadrada=   new JScrollPane(this.jPanelCamposFacturaDescuadrada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaDescuadrada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
			this.gridBagConstraintsFacturaDescuadrada.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaDescuadrada.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaDescuadrada.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);			
			
			this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
			this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
			
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		
			
		this.gridBagConstraintsFacturaDescuadrada = new GridBagConstraints();
		this.gridBagConstraintsFacturaDescuadrada.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaDescuadrada.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaDescuadrada, this.gridBagConstraintsFacturaDescuadrada);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaDescuadrada;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaDescuadrada;
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
