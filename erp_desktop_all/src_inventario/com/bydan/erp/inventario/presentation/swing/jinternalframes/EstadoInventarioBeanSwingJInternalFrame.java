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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.inventario.util.EstadoInventarioConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoInventarioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoInventarioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoInventarioBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoInventarioBeanSwingJInternalFrame extends EstadoInventarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoInventarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoInventario> estadoinventarioValidator = new ClassValidator<EstadoInventario>(EstadoInventario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoInventario estadoinventario;	
	public EstadoInventario estadoinventarioAux;
	public EstadoInventario estadoinventarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoInventario estadoinventarioTotales;
	public Long idEstadoInventarioActual;
	public Long iIdNuevoEstadoInventario=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTransferencia=false;

	public Boolean getIsTienePermisosTransferencia() {
		return isTienePermisosTransferencia;
	}

	public void setIsTienePermisosTransferencia(Boolean isTienePermisosTransferencia) {
		this.isTienePermisosTransferencia= isTienePermisosTransferencia;
	}


	public Boolean isTienePermisosCompra=false;

	public Boolean getIsTienePermisosCompra() {
		return isTienePermisosCompra;
	}

	public void setIsTienePermisosCompra(Boolean isTienePermisosCompra) {
		this.isTienePermisosCompra= isTienePermisosCompra;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoEstadoInventario;
	public Boolean isPermisoNuevoEstadoInventario;
	public Boolean isPermisoActualizarEstadoInventario;
	public Boolean isPermisoActualizarOriginalEstadoInventario;
	public Boolean isPermisoEliminarEstadoInventario;
	public Boolean isPermisoGuardarCambiosEstadoInventario;
	public Boolean isPermisoConsultaEstadoInventario;
	public Boolean isPermisoBusquedaEstadoInventario;
	public Boolean isPermisoReporteEstadoInventario;
	public Boolean isPermisoPaginacionMedioEstadoInventario;
	public Boolean isPermisoPaginacionAltoEstadoInventario;
	public Boolean isPermisoPaginacionTodoEstadoInventario;
	public Boolean isPermisoCopiarEstadoInventario;
	public Boolean isPermisoVerFormEstadoInventario;
	public Boolean isPermisoDuplicarEstadoInventario;
	public Boolean isPermisoOrdenEstadoInventario;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public EstadoInventarioParameterReturnGeneral estadoinventarioReturnGeneral;
	public EstadoInventarioParameterReturnGeneral estadoinventarioParameterGeneral;
	
	

	public TransferenciaLogic transferenciaLogic=null;

	public TransferenciaLogic getTransferenciaLogic() {
		return transferenciaLogic;
	}

	public void setTransferenciaLogic(TransferenciaLogic transferenciaLogic) {
		this.transferenciaLogic = transferenciaLogic;
	}


	public CompraLogic compraLogic=null;

	public CompraLogic getCompraLogic() {
		return compraLogic;
	}

	public void setCompraLogic(CompraLogic compraLogic) {
		this.compraLogic = compraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoInventario=false;
	public Boolean esParaAccionDesdeFormularioEstadoInventario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoInventarioSessionBeanAdditional estadoinventarioSessionBeanAdditional=null;
	
	public EstadoInventarioSessionBeanAdditional getEstadoInventarioSessionBeanAdditional() {
		return this.estadoinventarioSessionBeanAdditional;
	}
	
	public void setEstadoInventarioSessionBeanAdditional(EstadoInventarioSessionBeanAdditional estadoinventarioSessionBeanAdditional) {
		try {
			this.estadoinventarioSessionBeanAdditional=estadoinventarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoInventarioBeanSwingJInternalFrameAdditional estadoinventarioBeanSwingJInternalFrameAdditional=null;
	//public class EstadoInventarioBeanSwingJInternalFrame
	
	public EstadoInventarioBeanSwingJInternalFrameAdditional getEstadoInventarioBeanSwingJInternalFrameAdditional() {
		return this.estadoinventarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoInventarioBeanSwingJInternalFrameAdditional(EstadoInventarioBeanSwingJInternalFrameAdditional estadoinventarioBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoinventarioBeanSwingJInternalFrameAdditional=estadoinventarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoInventarioLogic estadoinventarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoInventario estadoinventarioBean;
	public EstadoInventarioConstantesFunciones estadoinventarioConstantesFunciones;
	//public EstadoInventarioParameterReturnGeneral estadoinventarioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoInventario> estadoinventarios;	
	//public List<EstadoInventario> estadoinventariosEliminados;
	//public List<EstadoInventario> estadoinventariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoInventario=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoInventario=true;
	public Boolean isVisibilidadCeldaCopiarEstadoInventario=true;
	public Boolean isVisibilidadCeldaVerFormEstadoInventario=true;
	public Boolean isVisibilidadCeldaOrdenEstadoInventario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
	public Boolean isVisibilidadCeldaModificarEstadoInventario=false;
	public Boolean isVisibilidadCeldaActualizarEstadoInventario=false;
	public Boolean isVisibilidadCeldaEliminarEstadoInventario=false;
	public Boolean isVisibilidadCeldaCancelarEstadoInventario=false;
	public Boolean isVisibilidadCeldaGuardarEstadoInventario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoInventario=false;	
	
	
	
	public Long getiIdNuevoEstadoInventario() {
		return this.iIdNuevoEstadoInventario;
	}

	public void setiIdNuevoEstadoInventario(Long iIdNuevoEstadoInventario) {
		this.iIdNuevoEstadoInventario = iIdNuevoEstadoInventario;
	}
	
	public Long getidEstadoInventarioActual() {
		return this.idEstadoInventarioActual;
	}

	public void setidEstadoInventarioActual(Long idEstadoInventarioActual) {
		this.idEstadoInventarioActual = idEstadoInventarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoInventario getestadoinventario() {
		return this.estadoinventario;
	}

	public void setestadoinventario(EstadoInventario estadoinventario) {
		this.estadoinventario = estadoinventario;
	}
	
	public EstadoInventario getestadoinventarioAux() {
		return this.estadoinventarioAux;
	}

	public void setestadoinventarioAux(EstadoInventario estadoinventarioAux) {
		this.estadoinventarioAux = estadoinventarioAux;
	}				
	
	public EstadoInventario getestadoinventarioAnterior() {
		return this.estadoinventarioAnterior;
	}

	public void setestadoinventarioAnterior(EstadoInventario estadoinventarioAnterior) {
		this.estadoinventarioAnterior = estadoinventarioAnterior;
	}	
	
	public EstadoInventario getestadoinventarioTotales() {
		return this.estadoinventarioTotales;
	}

	public void setestadoinventarioTotales(EstadoInventario estadoinventarioTotales) {
		this.estadoinventarioTotales = estadoinventarioTotales;
	}	
	
	public EstadoInventario getestadoinventarioBean() {
		return this.estadoinventarioBean;
	}

	public void setestadoinventarioBean(EstadoInventario estadoinventarioBean) {
		this.estadoinventarioBean = estadoinventarioBean;
	}	
	
	public EstadoInventarioParameterReturnGeneral getestadoinventarioReturnGeneral() {
		return this.estadoinventarioReturnGeneral;
	}

	public void setestadoinventarioReturnGeneral(EstadoInventarioParameterReturnGeneral estadoinventarioReturnGeneral) {
		this.estadoinventarioReturnGeneral = estadoinventarioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoInventarioLogic getEstadoInventarioLogic()	{		
		return estadoinventarioLogic;
	}

	public void setEstadoInventarioLogic(EstadoInventarioLogic estadoinventarioLogic) {
		this.estadoinventarioLogic = estadoinventarioLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoEstadoInventario() {
		return isEsNuevoEstadoInventario;
	}

	public void setIsEsNuevoEstadoInventario(Boolean isEsNuevoEstadoInventario) {
		this.isEsNuevoEstadoInventario = isEsNuevoEstadoInventario;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoInventario() {
		return esParaAccionDesdeFormularioEstadoInventario;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoInventario(Boolean esParaAccionDesdeFormularioEstadoInventario) {
		this.esParaAccionDesdeFormularioEstadoInventario = esParaAccionDesdeFormularioEstadoInventario;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoInventario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoInventario(this.estadoinventarioLogic.getEstadoInventarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoInventarioConstantesFunciones.refrescarForeignKeysDescripcionesEstadoInventario(this.estadoinventarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoinventarioLogic.setEstadoInventarios(this.estadoinventarios);
			estadoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public EstadoInventarioParameterReturnGeneral getEstadoInventarioParameterGeneral() {
		return this.estadoinventarioParameterGeneral;
	}
	
	public void setEstadoInventarioParameterGeneral(EstadoInventarioParameterReturnGeneral estadoinventarioParameterGeneral) {
		this.estadoinventarioParameterGeneral = estadoinventarioParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoEstadoInventario() {
		return isPermisoTodoEstadoInventario;
	}

	public void setIsPermisoTodoEstadoInventario(Boolean isPermisoTodoEstadoInventario) {
		this.isPermisoTodoEstadoInventario = isPermisoTodoEstadoInventario;
	}

	public Boolean getIsPermisoNuevoEstadoInventario() {
		return isPermisoNuevoEstadoInventario;
	}

	public void setIsPermisoNuevoEstadoInventario(Boolean isPermisoNuevoEstadoInventario) {
		this.isPermisoNuevoEstadoInventario = isPermisoNuevoEstadoInventario;
	}

	public Boolean getIsPermisoActualizarEstadoInventario() {
		return isPermisoActualizarEstadoInventario;
	}

	public void setIsPermisoActualizarEstadoInventario(Boolean isPermisoActualizarEstadoInventario) {
		this.isPermisoActualizarEstadoInventario = isPermisoActualizarEstadoInventario;
	}

	public Boolean getIsPermisoEliminarEstadoInventario() {
		return isPermisoEliminarEstadoInventario;
	}

	public void setIsPermisoEliminarEstadoInventario(Boolean isPermisoEliminarEstadoInventario) {
		this.isPermisoEliminarEstadoInventario = isPermisoEliminarEstadoInventario;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoInventario() {
		return isPermisoGuardarCambiosEstadoInventario;
	}

	public void setIsPermisoGuardarCambiosEstadoInventario(Boolean isPermisoGuardarCambiosEstadoInventario) {
		this.isPermisoGuardarCambiosEstadoInventario = isPermisoGuardarCambiosEstadoInventario;
	}
	
	public Boolean getIsPermisoConsultaEstadoInventario() {
		return isPermisoConsultaEstadoInventario;
	}

	public void setIsPermisoConsultaEstadoInventario(Boolean isPermisoConsultaEstadoInventario) {
		this.isPermisoConsultaEstadoInventario = isPermisoConsultaEstadoInventario;
	}

	public Boolean getIsPermisoBusquedaEstadoInventario() {
		return isPermisoBusquedaEstadoInventario;
	}

	public void setIsPermisoBusquedaEstadoInventario(Boolean isPermisoBusquedaEstadoInventario) {
		this.isPermisoBusquedaEstadoInventario = isPermisoBusquedaEstadoInventario;
	}

	public Boolean getIsPermisoReporteEstadoInventario() {
		return isPermisoReporteEstadoInventario;
	}

	public void setIsPermisoReporteEstadoInventario(Boolean isPermisoReporteEstadoInventario) {
		this.isPermisoReporteEstadoInventario = isPermisoReporteEstadoInventario;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoInventario() {
		return isPermisoPaginacionMedioEstadoInventario;
	}

	public void setIsPermisoPaginacionMedioEstadoInventario(Boolean isPermisoPaginacionMedioEstadoInventario) {
		this.isPermisoPaginacionMedioEstadoInventario = isPermisoPaginacionMedioEstadoInventario;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoInventario() {
		return isPermisoPaginacionTodoEstadoInventario;
	}

	public void setIsPermisoPaginacionTodoEstadoInventario(Boolean isPermisoPaginacionTodoEstadoInventario) {
		this.isPermisoPaginacionTodoEstadoInventario = isPermisoPaginacionTodoEstadoInventario;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoInventario() {
		return isPermisoPaginacionAltoEstadoInventario;
	}

	public void setIsPermisoPaginacionAltoEstadoInventario(Boolean isPermisoPaginacionAltoEstadoInventario) {
		this.isPermisoPaginacionAltoEstadoInventario = isPermisoPaginacionAltoEstadoInventario;
	}
	
	public Boolean getIsPermisoCopiarEstadoInventario() {
		return isPermisoCopiarEstadoInventario;
	}

	public void setIsPermisoCopiarEstadoInventario(Boolean isPermisoCopiarEstadoInventario) {
		this.isPermisoCopiarEstadoInventario = isPermisoCopiarEstadoInventario;
	}
	
	public Boolean getIsPermisoVerFormEstadoInventario() {
		return isPermisoVerFormEstadoInventario;
	}

	public void setIsPermisoVerFormEstadoInventario(Boolean isPermisoVerFormEstadoInventario) {
		this.isPermisoVerFormEstadoInventario = isPermisoVerFormEstadoInventario;
	}
	
	public Boolean getIsPermisoDuplicarEstadoInventario() {
		return isPermisoDuplicarEstadoInventario;
	}

	public void setIsPermisoDuplicarEstadoInventario(Boolean isPermisoDuplicarEstadoInventario) {
		this.isPermisoDuplicarEstadoInventario = isPermisoDuplicarEstadoInventario;
	}
	
	public Boolean getIsPermisoOrdenEstadoInventario() {
		return isPermisoOrdenEstadoInventario;
	}

	public void setIsPermisoOrdenEstadoInventario(Boolean isPermisoOrdenEstadoInventario) {
		this.isPermisoOrdenEstadoInventario = isPermisoOrdenEstadoInventario;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoInventario() {
		return isVisibilidadCeldaNuevoEstadoInventario;
	}

	public void setIsVisibilidadCeldaNuevoEstadoInventario(Boolean isVisibilidadCeldaNuevoEstadoInventario) {
		this.isVisibilidadCeldaNuevoEstadoInventario = isVisibilidadCeldaNuevoEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoInventario() {
		return isVisibilidadCeldaDuplicarEstadoInventario;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoInventario(Boolean isVisibilidadCeldaDuplicarEstadoInventario) {
		this.isVisibilidadCeldaDuplicarEstadoInventario = isVisibilidadCeldaDuplicarEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoInventario() {
		return isVisibilidadCeldaCopiarEstadoInventario;
	}

	public void setIsVisibilidadCeldaCopiarEstadoInventario(Boolean isVisibilidadCeldaCopiarEstadoInventario) {
		this.isVisibilidadCeldaCopiarEstadoInventario = isVisibilidadCeldaCopiarEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoInventario() {
		return isVisibilidadCeldaVerFormEstadoInventario;
	}

	public void setIsVisibilidadCeldaVerFormEstadoInventario(Boolean isVisibilidadCeldaVerFormEstadoInventario) {
		this.isVisibilidadCeldaVerFormEstadoInventario = isVisibilidadCeldaVerFormEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoInventario() {
		return isVisibilidadCeldaOrdenEstadoInventario;
	}

	public void setIsVisibilidadCeldaOrdenEstadoInventario(Boolean isVisibilidadCeldaOrdenEstadoInventario) {
		this.isVisibilidadCeldaOrdenEstadoInventario = isVisibilidadCeldaOrdenEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoInventario() {
		return isVisibilidadCeldaNuevoRelacionesEstadoInventario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoInventario(Boolean isVisibilidadCeldaNuevoRelacionesEstadoInventario) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoInventario = isVisibilidadCeldaNuevoRelacionesEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoInventario() {
		return isVisibilidadCeldaModificarEstadoInventario;
	}

	public void setIsVisibilidadCeldaModificarEstadoInventario(Boolean isVisibilidadCeldaModificarEstadoInventario) {
		this.isVisibilidadCeldaModificarEstadoInventario = isVisibilidadCeldaModificarEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoInventario() {
		return isVisibilidadCeldaActualizarEstadoInventario;
	}

	public void setIsVisibilidadCeldaActualizarEstadoInventario(Boolean isVisibilidadCeldaActualizarEstadoInventario) {
		this.isVisibilidadCeldaActualizarEstadoInventario = isVisibilidadCeldaActualizarEstadoInventario;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoInventario() {
		return isVisibilidadCeldaEliminarEstadoInventario;
	}

	public void setIsVisibilidadCeldaEliminarEstadoInventario(Boolean isVisibilidadCeldaEliminarEstadoInventario) {
		this.isVisibilidadCeldaEliminarEstadoInventario = isVisibilidadCeldaEliminarEstadoInventario;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoInventario() {
		return isVisibilidadCeldaCancelarEstadoInventario;
	}

	public void setIsVisibilidadCeldaCancelarEstadoInventario(Boolean isVisibilidadCeldaCancelarEstadoInventario) {
		this.isVisibilidadCeldaCancelarEstadoInventario = isVisibilidadCeldaCancelarEstadoInventario;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoInventario() {
		return isVisibilidadCeldaGuardarEstadoInventario;
	}

	public void setIsVisibilidadCeldaGuardarEstadoInventario(Boolean isVisibilidadCeldaGuardarEstadoInventario) {
		this.isVisibilidadCeldaGuardarEstadoInventario = isVisibilidadCeldaGuardarEstadoInventario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoInventario() {
		return isVisibilidadCeldaGuardarCambiosEstadoInventario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoInventario(Boolean isVisibilidadCeldaGuardarCambiosEstadoInventario) {
		this.isVisibilidadCeldaGuardarCambiosEstadoInventario = isVisibilidadCeldaGuardarCambiosEstadoInventario;
	}
		
	public EstadoInventarioSessionBean getestadoinventarioSessionBean() {
		return this.estadoinventarioSessionBean;
	}
	
	public void setestadoinventarioSessionBean(EstadoInventarioSessionBean estadoinventarioSessionBean) {
		this.estadoinventarioSessionBean=estadoinventarioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(EstadoInventario estadoinventario)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(EstadoInventario estadoinventario,EstadoInventario estadoinventarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoInventario(estadoinventario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoinventarioAux.setId(estadoinventario.getId());
		estadoinventarioAux.setVersionRow(estadoinventario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoInventario();
		
			int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoinventarioValidator.getInvalidValues(this.estadoinventario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoinventarioLogic.setDatosCliente(datosCliente);
			estadoinventarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoinventarioAux=new  EstadoInventario();
				
				estadoinventarioAux.setIsNew(true);
				estadoinventarioAux.setIsChanged(true);
				
				estadoinventarioAux.setEstadoInventarioOriginal(this.estadoinventario);
				
				estadoinventarioAux.setId(this.estadoinventario.getId());	
				estadoinventarioAux.setVersionRow(this.estadoinventario.getVersionRow());	
				estadoinventarioAux.setcodigo(this.estadoinventario.getcodigo());	
				estadoinventarioAux.setnombre(this.estadoinventario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoinventarioAux,estadoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoinventarioLogic.saveEstadoInventarios();//WithConnection
						//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias().addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras().addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias.addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras.addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoinventarioLogic.saveEstadoInventarioRelaciones(estadoinventarioAux,this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias(),this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());//WithConnection
								//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.setTransferencias(new ArrayList<Transferencia>());
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.setCompras(new ArrayList<Compra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias= new ArrayList<Transferencia>();
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras= new ArrayList<Compra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias());

							if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoinventarioAux,estadoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoinventarioAux=new  EstadoInventario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoinventarioSessionBean.getEsGuardarRelacionado() && this.estadoinventario.getId()>=0)) {
						
					estadoinventarioAux.setIsNew(false);
				}
				
				estadoinventarioAux.setIsDeleted(false);
			
				estadoinventarioAux.setId(this.estadoinventario.getId());	
				estadoinventarioAux.setVersionRow(this.estadoinventario.getVersionRow());	
				estadoinventarioAux.setcodigo(this.estadoinventario.getcodigo());	
				estadoinventarioAux.setnombre(this.estadoinventario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoinventarioAux,estadoinventarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoinventarioLogic.saveEstadoInventarios();//WithConnection
						//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias().addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras().addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias.addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras.addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoinventarioLogic.saveEstadoInventarioRelaciones(estadoinventarioAux,this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias(),this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());//WithConnection
								//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.setTransferencias(new ArrayList<Transferencia>());
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.setCompras(new ArrayList<Compra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias= new ArrayList<Transferencia>();
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras= new ArrayList<Compra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias());

							if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoinventarioAux,estadoinventarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoinventario,estadoinventarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoinventarioAux=new  EstadoInventario();
				
				estadoinventarioAux.setIsNew(false);
				estadoinventarioAux.setIsChanged(false);
				
				estadoinventarioAux.setIsDeleted(true);
				
				estadoinventarioAux.setId(this.estadoinventario.getId());	
				estadoinventarioAux.setVersionRow(this.estadoinventario.getVersionRow());	
				estadoinventarioAux.setcodigo(this.estadoinventario.getcodigo());	
				estadoinventarioAux.setnombre(this.estadoinventario.getnombre());	
				
				if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoinventarioAux.getId()>=0) {	
						this.estadoinventariosEliminados.add(estadoinventarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoinventarioAux,estadoinventarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoinventarioLogic.saveEstadoInventarios();//WithConnection
						//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias().addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras().addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias.addAll(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciasEliminados);
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras.addAll(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.comprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormTransferencia.detalletransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.retencioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.formapagoinvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jInternalFrameDetalleFormCompra.detallecompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoinventarioLogic.saveEstadoInventarioRelaciones(estadoinventarioAux,this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias(),this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());//WithConnection
								//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.setTransferencias(new ArrayList<Transferencia>());
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.setCompras(new ArrayList<Compra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias= new ArrayList<Transferencia>();
							this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras= new ArrayList<Compra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias());

							if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoinventarioAux.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoinventarioAux,estadoinventarioLogic.getEstadoInventarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoinventarioAux,estadoinventarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getEstadoInventarios().addAll(this.estadoinventariosEliminados);
					
					estadoinventarioLogic.saveEstadoInventarios();//WithConnection
					//estadoinventarioLogic.getSetVersionRowEstadoInventarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoinventariosEliminados= new ArrayList<EstadoInventario>();		
			}
			
			if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoinventario=estadoinventarioAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessEstadoInventario();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoInventario estadoinventarioLocal) throws Exception {
		
		if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoinventarioLocal.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias());
				estadoinventarioLocal.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());
			
			} else {
			
				estadoinventarioLocal.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferencias);
				estadoinventarioLocal.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoInventario estadoinventarioLocal) throws Exception {	
		if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoInventarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoinventarioValidator.getInvalidValues(this.estadoinventario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoInventario estadoinventario,List<EstadoInventario> estadoinventarios) throws Exception {
		try	{		
			EstadoInventarioConstantesFunciones.actualizarLista(estadoinventario,estadoinventarios,this.estadoinventarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoInventario estadoinventario,List<EstadoInventario> estadoinventarios) throws Exception {
		try	{			
			EstadoInventarioConstantesFunciones.actualizarSelectedLista(estadoinventario,estadoinventarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoInventario> estadoinventariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoinventariosLocal=this.estadoinventarioLogic.getEstadoInventarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoinventariosLocal=this.estadoinventarios;
			}
			//ARCHITECTURE
		
			for(EstadoInventario estadoinventarioLocal:estadoinventariosLocal) {
				if(this.permiteMantenimiento(estadoinventarioLocal) && estadoinventarioLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+EstadoInventarioConstantesFunciones.getEstadoInventarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoInventarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoInventario.jLabelcodigoEstadoInventario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoInventarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoInventario.jLabelnombreEstadoInventario,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoInventario.jLabelcodigoEstadoInventario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoInventario.jLabelnombreEstadoInventario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Transferencia")) {
			if(this.estadoinventario==null) {
				this.estadoinventario= new EstadoInventario();
			}

			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoInventario
				this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);

				this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.gettransferencia().setEstadoInventario(this.estadoinventario);
			}

			return;
		}
		 else  if(sTipo.equals("Compra")) {
			if(this.estadoinventario==null) {
				this.estadoinventario= new EstadoInventario();
			}

			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoInventario
				this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);

				this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.getcompra().setEstadoInventario(this.estadoinventario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoInventario--;	
		
		
		this.estadoinventarioAux=new EstadoInventario();
		
		this.estadoinventarioAux.setId(this.iIdNuevoEstadoInventario);
		this.estadoinventarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoinventarioLogic.getEstadoInventarios().add(this.estadoinventarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoinventarios.add(this.estadoinventarioAux);
		}
		//ARCHITECTURE
		
		this.estadoinventario=this.estadoinventarioAux;
		
		if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoInventario(this.estadoinventario);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoInventario(this.estadoinventario);
		}
				
		//this.setDefaultControlesEstadoInventario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoInventario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoInventario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoInventario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoInventario(this.estadoinventarioBean,this.estadoinventario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoInventarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
			classes=EstadoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoinventarioReturnGeneral=estadoinventarioLogic.procesarEventosEstadoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoinventarioLogic.getEstadoInventarios(),this.estadoinventario,this.estadoinventarioParameterGeneral,this.isEsNuevoEstadoInventario,classes);//this.estadoinventarioLogic.getEstadoInventario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoInventario(this.estadoinventarioReturnGeneral,this.estadoinventarioBean,false);
		
		if(this.estadoinventarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario());
		}
		
		if(this.estadoinventarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario(),classes);//this.estadoinventarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoInventario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoInventario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.RecargarFormEstadoInventario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoInventario(false);
						
			if(estadoinventarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.getEsGuardarRelacionado() && TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransferenciaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraSessionBean.getEsGuardarRelacionado() && CompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoInventario();
			}
			
			this.actualizarVisualTableDatosEstadoInventario();
			
			this.jTableDatosEstadoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoInventario(), this.getIndiceNuevoEstadoInventario());
			
			this.seleccionarFilaTablaEstadoInventarioActual();
						
			this.actualizarEstadoCeldasBotonesEstadoInventario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoInventario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setEnabled(isHabilitar && this.estadoinventarioConstantesFunciones.activarcodigoEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setEnabled(isHabilitar && this.estadoinventarioConstantesFunciones.activarnombreEstadoInventario);	
		
	};
	
	public void setDefaultControlesEstadoInventario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoInventario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoinventarioSessionBean.setConGuardarRelaciones(true);			
			this.estadoinventarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoinventarioSessionBean.setConGuardarRelaciones(false);			
			this.estadoinventarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoInventario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
				if(estadoinventarioAux.getId().equals(this.iIdNuevoEstadoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarios) {
				if(estadoinventarioAux.getId().equals(this.iIdNuevoEstadoInventario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualEstadoInventario(EstadoInventario estadoinventario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
				if(estadoinventarioAux.getId().equals(estadoinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarios) {
				if(estadoinventarioAux.getId().equals(estadoinventario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalEstadoInventario(EstadoInventario estadoinventarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
				if(estadoinventarioAux.getEstadoInventarioOriginal().getId().equals(estadoinventarioOriginal.getId())) {
					existe=true;
					estadoinventarioOriginal.setId(estadoinventarioAux.getId());
					estadoinventarioOriginal.setVersionRow(estadoinventarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoInventario estadoinventarioAux:this.estadoinventarios) {
				if(estadoinventarioAux.getEstadoInventarioOriginal().getId().equals(estadoinventarioOriginal.getId())) {
					existe=true;
					estadoinventarioOriginal.setId(estadoinventarioAux.getId());
					estadoinventarioOriginal.setVersionRow(estadoinventarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoInventario(Boolean esParaCancelar) throws Exception {
		estadoinventariosAux=new ArrayList<EstadoInventario>();
		estadoinventarioAux=new EstadoInventario();
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
					if(estadoinventarioAux.getId()<0) {
						estadoinventariosAux.add(estadoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoInventario=0L;
				this.estadoinventarioLogic.getEstadoInventarios().removeAll(estadoinventariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoInventario estadoinventarioAux:this.estadoinventarios) {
					if(estadoinventarioAux.getId()<0) {
						estadoinventariosAux.add(estadoinventarioAux);
					}		
				}
				this.iIdNuevoEstadoInventario=0L;
				this.estadoinventarios.removeAll(estadoinventariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoInventario 
					&& this.estadoinventarioLogic.getEstadoInventarios().size()>0
					) {
					estadoinventarioAux=this.estadoinventarioLogic.getEstadoInventarios().get(this.estadoinventarioLogic.getEstadoInventarios().size() - 1);
				
					if(estadoinventarioAux.getId()<0) {
						this.estadoinventarioLogic.getEstadoInventarios().remove(estadoinventarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoInventario && this.estadoinventarios.size()>0) {
					estadoinventarioAux=this.estadoinventarios.get(this.estadoinventarios.size() - 1);
				
					if(estadoinventarioAux.getId()<0) {
						this.estadoinventarios.remove(estadoinventarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoInventario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoinventario.getId()<0) {
				this.estadoinventarioLogic.getEstadoInventarios().remove(this.estadoinventario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoinventario.getId()<0) {
				this.estadoinventarios.remove(this.estadoinventario);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoInventario(List<EstadoInventario> estadoinventariosAux) throws Exception {
		EstadoInventarioConstantesFunciones.setEstadosInicialesEstadoInventario(estadoinventariosAux);
	}
	
	public void setEstadosInicialesEstadoInventario(EstadoInventario estadoinventarioAux) throws Exception {
		EstadoInventarioConstantesFunciones.setEstadosInicialesEstadoInventario(estadoinventarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoInventarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoInventarioActual()) {
				if(!this.isEsNuevoEstadoInventario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoInventario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoInventarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Inventario ?", "MANTENIMIENTO DE Estado Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoInventario estadoinventario) throws Exception {
		EstadoInventarioConstantesFunciones.seleccionarAsignar(this.estadoinventario,estadoinventario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoInventario=this.isPermisoActualizarOriginalEstadoInventario;
			
			
			this.seleccionarAsignar(estadoinventario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoInventarioConstantesFunciones.quitarEspaciosEstadoInventario(this.estadoinventario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoinventarioSessionBean.setsFuncionBusquedaRapida(this.estadoinventarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoInventario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoInventario(esParaCancelar);				
				this.cancelarNuevoEstadoInventario(esParaCancelar);								
			}
			
			this.estadoinventario=new EstadoInventario();
			
			this.inicializarEstadoInventario();
			
			this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoInventario() throws Exception {
		try {
			EstadoInventarioConstantesFunciones.inicializarEstadoInventario(this.estadoinventario);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoinventarioLogic.getEstadoInventarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoInventarios(String sAccionBusqueda,List<EstadoInventario> estadoinventariosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="EstadoInventario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoInventarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoInventarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoInventario"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Estado Inventarios");		
		parameters.put("busquedapor", EstadoInventarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Transferencia.class));
			classes.add(new Classe(Compra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoInventarioLogic estadoinventarioLogicAuxiliar=new EstadoInventarioLogic();
					estadoinventarioLogicAuxiliar.setDatosCliente(estadoinventarioLogic.getDatosCliente());				
					estadoinventarioLogicAuxiliar.setEstadoInventarios(estadoinventariosParaReportes);
					
					estadoinventarioLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoInventarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoinventariosParaReportes=estadoinventarioLogicAuxiliar.getEstadoInventarios();
					
					//estadoinventarioLogic.getNewConnexionToDeep();
					
					//for (EstadoInventario estadoinventario:estadoinventariosParaReportes) {
					//	estadoinventarioLogic.deepLoad(estadoinventario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoinventarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoinventarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransferencia = AuxiliarReportes.class.getResourceAsStream("TransferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transferencia", reportFileTransferencia);

			InputStream reportFileCompra = AuxiliarReportes.class.getResourceAsStream("CompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_compra", reportFileCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoInventario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoInventarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoInventario=new JRBeanArrayDataSource(EstadoInventarioJInternalFrame.TraerEstadoInventarioBeans(estadoinventariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoInventario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoInventarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoInventarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoInventarioBean.TraerEstadoInventarioBeans(estadoinventariosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoInventarioActionPerformed(null);
					//this.generarExcelReporteEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoInventarios(sAccionBusqueda,sTipoArchivoReporte,estadoinventariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoInventario> estadoinventariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoInventarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoInventario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoInventario estadoinventario : estadoinventariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoInventarioConstantesFunciones.generarExcelReporteDataEstadoInventario("NORMAL",row,workbook,estadoinventario,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoInventario(String sTipo,Row row,Workbook workbook) {
		
		EstadoInventarioConstantesFunciones.generarExcelReporteHeaderEstadoInventario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoInventario> estadoinventariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoInventario estadoinventario : estadoinventariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoInventarioConstantesFunciones.getEstadoInventarioDescripcion(estadoinventario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoInventarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoinventario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoInventarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoinventario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoInventarios(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoInventario> estadoinventariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoInventario> estadoinventariosRespaldo=null;
		
		classes=EstadoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoInventario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoinventarioLogic.setDatosCliente(this.datosCliente);
		this.estadoinventarioLogic.setDatosDeep(this.datosDeep);
		this.estadoinventarioLogic.setIsConDeep(true);
		
		estadoinventariosRespaldo=this.estadoinventarioLogic.getEstadoInventarios();
		
		this.estadoinventarioLogic.setEstadoInventarios(estadoinventariosParaReportes);	
		this.estadoinventarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoinventariosParaReportes=this.estadoinventarioLogic.getEstadoInventarios();
		this.estadoinventarioLogic.setEstadoInventarios(estadoinventariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoInventarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoInventario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoInventario estadoinventario : estadoinventariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoInventario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoInventarioConstantesFunciones.generarExcelReporteDataEstadoInventario("NORMAL",row,workbook,estadoinventario,cellStyleDataAux);
		
			
			


				//Transferencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoinventario.getTransferencias()!=null && estadoinventario.getTransferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransferenciaConstantesFunciones.generarExcelReporteHeaderTransferencia("RELACIONADO",row,workbook);
				}

				if(estadoinventario.getTransferencias()!=null) {
					i2=0;
					for(Transferencia transferencia : estadoinventario.getTransferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransferenciaConstantesFunciones.generarExcelReporteDataTransferencia("RELACIONADO",row,workbook,transferencia,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Compra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoinventario.getCompras()!=null && estadoinventario.getCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CompraConstantesFunciones.generarExcelReporteHeaderCompra("RELACIONADO",row,workbook);
				}

				if(estadoinventario.getCompras()!=null) {
					i2=0;
					for(Compra compra : estadoinventario.getCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CompraConstantesFunciones.generarExcelReporteDataCompra("RELACIONADO",row,workbook,compra,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoInventarioConstantesFunciones.getEstadoInventarioDescripcion(estadoinventario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoInventario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoInventario() throws Exception {		
		this.startProcessEstadoInventario(true);
	}
	
	public void startProcessEstadoInventario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoInventario, this.jScrollPanelDatosEstadoInventario,this.jPanelPaginacionEstadoInventario, this.jScrollPanelDatosEdicionEstadoInventario, this.jPanelAccionesEstadoInventario,this.jPanelAccionesFormularioEstadoInventario,this.jmenuBarEstadoInventario,this.jmenuBarDetalleEstadoInventario,this.jTtoolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoInventario=this.jPanelParametrosReportesEstadoInventario;
		//final JScrollPane jScrollPanelDatosEstadoInventario=this.jScrollPanelDatosEstadoInventario;
		final JTable jTableDatosEstadoInventario=this.jTableDatosEstadoInventario;		
		final JPanel jPanelPaginacionEstadoInventario=this.jPanelPaginacionEstadoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoInventario=this.jScrollPanelDatosEdicionEstadoInventario;
		final JPanel jPanelAccionesEstadoInventario=this.jPanelAccionesEstadoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoInventario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoInventario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			jPanelCamposAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jPanelCamposEstadoInventario;
			jPanelAccionesFormularioAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jPanelAccionesFormularioEstadoInventario;
		}
		
		final JPanel jPanelCamposEstadoInventario=jPanelCamposAuxiliarEstadoInventario;
		final JPanel jPanelAccionesFormularioEstadoInventario=jPanelAccionesFormularioAuxiliarEstadoInventario;
		
		
		final JMenuBar jmenuBarEstadoInventario=this.jmenuBarEstadoInventario;
		final JToolBar jTtoolBarEstadoInventario=this.jTtoolBarEstadoInventario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoInventario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jmenuBarDetalleEstadoInventario;
			jTtoolBarDetalleAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jTtoolBarDetalleEstadoInventario;
		}
		
		final JMenuBar jmenuBarDetalleEstadoInventario=jmenuBarDetalleAuxiliarEstadoInventario;
		final JToolBar jTtoolBarDetalleEstadoInventario=jTtoolBarDetalleAuxiliarEstadoInventario;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoInventario ,jPanelParametrosReportesEstadoInventario,jTableDatosEstadoInventario, /*jScrollPanelDatosEstadoInventario,*/jPanelCamposEstadoInventario,jPanelPaginacionEstadoInventario, /*jScrollPanelDatosEdicionEstadoInventario,*/ jPanelAccionesEstadoInventario,jPanelAccionesFormularioEstadoInventario,jmenuBarEstadoInventario,jmenuBarDetalleEstadoInventario,jTtoolBarEstadoInventario,jTtoolBarDetalleEstadoInventario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoInventario, jScrollPanelDatosEstadoInventario,jPanelPaginacionEstadoInventario, jScrollPanelDatosEdicionEstadoInventario, jPanelAccionesEstadoInventario,jPanelAccionesFormularioEstadoInventario,jmenuBarEstadoInventario,jmenuBarDetalleEstadoInventario,jTtoolBarEstadoInventario,jTtoolBarDetalleEstadoInventario);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessEstadoInventario() {// throws Exception 
		this.finishProcessEstadoInventario(true);
	}
	
	public void finishProcessEstadoInventario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoInventario, this.jScrollPanelDatosEstadoInventario,this.jPanelPaginacionEstadoInventario, this.jScrollPanelDatosEdicionEstadoInventario, this.jPanelAccionesEstadoInventario,this.jPanelAccionesFormularioEstadoInventario,this.jmenuBarEstadoInventario,this.jmenuBarDetalleEstadoInventario,this.jTtoolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoInventario=null; 
		
		final JPanel jPanelParametrosReportesEstadoInventario=this.jPanelParametrosReportesEstadoInventario;
		//final JScrollPane jScrollPanelDatosEstadoInventario=this.jScrollPanelDatosEstadoInventario;
		final JTable jTableDatosEstadoInventario=this.jTableDatosEstadoInventario;		
		final JPanel jPanelPaginacionEstadoInventario=this.jPanelPaginacionEstadoInventario;
		//final JScrollPane jScrollPanelDatosEdicionEstadoInventario=this.jScrollPanelDatosEdicionEstadoInventario;
		final JPanel jPanelAccionesEstadoInventario=this.jPanelAccionesEstadoInventario;
		
		JPanel jPanelCamposAuxiliarEstadoInventario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoInventario=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			jPanelCamposAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jPanelCamposEstadoInventario;
			jPanelAccionesFormularioAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jPanelAccionesFormularioEstadoInventario;
		}
		
		final JPanel jPanelCamposEstadoInventario=jPanelCamposAuxiliarEstadoInventario;
		final JPanel jPanelAccionesFormularioEstadoInventario=jPanelAccionesFormularioAuxiliarEstadoInventario;
		
		
		final JMenuBar jmenuBarEstadoInventario=this.jmenuBarEstadoInventario;		
		final JToolBar jTtoolBarEstadoInventario=this.jTtoolBarEstadoInventario;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoInventario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoInventario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			jmenuBarDetalleAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jmenuBarDetalleEstadoInventario;
			jTtoolBarDetalleAuxiliarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jTtoolBarDetalleEstadoInventario;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoInventario=jmenuBarDetalleAuxiliarEstadoInventario;
		final JToolBar jTtoolBarDetalleEstadoInventario=jTtoolBarDetalleAuxiliarEstadoInventario;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoInventario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoInventario;
			processRunnable.jTableDatos=jTableDatosEstadoInventario;
			processRunnable.jPanelCampos=jPanelCamposEstadoInventario;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoInventario;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoInventario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoInventario;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoInventario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoInventario;
			processRunnable.jTtoolBar=jTtoolBarEstadoInventario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoInventario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoInventario ,jPanelParametrosReportesEstadoInventario, jTableDatosEstadoInventario,/*jScrollPanelDatosEstadoInventario,*/jPanelCamposEstadoInventario,jPanelPaginacionEstadoInventario, /*jScrollPanelDatosEdicionEstadoInventario,*/ jPanelAccionesEstadoInventario,jPanelAccionesFormularioEstadoInventario,jmenuBarEstadoInventario,jmenuBarDetalleEstadoInventario,jTtoolBarEstadoInventario,jTtoolBarDetalleEstadoInventario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoInventario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoInventario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoInventario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoInventario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoInventario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoInventario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoInventario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoinventarioConstantesFunciones.getsFinalQueryEstadoInventario();
		String  finalQueryPaginacionTodos=this.estadoinventarioConstantesFunciones.getsFinalQueryEstadoInventario();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoInventarioConstantesFunciones.getArrayColumnasGlobalesNoEstadoInventario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoInventarioConstantesFunciones.getArrayColumnasGlobalesEstadoInventario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoInventarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoinventariosEliminados= new ArrayList<EstadoInventario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoInventario();
		
				///*EstadoInventarioSessionBean*/this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
			
			if(this.estadoinventarioSessionBean==null) {
				this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=EstadoInventarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoInventarioConstantesFunciones.getClassesForeignKeysOfEstadoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoinventario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoinventariosAux= new ArrayList<EstadoInventario>();
			
				
			estadoinventarioLogic.setDatosCliente(this.datosCliente);
			estadoinventarioLogic.setDatosDeep(this.datosDeep);
			estadoinventarioLogic.setIsConDeep(true);
			
			
			estadoinventarioLogic.getEstadoInventarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoinventarioLogic.getTodosEstadoInventarios(finalQueryGlobal,pagination);
					
					//estadoinventarioLogic.getTodosEstadoInventariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoinventarioLogic.getEstadoInventarios()==null|| estadoinventarioLogic.getEstadoInventarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoinventariosAux= new ArrayList<EstadoInventario>();
							estadoinventariosAux.addAll(estadoinventarioLogic.getEstadoInventarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoinventariosAux= new ArrayList<EstadoInventario>();
							estadoinventariosAux.addAll(estadoinventarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoinventarioLogic.getTodosEstadoInventarios(finalQueryGlobal+"",this.pagination);												
							
							//estadoinventarioLogic.getTodosEstadoInventariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoInventarios("Todos",estadoinventarioLogic.getEstadoInventarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoinventarioLogic.setEstadoInventarios(new ArrayList<EstadoInventario>());					
							estadoinventarioLogic.getEstadoInventarios().addAll(estadoinventariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoinventarios=new ArrayList<EstadoInventario>();
							estadoinventarios.addAll(estadoinventariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoInventario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoInventario=this.idActual;
				
				} else if(this.idEstadoInventarioActual!=null && this.idEstadoInventarioActual!=0L) {
					idEstadoInventario=idEstadoInventarioActual;
				}
				
					
				this.sDetalleReporte=EstadoInventarioConstantesFunciones.getDetalleIndicePorId(idEstadoInventario);
				
				this.estadoinventarios=new ArrayList<EstadoInventario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoinventarioLogic.getEntity(idEstadoInventario);
					
					//estadoinventarioLogic.getEntityWithConnection(idEstadoInventario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoinventarioLogic.setEstadoInventarios(new ArrayList<EstadoInventario>());
					estadoinventarioLogic.getEstadoInventarios().add(estadoinventarioLogic.getEstadoInventario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoinventarios=new ArrayList<EstadoInventario>();
					this.estadoinventarios.add(estadoinventario);
				}
				
				if(estadoinventarioLogic.getEstadoInventario()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoInventario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoInventario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoinventarioLogic.getEstadoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoinventarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoinventarioLogic.getEstadoInventarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoinventarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoInventario estadoinventario) {
		Boolean permite=true;
		
		if(this.estadoinventario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoInventarioConstantesFunciones.getOrderByListaEstadoInventario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoInventarioConstantesFunciones.getOrderByListaEstadoInventario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoInventario estadoinventario:estadoinventarioLogic.getEstadoInventarios()) {
				if(estadoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadoinventarioTotales=estadoinventario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoInventario estadoinventario:this.estadoinventarios) {
				if(estadoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadoinventarioTotales=estadoinventario;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.estadoinventarioAux=new EstadoInventario();
			this.estadoinventarioAux.setsType(Constantes2.S_TOTALES);
			this.estadoinventarioAux.setIsNew(false);
			this.estadoinventarioAux.setIsChanged(false);
			this.estadoinventarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoInventarioConstantesFunciones.TotalizarValoresFilaEstadoInventario(this.estadoinventarioLogic.getEstadoInventarios(),this.estadoinventarioAux);
				
				this.estadoinventarioLogic.getEstadoInventarios().add(this.estadoinventarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoInventarioConstantesFunciones.TotalizarValoresFilaEstadoInventario(this.estadoinventarios,this.estadoinventarioAux);
				
				this.estadoinventarios.add(this.estadoinventarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoinventarioTotales=new EstadoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoinventarioLogic.getEstadoInventarios().remove(estadoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoinventarios.remove(estadoinventarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoinventarioTotales=new EstadoInventario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoInventario estadoinventario:estadoinventarioLogic.getEstadoInventarios()) {
				if(estadoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadoinventarioTotales=estadoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoInventarioConstantesFunciones.TotalizarValoresFilaEstadoInventario(this.estadoinventarioLogic.getEstadoInventarios(),estadoinventarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoInventario estadoinventario:this.estadoinventarios) {
				if(estadoinventario.getsType().equals(Constantes2.S_TOTALES)) {
					estadoinventarioTotales=estadoinventario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoInventarioConstantesFunciones.TotalizarValoresFilaEstadoInventario(this.estadoinventarios,estadoinventarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosEstadoInventario() {
		this.isPermisoTodoEstadoInventario=false;
		this.isPermisoNuevoEstadoInventario=false;
		this.isPermisoActualizarEstadoInventario=false;
		this.isPermisoActualizarOriginalEstadoInventario=false;
		this.isPermisoEliminarEstadoInventario=false;
		this.isPermisoGuardarCambiosEstadoInventario=false;
		this.isPermisoConsultaEstadoInventario=false;
		this.isPermisoBusquedaEstadoInventario=false;
		this.isPermisoReporteEstadoInventario=false;		
		this.isPermisoOrdenEstadoInventario=false;		
		this.isPermisoPaginacionMedioEstadoInventario=false;		
		this.isPermisoPaginacionAltoEstadoInventario=false;
		this.isPermisoPaginacionTodoEstadoInventario=false;
		this.isPermisoCopiarEstadoInventario=false;		
		this.isPermisoVerFormEstadoInventario=false;		
		this.isPermisoDuplicarEstadoInventario=false;		
		this.isPermisoOrdenEstadoInventario=false;		
	}
	
	public void setPermisosUsuarioEstadoInventario(Boolean isPermiso) {
		this.isPermisoTodoEstadoInventario=isPermiso;
		this.isPermisoNuevoEstadoInventario=isPermiso;
		this.isPermisoActualizarEstadoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoInventario=isPermiso;
		this.isPermisoEliminarEstadoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoInventario=isPermiso;
		this.isPermisoConsultaEstadoInventario=isPermiso;
		this.isPermisoBusquedaEstadoInventario=isPermiso;
		this.isPermisoReporteEstadoInventario=isPermiso;
		this.isPermisoOrdenEstadoInventario=isPermiso;		
		this.isPermisoPaginacionMedioEstadoInventario=isPermiso;		
		this.isPermisoPaginacionAltoEstadoInventario=isPermiso;		
		this.isPermisoPaginacionTodoEstadoInventario=isPermiso;		
		this.isPermisoCopiarEstadoInventario=isPermiso;		
		this.isPermisoVerFormEstadoInventario=isPermiso;		
		this.isPermisoDuplicarEstadoInventario=isPermiso;
		this.isPermisoOrdenEstadoInventario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoInventario(Boolean isPermiso) {
		//this.isPermisoTodoEstadoInventario=isPermiso;
		this.isPermisoNuevoEstadoInventario=isPermiso;
		this.isPermisoActualizarEstadoInventario=isPermiso;
		this.isPermisoActualizarOriginalEstadoInventario=isPermiso;
		this.isPermisoEliminarEstadoInventario=isPermiso;
		this.isPermisoGuardarCambiosEstadoInventario=isPermiso;
		//this.isPermisoConsultaEstadoInventario=isPermiso;
		//this.isPermisoBusquedaEstadoInventario=isPermiso;
		//this.isPermisoReporteEstadoInventario=isPermiso;
		//this.isPermisoOrdenEstadoInventario=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoInventario=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoInventario=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoInventario=isPermiso;		
		//this.isPermisoCopiarEstadoInventario=isPermiso;		
		//this.isPermisoDuplicarEstadoInventario=isPermiso;
		//this.isPermisoOrdenEstadoInventario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoInventarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransferenciaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CompraConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransferencia=false;
		this.isTienePermisosTransferencia=this.verificarGetPermisosUsuarioOpcionEstadoInventarioClaseRelacionada(this.opcionsRelacionadas,TransferenciaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCompra=false;
		this.isTienePermisosCompra=this.verificarGetPermisosUsuarioOpcionEstadoInventarioClaseRelacionada(this.opcionsRelacionadas,CompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoInventario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoInventarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransferencia=conPermiso;
		this.isTienePermisosCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoInventarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoInventarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoInventarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransferencia && this.jInternalFrameDetalleFormEstadoInventario!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.remove(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCompra && this.jInternalFrameDetalleFormEstadoInventario!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.remove(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoInventario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoInventarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoInventario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoInventario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoInventario=this.isPermisoActualizarEstadoInventario;
			this.isPermisoEliminarEstadoInventario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoInventario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoInventario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoInventario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoInventario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoInventario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoInventario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoInventario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoInventario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoInventario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoInventario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoInventario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoInventario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoInventario.setToolTipText(this.jTableDatosEstadoInventario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoInventario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoInventario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(EstadoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioEstadoInventario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransferencia && this.estadoinventarioConstantesFunciones.mostrarTransferenciaEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transferencia");
			reporte.setsDescripcion("Transferencia");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCompra && this.estadoinventarioConstantesFunciones.mostrarCompraEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Compra");
			reporte.setsDescripcion("Compra");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoInventarioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoInventarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoInventarioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoInventarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoInventario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoInventario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoInventario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoInventario(EstadoInventario estadoinventario)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoInventario(EstadoInventario estadoinventario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoInventario()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoInventario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoInventario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoInventario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoInventario(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoInventario()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoInventarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoInventarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoInventarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoinventarioSessionBean=new EstadoInventarioSessionBean(); 
		this.estadoinventarioConstantesFunciones=new EstadoInventarioConstantesFunciones(); 
		this.estadoinventarioBean=new EstadoInventario();//(this.estadoinventarioConstantesFunciones); 		
		this.estadoinventarioReturnGeneral=new EstadoInventarioParameterReturnGeneral(); 
		
		this.estadoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoInventarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoInventario(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.estadoinventarioConstantesFunciones=new EstadoInventarioConstantesFunciones(); 
			this.estadoinventarioBean=new EstadoInventario();//this.estadoinventarioConstantesFunciones); 			
			this.estadoinventarioReturnGeneral=new EstadoInventarioParameterReturnGeneral(); 
		
			EstadoInventarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoinventario=new EstadoInventario();
			this.estadoinventarios = new ArrayList<EstadoInventario>();
			this.estadoinventariosAux = new ArrayList<EstadoInventario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic=new EstadoInventarioLogic();
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoInventario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoInventario);	
					}
					
					if(this.jInternalFrameImportacionEstadoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoInventario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoInventario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoInventario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoInventario);
				this.jInternalFrameDetalleFormEstadoInventario.setVisible(false);
				this.jInternalFrameDetalleFormEstadoInventario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoInventario);
					this.jInternalFrameReporteDinamicoEstadoInventario.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoInventario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoInventario);
					this.jInternalFrameImportacionEstadoInventario.setVisible(false);
					this.jInternalFrameImportacionEstadoInventario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoInventario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoInventario);
					this.jInternalFrameOrderByEstadoInventario.setVisible(false);
					this.jInternalFrameOrderByEstadoInventario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoInventarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoInventarioConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.estadoinventarioReturnGeneral=new EstadoInventarioParameterReturnGeneral();
			
			this.estadoinventarioParameterGeneral=new EstadoInventarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoinventarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(EstadoInventarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransferenciaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoinventarioSessionBean.getEsGuardarRelacionado(),this.estadoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoInventarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoinventarioSessionBean.getEsGuardarRelacionado(),this.estadoinventarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoInventario=true;
			this.isVisibilidadCeldaCopiarEstadoInventario=true;
			this.isVisibilidadCeldaVerFormEstadoInventario=true;
			this.isVisibilidadCeldaOrdenEstadoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=false;
			this.isVisibilidadCeldaGuardarEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoInventario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoInventario(false);
			
			this.setPermisosUsuarioEstadoInventario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoinventarioSessionBean.getEsGuardarRelacionado() && this.estadoinventarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoInventarioClasesRelacionadas();
			}
			
			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoInventarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoInventario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoInventario();
			}
			
			if(!this.isPermisoBusquedaEstadoInventario) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoInventario,this.isPermisoPaginacionMedioEstadoInventario,this.isPermisoPaginacionTodoEstadoInventario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoInventarioConstantesFunciones.getTiposSeleccionarEstadoInventario());
				
				this.tiposColumnasSelect=EstadoInventarioConstantesFunciones.getTiposSeleccionarEstadoInventario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoInventario();				
				//this.tiposRelacionesSelect=EstadoInventarioConstantesFunciones.getTiposRelacionesEstadoInventario(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoInventario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoInventario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoInventario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoInventario() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.transferenciaLogic=new TransferenciaLogic();
			this.compraLogic=new CompraLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoinventarioImplementable= (EstadoInventarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoinventarioImplementableHome= (EstadoInventarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoInventarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoinventarios= new ArrayList<EstadoInventario>();
			this.estadoinventariosEliminados= new ArrayList<EstadoInventario>();
						
			this.isEsNuevoEstadoInventario=false;
			this.esParaAccionDesdeFormularioEstadoInventario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoInventario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoInventario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoInventarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoInventarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoInventario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoInventario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoInventario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoInventario();
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoInventario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoInventario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoInventario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoInventario")) {
				iIndex=this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();	
				
				

				if(sTitle.equals("Compras")) {
					if(!CompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoInventario();

						this.cargarParteTabPanelRelacionadaCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transferencias")) {
					if(!TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoInventario();

						this.cargarParteTabPanelRelacionadaTransferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoInventario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoInventario.cargarSessionConBeanSwingJInternalFrameCompra(false,true,iIndex);
		this.jButtonCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCompra();

		//this.jTabbedPaneRelacionesEstadoInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoInventario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoInventario.cargarSessionConBeanSwingJInternalFrameTransferencia(false,true,iIndex);
		this.jButtonTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransferencia();

		//this.jTabbedPaneRelacionesEstadoInventario.updateUI();
		//this.jTabbedPaneRelacionesEstadoInventario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoInventario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Transferencia")) {
				int row=this.jTableDatosEstadoInventario.getSelectedRow();
				jButtonTransferenciaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Compra")) {
				int row=this.jTableDatosEstadoInventario.getSelectedRow();
				jButtonCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transferencia")) {

					if(this.isTienePermisosTransferencia && this.estadoinventarioConstantesFunciones.mostrarTransferenciaEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transferencias"+"("+TransferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transferencias");

						if(estadoinventarioConstantesFunciones.resaltarTransferenciaEstadoInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoinventarioConstantesFunciones.resaltarTransferenciaEstadoInventario);
						}

						jmenuItem.setEnabled(this.estadoinventarioConstantesFunciones.activarTransferenciaEstadoInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Transferencia"));

						

						this.jInternalFrameDetalleFormEstadoInventario.jmenuDetalleEstadoInventario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Compra")) {

					if(this.isTienePermisosCompra && this.estadoinventarioConstantesFunciones.mostrarCompraEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Compras"+"("+CompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Compras");

						if(estadoinventarioConstantesFunciones.resaltarCompraEstadoInventario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoinventarioConstantesFunciones.resaltarCompraEstadoInventario);
						}

						jmenuItem.setEnabled(this.estadoinventarioConstantesFunciones.activarCompraEstadoInventario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Compra"));

						

						this.jInternalFrameDetalleFormEstadoInventario.jmenuDetalleEstadoInventario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoInventario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoInventario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoInventario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoInventarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoInventario();
		
		this.cargarCombosFrameForeignKeyEstadoInventario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoInventario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoInventario();
		}
	}
	
	
	
	public void jButtonNuevoEstadoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			
			if(jTableDatosEstadoInventario.getRowCount()>=1) {
				jTableDatosEstadoInventario.removeRowSelectionInterval(0, jTableDatosEstadoInventario.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoInventario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoInventario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoInventario(true);			
			//this.estadoinventario=new EstadoInventario();
			//this.estadoinventario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoInventario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoInventario() ;
			
			if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoInventario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoinventario);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);				
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoInventario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoInventarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoInventario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoInventario.getSelectedRows().length;			
			}
			
			estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoInventario--;			
				//EstadoInventario estadoinventarioAux= new EstadoInventario();			
				//estadoinventarioAux.setId(this.iIdNuevoEstadoInventario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoInventario estadoinventarioOrigen=new EstadoInventario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoInventario estadoinventarioOrigen : estadoinventariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoinventarioOrigen =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoinventarioOrigen =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoInventario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoinventario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoInventario(estadoinventarioOrigen,this.estadoinventario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoinventarioLogic.getEstadoInventarios().add(this.estadoinventarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoinventarios.add(this.estadoinventarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoInventario(false);
				
				this.jTableDatosEstadoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoInventario(), this.getIndiceNuevoEstadoInventario());
				
				int iLastRow =  this.jTableDatosEstadoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoInventario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();									
		
			EstadoInventario estadoinventarioOrigen=new EstadoInventario();
			EstadoInventario estadoinventarioDestino=new EstadoInventario();
				
			estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoInventario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoinventariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoInventario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoinventarioOrigen =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoinventarioOrigen =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoinventarioDestino =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoinventarioDestino =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoinventarioOrigen =estadoinventariosSeleccionados.get(0);
				estadoinventarioDestino =estadoinventariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoInventario(estadoinventarioOrigen,estadoinventarioDestino,true,false);
				
				estadoinventarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoinventarioDestino,estadoinventarioLogic.getEstadoInventarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoinventarioDestino,estadoinventarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoInventario(false);
				
				//this.jTableDatosEstadoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoInventario(), this.getIndiceNuevoEstadoInventario());
				
				int iLastRow =  this.jTableDatosEstadoInventario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoInventario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoInventario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoInventario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoInventario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoInventario.isVisible();
			
			
			this.jPanelParametrosReportesEstadoInventario.setVisible(!isVisible);
			this.jPanelPaginacionEstadoInventario.setVisible(!isVisible);
			this.jPanelAccionesEstadoInventario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoInventario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoInventario();
			
			this.abrirFrameOrderByEstadoInventario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoInventario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoInventario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoInventario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoInventario.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoInventario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoInventario.setSize(this.jInternalFrameDetalleFormEstadoInventario.iWidthFormulario,this.jInternalFrameDetalleFormEstadoInventario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoInventario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoInventario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoInventario.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoInventario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth(),EstadoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth(),EstadoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth(),EstadoInventarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCompra();
					}

					if(TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoInventario.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoInventario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoInventario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoInventario,false,this);
				} else {
					this.jInternalFrameOrderByEstadoInventario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoInventario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoInventario);
				this.jInternalFrameOrderByEstadoInventario.setVisible(false);
				this.jInternalFrameOrderByEstadoInventario.setSelected(false);
				
				this.jInternalFrameOrderByEstadoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoInventario"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoInventario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoInventario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoInventario==null) {
				
				this.jInternalFrameImportacionEstadoInventario=new ImportacionJInternalFrame(EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoInventario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoInventario);
				this.jInternalFrameImportacionEstadoInventario.setVisible(false);
				this.jInternalFrameImportacionEstadoInventario.setSelected(false);


				this.jInternalFrameImportacionEstadoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoInventario"));
				this.jInternalFrameImportacionEstadoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoInventario"));
				this.jInternalFrameImportacionEstadoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoInventario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoInventario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoInventario==null) {
				this.jInternalFrameReporteDinamicoEstadoInventario=new ReporteDinamicoJInternalFrame(EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoInventario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoInventario);
				this.jInternalFrameReporteDinamicoEstadoInventario.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoInventario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoInventario"));
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoInventario"));
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoInventario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoInventario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jScrollPanelDatosTransferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoInventario.jContentPaneDetalleEstadoInventario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jScrollPanelDatosTransferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jScrollPanelDatosTransferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.jScrollPanelDatosTransferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoInventario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoInventario);
			
	       	this.jInternalFrameDetalleFormEstadoInventario.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoInventario.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoInventario.dispose();
			//this.jInternalFrameDetalleFormEstadoInventario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoInventario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoInventario.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoInventario.setVisible(true);
	        this.jInternalFrameImportacionEstadoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoInventario.setVisible(true);
	        this.jInternalFrameOrderByEstadoInventario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoInventario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoInventario.setVisible(false);
	        this.jInternalFrameOrderByEstadoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoInventario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoInventario.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoInventario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoInventario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoInventario.setVisible(false);
	        this.jInternalFrameImportacionEstadoInventario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoInventario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoInventario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoInventario(true);
			//this.isEsNuevoEstadoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoInventario(false) ;
			
			if(estadoinventarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.getEsGuardarRelacionado() && TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraSessionBean.getEsGuardarRelacionado() && CompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoInventario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoInventarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoInventario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoInventario(true);
			//this.isEsNuevoEstadoInventario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoinventario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoInventario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoInventario(false) ;
			
			if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoInventario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoInventario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoInventario(false);
			
			//if(!this.isEsNuevoEstadoInventario) {								
				int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
				
			}
			
			if(this.permiteMantenimiento(this.estadoinventario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoInventario=true;
					this.inicializarActualizarBindingTablaEstadoInventario(false);
					this.isEsNuevoEstadoInventario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoInventario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoInventario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoInventario(false);
			
												
				
				if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoInventario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoInventarioActionPerformed(evt,estadoinventarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoInventario(this.estadoinventario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoInventario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoinventarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoinventario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadoinventario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				this.estadoinventario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoinventario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoInventarioModel) this.jTableDatosEstadoInventario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoInventario=true;
				this.inicializarActualizarBindingTablaEstadoInventario(false);
				this.isEsNuevoEstadoInventario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoInventario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoInventario(false);
				
				this.habilitarDeshabilitarControlesEstadoInventario(false);
				
				
				
				if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoInventario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoInventario.getRowCount()>=1) {
				jTableDatosEstadoInventario.removeRowSelectionInterval(0, jTableDatosEstadoInventario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoInventario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoInventario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoInventario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoInventario(false) ;
			
			this.isEsNuevoEstadoInventario=false;
			
			if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoInventario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoInventario(false);
				
				//SI ES MANUAL
				if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoInventario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoInventario--;			
			//EstadoInventario estadoinventarioAux= new EstadoInventario();			
			//estadoinventarioAux.setId(this.iIdNuevoEstadoInventario);
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoInventario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
			
			this.estadoinventario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoinventarioLogic.getEstadoInventarios().add(this.estadoinventarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoinventarios.add(this.estadoinventarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoInventario(false);
			
			this.jTableDatosEstadoInventario.setRowSelectionInterval(this.getIndiceNuevoEstadoInventario(), this.getIndiceNuevoEstadoInventario());
			
			int iLastRow =  this.jTableDatosEstadoInventario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoInventario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoInventario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoInventario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoInventario(false);
			
			//SI ES MANUAL
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoInventario();
			}
			
			//this.abrirFrameTreeEstadoInventario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado InventarioS ?", "MANTENIMIENTO DE Estado Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoInventario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoInventario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoinventarioReturnGeneral=estadoinventarioLogic.procesarImportacionEstadoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoinventarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoInventarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoInventario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoInventario.setFileImportacion(this.jInternalFrameImportacionEstadoInventario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoInventario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoInventario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoInventario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoInventario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		

		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoInventarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoInventarioBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoInventarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoInventarioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoEstadoInventario.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoInventarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoInventarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoInventarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoInventarioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("EstadoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoInventarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoInventario estadoinventario:estadoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoinventario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoInventarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoInventario estadoinventario:estadoinventariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoinventario.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelEstadoInventario(row);				
			//	iRow++;
			//}				
			
			//for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoInventario(estadoinventarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoInventario(false);
			
			//SI ES MANUAL
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoInventario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoInventario(false);
			
			//SI ES MANUAL
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoInventario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoInventarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoInventario(false);
			
			//SI ES MANUAL
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoInventario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoinventarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoInventario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoInventario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoInventario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoInventario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoInventario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoInventario.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoInventario.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoInventario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoInventario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoInventario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoInventario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoInventario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoInventario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoInventario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoInventario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoInventario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoInventario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoInventario();
		
		this.inicializarActualizarBindingBotonesManualEstadoInventario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoInventario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoInventario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoInventario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoInventario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoInventario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoInventario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoInventario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionNuevoEstadoInventario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionSinCerrarEstadoInventario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionSinMensajeEstadoInventario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoInventario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoInventario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoInventario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
				this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionNuevoEstadoInventario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionSinCerrarEstadoInventario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoInventario.jCheckBoxPostAccionSinMensajeEstadoInventario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoInventario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoInventario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoInventario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoInventario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoInventario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoInventario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoInventario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoInventario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoInventario(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoInventario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoInventario() throws Exception {
		try	{
			if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoInventario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoInventario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoInventario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoInventario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoInventario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoInventario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoInventario.addItem(reporte);
			}
			
			
			if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoInventario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoInventario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoInventario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoInventario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoInventario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoInventario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoInventario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoInventario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoInventario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoInventario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoInventario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoInventario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoInventario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoInventario(Boolean esInicializar) throws Exception {				
		if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoInventario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoInventario() throws Exception {
		this.inicializarActualizarBindingTablaEstadoInventario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoInventario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoInventarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoInventario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoinventarioLogic.getEstadoInventarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoinventarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoInventario.setModel(new EstadoInventarioModel(this.estadoinventarioLogic.getEstadoInventarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoInventario.setModel(new EstadoInventarioModel(this.estadoinventarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoInventario!=null && this.jInternalFrameOrderByEstadoInventario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoInventario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,estadoinventarioConstantesFunciones.resaltarSeleccionarEstadoInventario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO,estadoinventarioConstantesFunciones.resaltarSeleccionarEstadoInventario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,EstadoInventarioConstantesFunciones.LABEL_ID));

		if(this.estadoinventarioConstantesFunciones.mostraridEstadoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoInventarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoinventarioConstantesFunciones.resaltaridEstadoInventario,this.estadoinventarioConstantesFunciones.activaridEstadoInventario,this,true,"idEstadoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoinventarioConstantesFunciones.resaltaridEstadoInventario,this.estadoinventarioConstantesFunciones.activaridEstadoInventario,this,true,"idEstadoInventario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,EstadoInventarioConstantesFunciones.LABEL_CODIGO));

		if(this.estadoinventarioConstantesFunciones.mostrarcodigoEstadoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoInventarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoinventarioConstantesFunciones.resaltarcodigoEstadoInventario,this.estadoinventarioConstantesFunciones.activarcodigoEstadoInventario,this,true,"codigoEstadoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoinventarioConstantesFunciones.resaltarcodigoEstadoInventario,this.estadoinventarioConstantesFunciones.activarcodigoEstadoInventario,this,true,"codigoEstadoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,EstadoInventarioConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoinventarioConstantesFunciones.mostrarnombreEstadoInventario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoInventarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoinventarioConstantesFunciones.resaltarnombreEstadoInventario,this.estadoinventarioConstantesFunciones.activarnombreEstadoInventario,this,true,"nombreEstadoInventario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoinventarioConstantesFunciones.resaltarnombreEstadoInventario,this.estadoinventarioConstantesFunciones.activarnombreEstadoInventario,this,true,"nombreEstadoInventario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoInventarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransferencia && this.estadoinventarioConstantesFunciones.mostrarTransferenciaEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transferencias");
				tableColumn.setHeaderValue("Transferencias");
				tableColumn.setCellRenderer(new TransferenciaTableCell(estadoinventarioConstantesFunciones.resaltarTransferenciaEstadoInventario,this,this.estadoinventarioConstantesFunciones.activarTransferenciaEstadoInventario));
				tableColumn.setCellEditor(new TransferenciaTableCell(estadoinventarioConstantesFunciones.resaltarTransferenciaEstadoInventario,this,this.estadoinventarioConstantesFunciones.activarTransferenciaEstadoInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoInventario.addColumn(tableColumn);
			}

			if(this.isTienePermisosCompra && this.estadoinventarioConstantesFunciones.mostrarCompraEstadoInventario && !EstadoInventarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Compras");
				tableColumn.setHeaderValue("Compras");
				tableColumn.setCellRenderer(new CompraTableCell(estadoinventarioConstantesFunciones.resaltarCompraEstadoInventario,this,this.estadoinventarioConstantesFunciones.activarCompraEstadoInventario));
				tableColumn.setCellEditor(new CompraTableCell(estadoinventarioConstantesFunciones.resaltarCompraEstadoInventario,this,this.estadoinventarioConstantesFunciones.activarCompraEstadoInventario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoInventario.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoInventario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoInventario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoinventarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoInventario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoInventario.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosEstadoInventario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoinventarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoInventario.moveColumn(this.jTableDatosEstadoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoInventario.moveColumn(this.jTableDatosEstadoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoinventarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoInventario.moveColumn(this.jTableDatosEstadoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoInventario.moveColumn(this.jTableDatosEstadoInventario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoInventario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoInventario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoInventario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoInventario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoInventario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoInventario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoInventario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoInventario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=estadoinventarioLogic.getEstadoInventarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoinventarios.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosEstadoInventario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoInventario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoInventario();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoEstadoInventario=false;
					
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
				if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoInventario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoInventario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoinventario.getsType().equals("DUPLICADO")
				   || this.estadoinventario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoInventario=true;
				
				} else {
					this.isEsNuevoEstadoInventario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoinventario.getId()>=0 && !this.estadoinventario.getIsNew()) {						
						this.isEsNuevoEstadoInventario=false;
						
					} else {
						this.isEsNuevoEstadoInventario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoInventario(esRelaciones);						
				
				this.seleccionarEstadoInventario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoinventario.getId()<0) {
					this.isEsNuevoEstadoInventario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoInventario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoInventario(evt,rowIndex);
				}	
				
				if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoInventario: " + this.dDif); 
					}
				}								
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoInventario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoinventario)) {
					if(this.estadoinventario.getId()>0) {
						this.estadoinventario.setIsDeleted(true);
						
						this.estadoinventariosEliminados.add(this.estadoinventario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoinventarioLogic.getEstadoInventarios().remove(this.estadoinventario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoinventarios.remove(this.estadoinventario);				
					}
					
					
					((EstadoInventarioModel) this.jTableDatosEstadoInventario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoInventario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoInventario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoInventario) {
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoInventario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoInventario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoInventario(this.estadoinventario);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoInventario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoInventario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoInventario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoInventario(EstadoInventario estadoinventario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoInventario(estadoinventario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoInventario(EstadoInventario estadoinventario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoInventario(estadoinventario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoInventario(estadoinventario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoInventario(estadoinventario);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoInventario(EstadoInventario estadoinventario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setText(estadoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setText(estadoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setText(estadoinventario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoInventario estadoinventarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoinventarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoInventario estadoinventarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoinventarioLocal=this.estadoinventario;
			} else {
				estadoinventarioLocal=this.estadoinventarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoinventarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoInventario(estadoinventarioLocal,true);
					
					if(estadoinventarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoinventarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoinventarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoInventario(EstadoInventario estadoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoInventario(estadoinventario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(estadoinventario);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoInventario(EstadoInventario estadoinventario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoInventario(estadoinventario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoInventario(EstadoInventario estadoinventario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.getText()==null || this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.getText()=="" || this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setText("0");
			}

			if(conColumnasBase) {estadoinventario.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoInventarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoInventario.jLabelIdEstadoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoinventario.setcodigo(this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoInventarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoInventario.jLabelcodigoEstadoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoinventario.setnombre(this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoInventarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoInventario.jLabelnombreEstadoInventario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoInventario(EstadoInventario estadoinventarioBean,EstadoInventario estadoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoInventario(EstadoInventario estadoinventarioOrigen,EstadoInventario estadoinventario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoinventarioOrigen.getId()!=null && !estadoinventarioOrigen.getId().equals(0L))) {estadoinventario.setId(estadoinventarioOrigen.getId());}}
			if(conDefault || (!conDefault && estadoinventarioOrigen.getcodigo()!=null && !estadoinventarioOrigen.getcodigo().equals(""))) {estadoinventario.setcodigo(estadoinventarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoinventarioOrigen.getnombre()!=null && !estadoinventarioOrigen.getnombre().equals(""))) {estadoinventario.setnombre(estadoinventarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoInventario(EstadoInventario estadoinventario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setText(estadoinventario.getId().toString());
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setText(estadoinventario.getcodigo());
			this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setText(estadoinventario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoInventario(EstadoInventarioBean estadoinventarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setText(estadoinventarioBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setText(estadoinventarioBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setText(estadoinventarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoInventario(EstadoInventarioParameterReturnGeneral estadoinventarioReturnGeneral,EstadoInventarioBean estadoinventarioBean,Boolean conDefault) throws Exception { 
		try {
			EstadoInventario estadoinventarioLocal=new EstadoInventario();
			
			estadoinventarioLocal=estadoinventarioReturnGeneral.getEstadoInventario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoinventarioLocal.getId()!=null && !estadoinventarioLocal.getId().equals(0L))) {estadoinventarioBean.setId(estadoinventarioLocal.getId());}}
			if(conDefault || (!conDefault && estadoinventarioLocal.getcodigo()!=null && !estadoinventarioLocal.getcodigo().equals(""))) {estadoinventarioBean.setcodigo(estadoinventarioLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoinventarioLocal.getnombre()!=null && !estadoinventarioLocal.getnombre().equals(""))) {estadoinventarioBean.setnombre(estadoinventarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoInventarioGenerico(Long idEstadoInventarioSeleccionado,JComboBox jComboBoxEstadoInventario,List<EstadoInventario> estadoinventariosLocal)throws Exception {
		try {
			EstadoInventario  estadoinventarioTemp=null;

			for(EstadoInventario estadoinventarioAux:estadoinventariosLocal) {
				if(estadoinventarioAux.getId()!=null && estadoinventarioAux.getId().equals(idEstadoInventarioSeleccionado)) {
					estadoinventarioTemp=estadoinventarioAux;
					break;
				}
			}

			jComboBoxEstadoInventario.setSelectedItem(estadoinventarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoInventarioGenerico(JComboBox jComboBoxEstadoInventario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxEstadoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoInventario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoInventario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoInventario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("Transferencia")) {
			jButtonTransferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Compra")) {
			jButtonCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoinventario=(EstadoInventario) estadoinventarioLogic.getEstadoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoinventario =(EstadoInventario) estadoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoInventario estadoinventarioRow=new EstadoInventario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoinventarioRow=(EstadoInventario) estadoinventarioLogic.getEstadoInventarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoinventarioRow=(EstadoInventario) estadoinventarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoInventario estadoinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventario = (EstadoInventario)this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoinventario = (EstadoInventario)this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoinventario!=null) {
						this.estadoinventario = estadoinventario;
					} else {
						this.estadoinventario = new EstadoInventario();
					}
				}

				if(this.isTienePermisosTransferencia && this.permiteMantenimiento(this.estadoinventario)) {
					TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup=new TransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup;
					} else {
						transferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame;
					}

					List<EstadoInventario> estadoinventarios=new ArrayList<EstadoInventario>();
					estadoinventarios.add(this.estadoinventario);
					if(!esRelacionado) {
						//transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setConGuardarRelaciones(false);
						//transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transferenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoInventario.cargarTransferenciaBeanSwingJInternalFrame(estadoinventarios,this.estadoinventario,transferenciaBeanSwingJInternalFrame,/*conInicializar,*/transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.getConGuardarRelaciones(),transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.getEsGuardarRelacionado());
					transferenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTransferencia("no_relacionado");

						transferenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransferenciaConstantesFunciones.ITAMANIOFILATABLA + (TransferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						transferenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoInventario=(TitledBorder)this.jScrollPanelDatosEstadoInventario.getBorder();
						TitledBorder titledBorderTransferencia=(TitledBorder)transferenciaBeanSwingJInternalFrame.jScrollPanelDatosTransferencia.getBorder();

						titledBorderTransferencia.setTitle(titledBorderEstadoInventario.getTitle() + " -> Transferencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transferenciaBeanSwingJInternalFrame);
						}

						transferenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transferenciaBeanSwingJInternalFrame);

						transferenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transferencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoInventario estadoinventario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoInventario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventario = (EstadoInventario)this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoinventario = (EstadoInventario)this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoinventario!=null) {
						this.estadoinventario = estadoinventario;
					} else {
						this.estadoinventario = new EstadoInventario();
					}
				}

				if(this.isTienePermisosCompra && this.permiteMantenimiento(this.estadoinventario)) {
					CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup=new CompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						compraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup;
					} else {
						compraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame;
					}

					List<EstadoInventario> estadoinventarios=new ArrayList<EstadoInventario>();
					estadoinventarios.add(this.estadoinventario);
					if(!esRelacionado) {
						//compraBeanSwingJInternalFrame.compraSessionBean.setConGuardarRelaciones(false);
						//compraBeanSwingJInternalFrame.compraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					compraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoInventario.cargarCompraBeanSwingJInternalFrame(estadoinventarios,this.estadoinventario,compraBeanSwingJInternalFrame,/*conInicializar,*/compraBeanSwingJInternalFrame.compraSessionBean.getConGuardarRelaciones(),compraBeanSwingJInternalFrame.compraSessionBean.getEsGuardarRelacionado());
					compraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						compraBeanSwingJInternalFrame.actualizarEstadoPanelsCompra("no_relacionado");

						compraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CompraConstantesFunciones.ITAMANIOFILATABLA + (CompraConstantesFunciones.ITAMANIOFILATABLA/2));

						compraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoInventario=(TitledBorder)this.jScrollPanelDatosEstadoInventario.getBorder();
						TitledBorder titledBorderCompra=(TitledBorder)compraBeanSwingJInternalFrame.jScrollPanelDatosCompra.getBorder();

						titledBorderCompra.setTitle(titledBorderEstadoInventario.getTitle() + " -> Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,compraBeanSwingJInternalFrame);
						}

						compraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(compraBeanSwingJInternalFrame);

						compraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoInventario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario));			
			this.jButtonDuplicarEstadoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoInventario && this.isPermisoDuplicarEstadoInventario));			
			this.jButtonCopiarEstadoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoInventario && this.isPermisoCopiarEstadoInventario));
			this.jButtonVerFormEstadoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoInventario && this.isPermisoVerFormEstadoInventario));
			
			this.jButtonAbrirOrderByEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));			
			
			this.jButtonNuevoRelacionesEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoInventario && this.isPermisoNuevoEstadoInventario));			
			this.jButtonNuevoGuardarCambiosEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarEstadoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoInventario && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoInventario && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoInventario && this.isPermisoEliminarEstadoInventario));
			this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoInventario);							
			this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario));						
			this.jButtonDuplicarToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoInventario && this.isPermisoDuplicarEstadoInventario));						
			this.jButtonCopiarToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoInventario && this.isPermisoCopiarEstadoInventario));			
			this.jButtonVerFormToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoInventario && this.isPermisoVerFormEstadoInventario));			
			this.jButtonAbrirOrderByToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));
			this.jButtonNuevoRelacionesToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoInventario && this.isPermisoNuevoEstadoInventario));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));			
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoInventario && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoInventario  && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoInventario && this.isPermisoEliminarEstadoInventario));
			this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarToolBarEstadoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoInventario);				
			this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario));			
			this.jMenuItemDuplicarEstadoInventario.setVisible((this.isVisibilidadCeldaDuplicarEstadoInventario && this.isPermisoDuplicarEstadoInventario));			
			this.jMenuItemCopiarEstadoInventario.setVisible((this.isVisibilidadCeldaCopiarEstadoInventario && this.isPermisoCopiarEstadoInventario));			
			this.jMenuItemVerFormEstadoInventario.setVisible((this.isVisibilidadCeldaVerFormEstadoInventario && this.isPermisoVerFormEstadoInventario));			
			this.jMenuItemAbrirOrderByEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));			
			//this.jMenuItemMostrarOcultarEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));
			this.jMenuItemDetalleAbrirOrderByEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));			
			//this.jMenuItemDetalleMostrarOcultarEstadoInventario.setVisible((this.isVisibilidadCeldaOrdenEstadoInventario && this.isPermisoOrdenEstadoInventario));			
			this.jMenuItemNuevoRelacionesEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoInventario && this.isPermisoNuevoEstadoInventario));			
			this.jMenuItemNuevoGuardarCambiosEstadoInventario.setVisible((this.isVisibilidadCeldaNuevoEstadoInventario && this.isPermisoNuevoEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));									
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemModificarEstadoInventario.setVisible((this.isVisibilidadCeldaModificarEstadoInventario && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemActualizarEstadoInventario.setVisible((this.isVisibilidadCeldaActualizarEstadoInventario && this.isPermisoActualizarEstadoInventario));	
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemEliminarEstadoInventario.setVisible((this.isVisibilidadCeldaEliminarEstadoInventario && this.isPermisoEliminarEstadoInventario));
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemCancelarEstadoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoInventario);				
			}
			
			this.jMenuItemGuardarCambiosEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));						
			this.jMenuItemGuardarCambiosTablaEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoInventario=this.jButtonNuevoEstadoInventario.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoInventario=this.jButtonDuplicarEstadoInventario.isVisible();
			this.isVisibilidadCeldaCopiarEstadoInventario=this.jButtonCopiarEstadoInventario.isVisible();
			this.isVisibilidadCeldaVerFormEstadoInventario=this.jButtonVerFormEstadoInventario.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoInventario=this.jButtonAbrirOrderByEstadoInventario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=this.jButtonNuevoRelacionesEstadoInventario.isVisible();
			this.isVisibilidadCeldaModificarEstadoInventario=this.jButtonModificarEstadoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.isVisibilidadCeldaActualizarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.isVisible();
			this.isVisibilidadCeldaGuardarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=this.jButtonGuardarCambiosTablaEstadoInventario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoInventario=this.jButtonNuevoToolBarEstadoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=this.jButtonNuevoRelacionesToolBarEstadoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarToolBarEstadoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarToolBarEstadoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarToolBarEstadoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarToolBarEstadoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoInventario=this.jButtonGuardarCambiosToolBarEstadoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=this.jButtonGuardarCambiosTablaToolBarEstadoInventario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoInventario=this.jMenuItemNuevoEstadoInventario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=this.jMenuItemNuevoRelacionesEstadoInventario.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.isVisibilidadCeldaModificarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jMenuItemModificarEstadoInventario.isVisible();
			this.isVisibilidadCeldaActualizarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jMenuItemActualizarEstadoInventario.isVisible();
			this.isVisibilidadCeldaEliminarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jMenuItemEliminarEstadoInventario.isVisible();
			this.isVisibilidadCeldaCancelarEstadoInventario=this.jInternalFrameDetalleFormEstadoInventario.jMenuItemCancelarEstadoInventario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoInventario=this.jMenuItemGuardarCambiosEstadoInventario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=this.jMenuItemGuardarCambiosTablaEstadoInventario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoInventario(Boolean esInicializar) {
		if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoInventario();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoInventario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoInventario() {
		this.jButtonNuevoEstadoInventario.setVisible(this.isPermisoNuevoEstadoInventario);			
		this.jButtonDuplicarEstadoInventario.setVisible(this.isPermisoDuplicarEstadoInventario);			
		this.jButtonCopiarEstadoInventario.setVisible(this.isPermisoCopiarEstadoInventario);			
		this.jButtonVerFormEstadoInventario.setVisible(this.isPermisoVerFormEstadoInventario);			
		
		this.jButtonAbrirOrderByEstadoInventario.setVisible(this.isPermisoOrdenEstadoInventario);					
		
		this.jButtonNuevoRelacionesEstadoInventario.setVisible(this.isPermisoNuevoEstadoInventario);			
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarEstadoInventario.setVisible(this.isPermisoActualizarEstadoInventario);	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.setVisible(this.isPermisoActualizarEstadoInventario);	
			this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.setVisible(this.isPermisoEliminarEstadoInventario);
			this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoInventario);						
			this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.setVisible(this.isPermisoGuardarCambiosEstadoInventario);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoInventario.setVisible(this.isPermisoActualizarEstadoInventario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoInventario() {
		this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarEstadoInventario.setVisible(this.isPermisoActualizarEstadoInventario);	
		this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.setVisible(this.isPermisoActualizarEstadoInventario);	
		this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.setVisible(this.isPermisoEliminarEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.setVisible(this.isVisibilidadCeldaCancelarEstadoInventario);							
		this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.setVisible((this.isVisibilidadCeldaGuardarEstadoInventario && this.isPermisoGuardarCambiosEstadoInventario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoInventario() {
		if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoInventario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoInventario() {
	}
	
	public void jTableDatosEstadoInventarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoInventario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoInventario(this.getestadoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoinventario==null) {
						this.estadoinventario = new EstadoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
				}

				if(this.estadoinventario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoinventario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoInventario(this.getestadoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoinventario==null) {
						this.estadoinventario = new EstadoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
				}

				if(this.estadoinventario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoinventario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoInventarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoInventario(this.getestadoinventario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoinventario==null) {
						this.estadoinventario = new EstadoInventario();
					}

					this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);
				}

				if(this.estadoinventario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoinventario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoInventario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoInventario() {
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
			this.jInternalFrameDetalleFormEstadoInventario.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoInventario.dispose();
			this.jInternalFrameDetalleFormEstadoInventario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
			this.jInternalFrameReporteDinamicoEstadoInventario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoInventario.dispose();
			this.jInternalFrameReporteDinamicoEstadoInventario=null;
		}
		
		if(this.jInternalFrameImportacionEstadoInventario!=null) {
			this.jInternalFrameImportacionEstadoInventario.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoInventario.dispose();
			this.jInternalFrameImportacionEstadoInventario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoInventario();
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoInventario")) {
				jButtonDuplicarEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoInventario")) {
				jButtonCopiarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoInventario")) {
				jButtonVerFormEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoInventario")) {
				jButtonDuplicarEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoInventario")) {
				jButtonDuplicarEstadoInventarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoInventario")) {
				jButtonModificarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoInventario")) {
				jButtonModificarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoInventario")) {
				jButtonModificarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoInventario")) {
				jButtonActualizarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoInventario")) {
				jButtonActualizarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoInventario")) {
				jButtonActualizarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoInventario")) {
				jButtonEliminarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoInventario")) {
				jButtonEliminarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoInventario")) {
				jButtonEliminarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoInventario")) {
				jButtonCancelarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoInventario")) {
				jButtonCancelarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoInventario")) {
				jButtonCancelarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoInventario")) {
				jButtonCerrarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoInventario")) {
				jButtonCerrarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoInventario")) {
				jButtonCerrarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoInventario")) {
				jButtonMostrarOcultarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoInventario")) {
				jButtonCancelarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoInventario")) {
				jButtonCopiarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoInventario")) {
				jButtonVerFormEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoInventario")) {
				jButtonCopiarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoInventario")) {
				jButtonVerFormEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoInventario")) {
				jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoInventario")) {
				jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoInventario")) {
				jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoInventario")) {
				jButtonAnterioresEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoInventario")) {
				jButtonAnterioresEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoInventario")) {
				jButtonAnterioresEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoInventario")) {
				jButtonSiguientesEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoInventario")) {
				jButtonSiguientesEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoInventario")) {
				jButtonSiguientesEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoInventario") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoInventario")) {
				jButtonAbrirOrderByEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoInventario") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoInventario")) {
				jButtonMostrarOcultarEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoInventario")) {
				jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoInventario")) {
				jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoInventario")) {
				jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoInventario")) {
				jButtonCerrarReporteDinamicoEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoInventario")) {
				jButtonGenerarReporteDinamicoEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoInventario")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoInventario")) {
				jButtonCerrarImportacionEstadoInventarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoInventario")) {
				
				jButtonGenerarImportacionEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoInventario")) {
				
				jButtonAbrirImportacionEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoInventario")) {
				jComboBoxTiposAccionesEstadoInventarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoInventario")) {
				jComboBoxTiposRelacionesEstadoInventarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoInventario")) {
				jComboBoxTiposAccionesEstadoInventarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoInventario")) {
				
				jComboBoxTiposSeleccionarEstadoInventarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoInventario")) {
				jTextFieldValorCampoGeneralEstadoInventarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoInventario")) {
				jButtonAbrirOrderByEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoInventario")) {
				jButtonAbrirOrderByEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoInventario")) {
				jButtonCerrarOrderByEstadoInventarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoInventarioBusqueda")) {
				this.jButtonidEstadoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoInventarioBusqueda")) {
				this.jButtoncodigoEstadoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoInventarioBusqueda")) {
				this.jButtonnombreEstadoInventarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoInventario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoInventario estadoinventarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoinventarioLocal=this.estadoinventario;
			} else {
				estadoinventarioLocal=this.estadoinventarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
							
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
								
						
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
								
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
							
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
								
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoInventario")) {
					jCheckBoxSeleccionarTodosEstadoInventarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoInventario")) {
					jCheckBoxSeleccionadosEstadoInventarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoInventario")) {
					
				}
				
				


				
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
												
				
				


				
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoInventarioActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoinventario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoinventario);
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoInventario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoInventario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoInventarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoinventarioAnterior =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoInventario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoInventario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoinventario =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoinventario =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoinventario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoInventario")) {
				
				}
				
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoInventario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoInventario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoInventario")) {
			
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoInventario();
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoInventario")) {
				jButtonDuplicarEstadoInventarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoInventario")) {
				jButtonCopiarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoInventario")) {
				jButtonVerFormEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoInventario")) {
				jButtonNuevoEstadoInventarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoInventario")) {
				jButtonModificarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoInventario")) {
				jButtonActualizarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoInventario")) {
				jButtonEliminarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoInventario")) {
				jButtonCancelarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoInventario")) {
				jButtonCerrarEstadoInventarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoInventario")) {
				jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoInventario")) {
				jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoInventario")) {
				jButtonAbrirOrderByEstadoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoInventario")) {
				jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoInventario")) {
				jButtonAnterioresEstadoInventarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoInventario")) {
				jButtonSiguientesEstadoInventarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoInventarioBusqueda")) {
				this.jButtonidEstadoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoInventarioBusqueda")) {
				this.jButtoncodigoEstadoInventarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoInventarioBusqueda")) {
				this.jButtonnombreEstadoInventarioBusquedaActionPerformed(evt);
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoInventario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoInventario")) {
				closingInternalFrameEstadoInventario();
				
			} else if(sTipo.equals("jButtonCancelarEstadoInventario")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoInventario = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoInventario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoInventarioActionPerformed(null);
			}
			
			EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoinventario,new Object(),this.estadoinventarioParameterGeneral,this.estadoinventarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoInventario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoinventario)) {
			if(!esControlTabla) {
				if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);			
				}
				
				if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoInventario(this.estadoinventario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoinventarioReturnGeneral=estadoinventarioLogic.procesarEventosEstadoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoinventarioLogic.getEstadoInventarios(),this.estadoinventario,this.estadoinventarioParameterGeneral,this.isEsNuevoEstadoInventario,classes);//this.estadoinventarioLogic.getEstadoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoInventario(this.estadoinventarioReturnGeneral,this.estadoinventarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoInventario(classes,this.estadoinventarioReturnGeneral,this.estadoinventarioBean,false);
					}
						
					if(this.estadoinventarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario());	
					}
						
					if(this.estadoinventarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario(),classes);//this.estadoinventarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoInventario(this.estadoinventario,classes);//this.estadoinventarioBean);									
				}
			
				if(EstadoInventarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoInventario(this.estadoinventario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoInventario(this.estadoinventario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoinventarioAnterior!=null) {
						this.estadoinventario=this.estadoinventarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoinventarioReturnGeneral=estadoinventarioLogic.procesarEventosEstadoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoinventarioLogic.getEstadoInventarios(),this.estadoinventario,this.estadoinventarioParameterGeneral,this.isEsNuevoEstadoInventario,classes);//this.estadoinventarioLogic.getEstadoInventario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoinventarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoinventarioReturnGeneral.getEstadoInventario(),estadoinventarioLogic.getEstadoInventarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoinventarioReturnGeneral.getEstadoInventario(),this.estadoinventarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoInventario.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoInventario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoInventario();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoInventario() throws Exception {
		
		EstadoInventarioModel estadoinventarioModel=(EstadoInventarioModel)this.jTableDatosEstadoInventario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoinventarioModel.estadoinventarios=this.estadoinventarioLogic.getEstadoInventarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoinventarioModel.estadoinventarios=this.estadoinventarios;
		}
		
		
		((EstadoInventarioModel) this.jTableDatosEstadoInventario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoInventario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoinventarioAnterior(),this.estadoinventarioLogic.getEstadoInventarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoinventarioAnterior(),this.estadoinventarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoInventario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoInventario(EstadoInventario estadoinventario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Transferencia.class)) {
					this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.setTransferencias(estadoinventario.getTransferencias());
					this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Compra.class)) {
					this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.setCompras(estadoinventario.getCompras());
					this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoinventario,new Object(),generalEntityParameterGeneral,this.estadoinventarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoInventarioConstantesFunciones.getClassesRelationshipsOfEstadoInventario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoInventarioConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoInventario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoInventario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoInventarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoinventario,new Object(),generalEntityParameterGeneral,this.estadoinventarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoInventario(EstadoInventarioBean estadoinventarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Transferencia.class)) {
					this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.setTransferencias(estadoinventario.getTransferencias());
					this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Compra.class)) {
					this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.setCompras(estadoinventario.getCompras());
					this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoInventario(ArrayList<Classe> classes,EstadoInventarioReturnGeneral estadoinventarioReturnGeneral,EstadoInventarioBean estadoinventarioBean,Boolean conDefault) throws Exception {
		
			this.estadoinventarioBean.setTransferencias(estadoinventarioReturnGeneral.getEstadoInventario().getTransferencias());
			this.estadoinventarioBean.setCompras(estadoinventarioReturnGeneral.getEstadoInventario().getCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoInventario(EstadoInventario estadoinventario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Transferencia.class)) {
					estadoinventario.setTransferencias(this.jInternalFrameDetalleFormEstadoInventario.transferenciaBeanSwingJInternalFrame.transferenciaLogic.getTransferencias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Compra.class)) {
					estadoinventario.setCompras(this.jInternalFrameDetalleFormEstadoInventario.compraBeanSwingJInternalFrame.compraLogic.getCompras());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadoinventario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoInventario = new EstadoInventarioDetalleFormJInternalFrame(jDesktopPane,this.estadoinventarioSessionBean.getConGuardarRelaciones(),this.estadoinventarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.setVisible(false);
		this.jInternalFrameDetalleFormEstadoInventario.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoInventario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoInventario.estadoinventarioLogic=this.estadoinventarioLogic;
		
		this.cargarCombosFrameForeignKeyEstadoInventario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoInventario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoInventario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoInventario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoInventario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoInventario"));
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarEstadoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoInventario"));

		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoInventario"));
					
		this.jInternalFrameDetalleFormEstadoInventario.jMenuItemModificarEstadoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoInventario"));
						
		this.jInternalFrameDetalleFormEstadoInventario.jMenuItemActualizarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoInventario"));
								
		this.jInternalFrameDetalleFormEstadoInventario.jMenuItemEliminarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoInventario"));
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoInventario"));
					
		this.jInternalFrameDetalleFormEstadoInventario.jMenuItemCancelarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoInventario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jMenuItemDetalleCerrarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoInventario"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoInventario"));
		
		
		
		this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoInventario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonidEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtoncodigoEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonnombreEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoInventarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoInventario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoInventario"));
		}
		
		this.jTableDatosEstadoInventario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoInventario"));
		
		this.jTableDatosEstadoInventario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoInventario"));
		
		this.jButtonNuevoEstadoInventario.addActionListener(new ButtonActionListener(this,"NuevoEstadoInventario"));
		
		this.jButtonDuplicarEstadoInventario.addActionListener(new ButtonActionListener(this,"DuplicarEstadoInventario"));
		
		this.jButtonCopiarEstadoInventario.addActionListener(new ButtonActionListener(this,"CopiarEstadoInventario"));
		
		this.jButtonVerFormEstadoInventario.addActionListener(new ButtonActionListener(this,"VerFormEstadoInventario"));
		
		
		this.jButtonNuevoToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoInventario"));
			
		this.jButtonDuplicarToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoInventario"));
			
		this.jMenuItemNuevoEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoInventario"));
			
		this.jMenuItemDuplicarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoInventario"));		
		
		
		this.jButtonNuevoRelacionesEstadoInventario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoInventario"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoInventario"));
			
		this.jMenuItemNuevoRelacionesEstadoInventario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarEstadoInventario.addActionListener(new ButtonActionListener(this,"ModificarEstadoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonModificarToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoInventario"));
			
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemModificarEstadoInventario.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarEstadoInventario.addActionListener (new ButtonActionListener(this,"ActualizarEstadoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonActualizarToolBarEstadoInventario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoInventario"));
				
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemActualizarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarEstadoInventario.addActionListener (new ButtonActionListener(this,"EliminarEstadoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonEliminarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoInventario"));
						
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemEliminarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarEstadoInventario.addActionListener (new ButtonActionListener(this,"CancelarEstadoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonCancelarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoInventario"));
			
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemCancelarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoInventario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoInventario"));		
		
		
		this.jButtonCerrarEstadoInventario.addActionListener (new ButtonActionListener(this,"CerrarEstadoInventario"));
		
		
		this.jButtonCerrarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoInventario"));
			
		this.jMenuItemCerrarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoInventario"));
			
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jMenuItemDetalleCerrarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoInventario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoInventario"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoInventario"));
		}
		
		this.jButtonCopiarToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoInventario"));
			
		this.jButtonVerFormToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoInventario"));
		
		this.jMenuItemGuardarCambiosEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoInventario"));
			
		this.jMenuItemCopiarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoInventario"));		
		
		this.jMenuItemVerFormEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoInventario"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoInventario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoInventario"));
			
		this.jMenuItemGuardarCambiosTablaEstadoInventario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoInventario"));		
		
		
		
		this.jButtonRecargarInformacionEstadoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoInventario"));
					
		this.jButtonRecargarInformacionToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoInventario"));
		
		this.jMenuItemRecargarInformacionEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoInventario"));		
		
		
		
		this.jButtonAnterioresEstadoInventario.addActionListener (new ButtonActionListener(this,"AnterioresEstadoInventario"));
		
		
		this.jButtonAnterioresToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoInventario"));
		
		this.jMenuItemAnterioresEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoInventario"));		
		
		
		this.jButtonSiguientesEstadoInventario.addActionListener (new ButtonActionListener(this,"SiguientesEstadoInventario"));
		
		
		this.jButtonSiguientesToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoInventario"));
			
		this.jMenuItemSiguientesEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoInventario"));
			
		this.jMenuItemAbrirOrderByEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoInventario"));
			
		this.jMenuItemMostrarOcultarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoInventario"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoInventario"));
			
		this.jMenuItemDetalleMostarOcultarEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoInventario"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoInventario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoInventario"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoInventario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoInventario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoInventario"));

		this.jCheckBoxSeleccionadosEstadoInventario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoInventario"));
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoInventario"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoInventario.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoInventario"));
			
		this.jComboBoxTiposAccionesEstadoInventario.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoInventario"));
					
		this.jComboBoxTiposSeleccionarEstadoInventario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoInventario"));
			
		this.jTextFieldValorCampoGeneralEstadoInventario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoInventario"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonidEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtoncodigoEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonnombreEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoInventarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoInventario!=null) {
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoInventario"));
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoInventario"));
				this.jInternalFrameReporteDinamicoEstadoInventario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoInventario"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoInventario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoInventario"));				
			//this.jButtonGenerarReporteDinamicoEstadoInventario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoInventario"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoInventario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoInventario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoInventario!=null) {
				this.jInternalFrameImportacionEstadoInventario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoInventario"));
				this.jInternalFrameImportacionEstadoInventario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoInventario"));
				this.jInternalFrameImportacionEstadoInventario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoInventario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoInventario"));
			
			this.jButtonAbrirOrderByToolBarEstadoInventario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoInventario"));			
			
			if(this.jInternalFrameOrderByEstadoInventario!=null) {
				this.jInternalFrameOrderByEstadoInventario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoInventario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoInventario.jTabbedPaneRelacionesEstadoInventario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoInventario"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameEstadoInventario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoInventario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoInventario = (JInternalFrameBase)event.getSource();
	            	
	            EstadoInventarioBeanSwingJInternalFrame jInternalFrameParent=(EstadoInventarioBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoInventario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoInventarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoInventario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoInventarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoInventario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoInventario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoInventario";
		inputMap = this.jButtonNuevoEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoInventarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoInventarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoInventario";
		inputMap = this.jButtonNuevoRelacionesEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoInventarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoInventario";
		inputMap = this.jButtonModificarEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoInventario";
		inputMap = this.jButtonActualizarEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoInventario";
		inputMap = this.jButtonEliminarEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoInventario";
		inputMap = this.jButtonCancelarEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoInventario";
		inputMap = this.jButtonCerrarEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoInventario";
		inputMap = this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoInventario.jButtonGuardarCambiosEstadoInventario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoInventarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoInventario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoInventarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoInventario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoInventarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonidEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtoncodigoEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoInventarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoInventario.jButtonnombreEstadoInventarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoInventarioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoInventario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoInventarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoInventario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoInventario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
					estadoinventarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoInventario estadoinventarioAux:estadoinventarios) {
					estadoinventarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
						estadoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoInventario estadoinventarioAux:estadoinventarios) {
						estadoinventarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoInventario estadoinventarioAux:estadoinventarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoInventarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoInventario.getSelectedRows();
			
			EstadoInventario estadoinventarioLocal=new EstadoInventario();
			
			//this.seleccionarTodosEstadoInventario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoinventarioLocal =(EstadoInventario) this.estadoinventarioLogic.getEstadoInventarios().toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoinventarioLocal =(EstadoInventario) this.estadoinventarios.toArray()[this.jTableDatosEstadoInventario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoinventarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
						estadoinventarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoInventario estadoinventarioAux:estadoinventarios) {
						estadoinventarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoInventario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoInventario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoInventario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoInventario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoInventarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoInventarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoInventarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoInventario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoInventario estadoinventarioAux:this.estadoinventarioLogic.getEstadoInventarios()) {
				
						if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoInventario estadoinventarioAux:estadoinventarios) {
					
						if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoinventarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoinventarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoInventario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoInventarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoInventario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoInventario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoInventario) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoInventario(conSplash);
				
					this.generarReporteEstadoInventariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoInventariosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoInventariosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoInventario();
				
				this.exportarEstadoInventariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoInventarios();
				//this.importarEstadoInventarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoInventario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoInventariosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoInventario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoInventario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoInventario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoInventarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoInventario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoInventario(conSplash);
					
						//this.actualizarParametrosGeneralEstadoInventario();
						
						this.generarReporteProcesoAccionEstadoInventariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoInventarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado InventarioS SELECCIONADOS?", "MANTENIMIENTO DE Estado Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoInventario();
				
						this.actualizarParametrosGeneralEstadoInventario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoinventarioReturnGeneral=estadoinventarioLogic.procesarAccionEstadoInventariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoinventarioLogic.getEstadoInventarios(),this.estadoinventarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoInventario();
					
					EstadoInventarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoInventarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoInventario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoInventario.jComboBoxTiposAccionesFormularioEstadoInventario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoInventario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoInventarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoInventario();
			
			if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
			EstadoInventario estadoinventario=new EstadoInventario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoInventario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoInventario.getSelectedItem();
			
			
			
			
			estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoinventariosSeleccionados.size()==1) {
				for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
					estadoinventario=estadoinventarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transferencia")) {
					jButtonTransferenciaActionPerformed(null,rowIndex,true,false,estadoinventario);
				}
				else if(this.sTipoRelacion.equals("Compra")) {
					jButtonCompraActionPerformed(null,rowIndex,true,false,estadoinventario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoInventario();
			
      		//this.finishProcessEstadoInventario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoInventarioReturnGeneral() throws Exception {
		if(this.estadoinventarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoinventarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoinventarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoinventarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoinventarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoInventario(false);
		}
		
		if(this.estadoinventarioReturnGeneral.getConRetornoLista() || this.estadoinventarioReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoinventarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoinventarioLogic.setEstadoInventarios(this.estadoinventarioReturnGeneral.getEstadoInventarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoinventarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoinventarioLogic.setEstadoInventario(this.estadoinventarioReturnGeneral.getEstadoInventario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoInventario(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoInventario() throws Exception {
		
		
	}
	
	public ArrayList<EstadoInventario> getEstadoInventariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoInventario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoInventario estadoinventarioAux:estadoinventarioLogic.getEstadoInventarios()) {
					if(estadoinventarioAux.getIsSelected()) {
						estadoinventariosSeleccionados.add(estadoinventarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoInventario estadoinventarioAux:this.estadoinventarios) {
					if(estadoinventarioAux.getIsSelected()) {
						estadoinventariosSeleccionados.add(estadoinventarioAux);				
					}
				}
			}
			
			if(estadoinventariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoinventariosSeleccionados.addAll(this.estadoinventarioLogic.getEstadoInventarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoinventariosSeleccionados.addAll(this.estadoinventarios);				
					}
				}
			}
		} else {
			estadoinventariosSeleccionados.add(this.estadoinventario);
		}
		
		return estadoinventariosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteEstadoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoInventariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoInventariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoInventariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoInventariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoInventariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoInventario();
		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoInventario();
		
		
		//this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados ,estadoinventarioImplementable,estadoinventarioImplementableHome);
	}
	
	public void mostrarImportacionEstadoInventarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoInventario();
		
		this.abrirFrameImportacionEstadoInventario();		
		
			
		//this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados ,estadoinventarioImplementable,estadoinventarioImplementableHome);
	}
	
	public void importarEstadoInventarios() throws Exception {		
	
	}
	
	public void exportarEstadoInventariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoInventariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoInventariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoInventariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoInventario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoInventario(estadoinventarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoinventarioAux.setsDetalleGeneralEntityReporte(estadoinventarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoInventario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoInventarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoInventarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoInventarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoInventarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoInventario(EstadoInventario estadoinventario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoinventario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoinventario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoinventario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoinventario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoInventarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoInventario(row);				
				iRow++;
			}				
			
			for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoInventario(estadoinventarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoInventariosSeleccionados() throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();		
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoinventario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoinventarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoinventario");
			//elementRoot.appendChild(element);
		
			for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
				element = document.createElement("estadoinventario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoInventario(estadoinventarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoInventario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoInventarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoInventario(EstadoInventario estadoinventario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoinventario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoinventario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoinventario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoInventario(EstadoInventario estadoinventario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoInventarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoinventario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoInventarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoinventario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoInventarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoinventario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoInventarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoinventario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoInventariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoInventario> estadoinventariosSeleccionados=new ArrayList<EstadoInventario>();
		
		estadoinventariosSeleccionados=this.getEstadoInventariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoInventario(estadoinventariosSeleccionados);
		
		this.generarReporteEstadoInventarios("Todos",estadoinventariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoInventario(ArrayList<EstadoInventario> estadoinventariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoInventario estadoinventarioAux:estadoinventariosSeleccionados) {
				estadoinventarioAux.setsDetalleGeneralEntityReporte(estadoinventarioAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoinventarioAux.setsDescripcionGeneralEntityReporte1(estadoinventarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoInventarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoinventarioAux.setsDescripcionGeneralEntityReporte1(estadoinventarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoInventarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoInventario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoInventario=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoInventario=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoInventario=true;
			this.isVisibilidadCeldaCancelarEstadoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=true;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=true;
			this.isVisibilidadCeldaModificarEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
			this.isVisibilidadCeldaModificarEstadoInventario=true;
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
			this.isVisibilidadCeldaCancelarEstadoInventario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoInventario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoInventario=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=true;
		} else {
			this.actualizarEstadoPanelsEstadoInventario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoInventario=false;
			//this.isVisibilidadCeldaVerFormEstadoInventario=false;
			this.isVisibilidadCeldaDuplicarEstadoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoinventarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoInventario=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			if(!estadoinventarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;												
			}
			
			this.jButtonCerrarEstadoInventario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoInventario=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoinventario)) {
			this.isVisibilidadCeldaActualizarEstadoInventario=false;
			this.isVisibilidadCeldaEliminarEstadoInventario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoInventario() {
		this.isVisibilidadCeldaNuevoEstadoInventario=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoInventario=false;
	}
	
	public void actualizarEstadoPanelsEstadoInventario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoInventario!=null) {
				this.jScrollPanelDatosEdicionEstadoInventario.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoInventario!=null) {
				this.jScrollPanelDatosEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoInventario!=null) {
				this.jPanelPaginacionEstadoInventario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoInventario!=null) {
				this.jPanelParametrosReportesEstadoInventario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoInventarioParaTransferencias() throws Exception {
		Boolean isPaginaPopupTransferencia=false;

		try {

			if(this.estadoinventarioSessionBean==null) {
				this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean=new TransferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setsPathNavegacionActual(estadoinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransferencia=this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransferencia(true);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransferencia(EstadoInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoInventario(true);
			this.jInternalFrameDetalleFormEstadoInventario.transferenciaSessionBean.setlidEstadoInventarioActual(this.idEstadoInventarioActual);

			estadoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoInventario(true);
			estadoinventarioSessionBean.setlIdEstadoInventarioActualForeignKey(this.idEstadoInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoInventarioParaCompras() throws Exception {
		Boolean isPaginaPopupCompra=false;

		try {

			if(this.estadoinventarioSessionBean==null) {
				this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean=new CompraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setsPathNavegacionActual(estadoinventarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCompra=this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCompra(true);
			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCompra(EstadoInventarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoInventario(true);
			this.jInternalFrameDetalleFormEstadoInventario.compraSessionBean.setlidEstadoInventarioActual(this.idEstadoInventarioActual);

			estadoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoInventario(true);
			estadoinventarioSessionBean.setlIdEstadoInventarioActualForeignKey(this.idEstadoInventarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoInventarioSessionBean estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		
		if(this.estadoinventarioSessionBean==null) {
			this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		}
		
		this.estadoinventarioSessionBean.setsUltimaBusquedaEstadoInventario(this.getsAccionBusqueda());
		this.estadoinventarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoinventarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoInventarioSessionBean estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		
		if(this.estadoinventarioSessionBean==null) {
			this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		}
		
		if(this.estadoinventarioSessionBean.getsUltimaBusquedaEstadoInventario()!=null&&!this.estadoinventarioSessionBean.getsUltimaBusquedaEstadoInventario().equals("")) {
			this.setsAccionBusqueda(estadoinventarioSessionBean.getsUltimaBusquedaEstadoInventario());
			this.setiNumeroPaginacion(estadoinventarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoinventarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoinventarioSessionBean.setsUltimaBusquedaEstadoInventario("");
		this.estadoinventarioSessionBean.setiNumeroPaginacion(EstadoInventarioConstantesFunciones.INUMEROPAGINACION);
		this.estadoinventarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoInventario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoInventario() {
		this.updateBorderResaltarBusquedasFormularioEstadoInventario();
		this.updateVisibilidadBusquedasFormularioEstadoInventario();
		this.updateHabilitarBusquedasFormularioEstadoInventario();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoInventario() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoInventario() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoInventario() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioEstadoInventario() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoInventario();
		this.updateVisibilidadResaltarControlesFormularioEstadoInventario();
		this.updateHabilitarResaltarControlesFormularioEstadoInventario();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoinventarioConstantesFunciones.resaltaridEstadoInventario!=null && this.jInternalFrameDetalleFormEstadoInventario!=null) {this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setBorder(this.estadoinventarioConstantesFunciones.resaltaridEstadoInventario);}
		if(this.estadoinventarioConstantesFunciones.resaltarcodigoEstadoInventario!=null && this.jInternalFrameDetalleFormEstadoInventario!=null) {this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setBorder(this.estadoinventarioConstantesFunciones.resaltarcodigoEstadoInventario);}
		if(this.estadoinventarioConstantesFunciones.resaltarnombreEstadoInventario!=null && this.jInternalFrameDetalleFormEstadoInventario!=null) {this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setBorder(this.estadoinventarioConstantesFunciones.resaltarnombreEstadoInventario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoInventario() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
	
		//this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostraridEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jPanelidEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostraridEstadoInventario);
		//this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostrarcodigoEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jPanelcodigoEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostrarcodigoEstadoInventario);
		//this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostrarnombreEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jPanelnombreEstadoInventario.setVisible(this.estadoinventarioConstantesFunciones.mostrarnombreEstadoInventario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoInventario() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoInventario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoInventario!=null) {
	
		this.jInternalFrameDetalleFormEstadoInventario.jTextFieldidEstadoInventario.setEnabled(this.estadoinventarioConstantesFunciones.activaridEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jTextFieldcodigoEstadoInventario.setEnabled(this.estadoinventarioConstantesFunciones.activarcodigoEstadoInventario);
		this.jInternalFrameDetalleFormEstadoInventario.jTextAreanombreEstadoInventario.setEnabled(this.estadoinventarioConstantesFunciones.activarnombreEstadoInventario);
		}
	}
	
		
}