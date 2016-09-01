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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.report.ExistenciasCostosConstantesFunciones;

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
public class ExistenciasCostosDetalleFormJInternalFrame extends ExistenciasCostosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleExistenciasCostos;
	
	protected JMenuBar jmenuBarDetalleExistenciasCostos;
	
	protected JMenu jmenuDetalleExistenciasCostos;
	protected JMenu jmenuDetalleArchivoExistenciasCostos;
	protected JMenu jmenuDetalleAccionesExistenciasCostos;
	protected JMenu jmenuDetalleDatosExistenciasCostos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutExistenciasCostos;	
	protected GridBagConstraints gridBagConstraintsExistenciasCostos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ExistenciasCostosBeanSwingJInternalFrameAdditional jInternalFrameDetalleExistenciasCostos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public ExistenciasCostosSessionBean existenciascostosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public ExistenciasCostosLogic existenciascostosLogic;
	
	public JScrollPane jScrollPanelDatosExistenciasCostos;
	public JScrollPane jScrollPanelDatosEdicionExistenciasCostos;
	public JScrollPane jScrollPanelDatosGeneralExistenciasCostos;
	
	protected JPanel jPanelCamposExistenciasCostos;    
	protected JPanel jPanelCamposOcultosExistenciasCostos;    	
	protected JPanel jPanelAccionesExistenciasCostos;
	protected JPanel jPanelAccionesFormularioExistenciasCostos;
    
	
	
	protected Integer iXPanelCamposExistenciasCostos=0;
	protected Integer iYPanelCamposExistenciasCostos=0;
	
	protected Integer iXPanelCamposOcultosExistenciasCostos=0;
	protected Integer iYPanelCamposOcultosExistenciasCostos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoExistenciasCostos;
	public JButton jButtonModificarExistenciasCostos;
	public JButton jButtonActualizarExistenciasCostos;
    public JButton jButtonEliminarExistenciasCostos;
	public JButton jButtonCancelarExistenciasCostos;
    public JButton jButtonGuardarCambiosExistenciasCostos;
	public JButton jButtonGuardarCambiosTablaExistenciasCostos;
	protected JButton jButtonCerrarExistenciasCostos;
	
	
	protected JButton jButtonProcesarInformacionExistenciasCostos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoExistenciasCostos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarExistenciasCostos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeExistenciasCostos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarExistenciasCostos;
	protected JButton jButtonModificarToolBarExistenciasCostos;
	protected JButton jButtonActualizarToolBarExistenciasCostos;
    protected JButton jButtonEliminarToolBarExistenciasCostos;
	protected JButton jButtonCancelarToolBarExistenciasCostos;
    protected JButton jButtonGuardarCambiosToolBarExistenciasCostos;
	protected JButton jButtonGuardarCambiosTablaToolBarExistenciasCostos;
	protected JButton jButtonMostrarOcultarTablaToolBarExistenciasCostos;
	protected JButton jButtonCerrarToolBarExistenciasCostos;
	
	protected JButton jButtonProcesarInformacionToolBarExistenciasCostos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoExistenciasCostos;
	protected JMenuItem jMenuItemModificarExistenciasCostos;
	protected JMenuItem jMenuItemActualizarExistenciasCostos;
    protected JMenuItem jMenuItemEliminarExistenciasCostos;
	protected JMenuItem jMenuItemCancelarExistenciasCostos;
    protected JMenuItem jMenuItemGuardarCambiosExistenciasCostos;
	protected JMenuItem jMenuItemGuardarCambiosTablaExistenciasCostos;
	protected JMenuItem jMenuItemCerrarExistenciasCostos;
	protected JMenuItem jMenuItemDetalleCerrarExistenciasCostos;
	protected JMenuItem jMenuItemDetalleMostarOcultarExistenciasCostos;
	
	protected JMenuItem jMenuItemProcesarInformacionExistenciasCostos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosExistenciasCostos;
	protected JMenuItem jMenuItemMostrarOcultarExistenciasCostos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesExistenciasCostos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesExistenciasCostos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesExistenciasCostos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioExistenciasCostos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidExistenciasCostos;
	public JLabel jLabelIdExistenciasCostos;
	public JLabel jLabelidExistenciasCostos;
	public JButton jButtonidExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaExistenciasCostos;
	public JLabel jLabelfecha_emision_hastaExistenciasCostos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaExistenciasCostos;

	public JDateChooser jDateChooserfecha_emision_hastaExistenciasCostos;
	public JButton jButtonfecha_emision_hastaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_productoExistenciasCostos;
	public JLabel jLabelnombre_productoExistenciasCostos;
	public JTextArea jTextAreanombre_productoExistenciasCostos;
	public JScrollPane jscrollPanenombre_productoExistenciasCostos;
	public JButton jButtonnombre_productoExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_unidadExistenciasCostos;
	public JLabel jLabelnombre_unidadExistenciasCostos;
	public JTextField jTextFieldnombre_unidadExistenciasCostos;
	public JButton jButtonnombre_unidadExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaExistenciasCostos;
	public JLabel jLabelnombre_lineaExistenciasCostos;
	public JTextArea jTextAreanombre_lineaExistenciasCostos;
	public JScrollPane jscrollPanenombre_lineaExistenciasCostos;
	public JButton jButtonnombre_lineaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_grupoExistenciasCostos;
	public JLabel jLabelnombre_linea_grupoExistenciasCostos;
	public JTextArea jTextAreanombre_linea_grupoExistenciasCostos;
	public JScrollPane jscrollPanenombre_linea_grupoExistenciasCostos;
	public JButton jButtonnombre_linea_grupoExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_categoriaExistenciasCostos;
	public JLabel jLabelnombre_linea_categoriaExistenciasCostos;
	public JTextArea jTextAreanombre_linea_categoriaExistenciasCostos;
	public JScrollPane jscrollPanenombre_linea_categoriaExistenciasCostos;
	public JButton jButtonnombre_linea_categoriaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_linea_marcaExistenciasCostos;
	public JLabel jLabelnombre_linea_marcaExistenciasCostos;
	public JTextArea jTextAreanombre_linea_marcaExistenciasCostos;
	public JScrollPane jscrollPanenombre_linea_marcaExistenciasCostos;
	public JButton jButtonnombre_linea_marcaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoExistenciasCostos;
	public JLabel jLabelcodigoExistenciasCostos;
	public JTextField jTextFieldcodigoExistenciasCostos;
	public JButton jButtoncodigoExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalExistenciasCostos;
	public JLabel jLabelcosto_totalExistenciasCostos;
	public JTextField jTextFieldcosto_totalExistenciasCostos;
	public JButton jButtoncosto_totalExistenciasCostosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaExistenciasCostos;
	public JLabel jLabelid_empresaExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaExistenciasCostos;
	public JButton jButtonid_empresaExistenciasCostos= new JButtonMe();
	public JButton jButtonid_empresaExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_empresaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaExistenciasCostos;
	public JLabel jLabelid_lineaExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaExistenciasCostos;
	public JButton jButtonid_lineaExistenciasCostos= new JButtonMe();
	public JButton jButtonid_lineaExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_lineaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoExistenciasCostos;
	public JLabel jLabelid_linea_grupoExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoExistenciasCostos;
	public JButton jButtonid_linea_grupoExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_grupoExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaExistenciasCostos;
	public JLabel jLabelid_linea_categoriaExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaExistenciasCostos;
	public JButton jButtonid_linea_categoriaExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_categoriaExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaExistenciasCostosBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaExistenciasCostos;
	public JLabel jLabelid_linea_marcaExistenciasCostos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaExistenciasCostos;
	public JButton jButtonid_linea_marcaExistenciasCostos= new JButtonMe();
	public JButton jButtonid_linea_marcaExistenciasCostosUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaExistenciasCostosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesExistenciasCostos;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ExistenciasCostosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposExistenciasCostos=new JPanel();
				this.jPanelAccionesFormularioExistenciasCostos=new JPanel();
				this.jmenuBarDetalleExistenciasCostos=new JMenuBar();
				this.jTtoolBarDetalleExistenciasCostos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ExistenciasCostosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ExistenciasCostosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ExistenciasCostos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarExistenciasCostos() {
		return this.jButtonActualizarToolBarExistenciasCostos;
	}
	
	public JButton getjButtonEliminarToolBarExistenciasCostos() {
		return this.jButtonEliminarToolBarExistenciasCostos;
	}
	
	public JButton getjButtonCancelarToolBarExistenciasCostos() {
		return this.jButtonCancelarToolBarExistenciasCostos;
	}		
	
	public JButton getjButtonProcesarInformacionExistenciasCostos() {
		return this.jButtonProcesarInformacionExistenciasCostos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionExistenciasCostos)	{
		this.jButtonProcesarInformacionExistenciasCostos = jButtonProcesarInformacionExistenciasCostos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesExistenciasCostos() {
		return this.jComboBoxTiposAccionesExistenciasCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesExistenciasCostos(
			JComboBox jComboBoxTiposRelacionesExistenciasCostos) {
		this.jComboBoxTiposRelacionesExistenciasCostos = jComboBoxTiposRelacionesExistenciasCostos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesExistenciasCostos(
			JComboBox jComboBoxTiposAccionesExistenciasCostos) {
		this.jComboBoxTiposAccionesExistenciasCostos = jComboBoxTiposAccionesExistenciasCostos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioExistenciasCostos() {
		return this.jComboBoxTiposAccionesFormularioExistenciasCostos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioExistenciasCostos(
			JComboBox jComboBoxTiposAccionesFormularioExistenciasCostos) {
		this.jComboBoxTiposAccionesFormularioExistenciasCostos = jComboBoxTiposAccionesFormularioExistenciasCostos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.existenciascostosSessionBean=new ExistenciasCostosSessionBean();
		
		this.existenciascostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.existenciascostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.existenciascostosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ExistenciasCostosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ExistenciasCostosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Existencias Costos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
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
	
		ExistenciasCostosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleExistenciasCostos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarExistenciasCostos=new JButtonMe();
				this.jButtonModificarToolBarExistenciasCostos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos,
							"actualizar","actualizar","Actualizar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos,
							"eliminar","eliminar","Eliminar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos,
							"cancelar","cancelar","Cancelar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarExistenciasCostos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarExistenciasCostos,this.jTtoolBarDetalleExistenciasCostos,
							"guardarcambios","guardarcambios","Guardar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleExistenciasCostos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleExistenciasCostos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoExistenciasCostos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesExistenciasCostos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosExistenciasCostos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoExistenciasCostos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoExistenciasCostos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoExistenciasCostos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarExistenciasCostos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarExistenciasCostos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarExistenciasCostos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarExistenciasCostos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarExistenciasCostos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarExistenciasCostos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarExistenciasCostos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarExistenciasCostos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarExistenciasCostos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarExistenciasCostos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarExistenciasCostos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarExistenciasCostos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosExistenciasCostos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosExistenciasCostos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosExistenciasCostos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarExistenciasCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarExistenciasCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarExistenciasCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarExistenciasCostos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarExistenciasCostos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarExistenciasCostos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarExistenciasCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarExistenciasCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarExistenciasCostos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarExistenciasCostos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarExistenciasCostos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarExistenciasCostos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoExistenciasCostos.add(this.jMenuItemDetalleCerrarExistenciasCostos);
		
		this.jmenuDetalleAccionesExistenciasCostos.add(this.jMenuItemActualizarExistenciasCostos);
		this.jmenuDetalleAccionesExistenciasCostos.add(this.jMenuItemEliminarExistenciasCostos);
		this.jmenuDetalleAccionesExistenciasCostos.add(this.jMenuItemCancelarExistenciasCostos);		
		
		//this.jmenuDetalleDatosExistenciasCostos.add(this.jMenuItemDetalleAbrirOrderByExistenciasCostos);				
		this.jmenuDetalleDatosExistenciasCostos.add(this.jMenuItemDetalleMostarOcultarExistenciasCostos);				
				
		//this.jmenuDetalleAccionesExistenciasCostos.add(this.jMenuItemGuardarCambiosExistenciasCostos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleExistenciasCostos.add(this.jmenuDetalleArchivoExistenciasCostos);		
		this.jmenuBarDetalleExistenciasCostos.add(this.jmenuDetalleAccionesExistenciasCostos);		
		this.jmenuBarDetalleExistenciasCostos.add(this.jmenuDetalleDatosExistenciasCostos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleExistenciasCostos);				
	}
	
	
	public void inicializarElementosCamposExistenciasCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdExistenciasCostos = new JLabelMe();
		jLabelIdExistenciasCostos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidExistenciasCostos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutExistenciasCostos= new GridBagLayout();

		this.jPanelidExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);

		jLabelidExistenciasCostos = new JLabel();
		jLabelidExistenciasCostos.setText("Id");

		jLabelidExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaExistenciasCostos = new JLabelMe();
		this.jLabelfecha_emision_hastaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaExistenciasCostos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelfecha_emision_hastaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		//jFormattedTextFieldfecha_emision_hastaExistenciasCostos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaExistenciasCostos= new JDateChooser();
		jDateChooserfecha_emision_hastaExistenciasCostos.setEnabled(false);
		jDateChooserfecha_emision_hastaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaExistenciasCostos.setDate(new Date());
		jDateChooserfecha_emision_hastaExistenciasCostos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaExistenciasCostos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_productoExistenciasCostos = new JLabelMe();
		this.jLabelnombre_productoExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO+" : *");
		this.jLabelnombre_productoExistenciasCostos.setToolTipText("Nombre Producto");
		this.jLabelnombre_productoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_productoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_productoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_productoExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_productoExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_productoExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextAreanombre_productoExistenciasCostos= new JTextAreaMe();
		jTextAreanombre_productoExistenciasCostos.setEnabled(false);
		jTextAreanombre_productoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_productoExistenciasCostos.setLineWrap(true);
		jTextAreanombre_productoExistenciasCostos.setWrapStyleWord(true);
		jTextAreanombre_productoExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_productoExistenciasCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_productoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_productoExistenciasCostos = new JScrollPane(jTextAreanombre_productoExistenciasCostos);
		jscrollPanenombre_productoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_productoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_productoExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_productoExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_productoExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_productoExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_productoExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_productoExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_productoExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_productoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_productoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_productoExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_productoExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_unidadExistenciasCostos = new JLabelMe();
		this.jLabelnombre_unidadExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD+" : *");
		this.jLabelnombre_unidadExistenciasCostos.setToolTipText("Nombre Unad");
		this.jLabelnombre_unidadExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_unidadExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_unidadExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_unidadExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_unidadExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBREUNIDAD);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_unidadExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextFieldnombre_unidadExistenciasCostos= new JTextFieldMe();

		jTextFieldnombre_unidadExistenciasCostos.setEnabled(false);
		jTextFieldnombre_unidadExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_unidadExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_unidadExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_unidadExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_unidadExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_unidadExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_unidadExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_unidadExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_unidadExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_unidadExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaExistenciasCostos = new JLabelMe();
		this.jLabelnombre_lineaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaExistenciasCostos.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_lineaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextAreanombre_lineaExistenciasCostos= new JTextAreaMe();
		jTextAreanombre_lineaExistenciasCostos.setEnabled(false);
		jTextAreanombre_lineaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaExistenciasCostos.setLineWrap(true);
		jTextAreanombre_lineaExistenciasCostos.setWrapStyleWord(true);
		jTextAreanombre_lineaExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaExistenciasCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaExistenciasCostos = new JScrollPane(jTextAreanombre_lineaExistenciasCostos);
		jscrollPanenombre_lineaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_grupoExistenciasCostos = new JLabelMe();
		this.jLabelnombre_linea_grupoExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+" : *");
		this.jLabelnombre_linea_grupoExistenciasCostos.setToolTipText("Nombre Linea Grupo");
		this.jLabelnombre_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_grupoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_grupoExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_grupoExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_linea_grupoExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextAreanombre_linea_grupoExistenciasCostos= new JTextAreaMe();
		jTextAreanombre_linea_grupoExistenciasCostos.setEnabled(false);
		jTextAreanombre_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_grupoExistenciasCostos.setLineWrap(true);
		jTextAreanombre_linea_grupoExistenciasCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_grupoExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_grupoExistenciasCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_grupoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_grupoExistenciasCostos = new JScrollPane(jTextAreanombre_linea_grupoExistenciasCostos);
		jscrollPanenombre_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_grupoExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_grupoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_grupoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_grupoExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_grupoExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_categoriaExistenciasCostos = new JLabelMe();
		this.jLabelnombre_linea_categoriaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+" : *");
		this.jLabelnombre_linea_categoriaExistenciasCostos.setToolTipText("Nombre Linea Categoria");
		this.jLabelnombre_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_categoriaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_categoriaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_categoriaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_linea_categoriaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextAreanombre_linea_categoriaExistenciasCostos= new JTextAreaMe();
		jTextAreanombre_linea_categoriaExistenciasCostos.setEnabled(false);
		jTextAreanombre_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_categoriaExistenciasCostos.setLineWrap(true);
		jTextAreanombre_linea_categoriaExistenciasCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_categoriaExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_categoriaExistenciasCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_categoriaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_categoriaExistenciasCostos = new JScrollPane(jTextAreanombre_linea_categoriaExistenciasCostos);
		jscrollPanenombre_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_categoriaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_categoriaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_categoriaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_categoriaExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_linea_marcaExistenciasCostos = new JLabelMe();
		this.jLabelnombre_linea_marcaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA+" : *");
		this.jLabelnombre_linea_marcaExistenciasCostos.setToolTipText("Nombre Linea Marca");
		this.jLabelnombre_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_linea_marcaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_linea_marcaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_linea_marcaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelnombre_linea_marcaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextAreanombre_linea_marcaExistenciasCostos= new JTextAreaMe();
		jTextAreanombre_linea_marcaExistenciasCostos.setEnabled(false);
		jTextAreanombre_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_linea_marcaExistenciasCostos.setLineWrap(true);
		jTextAreanombre_linea_marcaExistenciasCostos.setWrapStyleWord(true);
		jTextAreanombre_linea_marcaExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_linea_marcaExistenciasCostos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_linea_marcaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_linea_marcaExistenciasCostos = new JScrollPane(jTextAreanombre_linea_marcaExistenciasCostos);
		jscrollPanenombre_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setText("U");
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_linea_marcaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_linea_marcaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_linea_marcaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_linea_marcaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_linea_marcaExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelcodigoExistenciasCostos = new JLabelMe();
		this.jLabelcodigoExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoExistenciasCostos.setToolTipText("Codigo");
		this.jLabelcodigoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelcodigoExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextFieldcodigoExistenciasCostos= new JTextFieldMe();

		jTextFieldcodigoExistenciasCostos.setEnabled(false);
		jTextFieldcodigoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoExistenciasCostosBusqueda= new JButtonMe();
		this.jButtoncodigoExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoExistenciasCostosBusqueda.setText("U");
		this.jButtoncodigoExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoExistenciasCostosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalExistenciasCostos = new JLabelMe();
		this.jLabelcosto_totalExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalExistenciasCostos.setToolTipText("Costo Total");
		this.jLabelcosto_totalExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelcosto_totalExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jTextFieldcosto_totalExistenciasCostos= new JTextFieldMe();
		jTextFieldcosto_totalExistenciasCostos.setEnabled(false);
		jTextFieldcosto_totalExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalExistenciasCostos.setText("0.0");

		this.jButtoncosto_totalExistenciasCostosBusqueda= new JButtonMe();
		this.jButtoncosto_totalExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalExistenciasCostosBusqueda.setText("U");
		this.jButtoncosto_totalExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalExistenciasCostosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysExistenciasCostos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaExistenciasCostos = new JLabelMe();
		this.jLabelid_empresaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaExistenciasCostos.setToolTipText("Empresa");
		this.jLabelid_empresaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelid_empresaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jComboBoxid_empresaExistenciasCostos= new JComboBoxMe();
		jComboBoxid_empresaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaExistenciasCostos.setEnabled(false);

		this.jButtonid_empresaExistenciasCostos= new JButtonMe();
		this.jButtonid_empresaExistenciasCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaExistenciasCostos.setText("Buscar");
		this.jButtonid_empresaExistenciasCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaExistenciasCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasCostos"));

		this.jButtonid_empresaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonid_empresaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaExistenciasCostosBusqueda.setText("U");
		this.jButtonid_empresaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaExistenciasCostosBusqueda.setVisible(false);		}

		this.jButtonid_empresaExistenciasCostosUpdate= new JButtonMe();
		this.jButtonid_empresaExistenciasCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaExistenciasCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaExistenciasCostosUpdate.setText("U");
		this.jButtonid_empresaExistenciasCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaExistenciasCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaExistenciasCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaExistenciasCostosUpdate"));



					
		this.jLabelid_lineaExistenciasCostos = new JLabelMe();
		this.jLabelid_lineaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaExistenciasCostos.setToolTipText("Linea");
		this.jLabelid_lineaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelid_lineaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jComboBoxid_lineaExistenciasCostos= new JComboBoxMe();
		jComboBoxid_lineaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaExistenciasCostos= new JButtonMe();
		this.jButtonid_lineaExistenciasCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaExistenciasCostos.setText("Buscar");
		this.jButtonid_lineaExistenciasCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaExistenciasCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasCostos"));

		this.jButtonid_lineaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonid_lineaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaExistenciasCostosBusqueda.setText("U");
		this.jButtonid_lineaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaExistenciasCostosBusqueda.setVisible(false);		}

		this.jButtonid_lineaExistenciasCostosUpdate= new JButtonMe();
		this.jButtonid_lineaExistenciasCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaExistenciasCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaExistenciasCostosUpdate.setText("U");
		this.jButtonid_lineaExistenciasCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaExistenciasCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaExistenciasCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaExistenciasCostosUpdate"));



					
		this.jLabelid_linea_grupoExistenciasCostos = new JLabelMe();
		this.jLabelid_linea_grupoExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoExistenciasCostos.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelid_linea_grupoExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jComboBoxid_linea_grupoExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoExistenciasCostos= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoExistenciasCostos.setText("Buscar");
		this.jButtonid_linea_grupoExistenciasCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoExistenciasCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasCostos"));

		this.jButtonid_linea_grupoExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoExistenciasCostosBusqueda.setText("U");
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoExistenciasCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoExistenciasCostosUpdate= new JButtonMe();
		this.jButtonid_linea_grupoExistenciasCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoExistenciasCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoExistenciasCostosUpdate.setText("U");
		this.jButtonid_linea_grupoExistenciasCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoExistenciasCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoExistenciasCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoExistenciasCostosUpdate"));



					
		this.jLabelid_linea_categoriaExistenciasCostos = new JLabelMe();
		this.jLabelid_linea_categoriaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaExistenciasCostos.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelid_linea_categoriaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jComboBoxid_linea_categoriaExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaExistenciasCostos= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaExistenciasCostos.setText("Buscar");
		this.jButtonid_linea_categoriaExistenciasCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaExistenciasCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasCostos"));

		this.jButtonid_linea_categoriaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setText("U");
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaExistenciasCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaExistenciasCostosUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaExistenciasCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaExistenciasCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaExistenciasCostosUpdate.setText("U");
		this.jButtonid_linea_categoriaExistenciasCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaExistenciasCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaExistenciasCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaExistenciasCostosUpdate"));



					
		this.jLabelid_linea_marcaExistenciasCostos = new JLabelMe();
		this.jLabelid_linea_marcaExistenciasCostos.setText(""+ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaExistenciasCostos.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaExistenciasCostos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaExistenciasCostos.setToolTipText(ExistenciasCostosConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutExistenciasCostos = new GridBagLayout();
		this.jPanelid_linea_marcaExistenciasCostos.setLayout(this.gridaBagLayoutExistenciasCostos);


		jComboBoxid_linea_marcaExistenciasCostos= new JComboBoxMe();
		jComboBoxid_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaExistenciasCostos= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasCostos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasCostos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasCostos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaExistenciasCostos.setText("Buscar");
		this.jButtonid_linea_marcaExistenciasCostos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaExistenciasCostos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasCostos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasCostos"));

		this.jButtonid_linea_marcaExistenciasCostosBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaExistenciasCostosBusqueda.setText("U");
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasCostosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasCostosBusqueda"));

		if(this.existenciascostosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaExistenciasCostosBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaExistenciasCostosUpdate= new JButtonMe();
		this.jButtonid_linea_marcaExistenciasCostosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasCostosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaExistenciasCostosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaExistenciasCostosUpdate.setText("U");
		this.jButtonid_linea_marcaExistenciasCostosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaExistenciasCostosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaExistenciasCostosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaExistenciasCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaExistenciasCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaExistenciasCostosUpdate"));



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
		//this.jInternalFrameDetalleExistenciasCostos = new ExistenciasCostosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Existencias Costos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutExistenciasCostos= new GridBagLayout();
		

		
		String sToolTipExistenciasCostos="";
		sToolTipExistenciasCostos=ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipExistenciasCostos+="(Inventario.ExistenciasCostos)";
		}
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			sToolTipExistenciasCostos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoExistenciasCostos = new JButtonMe();
		this.jButtonModificarExistenciasCostos = new JButtonMe();
        this.jButtonActualizarExistenciasCostos = new JButtonMe();
        this.jButtonEliminarExistenciasCostos = new JButtonMe();
        this.jButtonCancelarExistenciasCostos = new JButtonMe();
        this.jButtonGuardarCambiosExistenciasCostos = new JButtonMe();
		this.jButtonGuardarCambiosTablaExistenciasCostos = new JButtonMe();
		this.jButtonCerrarExistenciasCostos = new JButtonMe();
		
		this.jScrollPanelDatosExistenciasCostos = new JScrollPane();   
        this.jScrollPanelDatosEdicionExistenciasCostos = new JScrollPane();
		this.jScrollPanelDatosGeneralExistenciasCostos = new JScrollPane();
				
		
		
		this.jPanelCamposExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Existencias Costos";
		
		if(!this.existenciascostosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Existencias Costoses" + this.sPath));
		} else {
			this.jScrollPanelDatosExistenciasCostos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposExistenciasCostos.setName("jPanelCamposExistenciasCostos"); 

		this.jPanelCamposOcultosExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosExistenciasCostos.setName("jPanelCamposOcultosExistenciasCostos"); 

        this.jPanelAccionesExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesExistenciasCostos.setToolTipText("Acciones");
        this.jPanelAccionesExistenciasCostos.setName("Acciones"); 

		this.jPanelAccionesFormularioExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioExistenciasCostos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioExistenciasCostos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoExistenciasCostos.setText("Nuevo");
		this.jButtonModificarExistenciasCostos.setText("Editar");
        this.jButtonActualizarExistenciasCostos.setText("Actualizar");
        this.jButtonEliminarExistenciasCostos.setText("Eliminar");
        this.jButtonCancelarExistenciasCostos.setText("Cancelar");
        this.jButtonGuardarCambiosExistenciasCostos.setText("Guardar");
		this.jButtonGuardarCambiosTablaExistenciasCostos.setText("Guardar");
		this.jButtonCerrarExistenciasCostos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoExistenciasCostos,"nuevo_button","Nuevo",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarExistenciasCostos,"modificar_button","Editar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarExistenciasCostos,"actualizar_button","Actualizar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarExistenciasCostos,"eliminar_button","Eliminar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarExistenciasCostos,"cancelar_button","Cancelar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosExistenciasCostos,"guardarcambios_button","Guardar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaExistenciasCostos,"guardarcambiostabla_button","Guardar",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarExistenciasCostos,"cerrar_button","Salir",this.existenciascostosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoExistenciasCostos.setToolTipText("Nuevo"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarExistenciasCostos.setToolTipText("Editar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarExistenciasCostos.setToolTipText("Actualizar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarExistenciasCostos.setToolTipText("Eliminar)"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarExistenciasCostos.setToolTipText("Cancelar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosExistenciasCostos.setToolTipText("Guardar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaExistenciasCostos.setToolTipText("Guardar"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarExistenciasCostos.setToolTipText("Salir"+" "+ExistenciasCostosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoExistenciasCostos";
		inputMap = this.jButtonNuevoExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoExistenciasCostos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoExistenciasCostos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarExistenciasCostos";
		inputMap = this.jButtonActualizarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarExistenciasCostos"));
		
		//ELIMINAR
		sMapKey = "EliminarExistenciasCostos";
		inputMap = this.jButtonEliminarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarExistenciasCostos"));
		
		//CANCELAR	
		sMapKey = "CancelarExistenciasCostos";
		inputMap = this.jButtonCancelarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarExistenciasCostos"));
		
		//CERRAR		
		sMapKey = "CerrarExistenciasCostos";
		inputMap = this.jButtonCerrarExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarExistenciasCostos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaExistenciasCostos";
		inputMap = this.jButtonGuardarCambiosTablaExistenciasCostos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaExistenciasCostos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaExistenciasCostos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoExistenciasCostos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoExistenciasCostos.setToolTipText("Nuevo ExistenciasCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarExistenciasCostos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarExistenciasCostos.setToolTipText("Sin Cerrar Ventana ExistenciasCostos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeExistenciasCostos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeExistenciasCostos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeExistenciasCostos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesExistenciasCostos.setText("Accion");
		this.jComboBoxTiposAccionesExistenciasCostos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioExistenciasCostos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioExistenciasCostos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioExistenciasCostos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesExistenciasCostos = new JLabelMe();
		
		this.jLabelAccionesExistenciasCostos.setText("Acciones");		
		this.jLabelAccionesExistenciasCostos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasCostos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesExistenciasCostos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposExistenciasCostos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysExistenciasCostos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesExistenciasCostos=new JTabbedPane();
		this.jTabbedPaneRelacionesExistenciasCostos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesExistenciasCostos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesExistenciasCostos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasCostos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesExistenciasCostos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesExistenciasCostos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioExistenciasCostos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioExistenciasCostos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioExistenciasCostos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioExistenciasCostos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposExistenciasCostos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosExistenciasCostos = new GridBagLayout();
		
		this.jPanelCamposExistenciasCostos.setLayout(gridaBagLayoutCamposExistenciasCostos);
		this.jPanelCamposOcultosExistenciasCostos.setLayout(gridaBagLayoutCamposOcultosExistenciasCostos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidExistenciasCostos.add(jLabelIdExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidExistenciasCostos.add(jLabelidExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaExistenciasCostos.add(jLabelid_empresaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaExistenciasCostos.add(jButtonid_empresaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 3;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaExistenciasCostos.add(jButtonid_empresaExistenciasCostosUpdate, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaExistenciasCostos.add(jComboBoxid_empresaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaExistenciasCostos.add(jLabelid_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaExistenciasCostos.add(jButtonid_lineaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 3;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaExistenciasCostos.add(jButtonid_lineaExistenciasCostosUpdate, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaExistenciasCostos.add(jComboBoxid_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoExistenciasCostos.add(jLabelid_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoExistenciasCostos.add(jButtonid_linea_grupoExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 3;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoExistenciasCostos.add(jButtonid_linea_grupoExistenciasCostosUpdate, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoExistenciasCostos.add(jComboBoxid_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaExistenciasCostos.add(jLabelid_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaExistenciasCostos.add(jButtonid_linea_categoriaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 3;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaExistenciasCostos.add(jButtonid_linea_categoriaExistenciasCostosUpdate, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaExistenciasCostos.add(jComboBoxid_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaExistenciasCostos.add(jLabelid_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaExistenciasCostos.add(jButtonid_linea_marcaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 3;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaExistenciasCostos.add(jButtonid_linea_marcaExistenciasCostosUpdate, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaExistenciasCostos.add(jComboBoxid_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaExistenciasCostos.add(jLabelfecha_emision_hastaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaExistenciasCostos.add(jButtonfecha_emision_hastaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaExistenciasCostos.add(jDateChooserfecha_emision_hastaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_productoExistenciasCostos.add(jLabelnombre_productoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_productoExistenciasCostos.add(jButtonnombre_productoExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_productoExistenciasCostos.add(jscrollPanenombre_productoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_unidadExistenciasCostos.add(jLabelnombre_unidadExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_unidadExistenciasCostos.add(jButtonnombre_unidadExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_unidadExistenciasCostos.add(jTextFieldnombre_unidadExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaExistenciasCostos.add(jLabelnombre_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaExistenciasCostos.add(jButtonnombre_lineaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaExistenciasCostos.add(jscrollPanenombre_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_grupoExistenciasCostos.add(jLabelnombre_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_grupoExistenciasCostos.add(jButtonnombre_linea_grupoExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_grupoExistenciasCostos.add(jscrollPanenombre_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_categoriaExistenciasCostos.add(jLabelnombre_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_categoriaExistenciasCostos.add(jButtonnombre_linea_categoriaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_categoriaExistenciasCostos.add(jscrollPanenombre_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_linea_marcaExistenciasCostos.add(jLabelnombre_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_linea_marcaExistenciasCostos.add(jButtonnombre_linea_marcaExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_linea_marcaExistenciasCostos.add(jscrollPanenombre_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoExistenciasCostos.add(jLabelcodigoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoExistenciasCostos.add(jButtoncodigoExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoExistenciasCostos.add(jTextFieldcodigoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 0;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalExistenciasCostos.add(jLabelcosto_totalExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		//this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = 2;
		this.gridBagConstraintsExistenciasCostos.ipadx = 0;
		this.gridBagConstraintsExistenciasCostos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalExistenciasCostos.add(jButtoncosto_totalExistenciasCostosBusqueda, this.gridBagConstraintsExistenciasCostos);
	}

	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsExistenciasCostos.gridy = 0;
	this.gridBagConstraintsExistenciasCostos.gridx = 1;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalExistenciasCostos.add(jTextFieldcosto_totalExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelidExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelid_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelid_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelid_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelid_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelfecha_emision_hastaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_productoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_unidadExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_lineaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_linea_grupoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_linea_categoriaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelnombre_linea_marcaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelcodigoExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposExistenciasCostos.add(this.jPanelcosto_totalExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposExistenciasCostos % 2==0) {
		iXPanelCamposExistenciasCostos=0;
		iYPanelCamposExistenciasCostos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsExistenciasCostos.gridy = iYPanelCamposOcultosExistenciasCostos;
	this.gridBagConstraintsExistenciasCostos.gridx = iXPanelCamposOcultosExistenciasCostos++;
	this.gridBagConstraintsExistenciasCostos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsExistenciasCostos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosExistenciasCostos.add(this.jPanelid_empresaExistenciasCostos, this.gridBagConstraintsExistenciasCostos);



	if(iXPanelCamposOcultosExistenciasCostos % 2==0) {
		iXPanelCamposOcultosExistenciasCostos=0;
		iYPanelCamposOcultosExistenciasCostos++;
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
			
		GridBagLayout gridaBagLayoutAccionesExistenciasCostos= new GridBagLayout();
		this.jPanelAccionesExistenciasCostos.setLayout(gridaBagLayoutAccionesExistenciasCostos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioExistenciasCostos= new GridBagLayout();
		this.jPanelAccionesFormularioExistenciasCostos.setLayout(gridaBagLayoutAccionesFormularioExistenciasCostos);
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsExistenciasCostos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioExistenciasCostos.add(this.jComboBoxTiposAccionesFormularioExistenciasCostos, this.gridBagConstraintsExistenciasCostos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccion++;
			
		this.jPanelAccionesExistenciasCostos.add(this.jButtonModificarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);							

		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsExistenciasCostos.gridy = 0;
		this.gridBagConstraintsExistenciasCostos.gridx =iPosXAccion++;
			
		this.jPanelAccionesExistenciasCostos.add(this.jButtonEliminarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = 0;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesExistenciasCostos.add(this.jButtonActualizarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);


		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = 0;		
		this.gridBagConstraintsExistenciasCostos.gridx = iPosXAccion++;
		
		this.jPanelAccionesExistenciasCostos.add(this.jButtonGuardarCambiosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);	
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = 0;		
		this.gridBagConstraintsExistenciasCostos.gridx =iPosXAccion++;
		
		this.jPanelAccionesExistenciasCostos.add(this.jButtonCancelarExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutExistenciasCostos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutExistenciasCostos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.existenciascostosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();						
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsExistenciasCostos.gridx = 0;		
			//this.gridBagConstraintsExistenciasCostos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsExistenciasCostos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsExistenciasCostos.gridx =0;
		this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsExistenciasCostos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ExistenciasCostosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleExistenciasCostos = new ExistenciasCostosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Existencias Costos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Existencias Costos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Existencias Costos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ExistenciasCostosModel existenciascostosModel=new ExistenciasCostosModel(this);
			
			//SI USARA CLASE INTERNA
			//ExistenciasCostosModel.ExistenciasCostosFocusTraversalPolicy existenciascostosFocusTraversalPolicy = existenciascostosModel.new ExistenciasCostosFocusTraversalPolicy(this);
			
			//existenciascostosFocusTraversalPolicy.setexistenciascostosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(existenciascostosModel);
			
			
			this.jContentPaneDetalleExistenciasCostos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleExistenciasCostos = new GridBagLayout();	
			this.jContentPaneDetalleExistenciasCostos.setLayout(gridaBagLayoutDetalleExistenciasCostos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosExistenciasCostos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
				this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsExistenciasCostos.gridx = 0;
					
				
				this.jContentPaneDetalleExistenciasCostos.add(jTtoolBarDetalleExistenciasCostos, gridBagConstraintsExistenciasCostos);								
				
}
			
			this.jScrollPanelDatosEdicionExistenciasCostos=   new JScrollPane(jContentPaneDetalleExistenciasCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionExistenciasCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralExistenciasCostos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralExistenciasCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralExistenciasCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsExistenciasCostos.gridx = 0;
	        
			this.jContentPaneDetalleExistenciasCostos.add(jPanelCamposExistenciasCostos, gridBagConstraintsExistenciasCostos);
			
			
			
			
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
						//&& existenciascostosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.existenciascostosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsExistenciasCostos= new GridBagConstraints();
						this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsExistenciasCostos.gridx = 0;
						this.jContentPaneDetalleExistenciasCostos.add(this.jTabbedPaneRelacionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesExistenciasCostos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosExistenciasCostos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
					this.gridBagConstraintsExistenciasCostos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsExistenciasCostos.gridx = 0;
					
				
					this.jContentPaneDetalleExistenciasCostos.add(jPanelCamposOcultosExistenciasCostos, gridBagConstraintsExistenciasCostos);
				
					this.jPanelCamposOcultosExistenciasCostos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsExistenciasCostos.gridx = 0;
	        this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleExistenciasCostos.add(this.jPanelAccionesFormularioExistenciasCostos, this.gridBagConstraintsExistenciasCostos);							
			
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
	        this.gridBagConstraintsExistenciasCostos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsExistenciasCostos.gridx = 0;
	        
			
			this.jContentPaneDetalleExistenciasCostos.add(this.jPanelAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionExistenciasCostos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionExistenciasCostos=   new JScrollPane(this.jPanelCamposExistenciasCostos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionExistenciasCostos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasCostos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionExistenciasCostos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasCostos.gridx = 0;
			this.gridBagConstraintsExistenciasCostos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsExistenciasCostos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsExistenciasCostos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioExistenciasCostos, this.gridBagConstraintsExistenciasCostos);			
			
			this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
			this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsExistenciasCostos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
			
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		
			
		this.gridBagConstraintsExistenciasCostos = new GridBagConstraints();
		this.gridBagConstraintsExistenciasCostos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsExistenciasCostos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesExistenciasCostos, this.gridBagConstraintsExistenciasCostos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralExistenciasCostos;//jContentPane;
		
		return jScrollPanelDatosEdicionExistenciasCostos;
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
