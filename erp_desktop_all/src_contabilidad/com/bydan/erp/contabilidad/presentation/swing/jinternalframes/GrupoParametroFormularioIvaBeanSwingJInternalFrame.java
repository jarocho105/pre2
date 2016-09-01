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

import com.bydan.erp.contabilidad.util.GrupoParametroFormularioIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.GrupoParametroFormularioIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.GrupoParametroFormularioIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.GrupoParametroFormularioIvaBean;
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
public class GrupoParametroFormularioIvaBeanSwingJInternalFrame extends GrupoParametroFormularioIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GrupoParametroFormularioIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GrupoParametroFormularioIva> grupoparametroformularioivaValidator = new ClassValidator<GrupoParametroFormularioIva>(GrupoParametroFormularioIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GrupoParametroFormularioIva grupoparametroformularioiva;	
	public GrupoParametroFormularioIva grupoparametroformularioivaAux;
	public GrupoParametroFormularioIva grupoparametroformularioivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GrupoParametroFormularioIva grupoparametroformularioivaTotales;
	public Long idGrupoParametroFormularioIvaActual;
	public Long iIdNuevoGrupoParametroFormularioIva=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosParametroFormularioIva=false;

	public Boolean getIsTienePermisosParametroFormularioIva() {
		return isTienePermisosParametroFormularioIva;
	}

	public void setIsTienePermisosParametroFormularioIva(Boolean isTienePermisosParametroFormularioIva) {
		this.isTienePermisosParametroFormularioIva= isTienePermisosParametroFormularioIva;
	}


	public Boolean isTienePermisosFormularioIva=false;

	public Boolean getIsTienePermisosFormularioIva() {
		return isTienePermisosFormularioIva;
	}

	public void setIsTienePermisosFormularioIva(Boolean isTienePermisosFormularioIva) {
		this.isTienePermisosFormularioIva= isTienePermisosFormularioIva;
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
	
	public Boolean isPermisoTodoGrupoParametroFormularioIva;
	public Boolean isPermisoNuevoGrupoParametroFormularioIva;
	public Boolean isPermisoActualizarGrupoParametroFormularioIva;
	public Boolean isPermisoActualizarOriginalGrupoParametroFormularioIva;
	public Boolean isPermisoEliminarGrupoParametroFormularioIva;
	public Boolean isPermisoGuardarCambiosGrupoParametroFormularioIva;
	public Boolean isPermisoConsultaGrupoParametroFormularioIva;
	public Boolean isPermisoBusquedaGrupoParametroFormularioIva;
	public Boolean isPermisoReporteGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionMedioGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionAltoGrupoParametroFormularioIva;
	public Boolean isPermisoPaginacionTodoGrupoParametroFormularioIva;
	public Boolean isPermisoCopiarGrupoParametroFormularioIva;
	public Boolean isPermisoVerFormGrupoParametroFormularioIva;
	public Boolean isPermisoDuplicarGrupoParametroFormularioIva;
	public Boolean isPermisoOrdenGrupoParametroFormularioIva;
	
	
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
	
	public GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaReturnGeneral;
	public GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaParameterGeneral;
	
	

	public ParametroFormularioIvaLogic parametroformularioivaLogic=null;

	public ParametroFormularioIvaLogic getParametroFormularioIvaLogic() {
		return parametroformularioivaLogic;
	}

	public void setParametroFormularioIvaLogic(ParametroFormularioIvaLogic parametroformularioivaLogic) {
		this.parametroformularioivaLogic = parametroformularioivaLogic;
	}


	public FormularioIvaLogic formularioivaLogic=null;

	public FormularioIvaLogic getFormularioIvaLogic() {
		return formularioivaLogic;
	}

	public void setFormularioIvaLogic(FormularioIvaLogic formularioivaLogic) {
		this.formularioivaLogic = formularioivaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGrupoParametroFormularioIva=false;
	public Boolean esParaAccionDesdeFormularioGrupoParametroFormularioIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GrupoParametroFormularioIva grupoparametroformularioivaBean;
	public GrupoParametroFormularioIvaConstantesFunciones grupoparametroformularioivaConstantesFunciones;
	//public GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<GrupoParametroFormularioIva> grupoparametroformularioivas;	
	//public List<GrupoParametroFormularioIva> grupoparametroformularioivasEliminados;
	//public List<GrupoParametroFormularioIva> grupoparametroformularioivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaDuplicarGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaCopiarGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaVerFormGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaOrdenGrupoParametroFormularioIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaCancelarGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoGrupoParametroFormularioIva() {
		return this.iIdNuevoGrupoParametroFormularioIva;
	}

	public void setiIdNuevoGrupoParametroFormularioIva(Long iIdNuevoGrupoParametroFormularioIva) {
		this.iIdNuevoGrupoParametroFormularioIva = iIdNuevoGrupoParametroFormularioIva;
	}
	
	public Long getidGrupoParametroFormularioIvaActual() {
		return this.idGrupoParametroFormularioIvaActual;
	}

	public void setidGrupoParametroFormularioIvaActual(Long idGrupoParametroFormularioIvaActual) {
		this.idGrupoParametroFormularioIvaActual = idGrupoParametroFormularioIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GrupoParametroFormularioIva getgrupoparametroformularioiva() {
		return this.grupoparametroformularioiva;
	}

	public void setgrupoparametroformularioiva(GrupoParametroFormularioIva grupoparametroformularioiva) {
		this.grupoparametroformularioiva = grupoparametroformularioiva;
	}
	
	public GrupoParametroFormularioIva getgrupoparametroformularioivaAux() {
		return this.grupoparametroformularioivaAux;
	}

	public void setgrupoparametroformularioivaAux(GrupoParametroFormularioIva grupoparametroformularioivaAux) {
		this.grupoparametroformularioivaAux = grupoparametroformularioivaAux;
	}				
	
	public GrupoParametroFormularioIva getgrupoparametroformularioivaAnterior() {
		return this.grupoparametroformularioivaAnterior;
	}

	public void setgrupoparametroformularioivaAnterior(GrupoParametroFormularioIva grupoparametroformularioivaAnterior) {
		this.grupoparametroformularioivaAnterior = grupoparametroformularioivaAnterior;
	}	
	
	public GrupoParametroFormularioIva getgrupoparametroformularioivaTotales() {
		return this.grupoparametroformularioivaTotales;
	}

	public void setgrupoparametroformularioivaTotales(GrupoParametroFormularioIva grupoparametroformularioivaTotales) {
		this.grupoparametroformularioivaTotales = grupoparametroformularioivaTotales;
	}	
	
	public GrupoParametroFormularioIva getgrupoparametroformularioivaBean() {
		return this.grupoparametroformularioivaBean;
	}

	public void setgrupoparametroformularioivaBean(GrupoParametroFormularioIva grupoparametroformularioivaBean) {
		this.grupoparametroformularioivaBean = grupoparametroformularioivaBean;
	}	
	
	public GrupoParametroFormularioIvaParameterReturnGeneral getgrupoparametroformularioivaReturnGeneral() {
		return this.grupoparametroformularioivaReturnGeneral;
	}

	public void setgrupoparametroformularioivaReturnGeneral(GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaReturnGeneral) {
		this.grupoparametroformularioivaReturnGeneral = grupoparametroformularioivaReturnGeneral;
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
	
	
	public GrupoParametroFormularioIvaLogic getGrupoParametroFormularioIvaLogic()	{		
		return grupoparametroformularioivaLogic;
	}

	public void setGrupoParametroFormularioIvaLogic(GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic) {
		this.grupoparametroformularioivaLogic = grupoparametroformularioivaLogic;
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
	
	public Boolean getIsEsNuevoGrupoParametroFormularioIva() {
		return isEsNuevoGrupoParametroFormularioIva;
	}

	public void setIsEsNuevoGrupoParametroFormularioIva(Boolean isEsNuevoGrupoParametroFormularioIva) {
		this.isEsNuevoGrupoParametroFormularioIva = isEsNuevoGrupoParametroFormularioIva;
	}

	public Boolean getEsParaAccionDesdeFormularioGrupoParametroFormularioIva() {
		return esParaAccionDesdeFormularioGrupoParametroFormularioIva;
	}
	
	public void setEsParaAccionDesdeFormularioGrupoParametroFormularioIva(Boolean esParaAccionDesdeFormularioGrupoParametroFormularioIva) {
		this.esParaAccionDesdeFormularioGrupoParametroFormularioIva = esParaAccionDesdeFormularioGrupoParametroFormularioIva;
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

			if(this.grupoparametroformularioivaSessionBean==null) {
				this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
			}

			if(!this.grupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(grupoparametroformularioivaSessionBean.getlidEmpresaActual());
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

					if(this.grupoparametroformularioiva!=null) {
						this.grupoparametroformularioiva.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGrupoParametroFormularioIvaGenerico)throws Exception
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
				jComboBoxid_empresaGrupoParametroFormularioIvaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGrupoParametroFormularioIvaGenerico!=null && jComboBoxid_empresaGrupoParametroFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_empresaGrupoParametroFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GrupoParametroFormularioIva grupoparametroformularioiva,JComboBox jComboBoxid_empresaGrupoParametroFormularioIvaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGrupoParametroFormularioIvaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGrupoParametroFormularioIvaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				grupoparametroformularioiva.setid_empresa(empresaAux.getId());
				grupoparametroformularioiva.setempresa_descripcion(GrupoParametroFormularioIvaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				grupoparametroformularioiva.setEmpresa(empresaAux);			}
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

					if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { 
							this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { 
					}

					if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
							this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
							this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesGrupoParametroFormularioIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GrupoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GrupoParametroFormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva(this.grupoparametroformularioivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(this.grupoparametroformularioivas);
			grupoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GrupoParametroFormularioIvaParameterReturnGeneral getGrupoParametroFormularioIvaParameterGeneral() {
		return this.grupoparametroformularioivaParameterGeneral;
	}
	
	public void setGrupoParametroFormularioIvaParameterGeneral(GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaParameterGeneral) {
		this.grupoparametroformularioivaParameterGeneral = grupoparametroformularioivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGrupoParametroFormularioIva() {
		return isPermisoTodoGrupoParametroFormularioIva;
	}

	public void setIsPermisoTodoGrupoParametroFormularioIva(Boolean isPermisoTodoGrupoParametroFormularioIva) {
		this.isPermisoTodoGrupoParametroFormularioIva = isPermisoTodoGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoNuevoGrupoParametroFormularioIva() {
		return isPermisoNuevoGrupoParametroFormularioIva;
	}

	public void setIsPermisoNuevoGrupoParametroFormularioIva(Boolean isPermisoNuevoGrupoParametroFormularioIva) {
		this.isPermisoNuevoGrupoParametroFormularioIva = isPermisoNuevoGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoActualizarGrupoParametroFormularioIva() {
		return isPermisoActualizarGrupoParametroFormularioIva;
	}

	public void setIsPermisoActualizarGrupoParametroFormularioIva(Boolean isPermisoActualizarGrupoParametroFormularioIva) {
		this.isPermisoActualizarGrupoParametroFormularioIva = isPermisoActualizarGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoEliminarGrupoParametroFormularioIva() {
		return isPermisoEliminarGrupoParametroFormularioIva;
	}

	public void setIsPermisoEliminarGrupoParametroFormularioIva(Boolean isPermisoEliminarGrupoParametroFormularioIva) {
		this.isPermisoEliminarGrupoParametroFormularioIva = isPermisoEliminarGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoGuardarCambiosGrupoParametroFormularioIva() {
		return isPermisoGuardarCambiosGrupoParametroFormularioIva;
	}

	public void setIsPermisoGuardarCambiosGrupoParametroFormularioIva(Boolean isPermisoGuardarCambiosGrupoParametroFormularioIva) {
		this.isPermisoGuardarCambiosGrupoParametroFormularioIva = isPermisoGuardarCambiosGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoConsultaGrupoParametroFormularioIva() {
		return isPermisoConsultaGrupoParametroFormularioIva;
	}

	public void setIsPermisoConsultaGrupoParametroFormularioIva(Boolean isPermisoConsultaGrupoParametroFormularioIva) {
		this.isPermisoConsultaGrupoParametroFormularioIva = isPermisoConsultaGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoBusquedaGrupoParametroFormularioIva() {
		return isPermisoBusquedaGrupoParametroFormularioIva;
	}

	public void setIsPermisoBusquedaGrupoParametroFormularioIva(Boolean isPermisoBusquedaGrupoParametroFormularioIva) {
		this.isPermisoBusquedaGrupoParametroFormularioIva = isPermisoBusquedaGrupoParametroFormularioIva;
	}

	public Boolean getIsPermisoReporteGrupoParametroFormularioIva() {
		return isPermisoReporteGrupoParametroFormularioIva;
	}

	public void setIsPermisoReporteGrupoParametroFormularioIva(Boolean isPermisoReporteGrupoParametroFormularioIva) {
		this.isPermisoReporteGrupoParametroFormularioIva = isPermisoReporteGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioGrupoParametroFormularioIva() {
		return isPermisoPaginacionMedioGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionMedioGrupoParametroFormularioIva(Boolean isPermisoPaginacionMedioGrupoParametroFormularioIva) {
		this.isPermisoPaginacionMedioGrupoParametroFormularioIva = isPermisoPaginacionMedioGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoGrupoParametroFormularioIva() {
		return isPermisoPaginacionTodoGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionTodoGrupoParametroFormularioIva(Boolean isPermisoPaginacionTodoGrupoParametroFormularioIva) {
		this.isPermisoPaginacionTodoGrupoParametroFormularioIva = isPermisoPaginacionTodoGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoGrupoParametroFormularioIva() {
		return isPermisoPaginacionAltoGrupoParametroFormularioIva;
	}

	public void setIsPermisoPaginacionAltoGrupoParametroFormularioIva(Boolean isPermisoPaginacionAltoGrupoParametroFormularioIva) {
		this.isPermisoPaginacionAltoGrupoParametroFormularioIva = isPermisoPaginacionAltoGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoCopiarGrupoParametroFormularioIva() {
		return isPermisoCopiarGrupoParametroFormularioIva;
	}

	public void setIsPermisoCopiarGrupoParametroFormularioIva(Boolean isPermisoCopiarGrupoParametroFormularioIva) {
		this.isPermisoCopiarGrupoParametroFormularioIva = isPermisoCopiarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoVerFormGrupoParametroFormularioIva() {
		return isPermisoVerFormGrupoParametroFormularioIva;
	}

	public void setIsPermisoVerFormGrupoParametroFormularioIva(Boolean isPermisoVerFormGrupoParametroFormularioIva) {
		this.isPermisoVerFormGrupoParametroFormularioIva = isPermisoVerFormGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoDuplicarGrupoParametroFormularioIva() {
		return isPermisoDuplicarGrupoParametroFormularioIva;
	}

	public void setIsPermisoDuplicarGrupoParametroFormularioIva(Boolean isPermisoDuplicarGrupoParametroFormularioIva) {
		this.isPermisoDuplicarGrupoParametroFormularioIva = isPermisoDuplicarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsPermisoOrdenGrupoParametroFormularioIva() {
		return isPermisoOrdenGrupoParametroFormularioIva;
	}

	public void setIsPermisoOrdenGrupoParametroFormularioIva(Boolean isPermisoOrdenGrupoParametroFormularioIva) {
		this.isPermisoOrdenGrupoParametroFormularioIva = isPermisoOrdenGrupoParametroFormularioIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGrupoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoGrupoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva = isVisibilidadCeldaNuevoGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaDuplicarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaDuplicarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaDuplicarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva = isVisibilidadCeldaDuplicarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaCopiarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCopiarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaCopiarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva = isVisibilidadCeldaCopiarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGrupoParametroFormularioIva() {
		return isVisibilidadCeldaVerFormGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaVerFormGrupoParametroFormularioIva(Boolean isVisibilidadCeldaVerFormGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva = isVisibilidadCeldaVerFormGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGrupoParametroFormularioIva() {
		return isVisibilidadCeldaOrdenGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaOrdenGrupoParametroFormularioIva(Boolean isVisibilidadCeldaOrdenGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva = isVisibilidadCeldaOrdenGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva() {
		return isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva(Boolean isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva = isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaModificarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaModificarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaModificarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaModificarGrupoParametroFormularioIva = isVisibilidadCeldaModificarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaActualizarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaActualizarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaActualizarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva = isVisibilidadCeldaActualizarGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaEliminarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaEliminarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaEliminarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva = isVisibilidadCeldaEliminarGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaCancelarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaCancelarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaCancelarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva = isVisibilidadCeldaCancelarGrupoParametroFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarGrupoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarGrupoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva = isVisibilidadCeldaGuardarGrupoParametroFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva() {
		return isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva(Boolean isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva) {
		this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva = isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva;
	}
		
	public GrupoParametroFormularioIvaSessionBean getgrupoparametroformularioivaSessionBean() {
		return this.grupoparametroformularioivaSessionBean;
	}
	
	public void setgrupoparametroformularioivaSessionBean(GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean) {
		this.grupoparametroformularioivaSessionBean=grupoparametroformularioivaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(grupoparametroformularioiva,null);
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
	
	public void bugActualizarReferenciaActual(GrupoParametroFormularioIva grupoparametroformularioiva,GrupoParametroFormularioIva grupoparametroformularioivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGrupoParametroFormularioIva(grupoparametroformularioiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		grupoparametroformularioivaAux.setId(grupoparametroformularioiva.getId());
		grupoparametroformularioivaAux.setVersionRow(grupoparametroformularioiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGrupoParametroFormularioIva();
		
			int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = grupoparametroformularioivaValidator.getInvalidValues(this.grupoparametroformularioiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			grupoparametroformularioivaLogic.setDatosCliente(datosCliente);
			grupoparametroformularioivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				grupoparametroformularioivaAux=new  GrupoParametroFormularioIva();
				
				grupoparametroformularioivaAux.setIsNew(true);
				grupoparametroformularioivaAux.setIsChanged(true);
				
				grupoparametroformularioivaAux.setGrupoParametroFormularioIvaOriginal(this.grupoparametroformularioiva);
				
				grupoparametroformularioivaAux.setId(this.grupoparametroformularioiva.getId());	
				grupoparametroformularioivaAux.setid_empresa(this.grupoparametroformularioiva.getid_empresa());	
				grupoparametroformularioivaAux.setVersionRow(this.grupoparametroformularioiva.getVersionRow());	
				grupoparametroformularioivaAux.setnombre(this.grupoparametroformularioiva.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.saveGrupoParametroFormularioIvas();//WithConnection
						//grupoparametroformularioivaLogic.getSetVersionRowGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoparametroformularioiva,grupoparametroformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				grupoparametroformularioivaAux=new  GrupoParametroFormularioIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
					|| (this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.grupoparametroformularioiva.getId()>=0)) {
						
					grupoparametroformularioivaAux.setIsNew(false);
				}
				
				grupoparametroformularioivaAux.setIsDeleted(false);
			
				grupoparametroformularioivaAux.setId(this.grupoparametroformularioiva.getId());	
				grupoparametroformularioivaAux.setid_empresa(this.grupoparametroformularioiva.getid_empresa());	
				grupoparametroformularioivaAux.setVersionRow(this.grupoparametroformularioiva.getVersionRow());	
				grupoparametroformularioivaAux.setnombre(this.grupoparametroformularioiva.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.saveGrupoParametroFormularioIvas();//WithConnection
						//grupoparametroformularioivaLogic.getSetVersionRowGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.grupoparametroformularioiva,grupoparametroformularioivaAux);
					
					this.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				grupoparametroformularioivaAux=new  GrupoParametroFormularioIva();
				
				grupoparametroformularioivaAux.setIsNew(false);
				grupoparametroformularioivaAux.setIsChanged(false);
				
				grupoparametroformularioivaAux.setIsDeleted(true);
				
				grupoparametroformularioivaAux.setId(this.grupoparametroformularioiva.getId());	
				grupoparametroformularioivaAux.setid_empresa(this.grupoparametroformularioiva.getid_empresa());	
				grupoparametroformularioivaAux.setVersionRow(this.grupoparametroformularioiva.getVersionRow());	
				grupoparametroformularioivaAux.setnombre(this.grupoparametroformularioiva.getnombre());	
				
				if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.grupoparametroformularioivaAux.getId()>=0) {	
						this.grupoparametroformularioivasEliminados.add(grupoparametroformularioivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.saveGrupoParametroFormularioIvas();//WithConnection
						//grupoparametroformularioivaLogic.getSetVersionRowGrupoParametroFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoparametroformularioivaAux.setParametroFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());

							if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.quitarFilaTotales();}
							grupoparametroformularioivaAux.setFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(grupoparametroformularioivaAux,grupoparametroformularioivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().addAll(this.grupoparametroformularioivasEliminados);
					
					grupoparametroformularioivaLogic.saveGrupoParametroFormularioIvas();//WithConnection
					//grupoparametroformularioivaLogic.getSetVersionRowGrupoParametroFormularioIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva();
				
				this.grupoparametroformularioivasEliminados= new ArrayList<GrupoParametroFormularioIva>();		
			}
			
			if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Grupo Parametro Formulario Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.grupoparametroformularioiva=grupoparametroformularioivaAux;
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
      		//this.finishProcessGrupoParametroFormularioIva();
      	}
		
	}	
	
	public void actualizarRelaciones(GrupoParametroFormularioIva grupoparametroformularioivaLocal) throws Exception {
		
		if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				grupoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
				grupoparametroformularioivaLocal.setFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
			
			} else {
			
				grupoparametroformularioivaLocal.setParametroFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivas);
				grupoparametroformularioivaLocal.setFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GrupoParametroFormularioIva grupoparametroformularioivaLocal) throws Exception {	
		if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				grupoparametroformularioivaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGrupoParametroFormularioIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = grupoparametroformularioivaValidator.getInvalidValues(this.grupoparametroformularioiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GrupoParametroFormularioIva grupoparametroformularioiva,List<GrupoParametroFormularioIva> grupoparametroformularioivas) throws Exception {
		try	{		
			GrupoParametroFormularioIvaConstantesFunciones.actualizarLista(grupoparametroformularioiva,grupoparametroformularioivas,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GrupoParametroFormularioIva grupoparametroformularioiva,List<GrupoParametroFormularioIva> grupoparametroformularioivas) throws Exception {
		try	{			
			GrupoParametroFormularioIvaConstantesFunciones.actualizarSelectedLista(grupoparametroformularioiva,grupoparametroformularioivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GrupoParametroFormularioIva> grupoparametroformularioivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				grupoparametroformularioivasLocal=this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				grupoparametroformularioivasLocal=this.grupoparametroformularioivas;
			}
			//ARCHITECTURE
		
			for(GrupoParametroFormularioIva grupoparametroformularioivaLocal:grupoparametroformularioivasLocal) {
				if(this.permiteMantenimiento(grupoparametroformularioivaLocal) && grupoparametroformularioivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GrupoParametroFormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GrupoParametroFormularioIvaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelid_empresaGrupoParametroFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GrupoParametroFormularioIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelnombreGrupoParametroFormularioIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelid_empresaGrupoParametroFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelnombreGrupoParametroFormularioIva,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroFormularioIva")) {
			if(this.grupoparametroformularioiva==null) {
				this.grupoparametroformularioiva= new GrupoParametroFormularioIva();
			}

			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoParametroFormularioIva
				this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);

				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getparametroformularioiva().setGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			}

			return;
		}
		 else  if(sTipo.equals("FormularioIva")) {
			if(this.grupoparametroformularioiva==null) {
				this.grupoparametroformularioiva= new GrupoParametroFormularioIva();
			}

			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGrupoParametroFormularioIva
				this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);

				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.getformularioiva().setGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGrupoParametroFormularioIva--;	
		
		
		this.grupoparametroformularioivaAux=new GrupoParametroFormularioIva();
		
		this.grupoparametroformularioivaAux.setId(this.iIdNuevoGrupoParametroFormularioIva);
		this.grupoparametroformularioivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().add(this.grupoparametroformularioivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.grupoparametroformularioivas.add(this.grupoparametroformularioivaAux);
		}
		//ARCHITECTURE
		
		this.grupoparametroformularioiva=this.grupoparametroformularioivaAux;
		
		if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoParametroFormularioIva(this.grupoparametroformularioiva);
		}
				
		//this.setDefaultControlesGrupoParametroFormularioIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGrupoParametroFormularioIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGrupoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoParametroFormularioIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioivaBean,this.grupoparametroformularioiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			classes=GrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.grupoparametroformularioivaReturnGeneral=grupoparametroformularioivaLogic.procesarEventosGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),this.grupoparametroformularioiva,this.grupoparametroformularioivaParameterGeneral,this.isEsNuevoGrupoParametroFormularioIva,classes);//this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral,this.grupoparametroformularioivaBean,false);
		
		if(this.grupoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva());
		}
		
		if(this.grupoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva(),classes);//this.grupoparametroformularioivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGrupoParametroFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGrupoParametroFormularioIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
						
			if(grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado() && FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioIvaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();
			}
			
			this.actualizarVisualTableDatosGrupoParametroFormularioIva();
			
			this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoGrupoParametroFormularioIva(), this.getIndiceNuevoGrupoParametroFormularioIva());
			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
						
			this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGrupoParametroFormularioIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setEnabled(isHabilitar && this.grupoparametroformularioivaConstantesFunciones.activarnombreGrupoParametroFormularioIva);	
		//
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setEnabled(isHabilitar && this.grupoparametroformularioivaConstantesFunciones.activarid_empresaGrupoParametroFormularioIva);
	};
	
	public void setDefaultControlesGrupoParametroFormularioIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGrupoParametroFormularioIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(true);			
			this.grupoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(false);			
			this.grupoparametroformularioivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoGrupoParametroFormularioIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				if(grupoparametroformularioivaAux.getId().equals(this.iIdNuevoGrupoParametroFormularioIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivas) {
				if(grupoparametroformularioivaAux.getId().equals(this.iIdNuevoGrupoParametroFormularioIva)) {
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
	
	public int getIndiceActualGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				if(grupoparametroformularioivaAux.getId().equals(grupoparametroformularioiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivas) {
				if(grupoparametroformularioivaAux.getId().equals(grupoparametroformularioiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				if(grupoparametroformularioivaAux.getGrupoParametroFormularioIvaOriginal().getId().equals(grupoparametroformularioivaOriginal.getId())) {
					existe=true;
					grupoparametroformularioivaOriginal.setId(grupoparametroformularioivaAux.getId());
					grupoparametroformularioivaOriginal.setVersionRow(grupoparametroformularioivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivas) {
				if(grupoparametroformularioivaAux.getGrupoParametroFormularioIvaOriginal().getId().equals(grupoparametroformularioivaOriginal.getId())) {
					existe=true;
					grupoparametroformularioivaOriginal.setId(grupoparametroformularioivaAux.getId());
					grupoparametroformularioivaOriginal.setVersionRow(grupoparametroformularioivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGrupoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
		grupoparametroformularioivaAux=new GrupoParametroFormularioIva();
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
					if(grupoparametroformularioivaAux.getId()<0) {
						grupoparametroformularioivasAux.add(grupoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoGrupoParametroFormularioIva=0L;
				this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().removeAll(grupoparametroformularioivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivas) {
					if(grupoparametroformularioivaAux.getId()<0) {
						grupoparametroformularioivasAux.add(grupoparametroformularioivaAux);
					}		
				}
				this.iIdNuevoGrupoParametroFormularioIva=0L;
				this.grupoparametroformularioivas.removeAll(grupoparametroformularioivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGrupoParametroFormularioIva 
					&& this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()>0
					) {
					grupoparametroformularioivaAux=this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().get(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size() - 1);
				
					if(grupoparametroformularioivaAux.getId()<0) {
						this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().remove(grupoparametroformularioivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGrupoParametroFormularioIva && this.grupoparametroformularioivas.size()>0) {
					grupoparametroformularioivaAux=this.grupoparametroformularioivas.get(this.grupoparametroformularioivas.size() - 1);
				
					if(grupoparametroformularioivaAux.getId()<0) {
						this.grupoparametroformularioivas.remove(grupoparametroformularioivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGrupoParametroFormularioIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(grupoparametroformularioiva.getId()<0) {
				this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().remove(this.grupoparametroformularioiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(grupoparametroformularioiva.getId()<0) {
				this.grupoparametroformularioivas.remove(this.grupoparametroformularioiva);
			}
		}			
	}
	
	public void setEstadosInicialesGrupoParametroFormularioIva(List<GrupoParametroFormularioIva> grupoparametroformularioivasAux) throws Exception {
		GrupoParametroFormularioIvaConstantesFunciones.setEstadosInicialesGrupoParametroFormularioIva(grupoparametroformularioivasAux);
	}
	
	public void setEstadosInicialesGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioivaAux) throws Exception {
		GrupoParametroFormularioIvaConstantesFunciones.setEstadosInicialesGrupoParametroFormularioIva(grupoparametroformularioivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGrupoParametroFormularioIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGrupoParametroFormularioIvaActual()) {
				if(!this.isEsNuevoGrupoParametroFormularioIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGrupoParametroFormularioIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGrupoParametroFormularioIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Grupo Parametro Formulario Iva ?", "MANTENIMIENTO DE Grupo Parametro Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception {
		GrupoParametroFormularioIvaConstantesFunciones.seleccionarAsignar(this.grupoparametroformularioiva,grupoparametroformularioiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGrupoParametroFormularioIva=this.isPermisoActualizarOriginalGrupoParametroFormularioIva;
			
			
			this.seleccionarAsignar(grupoparametroformularioiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GrupoParametroFormularioIvaConstantesFunciones.quitarEspaciosGrupoParametroFormularioIva(this.grupoparametroformularioiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.grupoparametroformularioivaSessionBean.setsFuncionBusquedaRapida(this.grupoparametroformularioivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGrupoParametroFormularioIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGrupoParametroFormularioIva(esParaCancelar);				
				this.cancelarNuevoGrupoParametroFormularioIva(esParaCancelar);								
			}
			
			this.grupoparametroformularioiva=new GrupoParametroFormularioIva();
			
			this.inicializarGrupoParametroFormularioIva();
			
			this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGrupoParametroFormularioIva() throws Exception {
		try {
			GrupoParametroFormularioIvaConstantesFunciones.inicializarGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			
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
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGrupoParametroFormularioIvas(String sAccionBusqueda,List<GrupoParametroFormularioIva> grupoparametroformularioivasParaReportes) throws Exception {
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
					sPathReporteFinal="GrupoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GrupoParametroFormularioIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GrupoParametroFormularioIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GrupoParametroFormularioIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Grupo Parametro Formulario Ivas");		
		parameters.put("busquedapor", GrupoParametroFormularioIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroFormularioIva.class));
			classes.add(new Classe(FormularioIva.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogicAuxiliar=new GrupoParametroFormularioIvaLogic();
					grupoparametroformularioivaLogicAuxiliar.setDatosCliente(grupoparametroformularioivaLogic.getDatosCliente());				
					grupoparametroformularioivaLogicAuxiliar.setGrupoParametroFormularioIvas(grupoparametroformularioivasParaReportes);
					
					grupoparametroformularioivaLogicAuxiliar.cargarRelacionesLoteForeignKeyGrupoParametroFormularioIvaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					grupoparametroformularioivasParaReportes=grupoparametroformularioivaLogicAuxiliar.getGrupoParametroFormularioIvas();
					
					//grupoparametroformularioivaLogic.getNewConnexionToDeep();
					
					//for (GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivasParaReportes) {
					//	grupoparametroformularioivaLogic.deepLoad(grupoparametroformularioiva, false, DeepLoadType.INCLUDE, classes);
					//}						
					//grupoparametroformularioivaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroFormularioIva = AuxiliarReportes.class.getResourceAsStream("ParametroFormularioIvaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroformularioiva", reportFileParametroFormularioIva);

			InputStream reportFileFormularioIva = AuxiliarReportes.class.getResourceAsStream("FormularioIvaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formularioiva", reportFileFormularioIva);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGrupoParametroFormularioIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GrupoParametroFormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGrupoParametroFormularioIva=new JRBeanArrayDataSource(GrupoParametroFormularioIvaJInternalFrame.TraerGrupoParametroFormularioIvaBeans(grupoparametroformularioivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGrupoParametroFormularioIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GrupoParametroFormularioIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GrupoParametroFormularioIvaBean.TraerGrupoParametroFormularioIvaBeans(grupoparametroformularioivasParaReportes).toArray()));
							
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
				this.generarExcelReporteGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIvaActionPerformed(null);
					//this.generarExcelReporteGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGrupoParametroFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,grupoparametroformularioivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoParametroFormularioIva> grupoparametroformularioivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoParametroFormularioIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GrupoParametroFormularioIva grupoparametroformularioiva : grupoparametroformularioivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataGrupoParametroFormularioIva("NORMAL",row,workbook,grupoparametroformularioiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGrupoParametroFormularioIva(String sTipo,Row row,Workbook workbook) {
		
		GrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderGrupoParametroFormularioIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoParametroFormularioIva> grupoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GrupoParametroFormularioIva grupoparametroformularioiva : grupoparametroformularioivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaDescripcion(grupoparametroformularioiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoparametroformularioiva.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(grupoparametroformularioiva.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGrupoParametroFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<GrupoParametroFormularioIva> grupoparametroformularioivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GrupoParametroFormularioIva> grupoparametroformularioivasRespaldo=null;
		
		classes=GrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.grupoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
		this.grupoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
		this.grupoparametroformularioivaLogic.setIsConDeep(true);
		
		grupoparametroformularioivasRespaldo=this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas();
		
		this.grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(grupoparametroformularioivasParaReportes);	
		this.grupoparametroformularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		grupoparametroformularioivasParaReportes=this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas();
		this.grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(grupoparametroformularioivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GrupoParametroFormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGrupoParametroFormularioIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GrupoParametroFormularioIva grupoparametroformularioiva : grupoparametroformularioivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGrupoParametroFormularioIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GrupoParametroFormularioIvaConstantesFunciones.generarExcelReporteDataGrupoParametroFormularioIva("NORMAL",row,workbook,grupoparametroformularioiva,cellStyleDataAux);
		
			
			


				//ParametroFormularioIva
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupoparametroformularioiva.getParametroFormularioIvas()!=null && grupoparametroformularioiva.getParametroFormularioIvas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroFormularioIvaConstantesFunciones.generarExcelReporteHeaderParametroFormularioIva("RELACIONADO",row,workbook);
				}

				if(grupoparametroformularioiva.getParametroFormularioIvas()!=null) {
					i2=0;
					for(ParametroFormularioIva parametroformularioiva : grupoparametroformularioiva.getParametroFormularioIvas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroFormularioIvaConstantesFunciones.generarExcelReporteDataParametroFormularioIva("RELACIONADO",row,workbook,parametroformularioiva,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormularioIva
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormularioIvaConstantesFunciones.SCLASSWEBTITULO))) {

				if(grupoparametroformularioiva.getFormularioIvas()!=null && grupoparametroformularioiva.getFormularioIvas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormularioIvaConstantesFunciones.generarExcelReporteHeaderFormularioIva("RELACIONADO",row,workbook);
				}

				if(grupoparametroformularioiva.getFormularioIvas()!=null) {
					i2=0;
					for(FormularioIva formularioiva : grupoparametroformularioiva.getFormularioIvas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormularioIvaConstantesFunciones.generarExcelReporteDataFormularioIva("RELACIONADO",row,workbook,formularioiva,cellStyleDataAuxHijo);
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
		cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaDescripcion(grupoparametroformularioiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGrupoParametroFormularioIva() throws Exception {		
		this.startProcessGrupoParametroFormularioIva(true);
	}
	
	public void startProcessGrupoParametroFormularioIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGrupoParametroFormularioIva ,this.jPanelParametrosReportesGrupoParametroFormularioIva, this.jScrollPanelDatosGrupoParametroFormularioIva,this.jPanelPaginacionGrupoParametroFormularioIva, this.jScrollPanelDatosEdicionGrupoParametroFormularioIva, this.jPanelAccionesGrupoParametroFormularioIva,this.jPanelAccionesFormularioGrupoParametroFormularioIva,this.jmenuBarGrupoParametroFormularioIva,this.jmenuBarDetalleGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoParametroFormularioIva=this.jTabbedPaneBusquedasGrupoParametroFormularioIva; 
		
		final JPanel jPanelParametrosReportesGrupoParametroFormularioIva=this.jPanelParametrosReportesGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosGrupoParametroFormularioIva=this.jScrollPanelDatosGrupoParametroFormularioIva;
		final JTable jTableDatosGrupoParametroFormularioIva=this.jTableDatosGrupoParametroFormularioIva;		
		final JPanel jPanelPaginacionGrupoParametroFormularioIva=this.jPanelPaginacionGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionGrupoParametroFormularioIva=this.jScrollPanelDatosEdicionGrupoParametroFormularioIva;
		final JPanel jPanelAccionesGrupoParametroFormularioIva=this.jPanelAccionesGrupoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarGrupoParametroFormularioIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelCamposGrupoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelAccionesFormularioGrupoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposGrupoParametroFormularioIva=jPanelCamposAuxiliarGrupoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioGrupoParametroFormularioIva=jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarGrupoParametroFormularioIva=this.jmenuBarGrupoParametroFormularioIva;
		final JToolBar jTtoolBarGrupoParametroFormularioIva=this.jTtoolBarGrupoParametroFormularioIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGrupoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jmenuBarDetalleGrupoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTtoolBarDetalleGrupoParametroFormularioIva;
		}
		
		final JMenuBar jmenuBarDetalleGrupoParametroFormularioIva=jmenuBarDetalleAuxiliarGrupoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleGrupoParametroFormularioIva=jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosGrupoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposGrupoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarGrupoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoParametroFormularioIva ,jPanelParametrosReportesGrupoParametroFormularioIva,jTableDatosGrupoParametroFormularioIva, /*jScrollPanelDatosGrupoParametroFormularioIva,*/jPanelCamposGrupoParametroFormularioIva,jPanelPaginacionGrupoParametroFormularioIva, /*jScrollPanelDatosEdicionGrupoParametroFormularioIva,*/ jPanelAccionesGrupoParametroFormularioIva,jPanelAccionesFormularioGrupoParametroFormularioIva,jmenuBarGrupoParametroFormularioIva,jmenuBarDetalleGrupoParametroFormularioIva,jTtoolBarGrupoParametroFormularioIva,jTtoolBarDetalleGrupoParametroFormularioIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGrupoParametroFormularioIva ,jPanelParametrosReportesGrupoParametroFormularioIva, jScrollPanelDatosGrupoParametroFormularioIva,jPanelPaginacionGrupoParametroFormularioIva, jScrollPanelDatosEdicionGrupoParametroFormularioIva, jPanelAccionesGrupoParametroFormularioIva,jPanelAccionesFormularioGrupoParametroFormularioIva,jmenuBarGrupoParametroFormularioIva,jmenuBarDetalleGrupoParametroFormularioIva,jTtoolBarGrupoParametroFormularioIva,jTtoolBarDetalleGrupoParametroFormularioIva);
						
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
	
	public void finishProcessGrupoParametroFormularioIva() {// throws Exception 
		this.finishProcessGrupoParametroFormularioIva(true);
	}
	
	public void finishProcessGrupoParametroFormularioIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGrupoParametroFormularioIva ,this.jPanelParametrosReportesGrupoParametroFormularioIva, this.jScrollPanelDatosGrupoParametroFormularioIva,this.jPanelPaginacionGrupoParametroFormularioIva, this.jScrollPanelDatosEdicionGrupoParametroFormularioIva, this.jPanelAccionesGrupoParametroFormularioIva,this.jPanelAccionesFormularioGrupoParametroFormularioIva,this.jmenuBarGrupoParametroFormularioIva,this.jmenuBarDetalleGrupoParametroFormularioIva,this.jTtoolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasGrupoParametroFormularioIva=this.jTabbedPaneBusquedasGrupoParametroFormularioIva; 
		
		final JPanel jPanelParametrosReportesGrupoParametroFormularioIva=this.jPanelParametrosReportesGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosGrupoParametroFormularioIva=this.jScrollPanelDatosGrupoParametroFormularioIva;
		final JTable jTableDatosGrupoParametroFormularioIva=this.jTableDatosGrupoParametroFormularioIva;		
		final JPanel jPanelPaginacionGrupoParametroFormularioIva=this.jPanelPaginacionGrupoParametroFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionGrupoParametroFormularioIva=this.jScrollPanelDatosEdicionGrupoParametroFormularioIva;
		final JPanel jPanelAccionesGrupoParametroFormularioIva=this.jPanelAccionesGrupoParametroFormularioIva;
		
		JPanel jPanelCamposAuxiliarGrupoParametroFormularioIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			jPanelCamposAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelCamposGrupoParametroFormularioIva;
			jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelAccionesFormularioGrupoParametroFormularioIva;
		}
		
		final JPanel jPanelCamposGrupoParametroFormularioIva=jPanelCamposAuxiliarGrupoParametroFormularioIva;
		final JPanel jPanelAccionesFormularioGrupoParametroFormularioIva=jPanelAccionesFormularioAuxiliarGrupoParametroFormularioIva;
		
		
		final JMenuBar jmenuBarGrupoParametroFormularioIva=this.jmenuBarGrupoParametroFormularioIva;		
		final JToolBar jTtoolBarGrupoParametroFormularioIva=this.jTtoolBarGrupoParametroFormularioIva;
				
		JMenuBar jmenuBarDetalleAuxiliarGrupoParametroFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			jmenuBarDetalleAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jmenuBarDetalleGrupoParametroFormularioIva;
			jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTtoolBarDetalleGrupoParametroFormularioIva;		
		}
		
		final JMenuBar jmenuBarDetalleGrupoParametroFormularioIva=jmenuBarDetalleAuxiliarGrupoParametroFormularioIva;
		final JToolBar jTtoolBarDetalleGrupoParametroFormularioIva=jTtoolBarDetalleAuxiliarGrupoParametroFormularioIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGrupoParametroFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGrupoParametroFormularioIva;
			processRunnable.jTableDatos=jTableDatosGrupoParametroFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposGrupoParametroFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionGrupoParametroFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesGrupoParametroFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGrupoParametroFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarGrupoParametroFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGrupoParametroFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarGrupoParametroFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGrupoParametroFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGrupoParametroFormularioIva ,jPanelParametrosReportesGrupoParametroFormularioIva, jTableDatosGrupoParametroFormularioIva,/*jScrollPanelDatosGrupoParametroFormularioIva,*/jPanelCamposGrupoParametroFormularioIva,jPanelPaginacionGrupoParametroFormularioIva, /*jScrollPanelDatosEdicionGrupoParametroFormularioIva,*/ jPanelAccionesGrupoParametroFormularioIva,jPanelAccionesFormularioGrupoParametroFormularioIva,jmenuBarGrupoParametroFormularioIva,jmenuBarDetalleGrupoParametroFormularioIva,jTtoolBarGrupoParametroFormularioIva,jTtoolBarDetalleGrupoParametroFormularioIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGrupoParametroFormularioIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGrupoParametroFormularioIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGrupoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGrupoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGrupoParametroFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGrupoParametroFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGrupoParametroFormularioIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.grupoparametroformularioivaConstantesFunciones.getsFinalQueryGrupoParametroFormularioIva();
		String  finalQueryPaginacionTodos=this.grupoparametroformularioivaConstantesFunciones.getsFinalQueryGrupoParametroFormularioIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesNoGrupoParametroFormularioIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesGrupoParametroFormularioIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GrupoParametroFormularioIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.grupoparametroformularioivasEliminados= new ArrayList<GrupoParametroFormularioIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGrupoParametroFormularioIva();
		
				///*GrupoParametroFormularioIvaSessionBean*/this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
			
			if(this.grupoparametroformularioivaSessionBean==null) {
				this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
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
					this.iNumeroPaginacion=GrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GrupoParametroFormularioIvaConstantesFunciones.getClassesForeignKeysOfGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/grupoparametroformularioiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			grupoparametroformularioivasAux= new ArrayList<GrupoParametroFormularioIva>();
			
				
			grupoparametroformularioivaLogic.setDatosCliente(this.datosCliente);
			grupoparametroformularioivaLogic.setDatosDeep(this.datosDeep);
			grupoparametroformularioivaLogic.setIsConDeep(true);
			
			
			grupoparametroformularioivaLogic.getGrupoParametroFormularioIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					grupoparametroformularioivaLogic.getTodosGrupoParametroFormularioIvas(finalQueryGlobal,pagination);
					
					//grupoparametroformularioivaLogic.getTodosGrupoParametroFormularioIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()==null|| grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoparametroformularioivasAux= new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivasAux.addAll(grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivasAux= new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivasAux.addAll(grupoparametroformularioivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoparametroformularioivaLogic.getTodosGrupoParametroFormularioIvas(finalQueryGlobal+"",this.pagination);												
							
							//grupoparametroformularioivaLogic.getTodosGrupoParametroFormularioIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(new ArrayList<GrupoParametroFormularioIva>());					
							grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().addAll(grupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivas.addAll(grupoparametroformularioivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGrupoParametroFormularioIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGrupoParametroFormularioIva=this.idActual;
				
				} else if(this.idGrupoParametroFormularioIvaActual!=null && this.idGrupoParametroFormularioIvaActual!=0L) {
					idGrupoParametroFormularioIva=idGrupoParametroFormularioIvaActual;
				}
				
					
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndicePorId(idGrupoParametroFormularioIva);
				
				this.grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					grupoparametroformularioivaLogic.getEntity(idGrupoParametroFormularioIva);
					
					//grupoparametroformularioivaLogic.getEntityWithConnection(idGrupoParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(new ArrayList<GrupoParametroFormularioIva>());
					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().add(grupoparametroformularioivaLogic.getGrupoParametroFormularioIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
					this.grupoparametroformularioivas.add(grupoparametroformularioiva);
				}
				
				if(grupoparametroformularioivaLogic.getGrupoParametroFormularioIva()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()==null||grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoparametroformularioivas==null|| grupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
						grupoparametroformularioivasAux.addAll(grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivasAux.addAll(grupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoParametroFormularioIvas("BusquedaPorId",grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoParametroFormularioIvas("BusquedaPorId",grupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(new ArrayList<GrupoParametroFormularioIva>());
						grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().addAll(grupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivas.addAll(grupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()==null||grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoparametroformularioivas==null|| grupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
						grupoparametroformularioivasAux.addAll(grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivasAux.addAll(grupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoParametroFormularioIvas("BusquedaPorNombre",grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoParametroFormularioIvas("BusquedaPorNombre",grupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(new ArrayList<GrupoParametroFormularioIva>());
						grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().addAll(grupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivas.addAll(grupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()==null||grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=grupoparametroformularioivas==null|| grupoparametroformularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
						grupoparametroformularioivasAux.addAll(grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivasAux=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivasAux.addAll(grupoparametroformularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GrupoParametroFormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGrupoParametroFormularioIvas("FK_IdEmpresa",grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGrupoParametroFormularioIvas("FK_IdEmpresa",grupoparametroformularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(new ArrayList<GrupoParametroFormularioIva>());
						grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().addAll(grupoparametroformularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
							grupoparametroformularioivas.addAll(grupoparametroformularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGrupoParametroFormularioIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGrupoParametroFormularioIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoparametroformularioivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoparametroformularioivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GrupoParametroFormularioIva grupoparametroformularioiva) {
		Boolean permite=true;
		
		if(this.grupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GrupoParametroFormularioIvaConstantesFunciones.getOrderByListaGrupoParametroFormularioIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GrupoParametroFormularioIvaConstantesFunciones.getOrderByListaGrupoParametroFormularioIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				if(grupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					grupoparametroformularioivaTotales=grupoparametroformularioiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoParametroFormularioIva grupoparametroformularioiva:this.grupoparametroformularioivas) {
				if(grupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					grupoparametroformularioivaTotales=grupoparametroformularioiva;
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
			this.grupoparametroformularioivaAux=new GrupoParametroFormularioIva();
			this.grupoparametroformularioivaAux.setsType(Constantes2.S_TOTALES);
			this.grupoparametroformularioivaAux.setIsNew(false);
			this.grupoparametroformularioivaAux.setIsChanged(false);
			this.grupoparametroformularioivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaGrupoParametroFormularioIva(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),this.grupoparametroformularioivaAux);
				
				this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().add(this.grupoparametroformularioivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaGrupoParametroFormularioIva(this.grupoparametroformularioivas,this.grupoparametroformularioivaAux);
				
				this.grupoparametroformularioivas.add(this.grupoparametroformularioivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		grupoparametroformularioivaTotales=new GrupoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().remove(grupoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.grupoparametroformularioivas.remove(grupoparametroformularioivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		grupoparametroformularioivaTotales=new GrupoParametroFormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				if(grupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					grupoparametroformularioivaTotales=grupoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaGrupoParametroFormularioIva(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),grupoparametroformularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GrupoParametroFormularioIva grupoparametroformularioiva:this.grupoparametroformularioivas) {
				if(grupoparametroformularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					grupoparametroformularioivaTotales=grupoparametroformularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GrupoParametroFormularioIvaConstantesFunciones.TotalizarValoresFilaGrupoParametroFormularioIva(this.grupoparametroformularioivas,grupoparametroformularioivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGrupoParametroFormularioIvasBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoParametroFormularioIvasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGrupoParametroFormularioIvasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGrupoParametroFormularioIvasBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoParametroFormularioIvasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGrupoParametroFormularioIvasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLogic.getGrupoParametroFormularioIvasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosGrupoParametroFormularioIva() {
		this.isPermisoTodoGrupoParametroFormularioIva=false;
		this.isPermisoNuevoGrupoParametroFormularioIva=false;
		this.isPermisoActualizarGrupoParametroFormularioIva=false;
		this.isPermisoActualizarOriginalGrupoParametroFormularioIva=false;
		this.isPermisoEliminarGrupoParametroFormularioIva=false;
		this.isPermisoGuardarCambiosGrupoParametroFormularioIva=false;
		this.isPermisoConsultaGrupoParametroFormularioIva=false;
		this.isPermisoBusquedaGrupoParametroFormularioIva=false;
		this.isPermisoReporteGrupoParametroFormularioIva=false;		
		this.isPermisoOrdenGrupoParametroFormularioIva=false;		
		this.isPermisoPaginacionMedioGrupoParametroFormularioIva=false;		
		this.isPermisoPaginacionAltoGrupoParametroFormularioIva=false;
		this.isPermisoPaginacionTodoGrupoParametroFormularioIva=false;
		this.isPermisoCopiarGrupoParametroFormularioIva=false;		
		this.isPermisoVerFormGrupoParametroFormularioIva=false;		
		this.isPermisoDuplicarGrupoParametroFormularioIva=false;		
		this.isPermisoOrdenGrupoParametroFormularioIva=false;		
	}
	
	public void setPermisosUsuarioGrupoParametroFormularioIva(Boolean isPermiso) {
		this.isPermisoTodoGrupoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalGrupoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarGrupoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosGrupoParametroFormularioIva=isPermiso;
		this.isPermisoConsultaGrupoParametroFormularioIva=isPermiso;
		this.isPermisoBusquedaGrupoParametroFormularioIva=isPermiso;
		this.isPermisoReporteGrupoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionMedioGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionAltoGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoPaginacionTodoGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoCopiarGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoVerFormGrupoParametroFormularioIva=isPermiso;		
		this.isPermisoDuplicarGrupoParametroFormularioIva=isPermiso;
		this.isPermisoOrdenGrupoParametroFormularioIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGrupoParametroFormularioIva(Boolean isPermiso) {
		//this.isPermisoTodoGrupoParametroFormularioIva=isPermiso;
		this.isPermisoNuevoGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarGrupoParametroFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalGrupoParametroFormularioIva=isPermiso;
		this.isPermisoEliminarGrupoParametroFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoConsultaGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoBusquedaGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoReporteGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionMedioGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionAltoGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoPaginacionTodoGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoCopiarGrupoParametroFormularioIva=isPermiso;		
		//this.isPermisoDuplicarGrupoParametroFormularioIva=isPermiso;
		//this.isPermisoOrdenGrupoParametroFormularioIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGrupoParametroFormularioIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
		if(GrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroFormularioIva=false;
		this.isTienePermisosParametroFormularioIva=this.verificarGetPermisosUsuarioOpcionGrupoParametroFormularioIvaClaseRelacionada(this.opcionsRelacionadas,ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormularioIva=false;
		this.isTienePermisosFormularioIva=this.verificarGetPermisosUsuarioOpcionGrupoParametroFormularioIvaClaseRelacionada(this.opcionsRelacionadas,FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGrupoParametroFormularioIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGrupoParametroFormularioIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroFormularioIva=conPermiso;
		this.isTienePermisosFormularioIva=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioGrupoParametroFormularioIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGrupoParametroFormularioIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGrupoParametroFormularioIvaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroFormularioIva && this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.remove(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormularioIva && this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.remove(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioGrupoParametroFormularioIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGrupoParametroFormularioIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGrupoParametroFormularioIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGrupoParametroFormularioIva=this.isPermisoActualizarGrupoParametroFormularioIva;
			this.isPermisoEliminarGrupoParametroFormularioIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGrupoParametroFormularioIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGrupoParametroFormularioIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGrupoParametroFormularioIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGrupoParametroFormularioIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGrupoParametroFormularioIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGrupoParametroFormularioIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGrupoParametroFormularioIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGrupoParametroFormularioIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGrupoParametroFormularioIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGrupoParametroFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGrupoParametroFormularioIva.setToolTipText(this.jTableDatosGrupoParametroFormularioIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGrupoParametroFormularioIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGrupoParametroFormularioIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGrupoParametroFormularioIva() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Formulario Iva");
			reporte.setsDescripcion("Parametro Formulario Iva");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formulario Iva");
			reporte.setsDescripcion("Formulario Iva");
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
	public void inicializarCombosForeignKeyGrupoParametroFormularioIvaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGrupoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GrupoParametroFormularioIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGrupoParametroFormularioIvaListas(false);
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
	
	public void cargarCombosLoteForeignKeyGrupoParametroFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaReturnGeneral=new GrupoParametroFormularioIvaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.grupoparametroformularioivaConstantesFunciones.cargarid_empresaGrupoParametroFormularioIva)
					 || (this.esRecargarFks && this.grupoparametroformularioivaConstantesFunciones.cargarid_empresaGrupoParametroFormularioIva)) {

					if(!this.grupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+grupoparametroformularioivaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				grupoparametroformularioivaReturnGeneral=grupoparametroformularioivaLogic.cargarCombosLoteForeignKeyGrupoParametroFormularioIva(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=grupoparametroformularioivaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGrupoParametroFormularioIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.grupoparametroformularioivaSessionBean==null) {
				this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
			}

			if(!this.grupoparametroformularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyGrupoParametroFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGrupoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGrupoParametroFormularioIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoParametroFormularioIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGrupoParametroFormularioIva()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGrupoParametroFormularioIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGrupoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGrupoParametroFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGrupoParametroFormularioIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGrupoParametroFormularioIva()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGrupoParametroFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGrupoParametroFormularioIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public GrupoParametroFormularioIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean(); 
		this.grupoparametroformularioivaConstantesFunciones=new GrupoParametroFormularioIvaConstantesFunciones(); 
		this.grupoparametroformularioivaBean=new GrupoParametroFormularioIva();//(this.grupoparametroformularioivaConstantesFunciones); 		
		this.grupoparametroformularioivaReturnGeneral=new GrupoParametroFormularioIvaParameterReturnGeneral(); 
		
		this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GrupoParametroFormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGrupoParametroFormularioIva(true);
			
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
			
			this.grupoparametroformularioivaConstantesFunciones=new GrupoParametroFormularioIvaConstantesFunciones(); 
			this.grupoparametroformularioivaBean=new GrupoParametroFormularioIva();//this.grupoparametroformularioivaConstantesFunciones); 			
			this.grupoparametroformularioivaReturnGeneral=new GrupoParametroFormularioIvaParameterReturnGeneral(); 
		
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Parametro Formulario Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.grupoparametroformularioiva=new GrupoParametroFormularioIva();
			this.grupoparametroformularioivas = new ArrayList<GrupoParametroFormularioIva>();
			this.grupoparametroformularioivasAux = new ArrayList<GrupoParametroFormularioIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic=new GrupoParametroFormularioIvaLogic();
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.grupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGrupoParametroFormularioIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva);	
					}
					
					if(this.jInternalFrameImportacionGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoParametroFormularioIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGrupoParametroFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGrupoParametroFormularioIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoParametroFormularioIva);
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva);
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGrupoParametroFormularioIva);
					this.jInternalFrameImportacionGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameImportacionGrupoParametroFormularioIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGrupoParametroFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGrupoParametroFormularioIva);
					this.jInternalFrameOrderByGrupoParametroFormularioIva.setVisible(false);
					this.jInternalFrameOrderByGrupoParametroFormularioIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGrupoParametroFormularioIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.grupoparametroformularioivaReturnGeneral=new GrupoParametroFormularioIvaParameterReturnGeneral();
			
			this.grupoparametroformularioivaParameterGeneral=new GrupoParametroFormularioIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.grupoparametroformularioivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormularioIvaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGrupoParametroFormularioIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGrupoParametroFormularioIva(false);
			
			this.setPermisosUsuarioGrupoParametroFormularioIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() 
				|| (this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() && this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGrupoParametroFormularioIvaClasesRelacionadas();
			}
			
			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGrupoParametroFormularioIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGrupoParametroFormularioIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGrupoParametroFormularioIva();
			}
			
			if(!this.isPermisoBusquedaGrupoParametroFormularioIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGrupoParametroFormularioIva,this.isPermisoPaginacionMedioGrupoParametroFormularioIva,this.isPermisoPaginacionTodoGrupoParametroFormularioIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GrupoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarGrupoParametroFormularioIva());
				
				this.tiposColumnasSelect=GrupoParametroFormularioIvaConstantesFunciones.getTiposSeleccionarGrupoParametroFormularioIva(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectGrupoParametroFormularioIva();				
				//this.tiposRelacionesSelect=GrupoParametroFormularioIvaConstantesFunciones.getTiposRelacionesGrupoParametroFormularioIva(true);
				
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
			//if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGrupoParametroFormularioIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioGrupoParametroFormularioIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioGrupoParametroFormularioIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoParametroFormularioIva() ;
			
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
			
			
			this.parametroformularioivaLogic=new ParametroFormularioIvaLogic();
			this.formularioivaLogic=new FormularioIvaLogic(); 
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
				grupoparametroformularioivaImplementable= (GrupoParametroFormularioIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				grupoparametroformularioivaImplementableHome= (GrupoParametroFormularioIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GrupoParametroFormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.grupoparametroformularioivas= new ArrayList<GrupoParametroFormularioIva>();
			this.grupoparametroformularioivasEliminados= new ArrayList<GrupoParametroFormularioIva>();
						
			this.isEsNuevoGrupoParametroFormularioIva=false;
			this.esParaAccionDesdeFormularioGrupoParametroFormularioIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGrupoParametroFormularioIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGrupoParametroFormularioIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGrupoParametroFormularioIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGrupoParametroFormularioIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGrupoParametroFormularioIva();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGrupoParametroFormularioIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GrupoParametroFormularioIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGrupoParametroFormularioIva() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGrupoParametroFormularioIva")) {
				iIndex=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	
				
				

				if(sTitle.equals("Formulario Ivas")) {
					if(!FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoParametroFormularioIva();

						this.cargarParteTabPanelRelacionadaFormularioIva(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Formulario Ivas")) {
					if(!ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGrupoParametroFormularioIva();

						this.cargarParteTabPanelRelacionadaParametroFormularioIva(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGrupoParametroFormularioIva();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormularioIva(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.cargarSessionConBeanSwingJInternalFrameFormularioIva(false,true,iIndex);
		this.jButtonFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormularioIva();

		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.updateUI();
		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroFormularioIva(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(false,true,iIndex);
		this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroFormularioIva();

		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.updateUI();
		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroFormularioIva")) {
				int row=this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
				jButtonParametroFormularioIvaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormularioIva")) {
				int row=this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
				jButtonFormularioIvaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Formulario Iva")) {

					if(this.isTienePermisosParametroFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Formulario Ivas"+"("+ParametroFormularioIvaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Formulario Ivas");

						if(grupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaGrupoParametroFormularioIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaGrupoParametroFormularioIva);
						}

						jmenuItem.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaGrupoParametroFormularioIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroFormularioIva"));

						

						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jmenuDetalleGrupoParametroFormularioIva.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Formulario Iva")) {

					if(this.isTienePermisosFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formulario Ivas"+"("+FormularioIvaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formulario Ivas");

						if(grupoparametroformularioivaConstantesFunciones.resaltarFormularioIvaGrupoParametroFormularioIva!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(grupoparametroformularioivaConstantesFunciones.resaltarFormularioIvaGrupoParametroFormularioIva);
						}

						jmenuItem.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarFormularioIvaGrupoParametroFormularioIva);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormularioIva"));

						

						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jmenuDetalleGrupoParametroFormularioIva.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyGrupoParametroFormularioIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGrupoParametroFormularioIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGrupoParametroFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGrupoParametroFormularioIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGrupoParametroFormularioIva();
		
		this.cargarCombosFrameForeignKeyGrupoParametroFormularioIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGrupoParametroFormularioIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGrupoParametroFormularioIva();
		}
	}
	
	
	
	public void jButtonNuevoGrupoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			
			if(jTableDatosGrupoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosGrupoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosGrupoParametroFormularioIva.getRowCount()-1);						
			}
			
			this.isEsNuevoGrupoParametroFormularioIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGrupoParametroFormularioIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(true);			
			//this.grupoparametroformularioiva=new GrupoParametroFormularioIva();
			//this.grupoparametroformularioiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva() ;
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoParametroFormularioIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.grupoparametroformularioiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);				
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GrupoParametroFormularioIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGrupoParametroFormularioIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGrupoParametroFormularioIva.getSelectedRows().length;			
			}
			
			grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGrupoParametroFormularioIva--;			
				//GrupoParametroFormularioIva grupoparametroformularioivaAux= new GrupoParametroFormularioIva();			
				//grupoparametroformularioivaAux.setId(this.iIdNuevoGrupoParametroFormularioIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GrupoParametroFormularioIva grupoparametroformularioivaOrigen=new GrupoParametroFormularioIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GrupoParametroFormularioIva grupoparametroformularioivaOrigen : grupoparametroformularioivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							grupoparametroformularioivaOrigen =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							grupoparametroformularioivaOrigen =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGrupoParametroFormularioIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.grupoparametroformularioiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGrupoParametroFormularioIva(grupoparametroformularioivaOrigen,this.grupoparametroformularioiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().add(this.grupoparametroformularioivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoparametroformularioivas.add(this.grupoparametroformularioivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
				
				this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoGrupoParametroFormularioIva(), this.getIndiceNuevoGrupoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosGrupoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();									
		
			GrupoParametroFormularioIva grupoparametroformularioivaOrigen=new GrupoParametroFormularioIva();
			GrupoParametroFormularioIva grupoparametroformularioivaDestino=new GrupoParametroFormularioIva();
				
			grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGrupoParametroFormularioIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || grupoparametroformularioivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGrupoParametroFormularioIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaOrigen =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoparametroformularioivaOrigen =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						grupoparametroformularioivaDestino =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						grupoparametroformularioivaDestino =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				grupoparametroformularioivaOrigen =grupoparametroformularioivasSeleccionados.get(0);
				grupoparametroformularioivaDestino =grupoparametroformularioivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGrupoParametroFormularioIva(grupoparametroformularioivaOrigen,grupoparametroformularioivaDestino,true,false);
				
				grupoparametroformularioivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(grupoparametroformularioivaDestino,grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(grupoparametroformularioivaDestino,grupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
				
				//this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoGrupoParametroFormularioIva(), this.getIndiceNuevoGrupoParametroFormularioIva());
				
				int iLastRow =  this.jTableDatosGrupoParametroFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGrupoParametroFormularioIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(!isVisible);
			this.jPanelAccionesGrupoParametroFormularioIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGrupoParametroFormularioIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGrupoParametroFormularioIva();
			
			this.abrirFrameOrderByGrupoParametroFormularioIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGrupoParametroFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGrupoParametroFormularioIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoParametroFormularioIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.isMaximum()) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSize(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.iWidthFormulario,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGrupoParametroFormularioIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGrupoParametroFormularioIva.isMaximum()) {
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth(),GrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth(),GrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth(),GrupoParametroFormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormularioIva();
					}

					if(ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroFormularioIva();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGrupoParametroFormularioIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoParametroFormularioIva,false,this);
				} else {
					this.jInternalFrameOrderByGrupoParametroFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoParametroFormularioIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGrupoParametroFormularioIva);
				this.jInternalFrameOrderByGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameOrderByGrupoParametroFormularioIva.setSelected(false);
				
				this.jInternalFrameOrderByGrupoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoParametroFormularioIva"));
				
				this.inicializarActualizarBindingTablaOrderByGrupoParametroFormularioIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGrupoParametroFormularioIva==null) {
				
				this.jInternalFrameImportacionGrupoParametroFormularioIva=new ImportacionJInternalFrame(GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGrupoParametroFormularioIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGrupoParametroFormularioIva);
				this.jInternalFrameImportacionGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameImportacionGrupoParametroFormularioIva.setSelected(false);


				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoParametroFormularioIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva==null) {
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva=new ReporteDinamicoJInternalFrame(GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva);
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setVisible(false);
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoParametroFormularioIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoParametroFormularioIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormularioIva() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroFormularioIva() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jContentPaneDetalleGrupoParametroFormularioIva.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGrupoParametroFormularioIva);
			
	       	this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.dispose();
			//this.jInternalFrameDetalleFormGrupoParametroFormularioIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGrupoParametroFormularioIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameImportacionGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setVisible(true);
	        this.jInternalFrameOrderByGrupoParametroFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameOrderByGrupoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGrupoParametroFormularioIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGrupoParametroFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGrupoParametroFormularioIva.setVisible(false);
	        this.jInternalFrameImportacionGrupoParametroFormularioIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGrupoParametroFormularioIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGrupoParametroFormularioIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(true);
			//this.isEsNuevoGrupoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false) ;
			
			if(grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado() && ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado() && FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormularioIvaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoParametroFormularioIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGrupoParametroFormularioIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGrupoParametroFormularioIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(true);
			//this.isEsNuevoGrupoParametroFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.grupoparametroformularioiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false) ;
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGrupoParametroFormularioIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGrupoParametroFormularioIva(false);
			
			//if(!this.isEsNuevoGrupoParametroFormularioIva) {								
				int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				
			}
			
			if(this.permiteMantenimiento(this.grupoparametroformularioiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGrupoParametroFormularioIva=true;
					this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
					this.isEsNuevoGrupoParametroFormularioIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGrupoParametroFormularioIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGrupoParametroFormularioIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(false);
			
												
				
				if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGrupoParametroFormularioIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,grupoparametroformularioivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,grupoparametroformularioivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.grupoparametroformularioiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.grupoparametroformularioiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.grupoparametroformularioiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.grupoparametroformularioiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GrupoParametroFormularioIvaModel) this.jTableDatosGrupoParametroFormularioIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGrupoParametroFormularioIva=true;
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
				this.isEsNuevoGrupoParametroFormularioIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(false);
				
				this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(false);
				
				
				
				if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGrupoParametroFormularioIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGrupoParametroFormularioIva.getRowCount()>=1) {
				jTableDatosGrupoParametroFormularioIva.removeRowSelectionInterval(0, jTableDatosGrupoParametroFormularioIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGrupoParametroFormularioIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(false) ;
			
			this.isEsNuevoGrupoParametroFormularioIva=false;
			
			if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGrupoParametroFormularioIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
				
				//SI ES MANUAL
				if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGrupoParametroFormularioIva--;			
			//GrupoParametroFormularioIva grupoparametroformularioivaAux= new GrupoParametroFormularioIva();			
			//grupoparametroformularioivaAux.setId(this.iIdNuevoGrupoParametroFormularioIva);
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGrupoParametroFormularioIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
			
			this.grupoparametroformularioiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().add(this.grupoparametroformularioivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.grupoparametroformularioivas.add(this.grupoparametroformularioivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			
			this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(this.getIndiceNuevoGrupoParametroFormularioIva(), this.getIndiceNuevoGrupoParametroFormularioIva());
			
			int iLastRow =  this.jTableDatosGrupoParametroFormularioIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGrupoParametroFormularioIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGrupoParametroFormularioIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();
			}
			
			//this.abrirFrameTreeGrupoParametroFormularioIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Grupo Parametro Formulario IvaS ?", "MANTENIMIENTO DE Grupo Parametro Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGrupoParametroFormularioIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGrupoParametroFormularioIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.grupoparametroformularioivaReturnGeneral=grupoparametroformularioivaLogic.procesarImportacionGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.grupoparametroformularioivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGrupoParametroFormularioIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGrupoParametroFormularioIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGrupoParametroFormularioIva.setFileImportacion(this.jInternalFrameImportacionGrupoParametroFormularioIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGrupoParametroFormularioIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGrupoParametroFormularioIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		

		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GrupoParametroFormularioIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GrupoParametroFormularioIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GrupoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoparametroformularioiva.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(GrupoParametroFormularioIva grupoparametroformularioiva:grupoparametroformularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(grupoparametroformularioiva.getnombre());
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
			//	this.getFilaCabeceraExportarExcelGrupoParametroFormularioIva(row);				
			//	iRow++;
			//}				
			
			//for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGrupoParametroFormularioIva(grupoparametroformularioivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
			
			//SI ES MANUAL
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGrupoParametroFormularioIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGrupoParametroFormularioIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGrupoParametroFormularioIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGrupoParametroFormularioIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGrupoParametroFormularioIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGrupoParametroFormularioIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGrupoParametroFormularioIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosGrupoParametroFormularioIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosGrupoParametroFormularioIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGrupoParametroFormularioIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGrupoParametroFormularioIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGrupoParametroFormularioIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoParametroFormularioIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGrupoParametroFormularioIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGrupoParametroFormularioIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGrupoParametroFormularioIva();
		
		this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoParametroFormularioIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGrupoParametroFormularioIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoParametroFormularioIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoParametroFormularioIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGrupoParametroFormularioIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		try	{	
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGrupoParametroFormularioIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGrupoParametroFormularioIva() throws Exception {
		try	{
			if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoParametroFormularioIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoParametroFormularioIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGrupoParametroFormularioIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGrupoParametroFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGrupoParametroFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoParametroFormularioIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGrupoParametroFormularioIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGrupoParametroFormularioIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidGrupoParametroFormularioIvaBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreGrupoParametroFormularioIva.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {				
		if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGrupoParametroFormularioIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGrupoParametroFormularioIva() throws Exception {
		this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGrupoParametroFormularioIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGrupoParametroFormularioIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGrupoParametroFormularioIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=grupoparametroformularioivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGrupoParametroFormularioIva.setModel(new GrupoParametroFormularioIvaModel(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGrupoParametroFormularioIva.setModel(new GrupoParametroFormularioIvaModel(this.grupoparametroformularioivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGrupoParametroFormularioIva!=null && this.jInternalFrameOrderByGrupoParametroFormularioIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGrupoParametroFormularioIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,grupoparametroformularioivaConstantesFunciones.resaltarSeleccionarGrupoParametroFormularioIva,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO,grupoparametroformularioivaConstantesFunciones.resaltarSeleccionarGrupoParametroFormularioIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID));

		if(this.grupoparametroformularioivaConstantesFunciones.mostraridGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.grupoparametroformularioivaConstantesFunciones.resaltaridGrupoParametroFormularioIva,this.grupoparametroformularioivaConstantesFunciones.activaridGrupoParametroFormularioIva,this,true,"idGrupoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoparametroformularioivaConstantesFunciones.resaltaridGrupoParametroFormularioIva,this.grupoparametroformularioivaConstantesFunciones.activaridGrupoParametroFormularioIva,this,true,"idGrupoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.grupoparametroformularioivaConstantesFunciones.mostrarid_empresaGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.grupoparametroformularioivaConstantesFunciones.resaltarid_empresaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarid_empresaGrupoParametroFormularioIva));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.grupoparametroformularioivaConstantesFunciones.resaltarid_empresaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarid_empresaGrupoParametroFormularioIva,false,"id_empresaGrupoParametroFormularioIva","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.grupoparametroformularioivaConstantesFunciones.mostrarnombreGrupoParametroFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.grupoparametroformularioivaConstantesFunciones.resaltarnombreGrupoParametroFormularioIva,this.grupoparametroformularioivaConstantesFunciones.activarnombreGrupoParametroFormularioIva,this,true,"nombreGrupoParametroFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.grupoparametroformularioivaConstantesFunciones.resaltarnombreGrupoParametroFormularioIva,this.grupoparametroformularioivaConstantesFunciones.activarnombreGrupoParametroFormularioIva,this,true,"nombreGrupoParametroFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GrupoParametroFormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarParametroFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Formulario Ivas");
				tableColumn.setHeaderValue("Parametro Formulario Ivas");
				tableColumn.setCellRenderer(new ParametroFormularioIvaTableCell(grupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaGrupoParametroFormularioIva));
				tableColumn.setCellEditor(new ParametroFormularioIvaTableCell(grupoparametroformularioivaConstantesFunciones.resaltarParametroFormularioIvaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarParametroFormularioIvaGrupoParametroFormularioIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormularioIva && this.grupoparametroformularioivaConstantesFunciones.mostrarFormularioIvaGrupoParametroFormularioIva && !GrupoParametroFormularioIvaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formulario Ivas");
				tableColumn.setHeaderValue("Formulario Ivas");
				tableColumn.setCellRenderer(new FormularioIvaTableCell(grupoparametroformularioivaConstantesFunciones.resaltarFormularioIvaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarFormularioIvaGrupoParametroFormularioIva));
				tableColumn.setCellEditor(new FormularioIvaTableCell(grupoparametroformularioivaConstantesFunciones.resaltarFormularioIvaGrupoParametroFormularioIva,this,this.grupoparametroformularioivaConstantesFunciones.activarFormularioIvaGrupoParametroFormularioIva));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
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
			
			this.jTableDatosGrupoParametroFormularioIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGrupoParametroFormularioIva.moveColumn(this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGrupoParametroFormularioIva.moveColumn(this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosGrupoParametroFormularioIva.moveColumn(this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGrupoParametroFormularioIva.moveColumn(this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGrupoParametroFormularioIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGrupoParametroFormularioIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGrupoParametroFormularioIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGrupoParametroFormularioIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGrupoParametroFormularioIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGrupoParametroFormularioIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=grupoparametroformularioivas.size()-1;
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
		//this.jTableDatosGrupoParametroFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGrupoParametroFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGrupoParametroFormularioIva();
			
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
				
				//this.isEsNuevoGrupoParametroFormularioIva=false;
					
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
				if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.grupoparametroformularioiva.getsType().equals("DUPLICADO")
				   || this.grupoparametroformularioiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGrupoParametroFormularioIva=true;
				
				} else {
					this.isEsNuevoGrupoParametroFormularioIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					if(this.grupoparametroformularioiva.getId()>=0 && !this.grupoparametroformularioiva.getIsNew()) {						
						this.isEsNuevoGrupoParametroFormularioIva=false;
						
					} else {
						this.isEsNuevoGrupoParametroFormularioIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGrupoParametroFormularioIva(esRelaciones);						
				
				this.seleccionarGrupoParametroFormularioIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.grupoparametroformularioiva.getId()<0) {
					this.isEsNuevoGrupoParametroFormularioIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGrupoParametroFormularioIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGrupoParametroFormularioIva(evt,rowIndex);
				}	
				
				if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GrupoParametroFormularioIva: " + this.dDif); 
					}
				}								
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGrupoParametroFormularioIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.grupoparametroformularioiva)) {
					if(this.grupoparametroformularioiva.getId()>0) {
						this.grupoparametroformularioiva.setIsDeleted(true);
						
						this.grupoparametroformularioivasEliminados.add(this.grupoparametroformularioiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().remove(this.grupoparametroformularioiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.grupoparametroformularioivas.remove(this.grupoparametroformularioiva);				
					}
					
					
					((GrupoParametroFormularioIvaModel) this.jTableDatosGrupoParametroFormularioIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGrupoParametroFormularioIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGrupoParametroFormularioIva) {
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGrupoParametroFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.grupoparametroformularioivaConstantesFunciones.cargarid_empresaGrupoParametroFormularioIva || this.grupoparametroformularioivaConstantesFunciones.event_dependid_empresaGrupoParametroFormularioIva) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.grupoparametroformularioiva.getid_empresa());
									//this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(grupoparametroformularioiva.getEmpresa()!=null) {
							this.empresasForeignKey.add(grupoparametroformularioiva.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.grupoparametroformularioiva.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGrupoParametroFormularioIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGrupoParametroFormularioIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGrupoParametroFormularioIva(grupoparametroformularioiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(grupoparametroformularioiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGrupoParametroFormularioIva(grupoparametroformularioiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGrupoParametroFormularioIva(grupoparametroformularioiva);
	}
	
	public void setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setText(grupoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setText(grupoparametroformularioiva.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GrupoParametroFormularioIva grupoparametroformularioivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,grupoparametroformularioivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GrupoParametroFormularioIva grupoparametroformularioivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				grupoparametroformularioivaLocal=this.grupoparametroformularioiva;
			} else {
				grupoparametroformularioivaLocal=this.grupoparametroformularioivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(grupoparametroformularioivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGrupoParametroFormularioIva(grupoparametroformularioivaLocal,true);
					
					if(grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(grupoparametroformularioivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(grupoparametroformularioivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(grupoparametroformularioiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(grupoparametroformularioiva);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(grupoparametroformularioiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.getText()==null || this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.getText()=="" || this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.getText()=="Id") {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setText("0");
			}

			if(conColumnasBase) {grupoparametroformularioiva.setId(Long.parseLong(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelIdGrupoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			grupoparametroformularioiva.setnombre(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelnombreGrupoParametroFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioivaBean,GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioivaOrigen,GrupoParametroFormularioIva grupoparametroformularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoparametroformularioivaOrigen.getId()!=null && !grupoparametroformularioivaOrigen.getId().equals(0L))) {grupoparametroformularioiva.setId(grupoparametroformularioivaOrigen.getId());}}
			if(conDefault || (!conDefault && grupoparametroformularioivaOrigen.getnombre()!=null && !grupoparametroformularioivaOrigen.getnombre().equals(""))) {grupoparametroformularioiva.setnombre(grupoparametroformularioivaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setText(grupoparametroformularioiva.getId().toString());
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setText(grupoparametroformularioiva.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGrupoParametroFormularioIva(GrupoParametroFormularioIvaBean grupoparametroformularioivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setText(grupoparametroformularioivaBean.getId().toString());
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setText(grupoparametroformularioivaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGrupoParametroFormularioIva(GrupoParametroFormularioIvaParameterReturnGeneral grupoparametroformularioivaReturnGeneral,GrupoParametroFormularioIvaBean grupoparametroformularioivaBean,Boolean conDefault) throws Exception { 
		try {
			GrupoParametroFormularioIva grupoparametroformularioivaLocal=new GrupoParametroFormularioIva();
			
			grupoparametroformularioivaLocal=grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && grupoparametroformularioivaLocal.getId()!=null && !grupoparametroformularioivaLocal.getId().equals(0L))) {grupoparametroformularioivaBean.setId(grupoparametroformularioivaLocal.getId());}}
			if(conDefault || (!conDefault && grupoparametroformularioivaLocal.getnombre()!=null && !grupoparametroformularioivaLocal.getnombre().equals(""))) {grupoparametroformularioivaBean.setnombre(grupoparametroformularioivaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGrupoParametroFormularioIvaGenerico(Long idGrupoParametroFormularioIvaSeleccionado,JComboBox jComboBoxGrupoParametroFormularioIva,List<GrupoParametroFormularioIva> grupoparametroformularioivasLocal)throws Exception {
		try {
			GrupoParametroFormularioIva  grupoparametroformularioivaTemp=null;

			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasLocal) {
				if(grupoparametroformularioivaAux.getId()!=null && grupoparametroformularioivaAux.getId().equals(idGrupoParametroFormularioIvaSeleccionado)) {
					grupoparametroformularioivaTemp=grupoparametroformularioivaAux;
					break;
				}
			}

			jComboBoxGrupoParametroFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGrupoParametroFormularioIvaGenerico(JComboBox jComboBoxGrupoParametroFormularioIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoParametroFormularioIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGrupoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGrupoParametroFormularioIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGrupoParametroFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroFormularioIva")) {
			jButtonParametroFormularioIvaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormularioIva")) {
			jButtonFormularioIvaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoparametroformularioiva=(GrupoParametroFormularioIva) grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoparametroformularioiva =(GrupoParametroFormularioIva) grupoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!grupoparametroformularioiva.getIsNew() && !grupoparametroformularioiva.getIsChanged() && !grupoparametroformularioiva.getIsDeleted()) {
				sDescripcion=grupoparametroformularioiva.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=grupoparametroformularioiva.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GrupoParametroFormularioIva grupoparametroformularioivaRow=new GrupoParametroFormularioIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoparametroformularioivaRow=(GrupoParametroFormularioIva) grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			grupoparametroformularioivaRow=(GrupoParametroFormularioIva) grupoparametroformularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroFormularioIvaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioiva = (GrupoParametroFormularioIva)this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupoparametroformularioiva = (GrupoParametroFormularioIva)this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupoparametroformularioiva!=null) {
						this.grupoparametroformularioiva = grupoparametroformularioiva;
					} else {
						this.grupoparametroformularioiva = new GrupoParametroFormularioIva();
					}
				}

				if(this.isTienePermisosParametroFormularioIva && this.permiteMantenimiento(this.grupoparametroformularioiva)) {
					ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup;
					} else {
						parametroformularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame;
					}

					List<GrupoParametroFormularioIva> grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
					grupoparametroformularioivas.add(this.grupoparametroformularioiva);
					if(!esRelacionado) {
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
						//parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.cargarParametroFormularioIvaBeanSwingJInternalFrame(grupoparametroformularioivas,this.grupoparametroformularioiva,parametroformularioivaBeanSwingJInternalFrame,/*conInicializar,*/parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getConGuardarRelaciones(),parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.getEsGuardarRelacionado());
					parametroformularioivaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");

						parametroformularioivaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA + (ParametroFormularioIvaConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroformularioivaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosGrupoParametroFormularioIva.getBorder();
						TitledBorder titledBorderParametroFormularioIva=(TitledBorder)parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getBorder();

						titledBorderParametroFormularioIva.setTitle(titledBorderGrupoParametroFormularioIva.getTitle() + " -> Parametro Formulario Iva");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroformularioivaBeanSwingJInternalFrame);
						}

						parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroformularioivaBeanSwingJInternalFrame);

						parametroformularioivaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Formulario Iva",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormularioIvaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GrupoParametroFormularioIva grupoparametroformularioiva) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioiva = (GrupoParametroFormularioIva)this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.grupoparametroformularioiva = (GrupoParametroFormularioIva)this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(grupoparametroformularioiva!=null) {
						this.grupoparametroformularioiva = grupoparametroformularioiva;
					} else {
						this.grupoparametroformularioiva = new GrupoParametroFormularioIva();
					}
				}

				if(this.isTienePermisosFormularioIva && this.permiteMantenimiento(this.grupoparametroformularioiva)) {
					FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup=new FormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup;
					} else {
						formularioivaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame;
					}

					List<GrupoParametroFormularioIva> grupoparametroformularioivas=new ArrayList<GrupoParametroFormularioIva>();
					grupoparametroformularioivas.add(this.grupoparametroformularioiva);
					if(!esRelacionado) {
						//formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setConGuardarRelaciones(false);
						//formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formularioivaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.cargarFormularioIvaBeanSwingJInternalFrame(grupoparametroformularioivas,this.grupoparametroformularioiva,formularioivaBeanSwingJInternalFrame,/*conInicializar,*/formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getConGuardarRelaciones(),formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.getEsGuardarRelacionado());
					formularioivaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("no_relacionado");

						formularioivaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormularioIvaConstantesFunciones.ITAMANIOFILATABLA + (FormularioIvaConstantesFunciones.ITAMANIOFILATABLA/2));

						formularioivaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGrupoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosGrupoParametroFormularioIva.getBorder();
						TitledBorder titledBorderFormularioIva=(TitledBorder)formularioivaBeanSwingJInternalFrame.jScrollPanelDatosFormularioIva.getBorder();

						titledBorderFormularioIva.setTitle(titledBorderGrupoParametroFormularioIva.getTitle() + " -> Formulario Iva");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formularioivaBeanSwingJInternalFrame);
						}

						formularioivaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formularioivaBeanSwingJInternalFrame);

						formularioivaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formulario Iva",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));			
			this.jButtonDuplicarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva && this.isPermisoDuplicarGrupoParametroFormularioIva));			
			this.jButtonCopiarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva && this.isPermisoCopiarGrupoParametroFormularioIva));
			this.jButtonVerFormGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva && this.isPermisoVerFormGrupoParametroFormularioIva));
			
			this.jButtonAbrirOrderByGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));			
			
			this.jButtonNuevoRelacionesGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarGrupoParametroFormularioIva && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva && this.isPermisoEliminarGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva);							
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));						
			this.jButtonDuplicarToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva && this.isPermisoDuplicarGrupoParametroFormularioIva));						
			this.jButtonCopiarToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva && this.isPermisoCopiarGrupoParametroFormularioIva));			
			this.jButtonVerFormToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva && this.isPermisoVerFormGrupoParametroFormularioIva));			
			this.jButtonAbrirOrderByToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));
			this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));			
			this.jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));			
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarGrupoParametroFormularioIva && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva  && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva && this.isPermisoEliminarGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarToolBarGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva);				
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));			
			this.jMenuItemDuplicarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva && this.isPermisoDuplicarGrupoParametroFormularioIva));			
			this.jMenuItemCopiarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva && this.isPermisoCopiarGrupoParametroFormularioIva));			
			this.jMenuItemVerFormGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva && this.isPermisoVerFormGrupoParametroFormularioIva));			
			this.jMenuItemAbrirOrderByGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));			
			//this.jMenuItemMostrarOcultarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));
			this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));			
			//this.jMenuItemDetalleMostrarOcultarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva && this.isPermisoOrdenGrupoParametroFormularioIva));			
			this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva));			
			this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva && this.isPermisoNuevoGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));									
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemModificarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaModificarGrupoParametroFormularioIva && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemActualizarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva && this.isPermisoActualizarGrupoParametroFormularioIva));	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemEliminarGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva && this.isPermisoEliminarGrupoParametroFormularioIva));
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemCancelarGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva);				
			}
			
			this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));						
			this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=this.jButtonNuevoGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva=this.jButtonDuplicarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva=this.jButtonCopiarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva=this.jButtonVerFormGrupoParametroFormularioIva.isVisible();
			
			this.isVisibilidadCeldaOrdenGrupoParametroFormularioIva=this.jButtonAbrirOrderByGrupoParametroFormularioIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=this.jButtonNuevoRelacionesGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=this.jButtonModificarGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=this.jButtonNuevoToolBarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarToolBarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarToolBarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarToolBarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarToolBarGrupoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=this.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=this.jMenuItemNuevoGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemModificarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemActualizarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemEliminarGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemCancelarGrupoParametroFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGrupoParametroFormularioIva(Boolean esInicializar) {
		if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
				//if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoParametroFormularioIva();
			}
			
			this.inicializarActualizarBindingBotonesManualGrupoParametroFormularioIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGrupoParametroFormularioIva() {
		this.jButtonNuevoGrupoParametroFormularioIva.setVisible(this.isPermisoNuevoGrupoParametroFormularioIva);			
		this.jButtonDuplicarGrupoParametroFormularioIva.setVisible(this.isPermisoDuplicarGrupoParametroFormularioIva);			
		this.jButtonCopiarGrupoParametroFormularioIva.setVisible(this.isPermisoCopiarGrupoParametroFormularioIva);			
		this.jButtonVerFormGrupoParametroFormularioIva.setVisible(this.isPermisoVerFormGrupoParametroFormularioIva);			
		
		this.jButtonAbrirOrderByGrupoParametroFormularioIva.setVisible(this.isPermisoOrdenGrupoParametroFormularioIva);					
		
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.setVisible(this.isPermisoNuevoGrupoParametroFormularioIva);			
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarGrupoParametroFormularioIva);	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarGrupoParametroFormularioIva);	
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.setVisible(this.isPermisoEliminarGrupoParametroFormularioIva);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva);						
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.setVisible(this.isPermisoGuardarCambiosGrupoParametroFormularioIva);							
		}
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarGrupoParametroFormularioIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoParametroFormularioIva() {
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarGrupoParametroFormularioIva);	
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.setVisible(this.isPermisoActualizarGrupoParametroFormularioIva);	
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.setVisible(this.isPermisoEliminarGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.setVisible(this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva);							
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.setVisible((this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva && this.isPermisoGuardarCambiosGrupoParametroFormularioIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGrupoParametroFormularioIva() {
		if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGrupoParametroFormularioIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGrupoParametroFormularioIva() {
	}
	
	public void jTableDatosGrupoParametroFormularioIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGrupoParametroFormularioIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.getgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoparametroformularioiva==null) {
						this.grupoparametroformularioiva = new GrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				}

				if(this.grupoparametroformularioiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.grupoparametroformularioiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGrupoParametroFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGrupoParametroFormularioIva(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGrupoParametroFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGrupoParametroFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.getgrupoparametroformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.grupoparametroformularioivaLogic.getConnexion());

				if(this.grupoparametroformularioiva.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.grupoparametroformularioiva.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGrupoParametroFormularioIva=(TitledBorder)this.jScrollPanelDatosGrupoParametroFormularioIva.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGrupoParametroFormularioIva.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.getgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoparametroformularioiva==null) {
						this.grupoparametroformularioiva = new GrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				}

				if(this.grupoparametroformularioiva.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.grupoparametroformularioiva.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreGrupoParametroFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.getgrupoparametroformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.grupoparametroformularioiva==null) {
						this.grupoparametroformularioiva = new GrupoParametroFormularioIva();
					}

					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);
				}

				if(this.grupoparametroformularioiva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.grupoparametroformularioiva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);

			this.getGrupoParametroFormularioIvasBusquedaPorId();

			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);

			//if(GrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);

			this.getGrupoParametroFormularioIvasBusquedaPorNombre();

			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);

			//if(GrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGrupoParametroFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);

			this.getGrupoParametroFormularioIvasFK_IdEmpresa();

			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);

			//if(GrupoParametroFormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.grupoparametroformularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGrupoParametroFormularioIva() {
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
		

		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.dispose();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
			this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.dispose();
			this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva=null;
		}
		
		if(this.jInternalFrameImportacionGrupoParametroFormularioIva!=null) {
			this.jInternalFrameImportacionGrupoParametroFormularioIva.setVisible(false);	    			
			this.jInternalFrameImportacionGrupoParametroFormularioIva.dispose();
			this.jInternalFrameImportacionGrupoParametroFormularioIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGrupoParametroFormularioIva();
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGrupoParametroFormularioIva")) {
				jButtonDuplicarGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGrupoParametroFormularioIva")) {
				jButtonCopiarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormGrupoParametroFormularioIva")) {
				jButtonVerFormGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGrupoParametroFormularioIva")) {
				jButtonDuplicarGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGrupoParametroFormularioIva")) {
				jButtonDuplicarGrupoParametroFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGrupoParametroFormularioIva")) {
				jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGrupoParametroFormularioIva")) {
				jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGrupoParametroFormularioIva")) {
				jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGrupoParametroFormularioIva")) {
				jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGrupoParametroFormularioIva")) {
				jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGrupoParametroFormularioIva")) {
				jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarGrupoParametroFormularioIva")) {
				jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGrupoParametroFormularioIva")) {
				jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGrupoParametroFormularioIva")) {
				jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarGrupoParametroFormularioIva")) {
				jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGrupoParametroFormularioIva")) {
				jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGrupoParametroFormularioIva")) {
				jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarGrupoParametroFormularioIva")) {
				jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGrupoParametroFormularioIva")) {
				jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGrupoParametroFormularioIva")) {
				jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGrupoParametroFormularioIva")) {
				jButtonMostrarOcultarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGrupoParametroFormularioIva")) {
				jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGrupoParametroFormularioIva")) {
				jButtonCopiarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGrupoParametroFormularioIva")) {
				jButtonVerFormGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGrupoParametroFormularioIva")) {
				jButtonCopiarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGrupoParametroFormularioIva")) {
				jButtonVerFormGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGrupoParametroFormularioIva")) {
				jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGrupoParametroFormularioIva")) {
				jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGrupoParametroFormularioIva")) {
				jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGrupoParametroFormularioIva")) {
				jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGrupoParametroFormularioIva")) {
				jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGrupoParametroFormularioIva")) {
				jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGrupoParametroFormularioIva") || sTipo.equals("MenuItemDetalleAbrirOrderByGrupoParametroFormularioIva")) {
				jButtonAbrirOrderByGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGrupoParametroFormularioIva") || sTipo.equals("MenuItemDetalleMostrarOcultarGrupoParametroFormularioIva")) {
				jButtonMostrarOcultarGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGrupoParametroFormularioIva")) {
				jButtonCerrarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGrupoParametroFormularioIva")) {
				jButtonGenerarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGrupoParametroFormularioIva")) {
				
				jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGrupoParametroFormularioIva")) {
				jButtonCerrarImportacionGrupoParametroFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGrupoParametroFormularioIva")) {
				
				jButtonGenerarImportacionGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGrupoParametroFormularioIva")) {
				
				jButtonAbrirImportacionGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGrupoParametroFormularioIva")) {
				jComboBoxTiposAccionesGrupoParametroFormularioIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGrupoParametroFormularioIva")) {
				jComboBoxTiposRelacionesGrupoParametroFormularioIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGrupoParametroFormularioIva")) {
				jComboBoxTiposAccionesGrupoParametroFormularioIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGrupoParametroFormularioIva")) {
				
				jComboBoxTiposSeleccionarGrupoParametroFormularioIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGrupoParametroFormularioIva")) {
				jTextFieldValorCampoGeneralGrupoParametroFormularioIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGrupoParametroFormularioIva")) {
				jButtonAbrirOrderByGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGrupoParametroFormularioIva")) {
				jButtonAbrirOrderByGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGrupoParametroFormularioIva")) {
				jButtonCerrarOrderByGrupoParametroFormularioIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonidGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoParametroFormularioIvaUpdate")) {
				this.jButtonid_empresaGrupoParametroFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonid_empresaGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdGrupoParametroFormularioIva")) {
				this.jButtonBusquedaPorIdGrupoParametroFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreGrupoParametroFormularioIva")) {
				this.jButtonBusquedaPorNombreGrupoParametroFormularioIvaActionPerformed(evt);
			}
			
			;
			
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGrupoParametroFormularioIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GrupoParametroFormularioIva grupoparametroformularioivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				grupoparametroformularioivaLocal=this.grupoparametroformularioiva;
			} else {
				grupoparametroformularioivaLocal=this.grupoparametroformularioivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
							
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
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
			
			


			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
								
						
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
								
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
							
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
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
			
			


			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
								
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGrupoParametroFormularioIva")) {
					jCheckBoxSeleccionarTodosGrupoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGrupoParametroFormularioIva")) {
					jCheckBoxSeleccionadosGrupoParametroFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGrupoParametroFormularioIva")) {
					
				}
				
				


				
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
												
				
				


				
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
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
			
			


			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.grupoparametroformularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.grupoparametroformularioiva);
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
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
				
				


				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GrupoParametroFormularioIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GrupoParametroFormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGrupoParametroFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.grupoparametroformularioivaAnterior =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGrupoParametroFormularioIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGrupoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGrupoParametroFormularioIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.grupoparametroformularioiva =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.grupoparametroformularioiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGrupoParametroFormularioIva")) {
				
				}
				
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGrupoParametroFormularioIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGrupoParametroFormularioIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGrupoParametroFormularioIva")) {
			
			}
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGrupoParametroFormularioIva();
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("NuevoGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGrupoParametroFormularioIva")) {
				jButtonDuplicarGrupoParametroFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGrupoParametroFormularioIva")) {
				jButtonCopiarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGrupoParametroFormularioIva")) {
				jButtonVerFormGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGrupoParametroFormularioIva")) {
				jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGrupoParametroFormularioIva")) {
				jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGrupoParametroFormularioIva")) {
				jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGrupoParametroFormularioIva")) {
				jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGrupoParametroFormularioIva")) {
				jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGrupoParametroFormularioIva")) {
				jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGrupoParametroFormularioIva")) {
				jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGrupoParametroFormularioIva")) {
				jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGrupoParametroFormularioIva")) {
				jButtonAbrirOrderByGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGrupoParametroFormularioIva")) {
				jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGrupoParametroFormularioIva")) {
				jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGrupoParametroFormularioIva")) {
				jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonidGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGrupoParametroFormularioIvaUpdate")) {
				this.jButtonid_empresaGrupoParametroFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonid_empresaGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreGrupoParametroFormularioIvaBusqueda")) {
				this.jButtonnombreGrupoParametroFormularioIvaBusquedaActionPerformed(evt);
			}
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGrupoParametroFormularioIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGrupoParametroFormularioIva")) {
				closingInternalFrameGrupoParametroFormularioIva();
				
			} else if(sTipo.equals("jButtonCancelarGrupoParametroFormularioIva")) {
				JInternalFrameBase jInternalFrameDetalleFormGrupoParametroFormularioIva = (JInternalFrameBase)evt.getSource();
	            	
	            GrupoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(GrupoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoParametroFormularioIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGrupoParametroFormularioIvaActionPerformed(null);
			}
			
			GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.grupoparametroformularioiva,new Object(),this.grupoparametroformularioivaParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGrupoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGrupoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGrupoParametroFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.grupoparametroformularioiva)) {
			if(!esControlTabla) {
				if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);			
				}
				
				if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoparametroformularioivaReturnGeneral=grupoparametroformularioivaLogic.procesarEventosGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),this.grupoparametroformularioiva,this.grupoparametroformularioivaParameterGeneral,this.isEsNuevoGrupoParametroFormularioIva,classes);//this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral,this.grupoparametroformularioivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGrupoParametroFormularioIva(classes,this.grupoparametroformularioivaReturnGeneral,this.grupoparametroformularioivaBean,false);
					}
						
					if(this.grupoparametroformularioivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva());	
					}
						
					if(this.grupoparametroformularioivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva(),classes);//this.grupoparametroformularioivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGrupoParametroFormularioIva(this.grupoparametroformularioiva,classes);//this.grupoparametroformularioivaBean);									
				}
			
				if(GrupoParametroFormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGrupoParametroFormularioIva(this.grupoparametroformularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGrupoParametroFormularioIva(this.grupoparametroformularioiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.grupoparametroformularioivaAnterior!=null) {
						this.grupoparametroformularioiva=this.grupoparametroformularioivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.grupoparametroformularioivaReturnGeneral=grupoparametroformularioivaLogic.procesarEventosGrupoParametroFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas(),this.grupoparametroformularioiva,this.grupoparametroformularioivaParameterGeneral,this.isEsNuevoGrupoParametroFormularioIva,classes);//this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva(),grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva(),this.grupoparametroformularioivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGrupoParametroFormularioIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosGrupoParametroFormularioIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGrupoParametroFormularioIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosGrupoParametroFormularioIva() throws Exception {
		
		GrupoParametroFormularioIvaModel grupoparametroformularioivaModel=(GrupoParametroFormularioIvaModel)this.jTableDatosGrupoParametroFormularioIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			grupoparametroformularioivaModel.grupoparametroformularioivas=this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			grupoparametroformularioivaModel.grupoparametroformularioivas=this.grupoparametroformularioivas;
		}
		
		
		((GrupoParametroFormularioIvaModel) this.jTableDatosGrupoParametroFormularioIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGrupoParametroFormularioIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgrupoparametroformularioivaAnterior(),this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgrupoparametroformularioivaAnterior(),this.grupoparametroformularioivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGrupoParametroFormularioIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(grupoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(grupoparametroformularioiva.getFormularioIvas());
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
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
										
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsOfGrupoParametroFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GrupoParametroFormularioIvaConstantesFunciones.getClassesRelationshipsFromStringsOfGrupoParametroFormularioIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGrupoParametroFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.grupoparametroformularioiva,new Object(),generalEntityParameterGeneral,this.grupoparametroformularioivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGrupoParametroFormularioIva(GrupoParametroFormularioIvaBean grupoparametroformularioivaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.setParametroFormularioIvas(grupoparametroformularioiva.getParametroFormularioIvas());
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.setFormularioIvas(grupoparametroformularioiva.getFormularioIvas());
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGrupoParametroFormularioIva(ArrayList<Classe> classes,GrupoParametroFormularioIvaReturnGeneral grupoparametroformularioivaReturnGeneral,GrupoParametroFormularioIvaBean grupoparametroformularioivaBean,Boolean conDefault) throws Exception {
		
			this.grupoparametroformularioivaBean.setParametroFormularioIvas(grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva().getParametroFormularioIvas());
			this.grupoparametroformularioivaBean.setFormularioIvas(grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva().getFormularioIvas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFormularioIva.class)) {
					grupoparametroformularioiva.setParametroFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaLogic.getParametroFormularioIvas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormularioIva.class)) {
					grupoparametroformularioiva.setFormularioIvas(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaBeanSwingJInternalFrame.formularioivaLogic.getFormularioIvas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.grupoparametroformularioiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva = new GrupoParametroFormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones(),this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setVisible(false);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.grupoparametroformularioivaLogic=this.grupoparametroformularioivaLogic;
		
		this.cargarCombosFrameForeignKeyGrupoParametroFormularioIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGrupoParametroFormularioIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGrupoParametroFormularioIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGrupoParametroFormularioIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGrupoParametroFormularioIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoParametroFormularioIva"));
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarGrupoParametroFormularioIva"));

		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemModificarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoParametroFormularioIva"));
						
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemActualizarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoParametroFormularioIva"));
								
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemEliminarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarGrupoParametroFormularioIva"));
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoParametroFormularioIva"));
					
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemCancelarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoParametroFormularioIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemDetalleCerrarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoParametroFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoParametroFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoParametroFormularioIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonidGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonnombreGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoParametroFormularioIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoParametroFormularioIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGrupoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGrupoParametroFormularioIva"));
		}
		
		this.jTableDatosGrupoParametroFormularioIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGrupoParametroFormularioIva"));
		
		this.jTableDatosGrupoParametroFormularioIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGrupoParametroFormularioIva"));
		
		this.jButtonNuevoGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoGrupoParametroFormularioIva"));
		
		this.jButtonDuplicarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarGrupoParametroFormularioIva"));
		
		this.jButtonCopiarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"CopiarGrupoParametroFormularioIva"));
		
		this.jButtonVerFormGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"VerFormGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarGrupoParametroFormularioIva"));
			
		this.jButtonDuplicarToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGrupoParametroFormularioIva"));
			
		this.jMenuItemDuplicarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGrupoParametroFormularioIva"));		
		
		
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGrupoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonModificarToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarGrupoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemModificarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonActualizarToolBarGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGrupoParametroFormularioIva"));
				
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemActualizarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonEliminarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarGrupoParametroFormularioIva"));
						
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemEliminarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonCancelarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarGrupoParametroFormularioIva"));
			
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemCancelarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGrupoParametroFormularioIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGrupoParametroFormularioIva"));		
		
		
		this.jButtonCerrarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarGrupoParametroFormularioIva"));
		
		
		this.jButtonCerrarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemCerrarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGrupoParametroFormularioIva"));
			
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jMenuItemDetalleCerrarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGrupoParametroFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosGrupoParametroFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGrupoParametroFormularioIva"));
		}
		
		this.jButtonCopiarToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarGrupoParametroFormularioIva"));
			
		this.jButtonVerFormToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarGrupoParametroFormularioIva"));
		
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGrupoParametroFormularioIva"));
			
		this.jMenuItemCopiarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGrupoParametroFormularioIva"));		
		
		this.jMenuItemVerFormGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGrupoParametroFormularioIva"));		
		
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoParametroFormularioIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGrupoParametroFormularioIva"));		
		
		
		
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionGrupoParametroFormularioIva"));
					
		this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGrupoParametroFormularioIva"));
		
		this.jMenuItemRecargarInformacionGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGrupoParametroFormularioIva"));		
		
		
		
		this.jButtonAnterioresGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresGrupoParametroFormularioIva"));
		
		
		this.jButtonAnterioresToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGrupoParametroFormularioIva"));
		
		this.jMenuItemAnterioresGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGrupoParametroFormularioIva"));		
		
		
		this.jButtonSiguientesGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesGrupoParametroFormularioIva"));
		
		
		this.jButtonSiguientesToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemSiguientesGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGrupoParametroFormularioIva"));
			
		this.jMenuItemAbrirOrderByGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGrupoParametroFormularioIva"));
			
		this.jMenuItemMostrarOcultarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGrupoParametroFormularioIva"));
			
		this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGrupoParametroFormularioIva"));
			
		this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGrupoParametroFormularioIva"));		
		
		
		this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGrupoParametroFormularioIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGrupoParametroFormularioIva"));
			
		this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGrupoParametroFormularioIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGrupoParametroFormularioIva"));

		this.jCheckBoxSeleccionadosGrupoParametroFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGrupoParametroFormularioIva"));
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGrupoParametroFormularioIva"));
		}
		
		
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesGrupoParametroFormularioIva"));
			
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesGrupoParametroFormularioIva"));
					
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGrupoParametroFormularioIva"));
			
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGrupoParametroFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonidGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonnombreGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoParametroFormularioIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdGrupoParametroFormularioIva"));

			this.jButtonBusquedaPorNombreGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoParametroFormularioIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoParametroFormularioIva"));
				this.jInternalFrameReporteDinamicoGrupoParametroFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoParametroFormularioIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGrupoParametroFormularioIva"));				
			//this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGrupoParametroFormularioIva"));
			//this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGrupoParametroFormularioIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGrupoParametroFormularioIva!=null) {
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGrupoParametroFormularioIva"));
				this.jInternalFrameImportacionGrupoParametroFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGrupoParametroFormularioIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByGrupoParametroFormularioIva"));
			
			this.jButtonAbrirOrderByToolBarGrupoParametroFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGrupoParametroFormularioIva"));			
			
			if(this.jInternalFrameOrderByGrupoParametroFormularioIva!=null) {
				this.jInternalFrameOrderByGrupoParametroFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGrupoParametroFormularioIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTabbedPaneRelacionesGrupoParametroFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGrupoParametroFormularioIva"));
		
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
            		closingInternalFrameGrupoParametroFormularioIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGrupoParametroFormularioIva = (JInternalFrameBase)event.getSource();
	            	
	            GrupoParametroFormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(GrupoParametroFormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormGrupoParametroFormularioIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGrupoParametroFormularioIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGrupoParametroFormularioIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGrupoParametroFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGrupoParametroFormularioIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGrupoParametroFormularioIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoRelacionesGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGrupoParametroFormularioIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGrupoParametroFormularioIva";
		inputMap = this.jButtonModificarGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGrupoParametroFormularioIva";
		inputMap = this.jButtonActualizarGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGrupoParametroFormularioIva";
		inputMap = this.jButtonEliminarGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGrupoParametroFormularioIva";
		inputMap = this.jButtonCancelarGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGrupoParametroFormularioIva";
		inputMap = this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonGuardarCambiosGrupoParametroFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGrupoParametroFormularioIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGrupoParametroFormularioIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGrupoParametroFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonidGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idGrupoParametroFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGrupoParametroFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jButtonnombreGrupoParametroFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreGrupoParametroFormularioIvaBusqueda"));
		
		
		this.jButtonBusquedaPorIdGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorIdGrupoParametroFormularioIva"));

		this.jButtonBusquedaPorNombreGrupoParametroFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreGrupoParametroFormularioIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGrupoParametroFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGrupoParametroFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGrupoParametroFormularioIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGrupoParametroFormularioIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
					grupoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivas) {
					grupoparametroformularioivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGrupoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
						grupoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivas) {
						grupoparametroformularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGrupoParametroFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGrupoParametroFormularioIva.getSelectedRows();
			
			GrupoParametroFormularioIva grupoparametroformularioivaLocal=new GrupoParametroFormularioIva();
			
			//this.seleccionarTodosGrupoParametroFormularioIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLocal =(GrupoParametroFormularioIva) this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas().toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					grupoparametroformularioivaLocal =(GrupoParametroFormularioIva) this.grupoparametroformularioivas.toArray()[this.jTableDatosGrupoParametroFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				grupoparametroformularioivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
						grupoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivas) {
						grupoparametroformularioivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGrupoParametroFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGrupoParametroFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGrupoParametroFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGrupoParametroFormularioIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGrupoParametroFormularioIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGrupoParametroFormularioIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
				
						if(sTipoSeleccionar.equals(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivas) {
					
						if(sTipoSeleccionar.equals(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							grupoparametroformularioivaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGrupoParametroFormularioIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGrupoParametroFormularioIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGrupoParametroFormularioIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGrupoParametroFormularioIva) {				
					conSplash=true;//false;										
					
					//this.startProcessGrupoParametroFormularioIva(conSplash);
				
					this.generarReporteGrupoParametroFormularioIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGrupoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoParametroFormularioIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGrupoParametroFormularioIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoParametroFormularioIva();
				
				this.exportarGrupoParametroFormularioIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGrupoParametroFormularioIvas();
				//this.importarGrupoParametroFormularioIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGrupoParametroFormularioIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGrupoParametroFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Grupo Parametro Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGrupoParametroFormularioIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGrupoParametroFormularioIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGrupoParametroFormularioIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGrupoParametroFormularioIva();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGrupoParametroFormularioIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGrupoParametroFormularioIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGrupoParametroFormularioIva();
			
			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
			GrupoParametroFormularioIva grupoparametroformularioiva=new GrupoParametroFormularioIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGrupoParametroFormularioIva.getSelectedItem();
			
			
			
			
			grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(grupoparametroformularioivasSeleccionados.size()==1) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
					grupoparametroformularioiva=grupoparametroformularioivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Formulario Iva")) {
					jButtonParametroFormularioIvaActionPerformed(null,rowIndex,true,false,grupoparametroformularioiva);
				}
				else if(this.sTipoRelacion.equals("Formulario Iva")) {
					jButtonFormularioIvaActionPerformed(null,rowIndex,true,false,grupoparametroformularioiva);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGrupoParametroFormularioIva();
			
      		//this.finishProcessGrupoParametroFormularioIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGrupoParametroFormularioIvaReturnGeneral() throws Exception {
		if(this.grupoparametroformularioivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.grupoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.grupoparametroformularioivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.grupoparametroformularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.grupoparametroformularioivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.grupoparametroformularioivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
		}
		
		if(this.grupoparametroformularioivaReturnGeneral.getConRetornoLista() || this.grupoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
			if(this.grupoparametroformularioivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoparametroformularioivaLogic.setGrupoParametroFormularioIvas(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.grupoparametroformularioivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.grupoparametroformularioivaLogic.setGrupoParametroFormularioIva(this.grupoparametroformularioivaReturnGeneral.getGrupoParametroFormularioIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGrupoParametroFormularioIva(false);
		}
	}
	
	public void actualizarParametrosGeneralGrupoParametroFormularioIva() throws Exception {
		
		
	}
	
	public ArrayList<GrupoParametroFormularioIva> getGrupoParametroFormularioIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGrupoParametroFormularioIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas()) {
					if(grupoparametroformularioivaAux.getIsSelected()) {
						grupoparametroformularioivasSeleccionados.add(grupoparametroformularioivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GrupoParametroFormularioIva grupoparametroformularioivaAux:this.grupoparametroformularioivas) {
					if(grupoparametroformularioivaAux.getIsSelected()) {
						grupoparametroformularioivasSeleccionados.add(grupoparametroformularioivaAux);				
					}
				}
			}
			
			if(grupoparametroformularioivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						grupoparametroformularioivasSeleccionados.addAll(this.grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						grupoparametroformularioivasSeleccionados.addAll(this.grupoparametroformularioivas);				
					}
				}
			}
		} else {
			grupoparametroformularioivasSeleccionados.add(this.grupoparametroformularioiva);
		}
		
		return grupoparametroformularioivasSeleccionados;
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
	
	public void generarReporteGrupoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoParametroFormularioIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGrupoParametroFormularioIvasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesGrupoParametroFormularioIvasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Grupo Parametro Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados);
		
	}	
	
	public void generarReporteNormalGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGrupoParametroFormularioIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGrupoParametroFormularioIva();
		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGrupoParametroFormularioIva();
		
		
		//this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados ,grupoparametroformularioivaImplementable,grupoparametroformularioivaImplementableHome);
	}
	
	public void mostrarImportacionGrupoParametroFormularioIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGrupoParametroFormularioIva();
		
		this.abrirFrameImportacionGrupoParametroFormularioIva();		
		
			
		//this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados ,grupoparametroformularioivaImplementable,grupoparametroformularioivaImplementableHome);
	}
	
	public void importarGrupoParametroFormularioIvas() throws Exception {		
	
	}
	
	public void exportarGrupoParametroFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGrupoParametroFormularioIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGrupoParametroFormularioIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGrupoParametroFormularioIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Grupo Parametro Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGrupoParametroFormularioIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGrupoParametroFormularioIva(grupoparametroformularioivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//grupoparametroformularioivaAux.setsDetalleGeneralEntityReporte(grupoparametroformularioivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGrupoParametroFormularioIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=grupoparametroformularioiva.getId().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoparametroformularioiva.getempresa_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoparametroformularioiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=grupoparametroformularioiva.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GrupoParametroFormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGrupoParametroFormularioIva(row);				
				iRow++;
			}				
			
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGrupoParametroFormularioIva(grupoparametroformularioivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGrupoParametroFormularioIvasSeleccionados() throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();		
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"grupoparametroformularioiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("grupoparametroformularioivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("grupoparametroformularioiva");
			//elementRoot.appendChild(element);
		
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
				element = document.createElement("grupoparametroformularioiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGrupoParametroFormularioIva(grupoparametroformularioivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Grupo Parametro Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGrupoParametroFormularioIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID);
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(grupoparametroformularioiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoparametroformularioiva.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(grupoparametroformularioiva.getnombre());				
	}
	
	public void setFilaDatosExportarXmlGrupoParametroFormularioIva(GrupoParametroFormularioIva grupoparametroformularioiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GrupoParametroFormularioIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(grupoparametroformularioiva.getId().toString().trim()));
		element.appendChild(elementId);

		Element elementempresa_descripcion = document.createElement(GrupoParametroFormularioIvaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(grupoparametroformularioiva.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GrupoParametroFormularioIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(grupoparametroformularioiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(GrupoParametroFormularioIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(grupoparametroformularioiva.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoGrupoParametroFormularioIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados=new ArrayList<GrupoParametroFormularioIva>();
		
		grupoparametroformularioivasSeleccionados=this.getGrupoParametroFormularioIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGrupoParametroFormularioIva(grupoparametroformularioivasSeleccionados);
		
		this.generarReporteGrupoParametroFormularioIvas("Todos",grupoparametroformularioivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGrupoParametroFormularioIva(ArrayList<GrupoParametroFormularioIva> grupoparametroformularioivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasSeleccionados) {
				grupoparametroformularioivaAux.setsDetalleGeneralEntityReporte(grupoparametroformularioivaAux.toString());
			
				if(sTipoSeleccionar.equals(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					grupoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(grupoparametroformularioivaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					grupoparametroformularioivaAux.setsDescripcionGeneralEntityReporte1(grupoparametroformularioivaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGrupoParametroFormularioIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=true;
				this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=true;
				this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=true;
			}
			
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaModificarGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaCancelarGrupoParametroFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarGrupoParametroFormularioIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=true;
		} else {
			this.actualizarEstadoPanelsGrupoParametroFormularioIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGrupoParametroFormularioIva=false;
			//this.isVisibilidadCeldaVerFormGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaDuplicarGrupoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
		} else {
			this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;												
			}
			
			this.jButtonCerrarGrupoParametroFormularioIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGrupoParametroFormularioIva=false;
		}
		
		if(!this.permiteMantenimiento(this.grupoparametroformularioiva)) {
			this.isVisibilidadCeldaActualizarGrupoParametroFormularioIva=false;
			this.isVisibilidadCeldaEliminarGrupoParametroFormularioIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGrupoParametroFormularioIva() {
		this.isVisibilidadCeldaNuevoGrupoParametroFormularioIva=false;
		this.isVisibilidadCeldaGuardarCambiosGrupoParametroFormularioIva=false;
	}
	
	public void actualizarEstadoPanelsGrupoParametroFormularioIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGrupoParametroFormularioIva!=null) {
				this.jScrollPanelDatosGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionGrupoParametroFormularioIva!=null) {
				this.jPanelPaginacionGrupoParametroFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
					this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva!=null) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGrupoParametroFormularioIva!=null) {
				this.jPanelParametrosReportesGrupoParametroFormularioIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasGrupoParametroFormularioIva.remove(jPanelBusquedaPorIdGrupoParametroFormularioIva);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasGrupoParametroFormularioIva.remove(jPanelBusquedaPorNombreGrupoParametroFormularioIva);}
		}
		
	}
	
	

	public String registrarSesionGrupoParametroFormularioIvaParaParametroFormularioIvas() throws Exception {
		Boolean isPaginaPopupParametroFormularioIva=false;

		try {

			if(this.grupoparametroformularioivaSessionBean==null) {
				this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setsPathNavegacionActual(grupoparametroformularioivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroFormularioIva(true);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFormularioIva(GrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva(true);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.parametroformularioivaSessionBean.setlidGrupoParametroFormularioIvaActual(this.idGrupoParametroFormularioIvaActual);

			grupoparametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoParametroFormularioIva(true);
			grupoparametroformularioivaSessionBean.setlIdGrupoParametroFormularioIvaActualForeignKey(this.idGrupoParametroFormularioIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionGrupoParametroFormularioIvaParaFormularioIvas() throws Exception {
		Boolean isPaginaPopupFormularioIva=false;

		try {

			if(this.grupoparametroformularioivaSessionBean==null) {
				this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
			}

			if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean==null) {
				this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setsPathNavegacionActual(grupoparametroformularioivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormularioIvaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormularioIva=this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormularioIva(true);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormularioIva(GrupoParametroFormularioIvaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva(true);
			this.jInternalFrameDetalleFormGrupoParametroFormularioIva.formularioivaSessionBean.setlidGrupoParametroFormularioIvaActual(this.idGrupoParametroFormularioIvaActual);

			grupoparametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGrupoParametroFormularioIva(true);
			grupoparametroformularioivaSessionBean.setlIdGrupoParametroFormularioIvaActualForeignKey(this.idGrupoParametroFormularioIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		
		if(this.grupoparametroformularioivaSessionBean==null) {
			this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		}
		
		this.grupoparametroformularioivaSessionBean.setsUltimaBusquedaGrupoParametroFormularioIva(this.getsAccionBusqueda());
		this.grupoparametroformularioivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.grupoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			grupoparametroformularioivaSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			grupoparametroformularioivaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			grupoparametroformularioivaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		
		if(this.grupoparametroformularioivaSessionBean==null) {
			this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		}
		
		if(this.grupoparametroformularioivaSessionBean.getsUltimaBusquedaGrupoParametroFormularioIva()!=null&&!this.grupoparametroformularioivaSessionBean.getsUltimaBusquedaGrupoParametroFormularioIva().equals("")) {
			this.setsAccionBusqueda(grupoparametroformularioivaSessionBean.getsUltimaBusquedaGrupoParametroFormularioIva());
			this.setiNumeroPaginacion(grupoparametroformularioivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(grupoparametroformularioivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(grupoparametroformularioivaSessionBean.getid());
				grupoparametroformularioivaSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(grupoparametroformularioivaSessionBean.getnombre());
				grupoparametroformularioivaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(grupoparametroformularioivaSessionBean.getid_empresa());
				grupoparametroformularioivaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.grupoparametroformularioivaSessionBean.setsUltimaBusquedaGrupoParametroFormularioIva("");
		this.grupoparametroformularioivaSessionBean.setiNumeroPaginacion(GrupoParametroFormularioIvaConstantesFunciones.INUMEROPAGINACION);
		this.grupoparametroformularioivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGrupoParametroFormularioIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGrupoParametroFormularioIva() {
		this.updateBorderResaltarBusquedasFormularioGrupoParametroFormularioIva();
		this.updateVisibilidadBusquedasFormularioGrupoParametroFormularioIva();
		this.updateHabilitarBusquedasFormularioGrupoParametroFormularioIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioGrupoParametroFormularioIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponents().length>0) {
	

		if(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdGrupoParametroFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdGrupoParametroFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
				jPanel.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdGrupoParametroFormularioIva);
			}
		}

		if(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreGrupoParametroFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreGrupoParametroFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
				jPanel.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreGrupoParametroFormularioIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGrupoParametroFormularioIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdGrupoParametroFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorIdGrupoParametroFormularioIva);
			if(!this.grupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorIdGrupoParametroFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreGrupoParametroFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorNombreGrupoParametroFormularioIva);
			if(!this.grupoparametroformularioivaConstantesFunciones.mostrarBusquedaPorNombreGrupoParametroFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGrupoParametroFormularioIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdGrupoParametroFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarBusquedaPorIdGrupoParametroFormularioIva);
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setEnabledAt(index,this.grupoparametroformularioivaConstantesFunciones.activarBusquedaPorIdGrupoParametroFormularioIva);
			}

			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreGrupoParametroFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarBusquedaPorNombreGrupoParametroFormularioIva);
				this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setEnabledAt(index,this.grupoparametroformularioivaConstantesFunciones.activarBusquedaPorNombreGrupoParametroFormularioIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGrupoParametroFormularioIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorIdGrupoParametroFormularioIva);

			this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);

			this.grupoparametroformularioivaConstantesFunciones.setResaltarBusquedaPorIdGrupoParametroFormularioIva(resaltar);

			jPanel.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorIdGrupoParametroFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasGrupoParametroFormularioIva.indexOfComponent(this.jPanelBusquedaPorNombreGrupoParametroFormularioIva);

			this.jTabbedPaneBusquedasGrupoParametroFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGrupoParametroFormularioIva.getComponent(index);

			this.grupoparametroformularioivaConstantesFunciones.setResaltarBusquedaPorNombreGrupoParametroFormularioIva(resaltar);

			jPanel.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarBusquedaPorNombreGrupoParametroFormularioIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGrupoParametroFormularioIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGrupoParametroFormularioIva() throws Exception {

		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGrupoParametroFormularioIva();
		this.updateVisibilidadResaltarControlesFormularioGrupoParametroFormularioIva();
		this.updateHabilitarResaltarControlesFormularioGrupoParametroFormularioIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioGrupoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.grupoparametroformularioivaConstantesFunciones.resaltaridGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltaridGrupoParametroFormularioIva);}
		if(this.grupoparametroformularioivaConstantesFunciones.resaltarid_empresaGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarid_empresaGrupoParametroFormularioIva);}
		if(this.grupoparametroformularioivaConstantesFunciones.resaltarnombreGrupoParametroFormularioIva!=null && this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setBorder(this.grupoparametroformularioivaConstantesFunciones.resaltarnombreGrupoParametroFormularioIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGrupoParametroFormularioIva() throws Exception {		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
	
		//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostraridGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelidGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostraridGrupoParametroFormularioIva);
		//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarid_empresaGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelid_empresaGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarid_empresaGrupoParametroFormularioIva);
		//this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarnombreGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jPanelnombreGrupoParametroFormularioIva.setVisible(this.grupoparametroformularioivaConstantesFunciones.mostrarnombreGrupoParametroFormularioIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGrupoParametroFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGrupoParametroFormularioIva!=null) {
	
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jLabelidGrupoParametroFormularioIva.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activaridGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jComboBoxid_empresaGrupoParametroFormularioIva.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarid_empresaGrupoParametroFormularioIva);
		this.jInternalFrameDetalleFormGrupoParametroFormularioIva.jTextAreanombreGrupoParametroFormularioIva.setEnabled(this.grupoparametroformularioivaConstantesFunciones.activarnombreGrupoParametroFormularioIva);
		}
	}
	
		
}