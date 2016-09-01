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

import com.bydan.erp.contabilidad.util.TipoDetalleDocumentoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoDetalleDocumentoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoDetalleDocumentoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoDetalleDocumentoBean;
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
public class TipoDetalleDocumentoBeanSwingJInternalFrame extends TipoDetalleDocumentoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDetalleDocumentoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDetalleDocumento> tipodetalledocumentoValidator = new ClassValidator<TipoDetalleDocumento>(TipoDetalleDocumento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDetalleDocumento tipodetalledocumento;	
	public TipoDetalleDocumento tipodetalledocumentoAux;
	public TipoDetalleDocumento tipodetalledocumentoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDetalleDocumento tipodetalledocumentoTotales;
	public Long idTipoDetalleDocumentoActual;
	public Long iIdNuevoTipoDetalleDocumento=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleDocumento=false;

	public Boolean getIsTienePermisosDetalleDocumento() {
		return isTienePermisosDetalleDocumento;
	}

	public void setIsTienePermisosDetalleDocumento(Boolean isTienePermisosDetalleDocumento) {
		this.isTienePermisosDetalleDocumento= isTienePermisosDetalleDocumento;
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
	
	public Boolean isPermisoTodoTipoDetalleDocumento;
	public Boolean isPermisoNuevoTipoDetalleDocumento;
	public Boolean isPermisoActualizarTipoDetalleDocumento;
	public Boolean isPermisoActualizarOriginalTipoDetalleDocumento;
	public Boolean isPermisoEliminarTipoDetalleDocumento;
	public Boolean isPermisoGuardarCambiosTipoDetalleDocumento;
	public Boolean isPermisoConsultaTipoDetalleDocumento;
	public Boolean isPermisoBusquedaTipoDetalleDocumento;
	public Boolean isPermisoReporteTipoDetalleDocumento;
	public Boolean isPermisoPaginacionMedioTipoDetalleDocumento;
	public Boolean isPermisoPaginacionAltoTipoDetalleDocumento;
	public Boolean isPermisoPaginacionTodoTipoDetalleDocumento;
	public Boolean isPermisoCopiarTipoDetalleDocumento;
	public Boolean isPermisoVerFormTipoDetalleDocumento;
	public Boolean isPermisoDuplicarTipoDetalleDocumento;
	public Boolean isPermisoOrdenTipoDetalleDocumento;
	
	
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
	
	public TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoReturnGeneral;
	public TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoParameterGeneral;
	
	

	public DetalleDocumentoLogic detalledocumentoLogic=null;

	public DetalleDocumentoLogic getDetalleDocumentoLogic() {
		return detalledocumentoLogic;
	}

	public void setDetalleDocumentoLogic(DetalleDocumentoLogic detalledocumentoLogic) {
		this.detalledocumentoLogic = detalledocumentoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDetalleDocumento=false;
	public Boolean esParaAccionDesdeFormularioTipoDetalleDocumento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDetalleDocumentoSessionBeanAdditional tipodetalledocumentoSessionBeanAdditional=null;
	
	public TipoDetalleDocumentoSessionBeanAdditional getTipoDetalleDocumentoSessionBeanAdditional() {
		return this.tipodetalledocumentoSessionBeanAdditional;
	}
	
	public void setTipoDetalleDocumentoSessionBeanAdditional(TipoDetalleDocumentoSessionBeanAdditional tipodetalledocumentoSessionBeanAdditional) {
		try {
			this.tipodetalledocumentoSessionBeanAdditional=tipodetalledocumentoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDetalleDocumentoBeanSwingJInternalFrameAdditional tipodetalledocumentoBeanSwingJInternalFrameAdditional=null;
	//public class TipoDetalleDocumentoBeanSwingJInternalFrame
	
	public TipoDetalleDocumentoBeanSwingJInternalFrameAdditional getTipoDetalleDocumentoBeanSwingJInternalFrameAdditional() {
		return this.tipodetalledocumentoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDetalleDocumentoBeanSwingJInternalFrameAdditional(TipoDetalleDocumentoBeanSwingJInternalFrameAdditional tipodetalledocumentoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodetalledocumentoBeanSwingJInternalFrameAdditional=tipodetalledocumentoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDetalleDocumentoLogic tipodetalledocumentoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDetalleDocumento tipodetalledocumentoBean;
	public TipoDetalleDocumentoConstantesFunciones tipodetalledocumentoConstantesFunciones;
	//public TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDetalleDocumento> tipodetalledocumentos;	
	//public List<TipoDetalleDocumento> tipodetalledocumentosEliminados;
	//public List<TipoDetalleDocumento> tipodetalledocumentosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDetalleDocumento=true;
	public Boolean isVisibilidadCeldaCopiarTipoDetalleDocumento=true;
	public Boolean isVisibilidadCeldaVerFormTipoDetalleDocumento=true;
	public Boolean isVisibilidadCeldaOrdenTipoDetalleDocumento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaModificarTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaCancelarTipoDetalleDocumento=false;
	public Boolean isVisibilidadCeldaGuardarTipoDetalleDocumento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDetalleDocumento() {
		return this.iIdNuevoTipoDetalleDocumento;
	}

	public void setiIdNuevoTipoDetalleDocumento(Long iIdNuevoTipoDetalleDocumento) {
		this.iIdNuevoTipoDetalleDocumento = iIdNuevoTipoDetalleDocumento;
	}
	
	public Long getidTipoDetalleDocumentoActual() {
		return this.idTipoDetalleDocumentoActual;
	}

	public void setidTipoDetalleDocumentoActual(Long idTipoDetalleDocumentoActual) {
		this.idTipoDetalleDocumentoActual = idTipoDetalleDocumentoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDetalleDocumento gettipodetalledocumento() {
		return this.tipodetalledocumento;
	}

	public void settipodetalledocumento(TipoDetalleDocumento tipodetalledocumento) {
		this.tipodetalledocumento = tipodetalledocumento;
	}
	
	public TipoDetalleDocumento gettipodetalledocumentoAux() {
		return this.tipodetalledocumentoAux;
	}

	public void settipodetalledocumentoAux(TipoDetalleDocumento tipodetalledocumentoAux) {
		this.tipodetalledocumentoAux = tipodetalledocumentoAux;
	}				
	
	public TipoDetalleDocumento gettipodetalledocumentoAnterior() {
		return this.tipodetalledocumentoAnterior;
	}

	public void settipodetalledocumentoAnterior(TipoDetalleDocumento tipodetalledocumentoAnterior) {
		this.tipodetalledocumentoAnterior = tipodetalledocumentoAnterior;
	}	
	
	public TipoDetalleDocumento gettipodetalledocumentoTotales() {
		return this.tipodetalledocumentoTotales;
	}

	public void settipodetalledocumentoTotales(TipoDetalleDocumento tipodetalledocumentoTotales) {
		this.tipodetalledocumentoTotales = tipodetalledocumentoTotales;
	}	
	
	public TipoDetalleDocumento gettipodetalledocumentoBean() {
		return this.tipodetalledocumentoBean;
	}

	public void settipodetalledocumentoBean(TipoDetalleDocumento tipodetalledocumentoBean) {
		this.tipodetalledocumentoBean = tipodetalledocumentoBean;
	}	
	
	public TipoDetalleDocumentoParameterReturnGeneral gettipodetalledocumentoReturnGeneral() {
		return this.tipodetalledocumentoReturnGeneral;
	}

	public void settipodetalledocumentoReturnGeneral(TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoReturnGeneral) {
		this.tipodetalledocumentoReturnGeneral = tipodetalledocumentoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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
	
	
	public TipoDetalleDocumentoLogic getTipoDetalleDocumentoLogic()	{		
		return tipodetalledocumentoLogic;
	}

	public void setTipoDetalleDocumentoLogic(TipoDetalleDocumentoLogic tipodetalledocumentoLogic) {
		this.tipodetalledocumentoLogic = tipodetalledocumentoLogic;
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
	
	public Boolean getIsEsNuevoTipoDetalleDocumento() {
		return isEsNuevoTipoDetalleDocumento;
	}

	public void setIsEsNuevoTipoDetalleDocumento(Boolean isEsNuevoTipoDetalleDocumento) {
		this.isEsNuevoTipoDetalleDocumento = isEsNuevoTipoDetalleDocumento;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDetalleDocumento() {
		return esParaAccionDesdeFormularioTipoDetalleDocumento;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDetalleDocumento(Boolean esParaAccionDesdeFormularioTipoDetalleDocumento) {
		this.esParaAccionDesdeFormularioTipoDetalleDocumento = esParaAccionDesdeFormularioTipoDetalleDocumento;
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

			if(this.tipodetalledocumentoSessionBean==null) {
				this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
			}

			if(!this.tipodetalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodetalledocumentoSessionBean.getlidEmpresaActual());
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

					if(this.tipodetalledocumento!=null) {
						this.tipodetalledocumento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
						this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDetalleDocumento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
						if(this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDetalleDocumentoGenerico)throws Exception
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
				jComboBoxid_empresaTipoDetalleDocumentoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDetalleDocumentoGenerico!=null && jComboBoxid_empresaTipoDetalleDocumentoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDetalleDocumentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDetalleDocumento tipodetalledocumento,JComboBox jComboBoxid_empresaTipoDetalleDocumentoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDetalleDocumentoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDetalleDocumentoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodetalledocumento.setid_empresa(empresaAux.getId());
				tipodetalledocumento.setempresa_descripcion(TipoDetalleDocumentoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodetalledocumento.setEmpresa(empresaAux);			}
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

					if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { 
							this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { 
					}

					if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
							this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDetalleDocumento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDetalleDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetalleDocumento(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDetalleDocumentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetalleDocumento(this.tipodetalledocumentos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodetalledocumentoLogic.setTipoDetalleDocumentos(this.tipodetalledocumentos);
			tipodetalledocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDetalleDocumentoParameterReturnGeneral getTipoDetalleDocumentoParameterGeneral() {
		return this.tipodetalledocumentoParameterGeneral;
	}
	
	public void setTipoDetalleDocumentoParameterGeneral(TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoParameterGeneral) {
		this.tipodetalledocumentoParameterGeneral = tipodetalledocumentoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDetalleDocumento() {
		return isPermisoTodoTipoDetalleDocumento;
	}

	public void setIsPermisoTodoTipoDetalleDocumento(Boolean isPermisoTodoTipoDetalleDocumento) {
		this.isPermisoTodoTipoDetalleDocumento = isPermisoTodoTipoDetalleDocumento;
	}

	public Boolean getIsPermisoNuevoTipoDetalleDocumento() {
		return isPermisoNuevoTipoDetalleDocumento;
	}

	public void setIsPermisoNuevoTipoDetalleDocumento(Boolean isPermisoNuevoTipoDetalleDocumento) {
		this.isPermisoNuevoTipoDetalleDocumento = isPermisoNuevoTipoDetalleDocumento;
	}

	public Boolean getIsPermisoActualizarTipoDetalleDocumento() {
		return isPermisoActualizarTipoDetalleDocumento;
	}

	public void setIsPermisoActualizarTipoDetalleDocumento(Boolean isPermisoActualizarTipoDetalleDocumento) {
		this.isPermisoActualizarTipoDetalleDocumento = isPermisoActualizarTipoDetalleDocumento;
	}

	public Boolean getIsPermisoEliminarTipoDetalleDocumento() {
		return isPermisoEliminarTipoDetalleDocumento;
	}

	public void setIsPermisoEliminarTipoDetalleDocumento(Boolean isPermisoEliminarTipoDetalleDocumento) {
		this.isPermisoEliminarTipoDetalleDocumento = isPermisoEliminarTipoDetalleDocumento;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDetalleDocumento() {
		return isPermisoGuardarCambiosTipoDetalleDocumento;
	}

	public void setIsPermisoGuardarCambiosTipoDetalleDocumento(Boolean isPermisoGuardarCambiosTipoDetalleDocumento) {
		this.isPermisoGuardarCambiosTipoDetalleDocumento = isPermisoGuardarCambiosTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoConsultaTipoDetalleDocumento() {
		return isPermisoConsultaTipoDetalleDocumento;
	}

	public void setIsPermisoConsultaTipoDetalleDocumento(Boolean isPermisoConsultaTipoDetalleDocumento) {
		this.isPermisoConsultaTipoDetalleDocumento = isPermisoConsultaTipoDetalleDocumento;
	}

	public Boolean getIsPermisoBusquedaTipoDetalleDocumento() {
		return isPermisoBusquedaTipoDetalleDocumento;
	}

	public void setIsPermisoBusquedaTipoDetalleDocumento(Boolean isPermisoBusquedaTipoDetalleDocumento) {
		this.isPermisoBusquedaTipoDetalleDocumento = isPermisoBusquedaTipoDetalleDocumento;
	}

	public Boolean getIsPermisoReporteTipoDetalleDocumento() {
		return isPermisoReporteTipoDetalleDocumento;
	}

	public void setIsPermisoReporteTipoDetalleDocumento(Boolean isPermisoReporteTipoDetalleDocumento) {
		this.isPermisoReporteTipoDetalleDocumento = isPermisoReporteTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDetalleDocumento() {
		return isPermisoPaginacionMedioTipoDetalleDocumento;
	}

	public void setIsPermisoPaginacionMedioTipoDetalleDocumento(Boolean isPermisoPaginacionMedioTipoDetalleDocumento) {
		this.isPermisoPaginacionMedioTipoDetalleDocumento = isPermisoPaginacionMedioTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDetalleDocumento() {
		return isPermisoPaginacionTodoTipoDetalleDocumento;
	}

	public void setIsPermisoPaginacionTodoTipoDetalleDocumento(Boolean isPermisoPaginacionTodoTipoDetalleDocumento) {
		this.isPermisoPaginacionTodoTipoDetalleDocumento = isPermisoPaginacionTodoTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDetalleDocumento() {
		return isPermisoPaginacionAltoTipoDetalleDocumento;
	}

	public void setIsPermisoPaginacionAltoTipoDetalleDocumento(Boolean isPermisoPaginacionAltoTipoDetalleDocumento) {
		this.isPermisoPaginacionAltoTipoDetalleDocumento = isPermisoPaginacionAltoTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoCopiarTipoDetalleDocumento() {
		return isPermisoCopiarTipoDetalleDocumento;
	}

	public void setIsPermisoCopiarTipoDetalleDocumento(Boolean isPermisoCopiarTipoDetalleDocumento) {
		this.isPermisoCopiarTipoDetalleDocumento = isPermisoCopiarTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoVerFormTipoDetalleDocumento() {
		return isPermisoVerFormTipoDetalleDocumento;
	}

	public void setIsPermisoVerFormTipoDetalleDocumento(Boolean isPermisoVerFormTipoDetalleDocumento) {
		this.isPermisoVerFormTipoDetalleDocumento = isPermisoVerFormTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoDuplicarTipoDetalleDocumento() {
		return isPermisoDuplicarTipoDetalleDocumento;
	}

	public void setIsPermisoDuplicarTipoDetalleDocumento(Boolean isPermisoDuplicarTipoDetalleDocumento) {
		this.isPermisoDuplicarTipoDetalleDocumento = isPermisoDuplicarTipoDetalleDocumento;
	}
	
	public Boolean getIsPermisoOrdenTipoDetalleDocumento() {
		return isPermisoOrdenTipoDetalleDocumento;
	}

	public void setIsPermisoOrdenTipoDetalleDocumento(Boolean isPermisoOrdenTipoDetalleDocumento) {
		this.isPermisoOrdenTipoDetalleDocumento = isPermisoOrdenTipoDetalleDocumento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDetalleDocumento() {
		return isVisibilidadCeldaNuevoTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaNuevoTipoDetalleDocumento(Boolean isVisibilidadCeldaNuevoTipoDetalleDocumento) {
		this.isVisibilidadCeldaNuevoTipoDetalleDocumento = isVisibilidadCeldaNuevoTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDetalleDocumento() {
		return isVisibilidadCeldaDuplicarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDetalleDocumento(Boolean isVisibilidadCeldaDuplicarTipoDetalleDocumento) {
		this.isVisibilidadCeldaDuplicarTipoDetalleDocumento = isVisibilidadCeldaDuplicarTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDetalleDocumento() {
		return isVisibilidadCeldaCopiarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaCopiarTipoDetalleDocumento(Boolean isVisibilidadCeldaCopiarTipoDetalleDocumento) {
		this.isVisibilidadCeldaCopiarTipoDetalleDocumento = isVisibilidadCeldaCopiarTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDetalleDocumento() {
		return isVisibilidadCeldaVerFormTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaVerFormTipoDetalleDocumento(Boolean isVisibilidadCeldaVerFormTipoDetalleDocumento) {
		this.isVisibilidadCeldaVerFormTipoDetalleDocumento = isVisibilidadCeldaVerFormTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDetalleDocumento() {
		return isVisibilidadCeldaOrdenTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaOrdenTipoDetalleDocumento(Boolean isVisibilidadCeldaOrdenTipoDetalleDocumento) {
		this.isVisibilidadCeldaOrdenTipoDetalleDocumento = isVisibilidadCeldaOrdenTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento() {
		return isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento(Boolean isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento = isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDetalleDocumento() {
		return isVisibilidadCeldaModificarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaModificarTipoDetalleDocumento(Boolean isVisibilidadCeldaModificarTipoDetalleDocumento) {
		this.isVisibilidadCeldaModificarTipoDetalleDocumento = isVisibilidadCeldaModificarTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDetalleDocumento() {
		return isVisibilidadCeldaActualizarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaActualizarTipoDetalleDocumento(Boolean isVisibilidadCeldaActualizarTipoDetalleDocumento) {
		this.isVisibilidadCeldaActualizarTipoDetalleDocumento = isVisibilidadCeldaActualizarTipoDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDetalleDocumento() {
		return isVisibilidadCeldaEliminarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaEliminarTipoDetalleDocumento(Boolean isVisibilidadCeldaEliminarTipoDetalleDocumento) {
		this.isVisibilidadCeldaEliminarTipoDetalleDocumento = isVisibilidadCeldaEliminarTipoDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDetalleDocumento() {
		return isVisibilidadCeldaCancelarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaCancelarTipoDetalleDocumento(Boolean isVisibilidadCeldaCancelarTipoDetalleDocumento) {
		this.isVisibilidadCeldaCancelarTipoDetalleDocumento = isVisibilidadCeldaCancelarTipoDetalleDocumento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDetalleDocumento() {
		return isVisibilidadCeldaGuardarTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaGuardarTipoDetalleDocumento(Boolean isVisibilidadCeldaGuardarTipoDetalleDocumento) {
		this.isVisibilidadCeldaGuardarTipoDetalleDocumento = isVisibilidadCeldaGuardarTipoDetalleDocumento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDetalleDocumento() {
		return isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDetalleDocumento(Boolean isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento) {
		this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento = isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento;
	}
		
	public TipoDetalleDocumentoSessionBean gettipodetalledocumentoSessionBean() {
		return this.tipodetalledocumentoSessionBean;
	}
	
	public void settipodetalledocumentoSessionBean(TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean) {
		this.tipodetalledocumentoSessionBean=tipodetalledocumentoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodetalledocumento,null);
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
	
	public void bugActualizarReferenciaActual(TipoDetalleDocumento tipodetalledocumento,TipoDetalleDocumento tipodetalledocumentoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDetalleDocumento(tipodetalledocumento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodetalledocumentoAux.setId(tipodetalledocumento.getId());
		tipodetalledocumentoAux.setVersionRow(tipodetalledocumento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDetalleDocumento();
		
			int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodetalledocumentoValidator.getInvalidValues(this.tipodetalledocumento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodetalledocumentoLogic.setDatosCliente(datosCliente);
			tipodetalledocumentoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodetalledocumentoAux=new  TipoDetalleDocumento();
				
				tipodetalledocumentoAux.setIsNew(true);
				tipodetalledocumentoAux.setIsChanged(true);
				
				tipodetalledocumentoAux.setTipoDetalleDocumentoOriginal(this.tipodetalledocumento);
				
				tipodetalledocumentoAux.setId(this.tipodetalledocumento.getId());	
				tipodetalledocumentoAux.setVersionRow(this.tipodetalledocumento.getVersionRow());	
				tipodetalledocumentoAux.setid_empresa(this.tipodetalledocumento.getid_empresa());	
				tipodetalledocumentoAux.setcodigo(this.tipodetalledocumento.getcodigo());	
				tipodetalledocumentoAux.setnombre(this.tipodetalledocumento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.saveTipoDetalleDocumentos();//WithConnection
						//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetalleDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos().addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos.addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetalledocumentoLogic.saveTipoDetalleDocumentoRelaciones(tipodetalledocumentoAux,this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());//WithConnection
								//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos= new ArrayList<DetalleDocumento>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodetalledocumentoAux.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodetalledocumentoAux=new  TipoDetalleDocumento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() && this.tipodetalledocumento.getId()>=0)) {
						
					tipodetalledocumentoAux.setIsNew(false);
				}
				
				tipodetalledocumentoAux.setIsDeleted(false);
			
				tipodetalledocumentoAux.setId(this.tipodetalledocumento.getId());	
				tipodetalledocumentoAux.setVersionRow(this.tipodetalledocumento.getVersionRow());	
				tipodetalledocumentoAux.setid_empresa(this.tipodetalledocumento.getid_empresa());	
				tipodetalledocumentoAux.setcodigo(this.tipodetalledocumento.getcodigo());	
				tipodetalledocumentoAux.setnombre(this.tipodetalledocumento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.saveTipoDetalleDocumentos();//WithConnection
						//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetalleDocumento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos().addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos.addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetalledocumentoLogic.saveTipoDetalleDocumentoRelaciones(tipodetalledocumentoAux,this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());//WithConnection
								//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos= new ArrayList<DetalleDocumento>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodetalledocumentoAux.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetalledocumento,tipodetalledocumentoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodetalledocumentoAux=new  TipoDetalleDocumento();
				
				tipodetalledocumentoAux.setIsNew(false);
				tipodetalledocumentoAux.setIsChanged(false);
				
				tipodetalledocumentoAux.setIsDeleted(true);
				
				tipodetalledocumentoAux.setId(this.tipodetalledocumento.getId());	
				tipodetalledocumentoAux.setVersionRow(this.tipodetalledocumento.getVersionRow());	
				tipodetalledocumentoAux.setid_empresa(this.tipodetalledocumento.getid_empresa());	
				tipodetalledocumentoAux.setcodigo(this.tipodetalledocumento.getcodigo());	
				tipodetalledocumentoAux.setnombre(this.tipodetalledocumento.getnombre());	
				
				if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodetalledocumentoAux.getId()>=0) {	
						this.tipodetalledocumentosEliminados.add(tipodetalledocumentoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.saveTipoDetalleDocumentos();//WithConnection
						//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos().addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos.addAll(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetalledocumentoLogic.saveTipoDetalleDocumentoRelaciones(tipodetalledocumentoAux,this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());//WithConnection
								//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.setDetalleDocumentos(new ArrayList<DetalleDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos= new ArrayList<DetalleDocumento>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodetalledocumentoAux.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodetalledocumentoAux,tipodetalledocumentoLogic.getTipoDetalleDocumentos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodetalledocumentoAux,tipodetalledocumentos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().addAll(this.tipodetalledocumentosEliminados);
					
					tipodetalledocumentoLogic.saveTipoDetalleDocumentos();//WithConnection
					//tipodetalledocumentoLogic.getSetVersionRowTipoDetalleDocumentos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDetalleDocumento();
				
				this.tipodetalledocumentosEliminados= new ArrayList<TipoDetalleDocumento>();		
			}
			
			if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Detalle Documento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodetalledocumento=tipodetalledocumentoAux;
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
      		//this.finishProcessTipoDetalleDocumento();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDetalleDocumento tipodetalledocumentoLocal) throws Exception {
		
		if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodetalledocumentoLocal.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());
			
			} else {
			
				tipodetalledocumentoLocal.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDetalleDocumento tipodetalledocumentoLocal) throws Exception {	
		if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodetalledocumentoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDetalleDocumentoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodetalledocumentoValidator.getInvalidValues(this.tipodetalledocumento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDetalleDocumento tipodetalledocumento,List<TipoDetalleDocumento> tipodetalledocumentos) throws Exception {
		try	{		
			TipoDetalleDocumentoConstantesFunciones.actualizarLista(tipodetalledocumento,tipodetalledocumentos,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDetalleDocumento tipodetalledocumento,List<TipoDetalleDocumento> tipodetalledocumentos) throws Exception {
		try	{			
			TipoDetalleDocumentoConstantesFunciones.actualizarSelectedLista(tipodetalledocumento,tipodetalledocumentos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDetalleDocumento> tipodetalledocumentosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodetalledocumentosLocal=this.tipodetalledocumentoLogic.getTipoDetalleDocumentos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodetalledocumentosLocal=this.tipodetalledocumentos;
			}
			//ARCHITECTURE
		
			for(TipoDetalleDocumento tipodetalledocumentoLocal:tipodetalledocumentosLocal) {
				if(this.permiteMantenimiento(tipodetalledocumentoLocal) && tipodetalledocumentoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDetalleDocumentoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelid_empresaTipoDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetalleDocumentoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelcodigoTipoDetalleDocumento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetalleDocumentoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelnombreTipoDetalleDocumento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelid_empresaTipoDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelcodigoTipoDetalleDocumento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelnombreTipoDetalleDocumento,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleDocumento")) {
			if(this.tipodetalledocumento==null) {
				this.tipodetalledocumento= new TipoDetalleDocumento();
			}

			if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDetalleDocumento
				this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);

				this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.getdetalledocumento().setTipoDetalleDocumento(this.tipodetalledocumento);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDetalleDocumento--;	
		
		
		this.tipodetalledocumentoAux=new TipoDetalleDocumento();
		
		this.tipodetalledocumentoAux.setId(this.iIdNuevoTipoDetalleDocumento);
		this.tipodetalledocumentoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().add(this.tipodetalledocumentoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodetalledocumentos.add(this.tipodetalledocumentoAux);
		}
		//ARCHITECTURE
		
		this.tipodetalledocumento=this.tipodetalledocumentoAux;
		
		if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumento);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleDocumento(this.tipodetalledocumento);
		}
				
		//this.setDefaultControlesTipoDetalleDocumento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDetalleDocumento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDetalleDocumento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleDocumento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetalleDocumento(this.tipodetalledocumentoBean,this.tipodetalledocumento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
			classes=TipoDetalleDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.procesarEventosTipoDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this.tipodetalledocumento,this.tipodetalledocumentoParameterGeneral,this.isEsNuevoTipoDetalleDocumento,classes);//this.tipodetalledocumentoLogic.getTipoDetalleDocumento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral,this.tipodetalledocumentoBean,false);
		
		if(this.tipodetalledocumentoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento());
		}
		
		if(this.tipodetalledocumentoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento(),classes);//this.tipodetalledocumentoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDetalleDocumento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDetalleDocumento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.RecargarFormTipoDetalleDocumento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
						
			if(tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.getEsGuardarRelacionado() && DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleDocumentoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleDocumento();
			}
			
			this.actualizarVisualTableDatosTipoDetalleDocumento();
			
			this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleDocumento(), this.getIndiceNuevoTipoDetalleDocumento());
			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
						
			this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDetalleDocumento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setEnabled(isHabilitar && this.tipodetalledocumentoConstantesFunciones.activarcodigoTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setEnabled(isHabilitar && this.tipodetalledocumentoConstantesFunciones.activarnombreTipoDetalleDocumento);	
		//
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setEnabled(isHabilitar && this.tipodetalledocumentoConstantesFunciones.activarid_empresaTipoDetalleDocumento);
	};
	
	public void setDefaultControlesTipoDetalleDocumento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDetalleDocumento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(true);			
			this.tipodetalledocumentoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(false);			
			this.tipodetalledocumentoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDetalleDocumento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				if(tipodetalledocumentoAux.getId().equals(this.iIdNuevoTipoDetalleDocumento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentos) {
				if(tipodetalledocumentoAux.getId().equals(this.iIdNuevoTipoDetalleDocumento)) {
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
	
	public int getIndiceActualTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				if(tipodetalledocumentoAux.getId().equals(tipodetalledocumento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentos) {
				if(tipodetalledocumentoAux.getId().equals(tipodetalledocumento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumentoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				if(tipodetalledocumentoAux.getTipoDetalleDocumentoOriginal().getId().equals(tipodetalledocumentoOriginal.getId())) {
					existe=true;
					tipodetalledocumentoOriginal.setId(tipodetalledocumentoAux.getId());
					tipodetalledocumentoOriginal.setVersionRow(tipodetalledocumentoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentos) {
				if(tipodetalledocumentoAux.getTipoDetalleDocumentoOriginal().getId().equals(tipodetalledocumentoOriginal.getId())) {
					existe=true;
					tipodetalledocumentoOriginal.setId(tipodetalledocumentoAux.getId());
					tipodetalledocumentoOriginal.setVersionRow(tipodetalledocumentoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDetalleDocumento(Boolean esParaCancelar) throws Exception {
		tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
		tipodetalledocumentoAux=new TipoDetalleDocumento();
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
					if(tipodetalledocumentoAux.getId()<0) {
						tipodetalledocumentosAux.add(tipodetalledocumentoAux);
					}		
				}
				this.iIdNuevoTipoDetalleDocumento=0L;
				this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().removeAll(tipodetalledocumentosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentos) {
					if(tipodetalledocumentoAux.getId()<0) {
						tipodetalledocumentosAux.add(tipodetalledocumentoAux);
					}		
				}
				this.iIdNuevoTipoDetalleDocumento=0L;
				this.tipodetalledocumentos.removeAll(tipodetalledocumentosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDetalleDocumento 
					&& this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()>0
					) {
					tipodetalledocumentoAux=this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().get(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().size() - 1);
				
					if(tipodetalledocumentoAux.getId()<0) {
						this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().remove(tipodetalledocumentoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDetalleDocumento && this.tipodetalledocumentos.size()>0) {
					tipodetalledocumentoAux=this.tipodetalledocumentos.get(this.tipodetalledocumentos.size() - 1);
				
					if(tipodetalledocumentoAux.getId()<0) {
						this.tipodetalledocumentos.remove(tipodetalledocumentoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDetalleDocumento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodetalledocumento.getId()<0) {
				this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().remove(this.tipodetalledocumento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodetalledocumento.getId()<0) {
				this.tipodetalledocumentos.remove(this.tipodetalledocumento);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDetalleDocumento(List<TipoDetalleDocumento> tipodetalledocumentosAux) throws Exception {
		TipoDetalleDocumentoConstantesFunciones.setEstadosInicialesTipoDetalleDocumento(tipodetalledocumentosAux);
	}
	
	public void setEstadosInicialesTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumentoAux) throws Exception {
		TipoDetalleDocumentoConstantesFunciones.setEstadosInicialesTipoDetalleDocumento(tipodetalledocumentoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDetalleDocumentoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDetalleDocumentoActual()) {
				if(!this.isEsNuevoTipoDetalleDocumento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDetalleDocumento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDetalleDocumentoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Detalle Documento ?", "MANTENIMIENTO DE Tipo Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDetalleDocumento tipodetalledocumento) throws Exception {
		TipoDetalleDocumentoConstantesFunciones.seleccionarAsignar(this.tipodetalledocumento,tipodetalledocumento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDetalleDocumento=this.isPermisoActualizarOriginalTipoDetalleDocumento;
			
			
			this.seleccionarAsignar(tipodetalledocumento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetalleDocumentoConstantesFunciones.quitarEspaciosTipoDetalleDocumento(this.tipodetalledocumento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodetalledocumentoSessionBean.setsFuncionBusquedaRapida(this.tipodetalledocumentoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDetalleDocumento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDetalleDocumento(esParaCancelar);				
				this.cancelarNuevoTipoDetalleDocumento(esParaCancelar);								
			}
			
			this.tipodetalledocumento=new TipoDetalleDocumento();
			
			this.inicializarTipoDetalleDocumento();
			
			this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDetalleDocumento() throws Exception {
		try {
			TipoDetalleDocumentoConstantesFunciones.inicializarTipoDetalleDocumento(this.tipodetalledocumento);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDetalleDocumentos(String sAccionBusqueda,List<TipoDetalleDocumento> tipodetalledocumentosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDetalleDocumento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDetalleDocumentoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDetalleDocumentoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDetalleDocumento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Detalle Documentos");		
		parameters.put("busquedapor", TipoDetalleDocumentoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleDocumento.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDetalleDocumentoLogic tipodetalledocumentoLogicAuxiliar=new TipoDetalleDocumentoLogic();
					tipodetalledocumentoLogicAuxiliar.setDatosCliente(tipodetalledocumentoLogic.getDatosCliente());				
					tipodetalledocumentoLogicAuxiliar.setTipoDetalleDocumentos(tipodetalledocumentosParaReportes);
					
					tipodetalledocumentoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDetalleDocumentoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodetalledocumentosParaReportes=tipodetalledocumentoLogicAuxiliar.getTipoDetalleDocumentos();
					
					//tipodetalledocumentoLogic.getNewConnexionToDeep();
					
					//for (TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentosParaReportes) {
					//	tipodetalledocumentoLogic.deepLoad(tipodetalledocumento, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodetalledocumentoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleDocumento = AuxiliarReportes.class.getResourceAsStream("DetalleDocumentoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalledocumento", reportFileDetalleDocumento);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDetalleDocumento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDetalleDocumentoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDetalleDocumento=new JRBeanArrayDataSource(TipoDetalleDocumentoJInternalFrame.TraerTipoDetalleDocumentoBeans(tipodetalledocumentosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDetalleDocumento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDetalleDocumentoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDetalleDocumentoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDetalleDocumentoBean.TraerTipoDetalleDocumentoBeans(tipodetalledocumentosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumentoActionPerformed(null);
					//this.generarExcelReporteTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDetalleDocumentos(sAccionBusqueda,sTipoArchivoReporte,tipodetalledocumentosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleDocumento> tipodetalledocumentosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleDocumentos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetalleDocumento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDetalleDocumento tipodetalledocumento : tipodetalledocumentosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDetalleDocumentoConstantesFunciones.generarExcelReporteDataTipoDetalleDocumento("NORMAL",row,workbook,tipodetalledocumento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDetalleDocumento(String sTipo,Row row,Workbook workbook) {
		
		TipoDetalleDocumentoConstantesFunciones.generarExcelReporteHeaderTipoDetalleDocumento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleDocumento> tipodetalledocumentosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDetalleDocumento tipodetalledocumento : tipodetalledocumentosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoDescripcion(tipodetalledocumento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetalledocumento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetalledocumento.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetalledocumento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDetalleDocumentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetalleDocumento> tipodetalledocumentosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDetalleDocumento> tipodetalledocumentosRespaldo=null;
		
		classes=TipoDetalleDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodetalledocumentoLogic.setDatosCliente(this.datosCliente);
		this.tipodetalledocumentoLogic.setDatosDeep(this.datosDeep);
		this.tipodetalledocumentoLogic.setIsConDeep(true);
		
		tipodetalledocumentosRespaldo=this.tipodetalledocumentoLogic.getTipoDetalleDocumentos();
		
		this.tipodetalledocumentoLogic.setTipoDetalleDocumentos(tipodetalledocumentosParaReportes);	
		this.tipodetalledocumentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodetalledocumentosParaReportes=this.tipodetalledocumentoLogic.getTipoDetalleDocumentos();
		this.tipodetalledocumentoLogic.setTipoDetalleDocumentos(tipodetalledocumentosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetalleDocumentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetalleDocumento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDetalleDocumento tipodetalledocumento : tipodetalledocumentosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDetalleDocumento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDetalleDocumentoConstantesFunciones.generarExcelReporteDataTipoDetalleDocumento("NORMAL",row,workbook,tipodetalledocumento,cellStyleDataAux);
		
			
			


				//DetalleDocumento
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodetalledocumento.getDetalleDocumentos()!=null && tipodetalledocumento.getDetalleDocumentos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleDocumentoConstantesFunciones.generarExcelReporteHeaderDetalleDocumento("RELACIONADO",row,workbook);
				}

				if(tipodetalledocumento.getDetalleDocumentos()!=null) {
					i2=0;
					for(DetalleDocumento detalledocumento : tipodetalledocumento.getDetalleDocumentos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleDocumentoConstantesFunciones.generarExcelReporteDataDetalleDocumento("RELACIONADO",row,workbook,detalledocumento,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.getTipoDetalleDocumentoDescripcion(tipodetalledocumento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDetalleDocumento() throws Exception {		
		this.startProcessTipoDetalleDocumento(true);
	}
	
	public void startProcessTipoDetalleDocumento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDetalleDocumento ,this.jPanelParametrosReportesTipoDetalleDocumento, this.jScrollPanelDatosTipoDetalleDocumento,this.jPanelPaginacionTipoDetalleDocumento, this.jScrollPanelDatosEdicionTipoDetalleDocumento, this.jPanelAccionesTipoDetalleDocumento,this.jPanelAccionesFormularioTipoDetalleDocumento,this.jmenuBarTipoDetalleDocumento,this.jmenuBarDetalleTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetalleDocumento=this.jTabbedPaneBusquedasTipoDetalleDocumento; 
		
		final JPanel jPanelParametrosReportesTipoDetalleDocumento=this.jPanelParametrosReportesTipoDetalleDocumento;
		//final JScrollPane jScrollPanelDatosTipoDetalleDocumento=this.jScrollPanelDatosTipoDetalleDocumento;
		final JTable jTableDatosTipoDetalleDocumento=this.jTableDatosTipoDetalleDocumento;		
		final JPanel jPanelPaginacionTipoDetalleDocumento=this.jPanelPaginacionTipoDetalleDocumento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetalleDocumento=this.jScrollPanelDatosEdicionTipoDetalleDocumento;
		final JPanel jPanelAccionesTipoDetalleDocumento=this.jPanelAccionesTipoDetalleDocumento;
		
		JPanel jPanelCamposAuxiliarTipoDetalleDocumento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetalleDocumento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			jPanelCamposAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelCamposTipoDetalleDocumento;
			jPanelAccionesFormularioAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelAccionesFormularioTipoDetalleDocumento;
		}
		
		final JPanel jPanelCamposTipoDetalleDocumento=jPanelCamposAuxiliarTipoDetalleDocumento;
		final JPanel jPanelAccionesFormularioTipoDetalleDocumento=jPanelAccionesFormularioAuxiliarTipoDetalleDocumento;
		
		
		final JMenuBar jmenuBarTipoDetalleDocumento=this.jmenuBarTipoDetalleDocumento;
		final JToolBar jTtoolBarTipoDetalleDocumento=this.jTtoolBarTipoDetalleDocumento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDetalleDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetalleDocumento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			jmenuBarDetalleAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jmenuBarDetalleTipoDetalleDocumento;
			jTtoolBarDetalleAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jTtoolBarDetalleTipoDetalleDocumento;
		}
		
		final JMenuBar jmenuBarDetalleTipoDetalleDocumento=jmenuBarDetalleAuxiliarTipoDetalleDocumento;
		final JToolBar jTtoolBarDetalleTipoDetalleDocumento=jTtoolBarDetalleAuxiliarTipoDetalleDocumento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetalleDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetalleDocumento;
			processRunnable.jTableDatos=jTableDatosTipoDetalleDocumento;
			processRunnable.jPanelCampos=jPanelCamposTipoDetalleDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetalleDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetalleDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetalleDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetalleDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetalleDocumento;
			processRunnable.jTtoolBar=jTtoolBarTipoDetalleDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetalleDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetalleDocumento ,jPanelParametrosReportesTipoDetalleDocumento,jTableDatosTipoDetalleDocumento, /*jScrollPanelDatosTipoDetalleDocumento,*/jPanelCamposTipoDetalleDocumento,jPanelPaginacionTipoDetalleDocumento, /*jScrollPanelDatosEdicionTipoDetalleDocumento,*/ jPanelAccionesTipoDetalleDocumento,jPanelAccionesFormularioTipoDetalleDocumento,jmenuBarTipoDetalleDocumento,jmenuBarDetalleTipoDetalleDocumento,jTtoolBarTipoDetalleDocumento,jTtoolBarDetalleTipoDetalleDocumento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetalleDocumento ,jPanelParametrosReportesTipoDetalleDocumento, jScrollPanelDatosTipoDetalleDocumento,jPanelPaginacionTipoDetalleDocumento, jScrollPanelDatosEdicionTipoDetalleDocumento, jPanelAccionesTipoDetalleDocumento,jPanelAccionesFormularioTipoDetalleDocumento,jmenuBarTipoDetalleDocumento,jmenuBarDetalleTipoDetalleDocumento,jTtoolBarTipoDetalleDocumento,jTtoolBarDetalleTipoDetalleDocumento);
						
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
	
	public void finishProcessTipoDetalleDocumento() {// throws Exception 
		this.finishProcessTipoDetalleDocumento(true);
	}
	
	public void finishProcessTipoDetalleDocumento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDetalleDocumento ,this.jPanelParametrosReportesTipoDetalleDocumento, this.jScrollPanelDatosTipoDetalleDocumento,this.jPanelPaginacionTipoDetalleDocumento, this.jScrollPanelDatosEdicionTipoDetalleDocumento, this.jPanelAccionesTipoDetalleDocumento,this.jPanelAccionesFormularioTipoDetalleDocumento,this.jmenuBarTipoDetalleDocumento,this.jmenuBarDetalleTipoDetalleDocumento,this.jTtoolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetalleDocumento=this.jTabbedPaneBusquedasTipoDetalleDocumento; 
		
		final JPanel jPanelParametrosReportesTipoDetalleDocumento=this.jPanelParametrosReportesTipoDetalleDocumento;
		//final JScrollPane jScrollPanelDatosTipoDetalleDocumento=this.jScrollPanelDatosTipoDetalleDocumento;
		final JTable jTableDatosTipoDetalleDocumento=this.jTableDatosTipoDetalleDocumento;		
		final JPanel jPanelPaginacionTipoDetalleDocumento=this.jPanelPaginacionTipoDetalleDocumento;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetalleDocumento=this.jScrollPanelDatosEdicionTipoDetalleDocumento;
		final JPanel jPanelAccionesTipoDetalleDocumento=this.jPanelAccionesTipoDetalleDocumento;
		
		JPanel jPanelCamposAuxiliarTipoDetalleDocumento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetalleDocumento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			jPanelCamposAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelCamposTipoDetalleDocumento;
			jPanelAccionesFormularioAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelAccionesFormularioTipoDetalleDocumento;
		}
		
		final JPanel jPanelCamposTipoDetalleDocumento=jPanelCamposAuxiliarTipoDetalleDocumento;
		final JPanel jPanelAccionesFormularioTipoDetalleDocumento=jPanelAccionesFormularioAuxiliarTipoDetalleDocumento;
		
		
		final JMenuBar jmenuBarTipoDetalleDocumento=this.jmenuBarTipoDetalleDocumento;		
		final JToolBar jTtoolBarTipoDetalleDocumento=this.jTtoolBarTipoDetalleDocumento;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDetalleDocumento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetalleDocumento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			jmenuBarDetalleAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jmenuBarDetalleTipoDetalleDocumento;
			jTtoolBarDetalleAuxiliarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jTtoolBarDetalleTipoDetalleDocumento;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDetalleDocumento=jmenuBarDetalleAuxiliarTipoDetalleDocumento;
		final JToolBar jTtoolBarDetalleTipoDetalleDocumento=jTtoolBarDetalleAuxiliarTipoDetalleDocumento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetalleDocumento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetalleDocumento;
			processRunnable.jTableDatos=jTableDatosTipoDetalleDocumento;
			processRunnable.jPanelCampos=jPanelCamposTipoDetalleDocumento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetalleDocumento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetalleDocumento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetalleDocumento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetalleDocumento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetalleDocumento;
			processRunnable.jTtoolBar=jTtoolBarTipoDetalleDocumento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetalleDocumento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDetalleDocumento ,jPanelParametrosReportesTipoDetalleDocumento, jTableDatosTipoDetalleDocumento,/*jScrollPanelDatosTipoDetalleDocumento,*/jPanelCamposTipoDetalleDocumento,jPanelPaginacionTipoDetalleDocumento, /*jScrollPanelDatosEdicionTipoDetalleDocumento,*/ jPanelAccionesTipoDetalleDocumento,jPanelAccionesFormularioTipoDetalleDocumento,jmenuBarTipoDetalleDocumento,jmenuBarDetalleTipoDetalleDocumento,jTtoolBarTipoDetalleDocumento,jTtoolBarDetalleTipoDetalleDocumento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDetalleDocumento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDetalleDocumento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDetalleDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDetalleDocumento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDetalleDocumento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDetalleDocumento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDetalleDocumento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodetalledocumentoConstantesFunciones.getsFinalQueryTipoDetalleDocumento();
		String  finalQueryPaginacionTodos=this.tipodetalledocumentoConstantesFunciones.getsFinalQueryTipoDetalleDocumento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesNoTipoDetalleDocumento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDetalleDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDetalleDocumento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDetalleDocumentoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodetalledocumentosEliminados= new ArrayList<TipoDetalleDocumento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDetalleDocumento();
		
				///*TipoDetalleDocumentoSessionBean*/this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
			
			if(this.tipodetalledocumentoSessionBean==null) {
				this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
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
					this.iNumeroPaginacion=TipoDetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDetalleDocumentoConstantesFunciones.getClassesForeignKeysOfTipoDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodetalledocumento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodetalledocumentosAux= new ArrayList<TipoDetalleDocumento>();
			
				
			tipodetalledocumentoLogic.setDatosCliente(this.datosCliente);
			tipodetalledocumentoLogic.setDatosDeep(this.datosDeep);
			tipodetalledocumentoLogic.setIsConDeep(true);
			
			
			tipodetalledocumentoLogic.getTipoDetalleDocumentoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodetalledocumentoLogic.getTodosTipoDetalleDocumentos(finalQueryGlobal,pagination);
					
					//tipodetalledocumentoLogic.getTodosTipoDetalleDocumentosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodetalledocumentoLogic.getTipoDetalleDocumentos()==null|| tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetalledocumentosAux= new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentosAux.addAll(tipodetalledocumentoLogic.getTipoDetalleDocumentos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentosAux= new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentosAux.addAll(tipodetalledocumentos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetalledocumentoLogic.getTodosTipoDetalleDocumentos(finalQueryGlobal+"",this.pagination);												
							
							//tipodetalledocumentoLogic.getTodosTipoDetalleDocumentosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentoLogic.getTipoDetalleDocumentos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetalledocumentoLogic.setTipoDetalleDocumentos(new ArrayList<TipoDetalleDocumento>());					
							tipodetalledocumentoLogic.getTipoDetalleDocumentos().addAll(tipodetalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentos.addAll(tipodetalledocumentosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDetalleDocumento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDetalleDocumento=this.idActual;
				
				} else if(this.idTipoDetalleDocumentoActual!=null && this.idTipoDetalleDocumentoActual!=0L) {
					idTipoDetalleDocumento=idTipoDetalleDocumentoActual;
				}
				
					
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndicePorId(idTipoDetalleDocumento);
				
				this.tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodetalledocumentoLogic.getEntity(idTipoDetalleDocumento);
					
					//tipodetalledocumentoLogic.getEntityWithConnection(idTipoDetalleDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLogic.setTipoDetalleDocumentos(new ArrayList<TipoDetalleDocumento>());
					tipodetalledocumentoLogic.getTipoDetalleDocumentos().add(tipodetalledocumentoLogic.getTipoDetalleDocumento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
					this.tipodetalledocumentos.add(tipodetalledocumento);
				}
				
				if(tipodetalledocumentoLogic.getTipoDetalleDocumento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetalledocumentoLogic.getTipoDetalleDocumentos()==null||tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetalledocumentos==null|| tipodetalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
						tipodetalledocumentosAux.addAll(tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentosAux.addAll(tipodetalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetalleDocumentos("BusquedaPorCodigo",tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetalleDocumentos("BusquedaPorCodigo",tipodetalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.setTipoDetalleDocumentos(new ArrayList<TipoDetalleDocumento>());
						tipodetalledocumentoLogic.getTipoDetalleDocumentos().addAll(tipodetalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentos.addAll(tipodetalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetalledocumentoLogic.getTipoDetalleDocumentos()==null||tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetalledocumentos==null|| tipodetalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
						tipodetalledocumentosAux.addAll(tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentosAux.addAll(tipodetalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetalleDocumentos("BusquedaPorNombre",tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetalleDocumentos("BusquedaPorNombre",tipodetalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.setTipoDetalleDocumentos(new ArrayList<TipoDetalleDocumento>());
						tipodetalledocumentoLogic.getTipoDetalleDocumentos().addAll(tipodetalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentos.addAll(tipodetalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetalledocumentoLogic.getTipoDetalleDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetalledocumentoLogic.getTipoDetalleDocumentos()==null||tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetalledocumentos==null|| tipodetalledocumentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
						tipodetalledocumentosAux.addAll(tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentosAux=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentosAux.addAll(tipodetalledocumentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetalledocumentoLogic.getTipoDetalleDocumentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetalleDocumentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetalleDocumentos("FK_IdEmpresa",tipodetalledocumentoLogic.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetalleDocumentos("FK_IdEmpresa",tipodetalledocumentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoLogic.setTipoDetalleDocumentos(new ArrayList<TipoDetalleDocumento>());
						tipodetalledocumentoLogic.getTipoDetalleDocumentos().addAll(tipodetalledocumentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
							tipodetalledocumentos.addAll(tipodetalledocumentosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDetalleDocumento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDetalleDocumento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetalledocumentoLogic.getTipoDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetalledocumentos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetalledocumentoLogic.getTipoDetalleDocumentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetalledocumentos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDetalleDocumento tipodetalledocumento) {
		Boolean permite=true;
		
		if(this.tipodetalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDetalleDocumentoConstantesFunciones.getOrderByListaTipoDetalleDocumento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDetalleDocumentoConstantesFunciones.getOrderByListaTipoDetalleDocumento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				if(tipodetalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetalledocumentoTotales=tipodetalledocumento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleDocumento tipodetalledocumento:this.tipodetalledocumentos) {
				if(tipodetalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetalledocumentoTotales=tipodetalledocumento;
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
			this.tipodetalledocumentoAux=new TipoDetalleDocumento();
			this.tipodetalledocumentoAux.setsType(Constantes2.S_TOTALES);
			this.tipodetalledocumentoAux.setIsNew(false);
			this.tipodetalledocumentoAux.setIsChanged(false);
			this.tipodetalledocumentoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDetalleDocumentoConstantesFunciones.TotalizarValoresFilaTipoDetalleDocumento(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this.tipodetalledocumentoAux);
				
				this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().add(this.tipodetalledocumentoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDetalleDocumentoConstantesFunciones.TotalizarValoresFilaTipoDetalleDocumento(this.tipodetalledocumentos,this.tipodetalledocumentoAux);
				
				this.tipodetalledocumentos.add(this.tipodetalledocumentoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodetalledocumentoTotales=new TipoDetalleDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().remove(tipodetalledocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetalledocumentos.remove(tipodetalledocumentoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodetalledocumentoTotales=new TipoDetalleDocumento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				if(tipodetalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetalledocumentoTotales=tipodetalledocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetalleDocumentoConstantesFunciones.TotalizarValoresFilaTipoDetalleDocumento(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),tipodetalledocumentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetalleDocumento tipodetalledocumento:this.tipodetalledocumentos) {
				if(tipodetalledocumento.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetalledocumentoTotales=tipodetalledocumento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetalleDocumentoConstantesFunciones.TotalizarValoresFilaTipoDetalleDocumento(this.tipodetalledocumentos,tipodetalledocumentoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDetalleDocumentosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetalleDocumentosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetalleDocumentosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDetalleDocumentosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetalleDocumentosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLogic.getTipoDetalleDocumentosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetalleDocumentosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLogic.getTipoDetalleDocumentosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDetalleDocumento() {
		this.isPermisoTodoTipoDetalleDocumento=false;
		this.isPermisoNuevoTipoDetalleDocumento=false;
		this.isPermisoActualizarTipoDetalleDocumento=false;
		this.isPermisoActualizarOriginalTipoDetalleDocumento=false;
		this.isPermisoEliminarTipoDetalleDocumento=false;
		this.isPermisoGuardarCambiosTipoDetalleDocumento=false;
		this.isPermisoConsultaTipoDetalleDocumento=false;
		this.isPermisoBusquedaTipoDetalleDocumento=false;
		this.isPermisoReporteTipoDetalleDocumento=false;		
		this.isPermisoOrdenTipoDetalleDocumento=false;		
		this.isPermisoPaginacionMedioTipoDetalleDocumento=false;		
		this.isPermisoPaginacionAltoTipoDetalleDocumento=false;
		this.isPermisoPaginacionTodoTipoDetalleDocumento=false;
		this.isPermisoCopiarTipoDetalleDocumento=false;		
		this.isPermisoVerFormTipoDetalleDocumento=false;		
		this.isPermisoDuplicarTipoDetalleDocumento=false;		
		this.isPermisoOrdenTipoDetalleDocumento=false;		
	}
	
	public void setPermisosUsuarioTipoDetalleDocumento(Boolean isPermiso) {
		this.isPermisoTodoTipoDetalleDocumento=isPermiso;
		this.isPermisoNuevoTipoDetalleDocumento=isPermiso;
		this.isPermisoActualizarTipoDetalleDocumento=isPermiso;
		this.isPermisoActualizarOriginalTipoDetalleDocumento=isPermiso;
		this.isPermisoEliminarTipoDetalleDocumento=isPermiso;
		this.isPermisoGuardarCambiosTipoDetalleDocumento=isPermiso;
		this.isPermisoConsultaTipoDetalleDocumento=isPermiso;
		this.isPermisoBusquedaTipoDetalleDocumento=isPermiso;
		this.isPermisoReporteTipoDetalleDocumento=isPermiso;
		this.isPermisoOrdenTipoDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionMedioTipoDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionAltoTipoDetalleDocumento=isPermiso;		
		this.isPermisoPaginacionTodoTipoDetalleDocumento=isPermiso;		
		this.isPermisoCopiarTipoDetalleDocumento=isPermiso;		
		this.isPermisoVerFormTipoDetalleDocumento=isPermiso;		
		this.isPermisoDuplicarTipoDetalleDocumento=isPermiso;
		this.isPermisoOrdenTipoDetalleDocumento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDetalleDocumento(Boolean isPermiso) {
		//this.isPermisoTodoTipoDetalleDocumento=isPermiso;
		this.isPermisoNuevoTipoDetalleDocumento=isPermiso;
		this.isPermisoActualizarTipoDetalleDocumento=isPermiso;
		this.isPermisoActualizarOriginalTipoDetalleDocumento=isPermiso;
		this.isPermisoEliminarTipoDetalleDocumento=isPermiso;
		this.isPermisoGuardarCambiosTipoDetalleDocumento=isPermiso;
		//this.isPermisoConsultaTipoDetalleDocumento=isPermiso;
		//this.isPermisoBusquedaTipoDetalleDocumento=isPermiso;
		//this.isPermisoReporteTipoDetalleDocumento=isPermiso;
		//this.isPermisoOrdenTipoDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDetalleDocumento=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDetalleDocumento=isPermiso;		
		//this.isPermisoCopiarTipoDetalleDocumento=isPermiso;		
		//this.isPermisoDuplicarTipoDetalleDocumento=isPermiso;
		//this.isPermisoOrdenTipoDetalleDocumento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetalleDocumentoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleDocumentoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleDocumento=false;
		this.isTienePermisosDetalleDocumento=this.verificarGetPermisosUsuarioOpcionTipoDetalleDocumentoClaseRelacionada(this.opcionsRelacionadas,DetalleDocumentoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDetalleDocumento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetalleDocumentoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleDocumento=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDetalleDocumentoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDetalleDocumentoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDetalleDocumentoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleDocumento && this.jInternalFrameDetalleFormTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.remove(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDetalleDocumento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDetalleDocumentoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDetalleDocumento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDetalleDocumento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDetalleDocumento=this.isPermisoActualizarTipoDetalleDocumento;
			this.isPermisoEliminarTipoDetalleDocumento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDetalleDocumento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDetalleDocumento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDetalleDocumento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDetalleDocumento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDetalleDocumento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetalleDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDetalleDocumento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDetalleDocumento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDetalleDocumento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDetalleDocumento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDetalleDocumento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDetalleDocumento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetalleDocumento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDetalleDocumento.setToolTipText(this.jTableDatosTipoDetalleDocumento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDetalleDocumento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDetalleDocumento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDetalleDocumento() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleDocumento && this.tipodetalledocumentoConstantesFunciones.mostrarDetalleDocumentoTipoDetalleDocumento && !TipoDetalleDocumentoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Documento");
			reporte.setsDescripcion("Detalle Documento");
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
	public void inicializarCombosForeignKeyTipoDetalleDocumentoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDetalleDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDetalleDocumentoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDetalleDocumentoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoDetalleDocumentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoReturnGeneral=new TipoDetalleDocumentoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodetalledocumentoConstantesFunciones.cargarid_empresaTipoDetalleDocumento)
					 || (this.esRecargarFks && this.tipodetalledocumentoConstantesFunciones.cargarid_empresaTipoDetalleDocumento)) {

					if(!this.tipodetalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodetalledocumentoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.cargarCombosLoteForeignKeyTipoDetalleDocumento(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodetalledocumentoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDetalleDocumento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodetalledocumentoSessionBean==null) {
				this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
			}

			if(!this.tipodetalledocumentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDetalleDocumento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDetalleDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDetalleDocumento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleDocumento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDetalleDocumento()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetalleDocumento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDetalleDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDetalleDocumento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDetalleDocumento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDetalleDocumento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDetalleDocumento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDetalleDocumento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDetalleDocumentoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDetalleDocumentoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDetalleDocumentoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean(); 
		this.tipodetalledocumentoConstantesFunciones=new TipoDetalleDocumentoConstantesFunciones(); 
		this.tipodetalledocumentoBean=new TipoDetalleDocumento();//(this.tipodetalledocumentoConstantesFunciones); 		
		this.tipodetalledocumentoReturnGeneral=new TipoDetalleDocumentoParameterReturnGeneral(); 
		
		this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDetalleDocumentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDetalleDocumento(true);
			
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
			
			this.tipodetalledocumentoConstantesFunciones=new TipoDetalleDocumentoConstantesFunciones(); 
			this.tipodetalledocumentoBean=new TipoDetalleDocumento();//this.tipodetalledocumentoConstantesFunciones); 			
			this.tipodetalledocumentoReturnGeneral=new TipoDetalleDocumentoParameterReturnGeneral(); 
		
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Documento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodetalledocumento=new TipoDetalleDocumento();
			this.tipodetalledocumentos = new ArrayList<TipoDetalleDocumento>();
			this.tipodetalledocumentosAux = new ArrayList<TipoDetalleDocumento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic=new TipoDetalleDocumentoLogic();
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodetalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDetalleDocumento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetalleDocumento);	
					}
					
					if(this.jInternalFrameImportacionTipoDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetalleDocumento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDetalleDocumento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDetalleDocumento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetalleDocumento);
				this.jInternalFrameDetalleFormTipoDetalleDocumento.setVisible(false);
				this.jInternalFrameDetalleFormTipoDetalleDocumento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetalleDocumento);
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetalleDocumento);
					this.jInternalFrameImportacionTipoDetalleDocumento.setVisible(false);
					this.jInternalFrameImportacionTipoDetalleDocumento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDetalleDocumento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetalleDocumento);
					this.jInternalFrameOrderByTipoDetalleDocumento.setVisible(false);
					this.jInternalFrameOrderByTipoDetalleDocumento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDetalleDocumentoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodetalledocumentoReturnGeneral=new TipoDetalleDocumentoParameterReturnGeneral();
			
			this.tipodetalledocumentoParameterGeneral=new TipoDetalleDocumentoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodetalledocumentoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDetalleDocumentoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleDocumentoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetalleDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado(),this.tipodetalledocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetalleDocumentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado(),this.tipodetalledocumentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaDuplicarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaCopiarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaVerFormTipoDetalleDocumento=true;
			this.isVisibilidadCeldaOrdenTipoDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDetalleDocumento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDetalleDocumento(false);
			
			this.setPermisosUsuarioTipoDetalleDocumento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() && this.tipodetalledocumentoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDetalleDocumentoClasesRelacionadas();
			}
			
			if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDetalleDocumentoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDetalleDocumento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDetalleDocumento();
			}
			
			if(!this.isPermisoBusquedaTipoDetalleDocumento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDetalleDocumento,this.isPermisoPaginacionMedioTipoDetalleDocumento,this.isPermisoPaginacionTodoTipoDetalleDocumento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDetalleDocumentoConstantesFunciones.getTiposSeleccionarTipoDetalleDocumento());
				
				this.tiposColumnasSelect=TipoDetalleDocumentoConstantesFunciones.getTiposSeleccionarTipoDetalleDocumento(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDetalleDocumento();				
				//this.tiposRelacionesSelect=TipoDetalleDocumentoConstantesFunciones.getTiposRelacionesTipoDetalleDocumento(true);
				
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
			//if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDetalleDocumento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDetalleDocumento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDetalleDocumento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleDocumento() ;
			
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
			
			
			this.detalledocumentoLogic=new DetalleDocumentoLogic(); 
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
				tipodetalledocumentoImplementable= (TipoDetalleDocumentoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetalleDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodetalledocumentoImplementableHome= (TipoDetalleDocumentoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetalleDocumentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodetalledocumentos= new ArrayList<TipoDetalleDocumento>();
			this.tipodetalledocumentosEliminados= new ArrayList<TipoDetalleDocumento>();
						
			this.isEsNuevoTipoDetalleDocumento=false;
			this.esParaAccionDesdeFormularioTipoDetalleDocumento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDetalleDocumento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDetalleDocumento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDetalleDocumentoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDetalleDocumento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDetalleDocumento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDetalleDocumento();
			}
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDetalleDocumento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDetalleDocumento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDetalleDocumento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDetalleDocumento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDetalleDocumento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDetalleDocumento() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDetalleDocumento")) {
				iIndex=this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Documentos")) {
					if(!DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDetalleDocumento();

						this.cargarParteTabPanelRelacionadaDetalleDocumento(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDetalleDocumento();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleDocumento(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDetalleDocumento.cargarSessionConBeanSwingJInternalFrameDetalleDocumento(false,true,iIndex);
		this.jButtonDetalleDocumentoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleDocumento();

		//this.jTabbedPaneRelacionesTipoDetalleDocumento.updateUI();
		//this.jTabbedPaneRelacionesTipoDetalleDocumento.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDetalleDocumento.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleDocumento")) {
				int row=this.jTableDatosTipoDetalleDocumento.getSelectedRow();
				jButtonDetalleDocumentoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Documento")) {

					if(this.isTienePermisosDetalleDocumento && this.tipodetalledocumentoConstantesFunciones.mostrarDetalleDocumentoTipoDetalleDocumento && !TipoDetalleDocumentoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Documentos"+"("+DetalleDocumentoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Documentos");

						if(tipodetalledocumentoConstantesFunciones.resaltarDetalleDocumentoTipoDetalleDocumento!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodetalledocumentoConstantesFunciones.resaltarDetalleDocumentoTipoDetalleDocumento);
						}

						jmenuItem.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarDetalleDocumentoTipoDetalleDocumento);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleDocumento"));

						

						this.jInternalFrameDetalleFormTipoDetalleDocumento.jmenuDetalleTipoDetalleDocumento.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDetalleDocumento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDetalleDocumento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDetalleDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDetalleDocumentoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDetalleDocumento();
		
		this.cargarCombosFrameForeignKeyTipoDetalleDocumento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDetalleDocumento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDetalleDocumento();
		}
	}
	
	
	
	public void jButtonNuevoTipoDetalleDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			
			if(jTableDatosTipoDetalleDocumento.getRowCount()>=1) {
				jTableDatosTipoDetalleDocumento.removeRowSelectionInterval(0, jTableDatosTipoDetalleDocumento.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDetalleDocumento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDetalleDocumento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDetalleDocumento(true);			
			//this.tipodetalledocumento=new TipoDetalleDocumento();
			//this.tipodetalledocumento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento() ;
			
			if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleDocumento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodetalledocumento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);				
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDetalleDocumento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDetalleDocumentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDetalleDocumento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDetalleDocumento.getSelectedRows().length;			
			}
			
			tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDetalleDocumento--;			
				//TipoDetalleDocumento tipodetalledocumentoAux= new TipoDetalleDocumento();			
				//tipodetalledocumentoAux.setId(this.iIdNuevoTipoDetalleDocumento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDetalleDocumento tipodetalledocumentoOrigen=new TipoDetalleDocumento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDetalleDocumento tipodetalledocumentoOrigen : tipodetalledocumentosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodetalledocumentoOrigen =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetalledocumentoOrigen =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDetalleDocumento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodetalledocumento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDetalleDocumento(tipodetalledocumentoOrigen,this.tipodetalledocumento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().add(this.tipodetalledocumentoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumentos.add(this.tipodetalledocumentoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
				
				this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleDocumento(), this.getIndiceNuevoTipoDetalleDocumento());
				
				int iLastRow =  this.jTableDatosTipoDetalleDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetalleDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetalleDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();									
		
			TipoDetalleDocumento tipodetalledocumentoOrigen=new TipoDetalleDocumento();
			TipoDetalleDocumento tipodetalledocumentoDestino=new TipoDetalleDocumento();
				
			tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDetalleDocumento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodetalledocumentosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDetalleDocumento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoOrigen =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetalledocumentoOrigen =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetalledocumentoDestino =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetalledocumentoDestino =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodetalledocumentoOrigen =tipodetalledocumentosSeleccionados.get(0);
				tipodetalledocumentoDestino =tipodetalledocumentosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDetalleDocumento(tipodetalledocumentoOrigen,tipodetalledocumentoDestino,true,false);
				
				tipodetalledocumentoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetalledocumentoDestino,tipodetalledocumentoLogic.getTipoDetalleDocumentos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetalledocumentoDestino,tipodetalledocumentos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
				
				//this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleDocumento(), this.getIndiceNuevoTipoDetalleDocumento());
				
				int iLastRow =  this.jTableDatosTipoDetalleDocumento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetalleDocumento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetalleDocumento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDetalleDocumento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(!isVisible);
			this.jPanelPaginacionTipoDetalleDocumento.setVisible(!isVisible);
			this.jPanelAccionesTipoDetalleDocumento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDetalleDocumento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDetalleDocumento();
			
			this.abrirFrameOrderByTipoDetalleDocumento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDetalleDocumento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDetalleDocumento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetalleDocumento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDetalleDocumento.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDetalleDocumento.setSize(this.jInternalFrameDetalleFormTipoDetalleDocumento.iWidthFormulario,this.jInternalFrameDetalleFormTipoDetalleDocumento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDetalleDocumento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDetalleDocumento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDetalleDocumento.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDetalleDocumento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDetalleDocumento.jContentPaneDetalleTipoDetalleDocumento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleDocumento.jContentPaneDetalleTipoDetalleDocumento.getWidth(),TipoDetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleDocumento.jContentPaneDetalleTipoDetalleDocumento.getWidth(),TipoDetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDetalleDocumento.jContentPaneDetalleTipoDetalleDocumento.getWidth(),TipoDetalleDocumentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleDocumento();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDetalleDocumento.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDetalleDocumento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDetalleDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDetalleDocumento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleDocumento,false,this);
				} else {
					this.jInternalFrameOrderByTipoDetalleDocumento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetalleDocumento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetalleDocumento);
				this.jInternalFrameOrderByTipoDetalleDocumento.setVisible(false);
				this.jInternalFrameOrderByTipoDetalleDocumento.setSelected(false);
				
				this.jInternalFrameOrderByTipoDetalleDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetalleDocumento"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDetalleDocumento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDetalleDocumento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDetalleDocumento==null) {
				
				this.jInternalFrameImportacionTipoDetalleDocumento=new ImportacionJInternalFrame(TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetalleDocumento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetalleDocumento);
				this.jInternalFrameImportacionTipoDetalleDocumento.setVisible(false);
				this.jInternalFrameImportacionTipoDetalleDocumento.setSelected(false);


				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetalleDocumento"));
				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetalleDocumento"));
				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetalleDocumento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDetalleDocumento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento==null) {
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento=new ReporteDinamicoJInternalFrame(TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetalleDocumento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetalleDocumento);
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleDocumento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleDocumento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleDocumento() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosDetalleDocumento.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDetalleDocumento.jContentPaneDetalleTipoDetalleDocumento.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosDetalleDocumento.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosDetalleDocumento.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosDetalleDocumento.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDetalleDocumento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetalleDocumento);
			
	       	this.jInternalFrameDetalleFormTipoDetalleDocumento.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDetalleDocumento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDetalleDocumento.dispose();
			//this.jInternalFrameDetalleFormTipoDetalleDocumento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDetalleDocumento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDetalleDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDetalleDocumento.setVisible(true);
	        this.jInternalFrameImportacionTipoDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDetalleDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDetalleDocumento.setVisible(true);
	        this.jInternalFrameOrderByTipoDetalleDocumento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDetalleDocumento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDetalleDocumento.setVisible(false);
	        this.jInternalFrameOrderByTipoDetalleDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDetalleDocumento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDetalleDocumento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDetalleDocumento.setVisible(false);
	        this.jInternalFrameImportacionTipoDetalleDocumento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDetalleDocumento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDetalleDocumento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDetalleDocumento(true);
			//this.isEsNuevoTipoDetalleDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false) ;
			
			if(tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.getEsGuardarRelacionado() && DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleDocumentoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleDocumento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDetalleDocumentoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDetalleDocumento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDetalleDocumento(true);
			//this.isEsNuevoTipoDetalleDocumento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodetalledocumento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false) ;
			
			if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetalleDocumento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDetalleDocumento(false);
			
			//if(!this.isEsNuevoTipoDetalleDocumento) {								
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				
			}
			
			if(this.permiteMantenimiento(this.tipodetalledocumento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDetalleDocumento=true;
					this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
					this.isEsNuevoTipoDetalleDocumento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDetalleDocumento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDetalleDocumento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(false);
				
				this.habilitarDeshabilitarControlesTipoDetalleDocumento(false);
			
												
				
				if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDetalleDocumento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,tipodetalledocumentoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDetalleDocumento(this.tipodetalledocumento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodetalledocumentoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodetalledocumento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				this.tipodetalledocumento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				this.tipodetalledocumento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodetalledocumento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDetalleDocumentoModel) this.jTableDatosTipoDetalleDocumento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDetalleDocumento=true;
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
				this.isEsNuevoTipoDetalleDocumento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(false);
				
				this.habilitarDeshabilitarControlesTipoDetalleDocumento(false);
				
				
				
				if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDetalleDocumento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDetalleDocumento.getRowCount()>=1) {
				jTableDatosTipoDetalleDocumento.removeRowSelectionInterval(0, jTableDatosTipoDetalleDocumento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDetalleDocumento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(false) ;
			
			this.isEsNuevoTipoDetalleDocumento=false;
			
			if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDetalleDocumento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDetalleDocumento(false);
				
				//SI ES MANUAL
				if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDetalleDocumento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDetalleDocumento--;			
			//TipoDetalleDocumento tipodetalledocumentoAux= new TipoDetalleDocumento();			
			//tipodetalledocumentoAux.setId(this.iIdNuevoTipoDetalleDocumento);
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDetalleDocumento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
			
			this.tipodetalledocumento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().add(this.tipodetalledocumentoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodetalledocumentos.add(this.tipodetalledocumentoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			
			this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(this.getIndiceNuevoTipoDetalleDocumento(), this.getIndiceNuevoTipoDetalleDocumento());
			
			int iLastRow =  this.jTableDatosTipoDetalleDocumento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDetalleDocumento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDetalleDocumento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
			
			//SI ES MANUAL
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleDocumento();
			}
			
			//this.abrirFrameTreeTipoDetalleDocumento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Detalle DocumentoS ?", "MANTENIMIENTO DE Tipo Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDetalleDocumento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDetalleDocumento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.procesarImportacionTipoDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodetalledocumentoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDetalleDocumentoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDetalleDocumento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDetalleDocumento.setFileImportacion(this.jInternalFrameImportacionTipoDetalleDocumento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDetalleDocumento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDetalleDocumento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDetalleDocumento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDetalleDocumento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		

		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDetalleDocumentoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDetalleDocumentoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDetalleDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetalledocumento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetalledocumento.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDetalleDocumento tipodetalledocumento:tipodetalledocumentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetalledocumento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDetalleDocumento(row);				
			//	iRow++;
			//}				
			
			//for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDetalleDocumento(tipodetalledocumentoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
			
			//SI ES MANUAL
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetalleDocumento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
			
			//SI ES MANUAL
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetalleDocumento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
			
			//SI ES MANUAL
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetalleDocumento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDetalleDocumento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDetalleDocumento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDetalleDocumento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDetalleDocumento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDetalleDocumento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDetalleDocumento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDetalleDocumento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDetalleDocumento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDetalleDocumento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDetalleDocumento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDetalleDocumento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDetalleDocumento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDetalleDocumento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDetalleDocumento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleDocumento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDetalleDocumento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDetalleDocumento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDetalleDocumento();
		
		this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetalleDocumento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleDocumento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleDocumento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleDocumento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDetalleDocumento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDetalleDocumento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionNuevoTipoDetalleDocumento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDetalleDocumento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDetalleDocumento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionNuevoTipoDetalleDocumento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDetalleDocumento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDetalleDocumento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDetalleDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDetalleDocumento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDetalleDocumento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDetalleDocumento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDetalleDocumento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDetalleDocumento(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetalleDocumento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetalleDocumento() throws Exception {
		try	{
			if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetalleDocumento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetalleDocumento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetalleDocumento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDetalleDocumento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDetalleDocumento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDetalleDocumento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDetalleDocumento.addItem(reporte);
			}
			
			
			if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDetalleDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDetalleDocumento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDetalleDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDetalleDocumento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDetalleDocumento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDetalleDocumento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDetalleDocumento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleDocumento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetalleDocumento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDetalleDocumento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDetalleDocumento.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDetalleDocumento.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDetalleDocumento(Boolean esInicializar) throws Exception {				
		if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetalleDocumento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDetalleDocumento() throws Exception {
		this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDetalleDocumento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDetalleDocumentoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumentoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDetalleDocumento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodetalledocumentos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDetalleDocumento.setModel(new TipoDetalleDocumentoModel(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDetalleDocumento.setModel(new TipoDetalleDocumentoModel(this.tipodetalledocumentos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDetalleDocumento!=null && this.jInternalFrameOrderByTipoDetalleDocumento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDetalleDocumento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,tipodetalledocumentoConstantesFunciones.resaltarSeleccionarTipoDetalleDocumento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO,tipodetalledocumentoConstantesFunciones.resaltarSeleccionarTipoDetalleDocumento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,TipoDetalleDocumentoConstantesFunciones.LABEL_ID));

		if(this.tipodetalledocumentoConstantesFunciones.mostraridTipoDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleDocumentoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodetalledocumentoConstantesFunciones.resaltaridTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activaridTipoDetalleDocumento,this,true,"idTipoDetalleDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetalledocumentoConstantesFunciones.resaltaridTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activaridTipoDetalleDocumento,this,true,"idTipoDetalleDocumento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodetalledocumentoConstantesFunciones.mostrarid_empresaTipoDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodetalledocumentoConstantesFunciones.resaltarid_empresaTipoDetalleDocumento,this,this.tipodetalledocumentoConstantesFunciones.activarid_empresaTipoDetalleDocumento));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodetalledocumentoConstantesFunciones.resaltarid_empresaTipoDetalleDocumento,this,this.tipodetalledocumentoConstantesFunciones.activarid_empresaTipoDetalleDocumento,false,"id_empresaTipoDetalleDocumento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO));

		if(this.tipodetalledocumentoConstantesFunciones.mostrarcodigoTipoDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetalledocumentoConstantesFunciones.resaltarcodigoTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activarcodigoTipoDetalleDocumento,this,true,"codigoTipoDetalleDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetalledocumentoConstantesFunciones.resaltarcodigoTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activarcodigoTipoDetalleDocumento,this,true,"codigoTipoDetalleDocumento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodetalledocumentoConstantesFunciones.mostrarnombreTipoDetalleDocumento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetalledocumentoConstantesFunciones.resaltarnombreTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activarnombreTipoDetalleDocumento,this,true,"nombreTipoDetalleDocumento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetalledocumentoConstantesFunciones.resaltarnombreTipoDetalleDocumento,this.tipodetalledocumentoConstantesFunciones.activarnombreTipoDetalleDocumento,this,true,"nombreTipoDetalleDocumento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoDetalleDocumentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleDocumento && this.tipodetalledocumentoConstantesFunciones.mostrarDetalleDocumentoTipoDetalleDocumento && !TipoDetalleDocumentoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Documentos");
				tableColumn.setHeaderValue("Detalle Documentos");
				tableColumn.setCellRenderer(new DetalleDocumentoTableCell(tipodetalledocumentoConstantesFunciones.resaltarDetalleDocumentoTipoDetalleDocumento,this,this.tipodetalledocumentoConstantesFunciones.activarDetalleDocumentoTipoDetalleDocumento));
				tableColumn.setCellEditor(new DetalleDocumentoTableCell(tipodetalledocumentoConstantesFunciones.resaltarDetalleDocumentoTipoDetalleDocumento,this,this.tipodetalledocumentoConstantesFunciones.activarDetalleDocumentoTipoDetalleDocumento));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDetalleDocumento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDetalleDocumento.moveColumn(this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDetalleDocumento.moveColumn(this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDetalleDocumento.moveColumn(this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDetalleDocumento.moveColumn(this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDetalleDocumento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDetalleDocumento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDetalleDocumento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDetalleDocumento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDetalleDocumento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDetalleDocumento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodetalledocumentoLogic.getTipoDetalleDocumentos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodetalledocumentos.size()-1;
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
		//this.jTableDatosTipoDetalleDocumento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDetalleDocumento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDetalleDocumento();
			
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
				
				//this.isEsNuevoTipoDetalleDocumento=false;
					
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
				if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetalleDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetalleDocumento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodetalledocumento.getsType().equals("DUPLICADO")
				   || this.tipodetalledocumento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDetalleDocumento=true;
				
				} else {
					this.isEsNuevoTipoDetalleDocumento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodetalledocumento.getId()>=0 && !this.tipodetalledocumento.getIsNew()) {						
						this.isEsNuevoTipoDetalleDocumento=false;
						
					} else {
						this.isEsNuevoTipoDetalleDocumento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDetalleDocumento(esRelaciones);						
				
				this.seleccionarTipoDetalleDocumento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodetalledocumento.getId()<0) {
					this.isEsNuevoTipoDetalleDocumento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDetalleDocumento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDetalleDocumento(evt,rowIndex);
				}	
				
				if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDetalleDocumento: " + this.dDif); 
					}
				}								
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDetalleDocumento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodetalledocumento)) {
					if(this.tipodetalledocumento.getId()>0) {
						this.tipodetalledocumento.setIsDeleted(true);
						
						this.tipodetalledocumentosEliminados.add(this.tipodetalledocumento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().remove(this.tipodetalledocumento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumentos.remove(this.tipodetalledocumento);				
					}
					
					
					((TipoDetalleDocumentoModel) this.jTableDatosTipoDetalleDocumento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDetalleDocumento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDetalleDocumento) {
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetalleDocumento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetalleDocumento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodetalledocumentoConstantesFunciones.cargarid_empresaTipoDetalleDocumento || this.tipodetalledocumentoConstantesFunciones.event_dependid_empresaTipoDetalleDocumento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodetalledocumento.getid_empresa());
									//this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodetalledocumento.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodetalledocumento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodetalledocumento.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDetalleDocumento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDetalleDocumento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDetalleDocumento(tipodetalledocumento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDetalleDocumento(tipodetalledocumento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDetalleDocumento(tipodetalledocumento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleDocumento(tipodetalledocumento);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setText(tipodetalledocumento.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setText(tipodetalledocumento.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setText(tipodetalledocumento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDetalleDocumento tipodetalledocumentoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodetalledocumentoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDetalleDocumento tipodetalledocumentoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodetalledocumentoLocal=this.tipodetalledocumento;
			} else {
				tipodetalledocumentoLocal=this.tipodetalledocumentoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodetalledocumentoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDetalleDocumento(tipodetalledocumentoLocal,true);
					
					if(tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodetalledocumentoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodetalledocumentoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(tipodetalledocumento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(tipodetalledocumento);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(tipodetalledocumento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.getText()==null || this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.getText()=="" || this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setText("0");
			}

			if(conColumnasBase) {tipodetalledocumento.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleDocumentoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelIdTipoDetalleDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetalledocumento.setcodigo(this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelcodigoTipoDetalleDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetalledocumento.setnombre(this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelnombreTipoDetalleDocumento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumentoBean,TipoDetalleDocumento tipodetalledocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumentoOrigen,TipoDetalleDocumento tipodetalledocumento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetalledocumentoOrigen.getId()!=null && !tipodetalledocumentoOrigen.getId().equals(0L))) {tipodetalledocumento.setId(tipodetalledocumentoOrigen.getId());}}
			if(conDefault || (!conDefault && tipodetalledocumentoOrigen.getcodigo()!=null && !tipodetalledocumentoOrigen.getcodigo().equals(""))) {tipodetalledocumento.setcodigo(tipodetalledocumentoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodetalledocumentoOrigen.getnombre()!=null && !tipodetalledocumentoOrigen.getnombre().equals(""))) {tipodetalledocumento.setnombre(tipodetalledocumentoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setText(tipodetalledocumento.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setText(tipodetalledocumento.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setText(tipodetalledocumento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetalleDocumento(TipoDetalleDocumentoBean tipodetalledocumentoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setText(tipodetalledocumentoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setText(tipodetalledocumentoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setText(tipodetalledocumentoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDetalleDocumento(TipoDetalleDocumentoParameterReturnGeneral tipodetalledocumentoReturnGeneral,TipoDetalleDocumentoBean tipodetalledocumentoBean,Boolean conDefault) throws Exception { 
		try {
			TipoDetalleDocumento tipodetalledocumentoLocal=new TipoDetalleDocumento();
			
			tipodetalledocumentoLocal=tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetalledocumentoLocal.getId()!=null && !tipodetalledocumentoLocal.getId().equals(0L))) {tipodetalledocumentoBean.setId(tipodetalledocumentoLocal.getId());}}
			if(conDefault || (!conDefault && tipodetalledocumentoLocal.getcodigo()!=null && !tipodetalledocumentoLocal.getcodigo().equals(""))) {tipodetalledocumentoBean.setcodigo(tipodetalledocumentoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodetalledocumentoLocal.getnombre()!=null && !tipodetalledocumentoLocal.getnombre().equals(""))) {tipodetalledocumentoBean.setnombre(tipodetalledocumentoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDetalleDocumentoGenerico(Long idTipoDetalleDocumentoSeleccionado,JComboBox jComboBoxTipoDetalleDocumento,List<TipoDetalleDocumento> tipodetalledocumentosLocal)throws Exception {
		try {
			TipoDetalleDocumento  tipodetalledocumentoTemp=null;

			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosLocal) {
				if(tipodetalledocumentoAux.getId()!=null && tipodetalledocumentoAux.getId().equals(idTipoDetalleDocumentoSeleccionado)) {
					tipodetalledocumentoTemp=tipodetalledocumentoAux;
					break;
				}
			}

			jComboBoxTipoDetalleDocumento.setSelectedItem(tipodetalledocumentoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDetalleDocumentoGenerico(JComboBox jComboBoxTipoDetalleDocumento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetalleDocumento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDetalleDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetalleDocumento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDetalleDocumento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleDocumento")) {
			jButtonDetalleDocumentoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetalledocumento=(TipoDetalleDocumento) tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetalledocumento =(TipoDetalleDocumento) tipodetalledocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodetalledocumento.getIsNew() && !tipodetalledocumento.getIsChanged() && !tipodetalledocumento.getIsDeleted()) {
				sDescripcion=tipodetalledocumento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodetalledocumento.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDetalleDocumento tipodetalledocumentoRow=new TipoDetalleDocumento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetalledocumentoRow=(TipoDetalleDocumento) tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetalledocumentoRow=(TipoDetalleDocumento) tipodetalledocumentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleDocumentoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDetalleDocumento tipodetalledocumento) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumento = (TipoDetalleDocumento)this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodetalledocumento = (TipoDetalleDocumento)this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodetalledocumento!=null) {
						this.tipodetalledocumento = tipodetalledocumento;
					} else {
						this.tipodetalledocumento = new TipoDetalleDocumento();
					}
				}

				if(this.isTienePermisosDetalleDocumento && this.permiteMantenimiento(this.tipodetalledocumento)) {
					DetalleDocumentoBeanSwingJInternalFrame detalledocumentoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup=new DetalleDocumentoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalledocumentoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup;
					} else {
						detalledocumentoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame;
					}

					List<TipoDetalleDocumento> tipodetalledocumentos=new ArrayList<TipoDetalleDocumento>();
					tipodetalledocumentos.add(this.tipodetalledocumento);
					if(!esRelacionado) {
						//detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setConGuardarRelaciones(false);
						//detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalledocumentoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDetalleDocumento.cargarDetalleDocumentoBeanSwingJInternalFrame(tipodetalledocumentos,this.tipodetalledocumento,detalledocumentoBeanSwingJInternalFrame,/*conInicializar,*/detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.getConGuardarRelaciones(),detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.getEsGuardarRelacionado());
					detalledocumentoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalledocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleDocumento("no_relacionado");

						detalledocumentoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleDocumentoConstantesFunciones.ITAMANIOFILATABLA + (DetalleDocumentoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalledocumentoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDetalleDocumento=(TitledBorder)this.jScrollPanelDatosTipoDetalleDocumento.getBorder();
						TitledBorder titledBorderDetalleDocumento=(TitledBorder)detalledocumentoBeanSwingJInternalFrame.jScrollPanelDatosDetalleDocumento.getBorder();

						titledBorderDetalleDocumento.setTitle(titledBorderTipoDetalleDocumento.getTitle() + " -> Detalle Documento");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalledocumentoBeanSwingJInternalFrame);
						}

						detalledocumentoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalledocumentoBeanSwingJInternalFrame);

						detalledocumentoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Documento",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDetalleDocumento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));			
			this.jButtonDuplicarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleDocumento && this.isPermisoDuplicarTipoDetalleDocumento));			
			this.jButtonCopiarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleDocumento && this.isPermisoCopiarTipoDetalleDocumento));
			this.jButtonVerFormTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleDocumento && this.isPermisoVerFormTipoDetalleDocumento));
			
			this.jButtonAbrirOrderByTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));			
			
			this.jButtonNuevoRelacionesTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));			
			this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDetalleDocumento && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleDocumento && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleDocumento && this.isPermisoEliminarTipoDetalleDocumento));
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleDocumento);							
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));						
			this.jButtonDuplicarToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleDocumento && this.isPermisoDuplicarTipoDetalleDocumento));						
			this.jButtonCopiarToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleDocumento && this.isPermisoCopiarTipoDetalleDocumento));			
			this.jButtonVerFormToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleDocumento && this.isPermisoVerFormTipoDetalleDocumento));			
			this.jButtonAbrirOrderByToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));
			this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));			
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDetalleDocumento && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleDocumento  && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleDocumento && this.isPermisoEliminarTipoDetalleDocumento));
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarToolBarTipoDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleDocumento);				
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));			
			this.jMenuItemDuplicarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaDuplicarTipoDetalleDocumento && this.isPermisoDuplicarTipoDetalleDocumento));			
			this.jMenuItemCopiarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaCopiarTipoDetalleDocumento && this.isPermisoCopiarTipoDetalleDocumento));			
			this.jMenuItemVerFormTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaVerFormTipoDetalleDocumento && this.isPermisoVerFormTipoDetalleDocumento));			
			this.jMenuItemAbrirOrderByTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));			
			//this.jMenuItemMostrarOcultarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));
			this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));			
			//this.jMenuItemDetalleMostrarOcultarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaOrdenTipoDetalleDocumento && this.isPermisoOrdenTipoDetalleDocumento));			
			this.jMenuItemNuevoRelacionesTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento));			
			this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaNuevoTipoDetalleDocumento && this.isPermisoNuevoTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));									
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemModificarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaModificarTipoDetalleDocumento && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemActualizarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaActualizarTipoDetalleDocumento && this.isPermisoActualizarTipoDetalleDocumento));	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemEliminarTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaEliminarTipoDetalleDocumento && this.isPermisoEliminarTipoDetalleDocumento));
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemCancelarTipoDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleDocumento);				
			}
			
			this.jMenuItemGuardarCambiosTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));						
			this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=this.jButtonNuevoTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDetalleDocumento=this.jButtonDuplicarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCopiarTipoDetalleDocumento=this.jButtonCopiarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaVerFormTipoDetalleDocumento=this.jButtonVerFormTipoDetalleDocumento.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDetalleDocumento=this.jButtonAbrirOrderByTipoDetalleDocumento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=this.jButtonNuevoRelacionesTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=this.jButtonModificarTipoDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=this.jButtonGuardarCambiosTablaTipoDetalleDocumento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=this.jButtonNuevoToolBarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarToolBarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarToolBarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarToolBarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarToolBarTipoDetalleDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetalleDocumento=this.jButtonGuardarCambiosToolBarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=this.jMenuItemNuevoTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=this.jMenuItemNuevoRelacionesTipoDetalleDocumento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemModificarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemActualizarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemEliminarTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemCancelarTipoDetalleDocumento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetalleDocumento=this.jMenuItemGuardarCambiosTipoDetalleDocumento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDetalleDocumento(Boolean esInicializar) {
		if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetalleDocumento();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDetalleDocumento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDetalleDocumento() {
		this.jButtonNuevoTipoDetalleDocumento.setVisible(this.isPermisoNuevoTipoDetalleDocumento);			
		this.jButtonDuplicarTipoDetalleDocumento.setVisible(this.isPermisoDuplicarTipoDetalleDocumento);			
		this.jButtonCopiarTipoDetalleDocumento.setVisible(this.isPermisoCopiarTipoDetalleDocumento);			
		this.jButtonVerFormTipoDetalleDocumento.setVisible(this.isPermisoVerFormTipoDetalleDocumento);			
		
		this.jButtonAbrirOrderByTipoDetalleDocumento.setVisible(this.isPermisoOrdenTipoDetalleDocumento);					
		
		this.jButtonNuevoRelacionesTipoDetalleDocumento.setVisible(this.isPermisoNuevoTipoDetalleDocumento);			
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarTipoDetalleDocumento.setVisible(this.isPermisoActualizarTipoDetalleDocumento);	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.setVisible(this.isPermisoActualizarTipoDetalleDocumento);	
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.setVisible(this.isPermisoEliminarTipoDetalleDocumento);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleDocumento);						
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.setVisible(this.isPermisoGuardarCambiosTipoDetalleDocumento);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setVisible(this.isPermisoActualizarTipoDetalleDocumento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetalleDocumento() {
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarTipoDetalleDocumento.setVisible(this.isPermisoActualizarTipoDetalleDocumento);	
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.setVisible(this.isPermisoActualizarTipoDetalleDocumento);	
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.setVisible(this.isPermisoEliminarTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.setVisible(this.isVisibilidadCeldaCancelarTipoDetalleDocumento);							
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.setVisible((this.isVisibilidadCeldaGuardarTipoDetalleDocumento && this.isPermisoGuardarCambiosTipoDetalleDocumento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDetalleDocumento() {
		if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDetalleDocumento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDetalleDocumento() {
	}
	
	public void jTableDatosTipoDetalleDocumentoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDetalleDocumento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.gettipodetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetalledocumento==null) {
						this.tipodetalledocumento = new TipoDetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				}

				if(this.tipodetalledocumento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodetalledocumento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDetalleDocumentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDetalleDocumento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDetalleDocumento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDetalleDocumento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.gettipodetalledocumento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodetalledocumentoLogic.getConnexion());

				if(this.tipodetalledocumento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodetalledocumento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDetalleDocumento=(TitledBorder)this.jScrollPanelDatosTipoDetalleDocumento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDetalleDocumento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.gettipodetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetalledocumento==null) {
						this.tipodetalledocumento = new TipoDetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				}

				if(this.tipodetalledocumento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodetalledocumento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.gettipodetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetalledocumento==null) {
						this.tipodetalledocumento = new TipoDetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				}

				if(this.tipodetalledocumento.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodetalledocumento.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDetalleDocumentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.gettipodetalledocumento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetalledocumento==null) {
						this.tipodetalledocumento = new TipoDetalleDocumento();
					}

					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);
				}

				if(this.tipodetalledocumento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodetalledocumento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetalleDocumento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);

			this.getTipoDetalleDocumentosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDetalleDocumento(false);

			//if(TipoDetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);

			this.getTipoDetalleDocumentosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDetalleDocumento(false);

			//if(TipoDetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoDetalleDocumentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);

			this.getTipoDetalleDocumentosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDetalleDocumento(false);

			//if(TipoDetalleDocumentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetalledocumentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDetalleDocumento() {
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.dispose();
			this.jInternalFrameDetalleFormTipoDetalleDocumento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
			this.jInternalFrameReporteDinamicoTipoDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDetalleDocumento.dispose();
			this.jInternalFrameReporteDinamicoTipoDetalleDocumento=null;
		}
		
		if(this.jInternalFrameImportacionTipoDetalleDocumento!=null) {
			this.jInternalFrameImportacionTipoDetalleDocumento.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDetalleDocumento.dispose();
			this.jInternalFrameImportacionTipoDetalleDocumento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDetalleDocumento();
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDetalleDocumento")) {
				jButtonDuplicarTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDetalleDocumento")) {
				jButtonCopiarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDetalleDocumento")) {
				jButtonVerFormTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDetalleDocumento")) {
				jButtonDuplicarTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDetalleDocumento")) {
				jButtonDuplicarTipoDetalleDocumentoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDetalleDocumento")) {
				jButtonModificarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDetalleDocumento")) {
				jButtonModificarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDetalleDocumento")) {
				jButtonModificarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDetalleDocumento")) {
				jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDetalleDocumento")) {
				jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDetalleDocumento")) {
				jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDetalleDocumento")) {
				jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDetalleDocumento")) {
				jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDetalleDocumento")) {
				jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDetalleDocumento")) {
				jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDetalleDocumento")) {
				jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDetalleDocumento")) {
				jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDetalleDocumento")) {
				jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDetalleDocumento")) {
				jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDetalleDocumento")) {
				jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDetalleDocumento")) {
				jButtonMostrarOcultarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDetalleDocumento")) {
				jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDetalleDocumento")) {
				jButtonCopiarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDetalleDocumento")) {
				jButtonVerFormTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDetalleDocumento")) {
				jButtonCopiarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDetalleDocumento")) {
				jButtonVerFormTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDetalleDocumento")) {
				jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDetalleDocumento")) {
				jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDetalleDocumento")) {
				jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDetalleDocumento")) {
				jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDetalleDocumento")) {
				jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDetalleDocumento")) {
				jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDetalleDocumento")) {
				jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDetalleDocumento")) {
				jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDetalleDocumento")) {
				jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDetalleDocumento") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDetalleDocumento")) {
				jButtonAbrirOrderByTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDetalleDocumento") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDetalleDocumento")) {
				jButtonMostrarOcultarTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetalleDocumento")) {
				jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDetalleDocumento")) {
				jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDetalleDocumento")) {
				jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDetalleDocumento")) {
				jButtonCerrarReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDetalleDocumento")) {
				jButtonGenerarReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDetalleDocumento")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDetalleDocumento")) {
				jButtonCerrarImportacionTipoDetalleDocumentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDetalleDocumento")) {
				
				jButtonGenerarImportacionTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDetalleDocumento")) {
				
				jButtonAbrirImportacionTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDetalleDocumento")) {
				jComboBoxTiposAccionesTipoDetalleDocumentoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDetalleDocumento")) {
				jComboBoxTiposRelacionesTipoDetalleDocumentoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDetalleDocumento")) {
				jComboBoxTiposAccionesTipoDetalleDocumentoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDetalleDocumento")) {
				
				jComboBoxTiposSeleccionarTipoDetalleDocumentoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDetalleDocumento")) {
				jTextFieldValorCampoGeneralTipoDetalleDocumentoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDetalleDocumento")) {
				jButtonAbrirOrderByTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDetalleDocumento")) {
				jButtonAbrirOrderByTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDetalleDocumento")) {
				jButtonCerrarOrderByTipoDetalleDocumentoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetalleDocumentoBusqueda")) {
				this.jButtonidTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetalleDocumentoUpdate")) {
				this.jButtonid_empresaTipoDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetalleDocumentoBusqueda")) {
				this.jButtonid_empresaTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetalleDocumentoBusqueda")) {
				this.jButtoncodigoTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetalleDocumentoBusqueda")) {
				this.jButtonnombreTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDetalleDocumento")) {
				this.jButtonBusquedaPorCodigoTipoDetalleDocumentoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDetalleDocumento")) {
				this.jButtonBusquedaPorNombreTipoDetalleDocumentoActionPerformed(evt);
			}
			
			;
			
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDetalleDocumento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDetalleDocumento tipodetalledocumentoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodetalledocumentoLocal=this.tipodetalledocumento;
			} else {
				tipodetalledocumentoLocal=this.tipodetalledocumentoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
							
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
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
			
			


			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
								
						
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
								
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
							
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
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
			
			


			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
								
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDetalleDocumento")) {
					jCheckBoxSeleccionarTodosTipoDetalleDocumentoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDetalleDocumento")) {
					jCheckBoxSeleccionadosTipoDetalleDocumentoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDetalleDocumento")) {
					
				}
				
				


				
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
												
				
				


				
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
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
			
			


			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetalledocumento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetalledocumento);
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
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
				
				


				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetalleDocumento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetalleDocumento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetalleDocumentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetalledocumentoAnterior =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDetalleDocumento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDetalleDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDetalleDocumento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodetalledocumento =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodetalledocumento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDetalleDocumento")) {
				
				}
				
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDetalleDocumento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDetalleDocumento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDetalleDocumento")) {
			
			}
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDetalleDocumento();
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDetalleDocumento")) {
				jButtonDuplicarTipoDetalleDocumentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDetalleDocumento")) {
				jButtonCopiarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDetalleDocumento")) {
				jButtonVerFormTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDetalleDocumento")) {
				jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDetalleDocumento")) {
				jButtonModificarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDetalleDocumento")) {
				jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDetalleDocumento")) {
				jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDetalleDocumento")) {
				jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDetalleDocumento")) {
				jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDetalleDocumento")) {
				jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetalleDocumento")) {
				jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDetalleDocumento")) {
				jButtonAbrirOrderByTipoDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDetalleDocumento")) {
				jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDetalleDocumento")) {
				jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDetalleDocumento")) {
				jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetalleDocumentoBusqueda")) {
				this.jButtonidTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetalleDocumentoUpdate")) {
				this.jButtonid_empresaTipoDetalleDocumentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetalleDocumentoBusqueda")) {
				this.jButtonid_empresaTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetalleDocumentoBusqueda")) {
				this.jButtoncodigoTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetalleDocumentoBusqueda")) {
				this.jButtonnombreTipoDetalleDocumentoBusquedaActionPerformed(evt);
			}
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDetalleDocumento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDetalleDocumento")) {
				closingInternalFrameTipoDetalleDocumento();
				
			} else if(sTipo.equals("jButtonCancelarTipoDetalleDocumento")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDetalleDocumento = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDetalleDocumentoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetalleDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetalleDocumento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDetalleDocumentoActionPerformed(null);
			}
			
			TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetalledocumento,new Object(),this.tipodetalledocumentoParameterGeneral,this.tipodetalledocumentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDetalleDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDetalleDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDetalleDocumento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodetalledocumento)) {
			if(!esControlTabla) {
				if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);			
				}
				
				if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.procesarEventosTipoDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this.tipodetalledocumento,this.tipodetalledocumentoParameterGeneral,this.isEsNuevoTipoDetalleDocumento,classes);//this.tipodetalledocumentoLogic.getTipoDetalleDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral,this.tipodetalledocumentoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetalleDocumento(classes,this.tipodetalledocumentoReturnGeneral,this.tipodetalledocumentoBean,false);
					}
						
					if(this.tipodetalledocumentoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento());	
					}
						
					if(this.tipodetalledocumentoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento(),classes);//this.tipodetalledocumentoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDetalleDocumento(this.tipodetalledocumento,classes);//this.tipodetalledocumentoBean);									
				}
			
				if(TipoDetalleDocumentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDetalleDocumento(this.tipodetalledocumento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetalleDocumento(this.tipodetalledocumento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodetalledocumentoAnterior!=null) {
						this.tipodetalledocumento=this.tipodetalledocumentoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.procesarEventosTipoDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this.tipodetalledocumento,this.tipodetalledocumentoParameterGeneral,this.isEsNuevoTipoDetalleDocumento,classes);//this.tipodetalledocumentoLogic.getTipoDetalleDocumento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento(),tipodetalledocumentoLogic.getTipoDetalleDocumentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento(),this.tipodetalledocumentos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDetalleDocumento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDetalleDocumento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDetalleDocumento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDetalleDocumento() throws Exception {
		
		TipoDetalleDocumentoModel tipodetalledocumentoModel=(TipoDetalleDocumentoModel)this.jTableDatosTipoDetalleDocumento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetalledocumentoModel.tipodetalledocumentos=this.tipodetalledocumentoLogic.getTipoDetalleDocumentos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodetalledocumentoModel.tipodetalledocumentos=this.tipodetalledocumentos;
		}
		
		
		((TipoDetalleDocumentoModel) this.jTableDatosTipoDetalleDocumento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDetalleDocumento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodetalledocumentoAnterior(),this.tipodetalledocumentoLogic.getTipoDetalleDocumentos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodetalledocumentoAnterior(),this.tipodetalledocumentos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDetalleDocumento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleDocumento.class)) {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.setDetalleDocumentos(tipodetalledocumento.getDetalleDocumentos());
					this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleDocumento(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
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
										
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetalledocumento,new Object(),generalEntityParameterGeneral,this.tipodetalledocumentoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDetalleDocumentoConstantesFunciones.getClassesRelationshipsOfTipoDetalleDocumento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDetalleDocumentoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDetalleDocumento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDetalleDocumento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetalledocumento,new Object(),generalEntityParameterGeneral,this.tipodetalledocumentoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDetalleDocumento(TipoDetalleDocumentoBean tipodetalledocumentoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleDocumento.class)) {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.setDetalleDocumentos(tipodetalledocumento.getDetalleDocumentos());
					this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleDocumento(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetalleDocumento(ArrayList<Classe> classes,TipoDetalleDocumentoReturnGeneral tipodetalledocumentoReturnGeneral,TipoDetalleDocumentoBean tipodetalledocumentoBean,Boolean conDefault) throws Exception {
		
			this.tipodetalledocumentoBean.setDetalleDocumentos(tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento().getDetalleDocumentos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleDocumento.class)) {
					tipodetalledocumento.setDetalleDocumentos(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoBeanSwingJInternalFrame.detalledocumentoLogic.getDetalleDocumentos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipodetalledocumento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento = new TipoDetalleDocumentoDetalleFormJInternalFrame(jDesktopPane,this.tipodetalledocumentoSessionBean.getConGuardarRelaciones(),this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.setVisible(false);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.tipodetalledocumentoLogic=this.tipodetalledocumentoLogic;
		
		this.cargarCombosFrameForeignKeyTipoDetalleDocumento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetalleDocumento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetalleDocumento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDetalleDocumento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDetalleDocumento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetalleDocumento"));
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarTipoDetalleDocumento"));

		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetalleDocumento"));
					
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemModificarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetalleDocumento"));
						
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemActualizarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarTipoDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetalleDocumento"));
								
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemEliminarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarTipoDetalleDocumento"));
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetalleDocumento"));
					
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemCancelarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetalleDocumento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemDetalleCerrarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetalleDocumento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleDocumento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleDocumento"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetalleDocumento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonidTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtoncodigoTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonnombreTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleDocumentoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetalleDocumento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDetalleDocumento"));
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetalleDocumento"));
		}
		
		this.jTableDatosTipoDetalleDocumento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDetalleDocumento"));
		
		this.jTableDatosTipoDetalleDocumento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDetalleDocumento"));
		
		this.jButtonNuevoTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoTipoDetalleDocumento"));
		
		this.jButtonDuplicarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"DuplicarTipoDetalleDocumento"));
		
		this.jButtonCopiarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"CopiarTipoDetalleDocumento"));
		
		this.jButtonVerFormTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"VerFormTipoDetalleDocumento"));
		
		
		this.jButtonNuevoToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDetalleDocumento"));
			
		this.jButtonDuplicarToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDetalleDocumento"));
			
		this.jMenuItemNuevoTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDetalleDocumento"));
			
		this.jMenuItemDuplicarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDetalleDocumento"));		
		
		
		this.jButtonNuevoRelacionesTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDetalleDocumento"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDetalleDocumento"));
			
		this.jMenuItemNuevoRelacionesTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDetalleDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarTipoDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonModificarToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetalleDocumento"));
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemModificarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonActualizarToolBarTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetalleDocumento"));
				
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemActualizarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarTipoDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonEliminarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetalleDocumento"));
						
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemEliminarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarTipoDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonCancelarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetalleDocumento"));
			
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemCancelarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetalleDocumento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDetalleDocumento"));		
		
		
		this.jButtonCerrarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarTipoDetalleDocumento"));
		
		
		this.jButtonCerrarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDetalleDocumento"));
			
		this.jMenuItemCerrarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDetalleDocumento"));
			
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jMenuItemDetalleCerrarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetalleDocumento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDetalleDocumento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetalleDocumento"));
		}
		
		this.jButtonCopiarToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDetalleDocumento"));
			
		this.jButtonVerFormToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDetalleDocumento"));
		
		this.jMenuItemGuardarCambiosTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDetalleDocumento"));
			
		this.jMenuItemCopiarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDetalleDocumento"));		
		
		this.jMenuItemVerFormTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDetalleDocumento"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetalleDocumento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDetalleDocumento"));
			
		this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetalleDocumento"));		
		
		
		
		this.jButtonRecargarInformacionTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDetalleDocumento"));
					
		this.jButtonRecargarInformacionToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDetalleDocumento"));
		
		this.jMenuItemRecargarInformacionTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDetalleDocumento"));		
		
		
		
		this.jButtonAnterioresTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"AnterioresTipoDetalleDocumento"));
		
		
		this.jButtonAnterioresToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDetalleDocumento"));
		
		this.jMenuItemAnterioresTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDetalleDocumento"));		
		
		
		this.jButtonSiguientesTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"SiguientesTipoDetalleDocumento"));
		
		
		this.jButtonSiguientesToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDetalleDocumento"));
			
		this.jMenuItemSiguientesTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDetalleDocumento"));
			
		this.jMenuItemAbrirOrderByTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDetalleDocumento"));
			
		this.jMenuItemMostrarOcultarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDetalleDocumento"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDetalleDocumento"));
			
		this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDetalleDocumento"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDetalleDocumento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDetalleDocumento"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDetalleDocumento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDetalleDocumento"));

		this.jCheckBoxSeleccionadosTipoDetalleDocumento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDetalleDocumento"));
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetalleDocumento"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDetalleDocumento"));
			
		this.jComboBoxTiposAccionesTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDetalleDocumento"));
					
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDetalleDocumento"));
			
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDetalleDocumento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonidTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtoncodigoTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonnombreTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleDocumentoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetalleDocumento"));

			this.jButtonBusquedaPorNombreTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetalleDocumento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDetalleDocumento!=null) {
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleDocumento"));
				this.jInternalFrameReporteDinamicoTipoDetalleDocumento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleDocumento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetalleDocumento"));				
			//this.jButtonGenerarReporteDinamicoTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetalleDocumento"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetalleDocumento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDetalleDocumento!=null) {
				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetalleDocumento"));
				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetalleDocumento"));
				this.jInternalFrameImportacionTipoDetalleDocumento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetalleDocumento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDetalleDocumento"));
			
			this.jButtonAbrirOrderByToolBarTipoDetalleDocumento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDetalleDocumento"));			
			
			if(this.jInternalFrameOrderByTipoDetalleDocumento!=null) {
				this.jInternalFrameOrderByTipoDetalleDocumento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetalleDocumento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetalleDocumento.jTabbedPaneRelacionesTipoDetalleDocumento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetalleDocumento"));
		
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
            		closingInternalFrameTipoDetalleDocumento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDetalleDocumento = (JInternalFrameBase)event.getSource();
	            	
	            TipoDetalleDocumentoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetalleDocumentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetalleDocumento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDetalleDocumentoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDetalleDocumento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDetalleDocumentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDetalleDocumento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDetalleDocumento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDetalleDocumento";
		inputMap = this.jButtonNuevoTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDetalleDocumento";
		inputMap = this.jButtonNuevoRelacionesTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetalleDocumentoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDetalleDocumento";
		inputMap = this.jButtonModificarTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDetalleDocumento";
		inputMap = this.jButtonActualizarTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDetalleDocumento";
		inputMap = this.jButtonEliminarTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDetalleDocumento";
		inputMap = this.jButtonCancelarTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDetalleDocumento";
		inputMap = this.jButtonCerrarTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDetalleDocumento";
		inputMap = this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonGuardarCambiosTipoDetalleDocumento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDetalleDocumento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDetalleDocumentoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDetalleDocumento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDetalleDocumentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonidTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetalleDocumentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonid_empresaTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtoncodigoTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetalleDocumentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jButtonnombreTipoDetalleDocumentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetalleDocumentoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetalleDocumento"));

		this.jButtonBusquedaPorNombreTipoDetalleDocumento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetalleDocumento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDetalleDocumento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDetalleDocumentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDetalleDocumento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDetalleDocumento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
					tipodetalledocumentoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentos) {
					tipodetalledocumentoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDetalleDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
						tipodetalledocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentos) {
						tipodetalledocumentoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetalleDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetalleDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDetalleDocumentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDetalleDocumento.getSelectedRows();
			
			TipoDetalleDocumento tipodetalledocumentoLocal=new TipoDetalleDocumento();
			
			//this.seleccionarTodosTipoDetalleDocumento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetalledocumentoLocal =(TipoDetalleDocumento) this.tipodetalledocumentoLogic.getTipoDetalleDocumentos().toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodetalledocumentoLocal =(TipoDetalleDocumento) this.tipodetalledocumentos.toArray()[this.jTableDatosTipoDetalleDocumento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodetalledocumentoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
						tipodetalledocumentoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentos) {
						tipodetalledocumentoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetalleDocumento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetalleDocumento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetalleDocumento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDetalleDocumentoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDetalleDocumentoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDetalleDocumento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
				
						if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetalledocumentoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetalledocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentos) {
					
						if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetalledocumentoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetalledocumentoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDetalleDocumentoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDetalleDocumento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDetalleDocumento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDetalleDocumento) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDetalleDocumento(conSplash);
				
					this.generarReporteTipoDetalleDocumentosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDetalleDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetalleDocumentosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetalleDocumentosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetalleDocumento();
				
				this.exportarTipoDetalleDocumentosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDetalleDocumentos();
				//this.importarTipoDetalleDocumentos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetalleDocumento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDetalleDocumentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDetalleDocumento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDetalleDocumento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDetalleDocumento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDetalleDocumentoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDetalleDocumento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDetalleDocumento(conSplash);
					
						//this.actualizarParametrosGeneralTipoDetalleDocumento();
						
						this.generarReporteProcesoAccionTipoDetalleDocumentosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Detalle DocumentoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Detalle Documento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDetalleDocumento();
				
						this.actualizarParametrosGeneralTipoDetalleDocumento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodetalledocumentoReturnGeneral=tipodetalledocumentoLogic.procesarAccionTipoDetalleDocumentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodetalledocumentoLogic.getTipoDetalleDocumentos(),this.tipodetalledocumentoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDetalleDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDetalleDocumento();
					
					TipoDetalleDocumentoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDetalleDocumentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetalleDocumento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDetalleDocumento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDetalleDocumentoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDetalleDocumento();
			
			if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
			TipoDetalleDocumento tipodetalledocumento=new TipoDetalleDocumento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDetalleDocumento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDetalleDocumento.getSelectedItem();
			
			
			
			
			tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodetalledocumentosSeleccionados.size()==1) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
					tipodetalledocumento=tipodetalledocumentoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Documento")) {
					jButtonDetalleDocumentoActionPerformed(null,rowIndex,true,false,tipodetalledocumento);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDetalleDocumento();
			
      		//this.finishProcessTipoDetalleDocumento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDetalleDocumentoReturnGeneral() throws Exception {
		if(this.tipodetalledocumentoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodetalledocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodetalledocumentoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodetalledocumentoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodetalledocumentoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodetalledocumentoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
		}
		
		if(this.tipodetalledocumentoReturnGeneral.getConRetornoLista() || this.tipodetalledocumentoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodetalledocumentoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetalledocumentoLogic.setTipoDetalleDocumentos(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumentos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodetalledocumentoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetalledocumentoLogic.setTipoDetalleDocumento(this.tipodetalledocumentoReturnGeneral.getTipoDetalleDocumento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDetalleDocumento(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDetalleDocumento() throws Exception {
		
		
	}
	
	public ArrayList<TipoDetalleDocumento> getTipoDetalleDocumentosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDetalleDocumento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentoLogic.getTipoDetalleDocumentos()) {
					if(tipodetalledocumentoAux.getIsSelected()) {
						tipodetalledocumentosSeleccionados.add(tipodetalledocumentoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetalleDocumento tipodetalledocumentoAux:this.tipodetalledocumentos) {
					if(tipodetalledocumentoAux.getIsSelected()) {
						tipodetalledocumentosSeleccionados.add(tipodetalledocumentoAux);				
					}
				}
			}
			
			if(tipodetalledocumentosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodetalledocumentosSeleccionados.addAll(this.tipodetalledocumentoLogic.getTipoDetalleDocumentos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodetalledocumentosSeleccionados.addAll(this.tipodetalledocumentos);				
					}
				}
			}
		} else {
			tipodetalledocumentosSeleccionados.add(this.tipodetalledocumento);
		}
		
		return tipodetalledocumentosSeleccionados;
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
	
	public void generarReporteTipoDetalleDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetalleDocumentosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetalleDocumentosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDetalleDocumentosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Detalle Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDetalleDocumentosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDetalleDocumento();
		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDetalleDocumento();
		
		
		//this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados ,tipodetalledocumentoImplementable,tipodetalledocumentoImplementableHome);
	}
	
	public void mostrarImportacionTipoDetalleDocumentos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDetalleDocumento();
		
		this.abrirFrameImportacionTipoDetalleDocumento();		
		
			
		//this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados ,tipodetalledocumentoImplementable,tipodetalledocumentoImplementableHome);
	}
	
	public void importarTipoDetalleDocumentos() throws Exception {		
	
	}
	
	public void exportarTipoDetalleDocumentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDetalleDocumentosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDetalleDocumentosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDetalleDocumentosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Detalle Documento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDetalleDocumento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDetalleDocumento(tipodetalledocumentoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodetalledocumentoAux.setsDetalleGeneralEntityReporte(tipodetalledocumentoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDetalleDocumento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDetalleDocumentoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleDocumentoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodetalledocumento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetalledocumento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetalledocumento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetalledocumento.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetalledocumento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDetalleDocumentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDetalleDocumento(row);				
				iRow++;
			}				
			
			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDetalleDocumento(tipodetalledocumentoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDetalleDocumentosSeleccionados() throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();		
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetalledocumento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodetalledocumentos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodetalledocumento");
			//elementRoot.appendChild(element);
		
			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
				element = document.createElement("tipodetalledocumento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDetalleDocumento(tipodetalledocumentoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Documento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDetalleDocumento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetalledocumento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetalledocumento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetalledocumento.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetalledocumento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDetalleDocumento(TipoDetalleDocumento tipodetalledocumento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDetalleDocumentoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodetalledocumento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDetalleDocumentoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodetalledocumento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDetalleDocumentoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodetalledocumento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDetalleDocumentoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodetalledocumento.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDetalleDocumentoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodetalledocumento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDetalleDocumentosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados=new ArrayList<TipoDetalleDocumento>();
		
		tipodetalledocumentosSeleccionados=this.getTipoDetalleDocumentosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDetalleDocumento(tipodetalledocumentosSeleccionados);
		
		this.generarReporteTipoDetalleDocumentos("Todos",tipodetalledocumentosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDetalleDocumento(ArrayList<TipoDetalleDocumento> tipodetalledocumentosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDetalleDocumento tipodetalledocumentoAux:tipodetalledocumentosSeleccionados) {
				tipodetalledocumentoAux.setsDetalleGeneralEntityReporte(tipodetalledocumentoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodetalledocumentoAux.setsDescripcionGeneralEntityReporte1(tipodetalledocumentoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodetalledocumentoAux.setsDescripcionGeneralEntityReporte1(tipodetalledocumentoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodetalledocumentoAux.setsDescripcionGeneralEntityReporte1(tipodetalledocumentoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetalleDocumentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDetalleDocumento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDetalleDocumento=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=true;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
			this.isVisibilidadCeldaModificarTipoDetalleDocumento=true;
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaCancelarTipoDetalleDocumento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetalleDocumento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=true;
		} else {
			this.actualizarEstadoPanelsTipoDetalleDocumento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDetalleDocumento=false;
			//this.isVisibilidadCeldaVerFormTipoDetalleDocumento=false;
			this.isVisibilidadCeldaDuplicarTipoDetalleDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;												
			}
			
			this.jButtonCerrarTipoDetalleDocumento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetalleDocumento=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodetalledocumento)) {
			this.isVisibilidadCeldaActualizarTipoDetalleDocumento=false;
			this.isVisibilidadCeldaEliminarTipoDetalleDocumento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetalleDocumento() {
		this.isVisibilidadCeldaNuevoTipoDetalleDocumento=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDetalleDocumento=false;
	}
	
	public void actualizarEstadoPanelsTipoDetalleDocumento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosEdicionTipoDetalleDocumento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetalleDocumento!=null) {
				this.jScrollPanelDatosTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetalleDocumento!=null) {
				this.jPanelPaginacionTipoDetalleDocumento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
					this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetalleDocumento!=null) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDetalleDocumento!=null) {
				this.jPanelParametrosReportesTipoDetalleDocumento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDetalleDocumento.remove(jPanelBusquedaPorCodigoTipoDetalleDocumento);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDetalleDocumento.remove(jPanelBusquedaPorNombreTipoDetalleDocumento);}
		}
		
	}
	
	

	public String registrarSesionTipoDetalleDocumentoParaDetalleDocumentos() throws Exception {
		Boolean isPaginaPopupDetalleDocumento=false;

		try {

			if(this.tipodetalledocumentoSessionBean==null) {
				this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setsPathNavegacionActual(tipodetalledocumentoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleDocumento=this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleDocumento(true);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleDocumento(TipoDetalleDocumentoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDetalleDocumento(true);
			this.jInternalFrameDetalleFormTipoDetalleDocumento.detalledocumentoSessionBean.setlidTipoDetalleDocumentoActual(this.idTipoDetalleDocumentoActual);

			tipodetalledocumentoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDetalleDocumento(true);
			tipodetalledocumentoSessionBean.setlIdTipoDetalleDocumentoActualForeignKey(this.idTipoDetalleDocumentoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		
		if(this.tipodetalledocumentoSessionBean==null) {
			this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		}
		
		this.tipodetalledocumentoSessionBean.setsUltimaBusquedaTipoDetalleDocumento(this.getsAccionBusqueda());
		this.tipodetalledocumentoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodetalledocumentoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodetalledocumentoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodetalledocumentoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodetalledocumentoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		
		if(this.tipodetalledocumentoSessionBean==null) {
			this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		}
		
		if(this.tipodetalledocumentoSessionBean.getsUltimaBusquedaTipoDetalleDocumento()!=null&&!this.tipodetalledocumentoSessionBean.getsUltimaBusquedaTipoDetalleDocumento().equals("")) {
			this.setsAccionBusqueda(tipodetalledocumentoSessionBean.getsUltimaBusquedaTipoDetalleDocumento());
			this.setiNumeroPaginacion(tipodetalledocumentoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodetalledocumentoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodetalledocumentoSessionBean.getcodigo());
				tipodetalledocumentoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodetalledocumentoSessionBean.getnombre());
				tipodetalledocumentoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodetalledocumentoSessionBean.getid_empresa());
				tipodetalledocumentoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodetalledocumentoSessionBean.setsUltimaBusquedaTipoDetalleDocumento("");
		this.tipodetalledocumentoSessionBean.setiNumeroPaginacion(TipoDetalleDocumentoConstantesFunciones.INUMEROPAGINACION);
		this.tipodetalledocumentoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDetalleDocumento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDetalleDocumento() {
		this.updateBorderResaltarBusquedasFormularioTipoDetalleDocumento();
		this.updateVisibilidadBusquedasFormularioTipoDetalleDocumento();
		this.updateHabilitarBusquedasFormularioTipoDetalleDocumento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDetalleDocumento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponents().length>0) {
	

		if(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetalleDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetalleDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
				jPanel.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetalleDocumento);
			}
		}

		if(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDetalleDocumento!=null) {
			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetalleDocumento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
				jPanel.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDetalleDocumento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDetalleDocumento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetalleDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetalleDocumento);
			if(!this.tipodetalledocumentoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetalleDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetalleDocumento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarBusquedaPorNombreTipoDetalleDocumento);
			if(!this.tipodetalledocumentoConstantesFunciones.mostrarBusquedaPorNombreTipoDetalleDocumento && index>-1) {
				this.jTabbedPaneBusquedasTipoDetalleDocumento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDetalleDocumento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetalleDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarBusquedaPorCodigoTipoDetalleDocumento);
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setEnabledAt(index,this.tipodetalledocumentoConstantesFunciones.activarBusquedaPorCodigoTipoDetalleDocumento);
			}

			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetalleDocumento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarBusquedaPorNombreTipoDetalleDocumento);
				this.jTabbedPaneBusquedasTipoDetalleDocumento.setEnabledAt(index,this.tipodetalledocumentoConstantesFunciones.activarBusquedaPorNombreTipoDetalleDocumento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDetalleDocumento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetalleDocumento);

			this.jTabbedPaneBusquedasTipoDetalleDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);

			this.tipodetalledocumentoConstantesFunciones.setResaltarBusquedaPorCodigoTipoDetalleDocumento(resaltar);

			jPanel.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetalleDocumento);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDetalleDocumento.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetalleDocumento);

			this.jTabbedPaneBusquedasTipoDetalleDocumento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetalleDocumento.getComponent(index);

			this.tipodetalledocumentoConstantesFunciones.setResaltarBusquedaPorNombreTipoDetalleDocumento(resaltar);

			jPanel.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarBusquedaPorNombreTipoDetalleDocumento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDetalleDocumento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDetalleDocumento() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDetalleDocumento();
		this.updateVisibilidadResaltarControlesFormularioTipoDetalleDocumento();
		this.updateHabilitarResaltarControlesFormularioTipoDetalleDocumento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDetalleDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodetalledocumentoConstantesFunciones.resaltaridTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltaridTipoDetalleDocumento);}
		if(this.tipodetalledocumentoConstantesFunciones.resaltarid_empresaTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarid_empresaTipoDetalleDocumento);}
		if(this.tipodetalledocumentoConstantesFunciones.resaltarcodigoTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarcodigoTipoDetalleDocumento);}
		if(this.tipodetalledocumentoConstantesFunciones.resaltarnombreTipoDetalleDocumento!=null && this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setBorder(this.tipodetalledocumentoConstantesFunciones.resaltarnombreTipoDetalleDocumento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDetalleDocumento() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
	
		//this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostraridTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelidTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostraridTipoDetalleDocumento);
		//this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarid_empresaTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelid_empresaTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarid_empresaTipoDetalleDocumento);
		//this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarcodigoTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelcodigoTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarcodigoTipoDetalleDocumento);
		//this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarnombreTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jPanelnombreTipoDetalleDocumento.setVisible(this.tipodetalledocumentoConstantesFunciones.mostrarnombreTipoDetalleDocumento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDetalleDocumento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetalleDocumento!=null) {
	
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jLabelidTipoDetalleDocumento.setEnabled(this.tipodetalledocumentoConstantesFunciones.activaridTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jComboBoxid_empresaTipoDetalleDocumento.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarid_empresaTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextFieldcodigoTipoDetalleDocumento.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarcodigoTipoDetalleDocumento);
		this.jInternalFrameDetalleFormTipoDetalleDocumento.jTextAreanombreTipoDetalleDocumento.setEnabled(this.tipodetalledocumentoConstantesFunciones.activarnombreTipoDetalleDocumento);
		}
	}
	
		
}