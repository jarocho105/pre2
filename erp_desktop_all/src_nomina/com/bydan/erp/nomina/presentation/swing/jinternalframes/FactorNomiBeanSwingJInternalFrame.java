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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.FactorNomiConstantesFunciones;
import com.bydan.erp.nomina.util.FactorNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FactorNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FactorNomiBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
public class FactorNomiBeanSwingJInternalFrame extends FactorNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FactorNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FactorNomi> factornomiValidator = new ClassValidator<FactorNomi>(FactorNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FactorNomi factornomi;	
	public FactorNomi factornomiAux;
	public FactorNomi factornomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FactorNomi factornomiTotales;
	public Long idFactorNomiActual;
	public Long iIdNuevoFactorNomi=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosFormatoNomiFactorNomi=false;

	public Boolean getIsTienePermisosFormatoNomiFactorNomi() {
		return isTienePermisosFormatoNomiFactorNomi;
	}

	public void setIsTienePermisosFormatoNomiFactorNomi(Boolean isTienePermisosFormatoNomiFactorNomi) {
		this.isTienePermisosFormatoNomiFactorNomi= isTienePermisosFormatoNomiFactorNomi;
	}


	public Boolean isTienePermisosPreguntaNomi=false;

	public Boolean getIsTienePermisosPreguntaNomi() {
		return isTienePermisosPreguntaNomi;
	}

	public void setIsTienePermisosPreguntaNomi(Boolean isTienePermisosPreguntaNomi) {
		this.isTienePermisosPreguntaNomi= isTienePermisosPreguntaNomi;
	}


	public Boolean isTienePermisosFormatoNomiPreguntaNomi=false;

	public Boolean getIsTienePermisosFormatoNomiPreguntaNomi() {
		return isTienePermisosFormatoNomiPreguntaNomi;
	}

	public void setIsTienePermisosFormatoNomiPreguntaNomi(Boolean isTienePermisosFormatoNomiPreguntaNomi) {
		this.isTienePermisosFormatoNomiPreguntaNomi= isTienePermisosFormatoNomiPreguntaNomi;
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
	
	public Boolean isPermisoTodoFactorNomi;
	public Boolean isPermisoNuevoFactorNomi;
	public Boolean isPermisoActualizarFactorNomi;
	public Boolean isPermisoActualizarOriginalFactorNomi;
	public Boolean isPermisoEliminarFactorNomi;
	public Boolean isPermisoGuardarCambiosFactorNomi;
	public Boolean isPermisoConsultaFactorNomi;
	public Boolean isPermisoBusquedaFactorNomi;
	public Boolean isPermisoReporteFactorNomi;
	public Boolean isPermisoPaginacionMedioFactorNomi;
	public Boolean isPermisoPaginacionAltoFactorNomi;
	public Boolean isPermisoPaginacionTodoFactorNomi;
	public Boolean isPermisoCopiarFactorNomi;
	public Boolean isPermisoVerFormFactorNomi;
	public Boolean isPermisoDuplicarFactorNomi;
	public Boolean isPermisoOrdenFactorNomi;
	
	
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
	
	public FactorNomiParameterReturnGeneral factornomiReturnGeneral;
	public FactorNomiParameterReturnGeneral factornomiParameterGeneral;
	
	

	public FormatoNomiFactorNomiLogic formatonomifactornomiLogic=null;

	public FormatoNomiFactorNomiLogic getFormatoNomiFactorNomiLogic() {
		return formatonomifactornomiLogic;
	}

	public void setFormatoNomiFactorNomiLogic(FormatoNomiFactorNomiLogic formatonomifactornomiLogic) {
		this.formatonomifactornomiLogic = formatonomifactornomiLogic;
	}


	public PreguntaNomiLogic preguntanomiLogic=null;

	public PreguntaNomiLogic getPreguntaNomiLogic() {
		return preguntanomiLogic;
	}

	public void setPreguntaNomiLogic(PreguntaNomiLogic preguntanomiLogic) {
		this.preguntanomiLogic = preguntanomiLogic;
	}


	public FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic=null;

	public FormatoNomiPreguntaNomiLogic getFormatoNomiPreguntaNomiLogic() {
		return formatonomipreguntanomiLogic;
	}

	public void setFormatoNomiPreguntaNomiLogic(FormatoNomiPreguntaNomiLogic formatonomipreguntanomiLogic) {
		this.formatonomipreguntanomiLogic = formatonomipreguntanomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFactorNomi=false;
	public Boolean esParaAccionDesdeFormularioFactorNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FactorNomiSessionBeanAdditional factornomiSessionBeanAdditional=null;
	
	public FactorNomiSessionBeanAdditional getFactorNomiSessionBeanAdditional() {
		return this.factornomiSessionBeanAdditional;
	}
	
	public void setFactorNomiSessionBeanAdditional(FactorNomiSessionBeanAdditional factornomiSessionBeanAdditional) {
		try {
			this.factornomiSessionBeanAdditional=factornomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FactorNomiBeanSwingJInternalFrameAdditional factornomiBeanSwingJInternalFrameAdditional=null;
	//public class FactorNomiBeanSwingJInternalFrame
	
	public FactorNomiBeanSwingJInternalFrameAdditional getFactorNomiBeanSwingJInternalFrameAdditional() {
		return this.factornomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setFactorNomiBeanSwingJInternalFrameAdditional(FactorNomiBeanSwingJInternalFrameAdditional factornomiBeanSwingJInternalFrameAdditional) {
		try {
			this.factornomiBeanSwingJInternalFrameAdditional=factornomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FactorNomiLogic factornomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FactorNomi factornomiBean;
	public FactorNomiConstantesFunciones factornomiConstantesFunciones;
	//public FactorNomiParameterReturnGeneral factornomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<FactorNomi> factornomis;	
	//public List<FactorNomi> factornomisEliminados;
	//public List<FactorNomi> factornomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFactorNomi=false;
	public Boolean isVisibilidadCeldaDuplicarFactorNomi=true;
	public Boolean isVisibilidadCeldaCopiarFactorNomi=true;
	public Boolean isVisibilidadCeldaVerFormFactorNomi=true;
	public Boolean isVisibilidadCeldaOrdenFactorNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
	public Boolean isVisibilidadCeldaModificarFactorNomi=false;
	public Boolean isVisibilidadCeldaActualizarFactorNomi=false;
	public Boolean isVisibilidadCeldaEliminarFactorNomi=false;
	public Boolean isVisibilidadCeldaCancelarFactorNomi=false;
	public Boolean isVisibilidadCeldaGuardarFactorNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFactorNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFactorNomi() {
		return this.iIdNuevoFactorNomi;
	}

	public void setiIdNuevoFactorNomi(Long iIdNuevoFactorNomi) {
		this.iIdNuevoFactorNomi = iIdNuevoFactorNomi;
	}
	
	public Long getidFactorNomiActual() {
		return this.idFactorNomiActual;
	}

	public void setidFactorNomiActual(Long idFactorNomiActual) {
		this.idFactorNomiActual = idFactorNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FactorNomi getfactornomi() {
		return this.factornomi;
	}

	public void setfactornomi(FactorNomi factornomi) {
		this.factornomi = factornomi;
	}
	
	public FactorNomi getfactornomiAux() {
		return this.factornomiAux;
	}

	public void setfactornomiAux(FactorNomi factornomiAux) {
		this.factornomiAux = factornomiAux;
	}				
	
	public FactorNomi getfactornomiAnterior() {
		return this.factornomiAnterior;
	}

	public void setfactornomiAnterior(FactorNomi factornomiAnterior) {
		this.factornomiAnterior = factornomiAnterior;
	}	
	
	public FactorNomi getfactornomiTotales() {
		return this.factornomiTotales;
	}

	public void setfactornomiTotales(FactorNomi factornomiTotales) {
		this.factornomiTotales = factornomiTotales;
	}	
	
	public FactorNomi getfactornomiBean() {
		return this.factornomiBean;
	}

	public void setfactornomiBean(FactorNomi factornomiBean) {
		this.factornomiBean = factornomiBean;
	}	
	
	public FactorNomiParameterReturnGeneral getfactornomiReturnGeneral() {
		return this.factornomiReturnGeneral;
	}

	public void setfactornomiReturnGeneral(FactorNomiParameterReturnGeneral factornomiReturnGeneral) {
		this.factornomiReturnGeneral = factornomiReturnGeneral;
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
	
	
	public FactorNomiLogic getFactorNomiLogic()	{		
		return factornomiLogic;
	}

	public void setFactorNomiLogic(FactorNomiLogic factornomiLogic) {
		this.factornomiLogic = factornomiLogic;
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
	
	public Boolean getIsEsNuevoFactorNomi() {
		return isEsNuevoFactorNomi;
	}

	public void setIsEsNuevoFactorNomi(Boolean isEsNuevoFactorNomi) {
		this.isEsNuevoFactorNomi = isEsNuevoFactorNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioFactorNomi() {
		return esParaAccionDesdeFormularioFactorNomi;
	}
	
	public void setEsParaAccionDesdeFormularioFactorNomi(Boolean esParaAccionDesdeFormularioFactorNomi) {
		this.esParaAccionDesdeFormularioFactorNomi = esParaAccionDesdeFormularioFactorNomi;
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

			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
			}

			if(!this.factornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(factornomiSessionBean.getlidEmpresaActual());
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

					if(this.factornomi!=null) {
						this.factornomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFactorNomi!=null) {
						this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFactorNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFactorNomi!=null) {
						if(this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFactorNomiGenerico)throws Exception
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
				jComboBoxid_empresaFactorNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFactorNomiGenerico!=null && jComboBoxid_empresaFactorNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaFactorNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FactorNomi factornomi,JComboBox jComboBoxid_empresaFactorNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFactorNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFactorNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				factornomi.setid_empresa(empresaAux.getId());
				factornomi.setempresa_descripcion(FactorNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				factornomi.setEmpresa(empresaAux);			}
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

					if(!FactorNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFactorNomi!=null) { 
							this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFactorNomi!=null) { 
					}

					if(!FactorNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFactorNomi!=null) {
							this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFactorNomi!=null) {
							this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFactorNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FactorNomiConstantesFunciones.refrescarForeignKeysDescripcionesFactorNomi(this.factornomiLogic.getFactorNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FactorNomiConstantesFunciones.refrescarForeignKeysDescripcionesFactorNomi(this.factornomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//factornomiLogic.setFactorNomis(this.factornomis);
			factornomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FactorNomiParameterReturnGeneral getFactorNomiParameterGeneral() {
		return this.factornomiParameterGeneral;
	}
	
	public void setFactorNomiParameterGeneral(FactorNomiParameterReturnGeneral factornomiParameterGeneral) {
		this.factornomiParameterGeneral = factornomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFactorNomi() {
		return isPermisoTodoFactorNomi;
	}

	public void setIsPermisoTodoFactorNomi(Boolean isPermisoTodoFactorNomi) {
		this.isPermisoTodoFactorNomi = isPermisoTodoFactorNomi;
	}

	public Boolean getIsPermisoNuevoFactorNomi() {
		return isPermisoNuevoFactorNomi;
	}

	public void setIsPermisoNuevoFactorNomi(Boolean isPermisoNuevoFactorNomi) {
		this.isPermisoNuevoFactorNomi = isPermisoNuevoFactorNomi;
	}

	public Boolean getIsPermisoActualizarFactorNomi() {
		return isPermisoActualizarFactorNomi;
	}

	public void setIsPermisoActualizarFactorNomi(Boolean isPermisoActualizarFactorNomi) {
		this.isPermisoActualizarFactorNomi = isPermisoActualizarFactorNomi;
	}

	public Boolean getIsPermisoEliminarFactorNomi() {
		return isPermisoEliminarFactorNomi;
	}

	public void setIsPermisoEliminarFactorNomi(Boolean isPermisoEliminarFactorNomi) {
		this.isPermisoEliminarFactorNomi = isPermisoEliminarFactorNomi;
	}

	public Boolean getIsPermisoGuardarCambiosFactorNomi() {
		return isPermisoGuardarCambiosFactorNomi;
	}

	public void setIsPermisoGuardarCambiosFactorNomi(Boolean isPermisoGuardarCambiosFactorNomi) {
		this.isPermisoGuardarCambiosFactorNomi = isPermisoGuardarCambiosFactorNomi;
	}
	
	public Boolean getIsPermisoConsultaFactorNomi() {
		return isPermisoConsultaFactorNomi;
	}

	public void setIsPermisoConsultaFactorNomi(Boolean isPermisoConsultaFactorNomi) {
		this.isPermisoConsultaFactorNomi = isPermisoConsultaFactorNomi;
	}

	public Boolean getIsPermisoBusquedaFactorNomi() {
		return isPermisoBusquedaFactorNomi;
	}

	public void setIsPermisoBusquedaFactorNomi(Boolean isPermisoBusquedaFactorNomi) {
		this.isPermisoBusquedaFactorNomi = isPermisoBusquedaFactorNomi;
	}

	public Boolean getIsPermisoReporteFactorNomi() {
		return isPermisoReporteFactorNomi;
	}

	public void setIsPermisoReporteFactorNomi(Boolean isPermisoReporteFactorNomi) {
		this.isPermisoReporteFactorNomi = isPermisoReporteFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioFactorNomi() {
		return isPermisoPaginacionMedioFactorNomi;
	}

	public void setIsPermisoPaginacionMedioFactorNomi(Boolean isPermisoPaginacionMedioFactorNomi) {
		this.isPermisoPaginacionMedioFactorNomi = isPermisoPaginacionMedioFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoFactorNomi() {
		return isPermisoPaginacionTodoFactorNomi;
	}

	public void setIsPermisoPaginacionTodoFactorNomi(Boolean isPermisoPaginacionTodoFactorNomi) {
		this.isPermisoPaginacionTodoFactorNomi = isPermisoPaginacionTodoFactorNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoFactorNomi() {
		return isPermisoPaginacionAltoFactorNomi;
	}

	public void setIsPermisoPaginacionAltoFactorNomi(Boolean isPermisoPaginacionAltoFactorNomi) {
		this.isPermisoPaginacionAltoFactorNomi = isPermisoPaginacionAltoFactorNomi;
	}
	
	public Boolean getIsPermisoCopiarFactorNomi() {
		return isPermisoCopiarFactorNomi;
	}

	public void setIsPermisoCopiarFactorNomi(Boolean isPermisoCopiarFactorNomi) {
		this.isPermisoCopiarFactorNomi = isPermisoCopiarFactorNomi;
	}
	
	public Boolean getIsPermisoVerFormFactorNomi() {
		return isPermisoVerFormFactorNomi;
	}

	public void setIsPermisoVerFormFactorNomi(Boolean isPermisoVerFormFactorNomi) {
		this.isPermisoVerFormFactorNomi = isPermisoVerFormFactorNomi;
	}
	
	public Boolean getIsPermisoDuplicarFactorNomi() {
		return isPermisoDuplicarFactorNomi;
	}

	public void setIsPermisoDuplicarFactorNomi(Boolean isPermisoDuplicarFactorNomi) {
		this.isPermisoDuplicarFactorNomi = isPermisoDuplicarFactorNomi;
	}
	
	public Boolean getIsPermisoOrdenFactorNomi() {
		return isPermisoOrdenFactorNomi;
	}

	public void setIsPermisoOrdenFactorNomi(Boolean isPermisoOrdenFactorNomi) {
		this.isPermisoOrdenFactorNomi = isPermisoOrdenFactorNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFactorNomi() {
		return isVisibilidadCeldaNuevoFactorNomi;
	}

	public void setIsVisibilidadCeldaNuevoFactorNomi(Boolean isVisibilidadCeldaNuevoFactorNomi) {
		this.isVisibilidadCeldaNuevoFactorNomi = isVisibilidadCeldaNuevoFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFactorNomi() {
		return isVisibilidadCeldaDuplicarFactorNomi;
	}

	public void setIsVisibilidadCeldaDuplicarFactorNomi(Boolean isVisibilidadCeldaDuplicarFactorNomi) {
		this.isVisibilidadCeldaDuplicarFactorNomi = isVisibilidadCeldaDuplicarFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFactorNomi() {
		return isVisibilidadCeldaCopiarFactorNomi;
	}

	public void setIsVisibilidadCeldaCopiarFactorNomi(Boolean isVisibilidadCeldaCopiarFactorNomi) {
		this.isVisibilidadCeldaCopiarFactorNomi = isVisibilidadCeldaCopiarFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFactorNomi() {
		return isVisibilidadCeldaVerFormFactorNomi;
	}

	public void setIsVisibilidadCeldaVerFormFactorNomi(Boolean isVisibilidadCeldaVerFormFactorNomi) {
		this.isVisibilidadCeldaVerFormFactorNomi = isVisibilidadCeldaVerFormFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFactorNomi() {
		return isVisibilidadCeldaOrdenFactorNomi;
	}

	public void setIsVisibilidadCeldaOrdenFactorNomi(Boolean isVisibilidadCeldaOrdenFactorNomi) {
		this.isVisibilidadCeldaOrdenFactorNomi = isVisibilidadCeldaOrdenFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFactorNomi() {
		return isVisibilidadCeldaNuevoRelacionesFactorNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFactorNomi(Boolean isVisibilidadCeldaNuevoRelacionesFactorNomi) {
		this.isVisibilidadCeldaNuevoRelacionesFactorNomi = isVisibilidadCeldaNuevoRelacionesFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFactorNomi() {
		return isVisibilidadCeldaModificarFactorNomi;
	}

	public void setIsVisibilidadCeldaModificarFactorNomi(Boolean isVisibilidadCeldaModificarFactorNomi) {
		this.isVisibilidadCeldaModificarFactorNomi = isVisibilidadCeldaModificarFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFactorNomi() {
		return isVisibilidadCeldaActualizarFactorNomi;
	}

	public void setIsVisibilidadCeldaActualizarFactorNomi(Boolean isVisibilidadCeldaActualizarFactorNomi) {
		this.isVisibilidadCeldaActualizarFactorNomi = isVisibilidadCeldaActualizarFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarFactorNomi() {
		return isVisibilidadCeldaEliminarFactorNomi;
	}

	public void setIsVisibilidadCeldaEliminarFactorNomi(Boolean isVisibilidadCeldaEliminarFactorNomi) {
		this.isVisibilidadCeldaEliminarFactorNomi = isVisibilidadCeldaEliminarFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarFactorNomi() {
		return isVisibilidadCeldaCancelarFactorNomi;
	}

	public void setIsVisibilidadCeldaCancelarFactorNomi(Boolean isVisibilidadCeldaCancelarFactorNomi) {
		this.isVisibilidadCeldaCancelarFactorNomi = isVisibilidadCeldaCancelarFactorNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarFactorNomi() {
		return isVisibilidadCeldaGuardarFactorNomi;
	}

	public void setIsVisibilidadCeldaGuardarFactorNomi(Boolean isVisibilidadCeldaGuardarFactorNomi) {
		this.isVisibilidadCeldaGuardarFactorNomi = isVisibilidadCeldaGuardarFactorNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFactorNomi() {
		return isVisibilidadCeldaGuardarCambiosFactorNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFactorNomi(Boolean isVisibilidadCeldaGuardarCambiosFactorNomi) {
		this.isVisibilidadCeldaGuardarCambiosFactorNomi = isVisibilidadCeldaGuardarCambiosFactorNomi;
	}
		
	public FactorNomiSessionBean getfactornomiSessionBean() {
		return this.factornomiSessionBean;
	}
	
	public void setfactornomiSessionBean(FactorNomiSessionBean factornomiSessionBean) {
		this.factornomiSessionBean=factornomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFactorNomi(FactorNomi factornomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(factornomi,null);
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
	
	public void bugActualizarReferenciaActual(FactorNomi factornomi,FactorNomi factornomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFactorNomi(factornomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		factornomiAux.setId(factornomi.getId());
		factornomiAux.setVersionRow(factornomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFactorNomi();
		
			int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = factornomiValidator.getInvalidValues(this.factornomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			factornomiLogic.setDatosCliente(datosCliente);
			factornomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				factornomiAux=new  FactorNomi();
				
				factornomiAux.setIsNew(true);
				factornomiAux.setIsChanged(true);
				
				factornomiAux.setFactorNomiOriginal(this.factornomi);
				
				factornomiAux.setId(this.factornomi.getId());	
				factornomiAux.setVersionRow(this.factornomi.getVersionRow());	
				factornomiAux.setid_empresa(this.factornomi.getid_empresa());	
				factornomiAux.setnombre(this.factornomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.factornomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(factornomiAux,factornomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.factornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiLogic.saveFactorNomis();//WithConnection
						//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);
					
					this.refrescarForeignKeysDescripcionesFactorNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								factornomiLogic.saveFactorNomiRelaciones(factornomiAux,this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis(),this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());//WithConnection
								//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis= new ArrayList<PreguntaNomi>();
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.factornomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(factornomiAux,factornomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				factornomiAux=new  FactorNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.factornomiSessionBean.getEsGuardarRelacionado() 
					|| (this.factornomiSessionBean.getEsGuardarRelacionado() && this.factornomi.getId()>=0)) {
						
					factornomiAux.setIsNew(false);
				}
				
				factornomiAux.setIsDeleted(false);
			
				factornomiAux.setId(this.factornomi.getId());	
				factornomiAux.setVersionRow(this.factornomi.getVersionRow());	
				factornomiAux.setid_empresa(this.factornomi.getid_empresa());	
				factornomiAux.setnombre(this.factornomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(factornomiAux,factornomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.factornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiLogic.saveFactorNomis();//WithConnection
						//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);
					
					this.refrescarForeignKeysDescripcionesFactorNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								factornomiLogic.saveFactorNomiRelaciones(factornomiAux,this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis(),this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());//WithConnection
								//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis= new ArrayList<PreguntaNomi>();
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.factornomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(factornomiAux,factornomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.factornomi,factornomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				factornomiAux=new  FactorNomi();
				
				factornomiAux.setIsNew(false);
				factornomiAux.setIsChanged(false);
				
				factornomiAux.setIsDeleted(true);
				
				factornomiAux.setId(this.factornomi.getId());	
				factornomiAux.setVersionRow(this.factornomi.getVersionRow());	
				factornomiAux.setid_empresa(this.factornomi.getid_empresa());	
				factornomiAux.setnombre(this.factornomi.getnombre());	
				
				if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.factornomiAux.getId()>=0) {	
						this.factornomisEliminados.add(factornomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(factornomiAux,factornomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.factornomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiLogic.saveFactorNomis();//WithConnection
						//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis().addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomisEliminados);
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis.addAll(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiFactorNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormPreguntaNomi.detalleevaluacionnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jInternalFrameDetalleFormFormatoNomiPreguntaNomi.calificacionempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								factornomiLogic.saveFactorNomiRelaciones(factornomiAux,this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis(),this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis(),this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());//WithConnection
								//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(new ArrayList<FormatoNomiFactorNomi>());
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.setPreguntaNomis(new ArrayList<PreguntaNomi>());
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(new ArrayList<FormatoNomiPreguntaNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis= new ArrayList<FormatoNomiFactorNomi>();
							this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis= new ArrayList<PreguntaNomi>();
							this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis= new ArrayList<FormatoNomiPreguntaNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis());

							if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.quitarFilaTotales();}
							factornomiAux.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.factornomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(factornomiAux,factornomiLogic.getFactorNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(factornomiAux,factornomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getFactorNomis().addAll(this.factornomisEliminados);
					
					factornomiLogic.saveFactorNomis();//WithConnection
					//factornomiLogic.getSetVersionRowFactorNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFactorNomi();
				
				this.factornomisEliminados= new ArrayList<FactorNomi>();		
			}
			
			if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Factor Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.factornomi=factornomiAux;
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
      		//this.finishProcessFactorNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(FactorNomi factornomiLocal) throws Exception {
		
		if(this.factornomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				factornomiLocal.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
				factornomiLocal.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis());
				factornomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
			
			} else {
			
				factornomiLocal.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomis);
				factornomiLocal.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomis);
				factornomiLocal.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FactorNomi factornomiLocal) throws Exception {	
		if(this.factornomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				factornomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFactorNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = factornomiValidator.getInvalidValues(this.factornomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FactorNomi factornomi,List<FactorNomi> factornomis) throws Exception {
		try	{		
			FactorNomiConstantesFunciones.actualizarLista(factornomi,factornomis,this.factornomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FactorNomi factornomi,List<FactorNomi> factornomis) throws Exception {
		try	{			
			FactorNomiConstantesFunciones.actualizarSelectedLista(factornomi,factornomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FactorNomi> factornomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				factornomisLocal=this.factornomiLogic.getFactorNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				factornomisLocal=this.factornomis;
			}
			//ARCHITECTURE
		
			for(FactorNomi factornomiLocal:factornomisLocal) {
				if(this.permiteMantenimiento(factornomiLocal) && factornomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FactorNomiConstantesFunciones.getFactorNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FactorNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFactorNomi.jLabelid_empresaFactorNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FactorNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFactorNomi.jLabelnombreFactorNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFactorNomi.jLabelid_empresaFactorNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFactorNomi.jLabelnombreFactorNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormatoNomiFactorNomi")) {
			if(this.factornomi==null) {
				this.factornomi= new FactorNomi();
			}

			if(this.factornomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFactorNomi
				this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);

				this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.getformatonomifactornomi().setFactorNomi(this.factornomi);
			}

			return;
		}
		 else  if(sTipo.equals("PreguntaNomi")) {
			if(this.factornomi==null) {
				this.factornomi= new FactorNomi();
			}

			if(this.factornomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFactorNomi
				this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);

				this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.getpreguntanomi().setFactorNomi(this.factornomi);
			}

			return;
		}
		 else  if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			if(this.factornomi==null) {
				this.factornomi= new FactorNomi();
			}

			if(this.factornomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFactorNomi
				this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);

				this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getformatonomipreguntanomi().setFactorNomi(this.factornomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFactorNomi--;	
		
		
		this.factornomiAux=new FactorNomi();
		
		this.factornomiAux.setId(this.iIdNuevoFactorNomi);
		this.factornomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.factornomiLogic.getFactorNomis().add(this.factornomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.factornomis.add(this.factornomiAux);
		}
		//ARCHITECTURE
		
		this.factornomi=this.factornomiAux;
		
		if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFactorNomi(this.factornomi);
			this.setVariablesObjetoActualToFormularioForeignKeyFactorNomi(this.factornomi);
		}
				
		//this.setDefaultControlesFactorNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFactorNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFactorNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFactorNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFactorNomi(this.factornomiBean,this.factornomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FactorNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.factornomiSessionBean.getConGuardarRelaciones()) {
			classes=FactorNomiConstantesFunciones.getClassesRelationshipsOfFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.factornomiReturnGeneral=factornomiLogic.procesarEventosFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.factornomiLogic.getFactorNomis(),this.factornomi,this.factornomiParameterGeneral,this.isEsNuevoFactorNomi,classes);//this.factornomiLogic.getFactorNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFactorNomi(this.factornomiReturnGeneral,this.factornomiBean,false);
		
		if(this.factornomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFactorNomi(this.factornomiReturnGeneral.getFactorNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFactorNomi(this.factornomiReturnGeneral.getFactorNomi());
		}
		
		if(this.factornomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFactorNomi(this.factornomiReturnGeneral.getFactorNomi(),classes);//this.factornomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFactorNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFactorNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FactorNomiBeanSwingJInternalFrameAdditional.RecargarFormFactorNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFactorNomi(false);
						
			if(factornomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiFactorNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.getEsGuardarRelacionado() && PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPreguntaNomiActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFactorNomi();
			}
			
			this.actualizarVisualTableDatosFactorNomi();
			
			this.jTableDatosFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFactorNomi(), this.getIndiceNuevoFactorNomi());
			
			this.seleccionarFilaTablaFactorNomiActual();
						
			this.actualizarEstadoCeldasBotonesFactorNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFactorNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setEnabled(isHabilitar && this.factornomiConstantesFunciones.activarnombreFactorNomi);	
		//
		this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setEnabled(isHabilitar && this.factornomiConstantesFunciones.activarid_empresaFactorNomi);
	};
	
	public void setDefaultControlesFactorNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFactorNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.factornomiSessionBean.setConGuardarRelaciones(true);			
			this.factornomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.factornomiSessionBean.setConGuardarRelaciones(false);			
			this.factornomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFactorNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
				if(factornomiAux.getId().equals(this.iIdNuevoFactorNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FactorNomi factornomiAux:this.factornomis) {
				if(factornomiAux.getId().equals(this.iIdNuevoFactorNomi)) {
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
	
	public int getIndiceActualFactorNomi(FactorNomi factornomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
				if(factornomiAux.getId().equals(factornomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FactorNomi factornomiAux:this.factornomis) {
				if(factornomiAux.getId().equals(factornomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFactorNomi(FactorNomi factornomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
				if(factornomiAux.getFactorNomiOriginal().getId().equals(factornomiOriginal.getId())) {
					existe=true;
					factornomiOriginal.setId(factornomiAux.getId());
					factornomiOriginal.setVersionRow(factornomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FactorNomi factornomiAux:this.factornomis) {
				if(factornomiAux.getFactorNomiOriginal().getId().equals(factornomiOriginal.getId())) {
					existe=true;
					factornomiOriginal.setId(factornomiAux.getId());
					factornomiOriginal.setVersionRow(factornomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFactorNomi(Boolean esParaCancelar) throws Exception {
		factornomisAux=new ArrayList<FactorNomi>();
		factornomiAux=new FactorNomi();
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
					if(factornomiAux.getId()<0) {
						factornomisAux.add(factornomiAux);
					}		
				}
				this.iIdNuevoFactorNomi=0L;
				this.factornomiLogic.getFactorNomis().removeAll(factornomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FactorNomi factornomiAux:this.factornomis) {
					if(factornomiAux.getId()<0) {
						factornomisAux.add(factornomiAux);
					}		
				}
				this.iIdNuevoFactorNomi=0L;
				this.factornomis.removeAll(factornomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFactorNomi 
					&& this.factornomiLogic.getFactorNomis().size()>0
					) {
					factornomiAux=this.factornomiLogic.getFactorNomis().get(this.factornomiLogic.getFactorNomis().size() - 1);
				
					if(factornomiAux.getId()<0) {
						this.factornomiLogic.getFactorNomis().remove(factornomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFactorNomi && this.factornomis.size()>0) {
					factornomiAux=this.factornomis.get(this.factornomis.size() - 1);
				
					if(factornomiAux.getId()<0) {
						this.factornomis.remove(factornomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFactorNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(factornomi.getId()<0) {
				this.factornomiLogic.getFactorNomis().remove(this.factornomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(factornomi.getId()<0) {
				this.factornomis.remove(this.factornomi);
			}
		}			
	}
	
	public void setEstadosInicialesFactorNomi(List<FactorNomi> factornomisAux) throws Exception {
		FactorNomiConstantesFunciones.setEstadosInicialesFactorNomi(factornomisAux);
	}
	
	public void setEstadosInicialesFactorNomi(FactorNomi factornomiAux) throws Exception {
		FactorNomiConstantesFunciones.setEstadosInicialesFactorNomi(factornomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFactorNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFactorNomiActual()) {
				if(!this.isEsNuevoFactorNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFactorNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFactorNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Factor Nomi ?", "MANTENIMIENTO DE Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FactorNomi factornomi) throws Exception {
		FactorNomiConstantesFunciones.seleccionarAsignar(this.factornomi,factornomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFactorNomi=this.isPermisoActualizarOriginalFactorNomi;
			
			
			this.seleccionarAsignar(factornomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FactorNomiConstantesFunciones.quitarEspaciosFactorNomi(this.factornomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.factornomiSessionBean.setsFuncionBusquedaRapida(this.factornomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFactorNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFactorNomi(esParaCancelar);				
				this.cancelarNuevoFactorNomi(esParaCancelar);								
			}
			
			this.factornomi=new FactorNomi();
			
			this.inicializarFactorNomi();
			
			this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFactorNomi() throws Exception {
		try {
			FactorNomiConstantesFunciones.inicializarFactorNomi(this.factornomi);
			
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
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.factornomiLogic.getFactorNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFactorNomis(String sAccionBusqueda,List<FactorNomi> factornomisParaReportes) throws Exception {
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
					sPathReporteFinal="FactorNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FactorNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FactorNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FactorNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Factor Nomis");		
		parameters.put("busquedapor", FactorNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormatoNomiFactorNomi.class));
			classes.add(new Classe(PreguntaNomi.class));
			classes.add(new Classe(FormatoNomiPreguntaNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FactorNomiLogic factornomiLogicAuxiliar=new FactorNomiLogic();
					factornomiLogicAuxiliar.setDatosCliente(factornomiLogic.getDatosCliente());				
					factornomiLogicAuxiliar.setFactorNomis(factornomisParaReportes);
					
					factornomiLogicAuxiliar.cargarRelacionesLoteForeignKeyFactorNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					factornomisParaReportes=factornomiLogicAuxiliar.getFactorNomis();
					
					//factornomiLogic.getNewConnexionToDeep();
					
					//for (FactorNomi factornomi:factornomisParaReportes) {
					//	factornomiLogic.deepLoad(factornomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//factornomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//factornomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormatoNomiFactorNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiFactorNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomifactornomi", reportFileFormatoNomiFactorNomi);

			InputStream reportFilePreguntaNomi = AuxiliarReportes.class.getResourceAsStream("PreguntaNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_preguntanomi", reportFilePreguntaNomi);

			InputStream reportFileFormatoNomiPreguntaNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiPreguntaNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomipreguntanomi", reportFileFormatoNomiPreguntaNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFactorNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FactorNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFactorNomi=new JRBeanArrayDataSource(FactorNomiJInternalFrame.TraerFactorNomiBeans(factornomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFactorNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FactorNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FactorNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FactorNomiBean.TraerFactorNomiBeans(factornomisParaReportes).toArray()));
							
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
				this.generarExcelReporteFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFactorNomiActionPerformed(null);
					//this.generarExcelReporteFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFactorNomis(sAccionBusqueda,sTipoArchivoReporte,factornomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FactorNomi> factornomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FactorNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFactorNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FactorNomi factornomi : factornomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FactorNomiConstantesFunciones.generarExcelReporteDataFactorNomi("NORMAL",row,workbook,factornomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFactorNomi(String sTipo,Row row,Workbook workbook) {
		
		FactorNomiConstantesFunciones.generarExcelReporteHeaderFactorNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FactorNomi> factornomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FactorNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FactorNomi factornomi : factornomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FactorNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FactorNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(factornomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FactorNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FactorNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(factornomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFactorNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<FactorNomi> factornomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FactorNomi> factornomisRespaldo=null;
		
		classes=FactorNomiConstantesFunciones.getClassesRelationshipsOfFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.factornomiLogic.setDatosCliente(this.datosCliente);
		this.factornomiLogic.setDatosDeep(this.datosDeep);
		this.factornomiLogic.setIsConDeep(true);
		
		factornomisRespaldo=this.factornomiLogic.getFactorNomis();
		
		this.factornomiLogic.setFactorNomis(factornomisParaReportes);	
		this.factornomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		factornomisParaReportes=this.factornomiLogic.getFactorNomis();
		this.factornomiLogic.setFactorNomis(factornomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FactorNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFactorNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FactorNomi factornomi : factornomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFactorNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FactorNomiConstantesFunciones.generarExcelReporteDataFactorNomi("NORMAL",row,workbook,factornomi,cellStyleDataAux);
		
			
			


				//FormatoNomiFactorNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(factornomi.getFormatoNomiFactorNomis()!=null && factornomi.getFormatoNomiFactorNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiFactorNomi("RELACIONADO",row,workbook);
				}

				if(factornomi.getFormatoNomiFactorNomis()!=null) {
					i2=0;
					for(FormatoNomiFactorNomi formatonomifactornomi : factornomi.getFormatoNomiFactorNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiFactorNomiConstantesFunciones.generarExcelReporteDataFormatoNomiFactorNomi("RELACIONADO",row,workbook,formatonomifactornomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PreguntaNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(factornomi.getPreguntaNomis()!=null && factornomi.getPreguntaNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PreguntaNomiConstantesFunciones.generarExcelReporteHeaderPreguntaNomi("RELACIONADO",row,workbook);
				}

				if(factornomi.getPreguntaNomis()!=null) {
					i2=0;
					for(PreguntaNomi preguntanomi : factornomi.getPreguntaNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PreguntaNomiConstantesFunciones.generarExcelReporteDataPreguntaNomi("RELACIONADO",row,workbook,preguntanomi,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FormatoNomiPreguntaNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(factornomi.getFormatoNomiPreguntaNomis()!=null && factornomi.getFormatoNomiPreguntaNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomiPreguntaNomi("RELACIONADO",row,workbook);
				}

				if(factornomi.getFormatoNomiPreguntaNomis()!=null) {
					i2=0;
					for(FormatoNomiPreguntaNomi formatonomipreguntanomi : factornomi.getFormatoNomiPreguntaNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiPreguntaNomiConstantesFunciones.generarExcelReporteDataFormatoNomiPreguntaNomi("RELACIONADO",row,workbook,formatonomipreguntanomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(FactorNomiConstantesFunciones.getFactorNomiDescripcion(factornomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFactorNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFactorNomi() throws Exception {		
		this.startProcessFactorNomi(true);
	}
	
	public void startProcessFactorNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFactorNomi ,this.jPanelParametrosReportesFactorNomi, this.jScrollPanelDatosFactorNomi,this.jPanelPaginacionFactorNomi, this.jScrollPanelDatosEdicionFactorNomi, this.jPanelAccionesFactorNomi,this.jPanelAccionesFormularioFactorNomi,this.jmenuBarFactorNomi,this.jmenuBarDetalleFactorNomi,this.jTtoolBarFactorNomi,this.jTtoolBarDetalleFactorNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFactorNomi=this.jTabbedPaneBusquedasFactorNomi; 
		
		final JPanel jPanelParametrosReportesFactorNomi=this.jPanelParametrosReportesFactorNomi;
		//final JScrollPane jScrollPanelDatosFactorNomi=this.jScrollPanelDatosFactorNomi;
		final JTable jTableDatosFactorNomi=this.jTableDatosFactorNomi;		
		final JPanel jPanelPaginacionFactorNomi=this.jPanelPaginacionFactorNomi;
		//final JScrollPane jScrollPanelDatosEdicionFactorNomi=this.jScrollPanelDatosEdicionFactorNomi;
		final JPanel jPanelAccionesFactorNomi=this.jPanelAccionesFactorNomi;
		
		JPanel jPanelCamposAuxiliarFactorNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFactorNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			jPanelCamposAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jPanelCamposFactorNomi;
			jPanelAccionesFormularioAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jPanelAccionesFormularioFactorNomi;
		}
		
		final JPanel jPanelCamposFactorNomi=jPanelCamposAuxiliarFactorNomi;
		final JPanel jPanelAccionesFormularioFactorNomi=jPanelAccionesFormularioAuxiliarFactorNomi;
		
		
		final JMenuBar jmenuBarFactorNomi=this.jmenuBarFactorNomi;
		final JToolBar jTtoolBarFactorNomi=this.jTtoolBarFactorNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFactorNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFactorNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			jmenuBarDetalleAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jmenuBarDetalleFactorNomi;
			jTtoolBarDetalleAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jTtoolBarDetalleFactorNomi;
		}
		
		final JMenuBar jmenuBarDetalleFactorNomi=jmenuBarDetalleAuxiliarFactorNomi;
		final JToolBar jTtoolBarDetalleFactorNomi=jTtoolBarDetalleAuxiliarFactorNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFactorNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFactorNomi;
			processRunnable.jTableDatos=jTableDatosFactorNomi;
			processRunnable.jPanelCampos=jPanelCamposFactorNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFactorNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFactorNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFactorNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFactorNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFactorNomi;
			processRunnable.jTtoolBar=jTtoolBarFactorNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFactorNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFactorNomi ,jPanelParametrosReportesFactorNomi,jTableDatosFactorNomi, /*jScrollPanelDatosFactorNomi,*/jPanelCamposFactorNomi,jPanelPaginacionFactorNomi, /*jScrollPanelDatosEdicionFactorNomi,*/ jPanelAccionesFactorNomi,jPanelAccionesFormularioFactorNomi,jmenuBarFactorNomi,jmenuBarDetalleFactorNomi,jTtoolBarFactorNomi,jTtoolBarDetalleFactorNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFactorNomi ,jPanelParametrosReportesFactorNomi, jScrollPanelDatosFactorNomi,jPanelPaginacionFactorNomi, jScrollPanelDatosEdicionFactorNomi, jPanelAccionesFactorNomi,jPanelAccionesFormularioFactorNomi,jmenuBarFactorNomi,jmenuBarDetalleFactorNomi,jTtoolBarFactorNomi,jTtoolBarDetalleFactorNomi);
						
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
	
	public void finishProcessFactorNomi() {// throws Exception 
		this.finishProcessFactorNomi(true);
	}
	
	public void finishProcessFactorNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFactorNomi ,this.jPanelParametrosReportesFactorNomi, this.jScrollPanelDatosFactorNomi,this.jPanelPaginacionFactorNomi, this.jScrollPanelDatosEdicionFactorNomi, this.jPanelAccionesFactorNomi,this.jPanelAccionesFormularioFactorNomi,this.jmenuBarFactorNomi,this.jmenuBarDetalleFactorNomi,this.jTtoolBarFactorNomi,this.jTtoolBarDetalleFactorNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasFactorNomi=this.jTabbedPaneBusquedasFactorNomi; 
		
		final JPanel jPanelParametrosReportesFactorNomi=this.jPanelParametrosReportesFactorNomi;
		//final JScrollPane jScrollPanelDatosFactorNomi=this.jScrollPanelDatosFactorNomi;
		final JTable jTableDatosFactorNomi=this.jTableDatosFactorNomi;		
		final JPanel jPanelPaginacionFactorNomi=this.jPanelPaginacionFactorNomi;
		//final JScrollPane jScrollPanelDatosEdicionFactorNomi=this.jScrollPanelDatosEdicionFactorNomi;
		final JPanel jPanelAccionesFactorNomi=this.jPanelAccionesFactorNomi;
		
		JPanel jPanelCamposAuxiliarFactorNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFactorNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			jPanelCamposAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jPanelCamposFactorNomi;
			jPanelAccionesFormularioAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jPanelAccionesFormularioFactorNomi;
		}
		
		final JPanel jPanelCamposFactorNomi=jPanelCamposAuxiliarFactorNomi;
		final JPanel jPanelAccionesFormularioFactorNomi=jPanelAccionesFormularioAuxiliarFactorNomi;
		
		
		final JMenuBar jmenuBarFactorNomi=this.jmenuBarFactorNomi;		
		final JToolBar jTtoolBarFactorNomi=this.jTtoolBarFactorNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarFactorNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFactorNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			jmenuBarDetalleAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jmenuBarDetalleFactorNomi;
			jTtoolBarDetalleAuxiliarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jTtoolBarDetalleFactorNomi;		
		}
		
		final JMenuBar jmenuBarDetalleFactorNomi=jmenuBarDetalleAuxiliarFactorNomi;
		final JToolBar jTtoolBarDetalleFactorNomi=jTtoolBarDetalleAuxiliarFactorNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFactorNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFactorNomi;
			processRunnable.jTableDatos=jTableDatosFactorNomi;
			processRunnable.jPanelCampos=jPanelCamposFactorNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionFactorNomi;
			processRunnable.jPanelAcciones=jPanelAccionesFactorNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFactorNomi;
			
			
			processRunnable.jmenuBar=jmenuBarFactorNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFactorNomi;
			processRunnable.jTtoolBar=jTtoolBarFactorNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFactorNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFactorNomi ,jPanelParametrosReportesFactorNomi, jTableDatosFactorNomi,/*jScrollPanelDatosFactorNomi,*/jPanelCamposFactorNomi,jPanelPaginacionFactorNomi, /*jScrollPanelDatosEdicionFactorNomi,*/ jPanelAccionesFactorNomi,jPanelAccionesFormularioFactorNomi,jmenuBarFactorNomi,jmenuBarDetalleFactorNomi,jTtoolBarFactorNomi,jTtoolBarDetalleFactorNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFactorNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFactorNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFactorNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFactorNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFactorNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFactorNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFactorNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.factornomiConstantesFunciones.getsFinalQueryFactorNomi();
		String  finalQueryPaginacionTodos=this.factornomiConstantesFunciones.getsFinalQueryFactorNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FactorNomiConstantesFunciones.getArrayColumnasGlobalesNoFactorNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FactorNomiConstantesFunciones.getArrayColumnasGlobalesFactorNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FactorNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.factornomisEliminados= new ArrayList<FactorNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFactorNomi();
		
				///*FactorNomiSessionBean*/this.factornomiSessionBean=new FactorNomiSessionBean();
			
			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
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
					this.iNumeroPaginacion=FactorNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FactorNomiConstantesFunciones.getClassesForeignKeysOfFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/factornomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			factornomisAux= new ArrayList<FactorNomi>();
			
				
			factornomiLogic.setDatosCliente(this.datosCliente);
			factornomiLogic.setDatosDeep(this.datosDeep);
			factornomiLogic.setIsConDeep(true);
			
			
			factornomiLogic.getFactorNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					factornomiLogic.getTodosFactorNomis(finalQueryGlobal,pagination);
					
					//factornomiLogic.getTodosFactorNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(factornomiLogic.getFactorNomis()==null|| factornomiLogic.getFactorNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							factornomisAux= new ArrayList<FactorNomi>();
							factornomisAux.addAll(factornomiLogic.getFactorNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							factornomisAux= new ArrayList<FactorNomi>();
							factornomisAux.addAll(factornomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							factornomiLogic.getTodosFactorNomis(finalQueryGlobal+"",this.pagination);												
							
							//factornomiLogic.getTodosFactorNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFactorNomis("Todos",factornomiLogic.getFactorNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							factornomiLogic.setFactorNomis(new ArrayList<FactorNomi>());					
							factornomiLogic.getFactorNomis().addAll(factornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							factornomis=new ArrayList<FactorNomi>();
							factornomis.addAll(factornomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFactorNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFactorNomi=this.idActual;
				
				} else if(this.idFactorNomiActual!=null && this.idFactorNomiActual!=0L) {
					idFactorNomi=idFactorNomiActual;
				}
				
					
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndicePorId(idFactorNomi);
				
				this.factornomis=new ArrayList<FactorNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					factornomiLogic.getEntity(idFactorNomi);
					
					//factornomiLogic.getEntityWithConnection(idFactorNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					factornomiLogic.setFactorNomis(new ArrayList<FactorNomi>());
					factornomiLogic.getFactorNomis().add(factornomiLogic.getFactorNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.factornomis=new ArrayList<FactorNomi>();
					this.factornomis.add(factornomi);
				}
				
				if(factornomiLogic.getFactorNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					factornomiLogic.getFactorNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=factornomiLogic.getFactorNomis()==null||factornomiLogic.getFactorNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=factornomis==null|| factornomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomisAux=new ArrayList<FactorNomi>();
						factornomisAux.addAll(factornomiLogic.getFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							factornomisAux=new ArrayList<FactorNomi>();
							factornomisAux.addAll(factornomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							factornomiLogic.getFactorNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FactorNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFactorNomis("FK_IdEmpresa",factornomiLogic.getFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFactorNomis("FK_IdEmpresa",factornomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiLogic.setFactorNomis(new ArrayList<FactorNomi>());
						factornomiLogic.getFactorNomis().addAll(factornomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							factornomis=new ArrayList<FactorNomi>();
							factornomis.addAll(factornomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFactorNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFactorNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=factornomiLogic.getFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=factornomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=factornomiLogic.getFactorNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=factornomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FactorNomi factornomi) {
		Boolean permite=true;
		
		if(this.factornomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FactorNomiConstantesFunciones.getOrderByListaFactorNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FactorNomiConstantesFunciones.getOrderByListaFactorNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FactorNomi factornomi:factornomiLogic.getFactorNomis()) {
				if(factornomi.getsType().equals(Constantes2.S_TOTALES)) {
					factornomiTotales=factornomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FactorNomi factornomi:this.factornomis) {
				if(factornomi.getsType().equals(Constantes2.S_TOTALES)) {
					factornomiTotales=factornomi;
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
			this.factornomiAux=new FactorNomi();
			this.factornomiAux.setsType(Constantes2.S_TOTALES);
			this.factornomiAux.setIsNew(false);
			this.factornomiAux.setIsChanged(false);
			this.factornomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FactorNomiConstantesFunciones.TotalizarValoresFilaFactorNomi(this.factornomiLogic.getFactorNomis(),this.factornomiAux);
				
				this.factornomiLogic.getFactorNomis().add(this.factornomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FactorNomiConstantesFunciones.TotalizarValoresFilaFactorNomi(this.factornomis,this.factornomiAux);
				
				this.factornomis.add(this.factornomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		factornomiTotales=new FactorNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.factornomiLogic.getFactorNomis().remove(factornomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.factornomis.remove(factornomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		factornomiTotales=new FactorNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FactorNomi factornomi:factornomiLogic.getFactorNomis()) {
				if(factornomi.getsType().equals(Constantes2.S_TOTALES)) {
					factornomiTotales=factornomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FactorNomiConstantesFunciones.TotalizarValoresFilaFactorNomi(this.factornomiLogic.getFactorNomis(),factornomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FactorNomi factornomi:this.factornomis) {
				if(factornomi.getsType().equals(Constantes2.S_TOTALES)) {
					factornomiTotales=factornomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FactorNomiConstantesFunciones.TotalizarValoresFilaFactorNomi(this.factornomis,factornomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFactorNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFactorNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					factornomiLogic.getFactorNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosFactorNomi() {
		this.isPermisoTodoFactorNomi=false;
		this.isPermisoNuevoFactorNomi=false;
		this.isPermisoActualizarFactorNomi=false;
		this.isPermisoActualizarOriginalFactorNomi=false;
		this.isPermisoEliminarFactorNomi=false;
		this.isPermisoGuardarCambiosFactorNomi=false;
		this.isPermisoConsultaFactorNomi=false;
		this.isPermisoBusquedaFactorNomi=false;
		this.isPermisoReporteFactorNomi=false;		
		this.isPermisoOrdenFactorNomi=false;		
		this.isPermisoPaginacionMedioFactorNomi=false;		
		this.isPermisoPaginacionAltoFactorNomi=false;
		this.isPermisoPaginacionTodoFactorNomi=false;
		this.isPermisoCopiarFactorNomi=false;		
		this.isPermisoVerFormFactorNomi=false;		
		this.isPermisoDuplicarFactorNomi=false;		
		this.isPermisoOrdenFactorNomi=false;		
	}
	
	public void setPermisosUsuarioFactorNomi(Boolean isPermiso) {
		this.isPermisoTodoFactorNomi=isPermiso;
		this.isPermisoNuevoFactorNomi=isPermiso;
		this.isPermisoActualizarFactorNomi=isPermiso;
		this.isPermisoActualizarOriginalFactorNomi=isPermiso;
		this.isPermisoEliminarFactorNomi=isPermiso;
		this.isPermisoGuardarCambiosFactorNomi=isPermiso;
		this.isPermisoConsultaFactorNomi=isPermiso;
		this.isPermisoBusquedaFactorNomi=isPermiso;
		this.isPermisoReporteFactorNomi=isPermiso;
		this.isPermisoOrdenFactorNomi=isPermiso;		
		this.isPermisoPaginacionMedioFactorNomi=isPermiso;		
		this.isPermisoPaginacionAltoFactorNomi=isPermiso;		
		this.isPermisoPaginacionTodoFactorNomi=isPermiso;		
		this.isPermisoCopiarFactorNomi=isPermiso;		
		this.isPermisoVerFormFactorNomi=isPermiso;		
		this.isPermisoDuplicarFactorNomi=isPermiso;
		this.isPermisoOrdenFactorNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFactorNomi(Boolean isPermiso) {
		//this.isPermisoTodoFactorNomi=isPermiso;
		this.isPermisoNuevoFactorNomi=isPermiso;
		this.isPermisoActualizarFactorNomi=isPermiso;
		this.isPermisoActualizarOriginalFactorNomi=isPermiso;
		this.isPermisoEliminarFactorNomi=isPermiso;
		this.isPermisoGuardarCambiosFactorNomi=isPermiso;
		//this.isPermisoConsultaFactorNomi=isPermiso;
		//this.isPermisoBusquedaFactorNomi=isPermiso;
		//this.isPermisoReporteFactorNomi=isPermiso;
		//this.isPermisoOrdenFactorNomi=isPermiso;		
		//this.isPermisoPaginacionMedioFactorNomi=isPermiso;		
		//this.isPermisoPaginacionAltoFactorNomi=isPermiso;		
		//this.isPermisoPaginacionTodoFactorNomi=isPermiso;		
		//this.isPermisoCopiarFactorNomi=isPermiso;		
		//this.isPermisoDuplicarFactorNomi=isPermiso;
		//this.isPermisoOrdenFactorNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFactorNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PreguntaNomiConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
		
		if(FactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormatoNomiFactorNomi=false;
		this.isTienePermisosFormatoNomiFactorNomi=this.verificarGetPermisosUsuarioOpcionFactorNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPreguntaNomi=false;
		this.isTienePermisosPreguntaNomi=this.verificarGetPermisosUsuarioOpcionFactorNomiClaseRelacionada(this.opcionsRelacionadas,PreguntaNomiConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFormatoNomiPreguntaNomi=false;
		this.isTienePermisosFormatoNomiPreguntaNomi=this.verificarGetPermisosUsuarioOpcionFactorNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFactorNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFactorNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormatoNomiFactorNomi=conPermiso;
		this.isTienePermisosPreguntaNomi=conPermiso;
		this.isTienePermisosFormatoNomiPreguntaNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFactorNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFactorNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFactorNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormatoNomiFactorNomi && this.jInternalFrameDetalleFormFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.remove(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPreguntaNomi && this.jInternalFrameDetalleFormFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.remove(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFormatoNomiPreguntaNomi && this.jInternalFrameDetalleFormFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.remove(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFactorNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FactorNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFactorNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFactorNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFactorNomi=this.isPermisoActualizarFactorNomi;
			this.isPermisoEliminarFactorNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFactorNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFactorNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFactorNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFactorNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFactorNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFactorNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFactorNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFactorNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFactorNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFactorNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFactorNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFactorNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFactorNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFactorNomi.setToolTipText(this.jTableDatosFactorNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFactorNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFactorNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFactorNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormatoNomiFactorNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiFactorNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi Factor Nomi");
			reporte.setsDescripcion("Formato Nomi Factor Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPreguntaNomi && this.factornomiConstantesFunciones.mostrarPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pregunta Nomi");
			reporte.setsDescripcion("Pregunta Nomi");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFormatoNomiPreguntaNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi Pregunta Nomi");
			reporte.setsDescripcion("Formato Nomi Pregunta Nomi");
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
	public void inicializarCombosForeignKeyFactorNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFactorNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FactorNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFactorNomiListas(false);
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
	
	public void cargarCombosLoteForeignKeyFactorNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FactorNomiParameterReturnGeneral factornomiReturnGeneral=new FactorNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.factornomiConstantesFunciones.cargarid_empresaFactorNomi)
					 || (this.esRecargarFks && this.factornomiConstantesFunciones.cargarid_empresaFactorNomi)) {

					if(!this.factornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+factornomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				factornomiReturnGeneral=factornomiLogic.cargarCombosLoteForeignKeyFactorNomi(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=factornomiReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFactorNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
			}

			if(!this.factornomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyFactorNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFactorNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFactorNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFactorNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFactorNomi(FactorNomi factornomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFactorNomi(FactorNomi factornomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFactorNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFactorNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFactorNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFactorNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFactorNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFactorNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFactorNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFactorNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public FactorNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FactorNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FactorNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.factornomiSessionBean=new FactorNomiSessionBean(); 
		this.factornomiConstantesFunciones=new FactorNomiConstantesFunciones(); 
		this.factornomiBean=new FactorNomi();//(this.factornomiConstantesFunciones); 		
		this.factornomiReturnGeneral=new FactorNomiParameterReturnGeneral(); 
		
		this.factornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.factornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FactorNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFactorNomi(true);
			
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
			
			this.factornomiConstantesFunciones=new FactorNomiConstantesFunciones(); 
			this.factornomiBean=new FactorNomi();//this.factornomiConstantesFunciones); 			
			this.factornomiReturnGeneral=new FactorNomiParameterReturnGeneral(); 
		
			FactorNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factor Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.factornomi=new FactorNomi();
			this.factornomis = new ArrayList<FactorNomi>();
			this.factornomisAux = new ArrayList<FactorNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic=new FactorNomiLogic();
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			//this.factornomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.factornomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFactorNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFactorNomi);	
					}
					
					if(this.jInternalFrameImportacionFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFactorNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFactorNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFactorNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFactorNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFactorNomi);
				this.jInternalFrameDetalleFormFactorNomi.setVisible(false);
				this.jInternalFrameDetalleFormFactorNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFactorNomi);
					this.jInternalFrameReporteDinamicoFactorNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoFactorNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFactorNomi);
					this.jInternalFrameImportacionFactorNomi.setVisible(false);
					this.jInternalFrameImportacionFactorNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFactorNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFactorNomi);
					this.jInternalFrameOrderByFactorNomi.setVisible(false);
					this.jInternalFrameOrderByFactorNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFactorNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FactorNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.factornomiReturnGeneral=new FactorNomiParameterReturnGeneral();
			
			this.factornomiParameterGeneral=new FactorNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.factornomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FactorNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormatoNomiFactorNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PreguntaNomiConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FormatoNomiPreguntaNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FactorNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.factornomiSessionBean.getEsGuardarRelacionado(),this.factornomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FactorNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.factornomiSessionBean.getEsGuardarRelacionado(),this.factornomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaDuplicarFactorNomi=true;
			this.isVisibilidadCeldaCopiarFactorNomi=true;
			this.isVisibilidadCeldaVerFormFactorNomi=true;
			this.isVisibilidadCeldaOrdenFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=false;
			this.isVisibilidadCeldaGuardarFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFactorNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFactorNomi(false);
			
			this.setPermisosUsuarioFactorNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.factornomiSessionBean.getEsGuardarRelacionado() 
				|| (this.factornomiSessionBean.getEsGuardarRelacionado() && this.factornomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFactorNomiClasesRelacionadas();
			}
			
			if(this.factornomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFactorNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFactorNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFactorNomi();
			}
			
			if(!this.isPermisoBusquedaFactorNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFactorNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFactorNomi,this.isPermisoPaginacionMedioFactorNomi,this.isPermisoPaginacionTodoFactorNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FactorNomiConstantesFunciones.getTiposSeleccionarFactorNomi());
				
				this.tiposColumnasSelect=FactorNomiConstantesFunciones.getTiposSeleccionarFactorNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFactorNomi();				
				//this.tiposRelacionesSelect=FactorNomiConstantesFunciones.getTiposRelacionesFactorNomi(true);
				
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
			//if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFactorNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFactorNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFactorNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFactorNomi() ;
			
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
			
			
			this.formatonomifactornomiLogic=new FormatoNomiFactorNomiLogic();
			this.preguntanomiLogic=new PreguntaNomiLogic();
			this.formatonomipreguntanomiLogic=new FormatoNomiPreguntaNomiLogic(); 
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
				factornomiImplementable= (FactorNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FactorNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				factornomiImplementableHome= (FactorNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FactorNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.factornomis= new ArrayList<FactorNomi>();
			this.factornomisEliminados= new ArrayList<FactorNomi>();
						
			this.isEsNuevoFactorNomi=false;
			this.esParaAccionDesdeFormularioFactorNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFactorNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFactorNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FactorNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FactorNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFactorNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFactorNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFactorNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFactorNomi();
			}
			
			FactorNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFactorNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFactorNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFactorNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFactorNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FactorNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFactorNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFactorNomi")) {
				iIndex=this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Formato Nomi Factor Nomis")) {
					if(!FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFactorNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomiFactorNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Formato Nomi Pregunta Nomis")) {
					if(!FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFactorNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Pregunta Nomis")) {
					if(!PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFactorNomi();

						this.cargarParteTabPanelRelacionadaPreguntaNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFactorNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormatoNomiFactorNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFactorNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomiFactorNomi(false,true,iIndex);
		this.jButtonFormatoNomiFactorNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi();

		//this.jTabbedPaneRelacionesFactorNomi.updateUI();
		//this.jTabbedPaneRelacionesFactorNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFactorNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFormatoNomiPreguntaNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFactorNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomiPreguntaNomi(false,true,iIndex);
		this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();

		//this.jTabbedPaneRelacionesFactorNomi.updateUI();
		//this.jTabbedPaneRelacionesFactorNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFactorNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPreguntaNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFactorNomi.cargarSessionConBeanSwingJInternalFramePreguntaNomi(false,true,iIndex);
		this.jButtonPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPreguntaNomi();

		//this.jTabbedPaneRelacionesFactorNomi.updateUI();
		//this.jTabbedPaneRelacionesFactorNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFactorNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormatoNomiFactorNomi")) {
				int row=this.jTableDatosFactorNomi.getSelectedRow();
				jButtonFormatoNomiFactorNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PreguntaNomi")) {
				int row=this.jTableDatosFactorNomi.getSelectedRow();
				jButtonPreguntaNomiActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FormatoNomiPreguntaNomi")) {
				int row=this.jTableDatosFactorNomi.getSelectedRow();
				jButtonFormatoNomiPreguntaNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formato Nomi Factor Nomi")) {

					if(this.isTienePermisosFormatoNomiFactorNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiFactorNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomi Factor Nomis"+"("+FormatoNomiFactorNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomi Factor Nomis");

						if(factornomiConstantesFunciones.resaltarFormatoNomiFactorNomiFactorNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(factornomiConstantesFunciones.resaltarFormatoNomiFactorNomiFactorNomi);
						}

						jmenuItem.setEnabled(this.factornomiConstantesFunciones.activarFormatoNomiFactorNomiFactorNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomiFactorNomi"));

						

						this.jInternalFrameDetalleFormFactorNomi.jmenuDetalleFactorNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pregunta Nomi")) {

					if(this.isTienePermisosPreguntaNomi && this.factornomiConstantesFunciones.mostrarPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pregunta Nomis"+"("+PreguntaNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pregunta Nomis");

						if(factornomiConstantesFunciones.resaltarPreguntaNomiFactorNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(factornomiConstantesFunciones.resaltarPreguntaNomiFactorNomi);
						}

						jmenuItem.setEnabled(this.factornomiConstantesFunciones.activarPreguntaNomiFactorNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PreguntaNomi"));

						

						this.jInternalFrameDetalleFormFactorNomi.jmenuDetalleFactorNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Formato Nomi Pregunta Nomi")) {

					if(this.isTienePermisosFormatoNomiPreguntaNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomi Pregunta Nomis"+"("+FormatoNomiPreguntaNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomi Pregunta Nomis");

						if(factornomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFactorNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(factornomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFactorNomi);
						}

						jmenuItem.setEnabled(this.factornomiConstantesFunciones.activarFormatoNomiPreguntaNomiFactorNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomiPreguntaNomi"));

						

						this.jInternalFrameDetalleFormFactorNomi.jmenuDetalleFactorNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFactorNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFactorNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFactorNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFactorNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFactorNomi();
		
		this.cargarCombosFrameForeignKeyFactorNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFactorNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFactorNomi();
		}
	}
	
	
	
	public void jButtonNuevoFactorNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.factornomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			
			if(jTableDatosFactorNomi.getRowCount()>=1) {
				jTableDatosFactorNomi.removeRowSelectionInterval(0, jTableDatosFactorNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoFactorNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFactorNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFactorNomi(true);			
			//this.factornomi=new FactorNomi();
			//this.factornomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFactorNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFactorNomi() ;
			
			if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFactorNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.factornomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.factornomi);				
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			if(this.factornomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FactorNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFactorNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFactorNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFactorNomi.getSelectedRows().length;			
			}
			
			factornomisSeleccionados=this.getFactorNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFactorNomi--;			
				//FactorNomi factornomiAux= new FactorNomi();			
				//factornomiAux.setId(this.iIdNuevoFactorNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FactorNomi factornomiOrigen=new FactorNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FactorNomi factornomiOrigen : factornomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							factornomiOrigen =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							factornomiOrigen =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFactorNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.factornomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFactorNomi(factornomiOrigen,this.factornomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.factornomiLogic.getFactorNomis().add(this.factornomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.factornomis.add(this.factornomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFactorNomi(false);
				
				this.jTableDatosFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFactorNomi(), this.getIndiceNuevoFactorNomi());
				
				int iLastRow =  this.jTableDatosFactorNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFactorNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFactorNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFactorNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();									
		
			FactorNomi factornomiOrigen=new FactorNomi();
			FactorNomi factornomiDestino=new FactorNomi();
				
			factornomisSeleccionados=this.getFactorNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFactorNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || factornomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFactorNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiOrigen =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						factornomiOrigen =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						factornomiDestino =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						factornomiDestino =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				factornomiOrigen =factornomisSeleccionados.get(0);
				factornomiDestino =factornomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFactorNomi(factornomiOrigen,factornomiDestino,true,false);
				
				factornomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(factornomiDestino,factornomiLogic.getFactorNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(factornomiDestino,factornomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFactorNomi(false);
				
				//this.jTableDatosFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFactorNomi(), this.getIndiceNuevoFactorNomi());
				
				int iLastRow =  this.jTableDatosFactorNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFactorNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFactorNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFactorNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFactorNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFactorNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFactorNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFactorNomi.setVisible(!isVisible);
			this.jPanelPaginacionFactorNomi.setVisible(!isVisible);
			this.jPanelAccionesFactorNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFactorNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFactorNomi();
			
			this.abrirFrameOrderByFactorNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFactorNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFactorNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFactorNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFactorNomi.isMaximum()) {
					this.jInternalFrameDetalleFormFactorNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFactorNomi.setSize(this.jInternalFrameDetalleFormFactorNomi.iWidthFormulario,this.jInternalFrameDetalleFormFactorNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFactorNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFactorNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFactorNomi.isMaximum()) {
						this.jInternalFrameDetalleFormFactorNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),FactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),FactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),FactorNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi();
					}

					if(FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi();
					}

					if(PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPreguntaNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFactorNomi.setVisible(true);
	        this.jInternalFrameDetalleFormFactorNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFactorNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFactorNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactorNomi,false,this);
				} else {
					this.jInternalFrameOrderByFactorNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFactorNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFactorNomi);
				this.jInternalFrameOrderByFactorNomi.setVisible(false);
				this.jInternalFrameOrderByFactorNomi.setSelected(false);
				
				this.jInternalFrameOrderByFactorNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFactorNomi"));
				
				this.inicializarActualizarBindingTablaOrderByFactorNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFactorNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFactorNomi==null) {
				
				this.jInternalFrameImportacionFactorNomi=new ImportacionJInternalFrame(FactorNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFactorNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFactorNomi);
				this.jInternalFrameImportacionFactorNomi.setVisible(false);
				this.jInternalFrameImportacionFactorNomi.setSelected(false);


				this.jInternalFrameImportacionFactorNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFactorNomi"));
				this.jInternalFrameImportacionFactorNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFactorNomi"));
				this.jInternalFrameImportacionFactorNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFactorNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFactorNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFactorNomi==null) {
				this.jInternalFrameReporteDinamicoFactorNomi=new ReporteDinamicoJInternalFrame(FactorNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFactorNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFactorNomi);
				this.jInternalFrameReporteDinamicoFactorNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoFactorNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFactorNomi"));
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFactorNomi"));
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFactorNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFactorNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormatoNomiFactorNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFormatoNomiPreguntaNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPreguntaNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFactorNomi.jContentPaneDetalleFactorNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFactorNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFactorNomi);
			
	       	this.jInternalFrameDetalleFormFactorNomi.setVisible(false);
	        this.jInternalFrameDetalleFormFactorNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormFactorNomi.dispose();
			//this.jInternalFrameDetalleFormFactorNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFactorNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFactorNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFactorNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFactorNomi.setVisible(true);
	        this.jInternalFrameImportacionFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFactorNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFactorNomi.setVisible(true);
	        this.jInternalFrameOrderByFactorNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFactorNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFactorNomi.setVisible(false);
	        this.jInternalFrameOrderByFactorNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFactorNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFactorNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoFactorNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFactorNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFactorNomi.setVisible(false);
	        this.jInternalFrameImportacionFactorNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFactorNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFactorNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFactorNomi(true);
			//this.isEsNuevoFactorNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFactorNomi(false) ;
			
			if(factornomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado() && FormatoNomiFactorNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiFactorNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.getEsGuardarRelacionado() && PreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado() && FormatoNomiPreguntaNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiPreguntaNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFactorNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFactorNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFactorNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFactorNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFactorNomi(true);
			//this.isEsNuevoFactorNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.factornomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFactorNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFactorNomi(false) ;
			
			if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFactorNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFactorNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFactorNomi(false);
			
			//if(!this.isEsNuevoFactorNomi) {								
				int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
				
			}
			
			if(this.permiteMantenimiento(this.factornomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.factornomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFactorNomi=true;
					this.inicializarActualizarBindingTablaFactorNomi(false);
					this.isEsNuevoFactorNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFactorNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFactorNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFactorNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFactorNomi(false);
				
				this.habilitarDeshabilitarControlesFactorNomi(false);
			
												
				
				if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFactorNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFactorNomiActionPerformed(evt,factornomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFactorNomi(this.factornomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFactorNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,factornomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.factornomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFactorNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				this.factornomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				this.factornomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.factornomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.factornomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FactorNomiModel) this.jTableDatosFactorNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFactorNomi=true;
				this.inicializarActualizarBindingTablaFactorNomi(false);
				this.isEsNuevoFactorNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFactorNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFactorNomi(false);
				
				this.habilitarDeshabilitarControlesFactorNomi(false);
				
				
				
				if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFactorNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFactorNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFactorNomi.getRowCount()>=1) {
				jTableDatosFactorNomi.removeRowSelectionInterval(0, jTableDatosFactorNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFactorNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFactorNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFactorNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFactorNomi(false) ;
			
			this.isEsNuevoFactorNomi=false;
			
			if(FactorNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFactorNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFactorNomi(false);
				
				//SI ES MANUAL
				if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFactorNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFactorNomi--;			
			//FactorNomi factornomiAux= new FactorNomi();			
			//factornomiAux.setId(this.iIdNuevoFactorNomi);
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFactorNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
			
			this.factornomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.factornomiLogic.getFactorNomis().add(this.factornomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.factornomis.add(this.factornomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFactorNomi(false);
			
			this.jTableDatosFactorNomi.setRowSelectionInterval(this.getIndiceNuevoFactorNomi(), this.getIndiceNuevoFactorNomi());
			
			int iLastRow =  this.jTableDatosFactorNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFactorNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFactorNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFactorNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFactorNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFactorNomi(false);
			
			//SI ES MANUAL
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFactorNomi();
			}
			
			//this.abrirFrameTreeFactorNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFactorNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Factor NomiS ?", "MANTENIMIENTO DE Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFactorNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFactorNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.factornomiReturnGeneral=factornomiLogic.procesarImportacionFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.factornomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFactorNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFactorNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFactorNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFactorNomi.setFileImportacion(this.jInternalFrameImportacionFactorNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFactorNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFactorNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFactorNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFactorNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		

		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FactorNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FactorNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteFactorNomis("Todos",factornomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FactorNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoFactorNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FactorNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FactorNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FactorNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoFactorNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FactorNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FactorNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FactorNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FactorNomi factornomi:factornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(factornomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FactorNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FactorNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(FactorNomi factornomi:factornomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(factornomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelFactorNomi(row);				
			//	iRow++;
			//}				
			
			//for(FactorNomi factornomiAux:factornomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFactorNomi(factornomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFactorNomi(false);
			
			//SI ES MANUAL
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFactorNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFactorNomi(false);
			
			//SI ES MANUAL
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFactorNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFactorNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFactorNomi(false);
			
			//SI ES MANUAL
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFactorNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFactorNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFactorNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFactorNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFactorNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFactorNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFactorNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosFactorNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosFactorNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFactorNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFactorNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFactorNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFactorNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFactorNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFactorNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFactorNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFactorNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FactorNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFactorNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFactorNomi();
		
		this.inicializarActualizarBindingBotonesManualFactorNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFactorNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFactorNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFactorNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFactorNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFactorNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFactorNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFactorNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFactorNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionNuevoFactorNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionSinCerrarFactorNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionSinMensajeFactorNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFactorNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFactorNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFactorNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFactorNomi!=null) {
				this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionNuevoFactorNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionSinCerrarFactorNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFactorNomi.jCheckBoxPostAccionSinMensajeFactorNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFactorNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFactorNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFactorNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFactorNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFactorNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFactorNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFactorNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFactorNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFactorNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFactorNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFactorNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFactorNomi() throws Exception {
		try	{
			if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFactorNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFactorNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFactorNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFactorNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFactorNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFactorNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFactorNomi.addItem(reporte);
			}
			
			
			if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFactorNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFactorNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFactorNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFactorNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFactorNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFactorNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFactorNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFactorNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFactorNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFactorNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFactorNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFactorNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFactorNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFactorNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFactorNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFactorNomi(Boolean esInicializar) throws Exception {				
		if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFactorNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFactorNomi() throws Exception {
		this.inicializarActualizarBindingTablaFactorNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFactorNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFactorNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFactorNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFactorNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=factornomiLogic.getFactorNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=factornomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFactorNomi.setModel(new FactorNomiModel(this.factornomiLogic.getFactorNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFactorNomi.setModel(new FactorNomiModel(this.factornomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFactorNomi!=null && this.jInternalFrameOrderByFactorNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFactorNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FactorNomiConstantesFunciones.SCLASSWEBTITULO,factornomiConstantesFunciones.resaltarSeleccionarFactorNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FactorNomiConstantesFunciones.SCLASSWEBTITULO,factornomiConstantesFunciones.resaltarSeleccionarFactorNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,FactorNomiConstantesFunciones.LABEL_ID));

		if(this.factornomiConstantesFunciones.mostraridFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FactorNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.factornomiConstantesFunciones.resaltaridFactorNomi,this.factornomiConstantesFunciones.activaridFactorNomi,this,true,"idFactorNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.factornomiConstantesFunciones.resaltaridFactorNomi,this.factornomiConstantesFunciones.activaridFactorNomi,this,true,"idFactorNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,FactorNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.factornomiConstantesFunciones.mostrarid_empresaFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FactorNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.factornomiConstantesFunciones.resaltarid_empresaFactorNomi,this,this.factornomiConstantesFunciones.activarid_empresaFactorNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.factornomiConstantesFunciones.resaltarid_empresaFactorNomi,this,this.factornomiConstantesFunciones.activarid_empresaFactorNomi,false,"id_empresaFactorNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,FactorNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.factornomiConstantesFunciones.mostrarnombreFactorNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FactorNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.factornomiConstantesFunciones.resaltarnombreFactorNomi,this.factornomiConstantesFunciones.activarnombreFactorNomi,this,true,"nombreFactorNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.factornomiConstantesFunciones.resaltarnombreFactorNomi,this.factornomiConstantesFunciones.activarnombreFactorNomi,this,true,"nombreFactorNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FactorNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.factornomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormatoNomiFactorNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiFactorNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomi Factor Nomis");
				tableColumn.setHeaderValue("Formato Nomi Factor Nomis");
				tableColumn.setCellRenderer(new FormatoNomiFactorNomiTableCell(factornomiConstantesFunciones.resaltarFormatoNomiFactorNomiFactorNomi,this,this.factornomiConstantesFunciones.activarFormatoNomiFactorNomiFactorNomi));
				tableColumn.setCellEditor(new FormatoNomiFactorNomiTableCell(factornomiConstantesFunciones.resaltarFormatoNomiFactorNomiFactorNomi,this,this.factornomiConstantesFunciones.activarFormatoNomiFactorNomiFactorNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFactorNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosPreguntaNomi && this.factornomiConstantesFunciones.mostrarPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pregunta Nomis");
				tableColumn.setHeaderValue("Pregunta Nomis");
				tableColumn.setCellRenderer(new PreguntaNomiTableCell(factornomiConstantesFunciones.resaltarPreguntaNomiFactorNomi,this,this.factornomiConstantesFunciones.activarPreguntaNomiFactorNomi));
				tableColumn.setCellEditor(new PreguntaNomiTableCell(factornomiConstantesFunciones.resaltarPreguntaNomiFactorNomi,this,this.factornomiConstantesFunciones.activarPreguntaNomiFactorNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFactorNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosFormatoNomiPreguntaNomi && this.factornomiConstantesFunciones.mostrarFormatoNomiPreguntaNomiFactorNomi && !FactorNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomi Pregunta Nomis");
				tableColumn.setHeaderValue("Formato Nomi Pregunta Nomis");
				tableColumn.setCellRenderer(new FormatoNomiPreguntaNomiTableCell(factornomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFactorNomi,this,this.factornomiConstantesFunciones.activarFormatoNomiPreguntaNomiFactorNomi));
				tableColumn.setCellEditor(new FormatoNomiPreguntaNomiTableCell(factornomiConstantesFunciones.resaltarFormatoNomiPreguntaNomiFactorNomi,this,this.factornomiConstantesFunciones.activarFormatoNomiPreguntaNomiFactorNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFactorNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.factornomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.factornomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFactorNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.factornomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.factornomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFactorNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFactorNomi && this.isPermisoGuardarCambiosFactorNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.factornomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.factornomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFactorNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.factornomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosFactorNomi.addColumn(tableColumn);
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
			
			this.jTableDatosFactorNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFactorNomi && this.isPermisoGuardarCambiosFactorNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.factornomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFactorNomi && this.isPermisoGuardarCambiosFactorNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFactorNomi.moveColumn(this.jTableDatosFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFactorNomi.moveColumn(this.jTableDatosFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.factornomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFactorNomi.moveColumn(this.jTableDatosFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFactorNomi.moveColumn(this.jTableDatosFactorNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFactorNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFactorNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFactorNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFactorNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFactorNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFactorNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFactorNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFactorNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=factornomiLogic.getFactorNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=factornomis.size()-1;
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
		//this.jTableDatosFactorNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFactorNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFactorNomi();
			
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
				
				//this.isEsNuevoFactorNomi=false;
					
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
				if(this.factornomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFactorNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFactorNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFactorNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.factornomi.getsType().equals("DUPLICADO")
				   || this.factornomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFactorNomi=true;
				
				} else {
					this.isEsNuevoFactorNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.factornomiSessionBean.getEsGuardarRelacionado()) {
					if(this.factornomi.getId()>=0 && !this.factornomi.getIsNew()) {						
						this.isEsNuevoFactorNomi=false;
						
					} else {
						this.isEsNuevoFactorNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFactorNomi(esRelaciones);						
				
				this.seleccionarFactorNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.factornomi.getId()<0) {
					this.isEsNuevoFactorNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFactorNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFactorNomi(evt,rowIndex);
				}	
				
				if(this.factornomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FactorNomi: " + this.dDif); 
					}
				}								
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFactorNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.factornomi)) {
					if(this.factornomi.getId()>0) {
						this.factornomi.setIsDeleted(true);
						
						this.factornomisEliminados.add(this.factornomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.factornomiLogic.getFactorNomis().remove(this.factornomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.factornomis.remove(this.factornomi);				
					}
					
					
					((FactorNomiModel) this.jTableDatosFactorNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFactorNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFactorNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFactorNomi) {
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFactorNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFactorNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFactorNomi(this.factornomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.factornomiConstantesFunciones.cargarid_empresaFactorNomi || this.factornomiConstantesFunciones.event_dependid_empresaFactorNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.factornomi.getid_empresa());
									//this.inicializarActualizarBindingFactorNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(factornomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(factornomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.factornomi.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFactorNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFactorNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFactorNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFactorNomi(FactorNomi factornomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFactorNomi(factornomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFactorNomi(FactorNomi factornomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFactorNomi(factornomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFactorNomi(factornomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFactorNomi(factornomi);
	}
	
	public void setVariablesObjetoActualToFormularioFactorNomi(FactorNomi factornomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setText(factornomi.getId().toString());
			this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setText(factornomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FactorNomi factornomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,factornomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FactorNomi factornomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				factornomiLocal=this.factornomi;
			} else {
				factornomiLocal=this.factornomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(factornomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFactorNomi(factornomiLocal,true);
					
					if(factornomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(factornomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(factornomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFactorNomi(FactorNomi factornomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFactorNomi(factornomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(factornomi);
	}
	
	public void setVariablesFormularioToObjetoActualFactorNomi(FactorNomi factornomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFactorNomi(factornomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFactorNomi(FactorNomi factornomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.getText()==null || this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.getText()=="" || this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setText("0");
			}

			if(conColumnasBase) {factornomi.setId(Long.parseLong(this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FactorNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFactorNomi.jLabelIdFactorNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			factornomi.setnombre(this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FactorNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFactorNomi.jLabelnombreFactorNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFactorNomi(FactorNomi factornomiBean,FactorNomi factornomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFactorNomi(FactorNomi factornomiOrigen,FactorNomi factornomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && factornomiOrigen.getId()!=null && !factornomiOrigen.getId().equals(0L))) {factornomi.setId(factornomiOrigen.getId());}}
			if(conDefault || (!conDefault && factornomiOrigen.getnombre()!=null && !factornomiOrigen.getnombre().equals(""))) {factornomi.setnombre(factornomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFactorNomi(FactorNomi factornomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setText(factornomi.getId().toString());
			this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setText(factornomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFactorNomi(FactorNomiBean factornomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setText(factornomiBean.getId().toString());
			this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setText(factornomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFactorNomi(FactorNomiParameterReturnGeneral factornomiReturnGeneral,FactorNomiBean factornomiBean,Boolean conDefault) throws Exception { 
		try {
			FactorNomi factornomiLocal=new FactorNomi();
			
			factornomiLocal=factornomiReturnGeneral.getFactorNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && factornomiLocal.getId()!=null && !factornomiLocal.getId().equals(0L))) {factornomiBean.setId(factornomiLocal.getId());}}
			if(conDefault || (!conDefault && factornomiLocal.getnombre()!=null && !factornomiLocal.getnombre().equals(""))) {factornomiBean.setnombre(factornomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFactorNomiGenerico(Long idFactorNomiSeleccionado,JComboBox jComboBoxFactorNomi,List<FactorNomi> factornomisLocal)throws Exception {
		try {
			FactorNomi  factornomiTemp=null;

			for(FactorNomi factornomiAux:factornomisLocal) {
				if(factornomiAux.getId()!=null && factornomiAux.getId().equals(idFactorNomiSeleccionado)) {
					factornomiTemp=factornomiAux;
					break;
				}
			}

			jComboBoxFactorNomi.setSelectedItem(factornomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFactorNomiGenerico(JComboBox jComboBoxFactorNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFactorNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFactorNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFactorNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFactorNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFactorNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFactorNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormatoNomiFactorNomi")) {
			jButtonFormatoNomiFactorNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PreguntaNomi")) {
			jButtonPreguntaNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FormatoNomiPreguntaNomi")) {
			jButtonFormatoNomiPreguntaNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			factornomi=(FactorNomi) factornomiLogic.getFactorNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			factornomi =(FactorNomi) factornomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!factornomi.getIsNew() && !factornomi.getIsChanged() && !factornomi.getIsDeleted()) {
				sDescripcion=factornomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=factornomi.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FactorNomi factornomiRow=new FactorNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			factornomiRow=(FactorNomi) factornomiLogic.getFactorNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			factornomiRow=(FactorNomi) factornomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormatoNomiFactorNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FactorNomi factornomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFactorNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi = (FactorNomi)this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.factornomi = (FactorNomi)this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(factornomi!=null) {
						this.factornomi = factornomi;
					} else {
						this.factornomi = new FactorNomi();
					}
				}

				if(this.isTienePermisosFormatoNomiFactorNomi && this.permiteMantenimiento(this.factornomi)) {
					FormatoNomiFactorNomiBeanSwingJInternalFrame formatonomifactornomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup=new FormatoNomiFactorNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomifactornomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup;
					} else {
						formatonomifactornomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame;
					}

					List<FactorNomi> factornomis=new ArrayList<FactorNomi>();
					factornomis.add(this.factornomi);
					if(!esRelacionado) {
						//formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setConGuardarRelaciones(false);
						//formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomifactornomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFactorNomi.cargarFormatoNomiFactorNomiBeanSwingJInternalFrame(factornomis,this.factornomi,formatonomifactornomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getConGuardarRelaciones(),formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiSessionBean.getEsGuardarRelacionado());
					formatonomifactornomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomifactornomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiFactorNomi("no_relacionado");

						formatonomifactornomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiFactorNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiFactorNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomifactornomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFactorNomi=(TitledBorder)this.jScrollPanelDatosFactorNomi.getBorder();
						TitledBorder titledBorderFormatoNomiFactorNomi=(TitledBorder)formatonomifactornomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiFactorNomi.getBorder();

						titledBorderFormatoNomiFactorNomi.setTitle(titledBorderFactorNomi.getTitle() + " -> Formato Nomi Factor Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomifactornomiBeanSwingJInternalFrame);
						}

						formatonomifactornomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomifactornomiBeanSwingJInternalFrame);

						formatonomifactornomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.factornomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi Factor Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPreguntaNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FactorNomi factornomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFactorNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi = (FactorNomi)this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.factornomi = (FactorNomi)this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(factornomi!=null) {
						this.factornomi = factornomi;
					} else {
						this.factornomi = new FactorNomi();
					}
				}

				if(this.isTienePermisosPreguntaNomi && this.permiteMantenimiento(this.factornomi)) {
					PreguntaNomiBeanSwingJInternalFrame preguntanomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup=new PreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						preguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup;
					} else {
						preguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame;
					}

					List<FactorNomi> factornomis=new ArrayList<FactorNomi>();
					factornomis.add(this.factornomi);
					if(!esRelacionado) {
						//preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setConGuardarRelaciones(false);
						//preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					preguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFactorNomi.cargarPreguntaNomiBeanSwingJInternalFrame(factornomis,this.factornomi,preguntanomiBeanSwingJInternalFrame,/*conInicializar,*/preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.getConGuardarRelaciones(),preguntanomiBeanSwingJInternalFrame.preguntanomiSessionBean.getEsGuardarRelacionado());
					preguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						preguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsPreguntaNomi("no_relacionado");

						preguntanomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PreguntaNomiConstantesFunciones.ITAMANIOFILATABLA + (PreguntaNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						preguntanomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFactorNomi=(TitledBorder)this.jScrollPanelDatosFactorNomi.getBorder();
						TitledBorder titledBorderPreguntaNomi=(TitledBorder)preguntanomiBeanSwingJInternalFrame.jScrollPanelDatosPreguntaNomi.getBorder();

						titledBorderPreguntaNomi.setTitle(titledBorderFactorNomi.getTitle() + " -> Pregunta Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,preguntanomiBeanSwingJInternalFrame);
						}

						preguntanomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(preguntanomiBeanSwingJInternalFrame);

						preguntanomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.factornomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pregunta Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFormatoNomiPreguntaNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FactorNomi factornomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFactorNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi = (FactorNomi)this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.factornomi = (FactorNomi)this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(factornomi!=null) {
						this.factornomi = factornomi;
					} else {
						this.factornomi = new FactorNomi();
					}
				}

				if(this.isTienePermisosFormatoNomiPreguntaNomi && this.permiteMantenimiento(this.factornomi)) {
					FormatoNomiPreguntaNomiBeanSwingJInternalFrame formatonomipreguntanomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=new FormatoNomiPreguntaNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup;
					} else {
						formatonomipreguntanomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame;
					}

					List<FactorNomi> factornomis=new ArrayList<FactorNomi>();
					factornomis.add(this.factornomi);
					if(!esRelacionado) {
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setConGuardarRelaciones(false);
						//formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFactorNomi.cargarFormatoNomiPreguntaNomiBeanSwingJInternalFrame(factornomis,this.factornomi,formatonomipreguntanomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getConGuardarRelaciones(),formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiSessionBean.getEsGuardarRelacionado());
					formatonomipreguntanomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomipreguntanomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomiPreguntaNomi("no_relacionado");

						formatonomipreguntanomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiPreguntaNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomipreguntanomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFactorNomi=(TitledBorder)this.jScrollPanelDatosFactorNomi.getBorder();
						TitledBorder titledBorderFormatoNomiPreguntaNomi=(TitledBorder)formatonomipreguntanomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomiPreguntaNomi.getBorder();

						titledBorderFormatoNomiPreguntaNomi.setTitle(titledBorderFactorNomi.getTitle() + " -> Formato Nomi Pregunta Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomipreguntanomiBeanSwingJInternalFrame);
						}

						formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomipreguntanomiBeanSwingJInternalFrame);

						formatonomipreguntanomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.factornomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi Pregunta Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFactorNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi));			
			this.jButtonDuplicarFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFactorNomi && this.isPermisoDuplicarFactorNomi));			
			this.jButtonCopiarFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFactorNomi && this.isPermisoCopiarFactorNomi));
			this.jButtonVerFormFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFactorNomi && this.isPermisoVerFormFactorNomi));
			
			this.jButtonAbrirOrderByFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));			
			
			this.jButtonNuevoRelacionesFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFactorNomi && this.isPermisoNuevoFactorNomi));			
			this.jButtonNuevoGuardarCambiosFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi && this.isPermisoGuardarCambiosFactorNomi));
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonModificarFactorNomi.setVisible((this.isVisibilidadCeldaModificarFactorNomi && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFactorNomi && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFactorNomi && this.isPermisoEliminarFactorNomi));
			this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFactorNomi);							
			this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFactorNomi && this.isPermisoGuardarCambiosFactorNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFactorNomi && this.isPermisoGuardarCambiosFactorNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi));						
			this.jButtonDuplicarToolBarFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFactorNomi && this.isPermisoDuplicarFactorNomi));						
			this.jButtonCopiarToolBarFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFactorNomi && this.isPermisoCopiarFactorNomi));			
			this.jButtonVerFormToolBarFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFactorNomi && this.isPermisoVerFormFactorNomi));			
			this.jButtonAbrirOrderByToolBarFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));
			this.jButtonNuevoRelacionesToolBarFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFactorNomi && this.isPermisoNuevoFactorNomi));			
			this.jButtonNuevoGuardarCambiosToolBarFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi && this.isPermisoGuardarCambiosFactorNomi));			
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonModificarToolBarFactorNomi.setVisible((this.isVisibilidadCeldaModificarFactorNomi && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarToolBarFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFactorNomi  && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarToolBarFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFactorNomi && this.isPermisoEliminarFactorNomi));
			this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarToolBarFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFactorNomi);				
			this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosToolBarFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFactorNomi && this.isPermisoGuardarCambiosFactorNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFactorNomi && this.isPermisoGuardarCambiosFactorNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi));			
			this.jMenuItemDuplicarFactorNomi.setVisible((this.isVisibilidadCeldaDuplicarFactorNomi && this.isPermisoDuplicarFactorNomi));			
			this.jMenuItemCopiarFactorNomi.setVisible((this.isVisibilidadCeldaCopiarFactorNomi && this.isPermisoCopiarFactorNomi));			
			this.jMenuItemVerFormFactorNomi.setVisible((this.isVisibilidadCeldaVerFormFactorNomi && this.isPermisoVerFormFactorNomi));			
			this.jMenuItemAbrirOrderByFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));			
			//this.jMenuItemMostrarOcultarFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));
			this.jMenuItemDetalleAbrirOrderByFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));			
			//this.jMenuItemDetalleMostrarOcultarFactorNomi.setVisible((this.isVisibilidadCeldaOrdenFactorNomi && this.isPermisoOrdenFactorNomi));			
			this.jMenuItemNuevoRelacionesFactorNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesFactorNomi && this.isPermisoNuevoFactorNomi));			
			this.jMenuItemNuevoGuardarCambiosFactorNomi.setVisible((this.isVisibilidadCeldaNuevoFactorNomi && this.isPermisoNuevoFactorNomi && this.isPermisoGuardarCambiosFactorNomi));									
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemModificarFactorNomi.setVisible((this.isVisibilidadCeldaModificarFactorNomi && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemActualizarFactorNomi.setVisible((this.isVisibilidadCeldaActualizarFactorNomi && this.isPermisoActualizarFactorNomi));	
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemEliminarFactorNomi.setVisible((this.isVisibilidadCeldaEliminarFactorNomi && this.isPermisoEliminarFactorNomi));
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemCancelarFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFactorNomi);				
			}
			
			this.jMenuItemGuardarCambiosFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFactorNomi && this.isPermisoGuardarCambiosFactorNomi));						
			this.jMenuItemGuardarCambiosTablaFactorNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosFactorNomi && this.isPermisoGuardarCambiosFactorNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFactorNomi=this.jButtonNuevoFactorNomi.isVisible();
			this.isVisibilidadCeldaDuplicarFactorNomi=this.jButtonDuplicarFactorNomi.isVisible();
			this.isVisibilidadCeldaCopiarFactorNomi=this.jButtonCopiarFactorNomi.isVisible();
			this.isVisibilidadCeldaVerFormFactorNomi=this.jButtonVerFormFactorNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenFactorNomi=this.jButtonAbrirOrderByFactorNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=this.jButtonNuevoRelacionesFactorNomi.isVisible();
			this.isVisibilidadCeldaModificarFactorNomi=this.jButtonModificarFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.isVisibilidadCeldaActualizarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=this.jButtonGuardarCambiosTablaFactorNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFactorNomi=this.jButtonNuevoToolBarFactorNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=this.jButtonNuevoRelacionesToolBarFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.isVisibilidadCeldaModificarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonModificarToolBarFactorNomi.isVisible();
			this.isVisibilidadCeldaActualizarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarToolBarFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarToolBarFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarToolBarFactorNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFactorNomi=this.jButtonGuardarCambiosToolBarFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=this.jButtonGuardarCambiosTablaToolBarFactorNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFactorNomi=this.jMenuItemNuevoFactorNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=this.jMenuItemNuevoRelacionesFactorNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.isVisibilidadCeldaModificarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jMenuItemModificarFactorNomi.isVisible();
			this.isVisibilidadCeldaActualizarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jMenuItemActualizarFactorNomi.isVisible();
			this.isVisibilidadCeldaEliminarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jMenuItemEliminarFactorNomi.isVisible();
			this.isVisibilidadCeldaCancelarFactorNomi=this.jInternalFrameDetalleFormFactorNomi.jMenuItemCancelarFactorNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFactorNomi=this.jMenuItemGuardarCambiosFactorNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=this.jMenuItemGuardarCambiosTablaFactorNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFactorNomi(Boolean esInicializar) {
		if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.factornomiSessionBean.getConGuardarRelaciones()) {
				//if(this.factornomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFactorNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualFactorNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFactorNomi() {
		this.jButtonNuevoFactorNomi.setVisible(this.isPermisoNuevoFactorNomi);			
		this.jButtonDuplicarFactorNomi.setVisible(this.isPermisoDuplicarFactorNomi);			
		this.jButtonCopiarFactorNomi.setVisible(this.isPermisoCopiarFactorNomi);			
		this.jButtonVerFormFactorNomi.setVisible(this.isPermisoVerFormFactorNomi);			
		
		this.jButtonAbrirOrderByFactorNomi.setVisible(this.isPermisoOrdenFactorNomi);					
		
		this.jButtonNuevoRelacionesFactorNomi.setVisible(this.isPermisoNuevoFactorNomi);			
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonModificarFactorNomi.setVisible(this.isPermisoActualizarFactorNomi);	
			this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.setVisible(this.isPermisoActualizarFactorNomi);	
			this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.setVisible(this.isPermisoEliminarFactorNomi);
			this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFactorNomi);						
			this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.setVisible(this.isPermisoGuardarCambiosFactorNomi);							
		}
		
		this.jButtonGuardarCambiosTablaFactorNomi.setVisible(this.isPermisoActualizarFactorNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFactorNomi() {
		this.jInternalFrameDetalleFormFactorNomi.jButtonModificarFactorNomi.setVisible(this.isPermisoActualizarFactorNomi);	
		this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.setVisible(this.isPermisoActualizarFactorNomi);	
		this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.setVisible(this.isPermisoEliminarFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.setVisible(this.isVisibilidadCeldaCancelarFactorNomi);							
		this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.setVisible((this.isVisibilidadCeldaGuardarFactorNomi && this.isPermisoGuardarCambiosFactorNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFactorNomi() {
		if(FactorNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFactorNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFactorNomi() {
	}
	
	public void jTableDatosFactorNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFactorNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFactorNomi(this.getfactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.factornomi==null) {
						this.factornomi = new FactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
				}

				if(this.factornomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.factornomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFactorNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFactorNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFactorNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFactorNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFactorNomi(this.getfactornomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.factornomiLogic.getConnexion());

				if(this.factornomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.factornomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFactorNomi=(TitledBorder)this.jScrollPanelDatosFactorNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFactorNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFactorNomi(this.getfactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.factornomi==null) {
						this.factornomi = new FactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
				}

				if(this.factornomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.factornomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreFactorNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFactorNomi(this.getfactornomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.factornomi==null) {
						this.factornomi = new FactorNomi();
					}

					this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);
				}

				if(this.factornomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.factornomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFactorNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaFactorNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFactorNomi(false,false);

			this.getFactorNomisFK_IdEmpresa();

			this.inicializarActualizarBindingFactorNomi(false);

			//if(FactorNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFactorNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.factornomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFactorNomi() {
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
		

		if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
			this.jInternalFrameDetalleFormFactorNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormFactorNomi.dispose();
			this.jInternalFrameDetalleFormFactorNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
			this.jInternalFrameReporteDinamicoFactorNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFactorNomi.dispose();
			this.jInternalFrameReporteDinamicoFactorNomi=null;
		}
		
		if(this.jInternalFrameImportacionFactorNomi!=null) {
			this.jInternalFrameImportacionFactorNomi.setVisible(false);	    			
			this.jInternalFrameImportacionFactorNomi.dispose();
			this.jInternalFrameImportacionFactorNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFactorNomi();
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFactorNomi")) {
				jButtonDuplicarFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFactorNomi")) {
				jButtonCopiarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormFactorNomi")) {
				jButtonVerFormFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFactorNomi")) {
				jButtonDuplicarFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFactorNomi")) {
				jButtonDuplicarFactorNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFactorNomi")) {
				jButtonModificarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFactorNomi")) {
				jButtonModificarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFactorNomi")) {
				jButtonModificarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFactorNomi")) {
				jButtonActualizarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFactorNomi")) {
				jButtonActualizarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFactorNomi")) {
				jButtonActualizarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarFactorNomi")) {
				jButtonEliminarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFactorNomi")) {
				jButtonEliminarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFactorNomi")) {
				jButtonEliminarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarFactorNomi")) {
				jButtonCancelarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFactorNomi")) {
				jButtonCancelarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFactorNomi")) {
				jButtonCancelarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarFactorNomi")) {
				jButtonCerrarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFactorNomi")) {
				jButtonCerrarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFactorNomi")) {
				jButtonCerrarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFactorNomi")) {
				jButtonMostrarOcultarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFactorNomi")) {
				jButtonCancelarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFactorNomi")) {
				jButtonCopiarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFactorNomi")) {
				jButtonVerFormFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFactorNomi")) {
				jButtonCopiarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFactorNomi")) {
				jButtonVerFormFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFactorNomi")) {
				jButtonRecargarInformacionFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFactorNomi")) {
				jButtonRecargarInformacionFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFactorNomi")) {
				jButtonRecargarInformacionFactorNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFactorNomi")) {
				jButtonAnterioresFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFactorNomi")) {
				jButtonAnterioresFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFactorNomi")) {
				jButtonAnterioresFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFactorNomi")) {
				jButtonSiguientesFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFactorNomi")) {
				jButtonSiguientesFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFactorNomi")) {
				jButtonSiguientesFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFactorNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByFactorNomi")) {
				jButtonAbrirOrderByFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFactorNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarFactorNomi")) {
				jButtonMostrarOcultarFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFactorNomi")) {
				jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFactorNomi")) {
				jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFactorNomi")) {
				jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFactorNomi")) {
				jButtonCerrarReporteDinamicoFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFactorNomi")) {
				jButtonGenerarReporteDinamicoFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFactorNomi")) {
				
				jButtonGenerarExcelReporteDinamicoFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFactorNomi")) {
				jButtonCerrarImportacionFactorNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFactorNomi")) {
				
				jButtonGenerarImportacionFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFactorNomi")) {
				
				jButtonAbrirImportacionFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFactorNomi")) {
				jComboBoxTiposAccionesFactorNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFactorNomi")) {
				jComboBoxTiposRelacionesFactorNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFactorNomi")) {
				jComboBoxTiposAccionesFactorNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFactorNomi")) {
				
				jComboBoxTiposSeleccionarFactorNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFactorNomi")) {
				jTextFieldValorCampoGeneralFactorNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFactorNomi")) {
				jButtonAbrirOrderByFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFactorNomi")) {
				jButtonAbrirOrderByFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFactorNomi")) {
				jButtonCerrarOrderByFactorNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFactorNomiBusqueda")) {
				this.jButtonidFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFactorNomiUpdate")) {
				this.jButtonid_empresaFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFactorNomiBusqueda")) {
				this.jButtonid_empresaFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFactorNomiBusqueda")) {
				this.jButtonnombreFactorNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFactorNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FactorNomi factornomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				factornomiLocal=this.factornomi;
			} else {
				factornomiLocal=this.factornomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
							
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
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
			
			


			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
								
						
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
								
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
							
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
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
			
			


			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
								
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFactorNomi")) {
					jCheckBoxSeleccionarTodosFactorNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFactorNomi")) {
					jCheckBoxSeleccionadosFactorNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFactorNomi")) {
					
				}
				
				


				
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
												
				
				


				
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
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
			
			


			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFactorNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.factornomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.factornomi);
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
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
				
				


				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FactorNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FactorNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFactorNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.factornomiAnterior =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.factornomiAnterior =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFactorNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFactorNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFactorNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.factornomi =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.factornomi =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.factornomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFactorNomi")) {
				
				}
				
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFactorNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFactorNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFactorNomi")) {
			
			}
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFactorNomi();
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			if(sTipo.equals("NuevoFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFactorNomi")) {
				jButtonDuplicarFactorNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFactorNomi")) {
				jButtonCopiarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFactorNomi")) {
				jButtonVerFormFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFactorNomi")) {
				jButtonNuevoFactorNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFactorNomi")) {
				jButtonModificarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFactorNomi")) {
				jButtonActualizarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFactorNomi")) {
				jButtonEliminarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFactorNomi")) {
				jButtonCancelarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFactorNomi")) {
				jButtonCerrarFactorNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFactorNomi")) {
				jButtonGuardarCambiosFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFactorNomi")) {
				jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFactorNomi")) {
				jButtonAbrirOrderByFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFactorNomi")) {
				jButtonRecargarInformacionFactorNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFactorNomi")) {
				jButtonAnterioresFactorNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFactorNomi")) {
				jButtonSiguientesFactorNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFactorNomiBusqueda")) {
				this.jButtonidFactorNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFactorNomiUpdate")) {
				this.jButtonid_empresaFactorNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFactorNomiBusqueda")) {
				this.jButtonid_empresaFactorNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreFactorNomiBusqueda")) {
				this.jButtonnombreFactorNomiBusquedaActionPerformed(evt);
			}
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFactorNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFactorNomi")) {
				closingInternalFrameFactorNomi();
				
			} else if(sTipo.equals("jButtonCancelarFactorNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormFactorNomi = (JInternalFrameBase)evt.getSource();
	            	
	            FactorNomiBeanSwingJInternalFrame jInternalFrameParent=(FactorNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFactorNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFactorNomiActionPerformed(null);
			}
			
			FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.factornomi,new Object(),this.factornomiParameterGeneral,this.factornomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFactorNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFactorNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFactorNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.factornomi)) {
			if(!esControlTabla) {
				if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);			
				}
				
				if(this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFactorNomi(this.factornomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.factornomiReturnGeneral=factornomiLogic.procesarEventosFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.factornomiLogic.getFactorNomis(),this.factornomi,this.factornomiParameterGeneral,this.isEsNuevoFactorNomi,classes);//this.factornomiLogic.getFactorNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFactorNomi(this.factornomiReturnGeneral,this.factornomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.factornomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFactorNomi(classes,this.factornomiReturnGeneral,this.factornomiBean,false);
					}
						
					if(this.factornomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFactorNomi(this.factornomiReturnGeneral.getFactorNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFactorNomi(this.factornomiReturnGeneral.getFactorNomi());	
					}
						
					if(this.factornomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFactorNomi(this.factornomiReturnGeneral.getFactorNomi(),classes);//this.factornomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFactorNomi(this.factornomi,classes);//this.factornomiBean);									
				}
			
				if(FactorNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFactorNomi(this.factornomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFactorNomi(this.factornomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.factornomiAnterior!=null) {
						this.factornomi=this.factornomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.factornomiReturnGeneral=factornomiLogic.procesarEventosFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.factornomiLogic.getFactorNomis(),this.factornomi,this.factornomiParameterGeneral,this.isEsNuevoFactorNomi,classes);//this.factornomiLogic.getFactorNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.factornomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.factornomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.factornomiReturnGeneral.getFactorNomi(),factornomiLogic.getFactorNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.factornomiReturnGeneral.getFactorNomi(),this.factornomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFactorNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosFactorNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFactorNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosFactorNomi() throws Exception {
		
		FactorNomiModel factornomiModel=(FactorNomiModel)this.jTableDatosFactorNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			factornomiModel.factornomis=this.factornomiLogic.getFactorNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			factornomiModel.factornomis=this.factornomis;
		}
		
		
		((FactorNomiModel) this.jTableDatosFactorNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFactorNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getfactornomiAnterior(),this.factornomiLogic.getFactorNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getfactornomiAnterior(),this.factornomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFactorNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFactorNomi(FactorNomi factornomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(factornomi.getFormatoNomiFactorNomis());
					this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.setPreguntaNomis(factornomi.getPreguntaNomis());
					this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(factornomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
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
										
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.factornomi,new Object(),generalEntityParameterGeneral,this.factornomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.factornomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FactorNomiConstantesFunciones.getClassesRelationshipsOfFactorNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FactorNomiConstantesFunciones.getClassesRelationshipsFromStringsOfFactorNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFactorNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FactorNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.factornomi,new Object(),generalEntityParameterGeneral,this.factornomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFactorNomi(FactorNomiBean factornomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.setFormatoNomiFactorNomis(factornomi.getFormatoNomiFactorNomis());
					this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiFactorNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.setPreguntaNomis(factornomi.getPreguntaNomis());
					this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaPreguntaNomi(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.setFormatoNomiPreguntaNomis(factornomi.getFormatoNomiPreguntaNomis());
					this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomiPreguntaNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFactorNomi(ArrayList<Classe> classes,FactorNomiReturnGeneral factornomiReturnGeneral,FactorNomiBean factornomiBean,Boolean conDefault) throws Exception {
		
			this.factornomiBean.setFormatoNomiFactorNomis(factornomiReturnGeneral.getFactorNomi().getFormatoNomiFactorNomis());
			this.factornomiBean.setPreguntaNomis(factornomiReturnGeneral.getFactorNomi().getPreguntaNomis());
			this.factornomiBean.setFormatoNomiPreguntaNomis(factornomiReturnGeneral.getFactorNomi().getFormatoNomiPreguntaNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFactorNomi(FactorNomi factornomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiFactorNomi.class)) {
					factornomi.setFormatoNomiFactorNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiBeanSwingJInternalFrame.formatonomifactornomiLogic.getFormatoNomiFactorNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PreguntaNomi.class)) {
					factornomi.setPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.preguntanomiBeanSwingJInternalFrame.preguntanomiLogic.getPreguntaNomis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomiPreguntaNomi.class)) {
					factornomi.setFormatoNomiPreguntaNomis(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiBeanSwingJInternalFrame.formatonomipreguntanomiLogic.getFormatoNomiPreguntaNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.factornomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFactorNomi = new FactorNomiDetalleFormJInternalFrame(jDesktopPane,this.factornomiSessionBean.getConGuardarRelaciones(),this.factornomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.setVisible(false);
		this.jInternalFrameDetalleFormFactorNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormFactorNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFactorNomi.factornomiLogic=this.factornomiLogic;
		
		this.cargarCombosFrameForeignKeyFactorNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFactorNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFactorNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFactorNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFactorNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFactorNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFactorNomi"));
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonModificarFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarFactorNomi"));

		
		this.jInternalFrameDetalleFormFactorNomi.jButtonModificarToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFactorNomi"));
					
		this.jInternalFrameDetalleFormFactorNomi.jMenuItemModificarFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.addActionListener (new ButtonActionListener(this,"ActualizarFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFactorNomi"));
						
		this.jInternalFrameDetalleFormFactorNomi.jMenuItemActualizarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFactorNomi"));
								
		this.jInternalFrameDetalleFormFactorNomi.jMenuItemEliminarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarFactorNomi"));
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFactorNomi"));
					
		this.jInternalFrameDetalleFormFactorNomi.jMenuItemCancelarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFactorNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jMenuItemDetalleCerrarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFactorNomi"));		
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFactorNomi"));
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFactorNomi"));
		
		
		
		this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFactorNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonidFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonnombreFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFactorNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFactorNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFactorNomi"));
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFactorNomi"));
		}
		
		this.jTableDatosFactorNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFactorNomi"));
		
		this.jTableDatosFactorNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFactorNomi"));
		
		this.jButtonNuevoFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoFactorNomi"));
		
		this.jButtonDuplicarFactorNomi.addActionListener(new ButtonActionListener(this,"DuplicarFactorNomi"));
		
		this.jButtonCopiarFactorNomi.addActionListener(new ButtonActionListener(this,"CopiarFactorNomi"));
		
		this.jButtonVerFormFactorNomi.addActionListener(new ButtonActionListener(this,"VerFormFactorNomi"));
		
		
		this.jButtonNuevoToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarFactorNomi"));
			
		this.jButtonDuplicarToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFactorNomi"));
			
		this.jMenuItemNuevoFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFactorNomi"));
			
		this.jMenuItemDuplicarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFactorNomi"));		
		
		
		this.jButtonNuevoRelacionesFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFactorNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFactorNomi"));
			
		this.jMenuItemNuevoRelacionesFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFactorNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonModificarFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonModificarToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarFactorNomi"));
			
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemModificarFactorNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarFactorNomi.addActionListener (new ButtonActionListener(this,"ActualizarFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonActualizarToolBarFactorNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFactorNomi"));
				
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemActualizarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonEliminarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarFactorNomi"));
						
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemEliminarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonCancelarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarFactorNomi"));
			
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemCancelarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFactorNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFactorNomi"));		
		
		
		this.jButtonCerrarFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarFactorNomi"));
		
		
		this.jButtonCerrarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarFactorNomi"));
			
		this.jMenuItemCerrarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFactorNomi"));
			
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jMenuItemDetalleCerrarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFactorNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosFactorNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFactorNomi"));
		}
		
		this.jButtonCopiarToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarFactorNomi"));
			
		this.jButtonVerFormToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarFactorNomi"));
		
		this.jMenuItemGuardarCambiosFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFactorNomi"));
			
		this.jMenuItemCopiarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFactorNomi"));		
		
		this.jMenuItemVerFormFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFactorNomi"));		
		
		
		this.jButtonGuardarCambiosTablaFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFactorNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFactorNomi"));
			
		this.jMenuItemGuardarCambiosTablaFactorNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFactorNomi"));		
		
		
		
		this.jButtonRecargarInformacionFactorNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionFactorNomi"));
					
		this.jButtonRecargarInformacionToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFactorNomi"));
		
		this.jMenuItemRecargarInformacionFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFactorNomi"));		
		
		
		
		this.jButtonAnterioresFactorNomi.addActionListener (new ButtonActionListener(this,"AnterioresFactorNomi"));
		
		
		this.jButtonAnterioresToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFactorNomi"));
		
		this.jMenuItemAnterioresFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFactorNomi"));		
		
		
		this.jButtonSiguientesFactorNomi.addActionListener (new ButtonActionListener(this,"SiguientesFactorNomi"));
		
		
		this.jButtonSiguientesToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFactorNomi"));
			
		this.jMenuItemSiguientesFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFactorNomi"));
			
		this.jMenuItemAbrirOrderByFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFactorNomi"));
			
		this.jMenuItemMostrarOcultarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFactorNomi"));
			
		this.jMenuItemDetalleAbrirOrderByFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFactorNomi"));
			
		this.jMenuItemDetalleMostarOcultarFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFactorNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFactorNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFactorNomi"));
			
		this.jMenuItemNuevoGuardarCambiosFactorNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFactorNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFactorNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFactorNomi"));

		this.jCheckBoxSeleccionadosFactorNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFactorNomi"));
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFactorNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesFactorNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesFactorNomi"));
			
		this.jComboBoxTiposAccionesFactorNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFactorNomi"));
					
		this.jComboBoxTiposSeleccionarFactorNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFactorNomi"));
			
		this.jTextFieldValorCampoGeneralFactorNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFactorNomi"));		
		
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonidFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonnombreFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFactorNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFactorNomi!=null) {
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFactorNomi"));
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFactorNomi"));
				this.jInternalFrameReporteDinamicoFactorNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFactorNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoFactorNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFactorNomi"));				
			//this.jButtonGenerarReporteDinamicoFactorNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFactorNomi"));
			//this.jButtonGenerarExcelReporteDinamicoFactorNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFactorNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFactorNomi!=null) {
				this.jInternalFrameImportacionFactorNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFactorNomi"));
				this.jInternalFrameImportacionFactorNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFactorNomi"));
				this.jInternalFrameImportacionFactorNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFactorNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFactorNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByFactorNomi"));
			
			this.jButtonAbrirOrderByToolBarFactorNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFactorNomi"));			
			
			if(this.jInternalFrameOrderByFactorNomi!=null) {
				this.jInternalFrameOrderByFactorNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFactorNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFactorNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFactorNomi.jTabbedPaneRelacionesFactorNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFactorNomi"));
		
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
            		closingInternalFrameFactorNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFactorNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFactorNomi = (JInternalFrameBase)event.getSource();
	            	
	            FactorNomiBeanSwingJInternalFrame jInternalFrameParent=(FactorNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormFactorNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFactorNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFactorNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFactorNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFactorNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFactorNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFactorNomi";
		inputMap = this.jButtonNuevoFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFactorNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFactorNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFactorNomi";
		inputMap = this.jButtonNuevoRelacionesFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFactorNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFactorNomi";
		inputMap = this.jButtonModificarFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFactorNomi";
		inputMap = this.jButtonActualizarFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFactorNomi";
		inputMap = this.jButtonEliminarFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFactorNomi";
		inputMap = this.jButtonCancelarFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFactorNomi";
		inputMap = this.jButtonCerrarFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFactorNomi";
		inputMap = this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFactorNomi.jButtonGuardarCambiosFactorNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFactorNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFactorNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFactorNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFactorNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFactorNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonidFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"idFactorNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonid_empresaFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFactorNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFactorNomi.jButtonnombreFactorNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreFactorNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFactorNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFactorNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFactorNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFactorNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFactorNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
					factornomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FactorNomi factornomiAux:factornomis) {
					factornomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFactorNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFactorNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
						factornomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FactorNomi factornomiAux:factornomis) {
						factornomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FactorNomi factornomiAux:factornomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFactorNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFactorNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFactorNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFactorNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFactorNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFactorNomi.getSelectedRows();
			
			FactorNomi factornomiLocal=new FactorNomi();
			
			//this.seleccionarTodosFactorNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					factornomiLocal =(FactorNomi) this.factornomiLogic.getFactorNomis().toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					factornomiLocal =(FactorNomi) this.factornomis.toArray()[this.jTableDatosFactorNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				factornomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
						factornomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FactorNomi factornomiAux:factornomis) {
						factornomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFactorNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFactorNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFactorNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFactorNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFactorNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFactorNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFactorNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFactorNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFactorNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FactorNomi factornomiAux:this.factornomiLogic.getFactorNomis()) {
				
						if(sTipoSeleccionar.equals(FactorNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							factornomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FactorNomi factornomiAux:factornomis) {
					
						if(sTipoSeleccionar.equals(FactorNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							factornomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFactorNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFactorNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFactorNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFactorNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFactorNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFactorNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessFactorNomi(conSplash);
				
					this.generarReporteFactorNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFactorNomisSeleccionados();
				//this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFactorNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFactorNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFactorNomi();
				
				this.exportarFactorNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFactorNomis();
				//this.importarFactorNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFactorNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFactorNomisSeleccionados();
				//this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFactorNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFactorNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFactorNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(FactorNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFactorNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFactorNomi(conSplash);
					
						//this.actualizarParametrosGeneralFactorNomi();
						
						this.generarReporteProcesoAccionFactorNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FactorNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Factor NomiS SELECCIONADOS?", "MANTENIMIENTO DE Factor Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFactorNomi();
				
						this.actualizarParametrosGeneralFactorNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.factornomiReturnGeneral=factornomiLogic.procesarAccionFactorNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.factornomiLogic.getFactorNomis(),this.factornomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFactorNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFactorNomi();
					
					FactorNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFactorNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFactorNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFactorNomi.jComboBoxTiposAccionesFormularioFactorNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFactorNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFactorNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFactorNomi();
			
			if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
			FactorNomi factornomi=new FactorNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFactorNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFactorNomi.getSelectedItem();
			
			
			
			
			factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(factornomisSeleccionados.size()==1) {
				for(FactorNomi factornomiAux:factornomisSeleccionados) {
					factornomi=factornomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formato Nomi Factor Nomi")) {
					jButtonFormatoNomiFactorNomiActionPerformed(null,rowIndex,true,false,factornomi);
				}
				else if(this.sTipoRelacion.equals("Pregunta Nomi")) {
					jButtonPreguntaNomiActionPerformed(null,rowIndex,true,false,factornomi);
				}
				else if(this.sTipoRelacion.equals("Formato Nomi Pregunta Nomi")) {
					jButtonFormatoNomiPreguntaNomiActionPerformed(null,rowIndex,true,false,factornomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFactorNomi();
			
      		//this.finishProcessFactorNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFactorNomiReturnGeneral() throws Exception {
		if(this.factornomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.factornomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.factornomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.factornomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.factornomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.factornomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFactorNomi(false);
		}
		
		if(this.factornomiReturnGeneral.getConRetornoLista() || this.factornomiReturnGeneral.getConRetornoObjeto()) {
			if(this.factornomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.factornomiLogic.setFactorNomis(this.factornomiReturnGeneral.getFactorNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.factornomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.factornomiLogic.setFactorNomi(this.factornomiReturnGeneral.getFactorNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFactorNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralFactorNomi() throws Exception {
		
		
	}
	
	public ArrayList<FactorNomi> getFactorNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFactorNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FactorNomi factornomiAux:factornomiLogic.getFactorNomis()) {
					if(factornomiAux.getIsSelected()) {
						factornomisSeleccionados.add(factornomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FactorNomi factornomiAux:this.factornomis) {
					if(factornomiAux.getIsSelected()) {
						factornomisSeleccionados.add(factornomiAux);				
					}
				}
			}
			
			if(factornomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						factornomisSeleccionados.addAll(this.factornomiLogic.getFactorNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						factornomisSeleccionados.addAll(this.factornomis);				
					}
				}
			}
		} else {
			factornomisSeleccionados.add(this.factornomi);
		}
		
		return factornomisSeleccionados;
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
	
	public void generarReporteFactorNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFactorNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFactorNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFactorNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFactorNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFactorNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Factor Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFactorNomis("Todos",factornomisSeleccionados);
		
	}	
	
	public void generarReporteNormalFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFactorNomis("Todos",factornomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFactorNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFactorNomis("Todos",factornomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFactorNomi();
		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFactorNomi();
		
		
		//this.generarReporteFactorNomis("Todos",factornomisSeleccionados ,factornomiImplementable,factornomiImplementableHome);
	}
	
	public void mostrarImportacionFactorNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFactorNomi();
		
		this.abrirFrameImportacionFactorNomi();		
		
			
		//this.generarReporteFactorNomis("Todos",factornomisSeleccionados ,factornomiImplementable,factornomiImplementableHome);
	}
	
	public void importarFactorNomis() throws Exception {		
	
	}
	
	public void exportarFactorNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFactorNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFactorNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFactorNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Factor Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFactorNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FactorNomi factornomiAux:factornomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFactorNomi(factornomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//factornomiAux.setsDetalleGeneralEntityReporte(factornomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFactorNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FactorNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FactorNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FactorNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FactorNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFactorNomi(FactorNomi factornomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=factornomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=factornomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=factornomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=factornomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FactorNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFactorNomi(row);				
				iRow++;
			}				
			
			for(FactorNomi factornomiAux:factornomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFactorNomi(factornomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFactorNomisSeleccionados() throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();		
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"factornomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("factornomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("factornomi");
			//elementRoot.appendChild(element);
		
			for(FactorNomi factornomiAux:factornomisSeleccionados) {
				element = document.createElement("factornomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFactorNomi(factornomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.factornomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Factor Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFactorNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FactorNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FactorNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FactorNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FactorNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFactorNomi(FactorNomi factornomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(factornomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(factornomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(factornomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlFactorNomi(FactorNomi factornomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FactorNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(factornomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FactorNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(factornomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FactorNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(factornomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(FactorNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(factornomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoFactorNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FactorNomi> factornomisSeleccionados=new ArrayList<FactorNomi>();
		
		factornomisSeleccionados=this.getFactorNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFactorNomi(factornomisSeleccionados);
		
		this.generarReporteFactorNomis("Todos",factornomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFactorNomi(ArrayList<FactorNomi> factornomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FactorNomi factornomiAux:factornomisSeleccionados) {
				factornomiAux.setsDetalleGeneralEntityReporte(factornomiAux.toString());
			
				if(sTipoSeleccionar.equals(FactorNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					factornomiAux.setsDescripcionGeneralEntityReporte1(factornomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FactorNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					factornomiAux.setsDescripcionGeneralEntityReporte1(factornomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FactorNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFactorNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFactorNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesFactorNomi=true;
				this.isVisibilidadCeldaGuardarCambiosFactorNomi=true;
			}
			
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=true;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=true;
			this.isVisibilidadCeldaEliminarFactorNomi=true;
			this.isVisibilidadCeldaCancelarFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=true;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=true;
			this.isVisibilidadCeldaModificarFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
			this.isVisibilidadCeldaModificarFactorNomi=true;
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
			this.isVisibilidadCeldaCancelarFactorNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarFactorNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FactorNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFactorNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=true;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=true;
		} else {
			this.actualizarEstadoPanelsFactorNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFactorNomi=false;
			//this.isVisibilidadCeldaVerFormFactorNomi=false;
			this.isVisibilidadCeldaDuplicarFactorNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!factornomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoFactorNomi=false;
			this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(factornomiSessionBean.getEsGuardarRelacionado()) {
			if(!factornomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;												
			}
			
			this.jButtonCerrarFactorNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFactorNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.factornomi)) {
			this.isVisibilidadCeldaActualizarFactorNomi=false;
			this.isVisibilidadCeldaEliminarFactorNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFactorNomi() {
		this.isVisibilidadCeldaNuevoFactorNomi=false;
		this.isVisibilidadCeldaGuardarCambiosFactorNomi=false;
	}
	
	public void actualizarEstadoPanelsFactorNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFactorNomi!=null) {
				this.jScrollPanelDatosEdicionFactorNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFactorNomi!=null) {
				this.jScrollPanelDatosFactorNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionFactorNomi!=null) {
				this.jPanelPaginacionFactorNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.factornomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFactorNomi!=null) {
					this.jTabbedPaneBusquedasFactorNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.factornomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFactorNomi!=null) {
				this.jTabbedPaneBusquedasFactorNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFactorNomi!=null) {
				this.jPanelParametrosReportesFactorNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionFactorNomiParaFormatoNomiFactorNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomiFactorNomi=false;

		try {

			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean==null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean=new FormatoNomiFactorNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setsPathNavegacionActual(factornomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiFactorNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomiFactorNomi=this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiFactorNomi(FactorNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.formatonomifactornomiSessionBean.setlidFactorNomiActual(this.idFactorNomiActual);

			factornomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFactorNomi(true);
			factornomiSessionBean.setlIdFactorNomiActualForeignKey(this.idFactorNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionFactorNomiParaPreguntaNomis() throws Exception {
		Boolean isPaginaPopupPreguntaNomi=false;

		try {

			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean==null) {
				this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean=new PreguntaNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setsPathNavegacionActual(factornomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPreguntaNomi=this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePreguntaNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePreguntaNomi(FactorNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.preguntanomiSessionBean.setlidFactorNomiActual(this.idFactorNomiActual);

			factornomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFactorNomi(true);
			factornomiSessionBean.setlIdFactorNomiActualForeignKey(this.idFactorNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionFactorNomiParaFormatoNomiPreguntaNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomiPreguntaNomi=false;

		try {

			if(this.factornomiSessionBean==null) {
				this.factornomiSessionBean=new FactorNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean==null) {
				this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean=new FormatoNomiPreguntaNomiSessionBean();
			}

			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setsPathNavegacionActual(factornomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiPreguntaNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomiPreguntaNomi=this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomiPreguntaNomi(FactorNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setisBusquedaDesdeForeignKeySesionFactorNomi(true);
			this.jInternalFrameDetalleFormFactorNomi.formatonomipreguntanomiSessionBean.setlidFactorNomiActual(this.idFactorNomiActual);

			factornomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFactorNomi(true);
			factornomiSessionBean.setlIdFactorNomiActualForeignKey(this.idFactorNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FactorNomiSessionBean factornomiSessionBean=new FactorNomiSessionBean();
		
		if(this.factornomiSessionBean==null) {
			this.factornomiSessionBean=new FactorNomiSessionBean();
		}
		
		this.factornomiSessionBean.setsUltimaBusquedaFactorNomi(this.getsAccionBusqueda());
		this.factornomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.factornomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			factornomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FactorNomiSessionBean factornomiSessionBean=new FactorNomiSessionBean();
		
		if(this.factornomiSessionBean==null) {
			this.factornomiSessionBean=new FactorNomiSessionBean();
		}
		
		if(this.factornomiSessionBean.getsUltimaBusquedaFactorNomi()!=null&&!this.factornomiSessionBean.getsUltimaBusquedaFactorNomi().equals("")) {
			this.setsAccionBusqueda(factornomiSessionBean.getsUltimaBusquedaFactorNomi());
			this.setiNumeroPaginacion(factornomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(factornomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(factornomiSessionBean.getid_empresa());
				factornomiSessionBean.setid_empresa(-1L);
			}
		}
		
		this.factornomiSessionBean.setsUltimaBusquedaFactorNomi("");
		this.factornomiSessionBean.setiNumeroPaginacion(FactorNomiConstantesFunciones.INUMEROPAGINACION);
		this.factornomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFactorNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFactorNomi() {
		this.updateBorderResaltarBusquedasFormularioFactorNomi();
		this.updateVisibilidadBusquedasFormularioFactorNomi();
		this.updateHabilitarBusquedasFormularioFactorNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioFactorNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFactorNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFactorNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFactorNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFactorNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFactorNomi.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFactorNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarFactorNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFactorNomi() throws Exception {

		if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFactorNomi();
		this.updateVisibilidadResaltarControlesFormularioFactorNomi();
		this.updateHabilitarResaltarControlesFormularioFactorNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioFactorNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.factornomiConstantesFunciones.resaltaridFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi!=null) {this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setBorder(this.factornomiConstantesFunciones.resaltaridFactorNomi);}
		if(this.factornomiConstantesFunciones.resaltarid_empresaFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi!=null) {this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setBorder(this.factornomiConstantesFunciones.resaltarid_empresaFactorNomi);}
		if(this.factornomiConstantesFunciones.resaltarnombreFactorNomi!=null && this.jInternalFrameDetalleFormFactorNomi!=null) {this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setBorder(this.factornomiConstantesFunciones.resaltarnombreFactorNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFactorNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
	
		//this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setVisible(this.factornomiConstantesFunciones.mostraridFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jPanelidFactorNomi.setVisible(this.factornomiConstantesFunciones.mostraridFactorNomi);
		//this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setVisible(this.factornomiConstantesFunciones.mostrarid_empresaFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jPanelid_empresaFactorNomi.setVisible(this.factornomiConstantesFunciones.mostrarid_empresaFactorNomi);
		//this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setVisible(this.factornomiConstantesFunciones.mostrarnombreFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jPanelnombreFactorNomi.setVisible(this.factornomiConstantesFunciones.mostrarnombreFactorNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFactorNomi() throws Exception {
		if(this.jInternalFrameDetalleFormFactorNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFactorNomi!=null) {
	
		this.jInternalFrameDetalleFormFactorNomi.jLabelidFactorNomi.setEnabled(this.factornomiConstantesFunciones.activaridFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jComboBoxid_empresaFactorNomi.setEnabled(this.factornomiConstantesFunciones.activarid_empresaFactorNomi);
		this.jInternalFrameDetalleFormFactorNomi.jTextAreanombreFactorNomi.setEnabled(this.factornomiConstantesFunciones.activarnombreFactorNomi);
		}
	}
	
		
}