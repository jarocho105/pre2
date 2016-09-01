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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.report.*;
import com.bydan.erp.inventario.util.report.ConsumosBodegasConstantesFunciones;

import com.bydan.erp.inventario.business.logic.report.*;
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
public class ConsumosBodegasDetalleFormJInternalFrame extends ConsumosBodegasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsumosBodegas;
	
	protected JMenuBar jmenuBarDetalleConsumosBodegas;
	
	protected JMenu jmenuDetalleConsumosBodegas;
	protected JMenu jmenuDetalleArchivoConsumosBodegas;
	protected JMenu jmenuDetalleAccionesConsumosBodegas;
	protected JMenu jmenuDetalleDatosConsumosBodegas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsumosBodegas;	
	protected GridBagConstraints gridBagConstraintsConsumosBodegas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsumosBodegasBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsumosBodegas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ConsumosBodegasSessionBean consumosbodegasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ConsumosBodegasLogic consumosbodegasLogic;
	
	public JScrollPane jScrollPanelDatosConsumosBodegas;
	public JScrollPane jScrollPanelDatosEdicionConsumosBodegas;
	public JScrollPane jScrollPanelDatosGeneralConsumosBodegas;
	
	protected JPanel jPanelCamposConsumosBodegas;    
	protected JPanel jPanelCamposOcultosConsumosBodegas;    	
	protected JPanel jPanelAccionesConsumosBodegas;
	protected JPanel jPanelAccionesFormularioConsumosBodegas;
    
	
	
	protected Integer iXPanelCamposConsumosBodegas=0;
	protected Integer iYPanelCamposConsumosBodegas=0;
	
	protected Integer iXPanelCamposOcultosConsumosBodegas=0;
	protected Integer iYPanelCamposOcultosConsumosBodegas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsumosBodegas;
	public JButton jButtonModificarConsumosBodegas;
	public JButton jButtonActualizarConsumosBodegas;
    public JButton jButtonEliminarConsumosBodegas;
	public JButton jButtonCancelarConsumosBodegas;
    public JButton jButtonGuardarCambiosConsumosBodegas;
	public JButton jButtonGuardarCambiosTablaConsumosBodegas;
	protected JButton jButtonCerrarConsumosBodegas;
	
	
	protected JButton jButtonProcesarInformacionConsumosBodegas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsumosBodegas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsumosBodegas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsumosBodegas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsumosBodegas;
	protected JButton jButtonModificarToolBarConsumosBodegas;
	protected JButton jButtonActualizarToolBarConsumosBodegas;
    protected JButton jButtonEliminarToolBarConsumosBodegas;
	protected JButton jButtonCancelarToolBarConsumosBodegas;
    protected JButton jButtonGuardarCambiosToolBarConsumosBodegas;
	protected JButton jButtonGuardarCambiosTablaToolBarConsumosBodegas;
	protected JButton jButtonMostrarOcultarTablaToolBarConsumosBodegas;
	protected JButton jButtonCerrarToolBarConsumosBodegas;
	
	protected JButton jButtonProcesarInformacionToolBarConsumosBodegas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsumosBodegas;
	protected JMenuItem jMenuItemModificarConsumosBodegas;
	protected JMenuItem jMenuItemActualizarConsumosBodegas;
    protected JMenuItem jMenuItemEliminarConsumosBodegas;
	protected JMenuItem jMenuItemCancelarConsumosBodegas;
    protected JMenuItem jMenuItemGuardarCambiosConsumosBodegas;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsumosBodegas;
	protected JMenuItem jMenuItemCerrarConsumosBodegas;
	protected JMenuItem jMenuItemDetalleCerrarConsumosBodegas;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsumosBodegas;
	
	protected JMenuItem jMenuItemProcesarInformacionConsumosBodegas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsumosBodegas;
	protected JMenuItem jMenuItemMostrarOcultarConsumosBodegas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsumosBodegas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsumosBodegas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsumosBodegas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsumosBodegas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsumosBodegas;
	public JLabel jLabelIdConsumosBodegas;
	public JLabel jLabelidConsumosBodegas;
	public JButton jButtonidConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeConsumosBodegas;
	public JLabel jLabelfecha_emision_desdeConsumosBodegas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeConsumosBodegas;

	public JDateChooser jDateChooserfecha_emision_desdeConsumosBodegas;
	public JButton jButtonfecha_emision_desdeConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaConsumosBodegas;
	public JLabel jLabelfecha_emision_hastaConsumosBodegas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaConsumosBodegas;

	public JDateChooser jDateChooserfecha_emision_hastaConsumosBodegas;
	public JButton jButtonfecha_emision_hastaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoConsumosBodegas;
	public JLabel jLabelnombre_productoConsumosBodegas;
	public JTextArea jTextAreanombre_productoConsumosBodegas;
	public JScrollPane jscrollPanenombre_productoConsumosBodegas;
	public JButton jButtonnombre_productoConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadConsumosBodegas;
	public JLabel jLabelnombre_unidadConsumosBodegas;
	public JTextField jTextFieldnombre_unidadConsumosBodegas;
	public JButton jButtonnombre_unidadConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelcantidadConsumosBodegas;
	public JLabel jLabelcantidadConsumosBodegas;
	public JTextField jTextFieldcantidadConsumosBodegas;
	public JButton jButtoncantidadConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalConsumosBodegas;
	public JLabel jLabelcosto_totalConsumosBodegas;
	public JTextField jTextFieldcosto_totalConsumosBodegas;
	public JButton jButtoncosto_totalConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaConsumosBodegas;
	public JLabel jLabelnombre_lineaConsumosBodegas;
	public JTextArea jTextAreanombre_lineaConsumosBodegas;
	public JScrollPane jscrollPanenombre_lineaConsumosBodegas;
	public JButton jButtonnombre_lineaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoConsumosBodegas;
	public JLabel jLabelnombre_linea_grupoConsumosBodegas;
	public JTextArea jTextAreanombre_linea_grupoConsumosBodegas;
	public JScrollPane jscrollPanenombre_linea_grupoConsumosBodegas;
	public JButton jButtonnombre_linea_grupoConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaConsumosBodegas;
	public JLabel jLabelnombre_linea_categoriaConsumosBodegas;
	public JTextArea jTextAreanombre_linea_categoriaConsumosBodegas;
	public JScrollPane jscrollPanenombre_linea_categoriaConsumosBodegas;
	public JButton jButtonnombre_linea_categoriaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaConsumosBodegas;
	public JLabel jLabelnombre_linea_marcaConsumosBodegas;
	public JTextArea jTextAreanombre_linea_marcaConsumosBodegas;
	public JScrollPane jscrollPanenombre_linea_marcaConsumosBodegas;
	public JButton jButtonnombre_linea_marcaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelcodigoConsumosBodegas;
	public JLabel jLabelcodigoConsumosBodegas;
	public JTextField jTextFieldcodigoConsumosBodegas;
	public JButton jButtoncodigoConsumosBodegasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsumosBodegas;
	public JLabel jLabelid_empresaConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsumosBodegas;
	public JButton jButtonid_empresaConsumosBodegas= new JButtonMe();
	public JButton jButtonid_empresaConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionConsumosBodegas;
	public JLabel jLabelid_transaccionConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionConsumosBodegas;
	public JButton jButtonid_transaccionConsumosBodegas= new JButtonMe();
	public JButton jButtonid_transaccionConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_transaccionConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaConsumosBodegas;
	public JLabel jLabelid_lineaConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaConsumosBodegas;
	public JButton jButtonid_lineaConsumosBodegas= new JButtonMe();
	public JButton jButtonid_lineaConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_lineaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoConsumosBodegas;
	public JLabel jLabelid_linea_grupoConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoConsumosBodegas;
	public JButton jButtonid_linea_grupoConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_grupoConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaConsumosBodegas;
	public JLabel jLabelid_linea_categoriaConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaConsumosBodegas;
	public JButton jButtonid_linea_categoriaConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_categoriaConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaConsumosBodegasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaConsumosBodegas;
	public JLabel jLabelid_linea_marcaConsumosBodegas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaConsumosBodegas;
	public JButton jButtonid_linea_marcaConsumosBodegas= new JButtonMe();
	public JButton jButtonid_linea_marcaConsumosBodegasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaConsumosBodegasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsumosBodegas;
	
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
	public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConsumosBodegasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsumosBodegas=new JPanel();
				this.jPanelAccionesFormularioConsumosBodegas=new JPanel();
				this.jmenuBarDetalleConsumosBodegas=new JMenuBar();
				this.jTtoolBarDetalleConsumosBodegas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsumosBodegasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsumosBodegasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsumosBodegas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsumosBodegas() {
		return this.jButtonActualizarToolBarConsumosBodegas;
	}
	
	public JButton getjButtonEliminarToolBarConsumosBodegas() {
		return this.jButtonEliminarToolBarConsumosBodegas;
	}
	
	public JButton getjButtonCancelarToolBarConsumosBodegas() {
		return this.jButtonCancelarToolBarConsumosBodegas;
	}		
	
	public JButton getjButtonProcesarInformacionConsumosBodegas() {
		return this.jButtonProcesarInformacionConsumosBodegas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsumosBodegas)	{
		this.jButtonProcesarInformacionConsumosBodegas = jButtonProcesarInformacionConsumosBodegas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsumosBodegas() {
		return this.jComboBoxTiposAccionesConsumosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsumosBodegas(
			JComboBox jComboBoxTiposRelacionesConsumosBodegas) {
		this.jComboBoxTiposRelacionesConsumosBodegas = jComboBoxTiposRelacionesConsumosBodegas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsumosBodegas(
			JComboBox jComboBoxTiposAccionesConsumosBodegas) {
		this.jComboBoxTiposAccionesConsumosBodegas = jComboBoxTiposAccionesConsumosBodegas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsumosBodegas() {
		return this.jComboBoxTiposAccionesFormularioConsumosBodegas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsumosBodegas(
			JComboBox jComboBoxTiposAccionesFormularioConsumosBodegas) {
		this.jComboBoxTiposAccionesFormularioConsumosBodegas = jComboBoxTiposAccionesFormularioConsumosBodegas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
		
		this.consumosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consumosbodegasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsumosBodegasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsumosBodegasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consumos Bodegas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsumosBodegasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsumosBodegas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsumosBodegas=new JButtonMe();
				this.jButtonModificarToolBarConsumosBodegas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas,
							"actualizar","actualizar","Actualizar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas,
							"eliminar","eliminar","Eliminar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas,
							"cancelar","cancelar","Cancelar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsumosBodegas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsumosBodegas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsumosBodegas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsumosBodegas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsumosBodegas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsumosBodegas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsumosBodegas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsumosBodegas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsumosBodegas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsumosBodegas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsumosBodegas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsumosBodegas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsumosBodegas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsumosBodegas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsumosBodegas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsumosBodegas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsumosBodegas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsumosBodegas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsumosBodegas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsumosBodegas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsumosBodegas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsumosBodegas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsumosBodegas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsumosBodegas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsumosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsumosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsumosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsumosBodegas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsumosBodegas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsumosBodegas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsumosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsumosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsumosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsumosBodegas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsumosBodegas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsumosBodegas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsumosBodegas.add(this.jMenuItemDetalleCerrarConsumosBodegas);
		
		this.jmenuDetalleAccionesConsumosBodegas.add(this.jMenuItemActualizarConsumosBodegas);
		this.jmenuDetalleAccionesConsumosBodegas.add(this.jMenuItemEliminarConsumosBodegas);
		this.jmenuDetalleAccionesConsumosBodegas.add(this.jMenuItemCancelarConsumosBodegas);		
		
		//this.jmenuDetalleDatosConsumosBodegas.add(this.jMenuItemDetalleAbrirOrderByConsumosBodegas);				
		this.jmenuDetalleDatosConsumosBodegas.add(this.jMenuItemDetalleMostarOcultarConsumosBodegas);				
				
		//this.jmenuDetalleAccionesConsumosBodegas.add(this.jMenuItemGuardarCambiosConsumosBodegas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsumosBodegas.add(this.jmenuDetalleArchivoConsumosBodegas);		
		this.jmenuBarDetalleConsumosBodegas.add(this.jmenuDetalleAccionesConsumosBodegas);		
		this.jmenuBarDetalleConsumosBodegas.add(this.jmenuDetalleDatosConsumosBodegas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsumosBodegas);				
	}
	
	
	public void inicializarElementosCamposConsumosBodegas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsumosBodegas = new JLabelMe();
		jLabelIdConsumosBodegas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsumosBodegas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsumosBodegas= new GridBagLayout();

		this.jPanelidConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);

		jLabelidConsumosBodegas = new JLabel();
		jLabelidConsumosBodegas.setText("Id");

		jLabelidConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeConsumosBodegas = new JLabelMe();
		this.jLabelfecha_emision_desdeConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeConsumosBodegas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelfecha_emision_desdeConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		//jFormattedTextFieldfecha_emision_desdeConsumosBodegas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeConsumosBodegas= new JDateChooser();
		jDateChooserfecha_emision_desdeConsumosBodegas.setEnabled(false);
		jDateChooserfecha_emision_desdeConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeConsumosBodegas.setDate(new Date());
		jDateChooserfecha_emision_desdeConsumosBodegas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeConsumosBodegas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaConsumosBodegas = new JLabelMe();
		this.jLabelfecha_emision_hastaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaConsumosBodegas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelfecha_emision_hastaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		//jFormattedTextFieldfecha_emision_hastaConsumosBodegas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaConsumosBodegas= new JDateChooser();
		jDateChooserfecha_emision_hastaConsumosBodegas.setEnabled(false);
		jDateChooserfecha_emision_hastaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaConsumosBodegas.setDate(new Date());
		jDateChooserfecha_emision_hastaConsumosBodegas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaConsumosBodegas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoConsumosBodegas = new JLabelMe();
		this.jLabelnombre_productoConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoConsumosBodegas.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_productoConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextAreanombre_productoConsumosBodegas= new JTextAreaMe();
		jTextAreanombre_productoConsumosBodegas.setEnabled(false);
		jTextAreanombre_productoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoConsumosBodegas.setLineWrap(true);
		jTextAreanombre_productoConsumosBodegas.setWrapStyleWord(true);
		jTextAreanombre_productoConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoConsumosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoConsumosBodegas = new JScrollPane(jTextAreanombre_productoConsumosBodegas);
		jscrollPanenombre_productoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_productoConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_productoConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadConsumosBodegas = new JLabelMe();
		this.jLabelnombre_unidadConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadConsumosBodegas.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_unidadConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextFieldnombre_unidadConsumosBodegas= new JTextFieldMe();

		jTextFieldnombre_unidadConsumosBodegas.setEnabled(false);
		jTextFieldnombre_unidadConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelcantidadConsumosBodegas = new JLabelMe();
		this.jLabelcantidadConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadConsumosBodegas.setToolTipText("Cantad");
		this.jLabelcantidadConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelcantidadConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextFieldcantidadConsumosBodegas= new JTextFieldMe();
		jTextFieldcantidadConsumosBodegas.setEnabled(false);
		jTextFieldcantidadConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadConsumosBodegas.setText("0");

		this.jButtoncantidadConsumosBodegasBusqueda= new JButtonMe();
		this.jButtoncantidadConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadConsumosBodegasBusqueda.setText("U");
		this.jButtoncantidadConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalConsumosBodegas = new JLabelMe();
		this.jLabelcosto_totalConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalConsumosBodegas.setToolTipText("Costo Total");
		this.jLabelcosto_totalConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelcosto_totalConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextFieldcosto_totalConsumosBodegas= new JTextFieldMe();
		jTextFieldcosto_totalConsumosBodegas.setEnabled(false);
		jTextFieldcosto_totalConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalConsumosBodegas.setText("0.0");

		this.jButtoncosto_totalConsumosBodegasBusqueda= new JButtonMe();
		this.jButtoncosto_totalConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalConsumosBodegasBusqueda.setText("U");
		this.jButtoncosto_totalConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaConsumosBodegas = new JLabelMe();
		this.jLabelnombre_lineaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaConsumosBodegas.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_lineaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextAreanombre_lineaConsumosBodegas= new JTextAreaMe();
		jTextAreanombre_lineaConsumosBodegas.setEnabled(false);
		jTextAreanombre_lineaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaConsumosBodegas.setLineWrap(true);
		jTextAreanombre_lineaConsumosBodegas.setWrapStyleWord(true);
		jTextAreanombre_lineaConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaConsumosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaConsumosBodegas = new JScrollPane(jTextAreanombre_lineaConsumosBodegas);
		jscrollPanenombre_lineaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoConsumosBodegas = new JLabelMe();
		this.jLabelnombre_linea_grupoConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoConsumosBodegas.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_grupoConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextAreanombre_linea_grupoConsumosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_grupoConsumosBodegas.setEnabled(false);
		jTextAreanombre_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoConsumosBodegas.setLineWrap(true);
		jTextAreanombre_linea_grupoConsumosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoConsumosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoConsumosBodegas = new JScrollPane(jTextAreanombre_linea_grupoConsumosBodegas);
		jscrollPanenombre_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaConsumosBodegas = new JLabelMe();
		this.jLabelnombre_linea_categoriaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaConsumosBodegas.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_categoriaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextAreanombre_linea_categoriaConsumosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_categoriaConsumosBodegas.setEnabled(false);
		jTextAreanombre_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaConsumosBodegas.setLineWrap(true);
		jTextAreanombre_linea_categoriaConsumosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaConsumosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaConsumosBodegas = new JScrollPane(jTextAreanombre_linea_categoriaConsumosBodegas);
		jscrollPanenombre_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaConsumosBodegas = new JLabelMe();
		this.jLabelnombre_linea_marcaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaConsumosBodegas.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelnombre_linea_marcaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextAreanombre_linea_marcaConsumosBodegas= new JTextAreaMe();
		jTextAreanombre_linea_marcaConsumosBodegas.setEnabled(false);
		jTextAreanombre_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaConsumosBodegas.setLineWrap(true);
		jTextAreanombre_linea_marcaConsumosBodegas.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaConsumosBodegas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaConsumosBodegas = new JScrollPane(jTextAreanombre_linea_marcaConsumosBodegas);
		jscrollPanenombre_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setText("U");
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaConsumosBodegasBusqueda.setVisible(false);		}


					
		this.jLabelcodigoConsumosBodegas = new JLabelMe();
		this.jLabelcodigoConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoConsumosBodegas.setToolTipText("Codigo");
		this.jLabelcodigoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelcodigoConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jTextFieldcodigoConsumosBodegas= new JTextFieldMe();

		jTextFieldcodigoConsumosBodegas.setEnabled(false);
		jTextFieldcodigoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoConsumosBodegasBusqueda= new JButtonMe();
		this.jButtoncodigoConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoConsumosBodegasBusqueda.setText("U");
		this.jButtoncodigoConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoConsumosBodegasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsumosBodegas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsumosBodegas = new JLabelMe();
		this.jLabelid_empresaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsumosBodegas.setToolTipText("Empresa");
		this.jLabelid_empresaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_empresaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_empresaConsumosBodegas= new JComboBoxMe();
		jComboBoxid_empresaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsumosBodegas.setEnabled(false);

		this.jButtonid_empresaConsumosBodegas= new JButtonMe();
		this.jButtonid_empresaConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsumosBodegas.setText("Buscar");
		this.jButtonid_empresaConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosBodegas"));

		this.jButtonid_empresaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_empresaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsumosBodegasBusqueda.setText("U");
		this.jButtonid_empresaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_empresaConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsumosBodegasUpdate.setText("U");
		this.jButtonid_empresaConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsumosBodegasUpdate"));



					
		this.jLabelid_transaccionConsumosBodegas = new JLabelMe();
		this.jLabelid_transaccionConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionConsumosBodegas.setToolTipText("Transaccion");
		this.jLabelid_transaccionConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_transaccionConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_transaccionConsumosBodegas= new JComboBoxMe();
		jComboBoxid_transaccionConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionConsumosBodegas= new JButtonMe();
		this.jButtonid_transaccionConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionConsumosBodegas.setText("Buscar");
		this.jButtonid_transaccionConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosBodegas"));

		this.jButtonid_transaccionConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_transaccionConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionConsumosBodegasBusqueda.setText("U");
		this.jButtonid_transaccionConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_transaccionConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_transaccionConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionConsumosBodegasUpdate.setText("U");
		this.jButtonid_transaccionConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionConsumosBodegasUpdate"));



					
		this.jLabelid_lineaConsumosBodegas = new JLabelMe();
		this.jLabelid_lineaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaConsumosBodegas.setToolTipText("Linea");
		this.jLabelid_lineaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_lineaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_lineaConsumosBodegas= new JComboBoxMe();
		jComboBoxid_lineaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaConsumosBodegas= new JButtonMe();
		this.jButtonid_lineaConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaConsumosBodegas.setText("Buscar");
		this.jButtonid_lineaConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosBodegas"));

		this.jButtonid_lineaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_lineaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConsumosBodegasBusqueda.setText("U");
		this.jButtonid_lineaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_lineaConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_lineaConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaConsumosBodegasUpdate.setText("U");
		this.jButtonid_lineaConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaConsumosBodegasUpdate"));



					
		this.jLabelid_linea_grupoConsumosBodegas = new JLabelMe();
		this.jLabelid_linea_grupoConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoConsumosBodegas.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_linea_grupoConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_linea_grupoConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoConsumosBodegas= new JButtonMe();
		this.jButtonid_linea_grupoConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoConsumosBodegas.setText("Buscar");
		this.jButtonid_linea_grupoConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosBodegas"));

		this.jButtonid_linea_grupoConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConsumosBodegasBusqueda.setText("U");
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoConsumosBodegasUpdate.setText("U");
		this.jButtonid_linea_grupoConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoConsumosBodegasUpdate"));



					
		this.jLabelid_linea_categoriaConsumosBodegas = new JLabelMe();
		this.jLabelid_linea_categoriaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaConsumosBodegas.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_linea_categoriaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_linea_categoriaConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaConsumosBodegas= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaConsumosBodegas.setText("Buscar");
		this.jButtonid_linea_categoriaConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosBodegas"));

		this.jButtonid_linea_categoriaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setText("U");
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaConsumosBodegasUpdate.setText("U");
		this.jButtonid_linea_categoriaConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaConsumosBodegasUpdate"));



					
		this.jLabelid_linea_marcaConsumosBodegas = new JLabelMe();
		this.jLabelid_linea_marcaConsumosBodegas.setText(""+ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaConsumosBodegas.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaConsumosBodegas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaConsumosBodegas.setToolTipText(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutConsumosBodegas = new GridBagLayout();
		this.jPanelid_linea_marcaConsumosBodegas.setLayout(this.gridaBagLayoutConsumosBodegas);


		jComboBoxid_linea_marcaConsumosBodegas= new JComboBoxMe();
		jComboBoxid_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaConsumosBodegas= new JButtonMe();
		this.jButtonid_linea_marcaConsumosBodegas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosBodegas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosBodegas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaConsumosBodegas.setText("Buscar");
		this.jButtonid_linea_marcaConsumosBodegas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaConsumosBodegas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosBodegas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosBodegas"));

		this.jButtonid_linea_marcaConsumosBodegasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConsumosBodegasBusqueda.setText("U");
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosBodegasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosBodegasBusqueda"));

		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaConsumosBodegasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaConsumosBodegasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaConsumosBodegasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosBodegasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaConsumosBodegasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaConsumosBodegasUpdate.setText("U");
		this.jButtonid_linea_marcaConsumosBodegasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaConsumosBodegasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaConsumosBodegasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaConsumosBodegasUpdate"));



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
		//this.jInternalFrameDetalleConsumosBodegas = new ConsumosBodegasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consumos Bodegas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsumosBodegas= new GridBagLayout();
		

		
		String sToolTipConsumosBodegas="";
		sToolTipConsumosBodegas=ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsumosBodegas+="(Inventario.ConsumosBodegas)";
		}
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsumosBodegas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsumosBodegas = new JButtonMe();
		this.jButtonModificarConsumosBodegas = new JButtonMe();
        this.jButtonActualizarConsumosBodegas = new JButtonMe();
        this.jButtonEliminarConsumosBodegas = new JButtonMe();
        this.jButtonCancelarConsumosBodegas = new JButtonMe();
        this.jButtonGuardarCambiosConsumosBodegas = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsumosBodegas = new JButtonMe();
		this.jButtonCerrarConsumosBodegas = new JButtonMe();
		
		this.jScrollPanelDatosConsumosBodegas = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsumosBodegas = new JScrollPane();
		this.jScrollPanelDatosGeneralConsumosBodegas = new JScrollPane();
				
		
		
		this.jPanelCamposConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consumos Bodegas";
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consumos Bodegases" + this.sPath));
		} else {
			this.jScrollPanelDatosConsumosBodegas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsumosBodegas.setName("jPanelCamposConsumosBodegas"); 

		this.jPanelCamposOcultosConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsumosBodegas.setName("jPanelCamposOcultosConsumosBodegas"); 

        this.jPanelAccionesConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsumosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesConsumosBodegas.setName("Acciones"); 

		this.jPanelAccionesFormularioConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsumosBodegas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsumosBodegas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsumosBodegas.setText("Nuevo");
		this.jButtonModificarConsumosBodegas.setText("Editar");
        this.jButtonActualizarConsumosBodegas.setText("Actualizar");
        this.jButtonEliminarConsumosBodegas.setText("Eliminar");
        this.jButtonCancelarConsumosBodegas.setText("Cancelar");
        this.jButtonGuardarCambiosConsumosBodegas.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsumosBodegas.setText("Guardar");
		this.jButtonCerrarConsumosBodegas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsumosBodegas,"nuevo_button","Nuevo",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsumosBodegas,"modificar_button","Editar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsumosBodegas,"actualizar_button","Actualizar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsumosBodegas,"eliminar_button","Eliminar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsumosBodegas,"cancelar_button","Cancelar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsumosBodegas,"guardarcambios_button","Guardar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsumosBodegas,"guardarcambiostabla_button","Guardar",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsumosBodegas,"cerrar_button","Salir",this.consumosbodegasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsumosBodegas.setToolTipText("Nuevo"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsumosBodegas.setToolTipText("Editar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsumosBodegas.setToolTipText("Actualizar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsumosBodegas.setToolTipText("Eliminar)"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsumosBodegas.setToolTipText("Cancelar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsumosBodegas.setToolTipText("Guardar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsumosBodegas.setToolTipText("Guardar"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsumosBodegas.setToolTipText("Salir"+" "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsumosBodegas";
		inputMap = this.jButtonNuevoConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsumosBodegas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsumosBodegas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsumosBodegas";
		inputMap = this.jButtonActualizarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsumosBodegas"));
		
		//ELIMINAR
		sMapKey = "EliminarConsumosBodegas";
		inputMap = this.jButtonEliminarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsumosBodegas"));
		
		//CANCELAR	
		sMapKey = "CancelarConsumosBodegas";
		inputMap = this.jButtonCancelarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsumosBodegas"));
		
		//CERRAR		
		sMapKey = "CerrarConsumosBodegas";
		inputMap = this.jButtonCerrarConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsumosBodegas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsumosBodegas";
		inputMap = this.jButtonGuardarCambiosTablaConsumosBodegas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsumosBodegas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsumosBodegas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsumosBodegas.setToolTipText("Nuevo ConsumosBodegas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsumosBodegas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsumosBodegas.setToolTipText("Sin Cerrar Ventana ConsumosBodegas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsumosBodegas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsumosBodegas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsumosBodegas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsumosBodegas.setText("Accion");
		this.jComboBoxTiposAccionesConsumosBodegas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsumosBodegas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsumosBodegas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsumosBodegas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsumosBodegas = new JLabelMe();
		
		this.jLabelAccionesConsumosBodegas.setText("Acciones");		
		this.jLabelAccionesConsumosBodegas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosBodegas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsumosBodegas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsumosBodegas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsumosBodegas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsumosBodegas=new JTabbedPane();
		this.jTabbedPaneRelacionesConsumosBodegas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsumosBodegas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsumosBodegas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosBodegas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsumosBodegas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsumosBodegas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsumosBodegas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsumosBodegas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsumosBodegas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsumosBodegas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsumosBodegas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsumosBodegas = new GridBagLayout();
		
		this.jPanelCamposConsumosBodegas.setLayout(gridaBagLayoutCamposConsumosBodegas);
		this.jPanelCamposOcultosConsumosBodegas.setLayout(gridaBagLayoutCamposOcultosConsumosBodegas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsumosBodegas.add(jLabelIdConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsumosBodegas.add(jLabelidConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsumosBodegas.add(jLabelid_empresaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsumosBodegas.add(jButtonid_empresaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsumosBodegas.add(jButtonid_empresaConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsumosBodegas.add(jComboBoxid_empresaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionConsumosBodegas.add(jLabelid_transaccionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionConsumosBodegas.add(jButtonid_transaccionConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionConsumosBodegas.add(jButtonid_transaccionConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionConsumosBodegas.add(jComboBoxid_transaccionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaConsumosBodegas.add(jLabelid_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConsumosBodegas.add(jButtonid_lineaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaConsumosBodegas.add(jButtonid_lineaConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaConsumosBodegas.add(jComboBoxid_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoConsumosBodegas.add(jLabelid_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConsumosBodegas.add(jButtonid_linea_grupoConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoConsumosBodegas.add(jButtonid_linea_grupoConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoConsumosBodegas.add(jComboBoxid_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaConsumosBodegas.add(jLabelid_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConsumosBodegas.add(jButtonid_linea_categoriaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaConsumosBodegas.add(jButtonid_linea_categoriaConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaConsumosBodegas.add(jComboBoxid_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaConsumosBodegas.add(jLabelid_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConsumosBodegas.add(jButtonid_linea_marcaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 3;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaConsumosBodegas.add(jButtonid_linea_marcaConsumosBodegasUpdate, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaConsumosBodegas.add(jComboBoxid_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeConsumosBodegas.add(jLabelfecha_emision_desdeConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeConsumosBodegas.add(jButtonfecha_emision_desdeConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeConsumosBodegas.add(jDateChooserfecha_emision_desdeConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaConsumosBodegas.add(jLabelfecha_emision_hastaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaConsumosBodegas.add(jButtonfecha_emision_hastaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaConsumosBodegas.add(jDateChooserfecha_emision_hastaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoConsumosBodegas.add(jLabelnombre_productoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoConsumosBodegas.add(jButtonnombre_productoConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoConsumosBodegas.add(jscrollPanenombre_productoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadConsumosBodegas.add(jLabelnombre_unidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadConsumosBodegas.add(jButtonnombre_unidadConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadConsumosBodegas.add(jTextFieldnombre_unidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadConsumosBodegas.add(jLabelcantidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadConsumosBodegas.add(jButtoncantidadConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadConsumosBodegas.add(jTextFieldcantidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalConsumosBodegas.add(jLabelcosto_totalConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalConsumosBodegas.add(jButtoncosto_totalConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalConsumosBodegas.add(jTextFieldcosto_totalConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaConsumosBodegas.add(jLabelnombre_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaConsumosBodegas.add(jButtonnombre_lineaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaConsumosBodegas.add(jscrollPanenombre_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoConsumosBodegas.add(jLabelnombre_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoConsumosBodegas.add(jButtonnombre_linea_grupoConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoConsumosBodegas.add(jscrollPanenombre_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaConsumosBodegas.add(jLabelnombre_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaConsumosBodegas.add(jButtonnombre_linea_categoriaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaConsumosBodegas.add(jscrollPanenombre_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaConsumosBodegas.add(jLabelnombre_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaConsumosBodegas.add(jButtonnombre_linea_marcaConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaConsumosBodegas.add(jscrollPanenombre_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 0;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoConsumosBodegas.add(jLabelcodigoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		//this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = 2;
		this.gridBagConstraintsConsumosBodegas.ipadx = 0;
		this.gridBagConstraintsConsumosBodegas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoConsumosBodegas.add(jButtoncodigoConsumosBodegasBusqueda, this.gridBagConstraintsConsumosBodegas);
	}

	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsumosBodegas.gridy = 0;
	this.gridBagConstraintsConsumosBodegas.gridx = 1;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoConsumosBodegas.add(jTextFieldcodigoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelidConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelid_transaccionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelid_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelid_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelid_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelid_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelfecha_emision_desdeConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelfecha_emision_hastaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_productoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_unidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelcantidadConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelcosto_totalConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_lineaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_linea_grupoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_linea_categoriaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelnombre_linea_marcaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsumosBodegas.add(this.jPanelcodigoConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposConsumosBodegas % 2==0) {
		iXPanelCamposConsumosBodegas=0;
		iYPanelCamposConsumosBodegas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsumosBodegas.gridy = iYPanelCamposOcultosConsumosBodegas;
	this.gridBagConstraintsConsumosBodegas.gridx = iXPanelCamposOcultosConsumosBodegas++;
	this.gridBagConstraintsConsumosBodegas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsumosBodegas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsumosBodegas.add(this.jPanelid_empresaConsumosBodegas, this.gridBagConstraintsConsumosBodegas);



	if(iXPanelCamposOcultosConsumosBodegas % 2==0) {
		iXPanelCamposOcultosConsumosBodegas=0;
		iYPanelCamposOcultosConsumosBodegas++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsumosBodegas= new GridBagLayout();
		this.jPanelAccionesConsumosBodegas.setLayout(gridaBagLayoutAccionesConsumosBodegas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsumosBodegas= new GridBagLayout();
		this.jPanelAccionesFormularioConsumosBodegas.setLayout(gridaBagLayoutAccionesFormularioConsumosBodegas);
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsumosBodegas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsumosBodegas.add(this.jComboBoxTiposAccionesFormularioConsumosBodegas, this.gridBagConstraintsConsumosBodegas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsumosBodegas.add(this.jButtonModificarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);							

		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsumosBodegas.gridy = 0;
		this.gridBagConstraintsConsumosBodegas.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsumosBodegas.add(this.jButtonEliminarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = 0;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsumosBodegas.add(this.jButtonActualizarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);


		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = 0;		
		this.gridBagConstraintsConsumosBodegas.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsumosBodegas.add(this.jButtonGuardarCambiosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);	
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = 0;		
		this.gridBagConstraintsConsumosBodegas.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsumosBodegas.add(this.jButtonCancelarConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsumosBodegas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsumosBodegas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();						
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsumosBodegas.gridx = 0;		
			//this.gridBagConstraintsConsumosBodegas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsumosBodegas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsumosBodegas.gridx =0;
		this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsumosBodegas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsumosBodegas = new ConsumosBodegasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consumos Bodegas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consumos Bodegas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consumos Bodegas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsumosBodegasModel consumosbodegasModel=new ConsumosBodegasModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsumosBodegasModel.ConsumosBodegasFocusTraversalPolicy consumosbodegasFocusTraversalPolicy = consumosbodegasModel.new ConsumosBodegasFocusTraversalPolicy(this);
			
			//consumosbodegasFocusTraversalPolicy.setconsumosbodegasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consumosbodegasModel);
			
			
			this.jContentPaneDetalleConsumosBodegas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsumosBodegas = new GridBagLayout();	
			this.jContentPaneDetalleConsumosBodegas.setLayout(gridaBagLayoutDetalleConsumosBodegas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsumosBodegas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
				this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsumosBodegas.gridx = 0;
					
				
				this.jContentPaneDetalleConsumosBodegas.add(jTtoolBarDetalleConsumosBodegas, gridBagConstraintsConsumosBodegas);								
				
}
			
			this.jScrollPanelDatosEdicionConsumosBodegas=   new JScrollPane(jContentPaneDetalleConsumosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsumosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsumosBodegas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsumosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsumosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsumosBodegas.gridx = 0;
	        
			this.jContentPaneDetalleConsumosBodegas.add(jPanelCamposConsumosBodegas, gridBagConstraintsConsumosBodegas);
			
			
			
			
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
						//&& consumosbodegasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsumosBodegas= new GridBagConstraints();
						this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsumosBodegas.gridx = 0;
						this.jContentPaneDetalleConsumosBodegas.add(this.jTabbedPaneRelacionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsumosBodegas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsumosBodegas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
					this.gridBagConstraintsConsumosBodegas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsumosBodegas.gridx = 0;
					
				
					this.jContentPaneDetalleConsumosBodegas.add(jPanelCamposOcultosConsumosBodegas, gridBagConstraintsConsumosBodegas);
				
					this.jPanelCamposOcultosConsumosBodegas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConsumosBodegas.gridx = 0;
	        this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsumosBodegas.add(this.jPanelAccionesFormularioConsumosBodegas, this.gridBagConstraintsConsumosBodegas);							
			
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
	        this.gridBagConstraintsConsumosBodegas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConsumosBodegas.gridx = 0;
	        
			
			this.jContentPaneDetalleConsumosBodegas.add(this.jPanelAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsumosBodegas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsumosBodegas=   new JScrollPane(this.jPanelCamposConsumosBodegas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsumosBodegas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosBodegas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsumosBodegas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsumosBodegas.gridx = 0;
			this.gridBagConstraintsConsumosBodegas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsumosBodegas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsumosBodegas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsumosBodegas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsumosBodegas, this.gridBagConstraintsConsumosBodegas);			
			
			this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
			this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsumosBodegas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
			
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		
			
		this.gridBagConstraintsConsumosBodegas = new GridBagConstraints();
		this.gridBagConstraintsConsumosBodegas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsumosBodegas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsumosBodegas, this.gridBagConstraintsConsumosBodegas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsumosBodegas;//jContentPane;
		
		return jScrollPanelDatosEdicionConsumosBodegas;
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
