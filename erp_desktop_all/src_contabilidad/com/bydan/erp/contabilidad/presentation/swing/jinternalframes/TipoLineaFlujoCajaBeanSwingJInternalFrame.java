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

import com.bydan.erp.contabilidad.util.TipoLineaFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoLineaFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoLineaFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoLineaFlujoCajaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoLineaFlujoCajaBeanSwingJInternalFrame extends TipoLineaFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoLineaFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoLineaFlujoCaja> tipolineaflujocajaValidator = new ClassValidator<TipoLineaFlujoCaja>(TipoLineaFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoLineaFlujoCaja tipolineaflujocaja;	
	public TipoLineaFlujoCaja tipolineaflujocajaAux;
	public TipoLineaFlujoCaja tipolineaflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoLineaFlujoCaja tipolineaflujocajaTotales;
	public Long idTipoLineaFlujoCajaActual;
	public Long iIdNuevoTipoLineaFlujoCaja=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosLineaFlujoCaja=false;

	public Boolean getIsTienePermisosLineaFlujoCaja() {
		return isTienePermisosLineaFlujoCaja;
	}

	public void setIsTienePermisosLineaFlujoCaja(Boolean isTienePermisosLineaFlujoCaja) {
		this.isTienePermisosLineaFlujoCaja= isTienePermisosLineaFlujoCaja;
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
	
	public Boolean isPermisoTodoTipoLineaFlujoCaja;
	public Boolean isPermisoNuevoTipoLineaFlujoCaja;
	public Boolean isPermisoActualizarTipoLineaFlujoCaja;
	public Boolean isPermisoActualizarOriginalTipoLineaFlujoCaja;
	public Boolean isPermisoEliminarTipoLineaFlujoCaja;
	public Boolean isPermisoGuardarCambiosTipoLineaFlujoCaja;
	public Boolean isPermisoConsultaTipoLineaFlujoCaja;
	public Boolean isPermisoBusquedaTipoLineaFlujoCaja;
	public Boolean isPermisoReporteTipoLineaFlujoCaja;
	public Boolean isPermisoPaginacionMedioTipoLineaFlujoCaja;
	public Boolean isPermisoPaginacionAltoTipoLineaFlujoCaja;
	public Boolean isPermisoPaginacionTodoTipoLineaFlujoCaja;
	public Boolean isPermisoCopiarTipoLineaFlujoCaja;
	public Boolean isPermisoVerFormTipoLineaFlujoCaja;
	public Boolean isPermisoDuplicarTipoLineaFlujoCaja;
	public Boolean isPermisoOrdenTipoLineaFlujoCaja;
	
	
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
	
	public TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaReturnGeneral;
	public TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaParameterGeneral;
	
	

	public LineaFlujoCajaLogic lineaflujocajaLogic=null;

	public LineaFlujoCajaLogic getLineaFlujoCajaLogic() {
		return lineaflujocajaLogic;
	}

	public void setLineaFlujoCajaLogic(LineaFlujoCajaLogic lineaflujocajaLogic) {
		this.lineaflujocajaLogic = lineaflujocajaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoLineaFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioTipoLineaFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoLineaFlujoCajaSessionBeanAdditional tipolineaflujocajaSessionBeanAdditional=null;
	
	public TipoLineaFlujoCajaSessionBeanAdditional getTipoLineaFlujoCajaSessionBeanAdditional() {
		return this.tipolineaflujocajaSessionBeanAdditional;
	}
	
	public void setTipoLineaFlujoCajaSessionBeanAdditional(TipoLineaFlujoCajaSessionBeanAdditional tipolineaflujocajaSessionBeanAdditional) {
		try {
			this.tipolineaflujocajaSessionBeanAdditional=tipolineaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional tipolineaflujocajaBeanSwingJInternalFrameAdditional=null;
	//public class TipoLineaFlujoCajaBeanSwingJInternalFrame
	
	public TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional getTipoLineaFlujoCajaBeanSwingJInternalFrameAdditional() {
		return this.tipolineaflujocajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoLineaFlujoCajaBeanSwingJInternalFrameAdditional(TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional tipolineaflujocajaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipolineaflujocajaBeanSwingJInternalFrameAdditional=tipolineaflujocajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoLineaFlujoCajaLogic tipolineaflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoLineaFlujoCaja tipolineaflujocajaBean;
	public TipoLineaFlujoCajaConstantesFunciones tipolineaflujocajaConstantesFunciones;
	//public TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoLineaFlujoCaja> tipolineaflujocajas;	
	//public List<TipoLineaFlujoCaja> tipolineaflujocajasEliminados;
	//public List<TipoLineaFlujoCaja> tipolineaflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarTipoLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarTipoLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormTipoLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenTipoLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarTipoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigoSri=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoLineaFlujoCaja() {
		return this.iIdNuevoTipoLineaFlujoCaja;
	}

	public void setiIdNuevoTipoLineaFlujoCaja(Long iIdNuevoTipoLineaFlujoCaja) {
		this.iIdNuevoTipoLineaFlujoCaja = iIdNuevoTipoLineaFlujoCaja;
	}
	
	public Long getidTipoLineaFlujoCajaActual() {
		return this.idTipoLineaFlujoCajaActual;
	}

	public void setidTipoLineaFlujoCajaActual(Long idTipoLineaFlujoCajaActual) {
		this.idTipoLineaFlujoCajaActual = idTipoLineaFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoLineaFlujoCaja gettipolineaflujocaja() {
		return this.tipolineaflujocaja;
	}

	public void settipolineaflujocaja(TipoLineaFlujoCaja tipolineaflujocaja) {
		this.tipolineaflujocaja = tipolineaflujocaja;
	}
	
	public TipoLineaFlujoCaja gettipolineaflujocajaAux() {
		return this.tipolineaflujocajaAux;
	}

	public void settipolineaflujocajaAux(TipoLineaFlujoCaja tipolineaflujocajaAux) {
		this.tipolineaflujocajaAux = tipolineaflujocajaAux;
	}				
	
	public TipoLineaFlujoCaja gettipolineaflujocajaAnterior() {
		return this.tipolineaflujocajaAnterior;
	}

	public void settipolineaflujocajaAnterior(TipoLineaFlujoCaja tipolineaflujocajaAnterior) {
		this.tipolineaflujocajaAnterior = tipolineaflujocajaAnterior;
	}	
	
	public TipoLineaFlujoCaja gettipolineaflujocajaTotales() {
		return this.tipolineaflujocajaTotales;
	}

	public void settipolineaflujocajaTotales(TipoLineaFlujoCaja tipolineaflujocajaTotales) {
		this.tipolineaflujocajaTotales = tipolineaflujocajaTotales;
	}	
	
	public TipoLineaFlujoCaja gettipolineaflujocajaBean() {
		return this.tipolineaflujocajaBean;
	}

	public void settipolineaflujocajaBean(TipoLineaFlujoCaja tipolineaflujocajaBean) {
		this.tipolineaflujocajaBean = tipolineaflujocajaBean;
	}	
	
	public TipoLineaFlujoCajaParameterReturnGeneral gettipolineaflujocajaReturnGeneral() {
		return this.tipolineaflujocajaReturnGeneral;
	}

	public void settipolineaflujocajaReturnGeneral(TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaReturnGeneral) {
		this.tipolineaflujocajaReturnGeneral = tipolineaflujocajaReturnGeneral;
	}	
	
	
	public String codigo_sriBusquedaPorCodigoSri="";

	public String getcodigo_sriBusquedaPorCodigoSri() {
		return this.codigo_sriBusquedaPorCodigoSri;
	}

	public void setcodigo_sriBusquedaPorCodigoSri(String codigo_sriBusquedaPorCodigoSri) {
		this.codigo_sriBusquedaPorCodigoSri = codigo_sriBusquedaPorCodigoSri;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoLineaFlujoCajaLogic getTipoLineaFlujoCajaLogic()	{		
		return tipolineaflujocajaLogic;
	}

	public void setTipoLineaFlujoCajaLogic(TipoLineaFlujoCajaLogic tipolineaflujocajaLogic) {
		this.tipolineaflujocajaLogic = tipolineaflujocajaLogic;
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
	
	public Boolean getIsEsNuevoTipoLineaFlujoCaja() {
		return isEsNuevoTipoLineaFlujoCaja;
	}

	public void setIsEsNuevoTipoLineaFlujoCaja(Boolean isEsNuevoTipoLineaFlujoCaja) {
		this.isEsNuevoTipoLineaFlujoCaja = isEsNuevoTipoLineaFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoLineaFlujoCaja() {
		return esParaAccionDesdeFormularioTipoLineaFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioTipoLineaFlujoCaja(Boolean esParaAccionDesdeFormularioTipoLineaFlujoCaja) {
		this.esParaAccionDesdeFormularioTipoLineaFlujoCaja = esParaAccionDesdeFormularioTipoLineaFlujoCaja;
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

			if(this.tipolineaflujocajaSessionBean==null) {
				this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
			}

			if(!this.tipolineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipolineaflujocajaSessionBean.getlidEmpresaActual());
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

					if(this.tipolineaflujocaja!=null) {
						this.tipolineaflujocaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoLineaFlujoCajaGenerico)throws Exception
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
				jComboBoxid_empresaTipoLineaFlujoCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoLineaFlujoCajaGenerico!=null && jComboBoxid_empresaTipoLineaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoLineaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoLineaFlujoCaja tipolineaflujocaja,JComboBox jComboBoxid_empresaTipoLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoLineaFlujoCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoLineaFlujoCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipolineaflujocaja.setid_empresa(empresaAux.getId());
				tipolineaflujocaja.setempresa_descripcion(TipoLineaFlujoCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipolineaflujocaja.setEmpresa(empresaAux);			}
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

					if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { 
					}

					if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoLineaFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoLineaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoLineaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja(this.tipolineaflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipolineaflujocajaLogic.setTipoLineaFlujoCajas(this.tipolineaflujocajas);
			tipolineaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoLineaFlujoCajaParameterReturnGeneral getTipoLineaFlujoCajaParameterGeneral() {
		return this.tipolineaflujocajaParameterGeneral;
	}
	
	public void setTipoLineaFlujoCajaParameterGeneral(TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaParameterGeneral) {
		this.tipolineaflujocajaParameterGeneral = tipolineaflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoLineaFlujoCaja() {
		return isPermisoTodoTipoLineaFlujoCaja;
	}

	public void setIsPermisoTodoTipoLineaFlujoCaja(Boolean isPermisoTodoTipoLineaFlujoCaja) {
		this.isPermisoTodoTipoLineaFlujoCaja = isPermisoTodoTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoNuevoTipoLineaFlujoCaja() {
		return isPermisoNuevoTipoLineaFlujoCaja;
	}

	public void setIsPermisoNuevoTipoLineaFlujoCaja(Boolean isPermisoNuevoTipoLineaFlujoCaja) {
		this.isPermisoNuevoTipoLineaFlujoCaja = isPermisoNuevoTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoActualizarTipoLineaFlujoCaja() {
		return isPermisoActualizarTipoLineaFlujoCaja;
	}

	public void setIsPermisoActualizarTipoLineaFlujoCaja(Boolean isPermisoActualizarTipoLineaFlujoCaja) {
		this.isPermisoActualizarTipoLineaFlujoCaja = isPermisoActualizarTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoEliminarTipoLineaFlujoCaja() {
		return isPermisoEliminarTipoLineaFlujoCaja;
	}

	public void setIsPermisoEliminarTipoLineaFlujoCaja(Boolean isPermisoEliminarTipoLineaFlujoCaja) {
		this.isPermisoEliminarTipoLineaFlujoCaja = isPermisoEliminarTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosTipoLineaFlujoCaja() {
		return isPermisoGuardarCambiosTipoLineaFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosTipoLineaFlujoCaja(Boolean isPermisoGuardarCambiosTipoLineaFlujoCaja) {
		this.isPermisoGuardarCambiosTipoLineaFlujoCaja = isPermisoGuardarCambiosTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaTipoLineaFlujoCaja() {
		return isPermisoConsultaTipoLineaFlujoCaja;
	}

	public void setIsPermisoConsultaTipoLineaFlujoCaja(Boolean isPermisoConsultaTipoLineaFlujoCaja) {
		this.isPermisoConsultaTipoLineaFlujoCaja = isPermisoConsultaTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaTipoLineaFlujoCaja() {
		return isPermisoBusquedaTipoLineaFlujoCaja;
	}

	public void setIsPermisoBusquedaTipoLineaFlujoCaja(Boolean isPermisoBusquedaTipoLineaFlujoCaja) {
		this.isPermisoBusquedaTipoLineaFlujoCaja = isPermisoBusquedaTipoLineaFlujoCaja;
	}

	public Boolean getIsPermisoReporteTipoLineaFlujoCaja() {
		return isPermisoReporteTipoLineaFlujoCaja;
	}

	public void setIsPermisoReporteTipoLineaFlujoCaja(Boolean isPermisoReporteTipoLineaFlujoCaja) {
		this.isPermisoReporteTipoLineaFlujoCaja = isPermisoReporteTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoLineaFlujoCaja() {
		return isPermisoPaginacionMedioTipoLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioTipoLineaFlujoCaja(Boolean isPermisoPaginacionMedioTipoLineaFlujoCaja) {
		this.isPermisoPaginacionMedioTipoLineaFlujoCaja = isPermisoPaginacionMedioTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoLineaFlujoCaja() {
		return isPermisoPaginacionTodoTipoLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoTipoLineaFlujoCaja(Boolean isPermisoPaginacionTodoTipoLineaFlujoCaja) {
		this.isPermisoPaginacionTodoTipoLineaFlujoCaja = isPermisoPaginacionTodoTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoLineaFlujoCaja() {
		return isPermisoPaginacionAltoTipoLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoTipoLineaFlujoCaja(Boolean isPermisoPaginacionAltoTipoLineaFlujoCaja) {
		this.isPermisoPaginacionAltoTipoLineaFlujoCaja = isPermisoPaginacionAltoTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarTipoLineaFlujoCaja() {
		return isPermisoCopiarTipoLineaFlujoCaja;
	}

	public void setIsPermisoCopiarTipoLineaFlujoCaja(Boolean isPermisoCopiarTipoLineaFlujoCaja) {
		this.isPermisoCopiarTipoLineaFlujoCaja = isPermisoCopiarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormTipoLineaFlujoCaja() {
		return isPermisoVerFormTipoLineaFlujoCaja;
	}

	public void setIsPermisoVerFormTipoLineaFlujoCaja(Boolean isPermisoVerFormTipoLineaFlujoCaja) {
		this.isPermisoVerFormTipoLineaFlujoCaja = isPermisoVerFormTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarTipoLineaFlujoCaja() {
		return isPermisoDuplicarTipoLineaFlujoCaja;
	}

	public void setIsPermisoDuplicarTipoLineaFlujoCaja(Boolean isPermisoDuplicarTipoLineaFlujoCaja) {
		this.isPermisoDuplicarTipoLineaFlujoCaja = isPermisoDuplicarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenTipoLineaFlujoCaja() {
		return isPermisoOrdenTipoLineaFlujoCaja;
	}

	public void setIsPermisoOrdenTipoLineaFlujoCaja(Boolean isPermisoOrdenTipoLineaFlujoCaja) {
		this.isPermisoOrdenTipoLineaFlujoCaja = isPermisoOrdenTipoLineaFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoLineaFlujoCaja() {
		return isVisibilidadCeldaNuevoTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoTipoLineaFlujoCaja(Boolean isVisibilidadCeldaNuevoTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja = isVisibilidadCeldaNuevoTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaDuplicarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaDuplicarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja = isVisibilidadCeldaDuplicarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaCopiarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaCopiarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja = isVisibilidadCeldaCopiarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoLineaFlujoCaja() {
		return isVisibilidadCeldaVerFormTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormTipoLineaFlujoCaja(Boolean isVisibilidadCeldaVerFormTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja = isVisibilidadCeldaVerFormTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoLineaFlujoCaja() {
		return isVisibilidadCeldaOrdenTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenTipoLineaFlujoCaja(Boolean isVisibilidadCeldaOrdenTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja = isVisibilidadCeldaOrdenTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja = isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaModificarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaModificarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaModificarTipoLineaFlujoCaja = isVisibilidadCeldaModificarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaActualizarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaActualizarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja = isVisibilidadCeldaActualizarTipoLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaEliminarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaEliminarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja = isVisibilidadCeldaEliminarTipoLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaCancelarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaCancelarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja = isVisibilidadCeldaCancelarTipoLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoLineaFlujoCaja() {
		return isVisibilidadCeldaGuardarTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarTipoLineaFlujoCaja(Boolean isVisibilidadCeldaGuardarTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja = isVisibilidadCeldaGuardarTipoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja = isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja;
	}
		
	public TipoLineaFlujoCajaSessionBean gettipolineaflujocajaSessionBean() {
		return this.tipolineaflujocajaSessionBean;
	}
	
	public void settipolineaflujocajaSessionBean(TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean) {
		this.tipolineaflujocajaSessionBean=tipolineaflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigoSri() {
		return this.isVisibilidadBusquedaPorCodigoSri;
	}

	public void setisVisibilidadBusquedaPorCodigoSri(Boolean isVisibilidadBusquedaPorCodigoSri) {
		this.isVisibilidadBusquedaPorCodigoSri=isVisibilidadBusquedaPorCodigoSri;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipolineaflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(TipoLineaFlujoCaja tipolineaflujocaja,TipoLineaFlujoCaja tipolineaflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoLineaFlujoCaja(tipolineaflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipolineaflujocajaAux.setId(tipolineaflujocaja.getId());
		tipolineaflujocajaAux.setVersionRow(tipolineaflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoLineaFlujoCaja();
		
			int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipolineaflujocajaValidator.getInvalidValues(this.tipolineaflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipolineaflujocajaLogic.setDatosCliente(datosCliente);
			tipolineaflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipolineaflujocajaAux=new  TipoLineaFlujoCaja();
				
				tipolineaflujocajaAux.setIsNew(true);
				tipolineaflujocajaAux.setIsChanged(true);
				
				tipolineaflujocajaAux.setTipoLineaFlujoCajaOriginal(this.tipolineaflujocaja);
				
				tipolineaflujocajaAux.setId(this.tipolineaflujocaja.getId());	
				tipolineaflujocajaAux.setVersionRow(this.tipolineaflujocaja.getVersionRow());	
				tipolineaflujocajaAux.setid_empresa(this.tipolineaflujocaja.getid_empresa());	
				tipolineaflujocajaAux.setnombre(this.tipolineaflujocaja.getnombre());	
				tipolineaflujocajaAux.setcodigo_sri(this.tipolineaflujocaja.getcodigo_sri());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.saveTipoLineaFlujoCajas();//WithConnection
						//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas().addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas.addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolineaflujocajaLogic.saveTipoLineaFlujoCajaRelaciones(tipolineaflujocajaAux,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());//WithConnection
								//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas= new ArrayList<LineaFlujoCaja>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolineaflujocajaAux.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipolineaflujocajaAux=new  TipoLineaFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() && this.tipolineaflujocaja.getId()>=0)) {
						
					tipolineaflujocajaAux.setIsNew(false);
				}
				
				tipolineaflujocajaAux.setIsDeleted(false);
			
				tipolineaflujocajaAux.setId(this.tipolineaflujocaja.getId());	
				tipolineaflujocajaAux.setVersionRow(this.tipolineaflujocaja.getVersionRow());	
				tipolineaflujocajaAux.setid_empresa(this.tipolineaflujocaja.getid_empresa());	
				tipolineaflujocajaAux.setnombre(this.tipolineaflujocaja.getnombre());	
				tipolineaflujocajaAux.setcodigo_sri(this.tipolineaflujocaja.getcodigo_sri());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.saveTipoLineaFlujoCajas();//WithConnection
						//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas().addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas.addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolineaflujocajaLogic.saveTipoLineaFlujoCajaRelaciones(tipolineaflujocajaAux,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());//WithConnection
								//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas= new ArrayList<LineaFlujoCaja>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolineaflujocajaAux.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolineaflujocaja,tipolineaflujocajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipolineaflujocajaAux=new  TipoLineaFlujoCaja();
				
				tipolineaflujocajaAux.setIsNew(false);
				tipolineaflujocajaAux.setIsChanged(false);
				
				tipolineaflujocajaAux.setIsDeleted(true);
				
				tipolineaflujocajaAux.setId(this.tipolineaflujocaja.getId());	
				tipolineaflujocajaAux.setVersionRow(this.tipolineaflujocaja.getVersionRow());	
				tipolineaflujocajaAux.setid_empresa(this.tipolineaflujocaja.getid_empresa());	
				tipolineaflujocajaAux.setnombre(this.tipolineaflujocaja.getnombre());	
				tipolineaflujocajaAux.setcodigo_sri(this.tipolineaflujocaja.getcodigo_sri());	
				
				if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipolineaflujocajaAux.getId()>=0) {	
						this.tipolineaflujocajasEliminados.add(tipolineaflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.saveTipoLineaFlujoCajas();//WithConnection
						//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas().addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas.addAll(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolineaflujocajaLogic.saveTipoLineaFlujoCajaRelaciones(tipolineaflujocajaAux,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());//WithConnection
								//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas= new ArrayList<LineaFlujoCaja>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolineaflujocajaAux.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipolineaflujocajaAux,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipolineaflujocajaAux,tipolineaflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(this.tipolineaflujocajasEliminados);
					
					tipolineaflujocajaLogic.saveTipoLineaFlujoCajas();//WithConnection
					//tipolineaflujocajaLogic.getSetVersionRowTipoLineaFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja();
				
				this.tipolineaflujocajasEliminados= new ArrayList<TipoLineaFlujoCaja>();		
			}
			
			if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Linea Flujo Caja  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipolineaflujocaja=tipolineaflujocajaAux;
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
      		//this.finishProcessTipoLineaFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoLineaFlujoCaja tipolineaflujocajaLocal) throws Exception {
		
		if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipolineaflujocajaLocal.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
			
			} else {
			
				tipolineaflujocajaLocal.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoLineaFlujoCaja tipolineaflujocajaLocal) throws Exception {	
		if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipolineaflujocajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoLineaFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipolineaflujocajaValidator.getInvalidValues(this.tipolineaflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoLineaFlujoCaja tipolineaflujocaja,List<TipoLineaFlujoCaja> tipolineaflujocajas) throws Exception {
		try	{		
			TipoLineaFlujoCajaConstantesFunciones.actualizarLista(tipolineaflujocaja,tipolineaflujocajas,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoLineaFlujoCaja tipolineaflujocaja,List<TipoLineaFlujoCaja> tipolineaflujocajas) throws Exception {
		try	{			
			TipoLineaFlujoCajaConstantesFunciones.actualizarSelectedLista(tipolineaflujocaja,tipolineaflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoLineaFlujoCaja> tipolineaflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipolineaflujocajasLocal=this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipolineaflujocajasLocal=this.tipolineaflujocajas;
			}
			//ARCHITECTURE
		
			for(TipoLineaFlujoCaja tipolineaflujocajaLocal:tipolineaflujocajasLocal) {
				if(this.permiteMantenimiento(tipolineaflujocajaLocal) && tipolineaflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoLineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoLineaFlujoCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelid_empresaTipoLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLineaFlujoCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelnombreTipoLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoLineaFlujoCajaConstantesFunciones.CODIGOSRI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelcodigo_sriTipoLineaFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelid_empresaTipoLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelnombreTipoLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelcodigo_sriTipoLineaFlujoCaja,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("LineaFlujoCaja")) {
			if(this.tipolineaflujocaja==null) {
				this.tipolineaflujocaja= new TipoLineaFlujoCaja();
			}

			if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoLineaFlujoCaja
				this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);

				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getlineaflujocaja().setTipoLineaFlujoCaja(this.tipolineaflujocaja);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoLineaFlujoCaja--;	
		
		
		this.tipolineaflujocajaAux=new TipoLineaFlujoCaja();
		
		this.tipolineaflujocajaAux.setId(this.iIdNuevoTipoLineaFlujoCaja);
		this.tipolineaflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().add(this.tipolineaflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipolineaflujocajas.add(this.tipolineaflujocajaAux);
		}
		//ARCHITECTURE
		
		this.tipolineaflujocaja=this.tipolineaflujocajaAux;
		
		if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLineaFlujoCaja(this.tipolineaflujocaja);
		}
				
		//this.setDefaultControlesTipoLineaFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoLineaFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoLineaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLineaFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocajaBean,this.tipolineaflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=TipoLineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.procesarEventosTipoLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this.tipolineaflujocaja,this.tipolineaflujocajaParameterGeneral,this.isEsNuevoTipoLineaFlujoCaja,classes);//this.tipolineaflujocajaLogic.getTipoLineaFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral,this.tipolineaflujocajaBean,false);
		
		if(this.tipolineaflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja());
		}
		
		if(this.tipolineaflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja(),classes);//this.tipolineaflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoLineaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoLineaFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarFormTipoLineaFlujoCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
						
			if(tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado() && LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaFlujoCajaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();
			}
			
			this.actualizarVisualTableDatosTipoLineaFlujoCaja();
			
			this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoLineaFlujoCaja(), this.getIndiceNuevoTipoLineaFlujoCaja());
			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoLineaFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setEnabled(isHabilitar && this.tipolineaflujocajaConstantesFunciones.activarnombreTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setEnabled(isHabilitar && this.tipolineaflujocajaConstantesFunciones.activarcodigo_sriTipoLineaFlujoCaja);	
		//
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setEnabled(isHabilitar && this.tipolineaflujocajaConstantesFunciones.activarid_empresaTipoLineaFlujoCaja);
	};
	
	public void setDefaultControlesTipoLineaFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoLineaFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.tipolineaflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.tipolineaflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoLineaFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				if(tipolineaflujocajaAux.getId().equals(this.iIdNuevoTipoLineaFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajas) {
				if(tipolineaflujocajaAux.getId().equals(this.iIdNuevoTipoLineaFlujoCaja)) {
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
	
	public int getIndiceActualTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				if(tipolineaflujocajaAux.getId().equals(tipolineaflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajas) {
				if(tipolineaflujocajaAux.getId().equals(tipolineaflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				if(tipolineaflujocajaAux.getTipoLineaFlujoCajaOriginal().getId().equals(tipolineaflujocajaOriginal.getId())) {
					existe=true;
					tipolineaflujocajaOriginal.setId(tipolineaflujocajaAux.getId());
					tipolineaflujocajaOriginal.setVersionRow(tipolineaflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajas) {
				if(tipolineaflujocajaAux.getTipoLineaFlujoCajaOriginal().getId().equals(tipolineaflujocajaOriginal.getId())) {
					existe=true;
					tipolineaflujocajaOriginal.setId(tipolineaflujocajaAux.getId());
					tipolineaflujocajaOriginal.setVersionRow(tipolineaflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoLineaFlujoCaja(Boolean esParaCancelar) throws Exception {
		tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
		tipolineaflujocajaAux=new TipoLineaFlujoCaja();
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
					if(tipolineaflujocajaAux.getId()<0) {
						tipolineaflujocajasAux.add(tipolineaflujocajaAux);
					}		
				}
				this.iIdNuevoTipoLineaFlujoCaja=0L;
				this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().removeAll(tipolineaflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajas) {
					if(tipolineaflujocajaAux.getId()<0) {
						tipolineaflujocajasAux.add(tipolineaflujocajaAux);
					}		
				}
				this.iIdNuevoTipoLineaFlujoCaja=0L;
				this.tipolineaflujocajas.removeAll(tipolineaflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoLineaFlujoCaja 
					&& this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()>0
					) {
					tipolineaflujocajaAux=this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().get(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size() - 1);
				
					if(tipolineaflujocajaAux.getId()<0) {
						this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().remove(tipolineaflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoLineaFlujoCaja && this.tipolineaflujocajas.size()>0) {
					tipolineaflujocajaAux=this.tipolineaflujocajas.get(this.tipolineaflujocajas.size() - 1);
				
					if(tipolineaflujocajaAux.getId()<0) {
						this.tipolineaflujocajas.remove(tipolineaflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoLineaFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipolineaflujocaja.getId()<0) {
				this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().remove(this.tipolineaflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipolineaflujocaja.getId()<0) {
				this.tipolineaflujocajas.remove(this.tipolineaflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesTipoLineaFlujoCaja(List<TipoLineaFlujoCaja> tipolineaflujocajasAux) throws Exception {
		TipoLineaFlujoCajaConstantesFunciones.setEstadosInicialesTipoLineaFlujoCaja(tipolineaflujocajasAux);
	}
	
	public void setEstadosInicialesTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocajaAux) throws Exception {
		TipoLineaFlujoCajaConstantesFunciones.setEstadosInicialesTipoLineaFlujoCaja(tipolineaflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoLineaFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoLineaFlujoCajaActual()) {
				if(!this.isEsNuevoTipoLineaFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoLineaFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoLineaFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Linea Flujo Caja  ?", "MANTENIMIENTO DE Tipo Linea Flujo Caja ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoLineaFlujoCaja tipolineaflujocaja) throws Exception {
		TipoLineaFlujoCajaConstantesFunciones.seleccionarAsignar(this.tipolineaflujocaja,tipolineaflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoLineaFlujoCaja=this.isPermisoActualizarOriginalTipoLineaFlujoCaja;
			
			
			this.seleccionarAsignar(tipolineaflujocaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoLineaFlujoCajaConstantesFunciones.quitarEspaciosTipoLineaFlujoCaja(this.tipolineaflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipolineaflujocajaSessionBean.setsFuncionBusquedaRapida(this.tipolineaflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoLineaFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoLineaFlujoCaja(esParaCancelar);				
				this.cancelarNuevoTipoLineaFlujoCaja(esParaCancelar);								
			}
			
			this.tipolineaflujocaja=new TipoLineaFlujoCaja();
			
			this.inicializarTipoLineaFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoLineaFlujoCaja() throws Exception {
		try {
			TipoLineaFlujoCajaConstantesFunciones.inicializarTipoLineaFlujoCaja(this.tipolineaflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoLineaFlujoCajas(String sAccionBusqueda,List<TipoLineaFlujoCaja> tipolineaflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoLineaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoLineaFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoLineaFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoLineaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Linea Flujo Caja s");		
		parameters.put("busquedapor", TipoLineaFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(LineaFlujoCaja.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoLineaFlujoCajaLogic tipolineaflujocajaLogicAuxiliar=new TipoLineaFlujoCajaLogic();
					tipolineaflujocajaLogicAuxiliar.setDatosCliente(tipolineaflujocajaLogic.getDatosCliente());				
					tipolineaflujocajaLogicAuxiliar.setTipoLineaFlujoCajas(tipolineaflujocajasParaReportes);
					
					tipolineaflujocajaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoLineaFlujoCajaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipolineaflujocajasParaReportes=tipolineaflujocajaLogicAuxiliar.getTipoLineaFlujoCajas();
					
					//tipolineaflujocajaLogic.getNewConnexionToDeep();
					
					//for (TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajasParaReportes) {
					//	tipolineaflujocajaLogic.deepLoad(tipolineaflujocaja, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipolineaflujocajaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileLineaFlujoCaja = AuxiliarReportes.class.getResourceAsStream("LineaFlujoCajaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_lineaflujocaja", reportFileLineaFlujoCaja);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoLineaFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoLineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoLineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoLineaFlujoCaja=new JRBeanArrayDataSource(TipoLineaFlujoCajaJInternalFrame.TraerTipoLineaFlujoCajaBeans(tipolineaflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoLineaFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoLineaFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoLineaFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoLineaFlujoCajaBean.TraerTipoLineaFlujoCajaBeans(tipolineaflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCajaActionPerformed(null);
					//this.generarExcelReporteTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipolineaflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLineaFlujoCaja> tipolineaflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLineaFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLineaFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoLineaFlujoCaja tipolineaflujocaja : tipolineaflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoLineaFlujoCajaConstantesFunciones.generarExcelReporteDataTipoLineaFlujoCaja("NORMAL",row,workbook,tipolineaflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoLineaFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		TipoLineaFlujoCajaConstantesFunciones.generarExcelReporteHeaderTipoLineaFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLineaFlujoCaja> tipolineaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLineaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoLineaFlujoCaja tipolineaflujocaja : tipolineaflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaDescripcion(tipolineaflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolineaflujocaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolineaflujocaja.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolineaflujocaja.getcodigo_sri());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoLineaFlujoCaja> tipolineaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoLineaFlujoCaja> tipolineaflujocajasRespaldo=null;
		
		classes=TipoLineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipolineaflujocajaLogic.setDatosCliente(this.datosCliente);
		this.tipolineaflujocajaLogic.setDatosDeep(this.datosDeep);
		this.tipolineaflujocajaLogic.setIsConDeep(true);
		
		tipolineaflujocajasRespaldo=this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas();
		
		this.tipolineaflujocajaLogic.setTipoLineaFlujoCajas(tipolineaflujocajasParaReportes);	
		this.tipolineaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipolineaflujocajasParaReportes=this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas();
		this.tipolineaflujocajaLogic.setTipoLineaFlujoCajas(tipolineaflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoLineaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoLineaFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoLineaFlujoCaja tipolineaflujocaja : tipolineaflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoLineaFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoLineaFlujoCajaConstantesFunciones.generarExcelReporteDataTipoLineaFlujoCaja("NORMAL",row,workbook,tipolineaflujocaja,cellStyleDataAux);
		
			
			


				//LineaFlujoCaja
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipolineaflujocaja.getLineaFlujoCajas()!=null && tipolineaflujocaja.getLineaFlujoCajas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LineaFlujoCajaConstantesFunciones.generarExcelReporteHeaderLineaFlujoCaja("RELACIONADO",row,workbook);
				}

				if(tipolineaflujocaja.getLineaFlujoCajas()!=null) {
					i2=0;
					for(LineaFlujoCaja lineaflujocaja : tipolineaflujocaja.getLineaFlujoCajas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LineaFlujoCajaConstantesFunciones.generarExcelReporteDataLineaFlujoCaja("RELACIONADO",row,workbook,lineaflujocaja,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaDescripcion(tipolineaflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoLineaFlujoCaja() throws Exception {		
		this.startProcessTipoLineaFlujoCaja(true);
	}
	
	public void startProcessTipoLineaFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoLineaFlujoCaja ,this.jPanelParametrosReportesTipoLineaFlujoCaja, this.jScrollPanelDatosTipoLineaFlujoCaja,this.jPanelPaginacionTipoLineaFlujoCaja, this.jScrollPanelDatosEdicionTipoLineaFlujoCaja, this.jPanelAccionesTipoLineaFlujoCaja,this.jPanelAccionesFormularioTipoLineaFlujoCaja,this.jmenuBarTipoLineaFlujoCaja,this.jmenuBarDetalleTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLineaFlujoCaja=this.jTabbedPaneBusquedasTipoLineaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoLineaFlujoCaja=this.jPanelParametrosReportesTipoLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoLineaFlujoCaja=this.jScrollPanelDatosTipoLineaFlujoCaja;
		final JTable jTableDatosTipoLineaFlujoCaja=this.jTableDatosTipoLineaFlujoCaja;		
		final JPanel jPanelPaginacionTipoLineaFlujoCaja=this.jPanelPaginacionTipoLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoLineaFlujoCaja=this.jScrollPanelDatosEdicionTipoLineaFlujoCaja;
		final JPanel jPanelAccionesTipoLineaFlujoCaja=this.jPanelAccionesTipoLineaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoLineaFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelCamposTipoLineaFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelAccionesFormularioTipoLineaFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoLineaFlujoCaja=jPanelCamposAuxiliarTipoLineaFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoLineaFlujoCaja=jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoLineaFlujoCaja=this.jmenuBarTipoLineaFlujoCaja;
		final JToolBar jTtoolBarTipoLineaFlujoCaja=this.jTtoolBarTipoLineaFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoLineaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jmenuBarDetalleTipoLineaFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTtoolBarDetalleTipoLineaFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleTipoLineaFlujoCaja=jmenuBarDetalleAuxiliarTipoLineaFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoLineaFlujoCaja=jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLineaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLineaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoLineaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoLineaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLineaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLineaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLineaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLineaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLineaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoLineaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLineaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLineaFlujoCaja ,jPanelParametrosReportesTipoLineaFlujoCaja,jTableDatosTipoLineaFlujoCaja, /*jScrollPanelDatosTipoLineaFlujoCaja,*/jPanelCamposTipoLineaFlujoCaja,jPanelPaginacionTipoLineaFlujoCaja, /*jScrollPanelDatosEdicionTipoLineaFlujoCaja,*/ jPanelAccionesTipoLineaFlujoCaja,jPanelAccionesFormularioTipoLineaFlujoCaja,jmenuBarTipoLineaFlujoCaja,jmenuBarDetalleTipoLineaFlujoCaja,jTtoolBarTipoLineaFlujoCaja,jTtoolBarDetalleTipoLineaFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoLineaFlujoCaja ,jPanelParametrosReportesTipoLineaFlujoCaja, jScrollPanelDatosTipoLineaFlujoCaja,jPanelPaginacionTipoLineaFlujoCaja, jScrollPanelDatosEdicionTipoLineaFlujoCaja, jPanelAccionesTipoLineaFlujoCaja,jPanelAccionesFormularioTipoLineaFlujoCaja,jmenuBarTipoLineaFlujoCaja,jmenuBarDetalleTipoLineaFlujoCaja,jTtoolBarTipoLineaFlujoCaja,jTtoolBarDetalleTipoLineaFlujoCaja);
						
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
	
	public void finishProcessTipoLineaFlujoCaja() {// throws Exception 
		this.finishProcessTipoLineaFlujoCaja(true);
	}
	
	public void finishProcessTipoLineaFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoLineaFlujoCaja ,this.jPanelParametrosReportesTipoLineaFlujoCaja, this.jScrollPanelDatosTipoLineaFlujoCaja,this.jPanelPaginacionTipoLineaFlujoCaja, this.jScrollPanelDatosEdicionTipoLineaFlujoCaja, this.jPanelAccionesTipoLineaFlujoCaja,this.jPanelAccionesFormularioTipoLineaFlujoCaja,this.jmenuBarTipoLineaFlujoCaja,this.jmenuBarDetalleTipoLineaFlujoCaja,this.jTtoolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoLineaFlujoCaja=this.jTabbedPaneBusquedasTipoLineaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoLineaFlujoCaja=this.jPanelParametrosReportesTipoLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoLineaFlujoCaja=this.jScrollPanelDatosTipoLineaFlujoCaja;
		final JTable jTableDatosTipoLineaFlujoCaja=this.jTableDatosTipoLineaFlujoCaja;		
		final JPanel jPanelPaginacionTipoLineaFlujoCaja=this.jPanelPaginacionTipoLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoLineaFlujoCaja=this.jScrollPanelDatosEdicionTipoLineaFlujoCaja;
		final JPanel jPanelAccionesTipoLineaFlujoCaja=this.jPanelAccionesTipoLineaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoLineaFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelCamposTipoLineaFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelAccionesFormularioTipoLineaFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoLineaFlujoCaja=jPanelCamposAuxiliarTipoLineaFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoLineaFlujoCaja=jPanelAccionesFormularioAuxiliarTipoLineaFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoLineaFlujoCaja=this.jmenuBarTipoLineaFlujoCaja;		
		final JToolBar jTtoolBarTipoLineaFlujoCaja=this.jTtoolBarTipoLineaFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoLineaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jmenuBarDetalleTipoLineaFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTtoolBarDetalleTipoLineaFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleTipoLineaFlujoCaja=jmenuBarDetalleAuxiliarTipoLineaFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoLineaFlujoCaja=jTtoolBarDetalleAuxiliarTipoLineaFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoLineaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoLineaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoLineaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoLineaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoLineaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoLineaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoLineaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoLineaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoLineaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoLineaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoLineaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoLineaFlujoCaja ,jPanelParametrosReportesTipoLineaFlujoCaja, jTableDatosTipoLineaFlujoCaja,/*jScrollPanelDatosTipoLineaFlujoCaja,*/jPanelCamposTipoLineaFlujoCaja,jPanelPaginacionTipoLineaFlujoCaja, /*jScrollPanelDatosEdicionTipoLineaFlujoCaja,*/ jPanelAccionesTipoLineaFlujoCaja,jPanelAccionesFormularioTipoLineaFlujoCaja,jmenuBarTipoLineaFlujoCaja,jmenuBarDetalleTipoLineaFlujoCaja,jTtoolBarTipoLineaFlujoCaja,jTtoolBarDetalleTipoLineaFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoLineaFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoLineaFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoLineaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoLineaFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoLineaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoLineaFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipolineaflujocajaConstantesFunciones.getsFinalQueryTipoLineaFlujoCaja();
		String  finalQueryPaginacionTodos=this.tipolineaflujocajaConstantesFunciones.getsFinalQueryTipoLineaFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoLineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoTipoLineaFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoLineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoLineaFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoLineaFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipolineaflujocajasEliminados= new ArrayList<TipoLineaFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoLineaFlujoCaja();
		
				///*TipoLineaFlujoCajaSessionBean*/this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
			
			if(this.tipolineaflujocajaSessionBean==null) {
				this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=TipoLineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoLineaFlujoCajaConstantesFunciones.getClassesForeignKeysOfTipoLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipolineaflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipolineaflujocajasAux= new ArrayList<TipoLineaFlujoCaja>();
			
				
			tipolineaflujocajaLogic.setDatosCliente(this.datosCliente);
			tipolineaflujocajaLogic.setDatosDeep(this.datosDeep);
			tipolineaflujocajaLogic.setIsConDeep(true);
			
			
			tipolineaflujocajaLogic.getTipoLineaFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipolineaflujocajaLogic.getTodosTipoLineaFlujoCajas(finalQueryGlobal,pagination);
					
					//tipolineaflujocajaLogic.getTodosTipoLineaFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipolineaflujocajaLogic.getTipoLineaFlujoCajas()==null|| tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolineaflujocajasAux= new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajaLogic.getTipoLineaFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajasAux= new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolineaflujocajaLogic.getTodosTipoLineaFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//tipolineaflujocajaLogic.getTodosTipoLineaFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajaLogic.getTipoLineaFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());					
							tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(tipolineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajas.addAll(tipolineaflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoLineaFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoLineaFlujoCaja=this.idActual;
				
				} else if(this.idTipoLineaFlujoCajaActual!=null && this.idTipoLineaFlujoCajaActual!=0L) {
					idTipoLineaFlujoCaja=idTipoLineaFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndicePorId(idTipoLineaFlujoCaja);
				
				this.tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipolineaflujocajaLogic.getEntity(idTipoLineaFlujoCaja);
					
					//tipolineaflujocajaLogic.getEntityWithConnection(idTipoLineaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());
					tipolineaflujocajaLogic.getTipoLineaFlujoCajas().add(tipolineaflujocajaLogic.getTipoLineaFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
					this.tipolineaflujocajas.add(tipolineaflujocaja);
				}
				
				if(tipolineaflujocajaLogic.getTipoLineaFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigoSri")) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigo_sriBusquedaPorCodigoSri);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorCodigoSri(finalQueryGlobal,pagination,codigo_sriBusquedaPorCodigoSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigo_sriBusquedaPorCodigoSri);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigo_sriBusquedaPorCodigoSri);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolineaflujocajaLogic.getTipoLineaFlujoCajas()==null||tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolineaflujocajas==null|| tipolineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
						tipolineaflujocajasAux.addAll(tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorCodigoSri(finalQueryGlobal,pagination,codigo_sriBusquedaPorCodigoSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigo_sriBusquedaPorCodigoSri);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigo_sriBusquedaPorCodigoSri);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorCodigoSri",tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorCodigoSri",tipolineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());
						tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(tipolineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajas.addAll(tipolineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolineaflujocajaLogic.getTipoLineaFlujoCajas()==null||tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolineaflujocajas==null|| tipolineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
						tipolineaflujocajasAux.addAll(tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorId",tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorId",tipolineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());
						tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(tipolineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajas.addAll(tipolineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolineaflujocajaLogic.getTipoLineaFlujoCajas()==null||tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolineaflujocajas==null|| tipolineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
						tipolineaflujocajasAux.addAll(tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorNombre",tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLineaFlujoCajas("BusquedaPorNombre",tipolineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());
						tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(tipolineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajas.addAll(tipolineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolineaflujocajaLogic.getTipoLineaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolineaflujocajaLogic.getTipoLineaFlujoCajas()==null||tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolineaflujocajas==null|| tipolineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
						tipolineaflujocajasAux.addAll(tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajasAux=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajasAux.addAll(tipolineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolineaflujocajaLogic.getTipoLineaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoLineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoLineaFlujoCajas("FK_IdEmpresa",tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoLineaFlujoCajas("FK_IdEmpresa",tipolineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaLogic.setTipoLineaFlujoCajas(new ArrayList<TipoLineaFlujoCaja>());
						tipolineaflujocajaLogic.getTipoLineaFlujoCajas().addAll(tipolineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
							tipolineaflujocajas.addAll(tipolineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoLineaFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoLineaFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolineaflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolineaflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoLineaFlujoCaja tipolineaflujocaja) {
		Boolean permite=true;
		
		if(this.tipolineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoLineaFlujoCajaConstantesFunciones.getOrderByListaTipoLineaFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoLineaFlujoCajaConstantesFunciones.getOrderByListaTipoLineaFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				if(tipolineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipolineaflujocajaTotales=tipolineaflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLineaFlujoCaja tipolineaflujocaja:this.tipolineaflujocajas) {
				if(tipolineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipolineaflujocajaTotales=tipolineaflujocaja;
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
			this.tipolineaflujocajaAux=new TipoLineaFlujoCaja();
			this.tipolineaflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.tipolineaflujocajaAux.setIsNew(false);
			this.tipolineaflujocajaAux.setIsChanged(false);
			this.tipolineaflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoLineaFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoLineaFlujoCaja(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this.tipolineaflujocajaAux);
				
				this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().add(this.tipolineaflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoLineaFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoLineaFlujoCaja(this.tipolineaflujocajas,this.tipolineaflujocajaAux);
				
				this.tipolineaflujocajas.add(this.tipolineaflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipolineaflujocajaTotales=new TipoLineaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().remove(tipolineaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolineaflujocajas.remove(tipolineaflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipolineaflujocajaTotales=new TipoLineaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				if(tipolineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipolineaflujocajaTotales=tipolineaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLineaFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoLineaFlujoCaja(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),tipolineaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoLineaFlujoCaja tipolineaflujocaja:this.tipolineaflujocajas) {
				if(tipolineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipolineaflujocajaTotales=tipolineaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoLineaFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoLineaFlujoCaja(this.tipolineaflujocajas,tipolineaflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoLineaFlujoCajasBusquedaPorCodigoSri()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigoSri";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoLineaFlujoCajasBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoLineaFlujoCajasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoLineaFlujoCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoLineaFlujoCajaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoLineaFlujoCajasBusquedaPorCodigoSri(String sFinalQuery,String codigo_sri)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorCodigoSri(sFinalQuery,this.pagination,codigo_sri);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoLineaFlujoCajasBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoLineaFlujoCajasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getTipoLineaFlujoCajasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoLineaFlujoCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getTipoLineaFlujoCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoLineaFlujoCajaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getTipoLineaFlujoCajaPorNombre(nombre);
				
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
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoLineaFlujoCaja() {
		this.isPermisoTodoTipoLineaFlujoCaja=false;
		this.isPermisoNuevoTipoLineaFlujoCaja=false;
		this.isPermisoActualizarTipoLineaFlujoCaja=false;
		this.isPermisoActualizarOriginalTipoLineaFlujoCaja=false;
		this.isPermisoEliminarTipoLineaFlujoCaja=false;
		this.isPermisoGuardarCambiosTipoLineaFlujoCaja=false;
		this.isPermisoConsultaTipoLineaFlujoCaja=false;
		this.isPermisoBusquedaTipoLineaFlujoCaja=false;
		this.isPermisoReporteTipoLineaFlujoCaja=false;		
		this.isPermisoOrdenTipoLineaFlujoCaja=false;		
		this.isPermisoPaginacionMedioTipoLineaFlujoCaja=false;		
		this.isPermisoPaginacionAltoTipoLineaFlujoCaja=false;
		this.isPermisoPaginacionTodoTipoLineaFlujoCaja=false;
		this.isPermisoCopiarTipoLineaFlujoCaja=false;		
		this.isPermisoVerFormTipoLineaFlujoCaja=false;		
		this.isPermisoDuplicarTipoLineaFlujoCaja=false;		
		this.isPermisoOrdenTipoLineaFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioTipoLineaFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoTipoLineaFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoLineaFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoLineaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoLineaFlujoCaja=isPermiso;
		this.isPermisoConsultaTipoLineaFlujoCaja=isPermiso;
		this.isPermisoBusquedaTipoLineaFlujoCaja=isPermiso;
		this.isPermisoReporteTipoLineaFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoCopiarTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoVerFormTipoLineaFlujoCaja=isPermiso;		
		this.isPermisoDuplicarTipoLineaFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoLineaFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoLineaFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoTipoLineaFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoLineaFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoLineaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoLineaFlujoCaja=isPermiso;
		//this.isPermisoConsultaTipoLineaFlujoCaja=isPermiso;
		//this.isPermisoBusquedaTipoLineaFlujoCaja=isPermiso;
		//this.isPermisoReporteTipoLineaFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioTipoLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoTipoLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoTipoLineaFlujoCaja=isPermiso;		
		//this.isPermisoCopiarTipoLineaFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarTipoLineaFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoLineaFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoLineaFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoLineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosLineaFlujoCaja=false;
		this.isTienePermisosLineaFlujoCaja=this.verificarGetPermisosUsuarioOpcionTipoLineaFlujoCajaClaseRelacionada(this.opcionsRelacionadas,LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoLineaFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoLineaFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosLineaFlujoCaja=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoLineaFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoLineaFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoLineaFlujoCajaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosLineaFlujoCaja && this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.remove(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoLineaFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoLineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoLineaFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoLineaFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoLineaFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoLineaFlujoCaja=this.isPermisoActualizarTipoLineaFlujoCaja;
			this.isPermisoEliminarTipoLineaFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoLineaFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoLineaFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoLineaFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoLineaFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoLineaFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLineaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoLineaFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoLineaFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoLineaFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoLineaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoLineaFlujoCaja.setToolTipText(this.jTableDatosTipoLineaFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoLineaFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoLineaFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoLineaFlujoCaja() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosLineaFlujoCaja && this.tipolineaflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoLineaFlujoCaja && !TipoLineaFlujoCajaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Linea Flujo Caja");
			reporte.setsDescripcion("Linea Flujo Caja");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoLineaFlujoCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoLineaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoLineaFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoLineaFlujoCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoLineaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaReturnGeneral=new TipoLineaFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipolineaflujocajaConstantesFunciones.cargarid_empresaTipoLineaFlujoCaja)
					 || (this.esRecargarFks && this.tipolineaflujocajaConstantesFunciones.cargarid_empresaTipoLineaFlujoCaja)) {

					if(!this.tipolineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipolineaflujocajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.cargarCombosLoteForeignKeyTipoLineaFlujoCaja(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipolineaflujocajaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoLineaFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipolineaflujocajaSessionBean==null) {
				this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
			}

			if(!this.tipolineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoLineaFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoLineaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoLineaFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLineaFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoLineaFlujoCaja()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoLineaFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoLineaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoLineaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoLineaFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoLineaFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoLineaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoLineaFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoLineaFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoLineaFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoLineaFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean(); 
		this.tipolineaflujocajaConstantesFunciones=new TipoLineaFlujoCajaConstantesFunciones(); 
		this.tipolineaflujocajaBean=new TipoLineaFlujoCaja();//(this.tipolineaflujocajaConstantesFunciones); 		
		this.tipolineaflujocajaReturnGeneral=new TipoLineaFlujoCajaParameterReturnGeneral(); 
		
		this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoLineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoLineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoLineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoLineaFlujoCaja(true);
			
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
			
			this.tipolineaflujocajaConstantesFunciones=new TipoLineaFlujoCajaConstantesFunciones(); 
			this.tipolineaflujocajaBean=new TipoLineaFlujoCaja();//this.tipolineaflujocajaConstantesFunciones); 			
			this.tipolineaflujocajaReturnGeneral=new TipoLineaFlujoCajaParameterReturnGeneral(); 
		
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Linea Flujo Caja  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipolineaflujocaja=new TipoLineaFlujoCaja();
			this.tipolineaflujocajas = new ArrayList<TipoLineaFlujoCaja>();
			this.tipolineaflujocajasAux = new ArrayList<TipoLineaFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic=new TipoLineaFlujoCajaLogic();
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipolineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoLineaFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionTipoLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLineaFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoLineaFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLineaFlujoCaja);
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja);
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoLineaFlujoCaja);
					this.jInternalFrameImportacionTipoLineaFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionTipoLineaFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoLineaFlujoCaja);
					this.jInternalFrameOrderByTipoLineaFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByTipoLineaFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoLineaFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoLineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipolineaflujocajaReturnGeneral=new TipoLineaFlujoCajaParameterReturnGeneral();
			
			this.tipolineaflujocajaParameterGeneral=new TipoLineaFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipolineaflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLineaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado(),this.tipolineaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoLineaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado(),this.tipolineaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			
			
			this.isVisibilidadBusquedaPorCodigoSri=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoLineaFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoLineaFlujoCaja(false);
			
			this.setPermisosUsuarioTipoLineaFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() && this.tipolineaflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoLineaFlujoCajaClasesRelacionadas();
			}
			
			if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoLineaFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoLineaFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoLineaFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaTipoLineaFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoLineaFlujoCaja,this.isPermisoPaginacionMedioTipoLineaFlujoCaja,this.isPermisoPaginacionTodoTipoLineaFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoLineaFlujoCajaConstantesFunciones.getTiposSeleccionarTipoLineaFlujoCaja());
				
				this.tiposColumnasSelect=TipoLineaFlujoCajaConstantesFunciones.getTiposSeleccionarTipoLineaFlujoCaja(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoLineaFlujoCaja();				
				//this.tiposRelacionesSelect=TipoLineaFlujoCajaConstantesFunciones.getTiposRelacionesTipoLineaFlujoCaja(true);
				
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
			//if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoLineaFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoLineaFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoLineaFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLineaFlujoCaja() ;
			
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
			
			
			this.lineaflujocajaLogic=new LineaFlujoCajaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipolineaflujocajaImplementable= (TipoLineaFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLineaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipolineaflujocajaImplementableHome= (TipoLineaFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoLineaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipolineaflujocajas= new ArrayList<TipoLineaFlujoCaja>();
			this.tipolineaflujocajasEliminados= new ArrayList<TipoLineaFlujoCaja>();
						
			this.isEsNuevoTipoLineaFlujoCaja=false;
			this.esParaAccionDesdeFormularioTipoLineaFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoLineaFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoLineaFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoLineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoLineaFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoLineaFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoLineaFlujoCaja();
			}
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoLineaFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoLineaFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoLineaFlujoCaja() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoLineaFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	
				
				

				if(sTitle.equals("Linea Flujo Cajas")) {
					if(!LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoLineaFlujoCaja();

						this.cargarParteTabPanelRelacionadaLineaFlujoCaja(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoLineaFlujoCaja();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaLineaFlujoCaja(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(false,true,iIndex);
		this.jButtonLineaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLineaFlujoCaja();

		//this.jTabbedPaneRelacionesTipoLineaFlujoCaja.updateUI();
		//this.jTabbedPaneRelacionesTipoLineaFlujoCaja.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("LineaFlujoCaja")) {
				int row=this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
				jButtonLineaFlujoCajaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Linea Flujo Caja")) {

					if(this.isTienePermisosLineaFlujoCaja && this.tipolineaflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoLineaFlujoCaja && !TipoLineaFlujoCajaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Linea Flujo Cajas"+"("+LineaFlujoCajaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Linea Flujo Cajas");

						if(tipolineaflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoLineaFlujoCaja!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipolineaflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoLineaFlujoCaja);
						}

						jmenuItem.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarLineaFlujoCajaTipoLineaFlujoCaja);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"LineaFlujoCaja"));

						

						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jmenuDetalleTipoLineaFlujoCaja.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoLineaFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoLineaFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoLineaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoLineaFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoLineaFlujoCaja();
		
		this.cargarCombosFrameForeignKeyTipoLineaFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoLineaFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoLineaFlujoCaja();
		}
	}
	
	
	
	public void jButtonNuevoTipoLineaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			
			if(jTableDatosTipoLineaFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoLineaFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoLineaFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoLineaFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoLineaFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(true);			
			//this.tipolineaflujocaja=new TipoLineaFlujoCaja();
			//this.tipolineaflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja() ;
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLineaFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipolineaflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);				
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoLineaFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoLineaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoLineaFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoLineaFlujoCaja.getSelectedRows().length;			
			}
			
			tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoLineaFlujoCaja--;			
				//TipoLineaFlujoCaja tipolineaflujocajaAux= new TipoLineaFlujoCaja();			
				//tipolineaflujocajaAux.setId(this.iIdNuevoTipoLineaFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoLineaFlujoCaja tipolineaflujocajaOrigen=new TipoLineaFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoLineaFlujoCaja tipolineaflujocajaOrigen : tipolineaflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipolineaflujocajaOrigen =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolineaflujocajaOrigen =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoLineaFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipolineaflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoLineaFlujoCaja(tipolineaflujocajaOrigen,this.tipolineaflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().add(this.tipolineaflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocajas.add(this.tipolineaflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
				
				this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoLineaFlujoCaja(), this.getIndiceNuevoTipoLineaFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoLineaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLineaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLineaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();									
		
			TipoLineaFlujoCaja tipolineaflujocajaOrigen=new TipoLineaFlujoCaja();
			TipoLineaFlujoCaja tipolineaflujocajaDestino=new TipoLineaFlujoCaja();
				
			tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoLineaFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipolineaflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoLineaFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaOrigen =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolineaflujocajaOrigen =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolineaflujocajaDestino =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolineaflujocajaDestino =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipolineaflujocajaOrigen =tipolineaflujocajasSeleccionados.get(0);
				tipolineaflujocajaDestino =tipolineaflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoLineaFlujoCaja(tipolineaflujocajaOrigen,tipolineaflujocajaDestino,true,false);
				
				tipolineaflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolineaflujocajaDestino,tipolineaflujocajaLogic.getTipoLineaFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolineaflujocajaDestino,tipolineaflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
				
				//this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoLineaFlujoCaja(), this.getIndiceNuevoTipoLineaFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoLineaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoLineaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoLineaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoLineaFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesTipoLineaFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoLineaFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoLineaFlujoCaja();
			
			this.abrirFrameOrderByTipoLineaFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoLineaFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLineaFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSize(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoLineaFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoLineaFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jContentPaneDetalleTipoLineaFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jContentPaneDetalleTipoLineaFlujoCaja.getWidth(),TipoLineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jContentPaneDetalleTipoLineaFlujoCaja.getWidth(),TipoLineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jContentPaneDetalleTipoLineaFlujoCaja.getWidth(),TipoLineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLineaFlujoCaja();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoLineaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoLineaFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLineaFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByTipoLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoLineaFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoLineaFlujoCaja);
				this.jInternalFrameOrderByTipoLineaFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByTipoLineaFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByTipoLineaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLineaFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByTipoLineaFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoLineaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoLineaFlujoCaja==null) {
				
				this.jInternalFrameImportacionTipoLineaFlujoCaja=new ImportacionJInternalFrame(TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoLineaFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoLineaFlujoCaja);
				this.jInternalFrameImportacionTipoLineaFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionTipoLineaFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLineaFlujoCaja"));
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLineaFlujoCaja"));
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLineaFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoLineaFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja=new ReporteDinamicoJInternalFrame(TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja);
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLineaFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLineaFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaLineaFlujoCaja() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jContentPaneDetalleTipoLineaFlujoCaja.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoLineaFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoLineaFlujoCaja);
			
	       	this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormTipoLineaFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoLineaFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoLineaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionTipoLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoLineaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByTipoLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoLineaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByTipoLineaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoLineaFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoLineaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionTipoLineaFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoLineaFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoLineaFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(true);
			//this.isEsNuevoTipoLineaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false) ;
			
			if(tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado() && LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLineaFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoLineaFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoLineaFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(true);
			//this.isEsNuevoTipoLineaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipolineaflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false) ;
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoLineaFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoLineaFlujoCaja(false);
			
			//if(!this.isEsNuevoTipoLineaFlujoCaja) {								
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.tipolineaflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoLineaFlujoCaja=true;
					this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
					this.isEsNuevoTipoLineaFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoLineaFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoLineaFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(false);
			
												
				
				if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoLineaFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,tipolineaflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoLineaFlujoCaja(this.tipolineaflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipolineaflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipolineaflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipolineaflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipolineaflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipolineaflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoLineaFlujoCajaModel) this.jTableDatosTipoLineaFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoLineaFlujoCaja=true;
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
				this.isEsNuevoTipoLineaFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(false);
				
				
				
				if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoLineaFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoLineaFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoLineaFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoLineaFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoLineaFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(false) ;
			
			this.isEsNuevoTipoLineaFlujoCaja=false;
			
			if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoLineaFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
				
				//SI ES MANUAL
				if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoLineaFlujoCaja--;			
			//TipoLineaFlujoCaja tipolineaflujocajaAux= new TipoLineaFlujoCaja();			
			//tipolineaflujocajaAux.setId(this.iIdNuevoTipoLineaFlujoCaja);
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoLineaFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
			
			this.tipolineaflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().add(this.tipolineaflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipolineaflujocajas.add(this.tipolineaflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			
			this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoLineaFlujoCaja(), this.getIndiceNuevoTipoLineaFlujoCaja());
			
			int iLastRow =  this.jTableDatosTipoLineaFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoLineaFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoLineaFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();
			}
			
			//this.abrirFrameTreeTipoLineaFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Linea Flujo Caja S ?", "MANTENIMIENTO DE Tipo Linea Flujo Caja ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoLineaFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoLineaFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.procesarImportacionTipoLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipolineaflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoLineaFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoLineaFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoLineaFlujoCaja.setFileImportacion(this.jInternalFrameImportacionTipoLineaFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoLineaFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoLineaFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		

		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoLineaFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoLineaFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSri_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSri_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSri_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSri_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoria="codigo_sri";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI:
					sNombreCampoCategoriaValor="codigo_sri";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sri");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoLineaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolineaflujocaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolineaflujocaja.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI);
					iRow++;

					for(TipoLineaFlujoCaja tipolineaflujocaja:tipolineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolineaflujocaja.getcodigo_sri());
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
			//	this.getFilaCabeceraExportarExcelTipoLineaFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoLineaFlujoCaja(tipolineaflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoLineaFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoLineaFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoLineaFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoLineaFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoLineaFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoLineaFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoLineaFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoLineaFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoLineaFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoLineaFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoLineaFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoLineaFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoLineaFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLineaFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoLineaFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoLineaFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoLineaFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLineaFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoLineaFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLineaFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLineaFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoLineaFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoLineaFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoLineaFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoLineaFlujoCaja() throws Exception {
		try	{
			if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLineaFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLineaFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoLineaFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoLineaFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoLineaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoLineaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoLineaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoLineaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLineaFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoLineaFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoLineaFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigo_sriBusquedaPorCodigoSri=this.jTextFieldcodigo_sriBusquedaPorCodigoSriTipoLineaFlujoCaja.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoLineaFlujoCajaBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoLineaFlujoCaja.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoLineaFlujoCaja(Boolean esInicializar) throws Exception {				
		if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoLineaFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoLineaFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoLineaFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoLineaFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoLineaFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipolineaflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoLineaFlujoCaja.setModel(new TipoLineaFlujoCajaModel(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoLineaFlujoCaja.setModel(new TipoLineaFlujoCajaModel(this.tipolineaflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoLineaFlujoCaja!=null && this.jInternalFrameOrderByTipoLineaFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoLineaFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipolineaflujocajaConstantesFunciones.resaltarSeleccionarTipoLineaFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipolineaflujocajaConstantesFunciones.resaltarSeleccionarTipoLineaFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,TipoLineaFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.tipolineaflujocajaConstantesFunciones.mostraridTipoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLineaFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipolineaflujocajaConstantesFunciones.resaltaridTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activaridTipoLineaFlujoCaja,this,true,"idTipoLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolineaflujocajaConstantesFunciones.resaltaridTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activaridTipoLineaFlujoCaja,this,true,"idTipoLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipolineaflujocajaConstantesFunciones.mostrarid_empresaTipoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipolineaflujocajaConstantesFunciones.resaltarid_empresaTipoLineaFlujoCaja,this,this.tipolineaflujocajaConstantesFunciones.activarid_empresaTipoLineaFlujoCaja));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipolineaflujocajaConstantesFunciones.resaltarid_empresaTipoLineaFlujoCaja,this,this.tipolineaflujocajaConstantesFunciones.activarid_empresaTipoLineaFlujoCaja,false,"id_empresaTipoLineaFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipolineaflujocajaConstantesFunciones.mostrarnombreTipoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolineaflujocajaConstantesFunciones.resaltarnombreTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activarnombreTipoLineaFlujoCaja,this,true,"nombreTipoLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolineaflujocajaConstantesFunciones.resaltarnombreTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activarnombreTipoLineaFlujoCaja,this,true,"nombreTipoLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI));

		if(this.tipolineaflujocajaConstantesFunciones.mostrarcodigo_sriTipoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolineaflujocajaConstantesFunciones.resaltarcodigo_sriTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activarcodigo_sriTipoLineaFlujoCaja,this,true,"codigo_sriTipoLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolineaflujocajaConstantesFunciones.resaltarcodigo_sriTipoLineaFlujoCaja,this.tipolineaflujocajaConstantesFunciones.activarcodigo_sriTipoLineaFlujoCaja,this,true,"codigo_sriTipoLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoLineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosLineaFlujoCaja && this.tipolineaflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoLineaFlujoCaja && !TipoLineaFlujoCajaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Linea Flujo Cajas");
				tableColumn.setHeaderValue("Linea Flujo Cajas");
				tableColumn.setCellRenderer(new LineaFlujoCajaTableCell(tipolineaflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoLineaFlujoCaja,this,this.tipolineaflujocajaConstantesFunciones.activarLineaFlujoCajaTipoLineaFlujoCaja));
				tableColumn.setCellEditor(new LineaFlujoCajaTableCell(tipolineaflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoLineaFlujoCaja,this,this.tipolineaflujocajaConstantesFunciones.activarLineaFlujoCajaTipoLineaFlujoCaja));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosTipoLineaFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoLineaFlujoCaja.moveColumn(this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoLineaFlujoCaja.moveColumn(this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoLineaFlujoCaja.moveColumn(this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoLineaFlujoCaja.moveColumn(this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoLineaFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoLineaFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoLineaFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoLineaFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoLineaFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoLineaFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipolineaflujocajaLogic.getTipoLineaFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipolineaflujocajas.size()-1;
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
		//this.jTableDatosTipoLineaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoLineaFlujoCaja();
			
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
				
				//this.isEsNuevoTipoLineaFlujoCaja=false;
					
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
				if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLineaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipolineaflujocaja.getsType().equals("DUPLICADO")
				   || this.tipolineaflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoLineaFlujoCaja=true;
				
				} else {
					this.isEsNuevoTipoLineaFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipolineaflujocaja.getId()>=0 && !this.tipolineaflujocaja.getIsNew()) {						
						this.isEsNuevoTipoLineaFlujoCaja=false;
						
					} else {
						this.isEsNuevoTipoLineaFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoLineaFlujoCaja(esRelaciones);						
				
				this.seleccionarTipoLineaFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipolineaflujocaja.getId()<0) {
					this.isEsNuevoTipoLineaFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoLineaFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoLineaFlujoCaja(evt,rowIndex);
				}	
				
				if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoLineaFlujoCaja: " + this.dDif); 
					}
				}								
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoLineaFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipolineaflujocaja)) {
					if(this.tipolineaflujocaja.getId()>0) {
						this.tipolineaflujocaja.setIsDeleted(true);
						
						this.tipolineaflujocajasEliminados.add(this.tipolineaflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().remove(this.tipolineaflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocajas.remove(this.tipolineaflujocaja);				
					}
					
					
					((TipoLineaFlujoCajaModel) this.jTableDatosTipoLineaFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoLineaFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoLineaFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoLineaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipolineaflujocajaConstantesFunciones.cargarid_empresaTipoLineaFlujoCaja || this.tipolineaflujocajaConstantesFunciones.event_dependid_empresaTipoLineaFlujoCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipolineaflujocaja.getid_empresa());
									//this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipolineaflujocaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipolineaflujocaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipolineaflujocaja.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoLineaFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoLineaFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoLineaFlujoCaja(tipolineaflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(tipolineaflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoLineaFlujoCaja(tipolineaflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoLineaFlujoCaja(tipolineaflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setText(tipolineaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setText(tipolineaflujocaja.getnombre());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setText(tipolineaflujocaja.getcodigo_sri());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoLineaFlujoCaja tipolineaflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipolineaflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoLineaFlujoCaja tipolineaflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipolineaflujocajaLocal=this.tipolineaflujocaja;
			} else {
				tipolineaflujocajaLocal=this.tipolineaflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipolineaflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoLineaFlujoCaja(tipolineaflujocajaLocal,true);
					
					if(tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipolineaflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipolineaflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(tipolineaflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(tipolineaflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(tipolineaflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.getText()==null || this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setText("0");
			}

			if(conColumnasBase) {tipolineaflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLineaFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelIdTipoLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolineaflujocaja.setnombre(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelnombreTipoLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolineaflujocaja.setcodigo_sri(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelcodigo_sriTipoLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocajaBean,TipoLineaFlujoCaja tipolineaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocajaOrigen,TipoLineaFlujoCaja tipolineaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolineaflujocajaOrigen.getId()!=null && !tipolineaflujocajaOrigen.getId().equals(0L))) {tipolineaflujocaja.setId(tipolineaflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && tipolineaflujocajaOrigen.getnombre()!=null && !tipolineaflujocajaOrigen.getnombre().equals(""))) {tipolineaflujocaja.setnombre(tipolineaflujocajaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipolineaflujocajaOrigen.getcodigo_sri()!=null && !tipolineaflujocajaOrigen.getcodigo_sri().equals(""))) {tipolineaflujocaja.setcodigo_sri(tipolineaflujocajaOrigen.getcodigo_sri());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setText(tipolineaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setText(tipolineaflujocaja.getnombre());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setText(tipolineaflujocaja.getcodigo_sri());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoLineaFlujoCaja(TipoLineaFlujoCajaBean tipolineaflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setText(tipolineaflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setText(tipolineaflujocajaBean.getnombre());
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setText(tipolineaflujocajaBean.getcodigo_sri());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoLineaFlujoCaja(TipoLineaFlujoCajaParameterReturnGeneral tipolineaflujocajaReturnGeneral,TipoLineaFlujoCajaBean tipolineaflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			TipoLineaFlujoCaja tipolineaflujocajaLocal=new TipoLineaFlujoCaja();
			
			tipolineaflujocajaLocal=tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolineaflujocajaLocal.getId()!=null && !tipolineaflujocajaLocal.getId().equals(0L))) {tipolineaflujocajaBean.setId(tipolineaflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && tipolineaflujocajaLocal.getnombre()!=null && !tipolineaflujocajaLocal.getnombre().equals(""))) {tipolineaflujocajaBean.setnombre(tipolineaflujocajaLocal.getnombre());}
			if(conDefault || (!conDefault && tipolineaflujocajaLocal.getcodigo_sri()!=null && !tipolineaflujocajaLocal.getcodigo_sri().equals(""))) {tipolineaflujocajaBean.setcodigo_sri(tipolineaflujocajaLocal.getcodigo_sri());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoLineaFlujoCajaGenerico(Long idTipoLineaFlujoCajaSeleccionado,JComboBox jComboBoxTipoLineaFlujoCaja,List<TipoLineaFlujoCaja> tipolineaflujocajasLocal)throws Exception {
		try {
			TipoLineaFlujoCaja  tipolineaflujocajaTemp=null;

			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasLocal) {
				if(tipolineaflujocajaAux.getId()!=null && tipolineaflujocajaAux.getId().equals(idTipoLineaFlujoCajaSeleccionado)) {
					tipolineaflujocajaTemp=tipolineaflujocajaAux;
					break;
				}
			}

			jComboBoxTipoLineaFlujoCaja.setSelectedItem(tipolineaflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoLineaFlujoCajaGenerico(JComboBox jComboBoxTipoLineaFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLineaFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoLineaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoLineaFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoLineaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("LineaFlujoCaja")) {
			jButtonLineaFlujoCajaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolineaflujocaja=(TipoLineaFlujoCaja) tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolineaflujocaja =(TipoLineaFlujoCaja) tipolineaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipolineaflujocaja.getIsNew() && !tipolineaflujocaja.getIsChanged() && !tipolineaflujocaja.getIsDeleted()) {
				sDescripcion=tipolineaflujocaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipolineaflujocaja.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoLineaFlujoCaja tipolineaflujocajaRow=new TipoLineaFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolineaflujocajaRow=(TipoLineaFlujoCaja) tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolineaflujocajaRow=(TipoLineaFlujoCaja) tipolineaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonLineaFlujoCajaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoLineaFlujoCaja tipolineaflujocaja) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocaja = (TipoLineaFlujoCaja)this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipolineaflujocaja = (TipoLineaFlujoCaja)this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipolineaflujocaja!=null) {
						this.tipolineaflujocaja = tipolineaflujocaja;
					} else {
						this.tipolineaflujocaja = new TipoLineaFlujoCaja();
					}
				}

				if(this.isTienePermisosLineaFlujoCaja && this.permiteMantenimiento(this.tipolineaflujocaja)) {
					LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup=new LineaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lineaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup;
					} else {
						lineaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame;
					}

					List<TipoLineaFlujoCaja> tipolineaflujocajas=new ArrayList<TipoLineaFlujoCaja>();
					tipolineaflujocajas.add(this.tipolineaflujocaja);
					if(!esRelacionado) {
						//lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setConGuardarRelaciones(false);
						//lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lineaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.cargarLineaFlujoCajaBeanSwingJInternalFrame(tipolineaflujocajas,this.tipolineaflujocaja,lineaflujocajaBeanSwingJInternalFrame,/*conInicializar,*/lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getConGuardarRelaciones(),lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado());
					lineaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("no_relacionado");

						lineaflujocajaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA + (LineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA/2));

						lineaflujocajaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoLineaFlujoCaja=(TitledBorder)this.jScrollPanelDatosTipoLineaFlujoCaja.getBorder();
						TitledBorder titledBorderLineaFlujoCaja=(TitledBorder)lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.getBorder();

						titledBorderLineaFlujoCaja.setTitle(titledBorderTipoLineaFlujoCaja.getTitle() + " -> Linea Flujo Caja");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaflujocajaBeanSwingJInternalFrame);
						}

						lineaflujocajaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lineaflujocajaBeanSwingJInternalFrame);

						lineaflujocajaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Linea Flujo Caja",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));			
			this.jButtonDuplicarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja && this.isPermisoDuplicarTipoLineaFlujoCaja));			
			this.jButtonCopiarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja && this.isPermisoCopiarTipoLineaFlujoCaja));
			this.jButtonVerFormTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja && this.isPermisoVerFormTipoLineaFlujoCaja));
			
			this.jButtonAbrirOrderByTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));			
			
			this.jButtonNuevoRelacionesTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoLineaFlujoCaja && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja && this.isPermisoEliminarTipoLineaFlujoCaja));
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja);							
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));						
			this.jButtonDuplicarToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja && this.isPermisoDuplicarTipoLineaFlujoCaja));						
			this.jButtonCopiarToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja && this.isPermisoCopiarTipoLineaFlujoCaja));			
			this.jButtonVerFormToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja && this.isPermisoVerFormTipoLineaFlujoCaja));			
			this.jButtonAbrirOrderByToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));
			this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoLineaFlujoCaja && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja  && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja && this.isPermisoEliminarTipoLineaFlujoCaja));
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarToolBarTipoLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja);				
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));			
			this.jMenuItemDuplicarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja && this.isPermisoDuplicarTipoLineaFlujoCaja));			
			this.jMenuItemCopiarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja && this.isPermisoCopiarTipoLineaFlujoCaja));			
			this.jMenuItemVerFormTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja && this.isPermisoVerFormTipoLineaFlujoCaja));			
			this.jMenuItemAbrirOrderByTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));			
			//this.jMenuItemMostrarOcultarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja && this.isPermisoOrdenTipoLineaFlujoCaja));			
			this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja && this.isPermisoNuevoTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemModificarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoLineaFlujoCaja && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemActualizarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja && this.isPermisoActualizarTipoLineaFlujoCaja));	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemEliminarTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja && this.isPermisoEliminarTipoLineaFlujoCaja));
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemCancelarTipoLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=this.jButtonNuevoTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja=this.jButtonDuplicarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja=this.jButtonCopiarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja=this.jButtonVerFormTipoLineaFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoLineaFlujoCaja=this.jButtonAbrirOrderByTipoLineaFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=this.jButtonNuevoRelacionesTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=this.jButtonModificarTipoLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=this.jButtonNuevoToolBarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarToolBarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarToolBarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarToolBarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarToolBarTipoLineaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=this.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=this.jMenuItemNuevoTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemModificarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemActualizarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemEliminarTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemCancelarTipoLineaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoLineaFlujoCaja(Boolean esInicializar) {
		if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLineaFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoLineaFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoLineaFlujoCaja() {
		this.jButtonNuevoTipoLineaFlujoCaja.setVisible(this.isPermisoNuevoTipoLineaFlujoCaja);			
		this.jButtonDuplicarTipoLineaFlujoCaja.setVisible(this.isPermisoDuplicarTipoLineaFlujoCaja);			
		this.jButtonCopiarTipoLineaFlujoCaja.setVisible(this.isPermisoCopiarTipoLineaFlujoCaja);			
		this.jButtonVerFormTipoLineaFlujoCaja.setVisible(this.isPermisoVerFormTipoLineaFlujoCaja);			
		
		this.jButtonAbrirOrderByTipoLineaFlujoCaja.setVisible(this.isPermisoOrdenTipoLineaFlujoCaja);					
		
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.setVisible(this.isPermisoNuevoTipoLineaFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarTipoLineaFlujoCaja.setVisible(this.isPermisoActualizarTipoLineaFlujoCaja);	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.setVisible(this.isPermisoActualizarTipoLineaFlujoCaja);	
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.setVisible(this.isPermisoEliminarTipoLineaFlujoCaja);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja);						
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.setVisible(this.isPermisoGuardarCambiosTipoLineaFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setVisible(this.isPermisoActualizarTipoLineaFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLineaFlujoCaja() {
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarTipoLineaFlujoCaja.setVisible(this.isPermisoActualizarTipoLineaFlujoCaja);	
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.setVisible(this.isPermisoActualizarTipoLineaFlujoCaja);	
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.setVisible(this.isPermisoEliminarTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja);							
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja && this.isPermisoGuardarCambiosTipoLineaFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoLineaFlujoCaja() {
		if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoLineaFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoLineaFlujoCaja() {
	}
	
	public void jTableDatosTipoLineaFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoLineaFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.gettipolineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolineaflujocaja==null) {
						this.tipolineaflujocaja = new TipoLineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				}

				if(this.tipolineaflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipolineaflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoLineaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoLineaFlujoCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoLineaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoLineaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.gettipolineaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipolineaflujocajaLogic.getConnexion());

				if(this.tipolineaflujocaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipolineaflujocaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoLineaFlujoCaja=(TitledBorder)this.jScrollPanelDatosTipoLineaFlujoCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoLineaFlujoCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.gettipolineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolineaflujocaja==null) {
						this.tipolineaflujocaja = new TipoLineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				}

				if(this.tipolineaflujocaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipolineaflujocaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.gettipolineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolineaflujocaja==null) {
						this.tipolineaflujocaja = new TipoLineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				}

				if(this.tipolineaflujocaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipolineaflujocaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sriTipoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.gettipolineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolineaflujocaja==null) {
						this.tipolineaflujocaja = new TipoLineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);
				}

				if(this.tipolineaflujocaja.getcodigo_sri()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sri like '%"+this.tipolineaflujocaja.getcodigo_sri()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoSriTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);

			this.getTipoLineaFlujoCajasBusquedaPorCodigoSri();

			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);

			//if(TipoLineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);

			this.getTipoLineaFlujoCajasBusquedaPorId();

			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);

			//if(TipoLineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);

			this.getTipoLineaFlujoCajasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);

			//if(TipoLineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);

			this.getTipoLineaFlujoCajasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);

			//if(TipoLineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoLineaFlujoCaja() {
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
		

		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.dispose();
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionTipoLineaFlujoCaja!=null) {
			this.jInternalFrameImportacionTipoLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionTipoLineaFlujoCaja.dispose();
			this.jInternalFrameImportacionTipoLineaFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoLineaFlujoCaja();
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoLineaFlujoCaja")) {
				jButtonDuplicarTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoLineaFlujoCaja")) {
				jButtonCopiarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoLineaFlujoCaja")) {
				jButtonVerFormTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoLineaFlujoCaja")) {
				jButtonDuplicarTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoLineaFlujoCaja")) {
				jButtonDuplicarTipoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoLineaFlujoCaja")) {
				jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoLineaFlujoCaja")) {
				jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoLineaFlujoCaja")) {
				jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoLineaFlujoCaja")) {
				jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoLineaFlujoCaja")) {
				jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoLineaFlujoCaja")) {
				jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoLineaFlujoCaja")) {
				jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoLineaFlujoCaja")) {
				jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoLineaFlujoCaja")) {
				jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoLineaFlujoCaja")) {
				jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoLineaFlujoCaja")) {
				jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoLineaFlujoCaja")) {
				jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoLineaFlujoCaja")) {
				jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoLineaFlujoCaja")) {
				jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoLineaFlujoCaja")) {
				jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoLineaFlujoCaja")) {
				jButtonMostrarOcultarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoLineaFlujoCaja")) {
				jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoLineaFlujoCaja")) {
				jButtonCopiarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoLineaFlujoCaja")) {
				jButtonVerFormTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoLineaFlujoCaja")) {
				jButtonCopiarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoLineaFlujoCaja")) {
				jButtonVerFormTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoLineaFlujoCaja")) {
				jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoLineaFlujoCaja")) {
				jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoLineaFlujoCaja")) {
				jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoLineaFlujoCaja")) {
				jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoLineaFlujoCaja")) {
				jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoLineaFlujoCaja")) {
				jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoLineaFlujoCaja")) {
				jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoLineaFlujoCaja")) {
				jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoLineaFlujoCaja")) {
				jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoLineaFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoLineaFlujoCaja")) {
				jButtonAbrirOrderByTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoLineaFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoLineaFlujoCaja")) {
				jButtonMostrarOcultarTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoLineaFlujoCaja")) {
				jButtonCerrarReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoLineaFlujoCaja")) {
				jButtonGenerarReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoLineaFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoLineaFlujoCaja")) {
				jButtonCerrarImportacionTipoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoLineaFlujoCaja")) {
				
				jButtonGenerarImportacionTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoLineaFlujoCaja")) {
				
				jButtonAbrirImportacionTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoLineaFlujoCaja")) {
				jComboBoxTiposAccionesTipoLineaFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoLineaFlujoCaja")) {
				jComboBoxTiposRelacionesTipoLineaFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoLineaFlujoCaja")) {
				jComboBoxTiposAccionesTipoLineaFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoLineaFlujoCaja")) {
				
				jComboBoxTiposSeleccionarTipoLineaFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoLineaFlujoCaja")) {
				jTextFieldValorCampoGeneralTipoLineaFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoLineaFlujoCaja")) {
				jButtonAbrirOrderByTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoLineaFlujoCaja")) {
				jButtonAbrirOrderByTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoLineaFlujoCaja")) {
				jButtonCerrarOrderByTipoLineaFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLineaFlujoCajaBusqueda")) {
				this.jButtonidTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLineaFlujoCajaUpdate")) {
				this.jButtonid_empresaTipoLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLineaFlujoCajaBusqueda")) {
				this.jButtonid_empresaTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLineaFlujoCajaBusqueda")) {
				this.jButtonnombreTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoLineaFlujoCajaBusqueda")) {
				this.jButtoncodigo_sriTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoSriTipoLineaFlujoCaja")) {
				this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTipoLineaFlujoCaja")) {
				this.jButtonBusquedaPorIdTipoLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoLineaFlujoCaja")) {
				this.jButtonBusquedaPorNombreTipoLineaFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoLineaFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoLineaFlujoCaja tipolineaflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipolineaflujocajaLocal=this.tipolineaflujocaja;
			} else {
				tipolineaflujocajaLocal=this.tipolineaflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
							
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
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
			
			


			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
								
						
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
								
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
							
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
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
			
			


			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
								
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoLineaFlujoCaja")) {
					jCheckBoxSeleccionarTodosTipoLineaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoLineaFlujoCaja")) {
					jCheckBoxSeleccionadosTipoLineaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoLineaFlujoCaja")) {
					
				}
				
				


				
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
												
				
				


				
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
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
			
			


			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolineaflujocaja);
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
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
				
				


				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoLineaFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoLineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolineaflujocajaAnterior =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoLineaFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoLineaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoLineaFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipolineaflujocaja =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipolineaflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoLineaFlujoCaja")) {
				
				}
				
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoLineaFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoLineaFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoLineaFlujoCaja")) {
			
			}
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoLineaFlujoCaja();
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoLineaFlujoCaja")) {
				jButtonDuplicarTipoLineaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoLineaFlujoCaja")) {
				jButtonCopiarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoLineaFlujoCaja")) {
				jButtonVerFormTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoLineaFlujoCaja")) {
				jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoLineaFlujoCaja")) {
				jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoLineaFlujoCaja")) {
				jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoLineaFlujoCaja")) {
				jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoLineaFlujoCaja")) {
				jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoLineaFlujoCaja")) {
				jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoLineaFlujoCaja")) {
				jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoLineaFlujoCaja")) {
				jButtonAbrirOrderByTipoLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoLineaFlujoCaja")) {
				jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoLineaFlujoCaja")) {
				jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoLineaFlujoCaja")) {
				jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoLineaFlujoCajaBusqueda")) {
				this.jButtonidTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoLineaFlujoCajaUpdate")) {
				this.jButtonid_empresaTipoLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoLineaFlujoCajaBusqueda")) {
				this.jButtonid_empresaTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoLineaFlujoCajaBusqueda")) {
				this.jButtonnombreTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sriTipoLineaFlujoCajaBusqueda")) {
				this.jButtoncodigo_sriTipoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoLineaFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoLineaFlujoCaja")) {
				closingInternalFrameTipoLineaFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarTipoLineaFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoLineaFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            TipoLineaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoLineaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLineaFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoLineaFlujoCajaActionPerformed(null);
			}
			
			TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolineaflujocaja,new Object(),this.tipolineaflujocajaParameterGeneral,this.tipolineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoLineaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoLineaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoLineaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipolineaflujocaja)) {
			if(!esControlTabla) {
				if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);			
				}
				
				if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.procesarEventosTipoLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this.tipolineaflujocaja,this.tipolineaflujocajaParameterGeneral,this.isEsNuevoTipoLineaFlujoCaja,classes);//this.tipolineaflujocajaLogic.getTipoLineaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral,this.tipolineaflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoLineaFlujoCaja(classes,this.tipolineaflujocajaReturnGeneral,this.tipolineaflujocajaBean,false);
					}
						
					if(this.tipolineaflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja());	
					}
						
					if(this.tipolineaflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja(),classes);//this.tipolineaflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoLineaFlujoCaja(this.tipolineaflujocaja,classes);//this.tipolineaflujocajaBean);									
				}
			
				if(TipoLineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoLineaFlujoCaja(this.tipolineaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoLineaFlujoCaja(this.tipolineaflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipolineaflujocajaAnterior!=null) {
						this.tipolineaflujocaja=this.tipolineaflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.procesarEventosTipoLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this.tipolineaflujocaja,this.tipolineaflujocajaParameterGeneral,this.isEsNuevoTipoLineaFlujoCaja,classes);//this.tipolineaflujocajaLogic.getTipoLineaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja(),tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja(),this.tipolineaflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoLineaFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoLineaFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoLineaFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoLineaFlujoCaja() throws Exception {
		
		TipoLineaFlujoCajaModel tipolineaflujocajaModel=(TipoLineaFlujoCajaModel)this.jTableDatosTipoLineaFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolineaflujocajaModel.tipolineaflujocajas=this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipolineaflujocajaModel.tipolineaflujocajas=this.tipolineaflujocajas;
		}
		
		
		((TipoLineaFlujoCajaModel) this.jTableDatosTipoLineaFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoLineaFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipolineaflujocajaAnterior(),this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipolineaflujocajaAnterior(),this.tipolineaflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoLineaFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(tipolineaflujocaja.getLineaFlujoCajas());
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolineaflujocaja,new Object(),generalEntityParameterGeneral,this.tipolineaflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoLineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoLineaFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoLineaFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoLineaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolineaflujocaja,new Object(),generalEntityParameterGeneral,this.tipolineaflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoLineaFlujoCaja(TipoLineaFlujoCajaBean tipolineaflujocajaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(tipolineaflujocaja.getLineaFlujoCajas());
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoLineaFlujoCaja(ArrayList<Classe> classes,TipoLineaFlujoCajaReturnGeneral tipolineaflujocajaReturnGeneral,TipoLineaFlujoCajaBean tipolineaflujocajaBean,Boolean conDefault) throws Exception {
		
			this.tipolineaflujocajaBean.setLineaFlujoCajas(tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja().getLineaFlujoCajas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					tipolineaflujocaja.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipolineaflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja = new TipoLineaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipolineaflujocajaSessionBean.getConGuardarRelaciones(),this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.tipolineaflujocajaLogic=this.tipolineaflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyTipoLineaFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoLineaFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoLineaFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoLineaFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoLineaFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLineaFlujoCaja"));
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoLineaFlujoCaja"));

		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLineaFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemModificarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLineaFlujoCaja"));
						
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemActualizarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLineaFlujoCaja"));
								
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemEliminarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLineaFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemCancelarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLineaFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemDetalleCerrarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLineaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLineaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLineaFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonidTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonnombreTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoLineaFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLineaFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoLineaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoLineaFlujoCaja"));
		}
		
		this.jTableDatosTipoLineaFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoLineaFlujoCaja"));
		
		this.jTableDatosTipoLineaFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoLineaFlujoCaja"));
		
		this.jButtonNuevoTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoTipoLineaFlujoCaja"));
		
		this.jButtonDuplicarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarTipoLineaFlujoCaja"));
		
		this.jButtonCopiarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarTipoLineaFlujoCaja"));
		
		this.jButtonVerFormTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormTipoLineaFlujoCaja"));
		
		
		this.jButtonNuevoToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoLineaFlujoCaja"));
			
		this.jButtonDuplicarToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemNuevoTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoLineaFlujoCaja"));
			
		this.jMenuItemDuplicarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoLineaFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoLineaFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoLineaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonModificarToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoLineaFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemModificarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonActualizarToolBarTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoLineaFlujoCaja"));
				
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemActualizarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonEliminarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoLineaFlujoCaja"));
						
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemEliminarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonCancelarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoLineaFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemCancelarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoLineaFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoLineaFlujoCaja"));		
		
		
		this.jButtonCerrarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarTipoLineaFlujoCaja"));
		
		
		this.jButtonCerrarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemCerrarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoLineaFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jMenuItemDetalleCerrarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoLineaFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoLineaFlujoCaja"));
			
		this.jButtonVerFormToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoLineaFlujoCaja"));
		
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoLineaFlujoCaja"));
			
		this.jMenuItemCopiarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoLineaFlujoCaja"));		
		
		this.jMenuItemVerFormTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoLineaFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLineaFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoLineaFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoLineaFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoLineaFlujoCaja"));
		
		this.jMenuItemRecargarInformacionTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoLineaFlujoCaja"));		
		
		
		
		this.jButtonAnterioresTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresTipoLineaFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoLineaFlujoCaja"));
		
		this.jMenuItemAnterioresTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoLineaFlujoCaja"));		
		
		
		this.jButtonSiguientesTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesTipoLineaFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemSiguientesTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoLineaFlujoCaja"));
			
		this.jMenuItemAbrirOrderByTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoLineaFlujoCaja"));
			
		this.jMenuItemMostrarOcultarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoLineaFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoLineaFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoLineaFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoLineaFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoLineaFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoLineaFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoLineaFlujoCaja"));

		this.jCheckBoxSeleccionadosTipoLineaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoLineaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoLineaFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoLineaFlujoCaja"));
			
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoLineaFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoLineaFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoLineaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonidTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonnombreTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoLineaFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSriTipoLineaFlujoCaja"));

			this.jButtonBusquedaPorIdTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoLineaFlujoCaja"));

			this.jButtonBusquedaPorNombreTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoLineaFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoLineaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLineaFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoLineaFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoLineaFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoLineaFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoLineaFlujoCaja!=null) {
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoLineaFlujoCaja"));
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoLineaFlujoCaja"));
				this.jInternalFrameImportacionTipoLineaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoLineaFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoLineaFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarTipoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoLineaFlujoCaja"));			
			
			if(this.jInternalFrameOrderByTipoLineaFlujoCaja!=null) {
				this.jInternalFrameOrderByTipoLineaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoLineaFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTabbedPaneRelacionesTipoLineaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoLineaFlujoCaja"));
		
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
            		closingInternalFrameTipoLineaFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoLineaFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            TipoLineaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoLineaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoLineaFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoLineaFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoLineaFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoLineaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoLineaFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoLineaFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoLineaFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoLineaFlujoCaja";
		inputMap = this.jButtonModificarTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoLineaFlujoCaja";
		inputMap = this.jButtonActualizarTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoLineaFlujoCaja";
		inputMap = this.jButtonEliminarTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoLineaFlujoCaja";
		inputMap = this.jButtonCancelarTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoLineaFlujoCaja";
		inputMap = this.jButtonCerrarTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoLineaFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonGuardarCambiosTipoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoLineaFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoLineaFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonidTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonid_empresaTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtonnombreTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sriTipoLineaFlujoCajaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoSriTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSriTipoLineaFlujoCaja"));

		this.jButtonBusquedaPorIdTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoLineaFlujoCaja"));

		this.jButtonBusquedaPorNombreTipoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoLineaFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoLineaFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoLineaFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
					tipolineaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajas) {
					tipolineaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoLineaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
						tipolineaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajas) {
						tipolineaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLineaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLineaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoLineaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoLineaFlujoCaja.getSelectedRows();
			
			TipoLineaFlujoCaja tipolineaflujocajaLocal=new TipoLineaFlujoCaja();
			
			//this.seleccionarTodosTipoLineaFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLocal =(TipoLineaFlujoCaja) this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas().toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipolineaflujocajaLocal =(TipoLineaFlujoCaja) this.tipolineaflujocajas.toArray()[this.jTableDatosTipoLineaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipolineaflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
						tipolineaflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajas) {
						tipolineaflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoLineaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoLineaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoLineaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoLineaFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoLineaFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoLineaFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolineaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipolineaflujocajaAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajas) {
					
						if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolineaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI)) {
							existe=true;
							tipolineaflujocajaAux.setcodigo_sri(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoLineaFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoLineaFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoLineaFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoLineaFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoLineaFlujoCaja(conSplash);
				
					this.generarReporteTipoLineaFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoLineaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLineaFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoLineaFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLineaFlujoCaja();
				
				this.exportarTipoLineaFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoLineaFlujoCajas();
				//this.importarTipoLineaFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoLineaFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoLineaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Linea Flujo Caja ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoLineaFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoLineaFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoLineaFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoLineaFlujoCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoLineaFlujoCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoLineaFlujoCaja(conSplash);
					
						//this.actualizarParametrosGeneralTipoLineaFlujoCaja();
						
						this.generarReporteProcesoAccionTipoLineaFlujoCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Linea Flujo Caja S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Linea Flujo Caja ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoLineaFlujoCaja();
				
						this.actualizarParametrosGeneralTipoLineaFlujoCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipolineaflujocajaReturnGeneral=tipolineaflujocajaLogic.procesarAccionTipoLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas(),this.tipolineaflujocajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoLineaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoLineaFlujoCaja();
					
					TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoLineaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoLineaFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoLineaFlujoCaja();
			
			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
			TipoLineaFlujoCaja tipolineaflujocaja=new TipoLineaFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoLineaFlujoCaja.getSelectedItem();
			
			
			
			
			tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipolineaflujocajasSeleccionados.size()==1) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
					tipolineaflujocaja=tipolineaflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Linea Flujo Caja")) {
					jButtonLineaFlujoCajaActionPerformed(null,rowIndex,true,false,tipolineaflujocaja);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoLineaFlujoCaja();
			
      		//this.finishProcessTipoLineaFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoLineaFlujoCajaReturnGeneral() throws Exception {
		if(this.tipolineaflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipolineaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipolineaflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipolineaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipolineaflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipolineaflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
		}
		
		if(this.tipolineaflujocajaReturnGeneral.getConRetornoLista() || this.tipolineaflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipolineaflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolineaflujocajaLogic.setTipoLineaFlujoCajas(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipolineaflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolineaflujocajaLogic.setTipoLineaFlujoCaja(this.tipolineaflujocajaReturnGeneral.getTipoLineaFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoLineaFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoLineaFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<TipoLineaFlujoCaja> getTipoLineaFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoLineaFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajaLogic.getTipoLineaFlujoCajas()) {
					if(tipolineaflujocajaAux.getIsSelected()) {
						tipolineaflujocajasSeleccionados.add(tipolineaflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoLineaFlujoCaja tipolineaflujocajaAux:this.tipolineaflujocajas) {
					if(tipolineaflujocajaAux.getIsSelected()) {
						tipolineaflujocajasSeleccionados.add(tipolineaflujocajaAux);				
					}
				}
			}
			
			if(tipolineaflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipolineaflujocajasSeleccionados.addAll(this.tipolineaflujocajaLogic.getTipoLineaFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipolineaflujocajasSeleccionados.addAll(this.tipolineaflujocajas);				
					}
				}
			}
		} else {
			tipolineaflujocajasSeleccionados.add(this.tipolineaflujocaja);
		}
		
		return tipolineaflujocajasSeleccionados;
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
	
	public void generarReporteTipoLineaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLineaFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoLineaFlujoCajasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoLineaFlujoCajasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Linea Flujo Caja ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoLineaFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoLineaFlujoCaja();
		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoLineaFlujoCaja();
		
		
		//this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados ,tipolineaflujocajaImplementable,tipolineaflujocajaImplementableHome);
	}
	
	public void mostrarImportacionTipoLineaFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoLineaFlujoCaja();
		
		this.abrirFrameImportacionTipoLineaFlujoCaja();		
		
			
		//this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados ,tipolineaflujocajaImplementable,tipolineaflujocajaImplementableHome);
	}
	
	public void importarTipoLineaFlujoCajas() throws Exception {		
	
	}
	
	public void exportarTipoLineaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoLineaFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoLineaFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Linea Flujo Caja ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoLineaFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoLineaFlujoCaja(tipolineaflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipolineaflujocajaAux.setsDetalleGeneralEntityReporte(tipolineaflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoLineaFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoLineaFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLineaFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipolineaflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolineaflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolineaflujocaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolineaflujocaja.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolineaflujocaja.getcodigo_sri();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoLineaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoLineaFlujoCaja(row);				
				iRow++;
			}				
			
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoLineaFlujoCaja(tipolineaflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();		
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolineaflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipolineaflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipolineaflujocaja");
			//elementRoot.appendChild(element);
		
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
				element = document.createElement("tipolineaflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoLineaFlujoCaja(tipolineaflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Linea Flujo Caja ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoLineaFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipolineaflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolineaflujocaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolineaflujocaja.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolineaflujocaja.getcodigo_sri());				
	}
	
	public void setFilaDatosExportarXmlTipoLineaFlujoCaja(TipoLineaFlujoCaja tipolineaflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoLineaFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipolineaflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoLineaFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipolineaflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoLineaFlujoCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipolineaflujocaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoLineaFlujoCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipolineaflujocaja.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_sri = document.createElement(TipoLineaFlujoCajaConstantesFunciones.CODIGOSRI);
		elementcodigo_sri.appendChild(document.createTextNode(tipolineaflujocaja.getcodigo_sri().trim()));
		element.appendChild(elementcodigo_sri);
	}
	
	public void generarReporteGroupGenericoTipoLineaFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados=new ArrayList<TipoLineaFlujoCaja>();
		
		tipolineaflujocajasSeleccionados=this.getTipoLineaFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoLineaFlujoCaja(tipolineaflujocajasSeleccionados);
		
		this.generarReporteTipoLineaFlujoCajas("Todos",tipolineaflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoLineaFlujoCaja(ArrayList<TipoLineaFlujoCaja> tipolineaflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasSeleccionados) {
				tipolineaflujocajaAux.setsDetalleGeneralEntityReporte(tipolineaflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipolineaflujocajaAux.setsDescripcionGeneralEntityReporte1(tipolineaflujocajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipolineaflujocajaAux.setsDescripcionGeneralEntityReporte1(tipolineaflujocajaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI)) {
					existe=true;
					tipolineaflujocajaAux.setsDescripcionGeneralEntityReporte1(tipolineaflujocajaAux.getcodigo_sri());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoLineaFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoLineaFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsTipoLineaFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoLineaFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoLineaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;												
			}
			
			this.jButtonCerrarTipoLineaFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoLineaFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.tipolineaflujocaja)) {
			this.isVisibilidadCeldaActualizarTipoLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoLineaFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoLineaFlujoCaja() {
		this.isVisibilidadCeldaNuevoTipoLineaFlujoCaja=false;
		this.isVisibilidadCeldaGuardarCambiosTipoLineaFlujoCaja=false;
	}
	
	public void actualizarEstadoPanelsTipoLineaFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoLineaFlujoCaja!=null) {
				this.jScrollPanelDatosTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoLineaFlujoCaja!=null) {
				this.jPanelPaginacionTipoLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
					this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoLineaFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigoSri=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigoSri) {this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);}

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(jPanelBusquedaPorIdTipoLineaFlujoCaja);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(jPanelBusquedaPorNombreTipoLineaFlujoCaja);}
		}
		
	}
	
	

	public String registrarSesionTipoLineaFlujoCajaParaLineaFlujoCajas() throws Exception {
		Boolean isPaginaPopupLineaFlujoCaja=false;

		try {

			if(this.tipolineaflujocajaSessionBean==null) {
				this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setsPathNavegacionActual(tipolineaflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLineaFlujoCaja=this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(true);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(TipoLineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja(true);
			this.jInternalFrameDetalleFormTipoLineaFlujoCaja.lineaflujocajaSessionBean.setlidTipoLineaFlujoCajaActual(this.idTipoLineaFlujoCajaActual);

			tipolineaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoLineaFlujoCaja(true);
			tipolineaflujocajaSessionBean.setlIdTipoLineaFlujoCajaActualForeignKey(this.idTipoLineaFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		
		if(this.tipolineaflujocajaSessionBean==null) {
			this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		}
		
		this.tipolineaflujocajaSessionBean.setsUltimaBusquedaTipoLineaFlujoCaja(this.getsAccionBusqueda());
		this.tipolineaflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipolineaflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoSri")) {
			tipolineaflujocajaSessionBean.setcodigo_sri(this.getcodigo_sriBusquedaPorCodigoSri());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipolineaflujocajaSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipolineaflujocajaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipolineaflujocajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		
		if(this.tipolineaflujocajaSessionBean==null) {
			this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		}
		
		if(this.tipolineaflujocajaSessionBean.getsUltimaBusquedaTipoLineaFlujoCaja()!=null&&!this.tipolineaflujocajaSessionBean.getsUltimaBusquedaTipoLineaFlujoCaja().equals("")) {
			this.setsAccionBusqueda(tipolineaflujocajaSessionBean.getsUltimaBusquedaTipoLineaFlujoCaja());
			this.setiNumeroPaginacion(tipolineaflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipolineaflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoSri")) {
				this.setcodigo_sriBusquedaPorCodigoSri(tipolineaflujocajaSessionBean.getcodigo_sri());
				tipolineaflujocajaSessionBean.setcodigo_sri("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipolineaflujocajaSessionBean.getid());
				tipolineaflujocajaSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipolineaflujocajaSessionBean.getnombre());
				tipolineaflujocajaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipolineaflujocajaSessionBean.getid_empresa());
				tipolineaflujocajaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipolineaflujocajaSessionBean.setsUltimaBusquedaTipoLineaFlujoCaja("");
		this.tipolineaflujocajaSessionBean.setiNumeroPaginacion(TipoLineaFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.tipolineaflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoLineaFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoLineaFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioTipoLineaFlujoCaja();
		this.updateVisibilidadBusquedasFormularioTipoLineaFlujoCaja();
		this.updateHabilitarBusquedasFormularioTipoLineaFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoLineaFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponents().length>0) {
	

		if(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoSriTipoLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoSriTipoLineaFlujoCaja);
			}
		}

		if(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoLineaFlujoCaja);
			}
		}

		if(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoLineaFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoLineaFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorCodigoSriTipoLineaFlujoCaja);
			if(!this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorCodigoSriTipoLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorIdTipoLineaFlujoCaja);
			if(!this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorIdTipoLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoLineaFlujoCaja);
			if(!this.tipolineaflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoLineaFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorCodigoSriTipoLineaFlujoCaja);
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setEnabledAt(index,this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorCodigoSriTipoLineaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorIdTipoLineaFlujoCaja);
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setEnabledAt(index,this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorIdTipoLineaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorNombreTipoLineaFlujoCaja);
				this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setEnabledAt(index,this.tipolineaflujocajaConstantesFunciones.activarBusquedaPorNombreTipoLineaFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoLineaFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigoSri")) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoLineaFlujoCaja);

			this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);

			this.tipolineaflujocajaConstantesFunciones.setResaltarBusquedaPorCodigoSriTipoLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoSriTipoLineaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorIdTipoLineaFlujoCaja);

			this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);

			this.tipolineaflujocajaConstantesFunciones.setResaltarBusquedaPorIdTipoLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorIdTipoLineaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoLineaFlujoCaja);

			this.jTabbedPaneBusquedasTipoLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoLineaFlujoCaja.getComponent(index);

			this.tipolineaflujocajaConstantesFunciones.setResaltarBusquedaPorNombreTipoLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoLineaFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoLineaFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoLineaFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoLineaFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioTipoLineaFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioTipoLineaFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoLineaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipolineaflujocajaConstantesFunciones.resaltaridTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltaridTipoLineaFlujoCaja);}
		if(this.tipolineaflujocajaConstantesFunciones.resaltarid_empresaTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarid_empresaTipoLineaFlujoCaja);}
		if(this.tipolineaflujocajaConstantesFunciones.resaltarnombreTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarnombreTipoLineaFlujoCaja);}
		if(this.tipolineaflujocajaConstantesFunciones.resaltarcodigo_sriTipoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setBorder(this.tipolineaflujocajaConstantesFunciones.resaltarcodigo_sriTipoLineaFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoLineaFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostraridTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelidTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostraridTipoLineaFlujoCaja);
		//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarid_empresaTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelid_empresaTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarid_empresaTipoLineaFlujoCaja);
		//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarnombreTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelnombreTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarnombreTipoLineaFlujoCaja);
		//this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarcodigo_sriTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jPanelcodigo_sriTipoLineaFlujoCaja.setVisible(this.tipolineaflujocajaConstantesFunciones.mostrarcodigo_sriTipoLineaFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoLineaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoLineaFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jLabelidTipoLineaFlujoCaja.setEnabled(this.tipolineaflujocajaConstantesFunciones.activaridTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jComboBoxid_empresaTipoLineaFlujoCaja.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarid_empresaTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextAreanombreTipoLineaFlujoCaja.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarnombreTipoLineaFlujoCaja);
		this.jInternalFrameDetalleFormTipoLineaFlujoCaja.jTextFieldcodigo_sriTipoLineaFlujoCaja.setEnabled(this.tipolineaflujocajaConstantesFunciones.activarcodigo_sriTipoLineaFlujoCaja);
		}
	}
	
		
}