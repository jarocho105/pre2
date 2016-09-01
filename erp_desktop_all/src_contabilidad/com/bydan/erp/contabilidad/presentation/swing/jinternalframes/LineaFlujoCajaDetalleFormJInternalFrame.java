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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.LineaFlujoCajaConstantesFunciones;

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
public class LineaFlujoCajaDetalleFormJInternalFrame extends LineaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLineaFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleLineaFlujoCaja;
	
	protected JMenu jmenuDetalleLineaFlujoCaja;
	protected JMenu jmenuDetalleArchivoLineaFlujoCaja;
	protected JMenu jmenuDetalleAccionesLineaFlujoCaja;
	protected JMenu jmenuDetalleDatosLineaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLineaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsLineaFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LineaFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleLineaFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoflujocaja="";

	protected TipoLineaFlujoCajaBeanSwingJInternalFrame tipolineaflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolineaflujocaja="";
	
	public LineaFlujoCajaSessionBean lineaflujocajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;
	public TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean;	
	
	public LineaFlujoCajaLogic lineaflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralLineaFlujoCaja;
	
	protected JPanel jPanelCamposLineaFlujoCaja;    
	protected JPanel jPanelCamposOcultosLineaFlujoCaja;    	
	protected JPanel jPanelAccionesLineaFlujoCaja;
	protected JPanel jPanelAccionesFormularioLineaFlujoCaja;
    
	
	
	protected Integer iXPanelCamposLineaFlujoCaja=0;
	protected Integer iYPanelCamposLineaFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosLineaFlujoCaja=0;
	protected Integer iYPanelCamposOcultosLineaFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLineaFlujoCaja;
	public JButton jButtonModificarLineaFlujoCaja;
	public JButton jButtonActualizarLineaFlujoCaja;
    public JButton jButtonEliminarLineaFlujoCaja;
	public JButton jButtonCancelarLineaFlujoCaja;
    public JButton jButtonGuardarCambiosLineaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaLineaFlujoCaja;
	protected JButton jButtonCerrarLineaFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionLineaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLineaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLineaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLineaFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLineaFlujoCaja;
	protected JButton jButtonModificarToolBarLineaFlujoCaja;
	protected JButton jButtonActualizarToolBarLineaFlujoCaja;
    protected JButton jButtonEliminarToolBarLineaFlujoCaja;
	protected JButton jButtonCancelarToolBarLineaFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarLineaFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarLineaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarLineaFlujoCaja;
	protected JButton jButtonCerrarToolBarLineaFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarLineaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLineaFlujoCaja;
	protected JMenuItem jMenuItemModificarLineaFlujoCaja;
	protected JMenuItem jMenuItemActualizarLineaFlujoCaja;
    protected JMenuItem jMenuItemEliminarLineaFlujoCaja;
	protected JMenuItem jMenuItemCancelarLineaFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosLineaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaLineaFlujoCaja;
	protected JMenuItem jMenuItemCerrarLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarLineaFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLineaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarLineaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLineaFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLineaFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLineaFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLineaFlujoCaja;
	public JLabel jLabelIdLineaFlujoCaja;
	public JLabel jLabelidLineaFlujoCaja;
	public JButton jButtonidLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoLineaFlujoCaja;
	public JLabel jLabelcodigoLineaFlujoCaja;
	public JTextField jTextFieldcodigoLineaFlujoCaja;
	public JButton jButtoncodigoLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreLineaFlujoCaja;
	public JLabel jLabelnombreLineaFlujoCaja;
	public JTextArea jTextAreanombreLineaFlujoCaja;
	public JScrollPane jscrollPanenombreLineaFlujoCaja;
	public JButton jButtonnombreLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPaneles_consolidadoLineaFlujoCaja;
	public JLabel jLabeles_consolidadoLineaFlujoCaja;
	public JCheckBox jCheckBoxes_consolidadoLineaFlujoCaja;
	public JButton jButtones_consolidadoLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelesta_proyeccionLineaFlujoCaja;
	public JLabel jLabelesta_proyeccionLineaFlujoCaja;
	public JCheckBox jCheckBoxesta_proyeccionLineaFlujoCaja;
	public JButton jButtonesta_proyeccionLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLineaFlujoCaja;
	public JLabel jLabelid_empresaLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLineaFlujoCaja;
	public JButton jButtonid_empresaLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_empresaLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja;
	public JLabel jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja;
	public JButton jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja;
	public JLabel jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja;
	public JButton jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLineaFlujoCaja;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LineaFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLineaFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioLineaFlujoCaja=new JPanel();
				this.jmenuBarDetalleLineaFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleLineaFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LineaFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LineaFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLineaFlujoCaja() {
		return this.jButtonActualizarToolBarLineaFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarLineaFlujoCaja() {
		return this.jButtonEliminarToolBarLineaFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarLineaFlujoCaja() {
		return this.jButtonCancelarToolBarLineaFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionLineaFlujoCaja() {
		return this.jButtonProcesarInformacionLineaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLineaFlujoCaja)	{
		this.jButtonProcesarInformacionLineaFlujoCaja = jButtonProcesarInformacionLineaFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLineaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesLineaFlujoCaja) {
		this.jComboBoxTiposRelacionesLineaFlujoCaja = jComboBoxTiposRelacionesLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesLineaFlujoCaja) {
		this.jComboBoxTiposAccionesLineaFlujoCaja = jComboBoxTiposAccionesLineaFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioLineaFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioLineaFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioLineaFlujoCaja = jComboBoxTiposAccionesFormularioLineaFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		
		this.lineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.lineaflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LineaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Linea Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLineaFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLineaFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarLineaFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLineaFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLineaFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLineaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLineaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLineaFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLineaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLineaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLineaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLineaFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLineaFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLineaFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLineaFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLineaFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLineaFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLineaFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLineaFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLineaFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLineaFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLineaFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLineaFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLineaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLineaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLineaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLineaFlujoCaja.add(this.jMenuItemDetalleCerrarLineaFlujoCaja);
		
		this.jmenuDetalleAccionesLineaFlujoCaja.add(this.jMenuItemActualizarLineaFlujoCaja);
		this.jmenuDetalleAccionesLineaFlujoCaja.add(this.jMenuItemEliminarLineaFlujoCaja);
		this.jmenuDetalleAccionesLineaFlujoCaja.add(this.jMenuItemCancelarLineaFlujoCaja);		
		
		//this.jmenuDetalleDatosLineaFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja);				
		this.jmenuDetalleDatosLineaFlujoCaja.add(this.jMenuItemDetalleMostarOcultarLineaFlujoCaja);				
				
		//this.jmenuDetalleAccionesLineaFlujoCaja.add(this.jMenuItemGuardarCambiosLineaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLineaFlujoCaja.add(this.jmenuDetalleArchivoLineaFlujoCaja);		
		this.jmenuBarDetalleLineaFlujoCaja.add(this.jmenuDetalleAccionesLineaFlujoCaja);		
		this.jmenuBarDetalleLineaFlujoCaja.add(this.jmenuDetalleDatosLineaFlujoCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLineaFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposLineaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLineaFlujoCaja = new JLabelMe();
		jLabelIdLineaFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLineaFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLineaFlujoCaja= new GridBagLayout();

		this.jPanelidLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);

		jLabelidLineaFlujoCaja = new JLabel();
		jLabelidLineaFlujoCaja.setText("Id");

		jLabelidLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoLineaFlujoCaja = new JLabelMe();
		this.jLabelcodigoLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoLineaFlujoCaja.setToolTipText("Codigo");
		this.jLabelcodigoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelcodigoLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jTextFieldcodigoLineaFlujoCaja= new JTextFieldMe();

		jTextFieldcodigoLineaFlujoCaja.setEnabled(false);
		jTextFieldcodigoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtoncodigoLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoLineaFlujoCajaBusqueda.setText("U");
		this.jButtoncodigoLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoLineaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombreLineaFlujoCaja = new JLabelMe();
		this.jLabelnombreLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLineaFlujoCaja.setToolTipText("Nombre");
		this.jLabelnombreLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelnombreLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jTextAreanombreLineaFlujoCaja= new JTextAreaMe();
		jTextAreanombreLineaFlujoCaja.setEnabled(false);
		jTextAreanombreLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLineaFlujoCaja.setLineWrap(true);
		jTextAreanombreLineaFlujoCaja.setWrapStyleWord(true);
		jTextAreanombreLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLineaFlujoCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLineaFlujoCaja = new JScrollPane(jTextAreanombreLineaFlujoCaja);
		jscrollPanenombreLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonnombreLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLineaFlujoCajaBusqueda.setText("U");
		this.jButtonnombreLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLineaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabeles_consolidadoLineaFlujoCaja = new JLabelMe();
		this.jLabeles_consolidadoLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO+" : *");
		this.jLabeles_consolidadoLineaFlujoCaja.setToolTipText("Es Consolidado");
		this.jLabeles_consolidadoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_consolidadoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_consolidadoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_consolidadoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_consolidadoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_consolidadoLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPaneles_consolidadoLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jCheckBoxes_consolidadoLineaFlujoCaja= new JCheckBoxMe();
		jCheckBoxes_consolidadoLineaFlujoCaja.setEnabled(false);

		jCheckBoxes_consolidadoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_consolidadoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_consolidadoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_consolidadoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_consolidadoLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_consolidadoLineaFlujoCajaBusqueda.setText("U");
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_consolidadoLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_consolidadoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_consolidadoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_consolidadoLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_consolidadoLineaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelesta_proyeccionLineaFlujoCaja = new JLabelMe();
		this.jLabelesta_proyeccionLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION+" : *");
		this.jLabelesta_proyeccionLineaFlujoCaja.setToolTipText("Esta Proyeccion");
		this.jLabelesta_proyeccionLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_proyeccionLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_proyeccionLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_proyeccionLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_proyeccionLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_proyeccionLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelesta_proyeccionLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jCheckBoxesta_proyeccionLineaFlujoCaja= new JCheckBoxMe();
		jCheckBoxesta_proyeccionLineaFlujoCaja.setEnabled(false);

		jCheckBoxesta_proyeccionLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_proyeccionLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_proyeccionLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_proyeccionLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setText("U");
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_proyeccionLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_proyeccionLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_proyeccionLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_proyeccionLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_proyeccionLineaFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLineaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLineaFlujoCaja = new JLabelMe();
		this.jLabelid_empresaLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLineaFlujoCaja.setToolTipText("Empresa");
		this.jLabelid_empresaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelid_empresaLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jComboBoxid_empresaLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_empresaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLineaFlujoCaja.setEnabled(false);

		this.jButtonid_empresaLineaFlujoCaja= new JButtonMe();
		this.jButtonid_empresaLineaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLineaFlujoCaja.setText("Buscar");
		this.jButtonid_empresaLineaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLineaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaFlujoCaja"));

		this.jButtonid_empresaLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaFlujoCajaBusqueda.setText("U");
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLineaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaLineaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_empresaLineaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLineaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLineaFlujoCajaUpdate.setText("U");
		this.jButtonid_empresaLineaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLineaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLineaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLineaFlujoCajaUpdate"));



					
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja = new JLabelMe();
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA+" : *");
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setToolTipText("Tipo Grupo Flujo Caja");
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setText("Buscar");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaLineaFlujoCaja"));

		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setText("U");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setText("U");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate"));



					
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja = new JLabelMe();
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja.setText(""+LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA+" : *");
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja.setToolTipText("Tipo Linea Flujo Caja");
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.setToolTipText(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA);
		this.gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.setLayout(this.gridaBagLayoutLineaFlujoCaja);


		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja= new JButtonMe();
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setText("Buscar");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_linea_flujo_cajaLineaFlujoCaja"));

		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setText("U");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda"));

		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setText("U");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate"));



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
		//this.jInternalFrameDetalleLineaFlujoCaja = new LineaFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Linea Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLineaFlujoCaja= new GridBagLayout();
		

		
		String sToolTipLineaFlujoCaja="";
		sToolTipLineaFlujoCaja=LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLineaFlujoCaja+="(Contabilidad.LineaFlujoCaja)";
		}
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipLineaFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLineaFlujoCaja = new JButtonMe();
		this.jButtonModificarLineaFlujoCaja = new JButtonMe();
        this.jButtonActualizarLineaFlujoCaja = new JButtonMe();
        this.jButtonEliminarLineaFlujoCaja = new JButtonMe();
        this.jButtonCancelarLineaFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosLineaFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarLineaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosLineaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionLineaFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralLineaFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Linea Flujo Caja";
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Linea Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLineaFlujoCaja.setName("jPanelCamposLineaFlujoCaja"); 

		this.jPanelCamposOcultosLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLineaFlujoCaja.setName("jPanelCamposOcultosLineaFlujoCaja"); 

        this.jPanelAccionesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesLineaFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLineaFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLineaFlujoCaja.setText("Nuevo");
		this.jButtonModificarLineaFlujoCaja.setText("Editar");
        this.jButtonActualizarLineaFlujoCaja.setText("Actualizar");
        this.jButtonEliminarLineaFlujoCaja.setText("Eliminar");
        this.jButtonCancelarLineaFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosLineaFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.setText("Guardar");
		this.jButtonCerrarLineaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLineaFlujoCaja,"nuevo_button","Nuevo",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLineaFlujoCaja,"modificar_button","Editar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLineaFlujoCaja,"actualizar_button","Actualizar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLineaFlujoCaja,"eliminar_button","Eliminar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLineaFlujoCaja,"cancelar_button","Cancelar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLineaFlujoCaja,"guardarcambios_button","Guardar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLineaFlujoCaja,"guardarcambiostabla_button","Guardar",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLineaFlujoCaja,"cerrar_button","Salir",this.lineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLineaFlujoCaja.setToolTipText("Nuevo"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLineaFlujoCaja.setToolTipText("Editar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLineaFlujoCaja.setToolTipText("Actualizar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLineaFlujoCaja.setToolTipText("Eliminar)"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLineaFlujoCaja.setToolTipText("Cancelar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLineaFlujoCaja.setToolTipText("Guardar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.setToolTipText("Guardar"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLineaFlujoCaja.setToolTipText("Salir"+" "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLineaFlujoCaja";
		inputMap = this.jButtonNuevoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLineaFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLineaFlujoCaja";
		inputMap = this.jButtonActualizarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLineaFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarLineaFlujoCaja";
		inputMap = this.jButtonEliminarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLineaFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarLineaFlujoCaja";
		inputMap = this.jButtonCancelarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLineaFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarLineaFlujoCaja";
		inputMap = this.jButtonCerrarLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLineaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLineaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLineaFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLineaFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLineaFlujoCaja.setToolTipText("Nuevo LineaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLineaFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLineaFlujoCaja.setToolTipText("Sin Cerrar Ventana LineaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLineaFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLineaFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesLineaFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLineaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesLineaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLineaFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLineaFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLineaFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLineaFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLineaFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposLineaFlujoCaja.setLayout(gridaBagLayoutCamposLineaFlujoCaja);
		this.jPanelCamposOcultosLineaFlujoCaja.setLayout(gridaBagLayoutCamposOcultosLineaFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLineaFlujoCaja.add(jLabelIdLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLineaFlujoCaja.add(jLabelidLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLineaFlujoCaja.add(jLabelid_empresaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaFlujoCaja.add(jButtonid_empresaLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 3;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLineaFlujoCaja.add(jButtonid_empresaLineaFlujoCajaUpdate, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLineaFlujoCaja.add(jComboBoxid_empresaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.add(jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.add(jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 3;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.add(jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.add(jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoLineaFlujoCaja.add(jLabelcodigoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoLineaFlujoCaja.add(jButtoncodigoLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoLineaFlujoCaja.add(jTextFieldcodigoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLineaFlujoCaja.add(jLabelnombreLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLineaFlujoCaja.add(jButtonnombreLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLineaFlujoCaja.add(jscrollPanenombreLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.add(jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.add(jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 3;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.add(jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.add(jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_consolidadoLineaFlujoCaja.add(jLabeles_consolidadoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_consolidadoLineaFlujoCaja.add(jButtones_consolidadoLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_consolidadoLineaFlujoCaja.add(jCheckBoxes_consolidadoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_proyeccionLineaFlujoCaja.add(jLabelesta_proyeccionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_proyeccionLineaFlujoCaja.add(jButtonesta_proyeccionLineaFlujoCajaBusqueda, this.gridBagConstraintsLineaFlujoCaja);
	}

	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_proyeccionLineaFlujoCaja.add(jCheckBoxesta_proyeccionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelidLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelcodigoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelnombreLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPaneles_consolidadoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLineaFlujoCaja.add(this.jPanelesta_proyeccionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposLineaFlujoCaja % 1==0) {
		iXPanelCamposLineaFlujoCaja=0;
		iYPanelCamposLineaFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLineaFlujoCaja.gridy = iYPanelCamposOcultosLineaFlujoCaja;
	this.gridBagConstraintsLineaFlujoCaja.gridx = iXPanelCamposOcultosLineaFlujoCaja++;
	this.gridBagConstraintsLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLineaFlujoCaja.add(this.jPanelid_empresaLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);



	if(iXPanelCamposOcultosLineaFlujoCaja % 1==0) {
		iXPanelCamposOcultosLineaFlujoCaja=0;
		iYPanelCamposOcultosLineaFlujoCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesLineaFlujoCaja.setLayout(gridaBagLayoutAccionesLineaFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioLineaFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioLineaFlujoCaja);
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaFlujoCaja.add(this.jComboBoxTiposAccionesFormularioLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLineaFlujoCaja.add(this.jCheckBoxPostAccionNuevoLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLineaFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonModificarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);							

		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonEliminarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonActualizarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);


		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonGuardarCambiosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);	
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsLineaFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesLineaFlujoCaja.add(this.jButtonCancelarLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLineaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLineaFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLineaFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLineaFlujoCaja.gridx =0;
		this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLineaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLineaFlujoCaja = new LineaFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Linea Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Linea Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LineaFlujoCajaModel lineaflujocajaModel=new LineaFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//LineaFlujoCajaModel.LineaFlujoCajaFocusTraversalPolicy lineaflujocajaFocusTraversalPolicy = lineaflujocajaModel.new LineaFlujoCajaFocusTraversalPolicy(this);
			
			//lineaflujocajaFocusTraversalPolicy.setlineaflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(lineaflujocajaModel);
			
			
			this.jContentPaneDetalleLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLineaFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleLineaFlujoCaja.setLayout(gridaBagLayoutDetalleLineaFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLineaFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleLineaFlujoCaja.add(jTtoolBarDetalleLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionLineaFlujoCaja=   new JScrollPane(jContentPaneDetalleLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLineaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleLineaFlujoCaja.add(jPanelCamposLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);
			
			
			
			
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
						&& lineaflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLineaFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
						this.jContentPaneDetalleLineaFlujoCaja.add(this.jTabbedPaneRelacionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLineaFlujoCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLineaFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsLineaFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleLineaFlujoCaja.add(jPanelCamposOcultosLineaFlujoCaja, gridBagConstraintsLineaFlujoCaja);
				
					this.jPanelCamposOcultosLineaFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	        this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLineaFlujoCaja.add(this.jPanelAccionesFormularioLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);							
			
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleLineaFlujoCaja.add(this.jPanelAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLineaFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLineaFlujoCaja=   new JScrollPane(this.jPanelCamposLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
			this.gridBagConstraintsLineaFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLineaFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);			
			
			this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
			
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		
			
		this.gridBagConstraintsLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsLineaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLineaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLineaFlujoCaja, this.gridBagConstraintsLineaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLineaFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionLineaFlujoCaja;
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
