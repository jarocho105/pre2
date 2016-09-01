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

//import com.bydan.erp.inventario.util.ConsumosBodegasConstantesFunciones;
import com.bydan.erp.inventario.util.report.ConsumosBodegasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ConsumosBodegasParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ConsumosBodegasBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConsumosBodegasBeanSwingJInternalFrame extends ConsumosBodegasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConsumosBodegasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConsumosBodegas> consumosbodegasValidator = new ClassValidator<ConsumosBodegas>(ConsumosBodegas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConsumosBodegas consumosbodegas;	
	public ConsumosBodegas consumosbodegasAux;
	public ConsumosBodegas consumosbodegasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConsumosBodegas consumosbodegasTotales;
	public Long idConsumosBodegasActual;
	public Long iIdNuevoConsumosBodegas=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoConsumosBodegas;
	public Boolean isPermisoNuevoConsumosBodegas;
	public Boolean isPermisoActualizarConsumosBodegas;
	public Boolean isPermisoActualizarOriginalConsumosBodegas;
	public Boolean isPermisoEliminarConsumosBodegas;
	public Boolean isPermisoGuardarCambiosConsumosBodegas;
	public Boolean isPermisoConsultaConsumosBodegas;
	public Boolean isPermisoBusquedaConsumosBodegas;
	public Boolean isPermisoReporteConsumosBodegas;
	public Boolean isPermisoPaginacionMedioConsumosBodegas;
	public Boolean isPermisoPaginacionAltoConsumosBodegas;
	public Boolean isPermisoPaginacionTodoConsumosBodegas;
	public Boolean isPermisoCopiarConsumosBodegas;
	public Boolean isPermisoVerFormConsumosBodegas;
	public Boolean isPermisoDuplicarConsumosBodegas;
	public Boolean isPermisoOrdenConsumosBodegas;
	
	
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
	
	public ConsumosBodegasParameterReturnGeneral consumosbodegasReturnGeneral;
	public ConsumosBodegasParameterReturnGeneral consumosbodegasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConsumosBodegas=false;
	public Boolean esParaAccionDesdeFormularioConsumosBodegas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConsumosBodegasSessionBeanAdditional consumosbodegasSessionBeanAdditional=null;
	
	public ConsumosBodegasSessionBeanAdditional getConsumosBodegasSessionBeanAdditional() {
		return this.consumosbodegasSessionBeanAdditional;
	}
	
	public void setConsumosBodegasSessionBeanAdditional(ConsumosBodegasSessionBeanAdditional consumosbodegasSessionBeanAdditional) {
		try {
			this.consumosbodegasSessionBeanAdditional=consumosbodegasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConsumosBodegasBeanSwingJInternalFrameAdditional consumosbodegasBeanSwingJInternalFrameAdditional=null;
	//public class ConsumosBodegasBeanSwingJInternalFrame
	
	public ConsumosBodegasBeanSwingJInternalFrameAdditional getConsumosBodegasBeanSwingJInternalFrameAdditional() {
		return this.consumosbodegasBeanSwingJInternalFrameAdditional;
	}
	
	public void setConsumosBodegasBeanSwingJInternalFrameAdditional(ConsumosBodegasBeanSwingJInternalFrameAdditional consumosbodegasBeanSwingJInternalFrameAdditional) {
		try {
			this.consumosbodegasBeanSwingJInternalFrameAdditional=consumosbodegasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConsumosBodegasLogic consumosbodegasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConsumosBodegas consumosbodegasBean;
	public ConsumosBodegasConstantesFunciones consumosbodegasConstantesFunciones;
	//public ConsumosBodegasParameterReturnGeneral consumosbodegasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccionLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ConsumosBodegas> consumosbodegass;	
	//public List<ConsumosBodegas> consumosbodegassEliminados;
	//public List<ConsumosBodegas> consumosbodegassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConsumosBodegas=false;
	public Boolean isVisibilidadCeldaDuplicarConsumosBodegas=true;
	public Boolean isVisibilidadCeldaCopiarConsumosBodegas=true;
	public Boolean isVisibilidadCeldaVerFormConsumosBodegas=true;
	public Boolean isVisibilidadCeldaOrdenConsumosBodegas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
	public Boolean isVisibilidadCeldaModificarConsumosBodegas=false;
	public Boolean isVisibilidadCeldaActualizarConsumosBodegas=false;
	public Boolean isVisibilidadCeldaEliminarConsumosBodegas=false;
	public Boolean isVisibilidadCeldaCancelarConsumosBodegas=false;
	public Boolean isVisibilidadCeldaGuardarConsumosBodegas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;	
	
	
	public Boolean isVisibilidadBusquedaConsumosBodegas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoConsumosBodegas() {
		return this.iIdNuevoConsumosBodegas;
	}

	public void setiIdNuevoConsumosBodegas(Long iIdNuevoConsumosBodegas) {
		this.iIdNuevoConsumosBodegas = iIdNuevoConsumosBodegas;
	}
	
	public Long getidConsumosBodegasActual() {
		return this.idConsumosBodegasActual;
	}

	public void setidConsumosBodegasActual(Long idConsumosBodegasActual) {
		this.idConsumosBodegasActual = idConsumosBodegasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConsumosBodegas getconsumosbodegas() {
		return this.consumosbodegas;
	}

	public void setconsumosbodegas(ConsumosBodegas consumosbodegas) {
		this.consumosbodegas = consumosbodegas;
	}
	
	public ConsumosBodegas getconsumosbodegasAux() {
		return this.consumosbodegasAux;
	}

	public void setconsumosbodegasAux(ConsumosBodegas consumosbodegasAux) {
		this.consumosbodegasAux = consumosbodegasAux;
	}				
	
	public ConsumosBodegas getconsumosbodegasAnterior() {
		return this.consumosbodegasAnterior;
	}

	public void setconsumosbodegasAnterior(ConsumosBodegas consumosbodegasAnterior) {
		this.consumosbodegasAnterior = consumosbodegasAnterior;
	}	
	
	public ConsumosBodegas getconsumosbodegasTotales() {
		return this.consumosbodegasTotales;
	}

	public void setconsumosbodegasTotales(ConsumosBodegas consumosbodegasTotales) {
		this.consumosbodegasTotales = consumosbodegasTotales;
	}	
	
	public ConsumosBodegas getconsumosbodegasBean() {
		return this.consumosbodegasBean;
	}

	public void setconsumosbodegasBean(ConsumosBodegas consumosbodegasBean) {
		this.consumosbodegasBean = consumosbodegasBean;
	}	
	
	public ConsumosBodegasParameterReturnGeneral getconsumosbodegasReturnGeneral() {
		return this.consumosbodegasReturnGeneral;
	}

	public void setconsumosbodegasReturnGeneral(ConsumosBodegasParameterReturnGeneral consumosbodegasReturnGeneral) {
		this.consumosbodegasReturnGeneral = consumosbodegasReturnGeneral;
	}	
	
	
	public Long id_transaccionBusquedaConsumosBodegas=-1L;

	public Long getid_transaccionBusquedaConsumosBodegas() {
		return this.id_transaccionBusquedaConsumosBodegas;
	}

	public void setid_transaccionBusquedaConsumosBodegas(Long id_transaccionBusquedaConsumosBodegas) {
		this.id_transaccionBusquedaConsumosBodegas = id_transaccionBusquedaConsumosBodegas;
	}

;
	public Long id_lineaBusquedaConsumosBodegas=-1L;

	public Long getid_lineaBusquedaConsumosBodegas() {
		return this.id_lineaBusquedaConsumosBodegas;
	}

	public void setid_lineaBusquedaConsumosBodegas(Long id_lineaBusquedaConsumosBodegas) {
		this.id_lineaBusquedaConsumosBodegas = id_lineaBusquedaConsumosBodegas;
	}

;
	public Long id_linea_grupoBusquedaConsumosBodegas=-1L;

	public Long getid_linea_grupoBusquedaConsumosBodegas() {
		return this.id_linea_grupoBusquedaConsumosBodegas;
	}

	public void setid_linea_grupoBusquedaConsumosBodegas(Long id_linea_grupoBusquedaConsumosBodegas) {
		this.id_linea_grupoBusquedaConsumosBodegas = id_linea_grupoBusquedaConsumosBodegas;
	}

;
	public Long id_linea_categoriaBusquedaConsumosBodegas=-1L;

	public Long getid_linea_categoriaBusquedaConsumosBodegas() {
		return this.id_linea_categoriaBusquedaConsumosBodegas;
	}

	public void setid_linea_categoriaBusquedaConsumosBodegas(Long id_linea_categoriaBusquedaConsumosBodegas) {
		this.id_linea_categoriaBusquedaConsumosBodegas = id_linea_categoriaBusquedaConsumosBodegas;
	}

;
	public Long id_linea_marcaBusquedaConsumosBodegas=-1L;

	public Long getid_linea_marcaBusquedaConsumosBodegas() {
		return this.id_linea_marcaBusquedaConsumosBodegas;
	}

	public void setid_linea_marcaBusquedaConsumosBodegas(Long id_linea_marcaBusquedaConsumosBodegas) {
		this.id_linea_marcaBusquedaConsumosBodegas = id_linea_marcaBusquedaConsumosBodegas;
	}

;
	public Date fecha_emision_desdeBusquedaConsumosBodegas=new Date();

	public Date getfecha_emision_desdeBusquedaConsumosBodegas() {
		return this.fecha_emision_desdeBusquedaConsumosBodegas;
	}

	public void setfecha_emision_desdeBusquedaConsumosBodegas(Date fecha_emision_desdeBusquedaConsumosBodegas) {
		this.fecha_emision_desdeBusquedaConsumosBodegas = fecha_emision_desdeBusquedaConsumosBodegas;
	}

;
	public Date fecha_emision_hastaBusquedaConsumosBodegas=new Date();

	public Date getfecha_emision_hastaBusquedaConsumosBodegas() {
		return this.fecha_emision_hastaBusquedaConsumosBodegas;
	}

	public void setfecha_emision_hastaBusquedaConsumosBodegas(Date fecha_emision_hastaBusquedaConsumosBodegas) {
		this.fecha_emision_hastaBusquedaConsumosBodegas = fecha_emision_hastaBusquedaConsumosBodegas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConsumosBodegasLogic getConsumosBodegasLogic()	{		
		return consumosbodegasLogic;
	}

	public void setConsumosBodegasLogic(ConsumosBodegasLogic consumosbodegasLogic) {
		this.consumosbodegasLogic = consumosbodegasLogic;
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
	
	public Boolean getIsEsNuevoConsumosBodegas() {
		return isEsNuevoConsumosBodegas;
	}

	public void setIsEsNuevoConsumosBodegas(Boolean isEsNuevoConsumosBodegas) {
		this.isEsNuevoConsumosBodegas = isEsNuevoConsumosBodegas;
	}

	public Boolean getEsParaAccionDesdeFormularioConsumosBodegas() {
		return esParaAccionDesdeFormularioConsumosBodegas;
	}
	
	public void setEsParaAccionDesdeFormularioConsumosBodegas(Boolean esParaAccionDesdeFormularioConsumosBodegas) {
		this.esParaAccionDesdeFormularioConsumosBodegas = esParaAccionDesdeFormularioConsumosBodegas;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(consumosbodegasSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConsumosBodegas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaConsumosBodegasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConsumosBodegasGenerico!=null && jComboBoxid_empresaConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_empresaConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionConsumosBodegas.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas!=null) {
						jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas!=null) {
							//jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionConsumosBodegasGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionConsumosBodegasGenerico!=null && jComboBoxid_transaccionConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_transaccionConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaConsumosBodegas.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas!=null) {
						jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas!=null) {
							//jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.getItemCount()>0) {
								jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaConsumosBodegasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaConsumosBodegasGenerico!=null && jComboBoxid_lineaConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_lineaConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoConsumosBodegas.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas!=null) {
						jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas!=null) {
							//jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoConsumosBodegasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoConsumosBodegasGenerico!=null && jComboBoxid_linea_grupoConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaConsumosBodegas.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas!=null) {
						jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas!=null) {
							//jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaConsumosBodegasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaConsumosBodegasGenerico!=null && jComboBoxid_linea_categoriaConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.consumosbodegas!=null) {
						this.consumosbodegas.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaConsumosBodegas.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
						if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.getItemCount()>0) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas!=null) {
						jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas!=null) {
							//jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaConsumosBodegasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaConsumosBodegasGenerico!=null && jComboBoxid_linea_marcaConsumosBodegasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaConsumosBodegasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_empresaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConsumosBodegasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConsumosBodegasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				consumosbodegas.setid_empresa(empresaAux.getId());
				consumosbodegas.setempresa_descripcion(ConsumosBodegasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				consumosbodegas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_transaccionConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionConsumosBodegasGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionConsumosBodegasGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				consumosbodegas.setid_transaccion(transaccionAux.getId());
				consumosbodegas.settransaccion_descripcion(ConsumosBodegasConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				consumosbodegas.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_lineaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaConsumosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaConsumosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosbodegas.setid_linea(lineaAux.getId());
				consumosbodegas.setlinea_descripcion(ConsumosBodegasConstantesFunciones.getLineaDescripcion(lineaAux));
				consumosbodegas.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_linea_grupoConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoConsumosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoConsumosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosbodegas.setid_linea_grupo(lineaAux.getId());
				consumosbodegas.setlineagrupo_descripcion(ConsumosBodegasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				consumosbodegas.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_linea_categoriaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaConsumosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaConsumosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosbodegas.setid_linea_categoria(lineaAux.getId());
				consumosbodegas.setlineacategoria_descripcion(ConsumosBodegasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				consumosbodegas.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ConsumosBodegas consumosbodegas,JComboBox jComboBoxid_linea_marcaConsumosBodegasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaConsumosBodegasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaConsumosBodegasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				consumosbodegas.setid_linea_marca(lineaAux.getId());
				consumosbodegas.setlineamarca_descripcion(ConsumosBodegasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				consumosbodegas.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.addItem(transaccion);
							}
						}

						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.addItem(linea);
							}
						}

						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.addItem(lineagrupo);
							}
						}

						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.addItem(lineacategoria);
							}
						}

						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { 
					}

					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConsumosBodegas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.addItem(lineamarca);
							}
						}

						if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConsumosBodegas() throws Exception {
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
		
	public ConsumosBodegasParameterReturnGeneral getConsumosBodegasParameterGeneral() {
		return this.consumosbodegasParameterGeneral;
	}
	
	public void setConsumosBodegasParameterGeneral(ConsumosBodegasParameterReturnGeneral consumosbodegasParameterGeneral) {
		this.consumosbodegasParameterGeneral = consumosbodegasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConsumosBodegas() {
		return isPermisoTodoConsumosBodegas;
	}

	public void setIsPermisoTodoConsumosBodegas(Boolean isPermisoTodoConsumosBodegas) {
		this.isPermisoTodoConsumosBodegas = isPermisoTodoConsumosBodegas;
	}

	public Boolean getIsPermisoNuevoConsumosBodegas() {
		return isPermisoNuevoConsumosBodegas;
	}

	public void setIsPermisoNuevoConsumosBodegas(Boolean isPermisoNuevoConsumosBodegas) {
		this.isPermisoNuevoConsumosBodegas = isPermisoNuevoConsumosBodegas;
	}

	public Boolean getIsPermisoActualizarConsumosBodegas() {
		return isPermisoActualizarConsumosBodegas;
	}

	public void setIsPermisoActualizarConsumosBodegas(Boolean isPermisoActualizarConsumosBodegas) {
		this.isPermisoActualizarConsumosBodegas = isPermisoActualizarConsumosBodegas;
	}

	public Boolean getIsPermisoEliminarConsumosBodegas() {
		return isPermisoEliminarConsumosBodegas;
	}

	public void setIsPermisoEliminarConsumosBodegas(Boolean isPermisoEliminarConsumosBodegas) {
		this.isPermisoEliminarConsumosBodegas = isPermisoEliminarConsumosBodegas;
	}

	public Boolean getIsPermisoGuardarCambiosConsumosBodegas() {
		return isPermisoGuardarCambiosConsumosBodegas;
	}

	public void setIsPermisoGuardarCambiosConsumosBodegas(Boolean isPermisoGuardarCambiosConsumosBodegas) {
		this.isPermisoGuardarCambiosConsumosBodegas = isPermisoGuardarCambiosConsumosBodegas;
	}
	
	public Boolean getIsPermisoConsultaConsumosBodegas() {
		return isPermisoConsultaConsumosBodegas;
	}

	public void setIsPermisoConsultaConsumosBodegas(Boolean isPermisoConsultaConsumosBodegas) {
		this.isPermisoConsultaConsumosBodegas = isPermisoConsultaConsumosBodegas;
	}

	public Boolean getIsPermisoBusquedaConsumosBodegas() {
		return isPermisoBusquedaConsumosBodegas;
	}

	public void setIsPermisoBusquedaConsumosBodegas(Boolean isPermisoBusquedaConsumosBodegas) {
		this.isPermisoBusquedaConsumosBodegas = isPermisoBusquedaConsumosBodegas;
	}

	public Boolean getIsPermisoReporteConsumosBodegas() {
		return isPermisoReporteConsumosBodegas;
	}

	public void setIsPermisoReporteConsumosBodegas(Boolean isPermisoReporteConsumosBodegas) {
		this.isPermisoReporteConsumosBodegas = isPermisoReporteConsumosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionMedioConsumosBodegas() {
		return isPermisoPaginacionMedioConsumosBodegas;
	}

	public void setIsPermisoPaginacionMedioConsumosBodegas(Boolean isPermisoPaginacionMedioConsumosBodegas) {
		this.isPermisoPaginacionMedioConsumosBodegas = isPermisoPaginacionMedioConsumosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionTodoConsumosBodegas() {
		return isPermisoPaginacionTodoConsumosBodegas;
	}

	public void setIsPermisoPaginacionTodoConsumosBodegas(Boolean isPermisoPaginacionTodoConsumosBodegas) {
		this.isPermisoPaginacionTodoConsumosBodegas = isPermisoPaginacionTodoConsumosBodegas;
	}
	
	public Boolean getIsPermisoPaginacionAltoConsumosBodegas() {
		return isPermisoPaginacionAltoConsumosBodegas;
	}

	public void setIsPermisoPaginacionAltoConsumosBodegas(Boolean isPermisoPaginacionAltoConsumosBodegas) {
		this.isPermisoPaginacionAltoConsumosBodegas = isPermisoPaginacionAltoConsumosBodegas;
	}
	
	public Boolean getIsPermisoCopiarConsumosBodegas() {
		return isPermisoCopiarConsumosBodegas;
	}

	public void setIsPermisoCopiarConsumosBodegas(Boolean isPermisoCopiarConsumosBodegas) {
		this.isPermisoCopiarConsumosBodegas = isPermisoCopiarConsumosBodegas;
	}
	
	public Boolean getIsPermisoVerFormConsumosBodegas() {
		return isPermisoVerFormConsumosBodegas;
	}

	public void setIsPermisoVerFormConsumosBodegas(Boolean isPermisoVerFormConsumosBodegas) {
		this.isPermisoVerFormConsumosBodegas = isPermisoVerFormConsumosBodegas;
	}
	
	public Boolean getIsPermisoDuplicarConsumosBodegas() {
		return isPermisoDuplicarConsumosBodegas;
	}

	public void setIsPermisoDuplicarConsumosBodegas(Boolean isPermisoDuplicarConsumosBodegas) {
		this.isPermisoDuplicarConsumosBodegas = isPermisoDuplicarConsumosBodegas;
	}
	
	public Boolean getIsPermisoOrdenConsumosBodegas() {
		return isPermisoOrdenConsumosBodegas;
	}

	public void setIsPermisoOrdenConsumosBodegas(Boolean isPermisoOrdenConsumosBodegas) {
		this.isPermisoOrdenConsumosBodegas = isPermisoOrdenConsumosBodegas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConsumosBodegas() {
		return isVisibilidadCeldaNuevoConsumosBodegas;
	}

	public void setIsVisibilidadCeldaNuevoConsumosBodegas(Boolean isVisibilidadCeldaNuevoConsumosBodegas) {
		this.isVisibilidadCeldaNuevoConsumosBodegas = isVisibilidadCeldaNuevoConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConsumosBodegas() {
		return isVisibilidadCeldaDuplicarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaDuplicarConsumosBodegas(Boolean isVisibilidadCeldaDuplicarConsumosBodegas) {
		this.isVisibilidadCeldaDuplicarConsumosBodegas = isVisibilidadCeldaDuplicarConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConsumosBodegas() {
		return isVisibilidadCeldaCopiarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaCopiarConsumosBodegas(Boolean isVisibilidadCeldaCopiarConsumosBodegas) {
		this.isVisibilidadCeldaCopiarConsumosBodegas = isVisibilidadCeldaCopiarConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConsumosBodegas() {
		return isVisibilidadCeldaVerFormConsumosBodegas;
	}

	public void setIsVisibilidadCeldaVerFormConsumosBodegas(Boolean isVisibilidadCeldaVerFormConsumosBodegas) {
		this.isVisibilidadCeldaVerFormConsumosBodegas = isVisibilidadCeldaVerFormConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConsumosBodegas() {
		return isVisibilidadCeldaOrdenConsumosBodegas;
	}

	public void setIsVisibilidadCeldaOrdenConsumosBodegas(Boolean isVisibilidadCeldaOrdenConsumosBodegas) {
		this.isVisibilidadCeldaOrdenConsumosBodegas = isVisibilidadCeldaOrdenConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConsumosBodegas() {
		return isVisibilidadCeldaNuevoRelacionesConsumosBodegas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConsumosBodegas(Boolean isVisibilidadCeldaNuevoRelacionesConsumosBodegas) {
		this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas = isVisibilidadCeldaNuevoRelacionesConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConsumosBodegas() {
		return isVisibilidadCeldaModificarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaModificarConsumosBodegas(Boolean isVisibilidadCeldaModificarConsumosBodegas) {
		this.isVisibilidadCeldaModificarConsumosBodegas = isVisibilidadCeldaModificarConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConsumosBodegas() {
		return isVisibilidadCeldaActualizarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaActualizarConsumosBodegas(Boolean isVisibilidadCeldaActualizarConsumosBodegas) {
		this.isVisibilidadCeldaActualizarConsumosBodegas = isVisibilidadCeldaActualizarConsumosBodegas;
	}

	public Boolean getIsVisibilidadCeldaEliminarConsumosBodegas() {
		return isVisibilidadCeldaEliminarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaEliminarConsumosBodegas(Boolean isVisibilidadCeldaEliminarConsumosBodegas) {
		this.isVisibilidadCeldaEliminarConsumosBodegas = isVisibilidadCeldaEliminarConsumosBodegas;
	}

	public Boolean getIsVisibilidadCeldaCancelarConsumosBodegas() {
		return isVisibilidadCeldaCancelarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaCancelarConsumosBodegas(Boolean isVisibilidadCeldaCancelarConsumosBodegas) {
		this.isVisibilidadCeldaCancelarConsumosBodegas = isVisibilidadCeldaCancelarConsumosBodegas;
	}

	public Boolean getIsVisibilidadCeldaGuardarConsumosBodegas() {
		return isVisibilidadCeldaGuardarConsumosBodegas;
	}

	public void setIsVisibilidadCeldaGuardarConsumosBodegas(Boolean isVisibilidadCeldaGuardarConsumosBodegas) {
		this.isVisibilidadCeldaGuardarConsumosBodegas = isVisibilidadCeldaGuardarConsumosBodegas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConsumosBodegas() {
		return isVisibilidadCeldaGuardarCambiosConsumosBodegas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConsumosBodegas(Boolean isVisibilidadCeldaGuardarCambiosConsumosBodegas) {
		this.isVisibilidadCeldaGuardarCambiosConsumosBodegas = isVisibilidadCeldaGuardarCambiosConsumosBodegas;
	}
		
	public ConsumosBodegasSessionBean getconsumosbodegasSessionBean() {
		return this.consumosbodegasSessionBean;
	}
	
	public void setconsumosbodegasSessionBean(ConsumosBodegasSessionBean consumosbodegasSessionBean) {
		this.consumosbodegasSessionBean=consumosbodegasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConsumosBodegas() {
		return this.isVisibilidadBusquedaConsumosBodegas;
	}

	public void setisVisibilidadBusquedaConsumosBodegas(Boolean isVisibilidadBusquedaConsumosBodegas) {
		this.isVisibilidadBusquedaConsumosBodegas=isVisibilidadBusquedaConsumosBodegas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(ConsumosBodegas consumosbodegas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(consumosbodegas,null);
				this.setActualParaGuardarTransaccionForeignKey(consumosbodegas,null);
				this.setActualParaGuardarLineaForeignKey(consumosbodegas,null);
				this.setActualParaGuardarLineaGrupoForeignKey(consumosbodegas,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(consumosbodegas,null);
				this.setActualParaGuardarLineaMarcaForeignKey(consumosbodegas,null);
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
	
	public void bugActualizarReferenciaActual(ConsumosBodegas consumosbodegas,ConsumosBodegas consumosbodegasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConsumosBodegas(consumosbodegas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		consumosbodegasAux.setId(consumosbodegas.getId());
		consumosbodegasAux.setVersionRow(consumosbodegas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConsumosBodegas consumosbodegasLocal) throws Exception {
		
		if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConsumosBodegas consumosbodegasLocal) throws Exception {	
		if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				consumosbodegasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				consumosbodegasLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				consumosbodegasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				consumosbodegasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				consumosbodegasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				consumosbodegasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConsumosBodegasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = consumosbodegasValidator.getInvalidValues(this.consumosbodegas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConsumosBodegas consumosbodegas,List<ConsumosBodegas> consumosbodegass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConsumosBodegas consumosbodegas,List<ConsumosBodegas> consumosbodegass) throws Exception {
		try	{			
			ConsumosBodegasConstantesFunciones.actualizarSelectedLista(consumosbodegas,consumosbodegass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConsumosBodegas> consumosbodegassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				consumosbodegassLocal=this.consumosbodegasLogic.getConsumosBodegass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				consumosbodegassLocal=this.consumosbodegass;
			}
			//ARCHITECTURE
		
			for(ConsumosBodegas consumosbodegasLocal:consumosbodegassLocal) {
				if(this.permiteMantenimiento(consumosbodegasLocal) && consumosbodegasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConsumosBodegasConstantesFunciones.getConsumosBodegasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_productoConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_unidadConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcantidadConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcosto_totalConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_lineaConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_grupoConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_categoriaConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_marcaConsumosBodegas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConsumosBodegasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcodigoConsumosBodegas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_productoConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_unidadConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcantidadConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcosto_totalConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_lineaConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_grupoConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_categoriaConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_marcaConsumosBodegas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcodigoConsumosBodegas,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoConsumosBodegas--;	
		
		
		this.consumosbodegasAux=new ConsumosBodegas();
		
		this.consumosbodegasAux.setId(this.iIdNuevoConsumosBodegas);
		this.consumosbodegasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.consumosbodegasLogic.getConsumosBodegass().add(this.consumosbodegasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.consumosbodegass.add(this.consumosbodegasAux);
		}
		//ARCHITECTURE
		
		this.consumosbodegas=this.consumosbodegasAux;
		
		if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConsumosBodegas(this.consumosbodegas);
			this.setVariablesObjetoActualToFormularioForeignKeyConsumosBodegas(this.consumosbodegas);
		}
				
		//this.setDefaultControlesConsumosBodegas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConsumosBodegas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConsumosBodegas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosBodegas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsumosBodegas(this.consumosbodegasBean,this.consumosbodegas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConsumosBodegas(this.consumosbodegasReturnGeneral,this.consumosbodegasBean,false);
		
		if(this.consumosbodegasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas());
		}
		
		if(this.consumosbodegasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas(),classes);//this.consumosbodegasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConsumosBodegas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConsumosBodegas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.RecargarFormConsumosBodegas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConsumosBodegas(false);
						
			if(consumosbodegasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosBodegas();
			}
			
			this.actualizarVisualTableDatosConsumosBodegas();
			
			this.jTableDatosConsumosBodegas.setRowSelectionInterval(this.getIndiceNuevoConsumosBodegas(), this.getIndiceNuevoConsumosBodegas());
			
			this.seleccionarFilaTablaConsumosBodegasActual();
						
			this.actualizarEstadoCeldasBotonesConsumosBodegas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConsumosBodegas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_desdeConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarfecha_emision_desdeConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_hastaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarfecha_emision_hastaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_productoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_unidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarcantidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarcosto_totalConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarnombre_linea_marcaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarcodigoConsumosBodegas);	
		//
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_empresaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_transaccionConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setEnabled(isHabilitar && this.consumosbodegasConstantesFunciones.activarid_linea_marcaConsumosBodegas);
	};
	
	public void setDefaultControlesConsumosBodegas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConsumosBodegas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.consumosbodegasSessionBean.setConGuardarRelaciones(true);			
			this.consumosbodegasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.setVisible(true);
			
					
		} else {
			//this.consumosbodegasSessionBean.setConGuardarRelaciones(false);			
			this.consumosbodegasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConsumosBodegas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
				if(consumosbodegasAux.getId().equals(this.iIdNuevoConsumosBodegas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegass) {
				if(consumosbodegasAux.getId().equals(this.iIdNuevoConsumosBodegas)) {
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
	
	public int getIndiceActualConsumosBodegas(ConsumosBodegas consumosbodegas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
				if(consumosbodegasAux.getId().equals(consumosbodegas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegass) {
				if(consumosbodegasAux.getId().equals(consumosbodegas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConsumosBodegas(ConsumosBodegas consumosbodegasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
				if(consumosbodegasAux.getConsumosBodegasOriginal().getId().equals(consumosbodegasOriginal.getId())) {
					existe=true;
					consumosbodegasOriginal.setId(consumosbodegasAux.getId());
					consumosbodegasOriginal.setVersionRow(consumosbodegasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosBodegas consumosbodegasAux:this.consumosbodegass) {
				if(consumosbodegasAux.getConsumosBodegasOriginal().getId().equals(consumosbodegasOriginal.getId())) {
					existe=true;
					consumosbodegasOriginal.setId(consumosbodegasAux.getId());
					consumosbodegasOriginal.setVersionRow(consumosbodegasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConsumosBodegas(Boolean esParaCancelar) throws Exception {
		consumosbodegassAux=new ArrayList<ConsumosBodegas>();
		consumosbodegasAux=new ConsumosBodegas();
		
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
					if(consumosbodegasAux.getId()<0) {
						consumosbodegassAux.add(consumosbodegasAux);
					}		
				}
				this.iIdNuevoConsumosBodegas=0L;
				this.consumosbodegasLogic.getConsumosBodegass().removeAll(consumosbodegassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosBodegas consumosbodegasAux:this.consumosbodegass) {
					if(consumosbodegasAux.getId()<0) {
						consumosbodegassAux.add(consumosbodegasAux);
					}		
				}
				this.iIdNuevoConsumosBodegas=0L;
				this.consumosbodegass.removeAll(consumosbodegassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConsumosBodegas 
					&& this.consumosbodegasLogic.getConsumosBodegass().size()>0
					) {
					consumosbodegasAux=this.consumosbodegasLogic.getConsumosBodegass().get(this.consumosbodegasLogic.getConsumosBodegass().size() - 1);
				
					if(consumosbodegasAux.getId()<0) {
						this.consumosbodegasLogic.getConsumosBodegass().remove(consumosbodegasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConsumosBodegas && this.consumosbodegass.size()>0) {
					consumosbodegasAux=this.consumosbodegass.get(this.consumosbodegass.size() - 1);
				
					if(consumosbodegasAux.getId()<0) {
						this.consumosbodegass.remove(consumosbodegasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConsumosBodegas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(consumosbodegas.getId()<0) {
				this.consumosbodegasLogic.getConsumosBodegass().remove(this.consumosbodegas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(consumosbodegas.getId()<0) {
				this.consumosbodegass.remove(this.consumosbodegas);
			}
		}			
	}
	
	public void setEstadosInicialesConsumosBodegas(List<ConsumosBodegas> consumosbodegassAux) throws Exception {
		ConsumosBodegasConstantesFunciones.setEstadosInicialesConsumosBodegas(consumosbodegassAux);
	}
	
	public void setEstadosInicialesConsumosBodegas(ConsumosBodegas consumosbodegasAux) throws Exception {
		ConsumosBodegasConstantesFunciones.setEstadosInicialesConsumosBodegas(consumosbodegasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConsumosBodegasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConsumosBodegasActual()) {
				if(!this.isEsNuevoConsumosBodegas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConsumosBodegas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConsumosBodegasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Consumos Bodegas ?", "MANTENIMIENTO DE Consumos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConsumosBodegas consumosbodegas) throws Exception {
		ConsumosBodegasConstantesFunciones.seleccionarAsignar(this.consumosbodegas,consumosbodegas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConsumosBodegas=this.isPermisoActualizarOriginalConsumosBodegas;
			
			
			this.seleccionarAsignar(consumosbodegas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConsumosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.consumosbodegasSessionBean.setsFuncionBusquedaRapida(this.consumosbodegasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConsumosBodegas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConsumosBodegas(esParaCancelar);				
				this.cancelarNuevoConsumosBodegas(esParaCancelar);								
			}
			
			this.consumosbodegas=new ConsumosBodegas();
			
			this.inicializarConsumosBodegas();
			
			this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConsumosBodegas() throws Exception {
		try {
			ConsumosBodegasConstantesFunciones.inicializarConsumosBodegas(this.consumosbodegas);
			
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
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.consumosbodegasLogic.getConsumosBodegass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConsumosBodegass(String sAccionBusqueda,List<ConsumosBodegas> consumosbodegassParaReportes) throws Exception {
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
					sPathReporteFinal="ConsumosBodegas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConsumosBodegasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConsumosBodegasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConsumosBodegas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Consumos Bodegases");		
		parameters.put("busquedapor", ConsumosBodegasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConsumosBodegas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConsumosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConsumosBodegasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConsumosBodegas=new JRBeanArrayDataSource(ConsumosBodegasJInternalFrame.TraerConsumosBodegasBeans(consumosbodegassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConsumosBodegas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConsumosBodegasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConsumosBodegasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConsumosBodegasBean.TraerConsumosBodegasBeans(consumosbodegassParaReportes).toArray()));
							
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
				this.generarExcelReporteConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConsumosBodegasActionPerformed(null);
					//this.generarExcelReporteConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConsumosBodegass(sAccionBusqueda,sTipoArchivoReporte,consumosbodegassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConsumosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosBodegas> consumosbodegassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosBodegass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsumosBodegas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConsumosBodegas consumosbodegas : consumosbodegassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConsumosBodegasConstantesFunciones.generarExcelReporteDataConsumosBodegas("NORMAL",row,workbook,consumosbodegas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConsumosBodegas(String sTipo,Row row,Workbook workbook) {
		
		ConsumosBodegasConstantesFunciones.generarExcelReporteHeaderConsumosBodegas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConsumosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosBodegas> consumosbodegassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosBodegass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConsumosBodegas consumosbodegas : consumosbodegassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConsumosBodegasConstantesFunciones.getConsumosBodegasDescripcion(consumosbodegas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConsumosBodegasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(consumosbodegas.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConsumosBodegass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConsumosBodegas> consumosbodegassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConsumosBodegas> consumosbodegassRespaldo=null;
		
		classes=ConsumosBodegasConstantesFunciones.getClassesRelationshipsOfConsumosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.consumosbodegasLogic.setDatosCliente(this.datosCliente);
		this.consumosbodegasLogic.setDatosDeep(this.datosDeep);
		this.consumosbodegasLogic.setIsConDeep(true);
		
		consumosbodegassRespaldo=this.consumosbodegasLogic.getConsumosBodegass();
		
		this.consumosbodegasLogic.setConsumosBodegass(consumosbodegassParaReportes);	
		this.consumosbodegasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		consumosbodegassParaReportes=this.consumosbodegasLogic.getConsumosBodegass();
		this.consumosbodegasLogic.setConsumosBodegass(consumosbodegassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConsumosBodegass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConsumosBodegas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConsumosBodegas consumosbodegas : consumosbodegassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConsumosBodegas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConsumosBodegasConstantesFunciones.generarExcelReporteDataConsumosBodegas("NORMAL",row,workbook,consumosbodegas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConsumosBodegasConstantesFunciones.getConsumosBodegasDescripcion(consumosbodegas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosBodegas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConsumosBodegas() throws Exception {		
		this.startProcessConsumosBodegas(true);
	}
	
	public void startProcessConsumosBodegas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConsumosBodegas ,this.jPanelParametrosReportesConsumosBodegas, this.jScrollPanelDatosConsumosBodegas,this.jPanelPaginacionConsumosBodegas, this.jScrollPanelDatosEdicionConsumosBodegas, this.jPanelAccionesConsumosBodegas,this.jPanelAccionesFormularioConsumosBodegas,this.jmenuBarConsumosBodegas,this.jmenuBarDetalleConsumosBodegas,this.jTtoolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas);		
		
		final JTabbedPane jTabbedPaneBusquedasConsumosBodegas=this.jTabbedPaneBusquedasConsumosBodegas; 
		
		final JPanel jPanelParametrosReportesConsumosBodegas=this.jPanelParametrosReportesConsumosBodegas;
		//final JScrollPane jScrollPanelDatosConsumosBodegas=this.jScrollPanelDatosConsumosBodegas;
		final JTable jTableDatosConsumosBodegas=this.jTableDatosConsumosBodegas;		
		final JPanel jPanelPaginacionConsumosBodegas=this.jPanelPaginacionConsumosBodegas;
		//final JScrollPane jScrollPanelDatosEdicionConsumosBodegas=this.jScrollPanelDatosEdicionConsumosBodegas;
		final JPanel jPanelAccionesConsumosBodegas=this.jPanelAccionesConsumosBodegas;
		
		JPanel jPanelCamposAuxiliarConsumosBodegas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConsumosBodegas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			jPanelCamposAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jPanelCamposConsumosBodegas;
			jPanelAccionesFormularioAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jPanelAccionesFormularioConsumosBodegas;
		}
		
		final JPanel jPanelCamposConsumosBodegas=jPanelCamposAuxiliarConsumosBodegas;
		final JPanel jPanelAccionesFormularioConsumosBodegas=jPanelAccionesFormularioAuxiliarConsumosBodegas;
		
		
		final JMenuBar jmenuBarConsumosBodegas=this.jmenuBarConsumosBodegas;
		final JToolBar jTtoolBarConsumosBodegas=this.jTtoolBarConsumosBodegas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConsumosBodegas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsumosBodegas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			jmenuBarDetalleAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jmenuBarDetalleConsumosBodegas;
			jTtoolBarDetalleAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jTtoolBarDetalleConsumosBodegas;
		}
		
		final JMenuBar jmenuBarDetalleConsumosBodegas=jmenuBarDetalleAuxiliarConsumosBodegas;
		final JToolBar jTtoolBarDetalleConsumosBodegas=jTtoolBarDetalleAuxiliarConsumosBodegas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsumosBodegas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsumosBodegas;
			processRunnable.jTableDatos=jTableDatosConsumosBodegas;
			processRunnable.jPanelCampos=jPanelCamposConsumosBodegas;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsumosBodegas;
			processRunnable.jPanelAcciones=jPanelAccionesConsumosBodegas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsumosBodegas;
			
			
			processRunnable.jmenuBar=jmenuBarConsumosBodegas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsumosBodegas;
			processRunnable.jTtoolBar=jTtoolBarConsumosBodegas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsumosBodegas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsumosBodegas ,jPanelParametrosReportesConsumosBodegas,jTableDatosConsumosBodegas, /*jScrollPanelDatosConsumosBodegas,*/jPanelCamposConsumosBodegas,jPanelPaginacionConsumosBodegas, /*jScrollPanelDatosEdicionConsumosBodegas,*/ jPanelAccionesConsumosBodegas,jPanelAccionesFormularioConsumosBodegas,jmenuBarConsumosBodegas,jmenuBarDetalleConsumosBodegas,jTtoolBarConsumosBodegas,jTtoolBarDetalleConsumosBodegas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConsumosBodegas ,jPanelParametrosReportesConsumosBodegas, jScrollPanelDatosConsumosBodegas,jPanelPaginacionConsumosBodegas, jScrollPanelDatosEdicionConsumosBodegas, jPanelAccionesConsumosBodegas,jPanelAccionesFormularioConsumosBodegas,jmenuBarConsumosBodegas,jmenuBarDetalleConsumosBodegas,jTtoolBarConsumosBodegas,jTtoolBarDetalleConsumosBodegas);
						
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
	
	public void finishProcessConsumosBodegas() {// throws Exception 
		this.finishProcessConsumosBodegas(true);
	}
	
	public void finishProcessConsumosBodegas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConsumosBodegas ,this.jPanelParametrosReportesConsumosBodegas, this.jScrollPanelDatosConsumosBodegas,this.jPanelPaginacionConsumosBodegas, this.jScrollPanelDatosEdicionConsumosBodegas, this.jPanelAccionesConsumosBodegas,this.jPanelAccionesFormularioConsumosBodegas,this.jmenuBarConsumosBodegas,this.jmenuBarDetalleConsumosBodegas,this.jTtoolBarConsumosBodegas,this.jTtoolBarDetalleConsumosBodegas);		
		
		final JTabbedPane jTabbedPaneBusquedasConsumosBodegas=this.jTabbedPaneBusquedasConsumosBodegas; 
		
		final JPanel jPanelParametrosReportesConsumosBodegas=this.jPanelParametrosReportesConsumosBodegas;
		//final JScrollPane jScrollPanelDatosConsumosBodegas=this.jScrollPanelDatosConsumosBodegas;
		final JTable jTableDatosConsumosBodegas=this.jTableDatosConsumosBodegas;		
		final JPanel jPanelPaginacionConsumosBodegas=this.jPanelPaginacionConsumosBodegas;
		//final JScrollPane jScrollPanelDatosEdicionConsumosBodegas=this.jScrollPanelDatosEdicionConsumosBodegas;
		final JPanel jPanelAccionesConsumosBodegas=this.jPanelAccionesConsumosBodegas;
		
		JPanel jPanelCamposAuxiliarConsumosBodegas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConsumosBodegas=new JPanel();
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			jPanelCamposAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jPanelCamposConsumosBodegas;
			jPanelAccionesFormularioAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jPanelAccionesFormularioConsumosBodegas;
		}
		
		final JPanel jPanelCamposConsumosBodegas=jPanelCamposAuxiliarConsumosBodegas;
		final JPanel jPanelAccionesFormularioConsumosBodegas=jPanelAccionesFormularioAuxiliarConsumosBodegas;
		
		
		final JMenuBar jmenuBarConsumosBodegas=this.jmenuBarConsumosBodegas;		
		final JToolBar jTtoolBarConsumosBodegas=this.jTtoolBarConsumosBodegas;
				
		JMenuBar jmenuBarDetalleAuxiliarConsumosBodegas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConsumosBodegas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			jmenuBarDetalleAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jmenuBarDetalleConsumosBodegas;
			jTtoolBarDetalleAuxiliarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jTtoolBarDetalleConsumosBodegas;		
		}
		
		final JMenuBar jmenuBarDetalleConsumosBodegas=jmenuBarDetalleAuxiliarConsumosBodegas;
		final JToolBar jTtoolBarDetalleConsumosBodegas=jTtoolBarDetalleAuxiliarConsumosBodegas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConsumosBodegas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConsumosBodegas;
			processRunnable.jTableDatos=jTableDatosConsumosBodegas;
			processRunnable.jPanelCampos=jPanelCamposConsumosBodegas;
			processRunnable.jPanelPaginacion=jPanelPaginacionConsumosBodegas;
			processRunnable.jPanelAcciones=jPanelAccionesConsumosBodegas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConsumosBodegas;
			
			
			processRunnable.jmenuBar=jmenuBarConsumosBodegas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConsumosBodegas;
			processRunnable.jTtoolBar=jTtoolBarConsumosBodegas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConsumosBodegas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConsumosBodegas ,jPanelParametrosReportesConsumosBodegas, jTableDatosConsumosBodegas,/*jScrollPanelDatosConsumosBodegas,*/jPanelCamposConsumosBodegas,jPanelPaginacionConsumosBodegas, /*jScrollPanelDatosEdicionConsumosBodegas,*/ jPanelAccionesConsumosBodegas,jPanelAccionesFormularioConsumosBodegas,jmenuBarConsumosBodegas,jmenuBarDetalleConsumosBodegas,jTtoolBarConsumosBodegas,jTtoolBarDetalleConsumosBodegas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConsumosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConsumosBodegas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConsumosBodegas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConsumosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConsumosBodegas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConsumosBodegas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConsumosBodegas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConsumosBodegas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConsumosBodegas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.consumosbodegasConstantesFunciones.getsFinalQueryConsumosBodegas();
		String  finalQueryPaginacionTodos=this.consumosbodegasConstantesFunciones.getsFinalQueryConsumosBodegas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConsumosBodegasConstantesFunciones.getArrayColumnasGlobalesNoConsumosBodegas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConsumosBodegasConstantesFunciones.getArrayColumnasGlobalesConsumosBodegas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConsumosBodegasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.consumosbodegassEliminados= new ArrayList<ConsumosBodegas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConsumosBodegas();
		
				///*ConsumosBodegasSessionBean*/this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			
			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
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
					this.iNumeroPaginacion=ConsumosBodegasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConsumosBodegasConstantesFunciones.getClassesForeignKeysOfConsumosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/consumosbodegas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			consumosbodegassAux= new ArrayList<ConsumosBodegas>();
			
				
			consumosbodegasLogic.setDatosCliente(this.datosCliente);
			consumosbodegasLogic.setDatosDeep(this.datosDeep);
			consumosbodegasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConsumosBodegas")) {
				this.sDetalleReporte=ConsumosBodegasConstantesFunciones.getDetalleIndiceBusquedaConsumosBodegas(id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					consumosbodegasLogic.getConsumosBodegassBusquedaConsumosBodegas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsumosBodegasConstantesFunciones.getDetalleIndiceBusquedaConsumosBodegas(id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsumosBodegasConstantesFunciones.getDetalleIndiceBusquedaConsumosBodegas(id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=consumosbodegasLogic.getConsumosBodegass()==null||consumosbodegasLogic.getConsumosBodegass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=consumosbodegass==null|| consumosbodegass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosbodegassAux=new ArrayList<ConsumosBodegas>();
						consumosbodegassAux.addAll(consumosbodegasLogic.getConsumosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosbodegassAux=new ArrayList<ConsumosBodegas>();
							consumosbodegassAux.addAll(consumosbodegass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							consumosbodegasLogic.getConsumosBodegassBusquedaConsumosBodegas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConsumosBodegasConstantesFunciones.getDetalleIndiceBusquedaConsumosBodegas(id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConsumosBodegasConstantesFunciones.getDetalleIndiceBusquedaConsumosBodegas(id_transaccionBusquedaConsumosBodegas,id_lineaBusquedaConsumosBodegas,id_linea_grupoBusquedaConsumosBodegas,id_linea_categoriaBusquedaConsumosBodegas,id_linea_marcaBusquedaConsumosBodegas,fecha_emision_desdeBusquedaConsumosBodegas,fecha_emision_hastaBusquedaConsumosBodegas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConsumosBodegass("BusquedaConsumosBodegas",consumosbodegasLogic.getConsumosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConsumosBodegass("BusquedaConsumosBodegas",consumosbodegass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosbodegasLogic.setConsumosBodegass(new ArrayList<ConsumosBodegas>());
						consumosbodegasLogic.getConsumosBodegass().addAll(consumosbodegassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosbodegass=new ArrayList<ConsumosBodegas>();
							consumosbodegass.addAll(consumosbodegassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConsumosBodegas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConsumosBodegas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consumosbodegasLogic.getConsumosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosbodegass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=consumosbodegasLogic.getConsumosBodegass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=consumosbodegass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConsumosBodegas consumosbodegas) {
		Boolean permite=true;
		
		if(this.consumosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConsumosBodegasConstantesFunciones.getOrderByListaConsumosBodegas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConsumosBodegasConstantesFunciones.getOrderByListaConsumosBodegas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosBodegas consumosbodegas:consumosbodegasLogic.getConsumosBodegass()) {
				if(consumosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					consumosbodegasTotales=consumosbodegas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosBodegas consumosbodegas:this.consumosbodegass) {
				if(consumosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					consumosbodegasTotales=consumosbodegas;
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
			this.consumosbodegasAux=new ConsumosBodegas();
			this.consumosbodegasAux.setsType(Constantes2.S_TOTALES);
			this.consumosbodegasAux.setIsNew(false);
			this.consumosbodegasAux.setIsChanged(false);
			this.consumosbodegasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConsumosBodegasConstantesFunciones.TotalizarValoresFilaConsumosBodegas(this.consumosbodegasLogic.getConsumosBodegass(),this.consumosbodegasAux);
				
				//this.consumosbodegasLogic.getConsumosBodegass().add(this.consumosbodegasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConsumosBodegasConstantesFunciones.TotalizarValoresFilaConsumosBodegas(this.consumosbodegass,this.consumosbodegasAux);
				
				this.consumosbodegass.add(this.consumosbodegasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		consumosbodegasTotales=new ConsumosBodegas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consumosbodegasLogic.getConsumosBodegass().remove(consumosbodegasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.consumosbodegass.remove(consumosbodegasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		consumosbodegasTotales=new ConsumosBodegas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConsumosBodegas consumosbodegas:consumosbodegasLogic.getConsumosBodegass()) {
				if(consumosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					consumosbodegasTotales=consumosbodegas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsumosBodegasConstantesFunciones.TotalizarValoresFilaConsumosBodegas(this.consumosbodegasLogic.getConsumosBodegass(),consumosbodegasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConsumosBodegas consumosbodegas:this.consumosbodegass) {
				if(consumosbodegas.getsType().equals(Constantes2.S_TOTALES)) {
					consumosbodegasTotales=consumosbodegas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConsumosBodegasConstantesFunciones.TotalizarValoresFilaConsumosBodegas(this.consumosbodegass,consumosbodegasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConsumosBodegassBusquedaConsumosBodegas()throws Exception {
		try {
			sAccionBusqueda="BusquedaConsumosBodegas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConsumosBodegassFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConsumosBodegassBusquedaConsumosBodegas(String sFinalQuery,Long id_transaccion,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassBusquedaConsumosBodegas(sFinalQuery,this.pagination,id_transaccion,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConsumosBodegassFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//consumosbodegasLogic.getConsumosBodegassFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosConsumosBodegas() {
		this.isPermisoTodoConsumosBodegas=false;
		this.isPermisoNuevoConsumosBodegas=false;
		this.isPermisoActualizarConsumosBodegas=false;
		this.isPermisoActualizarOriginalConsumosBodegas=false;
		this.isPermisoEliminarConsumosBodegas=false;
		this.isPermisoGuardarCambiosConsumosBodegas=false;
		this.isPermisoConsultaConsumosBodegas=true;
		this.isPermisoBusquedaConsumosBodegas=true;
		this.isPermisoReporteConsumosBodegas=true;
		this.isPermisoOrdenConsumosBodegas=false;		
		this.isPermisoPaginacionMedioConsumosBodegas=false;		
		this.isPermisoPaginacionAltoConsumosBodegas=false;		
		this.isPermisoPaginacionTodoConsumosBodegas=false;		
		this.isPermisoCopiarConsumosBodegas=false;		
		this.isPermisoVerFormConsumosBodegas=false;		
		this.isPermisoDuplicarConsumosBodegas=false;
		this.isPermisoOrdenConsumosBodegas=false;
	}
	
	public void setPermisosUsuarioConsumosBodegas(Boolean isPermiso) {
		this.isPermisoTodoConsumosBodegas=isPermiso;
		this.isPermisoNuevoConsumosBodegas=isPermiso;
		this.isPermisoActualizarConsumosBodegas=isPermiso;
		this.isPermisoActualizarOriginalConsumosBodegas=isPermiso;
		this.isPermisoEliminarConsumosBodegas=isPermiso;
		this.isPermisoGuardarCambiosConsumosBodegas=isPermiso;
		this.isPermisoConsultaConsumosBodegas=isPermiso;
		this.isPermisoBusquedaConsumosBodegas=isPermiso;
		this.isPermisoReporteConsumosBodegas=isPermiso;
		this.isPermisoOrdenConsumosBodegas=isPermiso;		
		this.isPermisoPaginacionMedioConsumosBodegas=isPermiso;		
		this.isPermisoPaginacionAltoConsumosBodegas=isPermiso;		
		this.isPermisoPaginacionTodoConsumosBodegas=isPermiso;		
		this.isPermisoCopiarConsumosBodegas=isPermiso;		
		this.isPermisoVerFormConsumosBodegas=isPermiso;		
		this.isPermisoDuplicarConsumosBodegas=isPermiso;
		this.isPermisoOrdenConsumosBodegas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConsumosBodegas(Boolean isPermiso) {
		//this.isPermisoTodoConsumosBodegas=isPermiso;
		this.isPermisoNuevoConsumosBodegas=isPermiso;
		this.isPermisoActualizarConsumosBodegas=isPermiso;
		this.isPermisoActualizarOriginalConsumosBodegas=isPermiso;
		this.isPermisoEliminarConsumosBodegas=isPermiso;
		this.isPermisoGuardarCambiosConsumosBodegas=isPermiso;
		//this.isPermisoConsultaConsumosBodegas=isPermiso;
		//this.isPermisoBusquedaConsumosBodegas=isPermiso;
		//this.isPermisoReporteConsumosBodegas=isPermiso;
		//this.isPermisoOrdenConsumosBodegas=isPermiso;		
		//this.isPermisoPaginacionMedioConsumosBodegas=isPermiso;		
		//this.isPermisoPaginacionAltoConsumosBodegas=isPermiso;		
		//this.isPermisoPaginacionTodoConsumosBodegas=isPermiso;		
		//this.isPermisoCopiarConsumosBodegas=isPermiso;		
		//this.isPermisoDuplicarConsumosBodegas=isPermiso;
		//this.isPermisoOrdenConsumosBodegas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConsumosBodegasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConsumosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebConsumosBodegas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConsumosBodegasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConsumosBodegasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConsumosBodegasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConsumosBodegasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConsumosBodegas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConsumosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConsumosBodegasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConsumosBodegas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConsumosBodegas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConsumosBodegas=this.isPermisoActualizarConsumosBodegas;
			this.isPermisoEliminarConsumosBodegas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConsumosBodegas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConsumosBodegas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConsumosBodegas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConsumosBodegas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConsumosBodegas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsumosBodegas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConsumosBodegas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConsumosBodegas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConsumosBodegas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConsumosBodegas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConsumosBodegas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConsumosBodegas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConsumosBodegas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConsumosBodegas.setToolTipText(this.jTableDatosConsumosBodegas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConsumosBodegas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConsumosBodegas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConsumosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConsumosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConsumosBodegas() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyConsumosBodegasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConsumosBodegasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConsumosBodegasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyConsumosBodegas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.consumosbodegasSessionBean==null) {
				this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean();
			}

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.consumosbodegasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConsumosBodegas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConsumosBodegas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConsumosBodegas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosBodegas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConsumosBodegas(ConsumosBodegas consumosbodegas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConsumosBodegas(ConsumosBodegas consumosbodegas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConsumosBodegas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConsumosBodegas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConsumosBodegas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConsumosBodegas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConsumosBodegas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConsumosBodegas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConsumosBodegas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConsumosBodegas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.getItemCount()>0) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public ConsumosBodegasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConsumosBodegasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConsumosBodegasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.consumosbodegasSessionBean=new ConsumosBodegasSessionBean(); 
		this.consumosbodegasConstantesFunciones=new ConsumosBodegasConstantesFunciones(); 
		this.consumosbodegasBean=new ConsumosBodegas();//(this.consumosbodegasConstantesFunciones); 		
		this.consumosbodegasReturnGeneral=new ConsumosBodegasParameterReturnGeneral(); 
		
		this.consumosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consumosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConsumosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConsumosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConsumosBodegasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConsumosBodegas(true);
			
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
			
			this.consumosbodegasConstantesFunciones=new ConsumosBodegasConstantesFunciones(); 
			this.consumosbodegasBean=new ConsumosBodegas();//this.consumosbodegasConstantesFunciones); 			
			this.consumosbodegasReturnGeneral=new ConsumosBodegasParameterReturnGeneral(); 
		
			ConsumosBodegasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consumos Bodegas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.consumosbodegas=new ConsumosBodegas();
			this.consumosbodegass = new ArrayList<ConsumosBodegas>();
			this.consumosbodegassAux = new ArrayList<ConsumosBodegas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic=new ConsumosBodegasLogic();
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			//this.consumosbodegasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.consumosbodegasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConsumosBodegas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsumosBodegas);	
					}
					
					if(this.jInternalFrameImportacionConsumosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsumosBodegas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConsumosBodegas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConsumosBodegas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConsumosBodegas);
				this.jInternalFrameDetalleFormConsumosBodegas.setVisible(false);
				this.jInternalFrameDetalleFormConsumosBodegas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsumosBodegas);
					this.jInternalFrameReporteDinamicoConsumosBodegas.setVisible(false);
					this.jInternalFrameReporteDinamicoConsumosBodegas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConsumosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConsumosBodegas);
					this.jInternalFrameImportacionConsumosBodegas.setVisible(false);
					this.jInternalFrameImportacionConsumosBodegas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConsumosBodegas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConsumosBodegas);
					this.jInternalFrameOrderByConsumosBodegas.setVisible(false);
					this.jInternalFrameOrderByConsumosBodegas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConsumosBodegasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConsumosBodegasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.consumosbodegasReturnGeneral=new ConsumosBodegasParameterReturnGeneral();
			
			this.consumosbodegasParameterGeneral=new ConsumosBodegasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.consumosbodegasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConsumosBodegasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsumosBodegasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),this.consumosbodegasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConsumosBodegasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),this.consumosbodegasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaDuplicarConsumosBodegas=true;
			this.isVisibilidadCeldaCopiarConsumosBodegas=true;
			this.isVisibilidadCeldaVerFormConsumosBodegas=true;
			this.isVisibilidadCeldaOrdenConsumosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			
			
			this.isVisibilidadBusquedaConsumosBodegas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConsumosBodegas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConsumosBodegas(false);
			
			this.setPermisosUsuarioConsumosBodegas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado() 
				|| (this.consumosbodegasSessionBean.getEsGuardarRelacionado() && this.consumosbodegasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConsumosBodegasClasesRelacionadas();
			}
			
			if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConsumosBodegasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConsumosBodegas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConsumosBodegas();
			}
			
			if(!this.isPermisoBusquedaConsumosBodegas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConsumosBodegasConstantesFunciones.getTiposSeleccionarConsumosBodegas());
				
				this.tiposColumnasSelect=ConsumosBodegasConstantesFunciones.getTiposSeleccionarConsumosBodegas(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConsumosBodegas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConsumosBodegas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConsumosBodegas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosBodegas() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				consumosbodegasImplementable= (ConsumosBodegasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsumosBodegasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				consumosbodegasImplementableHome= (ConsumosBodegasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConsumosBodegasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.consumosbodegass= new ArrayList<ConsumosBodegas>();
			this.consumosbodegassEliminados= new ArrayList<ConsumosBodegas>();
						
			this.isEsNuevoConsumosBodegas=false;
			this.esParaAccionDesdeFormularioConsumosBodegas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConsumosBodegas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConsumosBodegas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConsumosBodegasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConsumosBodegasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConsumosBodegas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConsumosBodegas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConsumosBodegas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConsumosBodegas();
			}
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConsumosBodegas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConsumosBodegas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConsumosBodegas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConsumosBodegas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConsumosBodegas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConsumosBodegas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConsumosBodegas")) {
				iIndex=this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConsumosBodegas();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyConsumosBodegas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConsumosBodegas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConsumosBodegas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConsumosBodegasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConsumosBodegas();
		
		this.cargarCombosFrameForeignKeyConsumosBodegas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConsumosBodegas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConsumosBodegas();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConsumosBodegasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			
			if(jTableDatosConsumosBodegas.getRowCount()>=1) {
				jTableDatosConsumosBodegas.removeRowSelectionInterval(0, jTableDatosConsumosBodegas.getRowCount()-1);						
			}
			
			this.isEsNuevoConsumosBodegas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConsumosBodegas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConsumosBodegas(true);			
			//this.consumosbodegas=new ConsumosBodegas();
			//this.consumosbodegas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosBodegas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosBodegas() ;
			
			if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosBodegas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.consumosbodegas);	
			this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);				
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConsumosBodegas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConsumosBodegasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConsumosBodegas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConsumosBodegas.getSelectedRows().length;			
			}
			
			consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConsumosBodegas--;			
				//ConsumosBodegas consumosbodegasAux= new ConsumosBodegas();			
				//consumosbodegasAux.setId(this.iIdNuevoConsumosBodegas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConsumosBodegas consumosbodegasOrigen=new ConsumosBodegas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConsumosBodegas consumosbodegasOrigen : consumosbodegassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							consumosbodegasOrigen =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							consumosbodegasOrigen =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConsumosBodegas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.consumosbodegas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConsumosBodegas(consumosbodegasOrigen,this.consumosbodegas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consumosbodegasLogic.getConsumosBodegass().add(this.consumosbodegasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consumosbodegass.add(this.consumosbodegasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
				
				this.jTableDatosConsumosBodegas.setRowSelectionInterval(this.getIndiceNuevoConsumosBodegas(), this.getIndiceNuevoConsumosBodegas());
				
				int iLastRow =  this.jTableDatosConsumosBodegas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsumosBodegas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsumosBodegas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosBodegas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();									
		
			ConsumosBodegas consumosbodegasOrigen=new ConsumosBodegas();
			ConsumosBodegas consumosbodegasDestino=new ConsumosBodegas();
				
			consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConsumosBodegas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || consumosbodegassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConsumosBodegas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosbodegasOrigen =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consumosbodegasOrigen =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						consumosbodegasDestino =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						consumosbodegasDestino =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				consumosbodegasOrigen =consumosbodegassSeleccionados.get(0);
				consumosbodegasDestino =consumosbodegassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConsumosBodegas(consumosbodegasOrigen,consumosbodegasDestino,true,false);
				
				consumosbodegasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(consumosbodegasDestino,consumosbodegasLogic.getConsumosBodegass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(consumosbodegasDestino,consumosbodegass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
				
				//this.jTableDatosConsumosBodegas.setRowSelectionInterval(this.getIndiceNuevoConsumosBodegas(), this.getIndiceNuevoConsumosBodegas());
				
				int iLastRow =  this.jTableDatosConsumosBodegas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConsumosBodegas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConsumosBodegas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosBodegas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConsumosBodegas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConsumosBodegas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConsumosBodegas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConsumosBodegas.setVisible(!isVisible);
			this.jPanelPaginacionConsumosBodegas.setVisible(!isVisible);
			this.jPanelAccionesConsumosBodegas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConsumosBodegas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConsumosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConsumosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConsumosBodegas();
			
			this.abrirFrameOrderByConsumosBodegas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConsumosBodegas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConsumosBodegas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsumosBodegas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConsumosBodegas.isMaximum()) {
					this.jInternalFrameDetalleFormConsumosBodegas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConsumosBodegas.setSize(this.jInternalFrameDetalleFormConsumosBodegas.iWidthFormulario,this.jInternalFrameDetalleFormConsumosBodegas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConsumosBodegas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConsumosBodegas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConsumosBodegas.isMaximum()) {
						this.jInternalFrameDetalleFormConsumosBodegas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConsumosBodegas.jContentPaneDetalleConsumosBodegas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConsumosBodegas.jContentPaneDetalleConsumosBodegas.getWidth(),ConsumosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConsumosBodegas.jContentPaneDetalleConsumosBodegas.getWidth(),ConsumosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConsumosBodegas.jContentPaneDetalleConsumosBodegas.getWidth(),ConsumosBodegasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConsumosBodegas.setVisible(true);
	        this.jInternalFrameDetalleFormConsumosBodegas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConsumosBodegas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConsumosBodegas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConsumosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosBodegas,false,this);
				} else {
					this.jInternalFrameOrderByConsumosBodegas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConsumosBodegas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConsumosBodegas);
				this.jInternalFrameOrderByConsumosBodegas.setVisible(false);
				this.jInternalFrameOrderByConsumosBodegas.setSelected(false);
				
				this.jInternalFrameOrderByConsumosBodegas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsumosBodegas"));
				
				this.inicializarActualizarBindingTablaOrderByConsumosBodegas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConsumosBodegas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConsumosBodegas==null) {
				
				this.jInternalFrameImportacionConsumosBodegas=new ImportacionJInternalFrame(ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConsumosBodegas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConsumosBodegas);
				this.jInternalFrameImportacionConsumosBodegas.setVisible(false);
				this.jInternalFrameImportacionConsumosBodegas.setSelected(false);


				this.jInternalFrameImportacionConsumosBodegas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsumosBodegas"));
				this.jInternalFrameImportacionConsumosBodegas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsumosBodegas"));
				this.jInternalFrameImportacionConsumosBodegas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsumosBodegas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConsumosBodegas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConsumosBodegas==null) {
				this.jInternalFrameReporteDinamicoConsumosBodegas=new ReporteDinamicoJInternalFrame(ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConsumosBodegas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConsumosBodegas);
				this.jInternalFrameReporteDinamicoConsumosBodegas.setVisible(false);
				this.jInternalFrameReporteDinamicoConsumosBodegas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosBodegas"));
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosBodegas"));
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosBodegas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosBodegas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConsumosBodegas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConsumosBodegas);
			
	       	this.jInternalFrameDetalleFormConsumosBodegas.setVisible(false);
	        this.jInternalFrameDetalleFormConsumosBodegas.setSelected(false);
			
			//this.jInternalFrameDetalleFormConsumosBodegas.dispose();
			//this.jInternalFrameDetalleFormConsumosBodegas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConsumosBodegas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConsumosBodegas.setVisible(true);
	        this.jInternalFrameReporteDinamicoConsumosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConsumosBodegas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConsumosBodegas.setVisible(true);
	        this.jInternalFrameImportacionConsumosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConsumosBodegas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConsumosBodegas.setVisible(true);
	        this.jInternalFrameOrderByConsumosBodegas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConsumosBodegas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConsumosBodegas.setVisible(false);
	        this.jInternalFrameOrderByConsumosBodegas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConsumosBodegas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConsumosBodegas.setVisible(false);
	        this.jInternalFrameReporteDinamicoConsumosBodegas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConsumosBodegas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConsumosBodegas.setVisible(false);
	        this.jInternalFrameImportacionConsumosBodegas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConsumosBodegas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConsumosBodegas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConsumosBodegas(true);
			//this.isEsNuevoConsumosBodegas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConsumosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosBodegas(false) ;
			
			if(consumosbodegasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosBodegas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosBodegas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConsumosBodegasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConsumosBodegas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConsumosBodegas(true);
			//this.isEsNuevoConsumosBodegas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.consumosbodegas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConsumosBodegas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConsumosBodegas(false) ;
			
			if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConsumosBodegas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosBodegas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConsumosBodegas(false);
			
			//if(!this.isEsNuevoConsumosBodegas) {								
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				
			}
			
			if(this.permiteMantenimiento(this.consumosbodegas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConsumosBodegas=true;
					this.inicializarActualizarBindingTablaConsumosBodegas(false);
					this.isEsNuevoConsumosBodegas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConsumosBodegas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConsumosBodegas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsumosBodegas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosBodegas(false);
				
				this.habilitarDeshabilitarControlesConsumosBodegas(false);
			
												
				
				if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConsumosBodegas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConsumosBodegasActionPerformed(evt,consumosbodegasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConsumosBodegas(this.consumosbodegas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,consumosbodegasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.consumosbodegas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				this.consumosbodegas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				this.consumosbodegas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.consumosbodegas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConsumosBodegasModel) this.jTableDatosConsumosBodegas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConsumosBodegas=true;
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
				this.isEsNuevoConsumosBodegas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConsumosBodegas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosBodegas(false);
				
				this.habilitarDeshabilitarControlesConsumosBodegas(false);
				
				
				
				if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConsumosBodegas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConsumosBodegas.getRowCount()>=1) {
				jTableDatosConsumosBodegas.removeRowSelectionInterval(0, jTableDatosConsumosBodegas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConsumosBodegas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConsumosBodegas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConsumosBodegas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConsumosBodegas(false) ;
			
			this.isEsNuevoConsumosBodegas=false;
			
			if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConsumosBodegas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConsumosBodegas(false);
				
				//SI ES MANUAL
				if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConsumosBodegas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConsumosBodegas--;			
			//ConsumosBodegas consumosbodegasAux= new ConsumosBodegas();			
			//consumosbodegasAux.setId(this.iIdNuevoConsumosBodegas);
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConsumosBodegas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
			
			this.consumosbodegas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.consumosbodegasLogic.getConsumosBodegass().add(this.consumosbodegasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.consumosbodegass.add(this.consumosbodegasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConsumosBodegas(false);
			
			this.jTableDatosConsumosBodegas.setRowSelectionInterval(this.getIndiceNuevoConsumosBodegas(), this.getIndiceNuevoConsumosBodegas());
			
			int iLastRow =  this.jTableDatosConsumosBodegas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConsumosBodegas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConsumosBodegas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosBodegas(false);
			
			//SI ES MANUAL
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosBodegas();
			}
			
			//this.abrirFrameTreeConsumosBodegas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConsumosBodegas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConsumosBodegas.setFileImportacion(this.jInternalFrameImportacionConsumosBodegas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConsumosBodegas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConsumosBodegas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConsumosBodegas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConsumosBodegas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		

		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConsumosBodegasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConsumosBodegasBaseDesign.jrxml";
			
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
			
			this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConsumosBodegass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConsumosBodegasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ConsumosBodegas consumosbodegas:consumosbodegassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(consumosbodegas.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelConsumosBodegas(row);				
			//	iRow++;
			//}				
			
			//for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConsumosBodegas(consumosbodegasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
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
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosBodegas(false);
			
			//SI ES MANUAL
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConsumosBodegas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosBodegas(false);
			
			//SI ES MANUAL
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsumosBodegas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConsumosBodegas(false);
			
			//SI ES MANUAL
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConsumosBodegas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConsumosBodegas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConsumosBodegas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConsumosBodegas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConsumosBodegas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConsumosBodegas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConsumosBodegas.setMinimumSize(dimensionMinimum);
		this.jTableDatosConsumosBodegas.setMaximumSize(dimensionMaximum);
		this.jTableDatosConsumosBodegas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConsumosBodegas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConsumosBodegas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConsumosBodegas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConsumosBodegas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConsumosBodegas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConsumosBodegas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosBodegas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConsumosBodegas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConsumosBodegas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConsumosBodegas();
		
		this.inicializarActualizarBindingBotonesManualConsumosBodegas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConsumosBodegas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConsumosBodegas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosBodegas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosBodegas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConsumosBodegas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConsumosBodegas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConsumosBodegas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionNuevoConsumosBodegas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionSinCerrarConsumosBodegas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionSinMensajeConsumosBodegas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConsumosBodegas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConsumosBodegas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConsumosBodegas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
				this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionNuevoConsumosBodegas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionSinCerrarConsumosBodegas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConsumosBodegas.jCheckBoxPostAccionSinMensajeConsumosBodegas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConsumosBodegas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConsumosBodegas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConsumosBodegas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConsumosBodegas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConsumosBodegas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConsumosBodegas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConsumosBodegas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConsumosBodegas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConsumosBodegas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConsumosBodegas(Boolean esInicializar) throws Exception {
		try	{	
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConsumosBodegas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConsumosBodegas() throws Exception {
		try	{
			if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConsumosBodegas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsumosBodegas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConsumosBodegas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConsumosBodegas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConsumosBodegas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConsumosBodegas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConsumosBodegas.addItem(reporte);
			}
			
			
			if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConsumosBodegas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConsumosBodegas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConsumosBodegas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConsumosBodegas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConsumosBodegas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConsumosBodegas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConsumosBodegas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosBodegas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConsumosBodegas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
				
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConsumosBodegasConstantesFunciones.getTiposSeleccionarConsumosBodegas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConsumosBodegasConstantesFunciones.getTiposSeleccionarConsumosBodegas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConsumosBodegasConstantesFunciones.getTiposSeleccionarConsumosBodegas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConsumosBodegas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConsumosBodegas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()!=null){this.id_transaccionBusquedaConsumosBodegas=((Transaccion)this.jComboBoxid_transaccionBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()!=null){this.id_lineaBusquedaConsumosBodegas=((Linea)this.jComboBoxid_lineaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()!=null){this.id_linea_grupoBusquedaConsumosBodegas=((Linea)this.jComboBoxid_linea_grupoBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()!=null){this.id_linea_categoriaBusquedaConsumosBodegas=((Linea)this.jComboBoxid_linea_categoriaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()!=null){this.id_linea_marcaBusquedaConsumosBodegas=((Linea)this.jComboBoxid_linea_marcaBusquedaConsumosBodegasConsumosBodegas.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaConsumosBodegas=new Date(this.jDateChooserfecha_emision_desdeBusquedaConsumosBodegasConsumosBodegas.getDate().getTime());
		this.fecha_emision_hastaBusquedaConsumosBodegas=new Date(this.jDateChooserfecha_emision_hastaBusquedaConsumosBodegasConsumosBodegas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConsumosBodegas(Boolean esInicializar) throws Exception {				
		if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConsumosBodegas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConsumosBodegas() throws Exception {
		this.inicializarActualizarBindingTablaConsumosBodegas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConsumosBodegas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConsumosBodegasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConsumosBodegas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=consumosbodegasLogic.getConsumosBodegass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=consumosbodegass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConsumosBodegas.setModel(new ConsumosBodegasModel(this.consumosbodegasLogic.getConsumosBodegass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConsumosBodegas.setModel(new ConsumosBodegasModel(this.consumosbodegass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConsumosBodegas!=null && this.jInternalFrameOrderByConsumosBodegas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConsumosBodegas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,consumosbodegasConstantesFunciones.resaltarSeleccionarConsumosBodegas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConsumosBodegasConstantesFunciones.SCLASSWEBTITULO,consumosbodegasConstantesFunciones.resaltarSeleccionarConsumosBodegas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_ID));

		if(this.consumosbodegasConstantesFunciones.mostraridConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosbodegasConstantesFunciones.resaltaridConsumosBodegas,this.consumosbodegasConstantesFunciones.activaridConsumosBodegas,iSizeTabla,this,true,"idConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltaridConsumosBodegas,this.consumosbodegasConstantesFunciones.activaridConsumosBodegas,this,true,"idConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_productoConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_productoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_productoConsumosBodegas,iSizeTabla,this,true,"nombre_productoConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_productoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_productoConsumosBodegas,this,true,"nombre_productoConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_unidadConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_unidadConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_unidadConsumosBodegas,iSizeTabla,this,true,"nombre_unidadConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_unidadConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_unidadConsumosBodegas,this,true,"nombre_unidadConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD));

		if(this.consumosbodegasConstantesFunciones.mostrarcantidadConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosbodegasConstantesFunciones.resaltarcantidadConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcantidadConsumosBodegas,iSizeTabla,this,true,"cantidadConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarcantidadConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcantidadConsumosBodegas,this,true,"cantidadConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.consumosbodegasConstantesFunciones.mostrarcosto_totalConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.consumosbodegasConstantesFunciones.resaltarcosto_totalConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcosto_totalConsumosBodegas,iSizeTabla,this,true,"costo_totalConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarcosto_totalConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcosto_totalConsumosBodegas,this,true,"costo_totalConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_lineaConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_lineaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_lineaConsumosBodegas,iSizeTabla,this,true,"nombre_lineaConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_lineaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_lineaConsumosBodegas,this,true,"nombre_lineaConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_grupoConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_grupoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_grupoConsumosBodegas,iSizeTabla,this,true,"nombre_linea_grupoConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_grupoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_grupoConsumosBodegas,this,true,"nombre_linea_grupoConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_categoriaConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_categoriaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_categoriaConsumosBodegas,iSizeTabla,this,true,"nombre_linea_categoriaConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_categoriaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_categoriaConsumosBodegas,this,true,"nombre_linea_categoriaConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_marcaConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_marcaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_marcaConsumosBodegas,iSizeTabla,this,true,"nombre_linea_marcaConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_marcaConsumosBodegas,this.consumosbodegasConstantesFunciones.activarnombre_linea_marcaConsumosBodegas,this,true,"nombre_linea_marcaConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,ConsumosBodegasConstantesFunciones.LABEL_CODIGO));

		if(this.consumosbodegasConstantesFunciones.mostrarcodigoConsumosBodegas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConsumosBodegasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.consumosbodegasConstantesFunciones.resaltarcodigoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcodigoConsumosBodegas,iSizeTabla,this,true,"codigoConsumosBodegas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.consumosbodegasConstantesFunciones.resaltarcodigoConsumosBodegas,this.consumosbodegasConstantesFunciones.activarcodigoConsumosBodegas,this,true,"codigoConsumosBodegas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConsumosBodegasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsumosBodegas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConsumosBodegas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.consumosbodegasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConsumosBodegas.addColumn(tableColumn);
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
			
			this.jTableDatosConsumosBodegas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConsumosBodegas.moveColumn(this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConsumosBodegas.moveColumn(this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConsumosBodegas.moveColumn(this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConsumosBodegas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConsumosBodegas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConsumosBodegas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConsumosBodegas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConsumosBodegas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConsumosBodegas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConsumosBodegas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConsumosBodegas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=consumosbodegasLogic.getConsumosBodegass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=consumosbodegass.size()-1;
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
		//this.jTableDatosConsumosBodegas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConsumosBodegas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConsumosBodegas();
			
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
				
				//this.isEsNuevoConsumosBodegas=false;
					
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
				if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConsumosBodegas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsumosBodegas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.consumosbodegas.getsType().equals("DUPLICADO")
				   || this.consumosbodegas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConsumosBodegas=true;
				
				} else {
					this.isEsNuevoConsumosBodegas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
					if(this.consumosbodegas.getId()>=0 && !this.consumosbodegas.getIsNew()) {						
						this.isEsNuevoConsumosBodegas=false;
						
					} else {
						this.isEsNuevoConsumosBodegas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConsumosBodegas(esRelaciones);						
				
				this.seleccionarConsumosBodegas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.consumosbodegas.getId()<0) {
					this.isEsNuevoConsumosBodegas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConsumosBodegas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConsumosBodegas(evt,rowIndex);
				}	
				
				if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConsumosBodegas: " + this.dDif); 
					}
				}								
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConsumosBodegas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.consumosbodegas)) {
					if(this.consumosbodegas.getId()>0) {
						this.consumosbodegas.setIsDeleted(true);
						
						this.consumosbodegassEliminados.add(this.consumosbodegas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.consumosbodegasLogic.getConsumosBodegass().remove(this.consumosbodegas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.consumosbodegass.remove(this.consumosbodegas);				
					}
					
					
					((ConsumosBodegasModel) this.jTableDatosConsumosBodegas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConsumosBodegas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConsumosBodegas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConsumosBodegas) {
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConsumosBodegas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConsumosBodegas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConsumosBodegas(this.consumosbodegas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConsumosBodegas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConsumosBodegas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConsumosBodegas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsumosBodegas(ConsumosBodegas consumosbodegas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConsumosBodegas(consumosbodegas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConsumosBodegas(ConsumosBodegas consumosbodegas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConsumosBodegas(consumosbodegas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConsumosBodegas(consumosbodegas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConsumosBodegas(consumosbodegas);
	}
	
	public void setVariablesObjetoActualToFormularioConsumosBodegas(ConsumosBodegas consumosbodegas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setText(consumosbodegas.getId().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setText(consumosbodegas.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setText(consumosbodegas.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setText(consumosbodegas.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setText(consumosbodegas.getcosto_total().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setText(consumosbodegas.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setText(consumosbodegas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setText(consumosbodegas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setText(consumosbodegas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setText(consumosbodegas.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConsumosBodegas consumosbodegasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,consumosbodegasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConsumosBodegas consumosbodegasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				consumosbodegasLocal=this.consumosbodegas;
			} else {
				consumosbodegasLocal=this.consumosbodegasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(consumosbodegasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConsumosBodegas(consumosbodegasLocal,true);
					
					if(consumosbodegasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(consumosbodegasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(consumosbodegasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConsumosBodegas(ConsumosBodegas consumosbodegas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsumosBodegas(consumosbodegas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(consumosbodegas);
	}
	
	public void setVariablesFormularioToObjetoActualConsumosBodegas(ConsumosBodegas consumosbodegas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConsumosBodegas(consumosbodegas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConsumosBodegas(ConsumosBodegas consumosbodegas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.getText()==null || this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.getText()=="" || this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.getText()=="Id") {
				this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setText("0");
			}

			if(conColumnasBase) {consumosbodegas.setId(Long.parseLong(this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelIdConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_producto(this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_productoConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_unidad(this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_unidadConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcantidadConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcosto_totalConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_linea(this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_lineaConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_linea_grupo(this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_grupoConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_linea_categoria(this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_categoriaConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setnombre_linea_marca(this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelnombre_linea_marcaConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			consumosbodegas.setcodigo(this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConsumosBodegasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConsumosBodegas.jLabelcodigoConsumosBodegas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConsumosBodegas(ConsumosBodegas consumosbodegasBean,ConsumosBodegas consumosbodegas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConsumosBodegas(ConsumosBodegas consumosbodegasOrigen,ConsumosBodegas consumosbodegas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consumosbodegasOrigen.getId()!=null && !consumosbodegasOrigen.getId().equals(0L))) {consumosbodegas.setId(consumosbodegasOrigen.getId());}}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getfecha_emision_desde()!=null && !consumosbodegasOrigen.getfecha_emision_desde().equals(new Date()))) {consumosbodegas.setfecha_emision_desde(consumosbodegasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getfecha_emision_hasta()!=null && !consumosbodegasOrigen.getfecha_emision_hasta().equals(new Date()))) {consumosbodegas.setfecha_emision_hasta(consumosbodegasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_producto()!=null && !consumosbodegasOrigen.getnombre_producto().equals(""))) {consumosbodegas.setnombre_producto(consumosbodegasOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_unidad()!=null && !consumosbodegasOrigen.getnombre_unidad().equals(""))) {consumosbodegas.setnombre_unidad(consumosbodegasOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getcantidad()!=null && !consumosbodegasOrigen.getcantidad().equals(0))) {consumosbodegas.setcantidad(consumosbodegasOrigen.getcantidad());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getcosto_total()!=null && !consumosbodegasOrigen.getcosto_total().equals(0.0))) {consumosbodegas.setcosto_total(consumosbodegasOrigen.getcosto_total());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_linea()!=null && !consumosbodegasOrigen.getnombre_linea().equals(""))) {consumosbodegas.setnombre_linea(consumosbodegasOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_linea_grupo()!=null && !consumosbodegasOrigen.getnombre_linea_grupo().equals(""))) {consumosbodegas.setnombre_linea_grupo(consumosbodegasOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_linea_categoria()!=null && !consumosbodegasOrigen.getnombre_linea_categoria().equals(""))) {consumosbodegas.setnombre_linea_categoria(consumosbodegasOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getnombre_linea_marca()!=null && !consumosbodegasOrigen.getnombre_linea_marca().equals(""))) {consumosbodegas.setnombre_linea_marca(consumosbodegasOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && consumosbodegasOrigen.getcodigo()!=null && !consumosbodegasOrigen.getcodigo().equals(""))) {consumosbodegas.setcodigo(consumosbodegasOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsumosBodegas(ConsumosBodegas consumosbodegas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setText(consumosbodegas.getId().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setText(consumosbodegas.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setText(consumosbodegas.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setText(consumosbodegas.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setText(consumosbodegas.getcosto_total().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setText(consumosbodegas.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setText(consumosbodegas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setText(consumosbodegas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setText(consumosbodegas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setText(consumosbodegas.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConsumosBodegas(ConsumosBodegasBean consumosbodegasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setText(consumosbodegasBean.getId().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setText(consumosbodegasBean.getnombre_producto());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setText(consumosbodegasBean.getnombre_unidad());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setText(consumosbodegasBean.getcantidad().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setText(consumosbodegasBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setText(consumosbodegasBean.getnombre_linea());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setText(consumosbodegasBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setText(consumosbodegasBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setText(consumosbodegasBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setText(consumosbodegasBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConsumosBodegas(ConsumosBodegasParameterReturnGeneral consumosbodegasReturnGeneral,ConsumosBodegasBean consumosbodegasBean,Boolean conDefault) throws Exception { 
		try {
			ConsumosBodegas consumosbodegasLocal=new ConsumosBodegas();
			
			consumosbodegasLocal=consumosbodegasReturnGeneral.getConsumosBodegas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && consumosbodegasLocal.getId()!=null && !consumosbodegasLocal.getId().equals(0L))) {consumosbodegasBean.setId(consumosbodegasLocal.getId());}}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_producto()!=null && !consumosbodegasLocal.getnombre_producto().equals(""))) {consumosbodegasBean.setnombre_producto(consumosbodegasLocal.getnombre_producto());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_unidad()!=null && !consumosbodegasLocal.getnombre_unidad().equals(""))) {consumosbodegasBean.setnombre_unidad(consumosbodegasLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getcantidad()!=null && !consumosbodegasLocal.getcantidad().equals(0))) {consumosbodegasBean.setcantidad(consumosbodegasLocal.getcantidad());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getcosto_total()!=null && !consumosbodegasLocal.getcosto_total().equals(0.0))) {consumosbodegasBean.setcosto_total(consumosbodegasLocal.getcosto_total());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_linea()!=null && !consumosbodegasLocal.getnombre_linea().equals(""))) {consumosbodegasBean.setnombre_linea(consumosbodegasLocal.getnombre_linea());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_linea_grupo()!=null && !consumosbodegasLocal.getnombre_linea_grupo().equals(""))) {consumosbodegasBean.setnombre_linea_grupo(consumosbodegasLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_linea_categoria()!=null && !consumosbodegasLocal.getnombre_linea_categoria().equals(""))) {consumosbodegasBean.setnombre_linea_categoria(consumosbodegasLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getnombre_linea_marca()!=null && !consumosbodegasLocal.getnombre_linea_marca().equals(""))) {consumosbodegasBean.setnombre_linea_marca(consumosbodegasLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && consumosbodegasLocal.getcodigo()!=null && !consumosbodegasLocal.getcodigo().equals(""))) {consumosbodegasBean.setcodigo(consumosbodegasLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConsumosBodegasGenerico(Long idConsumosBodegasSeleccionado,JComboBox jComboBoxConsumosBodegas,List<ConsumosBodegas> consumosbodegassLocal)throws Exception {
		try {
			ConsumosBodegas  consumosbodegasTemp=null;

			for(ConsumosBodegas consumosbodegasAux:consumosbodegassLocal) {
				if(consumosbodegasAux.getId()!=null && consumosbodegasAux.getId().equals(idConsumosBodegasSeleccionado)) {
					consumosbodegasTemp=consumosbodegasAux;
					break;
				}
			}

			jComboBoxConsumosBodegas.setSelectedItem(consumosbodegasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConsumosBodegasGenerico(JComboBox jComboBoxConsumosBodegas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsumosBodegas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConsumosBodegas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConsumosBodegas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConsumosBodegas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConsumosBodegas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConsumosBodegas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosbodegas=(ConsumosBodegas) consumosbodegasLogic.getConsumosBodegass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consumosbodegas =(ConsumosBodegas) consumosbodegass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!consumosbodegas.getIsNew() && !consumosbodegas.getIsChanged() && !consumosbodegas.getIsDeleted()) {
				sDescripcion=consumosbodegas.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=consumosbodegas.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConsumosBodegas consumosbodegasRow=new ConsumosBodegas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosbodegasRow=(ConsumosBodegas) consumosbodegasLogic.getConsumosBodegass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			consumosbodegasRow=(ConsumosBodegas) consumosbodegass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConsumosBodegas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas));			
			this.jButtonDuplicarConsumosBodegas.setVisible((this.isVisibilidadCeldaDuplicarConsumosBodegas && this.isPermisoDuplicarConsumosBodegas));			
			this.jButtonCopiarConsumosBodegas.setVisible((this.isVisibilidadCeldaCopiarConsumosBodegas && this.isPermisoCopiarConsumosBodegas));
			this.jButtonVerFormConsumosBodegas.setVisible((this.isVisibilidadCeldaVerFormConsumosBodegas && this.isPermisoVerFormConsumosBodegas));
			
			this.jButtonAbrirOrderByConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));			
			
			this.jButtonNuevoRelacionesConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas && this.isPermisoNuevoConsumosBodegas));			
			this.jButtonNuevoGuardarCambiosConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarConsumosBodegas.setVisible((this.isVisibilidadCeldaModificarConsumosBodegas && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.setVisible((this.isVisibilidadCeldaActualizarConsumosBodegas && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.setVisible((this.isVisibilidadCeldaEliminarConsumosBodegas && this.isPermisoEliminarConsumosBodegas));
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.setVisible(this.isVisibilidadCeldaCancelarConsumosBodegas);							
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));			
			
			}
						
			this.jButtonGuardarCambiosTablaConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas));						
			this.jButtonDuplicarToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaDuplicarConsumosBodegas && this.isPermisoDuplicarConsumosBodegas));						
			this.jButtonCopiarToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaCopiarConsumosBodegas && this.isPermisoCopiarConsumosBodegas));			
			this.jButtonVerFormToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaVerFormConsumosBodegas && this.isPermisoVerFormConsumosBodegas));			
			this.jButtonAbrirOrderByToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));
			this.jButtonNuevoRelacionesToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas && this.isPermisoNuevoConsumosBodegas));			
			this.jButtonNuevoGuardarCambiosToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));			
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaModificarConsumosBodegas && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaActualizarConsumosBodegas  && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaEliminarConsumosBodegas && this.isPermisoEliminarConsumosBodegas));
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarToolBarConsumosBodegas.setVisible(this.isVisibilidadCeldaCancelarConsumosBodegas);				
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas));			
			this.jMenuItemDuplicarConsumosBodegas.setVisible((this.isVisibilidadCeldaDuplicarConsumosBodegas && this.isPermisoDuplicarConsumosBodegas));			
			this.jMenuItemCopiarConsumosBodegas.setVisible((this.isVisibilidadCeldaCopiarConsumosBodegas && this.isPermisoCopiarConsumosBodegas));			
			this.jMenuItemVerFormConsumosBodegas.setVisible((this.isVisibilidadCeldaVerFormConsumosBodegas && this.isPermisoVerFormConsumosBodegas));			
			this.jMenuItemAbrirOrderByConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));			
			//this.jMenuItemMostrarOcultarConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));
			this.jMenuItemDetalleAbrirOrderByConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));			
			//this.jMenuItemDetalleMostrarOcultarConsumosBodegas.setVisible((this.isVisibilidadCeldaOrdenConsumosBodegas && this.isPermisoOrdenConsumosBodegas));			
			this.jMenuItemNuevoRelacionesConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas && this.isPermisoNuevoConsumosBodegas));			
			this.jMenuItemNuevoGuardarCambiosConsumosBodegas.setVisible((this.isVisibilidadCeldaNuevoConsumosBodegas && this.isPermisoNuevoConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));									
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemModificarConsumosBodegas.setVisible((this.isVisibilidadCeldaModificarConsumosBodegas && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemActualizarConsumosBodegas.setVisible((this.isVisibilidadCeldaActualizarConsumosBodegas && this.isPermisoActualizarConsumosBodegas));	
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemEliminarConsumosBodegas.setVisible((this.isVisibilidadCeldaEliminarConsumosBodegas && this.isPermisoEliminarConsumosBodegas));
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemCancelarConsumosBodegas.setVisible(this.isVisibilidadCeldaCancelarConsumosBodegas);				
			}
			
			this.jMenuItemGuardarCambiosConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));						
			this.jMenuItemGuardarCambiosTablaConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarCambiosConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConsumosBodegas=this.jButtonNuevoConsumosBodegas.isVisible();
			this.isVisibilidadCeldaDuplicarConsumosBodegas=this.jButtonDuplicarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaCopiarConsumosBodegas=this.jButtonCopiarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaVerFormConsumosBodegas=this.jButtonVerFormConsumosBodegas.isVisible();
			
			this.isVisibilidadCeldaOrdenConsumosBodegas=this.jButtonAbrirOrderByConsumosBodegas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=this.jButtonNuevoRelacionesConsumosBodegas.isVisible();
			this.isVisibilidadCeldaModificarConsumosBodegas=this.jButtonModificarConsumosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.isVisibilidadCeldaActualizarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=this.jButtonGuardarCambiosTablaConsumosBodegas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConsumosBodegas=this.jButtonNuevoToolBarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=this.jButtonNuevoRelacionesToolBarConsumosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.isVisibilidadCeldaModificarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarToolBarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaActualizarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarToolBarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarToolBarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarToolBarConsumosBodegas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsumosBodegas=this.jButtonGuardarCambiosToolBarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=this.jButtonGuardarCambiosTablaToolBarConsumosBodegas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConsumosBodegas=this.jMenuItemNuevoConsumosBodegas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=this.jMenuItemNuevoRelacionesConsumosBodegas.isVisible();
			
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.isVisibilidadCeldaModificarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemModificarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaActualizarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemActualizarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaEliminarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemEliminarConsumosBodegas.isVisible();
			this.isVisibilidadCeldaCancelarConsumosBodegas=this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemCancelarConsumosBodegas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConsumosBodegas=this.jMenuItemGuardarCambiosConsumosBodegas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=this.jMenuItemGuardarCambiosTablaConsumosBodegas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConsumosBodegas(Boolean esInicializar) {
		if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
				//if(this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConsumosBodegas();
			}
			
			this.inicializarActualizarBindingBotonesManualConsumosBodegas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConsumosBodegas() {
		this.jButtonNuevoConsumosBodegas.setVisible(this.isPermisoNuevoConsumosBodegas);			
		this.jButtonDuplicarConsumosBodegas.setVisible(this.isPermisoDuplicarConsumosBodegas);			
		this.jButtonCopiarConsumosBodegas.setVisible(this.isPermisoCopiarConsumosBodegas);			
		this.jButtonVerFormConsumosBodegas.setVisible(this.isPermisoVerFormConsumosBodegas);			
		
		this.jButtonAbrirOrderByConsumosBodegas.setVisible(this.isPermisoOrdenConsumosBodegas);					
		
		this.jButtonNuevoRelacionesConsumosBodegas.setVisible(this.isPermisoNuevoConsumosBodegas);			
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarConsumosBodegas.setVisible(this.isPermisoActualizarConsumosBodegas);	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.setVisible(this.isPermisoActualizarConsumosBodegas);	
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.setVisible(this.isPermisoEliminarConsumosBodegas);
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.setVisible(this.isVisibilidadCeldaCancelarConsumosBodegas);						
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.setVisible(this.isPermisoGuardarCambiosConsumosBodegas);							
		}
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.setVisible(this.isPermisoActualizarConsumosBodegas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConsumosBodegas() {
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarConsumosBodegas.setVisible(this.isPermisoActualizarConsumosBodegas);	
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.setVisible(this.isPermisoActualizarConsumosBodegas);	
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.setVisible(this.isPermisoEliminarConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.setVisible(this.isVisibilidadCeldaCancelarConsumosBodegas);							
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.setVisible((this.isVisibilidadCeldaGuardarConsumosBodegas && this.isPermisoGuardarCambiosConsumosBodegas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConsumosBodegas() {
		if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConsumosBodegas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConsumosBodegas() {
	}
	
	public void jTableDatosConsumosBodegasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConsumosBodegas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.consumosbodegas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConsumosBodegas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.consumosbodegas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderConsumosBodegas.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.consumosbodegas.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderConsumosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.consumosbodegas.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderConsumosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.consumosbodegas.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderConsumosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.consumosbodegas.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaConsumosBodegasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebConsumosBodegas(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConsumosBodegas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConsumosBodegas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.consumosbodegasLogic.getConnexion());

				if(this.consumosbodegas.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.consumosbodegas.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConsumosBodegas=(TitledBorder)this.jScrollPanelDatosConsumosBodegas.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderConsumosBodegas.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.consumosbodegas.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.consumosbodegas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.consumosbodegas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.consumosbodegas.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.consumosbodegas.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.consumosbodegas.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.consumosbodegas.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.consumosbodegas.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.consumosbodegas.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.consumosbodegas.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.consumosbodegas.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoConsumosBodegasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.getconsumosbodegas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.consumosbodegas==null) {
						this.consumosbodegas = new ConsumosBodegas();
					}

					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);
				}

				if(this.consumosbodegas.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.consumosbodegas.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConsumosBodegas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConsumosBodegasConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassBusquedaConsumosBodegas();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdEmpresa();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdLinea();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdLineaCategoria();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdLineaGrupo();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdLineaMarca();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionConsumosBodegasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConsumosBodegas(false,false);

			this.getConsumosBodegassFK_IdTransaccion();

			this.inicializarActualizarBindingConsumosBodegas(false);

			//if(ConsumosBodegasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConsumosBodegas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.consumosbodegasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConsumosBodegas() {
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
			this.jInternalFrameDetalleFormConsumosBodegas.setVisible(false);	    			
			this.jInternalFrameDetalleFormConsumosBodegas.dispose();
			this.jInternalFrameDetalleFormConsumosBodegas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
			this.jInternalFrameReporteDinamicoConsumosBodegas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConsumosBodegas.dispose();
			this.jInternalFrameReporteDinamicoConsumosBodegas=null;
		}
		
		if(this.jInternalFrameImportacionConsumosBodegas!=null) {
			this.jInternalFrameImportacionConsumosBodegas.setVisible(false);	    			
			this.jInternalFrameImportacionConsumosBodegas.dispose();
			this.jInternalFrameImportacionConsumosBodegas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConsumosBodegas();
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			
			if(sTipo.equals("NuevoConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConsumosBodegas")) {
				jButtonDuplicarConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConsumosBodegas")) {
				jButtonCopiarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("VerFormConsumosBodegas")) {
				jButtonVerFormConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConsumosBodegas")) {
				jButtonDuplicarConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConsumosBodegas")) {
				jButtonDuplicarConsumosBodegasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConsumosBodegas")) {
				jButtonModificarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConsumosBodegas")) {
				jButtonModificarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConsumosBodegas")) {
				jButtonModificarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConsumosBodegas")) {
				jButtonActualizarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConsumosBodegas")) {
				jButtonActualizarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConsumosBodegas")) {
				jButtonActualizarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("EliminarConsumosBodegas")) {
				jButtonEliminarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConsumosBodegas")) {
				jButtonEliminarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConsumosBodegas")) {
				jButtonEliminarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CancelarConsumosBodegas")) {
				jButtonCancelarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConsumosBodegas")) {
				jButtonCancelarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConsumosBodegas")) {
				jButtonCancelarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CerrarConsumosBodegas")) {
				jButtonCerrarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConsumosBodegas")) {
				jButtonCerrarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConsumosBodegas")) {
				jButtonCerrarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConsumosBodegas")) {
				jButtonMostrarOcultarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConsumosBodegas")) {
				jButtonCancelarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConsumosBodegas")) {
				jButtonCopiarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConsumosBodegas")) {
				jButtonVerFormConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConsumosBodegas")) {
				jButtonCopiarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConsumosBodegas")) {
				jButtonVerFormConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConsumosBodegas")) {
				jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConsumosBodegas")) {
				jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConsumosBodegas")) {
				jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConsumosBodegas")) {
				jButtonAnterioresConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConsumosBodegas")) {
				jButtonAnterioresConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConsumosBodegas")) {
				jButtonAnterioresConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConsumosBodegas")) {
				jButtonSiguientesConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConsumosBodegas")) {
				jButtonSiguientesConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConsumosBodegas")) {
				jButtonSiguientesConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConsumosBodegas") || sTipo.equals("MenuItemDetalleAbrirOrderByConsumosBodegas")) {
				jButtonAbrirOrderByConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConsumosBodegas") || sTipo.equals("MenuItemDetalleMostrarOcultarConsumosBodegas")) {
				jButtonMostrarOcultarConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConsumosBodegas")) {
				jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConsumosBodegas")) {
				jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConsumosBodegas")) {
				jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConsumosBodegas")) {
				jButtonCerrarReporteDinamicoConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConsumosBodegas")) {
				jButtonGenerarReporteDinamicoConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConsumosBodegas")) {
				
				jButtonGenerarExcelReporteDinamicoConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConsumosBodegas")) {
				jButtonCerrarImportacionConsumosBodegasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConsumosBodegas")) {
				
				jButtonGenerarImportacionConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConsumosBodegas")) {
				
				jButtonAbrirImportacionConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConsumosBodegas")) {
				jComboBoxTiposAccionesConsumosBodegasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConsumosBodegas")) {
				jComboBoxTiposRelacionesConsumosBodegasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConsumosBodegas")) {
				jComboBoxTiposAccionesConsumosBodegasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConsumosBodegas")) {
				
				jComboBoxTiposSeleccionarConsumosBodegasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConsumosBodegas")) {
				jTextFieldValorCampoGeneralConsumosBodegasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConsumosBodegas")) {
				jButtonAbrirOrderByConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConsumosBodegas")) {
				jButtonAbrirOrderByConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConsumosBodegas")) {
				jButtonCerrarOrderByConsumosBodegasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsumosBodegasBusqueda")) {
				this.jButtonidConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsumosBodegasUpdate")) {
				this.jButtonid_empresaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsumosBodegasBusqueda")) {
				this.jButtonid_empresaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionConsumosBodegasUpdate")) {
				this.jButtonid_transaccionConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionConsumosBodegasBusqueda")) {
				this.jButtonid_transaccionConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConsumosBodegasUpdate")) {
				this.jButtonid_lineaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConsumosBodegasBusqueda")) {
				this.jButtonid_lineaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosBodegasUpdate")) {
				this.jButtonid_linea_grupoConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosBodegasBusqueda")) {
				this.jButtonid_linea_grupoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosBodegasUpdate")) {
				this.jButtonid_linea_categoriaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosBodegasBusqueda")) {
				this.jButtonid_linea_categoriaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosBodegasUpdate")) {
				this.jButtonid_linea_marcaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosBodegasBusqueda")) {
				this.jButtonid_linea_marcaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeConsumosBodegasBusqueda")) {
				this.jButtonfecha_emision_desdeConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaConsumosBodegasBusqueda")) {
				this.jButtonfecha_emision_hastaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoConsumosBodegasBusqueda")) {
				this.jButtonnombre_productoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConsumosBodegasBusqueda")) {
				this.jButtonnombre_unidadConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsumosBodegasBusqueda")) {
				this.jButtoncantidadConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalConsumosBodegasBusqueda")) {
				this.jButtoncosto_totalConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaConsumosBodegasBusqueda")) {
				this.jButtonnombre_lineaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_grupoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_categoriaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_marcaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConsumosBodegasBusqueda")) {
				this.jButtoncodigoConsumosBodegasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConsumosBodegasConsumosBodegas")) {
				this.jButtonBusquedaConsumosBodegasConsumosBodegasActionPerformed(evt);
			}
			
			;
			
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConsumosBodegas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConsumosBodegas consumosbodegasLocal=null;
			
			if(!this.getEsControlTabla()) {
				consumosbodegasLocal=this.consumosbodegas;
			} else {
				consumosbodegasLocal=this.consumosbodegasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
							
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
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
			
			


			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
								
						
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
								
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
							
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
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
			
			


			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
								
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConsumosBodegas")) {
					jCheckBoxSeleccionarTodosConsumosBodegasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConsumosBodegas")) {
					jCheckBoxSeleccionadosConsumosBodegasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConsumosBodegas")) {
					
				}
				
				


				
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
												
				
				


				
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
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
			
			


			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConsumosBodegasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.consumosbodegas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.consumosbodegas);
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
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
				
				


				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConsumosBodegas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConsumosBodegas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConsumosBodegasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.consumosbodegasAnterior =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConsumosBodegas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConsumosBodegasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConsumosBodegas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.consumosbodegas =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.consumosbodegas =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.consumosbodegas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConsumosBodegas")) {
				
				}
				
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConsumosBodegas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConsumosBodegas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConsumosBodegas")) {
			
			}
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConsumosBodegas();
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			if(sTipo.equals("NuevoConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConsumosBodegas")) {
				jButtonDuplicarConsumosBodegasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConsumosBodegas")) {
				jButtonCopiarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConsumosBodegas")) {
				jButtonVerFormConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConsumosBodegas")) {
				jButtonNuevoConsumosBodegasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConsumosBodegas")) {
				jButtonModificarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConsumosBodegas")) {
				jButtonActualizarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConsumosBodegas")) {
				jButtonEliminarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConsumosBodegas")) {
				jButtonCancelarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConsumosBodegas")) {
				jButtonCerrarConsumosBodegasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConsumosBodegas")) {
				jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConsumosBodegas")) {
				jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConsumosBodegas")) {
				jButtonAbrirOrderByConsumosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConsumosBodegas")) {
				jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConsumosBodegas")) {
				jButtonAnterioresConsumosBodegasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConsumosBodegas")) {
				jButtonSiguientesConsumosBodegasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConsumosBodegasBusqueda")) {
				this.jButtonidConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConsumosBodegasUpdate")) {
				this.jButtonid_empresaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConsumosBodegasBusqueda")) {
				this.jButtonid_empresaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionConsumosBodegasUpdate")) {
				this.jButtonid_transaccionConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionConsumosBodegasBusqueda")) {
				this.jButtonid_transaccionConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConsumosBodegasUpdate")) {
				this.jButtonid_lineaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConsumosBodegasBusqueda")) {
				this.jButtonid_lineaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosBodegasUpdate")) {
				this.jButtonid_linea_grupoConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConsumosBodegasBusqueda")) {
				this.jButtonid_linea_grupoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosBodegasUpdate")) {
				this.jButtonid_linea_categoriaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConsumosBodegasBusqueda")) {
				this.jButtonid_linea_categoriaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosBodegasUpdate")) {
				this.jButtonid_linea_marcaConsumosBodegasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConsumosBodegasBusqueda")) {
				this.jButtonid_linea_marcaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeConsumosBodegasBusqueda")) {
				this.jButtonfecha_emision_desdeConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaConsumosBodegasBusqueda")) {
				this.jButtonfecha_emision_hastaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoConsumosBodegasBusqueda")) {
				this.jButtonnombre_productoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConsumosBodegasBusqueda")) {
				this.jButtonnombre_unidadConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadConsumosBodegasBusqueda")) {
				this.jButtoncantidadConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalConsumosBodegasBusqueda")) {
				this.jButtoncosto_totalConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaConsumosBodegasBusqueda")) {
				this.jButtonnombre_lineaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_grupoConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_categoriaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaConsumosBodegasBusqueda")) {
				this.jButtonnombre_linea_marcaConsumosBodegasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConsumosBodegasBusqueda")) {
				this.jButtoncodigoConsumosBodegasBusquedaActionPerformed(evt);
			}
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConsumosBodegas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConsumosBodegas")) {
				closingInternalFrameConsumosBodegas();
				
			} else if(sTipo.equals("jButtonCancelarConsumosBodegas")) {
				JInternalFrameBase jInternalFrameDetalleFormConsumosBodegas = (JInternalFrameBase)evt.getSource();
	            	
	            ConsumosBodegasBeanSwingJInternalFrame jInternalFrameParent=(ConsumosBodegasBeanSwingJInternalFrame)jInternalFrameDetalleFormConsumosBodegas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConsumosBodegasActionPerformed(null);
			}
			
			ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.consumosbodegas,new Object(),this.consumosbodegasParameterGeneral,this.consumosbodegasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConsumosBodegas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConsumosBodegas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConsumosBodegas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.consumosbodegas)) {
			if(!esControlTabla) {
				if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);			
				}
				
				if(this.consumosbodegasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConsumosBodegas(this.consumosbodegas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConsumosBodegas(this.consumosbodegasReturnGeneral,this.consumosbodegasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.consumosbodegasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConsumosBodegas(classes,this.consumosbodegasReturnGeneral,this.consumosbodegasBean,false);
					}
						
					if(this.consumosbodegasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas());	
					}
						
					if(this.consumosbodegasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConsumosBodegas(this.consumosbodegasReturnGeneral.getConsumosBodegas(),classes);//this.consumosbodegasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConsumosBodegas(this.consumosbodegas,classes);//this.consumosbodegasBean);									
				}
			
				if(ConsumosBodegasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConsumosBodegas(this.consumosbodegas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConsumosBodegas(this.consumosbodegas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.consumosbodegasAnterior!=null) {
						this.consumosbodegas=this.consumosbodegasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.consumosbodegasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.consumosbodegasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.consumosbodegasReturnGeneral.getConsumosBodegas(),consumosbodegasLogic.getConsumosBodegass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.consumosbodegasReturnGeneral.getConsumosBodegas(),this.consumosbodegass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConsumosBodegas.repaint();
				
				//((AbstractTableModel) this.jTableDatosConsumosBodegas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConsumosBodegas();
			}
		}
	}
	
	public void actualizarVisualTableDatosConsumosBodegas() throws Exception {
		
		ConsumosBodegasModel consumosbodegasModel=(ConsumosBodegasModel)this.jTableDatosConsumosBodegas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			consumosbodegasModel.consumosbodegass=this.consumosbodegasLogic.getConsumosBodegass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			consumosbodegasModel.consumosbodegass=this.consumosbodegass;
		}
		
		
		((ConsumosBodegasModel) this.jTableDatosConsumosBodegas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConsumosBodegas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconsumosbodegasAnterior(),this.consumosbodegasLogic.getConsumosBodegass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconsumosbodegasAnterior(),this.consumosbodegass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConsumosBodegas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConsumosBodegas(ConsumosBodegas consumosbodegas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
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
										
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consumosbodegas,new Object(),generalEntityParameterGeneral,this.consumosbodegasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.consumosbodegasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConsumosBodegasConstantesFunciones.getClassesRelationshipsOfConsumosBodegas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConsumosBodegasConstantesFunciones.getClassesRelationshipsFromStringsOfConsumosBodegas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConsumosBodegas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConsumosBodegasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.consumosbodegas,new Object(),generalEntityParameterGeneral,this.consumosbodegasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConsumosBodegas(ConsumosBodegasBean consumosbodegasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConsumosBodegas(ArrayList<Classe> classes,ConsumosBodegasReturnGeneral consumosbodegasReturnGeneral,ConsumosBodegasBean consumosbodegasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConsumosBodegas(ConsumosBodegas consumosbodegas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.consumosbodegas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConsumosBodegas = new ConsumosBodegasDetalleFormJInternalFrame(jDesktopPane,this.consumosbodegasSessionBean.getConGuardarRelaciones(),this.consumosbodegasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.setVisible(false);
		this.jInternalFrameDetalleFormConsumosBodegas.setSelected(false);						
		
		this.jInternalFrameDetalleFormConsumosBodegas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConsumosBodegas.consumosbodegasLogic=this.consumosbodegasLogic;
		
		this.cargarCombosFrameForeignKeyConsumosBodegas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConsumosBodegas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConsumosBodegas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConsumosBodegas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConsumosBodegas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConsumosBodegas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsumosBodegas"));
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ModificarConsumosBodegas"));

		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsumosBodegas"));
					
		this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemModificarConsumosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsumosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.addActionListener (new ButtonActionListener(this,"ActualizarConsumosBodegas"));
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsumosBodegas"));
						
		this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemActualizarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsumosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.addActionListener (new ButtonActionListener(this,"EliminarConsumosBodegas"));
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsumosBodegas"));
								
		this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemEliminarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsumosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CancelarConsumosBodegas"));
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsumosBodegas"));
					
		this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemCancelarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsumosBodegas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemDetalleCerrarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsumosBodegas"));		
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosBodegas"));
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosBodegas"));
		
		
		
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsumosBodegas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonidConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_desdeConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_hastaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_productoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_unidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncantidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncosto_totalConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncodigoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosBodegasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsumosBodegas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConsumosBodegas"));
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConsumosBodegas"));
		}
		
		this.jTableDatosConsumosBodegas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConsumosBodegas"));
		
		this.jTableDatosConsumosBodegas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConsumosBodegas"));
		
		this.jButtonNuevoConsumosBodegas.addActionListener(new ButtonActionListener(this,"NuevoConsumosBodegas"));
		
		this.jButtonDuplicarConsumosBodegas.addActionListener(new ButtonActionListener(this,"DuplicarConsumosBodegas"));
		
		this.jButtonCopiarConsumosBodegas.addActionListener(new ButtonActionListener(this,"CopiarConsumosBodegas"));
		
		this.jButtonVerFormConsumosBodegas.addActionListener(new ButtonActionListener(this,"VerFormConsumosBodegas"));
		
		
		this.jButtonNuevoToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"NuevoToolBarConsumosBodegas"));
			
		this.jButtonDuplicarToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConsumosBodegas"));
			
		this.jMenuItemNuevoConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConsumosBodegas"));
			
		this.jMenuItemDuplicarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConsumosBodegas"));		
		
		
		this.jButtonNuevoRelacionesConsumosBodegas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConsumosBodegas"));
		
		
		this.jButtonNuevoRelacionesToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConsumosBodegas"));
			
		this.jMenuItemNuevoRelacionesConsumosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConsumosBodegas"));		
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ModificarConsumosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonModificarToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ModificarToolBarConsumosBodegas"));
			
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemModificarConsumosBodegas.addActionListener(new ButtonActionListener(this,"MenuItemModificarConsumosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarConsumosBodegas.addActionListener (new ButtonActionListener(this,"ActualizarConsumosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonActualizarToolBarConsumosBodegas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConsumosBodegas"));
				
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemActualizarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConsumosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarConsumosBodegas.addActionListener (new ButtonActionListener(this,"EliminarConsumosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonEliminarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"EliminarToolBarConsumosBodegas"));
						
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemEliminarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConsumosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CancelarConsumosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonCancelarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CancelarToolBarConsumosBodegas"));
			
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemCancelarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConsumosBodegas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConsumosBodegas"));		
		
		
		this.jButtonCerrarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CerrarConsumosBodegas"));
		
		
		this.jButtonCerrarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CerrarToolBarConsumosBodegas"));
			
		this.jMenuItemCerrarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConsumosBodegas"));
			
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jMenuItemDetalleCerrarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConsumosBodegas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosConsumosBodegas"));
		}
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConsumosBodegas"));
		}
		
		this.jButtonCopiarToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"CopiarToolBarConsumosBodegas"));
			
		this.jButtonVerFormToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"VerFormToolBarConsumosBodegas"));
		
		this.jMenuItemGuardarCambiosConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConsumosBodegas"));
			
		this.jMenuItemCopiarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConsumosBodegas"));		
		
		this.jMenuItemVerFormConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConsumosBodegas"));		
		
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsumosBodegas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConsumosBodegas"));
			
		this.jMenuItemGuardarCambiosTablaConsumosBodegas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConsumosBodegas"));		
		
		
		
		this.jButtonRecargarInformacionConsumosBodegas.addActionListener (new ButtonActionListener(this,"RecargarInformacionConsumosBodegas"));
					
		this.jButtonRecargarInformacionToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConsumosBodegas"));
		
		this.jMenuItemRecargarInformacionConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConsumosBodegas"));		
		
		
		
		this.jButtonAnterioresConsumosBodegas.addActionListener (new ButtonActionListener(this,"AnterioresConsumosBodegas"));
		
		
		this.jButtonAnterioresToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConsumosBodegas"));
		
		this.jMenuItemAnterioresConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConsumosBodegas"));		
		
		
		this.jButtonSiguientesConsumosBodegas.addActionListener (new ButtonActionListener(this,"SiguientesConsumosBodegas"));
		
		
		this.jButtonSiguientesToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConsumosBodegas"));
			
		this.jMenuItemSiguientesConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConsumosBodegas"));
			
		this.jMenuItemAbrirOrderByConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConsumosBodegas"));
			
		this.jMenuItemMostrarOcultarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConsumosBodegas"));
			
		this.jMenuItemDetalleAbrirOrderByConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConsumosBodegas"));
			
		this.jMenuItemDetalleMostarOcultarConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConsumosBodegas"));		
		
		
		this.jButtonNuevoGuardarCambiosConsumosBodegas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConsumosBodegas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConsumosBodegas"));
			
		this.jMenuItemNuevoGuardarCambiosConsumosBodegas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConsumosBodegas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConsumosBodegas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConsumosBodegas"));

		this.jCheckBoxSeleccionadosConsumosBodegas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConsumosBodegas"));
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConsumosBodegas"));
		}
		
		
		this.jComboBoxTiposRelacionesConsumosBodegas.addActionListener (new ButtonActionListener(this,"TiposRelacionesConsumosBodegas"));
			
		this.jComboBoxTiposAccionesConsumosBodegas.addActionListener (new ButtonActionListener(this,"TiposAccionesConsumosBodegas"));
					
		this.jComboBoxTiposSeleccionarConsumosBodegas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConsumosBodegas"));
			
		this.jTextFieldValorCampoGeneralConsumosBodegas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConsumosBodegas"));		
		
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonidConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_desdeConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_hastaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_productoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_unidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncantidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncosto_totalConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncodigoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosBodegasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConsumosBodegasConsumosBodegas.addActionListener(new ButtonActionListener(this,"BusquedaConsumosBodegasConsumosBodegas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConsumosBodegas!=null) {
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosBodegas"));
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosBodegas"));
				this.jInternalFrameReporteDinamicoConsumosBodegas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosBodegas"));
			}
			
			//this.jButtonCerrarReporteDinamicoConsumosBodegas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConsumosBodegas"));				
			//this.jButtonGenerarReporteDinamicoConsumosBodegas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConsumosBodegas"));
			//this.jButtonGenerarExcelReporteDinamicoConsumosBodegas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConsumosBodegas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConsumosBodegas!=null) {
				this.jInternalFrameImportacionConsumosBodegas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConsumosBodegas"));
				this.jInternalFrameImportacionConsumosBodegas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConsumosBodegas"));
				this.jInternalFrameImportacionConsumosBodegas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConsumosBodegas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConsumosBodegas.addActionListener (new ButtonActionListener(this,"AbrirOrderByConsumosBodegas"));
			
			this.jButtonAbrirOrderByToolBarConsumosBodegas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConsumosBodegas"));			
			
			if(this.jInternalFrameOrderByConsumosBodegas!=null) {
				this.jInternalFrameOrderByConsumosBodegas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConsumosBodegas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConsumosBodegas.jTabbedPaneRelacionesConsumosBodegas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConsumosBodegas"));
		
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
            		closingInternalFrameConsumosBodegas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConsumosBodegas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConsumosBodegas = (JInternalFrameBase)event.getSource();
	            	
	            ConsumosBodegasBeanSwingJInternalFrame jInternalFrameParent=(ConsumosBodegasBeanSwingJInternalFrame)jInternalFrameDetalleFormConsumosBodegas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConsumosBodegasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConsumosBodegas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConsumosBodegasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConsumosBodegas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConsumosBodegas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConsumosBodegas";
		inputMap = this.jButtonNuevoConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsumosBodegasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConsumosBodegasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConsumosBodegas";
		inputMap = this.jButtonNuevoRelacionesConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConsumosBodegasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConsumosBodegas";
		inputMap = this.jButtonModificarConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConsumosBodegas";
		inputMap = this.jButtonActualizarConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConsumosBodegas";
		inputMap = this.jButtonEliminarConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConsumosBodegas";
		inputMap = this.jButtonCancelarConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConsumosBodegas";
		inputMap = this.jButtonCerrarConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConsumosBodegas";
		inputMap = this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonGuardarCambiosConsumosBodegas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConsumosBodegasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConsumosBodegas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConsumosBodegasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConsumosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConsumosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConsumosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConsumosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConsumosBodegas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConsumosBodegasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonidConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"idConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_empresaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_transaccionConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConsumosBodegasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonid_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_desdeConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonfecha_emision_hastaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_productoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_unidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncantidadConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncosto_totalConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_lineaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_grupoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_categoriaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtonnombre_linea_marcaConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaConsumosBodegasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConsumosBodegas.jButtoncodigoConsumosBodegasBusqueda.addActionListener(new ButtonActionListener(this,"codigoConsumosBodegasBusqueda"));
		
		
		this.jButtonBusquedaConsumosBodegasConsumosBodegas.addActionListener(new ButtonActionListener(this,"BusquedaConsumosBodegasConsumosBodegas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConsumosBodegas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConsumosBodegasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConsumosBodegasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConsumosBodegas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConsumosBodegas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
					consumosbodegasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosBodegas consumosbodegasAux:consumosbodegass) {
					consumosbodegasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConsumosBodegasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
						consumosbodegasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosBodegas consumosbodegasAux:consumosbodegass) {
						consumosbodegasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosBodegas consumosbodegasAux:consumosbodegass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsumosBodegas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsumosBodegas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConsumosBodegasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConsumosBodegas.getSelectedRows();
			
			ConsumosBodegas consumosbodegasLocal=new ConsumosBodegas();
			
			//this.seleccionarTodosConsumosBodegas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					consumosbodegasLocal =(ConsumosBodegas) this.consumosbodegasLogic.getConsumosBodegass().toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					consumosbodegasLocal =(ConsumosBodegas) this.consumosbodegass.toArray()[this.jTableDatosConsumosBodegas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				consumosbodegasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
						consumosbodegasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConsumosBodegas consumosbodegasAux:consumosbodegass) {
						consumosbodegasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConsumosBodegas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConsumosBodegas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConsumosBodegas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConsumosBodegasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConsumosBodegasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConsumosBodegasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConsumosBodegas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConsumosBodegas consumosbodegasAux:this.consumosbodegasLogic.getConsumosBodegass()) {
				
						if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							consumosbodegasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							consumosbodegasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							consumosbodegasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							consumosbodegasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consumosbodegasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							consumosbodegasAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							consumosbodegasAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosBodegas consumosbodegasAux:consumosbodegass) {
					
						if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							consumosbodegasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							consumosbodegasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							consumosbodegasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							consumosbodegasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							consumosbodegasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							consumosbodegasAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							consumosbodegasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							consumosbodegasAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConsumosBodegas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConsumosBodegasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConsumosBodegas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConsumosBodegas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConsumosBodegas) {				
					conSplash=true;//false;										
					
					//this.startProcessConsumosBodegas(conSplash);
				
					this.generarReporteConsumosBodegassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConsumosBodegassSeleccionados();
				//this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsumosBodegassSeleccionados(false);
				//this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConsumosBodegassSeleccionados(true);
				//this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsumosBodegas();
				
				this.exportarConsumosBodegassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConsumosBodegass();
				//this.importarConsumosBodegass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConsumosBodegas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConsumosBodegassSeleccionados();
				//this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Consumos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConsumosBodegas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConsumosBodegas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConsumosBodegas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
				}	
			} 			
			else if(ConsumosBodegasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConsumosBodegas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConsumosBodegas(conSplash);
					
						//this.actualizarParametrosGeneralConsumosBodegas();
						
						this.generarReporteProcesoAccionConsumosBodegassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConsumosBodegasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Consumos BodegasES SELECCIONADOS?", "MANTENIMIENTO DE Consumos Bodegas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConsumosBodegas();
				
						this.actualizarParametrosGeneralConsumosBodegas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.consumosbodegasReturnGeneral=consumosbodegasLogic.procesarAccionConsumosBodegassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.consumosbodegasLogic.getConsumosBodegass(),this.consumosbodegasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConsumosBodegasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConsumosBodegas();
					
					ConsumosBodegasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConsumosBodegasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConsumosBodegas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxTiposAccionesFormularioConsumosBodegas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConsumosBodegas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConsumosBodegasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConsumosBodegas();
			
			if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
			ConsumosBodegas consumosbodegas=new ConsumosBodegas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConsumosBodegas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConsumosBodegas.getSelectedItem();
			
			
			
			
			consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
			//this.sTipoAccion;
			
			if(consumosbodegassSeleccionados.size()==1) {
				for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
					consumosbodegas=consumosbodegasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConsumosBodegas();
			
      		//this.finishProcessConsumosBodegas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConsumosBodegasReturnGeneral() throws Exception {
		if(this.consumosbodegasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.consumosbodegasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.consumosbodegasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.consumosbodegasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.consumosbodegasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.consumosbodegasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConsumosBodegas(false);
		}
		
		if(this.consumosbodegasReturnGeneral.getConRetornoLista() || this.consumosbodegasReturnGeneral.getConRetornoObjeto()) {
			if(this.consumosbodegasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.consumosbodegasLogic.setConsumosBodegass(this.consumosbodegasReturnGeneral.getConsumosBodegass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConsumosBodegas(false);
		}
	}
	
	public void actualizarParametrosGeneralConsumosBodegas() throws Exception {
		
		
	}
	
	public ArrayList<ConsumosBodegas> getConsumosBodegassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConsumosBodegas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConsumosBodegas consumosbodegasAux:consumosbodegasLogic.getConsumosBodegass()) {
					if(consumosbodegasAux.getIsSelected()) {
						consumosbodegassSeleccionados.add(consumosbodegasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConsumosBodegas consumosbodegasAux:this.consumosbodegass) {
					if(consumosbodegasAux.getIsSelected()) {
						consumosbodegassSeleccionados.add(consumosbodegasAux);				
					}
				}
			}
			
			if(consumosbodegassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						consumosbodegassSeleccionados.addAll(this.consumosbodegasLogic.getConsumosBodegass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						consumosbodegassSeleccionados.addAll(this.consumosbodegass);				
					}
				}
			}
		} else {
			consumosbodegassSeleccionados.add(this.consumosbodegas);
		}
		
		return consumosbodegassSeleccionados;
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
	
	public void generarReporteConsumosBodegassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConsumosBodegassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConsumosBodegassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsumosBodegassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConsumosBodegassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Consumos Bodegas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados);
		
	}	
	
	public void generarReporteNormalConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConsumosBodegassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConsumosBodegas();
		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConsumosBodegas();
		
		
		//this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados ,consumosbodegasImplementable,consumosbodegasImplementableHome);
	}
	
	public void mostrarImportacionConsumosBodegass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConsumosBodegas();
		
		this.abrirFrameImportacionConsumosBodegas();		
		
			
		//this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados ,consumosbodegasImplementable,consumosbodegasImplementableHome);
	}
	
	public void importarConsumosBodegass() throws Exception {		
	
	}
	
	public void exportarConsumosBodegassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConsumosBodegassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConsumosBodegassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConsumosBodegassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Consumos Bodegas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConsumosBodegas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConsumosBodegas(consumosbodegasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//consumosbodegasAux.setsDetalleGeneralEntityReporte(consumosbodegasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConsumosBodegas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConsumosBodegasConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConsumosBodegas(ConsumosBodegas consumosbodegas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=consumosbodegas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=consumosbodegas.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConsumosBodegass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConsumosBodegas(row);				
				iRow++;
			}				
			
			for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConsumosBodegas(consumosbodegasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConsumosBodegassSeleccionados() throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();		
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"consumosbodegas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("consumosbodegass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("consumosbodegas");
			//elementRoot.appendChild(element);
		
			for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
				element = document.createElement("consumosbodegas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConsumosBodegas(consumosbodegasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Consumos Bodegas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConsumosBodegas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConsumosBodegasConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConsumosBodegas(ConsumosBodegas consumosbodegas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(consumosbodegas.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlConsumosBodegas(ConsumosBodegas consumosbodegas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConsumosBodegasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(consumosbodegas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConsumosBodegasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(consumosbodegas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(consumosbodegas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtransaccion_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(consumosbodegas.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementlinea_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(consumosbodegas.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(consumosbodegas.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(consumosbodegas.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ConsumosBodegasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(consumosbodegas.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(ConsumosBodegasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(consumosbodegas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ConsumosBodegasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(consumosbodegas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_producto = document.createElement(ConsumosBodegasConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(consumosbodegas.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(ConsumosBodegasConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(consumosbodegas.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad = document.createElement(ConsumosBodegasConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(consumosbodegas.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto_total = document.createElement(ConsumosBodegasConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(consumosbodegas.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementnombre_linea = document.createElement(ConsumosBodegasConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(consumosbodegas.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ConsumosBodegasConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(consumosbodegas.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ConsumosBodegasConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(consumosbodegas.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ConsumosBodegasConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(consumosbodegas.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ConsumosBodegasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(consumosbodegas.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoConsumosBodegassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConsumosBodegas> consumosbodegassSeleccionados=new ArrayList<ConsumosBodegas>();
		
		consumosbodegassSeleccionados=this.getConsumosBodegassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConsumosBodegas(consumosbodegassSeleccionados);
		
		this.generarReporteConsumosBodegass("Todos",consumosbodegassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConsumosBodegas(ArrayList<ConsumosBodegas> consumosbodegassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConsumosBodegas consumosbodegasAux:consumosbodegassSeleccionados) {
				consumosbodegasAux.setsDetalleGeneralEntityReporte(consumosbodegasAux.toString());
			
				if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consumosbodegasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(consumosbodegasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ConsumosBodegasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					consumosbodegasAux.setsDescripcionGeneralEntityReporte1(consumosbodegasAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConsumosBodegasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConsumosBodegas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConsumosBodegas=true;
				this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=true;
				this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=true;
			}
			
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=true;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=true;
			this.isVisibilidadCeldaEliminarConsumosBodegas=true;
			this.isVisibilidadCeldaCancelarConsumosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=true;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=true;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=true;
			this.isVisibilidadCeldaModificarConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=true;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
			this.isVisibilidadCeldaModificarConsumosBodegas=true;
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
			this.isVisibilidadCeldaCancelarConsumosBodegas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				} else {
					this.isVisibilidadCeldaGuardarConsumosBodegas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConsumosBodegasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConsumosBodegas=true;
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=true;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=true;
		} else {
			this.actualizarEstadoPanelsConsumosBodegas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConsumosBodegas=false;
			//this.isVisibilidadCeldaVerFormConsumosBodegas=false;
			this.isVisibilidadCeldaDuplicarConsumosBodegas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!consumosbodegasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
		} else {
			this.isVisibilidadCeldaNuevoConsumosBodegas=false;
			this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(!consumosbodegasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;												
			}
			
			this.jButtonCerrarConsumosBodegas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
		}
		
		if(!this.permiteMantenimiento(this.consumosbodegas)) {
			this.isVisibilidadCeldaActualizarConsumosBodegas=false;
			this.isVisibilidadCeldaEliminarConsumosBodegas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConsumosBodegas=false;
		this.isVisibilidadCeldaNuevoRelacionesConsumosBodegas=false;
		this.isVisibilidadCeldaGuardarCambiosConsumosBodegas=false;
		//this.isVisibilidadCeldaModificarConsumosBodegas=true;
		this.isVisibilidadCeldaActualizarConsumosBodegas=false;
		this.isVisibilidadCeldaEliminarConsumosBodegas=false;
		//this.isVisibilidadCeldaCancelarConsumosBodegas=true;			
		this.isVisibilidadCeldaGuardarConsumosBodegas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConsumosBodegas() {
	}
	
	public void actualizarEstadoPanelsConsumosBodegas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConsumosBodegas!=null) {
				this.jScrollPanelDatosEdicionConsumosBodegas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConsumosBodegas!=null) {
				this.jScrollPanelDatosConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelPaginacionConsumosBodegas!=null) {
				this.jPanelPaginacionConsumosBodegas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
					this.jTabbedPaneBusquedasConsumosBodegas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.consumosbodegasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConsumosBodegas!=null) {
				this.jTabbedPaneBusquedasConsumosBodegas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConsumosBodegas!=null) {
				this.jPanelParametrosReportesConsumosBodegas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConsumosBodegas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaConsumosBodegas=isParaTransaccion;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaConsumosBodegas=isParaLinea;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaConsumosBodegas=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaConsumosBodegas=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaConsumosBodegas=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaConsumosBodegas) {this.jTabbedPaneBusquedasConsumosBodegas.remove(jPanelBusquedaConsumosBodegasConsumosBodegas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConsumosBodegas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConsumosBodegas() {
		this.updateBorderResaltarBusquedasFormularioConsumosBodegas();
		this.updateVisibilidadBusquedasFormularioConsumosBodegas();
		this.updateHabilitarBusquedasFormularioConsumosBodegas();
	}
	
	public void updateBorderResaltarBusquedasFormularioConsumosBodegas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConsumosBodegas.getComponents().length>0) {
	

		if(this.consumosbodegasConstantesFunciones.resaltarBusquedaConsumosBodegasConsumosBodegas!=null) {
			index= this.jTabbedPaneBusquedasConsumosBodegas.indexOfComponent(this.jPanelBusquedaConsumosBodegasConsumosBodegas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosBodegas.getComponent(index);
				jPanel.setBorder(this.consumosbodegasConstantesFunciones.resaltarBusquedaConsumosBodegasConsumosBodegas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConsumosBodegas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConsumosBodegas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsumosBodegas.indexOfComponent(this.jPanelBusquedaConsumosBodegasConsumosBodegas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosBodegas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.consumosbodegasConstantesFunciones.mostrarBusquedaConsumosBodegasConsumosBodegas);
			if(!this.consumosbodegasConstantesFunciones.mostrarBusquedaConsumosBodegasConsumosBodegas && index>-1) {
				this.jTabbedPaneBusquedasConsumosBodegas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConsumosBodegas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConsumosBodegas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConsumosBodegas.indexOfComponent(this.jPanelBusquedaConsumosBodegasConsumosBodegas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosBodegas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.consumosbodegasConstantesFunciones.activarBusquedaConsumosBodegasConsumosBodegas);
				this.jTabbedPaneBusquedasConsumosBodegas.setEnabledAt(index,this.consumosbodegasConstantesFunciones.activarBusquedaConsumosBodegasConsumosBodegas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConsumosBodegas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConsumosBodegas")) {
			index= this.jTabbedPaneBusquedasConsumosBodegas.indexOfComponent(this.jPanelBusquedaConsumosBodegasConsumosBodegas);

			this.jTabbedPaneBusquedasConsumosBodegas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConsumosBodegas.getComponent(index);

			this.consumosbodegasConstantesFunciones.setResaltarBusquedaConsumosBodegasConsumosBodegas(resaltar);

			jPanel.setBorder(this.consumosbodegasConstantesFunciones.resaltarBusquedaConsumosBodegasConsumosBodegas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConsumosBodegas.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioConsumosBodegas() throws Exception {

		if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConsumosBodegas();
		this.updateVisibilidadResaltarControlesFormularioConsumosBodegas();
		this.updateHabilitarResaltarControlesFormularioConsumosBodegas();
		
	}
	
	public void updateBorderResaltarControlesFormularioConsumosBodegas() throws Exception {
		if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.consumosbodegasConstantesFunciones.resaltaridConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltaridConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_empresaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_empresaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_transaccionConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_transaccionConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_lineaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_lineaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_linea_grupoConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_linea_grupoConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_linea_categoriaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_linea_categoriaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarid_linea_marcaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarid_linea_marcaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarfecha_emision_desdeConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_desdeConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarfecha_emision_desdeConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarfecha_emision_hastaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_hastaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarfecha_emision_hastaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_productoConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_productoConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_unidadConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_unidadConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarcantidadConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarcantidadConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarcosto_totalConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarcosto_totalConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_lineaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_lineaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_grupoConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_grupoConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_categoriaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_categoriaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_marcaConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarnombre_linea_marcaConsumosBodegas);}
		if(this.consumosbodegasConstantesFunciones.resaltarcodigoConsumosBodegas!=null && this.jInternalFrameDetalleFormConsumosBodegas!=null) {this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setBorder(this.consumosbodegasConstantesFunciones.resaltarcodigoConsumosBodegas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConsumosBodegas() throws Exception {		
		if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
	
		//this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostraridConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelidConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostraridConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_empresaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_empresaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_empresaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_transaccionConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_transaccionConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_transaccionConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_lineaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_lineaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_linea_grupoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_grupoConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_linea_categoriaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_categoriaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_marcaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelid_linea_marcaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarid_linea_marcaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_desdeConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarfecha_emision_desdeConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelfecha_emision_desdeConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarfecha_emision_desdeConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_hastaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarfecha_emision_hastaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelfecha_emision_hastaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarfecha_emision_hastaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_productoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_productoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_productoConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_unidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_unidadConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_unidadConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcantidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelcantidadConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcantidadConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcosto_totalConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelcosto_totalConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcosto_totalConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_lineaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_lineaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_linea_grupoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_grupoConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_linea_categoriaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_categoriaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_marcaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelnombre_linea_marcaConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarnombre_linea_marcaConsumosBodegas);
		//this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcodigoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jPanelcodigoConsumosBodegas.setVisible(this.consumosbodegasConstantesFunciones.mostrarcodigoConsumosBodegas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConsumosBodegas() throws Exception {
		if(this.jInternalFrameDetalleFormConsumosBodegas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConsumosBodegas!=null) {
	
		this.jInternalFrameDetalleFormConsumosBodegas.jLabelidConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activaridConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_empresaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_empresaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_transaccionConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_transaccionConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_lineaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_grupoConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_categoriaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jComboBoxid_linea_marcaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarid_linea_marcaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_desdeConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarfecha_emision_desdeConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jDateChooserfecha_emision_hastaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarfecha_emision_hastaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_productoConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_productoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldnombre_unidadConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_unidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcantidadConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarcantidadConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcosto_totalConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarcosto_totalConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_lineaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_lineaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_grupoConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_linea_grupoConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_categoriaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_linea_categoriaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextAreanombre_linea_marcaConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarnombre_linea_marcaConsumosBodegas);
		this.jInternalFrameDetalleFormConsumosBodegas.jTextFieldcodigoConsumosBodegas.setEnabled(this.consumosbodegasConstantesFunciones.activarcodigoConsumosBodegas);
		}
	}
	
		
}