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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoAreaLaboConstantesFunciones;
import com.bydan.erp.cartera.util.TipoAreaLaboParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoAreaLaboParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoAreaLaboBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoAreaLaboBeanSwingJInternalFrame extends TipoAreaLaboJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAreaLaboBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAreaLabo> tipoarealaboValidator = new ClassValidator<TipoAreaLabo>(TipoAreaLabo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAreaLabo tipoarealabo;	
	public TipoAreaLabo tipoarealaboAux;
	public TipoAreaLabo tipoarealaboAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAreaLabo tipoarealaboTotales;
	public Long idTipoAreaLaboActual;
	public Long iIdNuevoTipoAreaLabo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosInformacionLaboral=false;

	public Boolean getIsTienePermisosInformacionLaboral() {
		return isTienePermisosInformacionLaboral;
	}

	public void setIsTienePermisosInformacionLaboral(Boolean isTienePermisosInformacionLaboral) {
		this.isTienePermisosInformacionLaboral= isTienePermisosInformacionLaboral;
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
	
	public Boolean isPermisoTodoTipoAreaLabo;
	public Boolean isPermisoNuevoTipoAreaLabo;
	public Boolean isPermisoActualizarTipoAreaLabo;
	public Boolean isPermisoActualizarOriginalTipoAreaLabo;
	public Boolean isPermisoEliminarTipoAreaLabo;
	public Boolean isPermisoGuardarCambiosTipoAreaLabo;
	public Boolean isPermisoConsultaTipoAreaLabo;
	public Boolean isPermisoBusquedaTipoAreaLabo;
	public Boolean isPermisoReporteTipoAreaLabo;
	public Boolean isPermisoPaginacionMedioTipoAreaLabo;
	public Boolean isPermisoPaginacionAltoTipoAreaLabo;
	public Boolean isPermisoPaginacionTodoTipoAreaLabo;
	public Boolean isPermisoCopiarTipoAreaLabo;
	public Boolean isPermisoVerFormTipoAreaLabo;
	public Boolean isPermisoDuplicarTipoAreaLabo;
	public Boolean isPermisoOrdenTipoAreaLabo;
	
	
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
	
	public TipoAreaLaboParameterReturnGeneral tipoarealaboReturnGeneral;
	public TipoAreaLaboParameterReturnGeneral tipoarealaboParameterGeneral;
	
	

	public InformacionLaboralLogic informacionlaboralLogic=null;

	public InformacionLaboralLogic getInformacionLaboralLogic() {
		return informacionlaboralLogic;
	}

	public void setInformacionLaboralLogic(InformacionLaboralLogic informacionlaboralLogic) {
		this.informacionlaboralLogic = informacionlaboralLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoAreaLabo=false;
	public Boolean esParaAccionDesdeFormularioTipoAreaLabo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoAreaLaboSessionBeanAdditional tipoarealaboSessionBeanAdditional=null;
	
	public TipoAreaLaboSessionBeanAdditional getTipoAreaLaboSessionBeanAdditional() {
		return this.tipoarealaboSessionBeanAdditional;
	}
	
	public void setTipoAreaLaboSessionBeanAdditional(TipoAreaLaboSessionBeanAdditional tipoarealaboSessionBeanAdditional) {
		try {
			this.tipoarealaboSessionBeanAdditional=tipoarealaboSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoAreaLaboBeanSwingJInternalFrameAdditional tipoarealaboBeanSwingJInternalFrameAdditional=null;
	//public class TipoAreaLaboBeanSwingJInternalFrame
	
	public TipoAreaLaboBeanSwingJInternalFrameAdditional getTipoAreaLaboBeanSwingJInternalFrameAdditional() {
		return this.tipoarealaboBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoAreaLaboBeanSwingJInternalFrameAdditional(TipoAreaLaboBeanSwingJInternalFrameAdditional tipoarealaboBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoarealaboBeanSwingJInternalFrameAdditional=tipoarealaboBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAreaLaboLogic tipoarealaboLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAreaLabo tipoarealaboBean;
	public TipoAreaLaboConstantesFunciones tipoarealaboConstantesFunciones;
	//public TipoAreaLaboParameterReturnGeneral tipoarealaboReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoAreaLabo> tipoarealabos;	
	//public List<TipoAreaLabo> tipoarealabosEliminados;
	//public List<TipoAreaLabo> tipoarealabosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAreaLabo=true;
	public Boolean isVisibilidadCeldaCopiarTipoAreaLabo=true;
	public Boolean isVisibilidadCeldaVerFormTipoAreaLabo=true;
	public Boolean isVisibilidadCeldaOrdenTipoAreaLabo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaModificarTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaActualizarTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaEliminarTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaCancelarTipoAreaLabo=false;
	public Boolean isVisibilidadCeldaGuardarTipoAreaLabo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoAreaLabo() {
		return this.iIdNuevoTipoAreaLabo;
	}

	public void setiIdNuevoTipoAreaLabo(Long iIdNuevoTipoAreaLabo) {
		this.iIdNuevoTipoAreaLabo = iIdNuevoTipoAreaLabo;
	}
	
	public Long getidTipoAreaLaboActual() {
		return this.idTipoAreaLaboActual;
	}

	public void setidTipoAreaLaboActual(Long idTipoAreaLaboActual) {
		this.idTipoAreaLaboActual = idTipoAreaLaboActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAreaLabo gettipoarealabo() {
		return this.tipoarealabo;
	}

	public void settipoarealabo(TipoAreaLabo tipoarealabo) {
		this.tipoarealabo = tipoarealabo;
	}
	
	public TipoAreaLabo gettipoarealaboAux() {
		return this.tipoarealaboAux;
	}

	public void settipoarealaboAux(TipoAreaLabo tipoarealaboAux) {
		this.tipoarealaboAux = tipoarealaboAux;
	}				
	
	public TipoAreaLabo gettipoarealaboAnterior() {
		return this.tipoarealaboAnterior;
	}

	public void settipoarealaboAnterior(TipoAreaLabo tipoarealaboAnterior) {
		this.tipoarealaboAnterior = tipoarealaboAnterior;
	}	
	
	public TipoAreaLabo gettipoarealaboTotales() {
		return this.tipoarealaboTotales;
	}

	public void settipoarealaboTotales(TipoAreaLabo tipoarealaboTotales) {
		this.tipoarealaboTotales = tipoarealaboTotales;
	}	
	
	public TipoAreaLabo gettipoarealaboBean() {
		return this.tipoarealaboBean;
	}

	public void settipoarealaboBean(TipoAreaLabo tipoarealaboBean) {
		this.tipoarealaboBean = tipoarealaboBean;
	}	
	
	public TipoAreaLaboParameterReturnGeneral gettipoarealaboReturnGeneral() {
		return this.tipoarealaboReturnGeneral;
	}

	public void settipoarealaboReturnGeneral(TipoAreaLaboParameterReturnGeneral tipoarealaboReturnGeneral) {
		this.tipoarealaboReturnGeneral = tipoarealaboReturnGeneral;
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
	
	
	public TipoAreaLaboLogic getTipoAreaLaboLogic()	{		
		return tipoarealaboLogic;
	}

	public void setTipoAreaLaboLogic(TipoAreaLaboLogic tipoarealaboLogic) {
		this.tipoarealaboLogic = tipoarealaboLogic;
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
	
	public Boolean getIsEsNuevoTipoAreaLabo() {
		return isEsNuevoTipoAreaLabo;
	}

	public void setIsEsNuevoTipoAreaLabo(Boolean isEsNuevoTipoAreaLabo) {
		this.isEsNuevoTipoAreaLabo = isEsNuevoTipoAreaLabo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAreaLabo() {
		return esParaAccionDesdeFormularioTipoAreaLabo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAreaLabo(Boolean esParaAccionDesdeFormularioTipoAreaLabo) {
		this.esParaAccionDesdeFormularioTipoAreaLabo = esParaAccionDesdeFormularioTipoAreaLabo;
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

			if(this.tipoarealaboSessionBean==null) {
				this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
			}

			if(!this.tipoarealaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoarealaboSessionBean.getlidEmpresaActual());
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

					if(this.tipoarealabo!=null) {
						this.tipoarealabo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
						this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoAreaLabo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
						if(this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoAreaLaboGenerico)throws Exception
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
				jComboBoxid_empresaTipoAreaLaboGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoAreaLaboGenerico!=null && jComboBoxid_empresaTipoAreaLaboGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoAreaLaboGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoAreaLabo tipoarealabo,JComboBox jComboBoxid_empresaTipoAreaLaboGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoAreaLaboGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoAreaLaboGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoarealabo.setid_empresa(empresaAux.getId());
				tipoarealabo.setempresa_descripcion(TipoAreaLaboConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoarealabo.setEmpresa(empresaAux);			}
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

					if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { 
							this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { 
					}

					if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
							this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
							this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoAreaLabo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAreaLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoAreaLabo(this.tipoarealaboLogic.getTipoAreaLabos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAreaLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoAreaLabo(this.tipoarealabos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoarealaboLogic.setTipoAreaLabos(this.tipoarealabos);
			tipoarealaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAreaLaboParameterReturnGeneral getTipoAreaLaboParameterGeneral() {
		return this.tipoarealaboParameterGeneral;
	}
	
	public void setTipoAreaLaboParameterGeneral(TipoAreaLaboParameterReturnGeneral tipoarealaboParameterGeneral) {
		this.tipoarealaboParameterGeneral = tipoarealaboParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAreaLabo() {
		return isPermisoTodoTipoAreaLabo;
	}

	public void setIsPermisoTodoTipoAreaLabo(Boolean isPermisoTodoTipoAreaLabo) {
		this.isPermisoTodoTipoAreaLabo = isPermisoTodoTipoAreaLabo;
	}

	public Boolean getIsPermisoNuevoTipoAreaLabo() {
		return isPermisoNuevoTipoAreaLabo;
	}

	public void setIsPermisoNuevoTipoAreaLabo(Boolean isPermisoNuevoTipoAreaLabo) {
		this.isPermisoNuevoTipoAreaLabo = isPermisoNuevoTipoAreaLabo;
	}

	public Boolean getIsPermisoActualizarTipoAreaLabo() {
		return isPermisoActualizarTipoAreaLabo;
	}

	public void setIsPermisoActualizarTipoAreaLabo(Boolean isPermisoActualizarTipoAreaLabo) {
		this.isPermisoActualizarTipoAreaLabo = isPermisoActualizarTipoAreaLabo;
	}

	public Boolean getIsPermisoEliminarTipoAreaLabo() {
		return isPermisoEliminarTipoAreaLabo;
	}

	public void setIsPermisoEliminarTipoAreaLabo(Boolean isPermisoEliminarTipoAreaLabo) {
		this.isPermisoEliminarTipoAreaLabo = isPermisoEliminarTipoAreaLabo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAreaLabo() {
		return isPermisoGuardarCambiosTipoAreaLabo;
	}

	public void setIsPermisoGuardarCambiosTipoAreaLabo(Boolean isPermisoGuardarCambiosTipoAreaLabo) {
		this.isPermisoGuardarCambiosTipoAreaLabo = isPermisoGuardarCambiosTipoAreaLabo;
	}
	
	public Boolean getIsPermisoConsultaTipoAreaLabo() {
		return isPermisoConsultaTipoAreaLabo;
	}

	public void setIsPermisoConsultaTipoAreaLabo(Boolean isPermisoConsultaTipoAreaLabo) {
		this.isPermisoConsultaTipoAreaLabo = isPermisoConsultaTipoAreaLabo;
	}

	public Boolean getIsPermisoBusquedaTipoAreaLabo() {
		return isPermisoBusquedaTipoAreaLabo;
	}

	public void setIsPermisoBusquedaTipoAreaLabo(Boolean isPermisoBusquedaTipoAreaLabo) {
		this.isPermisoBusquedaTipoAreaLabo = isPermisoBusquedaTipoAreaLabo;
	}

	public Boolean getIsPermisoReporteTipoAreaLabo() {
		return isPermisoReporteTipoAreaLabo;
	}

	public void setIsPermisoReporteTipoAreaLabo(Boolean isPermisoReporteTipoAreaLabo) {
		this.isPermisoReporteTipoAreaLabo = isPermisoReporteTipoAreaLabo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAreaLabo() {
		return isPermisoPaginacionMedioTipoAreaLabo;
	}

	public void setIsPermisoPaginacionMedioTipoAreaLabo(Boolean isPermisoPaginacionMedioTipoAreaLabo) {
		this.isPermisoPaginacionMedioTipoAreaLabo = isPermisoPaginacionMedioTipoAreaLabo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAreaLabo() {
		return isPermisoPaginacionTodoTipoAreaLabo;
	}

	public void setIsPermisoPaginacionTodoTipoAreaLabo(Boolean isPermisoPaginacionTodoTipoAreaLabo) {
		this.isPermisoPaginacionTodoTipoAreaLabo = isPermisoPaginacionTodoTipoAreaLabo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAreaLabo() {
		return isPermisoPaginacionAltoTipoAreaLabo;
	}

	public void setIsPermisoPaginacionAltoTipoAreaLabo(Boolean isPermisoPaginacionAltoTipoAreaLabo) {
		this.isPermisoPaginacionAltoTipoAreaLabo = isPermisoPaginacionAltoTipoAreaLabo;
	}
	
	public Boolean getIsPermisoCopiarTipoAreaLabo() {
		return isPermisoCopiarTipoAreaLabo;
	}

	public void setIsPermisoCopiarTipoAreaLabo(Boolean isPermisoCopiarTipoAreaLabo) {
		this.isPermisoCopiarTipoAreaLabo = isPermisoCopiarTipoAreaLabo;
	}
	
	public Boolean getIsPermisoVerFormTipoAreaLabo() {
		return isPermisoVerFormTipoAreaLabo;
	}

	public void setIsPermisoVerFormTipoAreaLabo(Boolean isPermisoVerFormTipoAreaLabo) {
		this.isPermisoVerFormTipoAreaLabo = isPermisoVerFormTipoAreaLabo;
	}
	
	public Boolean getIsPermisoDuplicarTipoAreaLabo() {
		return isPermisoDuplicarTipoAreaLabo;
	}

	public void setIsPermisoDuplicarTipoAreaLabo(Boolean isPermisoDuplicarTipoAreaLabo) {
		this.isPermisoDuplicarTipoAreaLabo = isPermisoDuplicarTipoAreaLabo;
	}
	
	public Boolean getIsPermisoOrdenTipoAreaLabo() {
		return isPermisoOrdenTipoAreaLabo;
	}

	public void setIsPermisoOrdenTipoAreaLabo(Boolean isPermisoOrdenTipoAreaLabo) {
		this.isPermisoOrdenTipoAreaLabo = isPermisoOrdenTipoAreaLabo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAreaLabo() {
		return isVisibilidadCeldaNuevoTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaNuevoTipoAreaLabo(Boolean isVisibilidadCeldaNuevoTipoAreaLabo) {
		this.isVisibilidadCeldaNuevoTipoAreaLabo = isVisibilidadCeldaNuevoTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAreaLabo() {
		return isVisibilidadCeldaDuplicarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAreaLabo(Boolean isVisibilidadCeldaDuplicarTipoAreaLabo) {
		this.isVisibilidadCeldaDuplicarTipoAreaLabo = isVisibilidadCeldaDuplicarTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAreaLabo() {
		return isVisibilidadCeldaCopiarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaCopiarTipoAreaLabo(Boolean isVisibilidadCeldaCopiarTipoAreaLabo) {
		this.isVisibilidadCeldaCopiarTipoAreaLabo = isVisibilidadCeldaCopiarTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAreaLabo() {
		return isVisibilidadCeldaVerFormTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaVerFormTipoAreaLabo(Boolean isVisibilidadCeldaVerFormTipoAreaLabo) {
		this.isVisibilidadCeldaVerFormTipoAreaLabo = isVisibilidadCeldaVerFormTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAreaLabo() {
		return isVisibilidadCeldaOrdenTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaOrdenTipoAreaLabo(Boolean isVisibilidadCeldaOrdenTipoAreaLabo) {
		this.isVisibilidadCeldaOrdenTipoAreaLabo = isVisibilidadCeldaOrdenTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAreaLabo() {
		return isVisibilidadCeldaNuevoRelacionesTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAreaLabo(Boolean isVisibilidadCeldaNuevoRelacionesTipoAreaLabo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo = isVisibilidadCeldaNuevoRelacionesTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAreaLabo() {
		return isVisibilidadCeldaModificarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaModificarTipoAreaLabo(Boolean isVisibilidadCeldaModificarTipoAreaLabo) {
		this.isVisibilidadCeldaModificarTipoAreaLabo = isVisibilidadCeldaModificarTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAreaLabo() {
		return isVisibilidadCeldaActualizarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaActualizarTipoAreaLabo(Boolean isVisibilidadCeldaActualizarTipoAreaLabo) {
		this.isVisibilidadCeldaActualizarTipoAreaLabo = isVisibilidadCeldaActualizarTipoAreaLabo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAreaLabo() {
		return isVisibilidadCeldaEliminarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaEliminarTipoAreaLabo(Boolean isVisibilidadCeldaEliminarTipoAreaLabo) {
		this.isVisibilidadCeldaEliminarTipoAreaLabo = isVisibilidadCeldaEliminarTipoAreaLabo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAreaLabo() {
		return isVisibilidadCeldaCancelarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaCancelarTipoAreaLabo(Boolean isVisibilidadCeldaCancelarTipoAreaLabo) {
		this.isVisibilidadCeldaCancelarTipoAreaLabo = isVisibilidadCeldaCancelarTipoAreaLabo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAreaLabo() {
		return isVisibilidadCeldaGuardarTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaGuardarTipoAreaLabo(Boolean isVisibilidadCeldaGuardarTipoAreaLabo) {
		this.isVisibilidadCeldaGuardarTipoAreaLabo = isVisibilidadCeldaGuardarTipoAreaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAreaLabo() {
		return isVisibilidadCeldaGuardarCambiosTipoAreaLabo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAreaLabo(Boolean isVisibilidadCeldaGuardarCambiosTipoAreaLabo) {
		this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo = isVisibilidadCeldaGuardarCambiosTipoAreaLabo;
	}
		
	public TipoAreaLaboSessionBean gettipoarealaboSessionBean() {
		return this.tipoarealaboSessionBean;
	}
	
	public void settipoarealaboSessionBean(TipoAreaLaboSessionBean tipoarealaboSessionBean) {
		this.tipoarealaboSessionBean=tipoarealaboSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(TipoAreaLabo tipoarealabo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoarealabo,null);
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
	
	public void bugActualizarReferenciaActual(TipoAreaLabo tipoarealabo,TipoAreaLabo tipoarealaboAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAreaLabo(tipoarealabo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoarealaboAux.setId(tipoarealabo.getId());
		tipoarealaboAux.setVersionRow(tipoarealabo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAreaLabo();
		
			int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoarealaboValidator.getInvalidValues(this.tipoarealabo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoarealaboLogic.setDatosCliente(datosCliente);
			tipoarealaboLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoarealaboAux=new  TipoAreaLabo();
				
				tipoarealaboAux.setIsNew(true);
				tipoarealaboAux.setIsChanged(true);
				
				tipoarealaboAux.setTipoAreaLaboOriginal(this.tipoarealabo);
				
				tipoarealaboAux.setId(this.tipoarealabo.getId());	
				tipoarealaboAux.setVersionRow(this.tipoarealabo.getVersionRow());	
				tipoarealaboAux.setid_empresa(this.tipoarealabo.getid_empresa());	
				tipoarealaboAux.setcodigo(this.tipoarealabo.getcodigo());	
				tipoarealaboAux.setnombre(this.tipoarealabo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarealaboAux,tipoarealabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboLogic.saveTipoAreaLabos();//WithConnection
						//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoAreaLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoarealaboLogic.saveTipoAreaLaboRelaciones(tipoarealaboAux,this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoarealaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoarealaboAux,tipoarealabos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoarealaboAux=new  TipoAreaLabo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoarealaboSessionBean.getEsGuardarRelacionado() && this.tipoarealabo.getId()>=0)) {
						
					tipoarealaboAux.setIsNew(false);
				}
				
				tipoarealaboAux.setIsDeleted(false);
			
				tipoarealaboAux.setId(this.tipoarealabo.getId());	
				tipoarealaboAux.setVersionRow(this.tipoarealabo.getVersionRow());	
				tipoarealaboAux.setid_empresa(this.tipoarealabo.getid_empresa());	
				tipoarealaboAux.setcodigo(this.tipoarealabo.getcodigo());	
				tipoarealaboAux.setnombre(this.tipoarealabo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarealaboAux,tipoarealabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboLogic.saveTipoAreaLabos();//WithConnection
						//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoAreaLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoarealaboLogic.saveTipoAreaLaboRelaciones(tipoarealaboAux,this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoarealaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoarealaboAux,tipoarealabos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoarealabo,tipoarealaboAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoarealaboAux=new  TipoAreaLabo();
				
				tipoarealaboAux.setIsNew(false);
				tipoarealaboAux.setIsChanged(false);
				
				tipoarealaboAux.setIsDeleted(true);
				
				tipoarealaboAux.setId(this.tipoarealabo.getId());	
				tipoarealaboAux.setVersionRow(this.tipoarealabo.getVersionRow());	
				tipoarealaboAux.setid_empresa(this.tipoarealabo.getid_empresa());	
				tipoarealaboAux.setcodigo(this.tipoarealabo.getcodigo());	
				tipoarealaboAux.setnombre(this.tipoarealabo.getnombre());	
				
				if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoarealaboAux.getId()>=0) {	
						this.tipoarealabosEliminados.add(tipoarealaboAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarealaboAux,tipoarealabos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboLogic.saveTipoAreaLabos();//WithConnection
						//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoarealaboLogic.saveTipoAreaLaboRelaciones(tipoarealaboAux,this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoarealaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoarealaboAux,tipoarealaboLogic.getTipoAreaLabos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoarealaboAux,tipoarealabos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getTipoAreaLabos().addAll(this.tipoarealabosEliminados);
					
					tipoarealaboLogic.saveTipoAreaLabos();//WithConnection
					//tipoarealaboLogic.getSetVersionRowTipoAreaLabos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoAreaLabo();
				
				this.tipoarealabosEliminados= new ArrayList<TipoAreaLabo>();		
			}
			
			if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Area Labo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoarealabo=tipoarealaboAux;
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
      		//this.finishProcessTipoAreaLabo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAreaLabo tipoarealaboLocal) throws Exception {
		
		if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoarealaboLocal.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
			
			} else {
			
				tipoarealaboLocal.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAreaLabo tipoarealaboLocal) throws Exception {	
		if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoarealaboLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoAreaLaboActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoarealaboValidator.getInvalidValues(this.tipoarealabo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAreaLabo tipoarealabo,List<TipoAreaLabo> tipoarealabos) throws Exception {
		try	{		
			TipoAreaLaboConstantesFunciones.actualizarLista(tipoarealabo,tipoarealabos,this.tipoarealaboSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAreaLabo tipoarealabo,List<TipoAreaLabo> tipoarealabos) throws Exception {
		try	{			
			TipoAreaLaboConstantesFunciones.actualizarSelectedLista(tipoarealabo,tipoarealabos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAreaLabo> tipoarealabosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoarealabosLocal=this.tipoarealaboLogic.getTipoAreaLabos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoarealabosLocal=this.tipoarealabos;
			}
			//ARCHITECTURE
		
			for(TipoAreaLabo tipoarealaboLocal:tipoarealabosLocal) {
				if(this.permiteMantenimiento(tipoarealaboLocal) && tipoarealaboLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAreaLaboConstantesFunciones.getTipoAreaLaboLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAreaLaboConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelid_empresaTipoAreaLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAreaLaboConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelcodigoTipoAreaLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAreaLaboConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelnombreTipoAreaLabo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelid_empresaTipoAreaLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelcodigoTipoAreaLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelnombreTipoAreaLabo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("InformacionLaboral")) {
			if(this.tipoarealabo==null) {
				this.tipoarealabo= new TipoAreaLabo();
			}

			if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoAreaLabo
				this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);

				this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.getinformacionlaboral().setTipoAreaLabo(this.tipoarealabo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoAreaLabo--;	
		
		
		this.tipoarealaboAux=new TipoAreaLabo();
		
		this.tipoarealaboAux.setId(this.iIdNuevoTipoAreaLabo);
		this.tipoarealaboAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoarealaboLogic.getTipoAreaLabos().add(this.tipoarealaboAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoarealabos.add(this.tipoarealaboAux);
		}
		//ARCHITECTURE
		
		this.tipoarealabo=this.tipoarealaboAux;
		
		if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAreaLabo(this.tipoarealabo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaLabo(this.tipoarealabo);
		}
				
		//this.setDefaultControlesTipoAreaLabo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAreaLabo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAreaLabo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaLabo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAreaLabo(this.tipoarealaboBean,this.tipoarealabo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAreaLaboConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
			classes=TipoAreaLaboConstantesFunciones.getClassesRelationshipsOfTipoAreaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoarealaboReturnGeneral=tipoarealaboLogic.procesarEventosTipoAreaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarealaboLogic.getTipoAreaLabos(),this.tipoarealabo,this.tipoarealaboParameterGeneral,this.isEsNuevoTipoAreaLabo,classes);//this.tipoarealaboLogic.getTipoAreaLabo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAreaLabo(this.tipoarealaboReturnGeneral,this.tipoarealaboBean,false);
		
		if(this.tipoarealaboReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo());
		}
		
		if(this.tipoarealaboReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo(),classes);//this.tipoarealaboBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAreaLabo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAreaLabo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.RecargarFormTipoAreaLabo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAreaLabo(false);
						
			if(tipoarealaboSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado() && InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionLaboralActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaLabo();
			}
			
			this.actualizarVisualTableDatosTipoAreaLabo();
			
			this.jTableDatosTipoAreaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoAreaLabo(), this.getIndiceNuevoTipoAreaLabo());
			
			this.seleccionarFilaTablaTipoAreaLaboActual();
						
			this.actualizarEstadoCeldasBotonesTipoAreaLabo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAreaLabo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setEnabled(isHabilitar && this.tipoarealaboConstantesFunciones.activarcodigoTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setEnabled(isHabilitar && this.tipoarealaboConstantesFunciones.activarnombreTipoAreaLabo);	
		//
		this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setEnabled(isHabilitar && this.tipoarealaboConstantesFunciones.activarid_empresaTipoAreaLabo);
	};
	
	public void setDefaultControlesTipoAreaLabo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAreaLabo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoarealaboSessionBean.setConGuardarRelaciones(true);			
			this.tipoarealaboSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoarealaboSessionBean.setConGuardarRelaciones(false);			
			this.tipoarealaboSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoAreaLabo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
				if(tipoarealaboAux.getId().equals(this.iIdNuevoTipoAreaLabo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealabos) {
				if(tipoarealaboAux.getId().equals(this.iIdNuevoTipoAreaLabo)) {
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
	
	public int getIndiceActualTipoAreaLabo(TipoAreaLabo tipoarealabo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
				if(tipoarealaboAux.getId().equals(tipoarealabo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealabos) {
				if(tipoarealaboAux.getId().equals(tipoarealabo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAreaLabo(TipoAreaLabo tipoarealaboOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
				if(tipoarealaboAux.getTipoAreaLaboOriginal().getId().equals(tipoarealaboOriginal.getId())) {
					existe=true;
					tipoarealaboOriginal.setId(tipoarealaboAux.getId());
					tipoarealaboOriginal.setVersionRow(tipoarealaboAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaLabo tipoarealaboAux:this.tipoarealabos) {
				if(tipoarealaboAux.getTipoAreaLaboOriginal().getId().equals(tipoarealaboOriginal.getId())) {
					existe=true;
					tipoarealaboOriginal.setId(tipoarealaboAux.getId());
					tipoarealaboOriginal.setVersionRow(tipoarealaboAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAreaLabo(Boolean esParaCancelar) throws Exception {
		tipoarealabosAux=new ArrayList<TipoAreaLabo>();
		tipoarealaboAux=new TipoAreaLabo();
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
					if(tipoarealaboAux.getId()<0) {
						tipoarealabosAux.add(tipoarealaboAux);
					}		
				}
				this.iIdNuevoTipoAreaLabo=0L;
				this.tipoarealaboLogic.getTipoAreaLabos().removeAll(tipoarealabosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaLabo tipoarealaboAux:this.tipoarealabos) {
					if(tipoarealaboAux.getId()<0) {
						tipoarealabosAux.add(tipoarealaboAux);
					}		
				}
				this.iIdNuevoTipoAreaLabo=0L;
				this.tipoarealabos.removeAll(tipoarealabosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAreaLabo 
					&& this.tipoarealaboLogic.getTipoAreaLabos().size()>0
					) {
					tipoarealaboAux=this.tipoarealaboLogic.getTipoAreaLabos().get(this.tipoarealaboLogic.getTipoAreaLabos().size() - 1);
				
					if(tipoarealaboAux.getId()<0) {
						this.tipoarealaboLogic.getTipoAreaLabos().remove(tipoarealaboAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAreaLabo && this.tipoarealabos.size()>0) {
					tipoarealaboAux=this.tipoarealabos.get(this.tipoarealabos.size() - 1);
				
					if(tipoarealaboAux.getId()<0) {
						this.tipoarealabos.remove(tipoarealaboAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAreaLabo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoarealabo.getId()<0) {
				this.tipoarealaboLogic.getTipoAreaLabos().remove(this.tipoarealabo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoarealabo.getId()<0) {
				this.tipoarealabos.remove(this.tipoarealabo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAreaLabo(List<TipoAreaLabo> tipoarealabosAux) throws Exception {
		TipoAreaLaboConstantesFunciones.setEstadosInicialesTipoAreaLabo(tipoarealabosAux);
	}
	
	public void setEstadosInicialesTipoAreaLabo(TipoAreaLabo tipoarealaboAux) throws Exception {
		TipoAreaLaboConstantesFunciones.setEstadosInicialesTipoAreaLabo(tipoarealaboAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAreaLaboActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAreaLaboActual()) {
				if(!this.isEsNuevoTipoAreaLabo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAreaLabo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAreaLaboActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Area Labo ?", "MANTENIMIENTO DE Tipo Area Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAreaLabo tipoarealabo) throws Exception {
		TipoAreaLaboConstantesFunciones.seleccionarAsignar(this.tipoarealabo,tipoarealabo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAreaLabo=this.isPermisoActualizarOriginalTipoAreaLabo;
			
			
			this.seleccionarAsignar(tipoarealabo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAreaLaboConstantesFunciones.quitarEspaciosTipoAreaLabo(this.tipoarealabo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAreaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoarealaboSessionBean.setsFuncionBusquedaRapida(this.tipoarealaboSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAreaLabo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAreaLabo(esParaCancelar);				
				this.cancelarNuevoTipoAreaLabo(esParaCancelar);								
			}
			
			this.tipoarealabo=new TipoAreaLabo();
			
			this.inicializarTipoAreaLabo();
			
			this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAreaLabo() throws Exception {
		try {
			TipoAreaLaboConstantesFunciones.inicializarTipoAreaLabo(this.tipoarealabo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoarealaboLogic.getTipoAreaLabos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAreaLabos(String sAccionBusqueda,List<TipoAreaLabo> tipoarealabosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAreaLabo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAreaLaboMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAreaLaboMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAreaLabo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Area Labos");		
		parameters.put("busquedapor", TipoAreaLaboConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(InformacionLaboral.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoAreaLaboLogic tipoarealaboLogicAuxiliar=new TipoAreaLaboLogic();
					tipoarealaboLogicAuxiliar.setDatosCliente(tipoarealaboLogic.getDatosCliente());				
					tipoarealaboLogicAuxiliar.setTipoAreaLabos(tipoarealabosParaReportes);
					
					tipoarealaboLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoAreaLaboWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoarealabosParaReportes=tipoarealaboLogicAuxiliar.getTipoAreaLabos();
					
					//tipoarealaboLogic.getNewConnexionToDeep();
					
					//for (TipoAreaLabo tipoarealabo:tipoarealabosParaReportes) {
					//	tipoarealaboLogic.deepLoad(tipoarealabo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoarealaboLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoarealaboLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileInformacionLaboral = AuxiliarReportes.class.getResourceAsStream("InformacionLaboralDetalleRelacionesDesign.jasper");
			parameters.put("subreport_informacionlaboral", reportFileInformacionLaboral);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAreaLabo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAreaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAreaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAreaLabo=new JRBeanArrayDataSource(TipoAreaLaboJInternalFrame.TraerTipoAreaLaboBeans(tipoarealabosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAreaLabo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAreaLaboConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAreaLaboConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAreaLaboBean.TraerTipoAreaLaboBeans(tipoarealabosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAreaLaboActionPerformed(null);
					//this.generarExcelReporteTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAreaLabos(sAccionBusqueda,sTipoArchivoReporte,tipoarealabosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAreaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaLabo> tipoarealabosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaLabos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAreaLabo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAreaLabo tipoarealabo : tipoarealabosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAreaLaboConstantesFunciones.generarExcelReporteDataTipoAreaLabo("NORMAL",row,workbook,tipoarealabo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAreaLabo(String sTipo,Row row,Workbook workbook) {
		
		TipoAreaLaboConstantesFunciones.generarExcelReporteHeaderTipoAreaLabo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAreaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaLabo> tipoarealabosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAreaLabo tipoarealabo : tipoarealabosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAreaLaboConstantesFunciones.getTipoAreaLaboDescripcion(tipoarealabo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoarealabo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaLaboConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoarealabo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoarealabo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAreaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAreaLabo> tipoarealabosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAreaLabo> tipoarealabosRespaldo=null;
		
		classes=TipoAreaLaboConstantesFunciones.getClassesRelationshipsOfTipoAreaLabo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoarealaboLogic.setDatosCliente(this.datosCliente);
		this.tipoarealaboLogic.setDatosDeep(this.datosDeep);
		this.tipoarealaboLogic.setIsConDeep(true);
		
		tipoarealabosRespaldo=this.tipoarealaboLogic.getTipoAreaLabos();
		
		this.tipoarealaboLogic.setTipoAreaLabos(tipoarealabosParaReportes);	
		this.tipoarealaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoarealabosParaReportes=this.tipoarealaboLogic.getTipoAreaLabos();
		this.tipoarealaboLogic.setTipoAreaLabos(tipoarealabosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAreaLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAreaLabo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAreaLabo tipoarealabo : tipoarealabosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAreaLabo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAreaLaboConstantesFunciones.generarExcelReporteDataTipoAreaLabo("NORMAL",row,workbook,tipoarealabo,cellStyleDataAux);
		
			
			


				//InformacionLaboral
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoarealabo.getInformacionLaborals()!=null && tipoarealabo.getInformacionLaborals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					InformacionLaboralConstantesFunciones.generarExcelReporteHeaderInformacionLaboral("RELACIONADO",row,workbook);
				}

				if(tipoarealabo.getInformacionLaborals()!=null) {
					i2=0;
					for(InformacionLaboral informacionlaboral : tipoarealabo.getInformacionLaborals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						InformacionLaboralConstantesFunciones.generarExcelReporteDataInformacionLaboral("RELACIONADO",row,workbook,informacionlaboral,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoAreaLaboConstantesFunciones.getTipoAreaLaboDescripcion(tipoarealabo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAreaLabo() throws Exception {		
		this.startProcessTipoAreaLabo(true);
	}
	
	public void startProcessTipoAreaLabo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAreaLabo ,this.jPanelParametrosReportesTipoAreaLabo, this.jScrollPanelDatosTipoAreaLabo,this.jPanelPaginacionTipoAreaLabo, this.jScrollPanelDatosEdicionTipoAreaLabo, this.jPanelAccionesTipoAreaLabo,this.jPanelAccionesFormularioTipoAreaLabo,this.jmenuBarTipoAreaLabo,this.jmenuBarDetalleTipoAreaLabo,this.jTtoolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAreaLabo=this.jTabbedPaneBusquedasTipoAreaLabo; 
		
		final JPanel jPanelParametrosReportesTipoAreaLabo=this.jPanelParametrosReportesTipoAreaLabo;
		//final JScrollPane jScrollPanelDatosTipoAreaLabo=this.jScrollPanelDatosTipoAreaLabo;
		final JTable jTableDatosTipoAreaLabo=this.jTableDatosTipoAreaLabo;		
		final JPanel jPanelPaginacionTipoAreaLabo=this.jPanelPaginacionTipoAreaLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoAreaLabo=this.jScrollPanelDatosEdicionTipoAreaLabo;
		final JPanel jPanelAccionesTipoAreaLabo=this.jPanelAccionesTipoAreaLabo;
		
		JPanel jPanelCamposAuxiliarTipoAreaLabo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAreaLabo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			jPanelCamposAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jPanelCamposTipoAreaLabo;
			jPanelAccionesFormularioAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jPanelAccionesFormularioTipoAreaLabo;
		}
		
		final JPanel jPanelCamposTipoAreaLabo=jPanelCamposAuxiliarTipoAreaLabo;
		final JPanel jPanelAccionesFormularioTipoAreaLabo=jPanelAccionesFormularioAuxiliarTipoAreaLabo;
		
		
		final JMenuBar jmenuBarTipoAreaLabo=this.jmenuBarTipoAreaLabo;
		final JToolBar jTtoolBarTipoAreaLabo=this.jTtoolBarTipoAreaLabo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAreaLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAreaLabo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			jmenuBarDetalleAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jmenuBarDetalleTipoAreaLabo;
			jTtoolBarDetalleAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jTtoolBarDetalleTipoAreaLabo;
		}
		
		final JMenuBar jmenuBarDetalleTipoAreaLabo=jmenuBarDetalleAuxiliarTipoAreaLabo;
		final JToolBar jTtoolBarDetalleTipoAreaLabo=jTtoolBarDetalleAuxiliarTipoAreaLabo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAreaLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAreaLabo;
			processRunnable.jTableDatos=jTableDatosTipoAreaLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoAreaLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAreaLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAreaLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAreaLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAreaLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAreaLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoAreaLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAreaLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAreaLabo ,jPanelParametrosReportesTipoAreaLabo,jTableDatosTipoAreaLabo, /*jScrollPanelDatosTipoAreaLabo,*/jPanelCamposTipoAreaLabo,jPanelPaginacionTipoAreaLabo, /*jScrollPanelDatosEdicionTipoAreaLabo,*/ jPanelAccionesTipoAreaLabo,jPanelAccionesFormularioTipoAreaLabo,jmenuBarTipoAreaLabo,jmenuBarDetalleTipoAreaLabo,jTtoolBarTipoAreaLabo,jTtoolBarDetalleTipoAreaLabo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAreaLabo ,jPanelParametrosReportesTipoAreaLabo, jScrollPanelDatosTipoAreaLabo,jPanelPaginacionTipoAreaLabo, jScrollPanelDatosEdicionTipoAreaLabo, jPanelAccionesTipoAreaLabo,jPanelAccionesFormularioTipoAreaLabo,jmenuBarTipoAreaLabo,jmenuBarDetalleTipoAreaLabo,jTtoolBarTipoAreaLabo,jTtoolBarDetalleTipoAreaLabo);
						
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
	
	public void finishProcessTipoAreaLabo() {// throws Exception 
		this.finishProcessTipoAreaLabo(true);
	}
	
	public void finishProcessTipoAreaLabo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAreaLabo ,this.jPanelParametrosReportesTipoAreaLabo, this.jScrollPanelDatosTipoAreaLabo,this.jPanelPaginacionTipoAreaLabo, this.jScrollPanelDatosEdicionTipoAreaLabo, this.jPanelAccionesTipoAreaLabo,this.jPanelAccionesFormularioTipoAreaLabo,this.jmenuBarTipoAreaLabo,this.jmenuBarDetalleTipoAreaLabo,this.jTtoolBarTipoAreaLabo,this.jTtoolBarDetalleTipoAreaLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAreaLabo=this.jTabbedPaneBusquedasTipoAreaLabo; 
		
		final JPanel jPanelParametrosReportesTipoAreaLabo=this.jPanelParametrosReportesTipoAreaLabo;
		//final JScrollPane jScrollPanelDatosTipoAreaLabo=this.jScrollPanelDatosTipoAreaLabo;
		final JTable jTableDatosTipoAreaLabo=this.jTableDatosTipoAreaLabo;		
		final JPanel jPanelPaginacionTipoAreaLabo=this.jPanelPaginacionTipoAreaLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoAreaLabo=this.jScrollPanelDatosEdicionTipoAreaLabo;
		final JPanel jPanelAccionesTipoAreaLabo=this.jPanelAccionesTipoAreaLabo;
		
		JPanel jPanelCamposAuxiliarTipoAreaLabo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAreaLabo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			jPanelCamposAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jPanelCamposTipoAreaLabo;
			jPanelAccionesFormularioAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jPanelAccionesFormularioTipoAreaLabo;
		}
		
		final JPanel jPanelCamposTipoAreaLabo=jPanelCamposAuxiliarTipoAreaLabo;
		final JPanel jPanelAccionesFormularioTipoAreaLabo=jPanelAccionesFormularioAuxiliarTipoAreaLabo;
		
		
		final JMenuBar jmenuBarTipoAreaLabo=this.jmenuBarTipoAreaLabo;		
		final JToolBar jTtoolBarTipoAreaLabo=this.jTtoolBarTipoAreaLabo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAreaLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAreaLabo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			jmenuBarDetalleAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jmenuBarDetalleTipoAreaLabo;
			jTtoolBarDetalleAuxiliarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jTtoolBarDetalleTipoAreaLabo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAreaLabo=jmenuBarDetalleAuxiliarTipoAreaLabo;
		final JToolBar jTtoolBarDetalleTipoAreaLabo=jTtoolBarDetalleAuxiliarTipoAreaLabo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAreaLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAreaLabo;
			processRunnable.jTableDatos=jTableDatosTipoAreaLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoAreaLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAreaLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAreaLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAreaLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAreaLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAreaLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoAreaLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAreaLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAreaLabo ,jPanelParametrosReportesTipoAreaLabo, jTableDatosTipoAreaLabo,/*jScrollPanelDatosTipoAreaLabo,*/jPanelCamposTipoAreaLabo,jPanelPaginacionTipoAreaLabo, /*jScrollPanelDatosEdicionTipoAreaLabo,*/ jPanelAccionesTipoAreaLabo,jPanelAccionesFormularioTipoAreaLabo,jmenuBarTipoAreaLabo,jmenuBarDetalleTipoAreaLabo,jTtoolBarTipoAreaLabo,jTtoolBarDetalleTipoAreaLabo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAreaLabo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAreaLabo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAreaLabo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAreaLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAreaLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAreaLabo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAreaLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAreaLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAreaLabo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoarealaboConstantesFunciones.getsFinalQueryTipoAreaLabo();
		String  finalQueryPaginacionTodos=this.tipoarealaboConstantesFunciones.getsFinalQueryTipoAreaLabo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAreaLaboConstantesFunciones.getArrayColumnasGlobalesNoTipoAreaLabo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAreaLaboConstantesFunciones.getArrayColumnasGlobalesTipoAreaLabo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAreaLaboConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoarealabosEliminados= new ArrayList<TipoAreaLabo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAreaLabo();
		
				///*TipoAreaLaboSessionBean*/this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
			
			if(this.tipoarealaboSessionBean==null) {
				this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
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
					this.iNumeroPaginacion=TipoAreaLaboConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAreaLaboConstantesFunciones.getClassesForeignKeysOfTipoAreaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoarealabo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoarealabosAux= new ArrayList<TipoAreaLabo>();
			
				
			tipoarealaboLogic.setDatosCliente(this.datosCliente);
			tipoarealaboLogic.setDatosDeep(this.datosDeep);
			tipoarealaboLogic.setIsConDeep(true);
			
			
			tipoarealaboLogic.getTipoAreaLaboDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoarealaboLogic.getTodosTipoAreaLabos(finalQueryGlobal,pagination);
					
					//tipoarealaboLogic.getTodosTipoAreaLabosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoarealaboLogic.getTipoAreaLabos()==null|| tipoarealaboLogic.getTipoAreaLabos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarealabosAux= new ArrayList<TipoAreaLabo>();
							tipoarealabosAux.addAll(tipoarealaboLogic.getTipoAreaLabos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarealabosAux= new ArrayList<TipoAreaLabo>();
							tipoarealabosAux.addAll(tipoarealabos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarealaboLogic.getTodosTipoAreaLabos(finalQueryGlobal+"",this.pagination);												
							
							//tipoarealaboLogic.getTodosTipoAreaLabosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAreaLabos("Todos",tipoarealaboLogic.getTipoAreaLabos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoarealaboLogic.setTipoAreaLabos(new ArrayList<TipoAreaLabo>());					
							tipoarealaboLogic.getTipoAreaLabos().addAll(tipoarealabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarealabos=new ArrayList<TipoAreaLabo>();
							tipoarealabos.addAll(tipoarealabosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAreaLabo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAreaLabo=this.idActual;
				
				} else if(this.idTipoAreaLaboActual!=null && this.idTipoAreaLaboActual!=0L) {
					idTipoAreaLabo=idTipoAreaLaboActual;
				}
				
					
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndicePorId(idTipoAreaLabo);
				
				this.tipoarealabos=new ArrayList<TipoAreaLabo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoarealaboLogic.getEntity(idTipoAreaLabo);
					
					//tipoarealaboLogic.getEntityWithConnection(idTipoAreaLabo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarealaboLogic.setTipoAreaLabos(new ArrayList<TipoAreaLabo>());
					tipoarealaboLogic.getTipoAreaLabos().add(tipoarealaboLogic.getTipoAreaLabo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoarealabos=new ArrayList<TipoAreaLabo>();
					this.tipoarealabos.add(tipoarealabo);
				}
				
				if(tipoarealaboLogic.getTipoAreaLabo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoarealaboLogic.getTipoAreaLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoarealaboLogic.getTipoAreaLabos()==null||tipoarealaboLogic.getTipoAreaLabos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoarealabos==null|| tipoarealabos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealabosAux=new ArrayList<TipoAreaLabo>();
						tipoarealabosAux.addAll(tipoarealaboLogic.getTipoAreaLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarealabosAux=new ArrayList<TipoAreaLabo>();
							tipoarealabosAux.addAll(tipoarealabos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoarealaboLogic.getTipoAreaLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAreaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAreaLabos("FK_IdEmpresa",tipoarealaboLogic.getTipoAreaLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAreaLabos("FK_IdEmpresa",tipoarealabos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboLogic.setTipoAreaLabos(new ArrayList<TipoAreaLabo>());
						tipoarealaboLogic.getTipoAreaLabos().addAll(tipoarealabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarealabos=new ArrayList<TipoAreaLabo>();
							tipoarealabos.addAll(tipoarealabosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAreaLabo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAreaLabo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoarealaboLogic.getTipoAreaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarealabos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoarealaboLogic.getTipoAreaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoarealabos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAreaLabo tipoarealabo) {
		Boolean permite=true;
		
		if(this.tipoarealabo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAreaLaboConstantesFunciones.getOrderByListaTipoAreaLabo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAreaLaboConstantesFunciones.getOrderByListaTipoAreaLabo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaLabo tipoarealabo:tipoarealaboLogic.getTipoAreaLabos()) {
				if(tipoarealabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarealaboTotales=tipoarealabo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaLabo tipoarealabo:this.tipoarealabos) {
				if(tipoarealabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarealaboTotales=tipoarealabo;
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
			this.tipoarealaboAux=new TipoAreaLabo();
			this.tipoarealaboAux.setsType(Constantes2.S_TOTALES);
			this.tipoarealaboAux.setIsNew(false);
			this.tipoarealaboAux.setIsChanged(false);
			this.tipoarealaboAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAreaLaboConstantesFunciones.TotalizarValoresFilaTipoAreaLabo(this.tipoarealaboLogic.getTipoAreaLabos(),this.tipoarealaboAux);
				
				this.tipoarealaboLogic.getTipoAreaLabos().add(this.tipoarealaboAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAreaLaboConstantesFunciones.TotalizarValoresFilaTipoAreaLabo(this.tipoarealabos,this.tipoarealaboAux);
				
				this.tipoarealabos.add(this.tipoarealaboAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoarealaboTotales=new TipoAreaLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoarealaboLogic.getTipoAreaLabos().remove(tipoarealaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoarealabos.remove(tipoarealaboTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoarealaboTotales=new TipoAreaLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAreaLabo tipoarealabo:tipoarealaboLogic.getTipoAreaLabos()) {
				if(tipoarealabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarealaboTotales=tipoarealabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAreaLaboConstantesFunciones.TotalizarValoresFilaTipoAreaLabo(this.tipoarealaboLogic.getTipoAreaLabos(),tipoarealaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAreaLabo tipoarealabo:this.tipoarealabos) {
				if(tipoarealabo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoarealaboTotales=tipoarealabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAreaLaboConstantesFunciones.TotalizarValoresFilaTipoAreaLabo(this.tipoarealabos,tipoarealaboTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAreaLabosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAreaLabosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarealaboLogic.getTipoAreaLabosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoAreaLabo() {
		this.isPermisoTodoTipoAreaLabo=false;
		this.isPermisoNuevoTipoAreaLabo=false;
		this.isPermisoActualizarTipoAreaLabo=false;
		this.isPermisoActualizarOriginalTipoAreaLabo=false;
		this.isPermisoEliminarTipoAreaLabo=false;
		this.isPermisoGuardarCambiosTipoAreaLabo=false;
		this.isPermisoConsultaTipoAreaLabo=false;
		this.isPermisoBusquedaTipoAreaLabo=false;
		this.isPermisoReporteTipoAreaLabo=false;		
		this.isPermisoOrdenTipoAreaLabo=false;		
		this.isPermisoPaginacionMedioTipoAreaLabo=false;		
		this.isPermisoPaginacionAltoTipoAreaLabo=false;
		this.isPermisoPaginacionTodoTipoAreaLabo=false;
		this.isPermisoCopiarTipoAreaLabo=false;		
		this.isPermisoVerFormTipoAreaLabo=false;		
		this.isPermisoDuplicarTipoAreaLabo=false;		
		this.isPermisoOrdenTipoAreaLabo=false;		
	}
	
	public void setPermisosUsuarioTipoAreaLabo(Boolean isPermiso) {
		this.isPermisoTodoTipoAreaLabo=isPermiso;
		this.isPermisoNuevoTipoAreaLabo=isPermiso;
		this.isPermisoActualizarTipoAreaLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoAreaLabo=isPermiso;
		this.isPermisoEliminarTipoAreaLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoAreaLabo=isPermiso;
		this.isPermisoConsultaTipoAreaLabo=isPermiso;
		this.isPermisoBusquedaTipoAreaLabo=isPermiso;
		this.isPermisoReporteTipoAreaLabo=isPermiso;
		this.isPermisoOrdenTipoAreaLabo=isPermiso;		
		this.isPermisoPaginacionMedioTipoAreaLabo=isPermiso;		
		this.isPermisoPaginacionAltoTipoAreaLabo=isPermiso;		
		this.isPermisoPaginacionTodoTipoAreaLabo=isPermiso;		
		this.isPermisoCopiarTipoAreaLabo=isPermiso;		
		this.isPermisoVerFormTipoAreaLabo=isPermiso;		
		this.isPermisoDuplicarTipoAreaLabo=isPermiso;
		this.isPermisoOrdenTipoAreaLabo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAreaLabo(Boolean isPermiso) {
		//this.isPermisoTodoTipoAreaLabo=isPermiso;
		this.isPermisoNuevoTipoAreaLabo=isPermiso;
		this.isPermisoActualizarTipoAreaLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoAreaLabo=isPermiso;
		this.isPermisoEliminarTipoAreaLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoAreaLabo=isPermiso;
		//this.isPermisoConsultaTipoAreaLabo=isPermiso;
		//this.isPermisoBusquedaTipoAreaLabo=isPermiso;
		//this.isPermisoReporteTipoAreaLabo=isPermiso;
		//this.isPermisoOrdenTipoAreaLabo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAreaLabo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAreaLabo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAreaLabo=isPermiso;		
		//this.isPermisoCopiarTipoAreaLabo=isPermiso;		
		//this.isPermisoDuplicarTipoAreaLabo=isPermiso;
		//this.isPermisoOrdenTipoAreaLabo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAreaLaboClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
		if(TipoAreaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosInformacionLaboral=false;
		this.isTienePermisosInformacionLaboral=this.verificarGetPermisosUsuarioOpcionTipoAreaLaboClaseRelacionada(this.opcionsRelacionadas,InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAreaLabo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAreaLaboClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosInformacionLaboral=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAreaLaboClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAreaLaboClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAreaLaboClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosInformacionLaboral && this.jInternalFrameDetalleFormTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.remove(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoAreaLabo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAreaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAreaLaboConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAreaLabo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAreaLabo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAreaLabo=this.isPermisoActualizarTipoAreaLabo;
			this.isPermisoEliminarTipoAreaLabo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAreaLabo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAreaLabo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAreaLabo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAreaLabo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAreaLabo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAreaLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAreaLabo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAreaLabo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAreaLabo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAreaLabo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAreaLabo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAreaLabo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAreaLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAreaLabo.setToolTipText(this.jTableDatosTipoAreaLabo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAreaLabo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAreaLabo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAreaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAreaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAreaLabo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosInformacionLaboral && this.tipoarealaboConstantesFunciones.mostrarInformacionLaboralTipoAreaLabo && !TipoAreaLaboConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Informacion Laboral");
			reporte.setsDescripcion("Informacion Laboral");
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
	public void inicializarCombosForeignKeyTipoAreaLaboListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAreaLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAreaLaboJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAreaLaboListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoAreaLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoAreaLaboParameterReturnGeneral tipoarealaboReturnGeneral=new TipoAreaLaboParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoarealaboConstantesFunciones.cargarid_empresaTipoAreaLabo)
					 || (this.esRecargarFks && this.tipoarealaboConstantesFunciones.cargarid_empresaTipoAreaLabo)) {

					if(!this.tipoarealaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoarealaboSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoarealaboReturnGeneral=tipoarealaboLogic.cargarCombosLoteForeignKeyTipoAreaLabo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoarealaboReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAreaLabo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoarealaboSessionBean==null) {
				this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
			}

			if(!this.tipoarealaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoAreaLabo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAreaLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAreaLabo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaLabo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAreaLabo(TipoAreaLabo tipoarealabo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAreaLabo(TipoAreaLabo tipoarealabo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAreaLabo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAreaLabo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAreaLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAreaLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAreaLabo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAreaLabo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAreaLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAreaLabo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoAreaLaboBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAreaLaboBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAreaLaboBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean(); 
		this.tipoarealaboConstantesFunciones=new TipoAreaLaboConstantesFunciones(); 
		this.tipoarealaboBean=new TipoAreaLabo();//(this.tipoarealaboConstantesFunciones); 		
		this.tipoarealaboReturnGeneral=new TipoAreaLaboParameterReturnGeneral(); 
		
		this.tipoarealaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoarealaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAreaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAreaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAreaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAreaLabo(true);
			
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
			
			this.tipoarealaboConstantesFunciones=new TipoAreaLaboConstantesFunciones(); 
			this.tipoarealaboBean=new TipoAreaLabo();//this.tipoarealaboConstantesFunciones); 			
			this.tipoarealaboReturnGeneral=new TipoAreaLaboParameterReturnGeneral(); 
		
			TipoAreaLaboBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Area Labo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoarealabo=new TipoAreaLabo();
			this.tipoarealabos = new ArrayList<TipoAreaLabo>();
			this.tipoarealabosAux = new ArrayList<TipoAreaLabo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic=new TipoAreaLaboLogic();
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoarealaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoarealaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAreaLabo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAreaLabo);	
					}
					
					if(this.jInternalFrameImportacionTipoAreaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAreaLabo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAreaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAreaLabo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAreaLabo);
				this.jInternalFrameDetalleFormTipoAreaLabo.setVisible(false);
				this.jInternalFrameDetalleFormTipoAreaLabo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAreaLabo);
					this.jInternalFrameReporteDinamicoTipoAreaLabo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAreaLabo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAreaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAreaLabo);
					this.jInternalFrameImportacionTipoAreaLabo.setVisible(false);
					this.jInternalFrameImportacionTipoAreaLabo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAreaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAreaLabo);
					this.jInternalFrameOrderByTipoAreaLabo.setVisible(false);
					this.jInternalFrameOrderByTipoAreaLabo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAreaLaboActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAreaLaboConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoarealaboReturnGeneral=new TipoAreaLaboParameterReturnGeneral();
			
			this.tipoarealaboParameterGeneral=new TipoAreaLaboParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoarealaboLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAreaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAreaLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoarealaboSessionBean.getEsGuardarRelacionado(),this.tipoarealaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAreaLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoarealaboSessionBean.getEsGuardarRelacionado(),this.tipoarealaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaDuplicarTipoAreaLabo=true;
			this.isVisibilidadCeldaCopiarTipoAreaLabo=true;
			this.isVisibilidadCeldaVerFormTipoAreaLabo=true;
			this.isVisibilidadCeldaOrdenTipoAreaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAreaLabo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAreaLabo(false);
			
			this.setPermisosUsuarioTipoAreaLabo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoarealaboSessionBean.getEsGuardarRelacionado() && this.tipoarealaboSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAreaLaboClasesRelacionadas();
			}
			
			if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAreaLaboClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAreaLabo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAreaLabo();
			}
			
			if(!this.isPermisoBusquedaTipoAreaLabo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAreaLabo,this.isPermisoPaginacionMedioTipoAreaLabo,this.isPermisoPaginacionTodoTipoAreaLabo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAreaLaboConstantesFunciones.getTiposSeleccionarTipoAreaLabo());
				
				this.tiposColumnasSelect=TipoAreaLaboConstantesFunciones.getTiposSeleccionarTipoAreaLabo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoAreaLabo();				
				//this.tiposRelacionesSelect=TipoAreaLaboConstantesFunciones.getTiposRelacionesTipoAreaLabo(true);
				
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
			//if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAreaLabo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoAreaLabo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoAreaLabo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaLabo() ;
			
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
			
			
			this.informacionlaboralLogic=new InformacionLaboralLogic(); 
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
				tipoarealaboImplementable= (TipoAreaLaboImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAreaLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoarealaboImplementableHome= (TipoAreaLaboImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAreaLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoarealabos= new ArrayList<TipoAreaLabo>();
			this.tipoarealabosEliminados= new ArrayList<TipoAreaLabo>();
						
			this.isEsNuevoTipoAreaLabo=false;
			this.esParaAccionDesdeFormularioTipoAreaLabo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAreaLabo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAreaLabo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoAreaLaboBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAreaLaboConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAreaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAreaLabo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAreaLabo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAreaLabo();
			}
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAreaLabo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAreaLabo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAreaLabo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAreaLabo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAreaLabo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAreaLabo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoAreaLabo")) {
				iIndex=this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();	
				
				

				if(sTitle.equals("Informacion Laborales")) {
					if(!InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoAreaLabo();

						this.cargarParteTabPanelRelacionadaInformacionLaboral(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoAreaLabo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaInformacionLaboral(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoAreaLabo.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(false,true,iIndex);
		this.jButtonInformacionLaboralActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaInformacionLaboral();

		//this.jTabbedPaneRelacionesTipoAreaLabo.updateUI();
		//this.jTabbedPaneRelacionesTipoAreaLabo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoAreaLabo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("InformacionLaboral")) {
				int row=this.jTableDatosTipoAreaLabo.getSelectedRow();
				jButtonInformacionLaboralActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Informacion Laboral")) {

					if(this.isTienePermisosInformacionLaboral && this.tipoarealaboConstantesFunciones.mostrarInformacionLaboralTipoAreaLabo && !TipoAreaLaboConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Informacion Laborales"+"("+InformacionLaboralConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Informacion Laborales");

						if(tipoarealaboConstantesFunciones.resaltarInformacionLaboralTipoAreaLabo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoarealaboConstantesFunciones.resaltarInformacionLaboralTipoAreaLabo);
						}

						jmenuItem.setEnabled(this.tipoarealaboConstantesFunciones.activarInformacionLaboralTipoAreaLabo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"InformacionLaboral"));

						

						this.jInternalFrameDetalleFormTipoAreaLabo.jmenuDetalleTipoAreaLabo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoAreaLabo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAreaLabo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAreaLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAreaLaboListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAreaLabo();
		
		this.cargarCombosFrameForeignKeyTipoAreaLabo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAreaLabo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAreaLabo();
		}
	}
	
	
	
	public void jButtonNuevoTipoAreaLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			
			if(jTableDatosTipoAreaLabo.getRowCount()>=1) {
				jTableDatosTipoAreaLabo.removeRowSelectionInterval(0, jTableDatosTipoAreaLabo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAreaLabo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAreaLabo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAreaLabo(true);			
			//this.tipoarealabo=new TipoAreaLabo();
			//this.tipoarealabo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaLabo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaLabo() ;
			
			if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaLabo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoarealabo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);				
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAreaLabo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAreaLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAreaLabo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAreaLabo.getSelectedRows().length;			
			}
			
			tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAreaLabo--;			
				//TipoAreaLabo tipoarealaboAux= new TipoAreaLabo();			
				//tipoarealaboAux.setId(this.iIdNuevoTipoAreaLabo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAreaLabo tipoarealaboOrigen=new TipoAreaLabo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAreaLabo tipoarealaboOrigen : tipoarealabosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoarealaboOrigen =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoarealaboOrigen =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAreaLabo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoarealabo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAreaLabo(tipoarealaboOrigen,this.tipoarealabo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoarealaboLogic.getTipoAreaLabos().add(this.tipoarealaboAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoarealabos.add(this.tipoarealaboAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
				
				this.jTableDatosTipoAreaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoAreaLabo(), this.getIndiceNuevoTipoAreaLabo());
				
				int iLastRow =  this.jTableDatosTipoAreaLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAreaLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAreaLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaLabo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();									
		
			TipoAreaLabo tipoarealaboOrigen=new TipoAreaLabo();
			TipoAreaLabo tipoarealaboDestino=new TipoAreaLabo();
				
			tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAreaLabo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoarealabosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAreaLabo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboOrigen =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoarealaboOrigen =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoarealaboDestino =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoarealaboDestino =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoarealaboOrigen =tipoarealabosSeleccionados.get(0);
				tipoarealaboDestino =tipoarealabosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAreaLabo(tipoarealaboOrigen,tipoarealaboDestino,true,false);
				
				tipoarealaboDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoarealaboDestino,tipoarealaboLogic.getTipoAreaLabos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoarealaboDestino,tipoarealabos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
				
				//this.jTableDatosTipoAreaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoAreaLabo(), this.getIndiceNuevoTipoAreaLabo());
				
				int iLastRow =  this.jTableDatosTipoAreaLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAreaLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAreaLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaLabo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAreaLabo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAreaLabo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAreaLabo.setVisible(!isVisible);
			this.jPanelPaginacionTipoAreaLabo.setVisible(!isVisible);
			this.jPanelAccionesTipoAreaLabo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAreaLabo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAreaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAreaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAreaLabo();
			
			this.abrirFrameOrderByTipoAreaLabo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAreaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAreaLabo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAreaLabo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAreaLabo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAreaLabo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAreaLabo.setSize(this.jInternalFrameDetalleFormTipoAreaLabo.iWidthFormulario,this.jInternalFrameDetalleFormTipoAreaLabo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAreaLabo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAreaLabo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAreaLabo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAreaLabo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAreaLabo.jContentPaneDetalleTipoAreaLabo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaLabo.jContentPaneDetalleTipoAreaLabo.getWidth(),TipoAreaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaLabo.jContentPaneDetalleTipoAreaLabo.getWidth(),TipoAreaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAreaLabo.jContentPaneDetalleTipoAreaLabo.getWidth(),TipoAreaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaInformacionLaboral();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAreaLabo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAreaLabo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAreaLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAreaLabo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAreaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaLabo,false,this);
				} else {
					this.jInternalFrameOrderByTipoAreaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAreaLabo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAreaLabo);
				this.jInternalFrameOrderByTipoAreaLabo.setVisible(false);
				this.jInternalFrameOrderByTipoAreaLabo.setSelected(false);
				
				this.jInternalFrameOrderByTipoAreaLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAreaLabo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAreaLabo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAreaLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAreaLabo==null) {
				
				this.jInternalFrameImportacionTipoAreaLabo=new ImportacionJInternalFrame(TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAreaLabo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAreaLabo);
				this.jInternalFrameImportacionTipoAreaLabo.setVisible(false);
				this.jInternalFrameImportacionTipoAreaLabo.setSelected(false);


				this.jInternalFrameImportacionTipoAreaLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAreaLabo"));
				this.jInternalFrameImportacionTipoAreaLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAreaLabo"));
				this.jInternalFrameImportacionTipoAreaLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAreaLabo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAreaLabo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAreaLabo==null) {
				this.jInternalFrameReporteDinamicoTipoAreaLabo=new ReporteDinamicoJInternalFrame(TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAreaLabo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAreaLabo);
				this.jInternalFrameReporteDinamicoTipoAreaLabo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAreaLabo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaLabo"));
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaLabo"));
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaLabo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaLabo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaInformacionLaboral() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoAreaLabo.jContentPaneDetalleTipoAreaLabo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoAreaLabo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAreaLabo);
			
	       	this.jInternalFrameDetalleFormTipoAreaLabo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAreaLabo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAreaLabo.dispose();
			//this.jInternalFrameDetalleFormTipoAreaLabo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAreaLabo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAreaLabo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAreaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAreaLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAreaLabo.setVisible(true);
	        this.jInternalFrameImportacionTipoAreaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAreaLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAreaLabo.setVisible(true);
	        this.jInternalFrameOrderByTipoAreaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAreaLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAreaLabo.setVisible(false);
	        this.jInternalFrameOrderByTipoAreaLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAreaLabo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAreaLabo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAreaLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAreaLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAreaLabo.setVisible(false);
	        this.jInternalFrameImportacionTipoAreaLabo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAreaLabo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAreaLabo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAreaLabo(true);
			//this.isEsNuevoTipoAreaLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAreaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaLabo(false) ;
			
			if(tipoarealaboSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado() && InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionLaboralActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaLabo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAreaLaboActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAreaLabo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAreaLabo(true);
			//this.isEsNuevoTipoAreaLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoarealabo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAreaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAreaLabo(false) ;
			
			if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAreaLabo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAreaLabo(false);
			
			//if(!this.isEsNuevoTipoAreaLabo) {								
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoarealabo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAreaLabo=true;
					this.inicializarActualizarBindingTablaTipoAreaLabo(false);
					this.isEsNuevoTipoAreaLabo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAreaLabo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAreaLabo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAreaLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaLabo(false);
				
				this.habilitarDeshabilitarControlesTipoAreaLabo(false);
			
												
				
				if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAreaLabo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAreaLaboActionPerformed(evt,tipoarealaboSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAreaLabo(this.tipoarealabo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAreaLabo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoarealaboSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoarealabo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				this.tipoarealabo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				this.tipoarealabo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoarealabo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAreaLaboModel) this.jTableDatosTipoAreaLabo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAreaLabo=true;
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
				this.isEsNuevoTipoAreaLabo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAreaLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaLabo(false);
				
				this.habilitarDeshabilitarControlesTipoAreaLabo(false);
				
				
				
				if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAreaLabo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAreaLabo.getRowCount()>=1) {
				jTableDatosTipoAreaLabo.removeRowSelectionInterval(0, jTableDatosTipoAreaLabo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAreaLabo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAreaLabo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAreaLabo(false) ;
			
			this.isEsNuevoTipoAreaLabo=false;
			
			if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAreaLabo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAreaLabo(false);
				
				//SI ES MANUAL
				if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAreaLabo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAreaLabo--;			
			//TipoAreaLabo tipoarealaboAux= new TipoAreaLabo();			
			//tipoarealaboAux.setId(this.iIdNuevoTipoAreaLabo);
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAreaLabo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
			
			this.tipoarealabo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoarealaboLogic.getTipoAreaLabos().add(this.tipoarealaboAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoarealabos.add(this.tipoarealaboAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			
			this.jTableDatosTipoAreaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoAreaLabo(), this.getIndiceNuevoTipoAreaLabo());
			
			int iLastRow =  this.jTableDatosTipoAreaLabo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAreaLabo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAreaLabo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaLabo(false);
			
			//SI ES MANUAL
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaLabo();
			}
			
			//this.abrirFrameTreeTipoAreaLabo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Area LaboS ?", "MANTENIMIENTO DE Tipo Area Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAreaLabo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAreaLabo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoarealaboReturnGeneral=tipoarealaboLogic.procesarImportacionTipoAreaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoarealaboParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAreaLaboReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAreaLabo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAreaLabo.setFileImportacion(this.jInternalFrameImportacionTipoAreaLabo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAreaLabo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAreaLabo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAreaLabo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAreaLabo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		

		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAreaLaboBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAreaLaboBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAreaLaboConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAreaLaboConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoAreaLabo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAreaLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoAreaLabo tipoarealabo:tipoarealabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoarealabo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoAreaLabo tipoarealabo:tipoarealabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoarealabo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAreaLaboConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAreaLabo tipoarealabo:tipoarealabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoarealabo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoAreaLabo(row);				
			//	iRow++;
			//}				
			
			//for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAreaLabo(tipoarealaboAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaLabo(false);
			
			//SI ES MANUAL
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAreaLabo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaLabo(false);
			
			//SI ES MANUAL
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAreaLabo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAreaLabo(false);
			
			//SI ES MANUAL
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAreaLabo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAreaLabo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAreaLabo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAreaLabo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAreaLabo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAreaLabo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAreaLabo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAreaLabo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAreaLabo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAreaLabo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAreaLabo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAreaLabo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAreaLabo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAreaLabo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAreaLabo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaLabo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAreaLabo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAreaLabo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAreaLabo();
		
		this.inicializarActualizarBindingBotonesManualTipoAreaLabo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAreaLabo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaLabo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaLabo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaLabo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAreaLabo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAreaLabo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAreaLabo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionNuevoTipoAreaLabo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionSinCerrarTipoAreaLabo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionSinMensajeTipoAreaLabo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAreaLabo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAreaLabo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAreaLabo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
				this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionNuevoTipoAreaLabo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionSinCerrarTipoAreaLabo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAreaLabo.jCheckBoxPostAccionSinMensajeTipoAreaLabo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAreaLabo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAreaLabo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAreaLabo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAreaLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAreaLabo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAreaLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAreaLabo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAreaLabo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAreaLabo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAreaLabo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAreaLabo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAreaLabo() throws Exception {
		try	{
			if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAreaLabo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAreaLabo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAreaLabo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAreaLabo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAreaLabo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAreaLabo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAreaLabo.addItem(reporte);
			}
			
			
			if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAreaLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAreaLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAreaLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAreaLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAreaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAreaLabo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAreaLabo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaLabo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAreaLabo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAreaLabo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAreaLabo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAreaLabo(Boolean esInicializar) throws Exception {				
		if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAreaLabo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAreaLabo() throws Exception {
		this.inicializarActualizarBindingTablaTipoAreaLabo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAreaLabo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAreaLaboOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLaboOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAreaLabo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoarealaboLogic.getTipoAreaLabos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoarealabos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAreaLabo.setModel(new TipoAreaLaboModel(this.tipoarealaboLogic.getTipoAreaLabos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAreaLabo.setModel(new TipoAreaLaboModel(this.tipoarealabos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAreaLabo!=null && this.jInternalFrameOrderByTipoAreaLabo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAreaLabo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,tipoarealaboConstantesFunciones.resaltarSeleccionarTipoAreaLabo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAreaLaboConstantesFunciones.SCLASSWEBTITULO,tipoarealaboConstantesFunciones.resaltarSeleccionarTipoAreaLabo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,TipoAreaLaboConstantesFunciones.LABEL_ID));

		if(this.tipoarealaboConstantesFunciones.mostraridTipoAreaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaLaboConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoarealaboConstantesFunciones.resaltaridTipoAreaLabo,this.tipoarealaboConstantesFunciones.activaridTipoAreaLabo,this,true,"idTipoAreaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarealaboConstantesFunciones.resaltaridTipoAreaLabo,this.tipoarealaboConstantesFunciones.activaridTipoAreaLabo,this,true,"idTipoAreaLabo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoarealaboConstantesFunciones.mostrarid_empresaTipoAreaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoarealaboConstantesFunciones.resaltarid_empresaTipoAreaLabo,this,this.tipoarealaboConstantesFunciones.activarid_empresaTipoAreaLabo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoarealaboConstantesFunciones.resaltarid_empresaTipoAreaLabo,this,this.tipoarealaboConstantesFunciones.activarid_empresaTipoAreaLabo,false,"id_empresaTipoAreaLabo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,TipoAreaLaboConstantesFunciones.LABEL_CODIGO));

		if(this.tipoarealaboConstantesFunciones.mostrarcodigoTipoAreaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaLaboConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoarealaboConstantesFunciones.resaltarcodigoTipoAreaLabo,this.tipoarealaboConstantesFunciones.activarcodigoTipoAreaLabo,this,true,"codigoTipoAreaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarealaboConstantesFunciones.resaltarcodigoTipoAreaLabo,this.tipoarealaboConstantesFunciones.activarcodigoTipoAreaLabo,this,true,"codigoTipoAreaLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,TipoAreaLaboConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoarealaboConstantesFunciones.mostrarnombreTipoAreaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAreaLaboConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoarealaboConstantesFunciones.resaltarnombreTipoAreaLabo,this.tipoarealaboConstantesFunciones.activarnombreTipoAreaLabo,this,true,"nombreTipoAreaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoarealaboConstantesFunciones.resaltarnombreTipoAreaLabo,this.tipoarealaboConstantesFunciones.activarnombreTipoAreaLabo,this,true,"nombreTipoAreaLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAreaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosInformacionLaboral && this.tipoarealaboConstantesFunciones.mostrarInformacionLaboralTipoAreaLabo && !TipoAreaLaboConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Informacion Laborales");
				tableColumn.setHeaderValue("Informacion Laborales");
				tableColumn.setCellRenderer(new InformacionLaboralTableCell(tipoarealaboConstantesFunciones.resaltarInformacionLaboralTipoAreaLabo,this,this.tipoarealaboConstantesFunciones.activarInformacionLaboralTipoAreaLabo));
				tableColumn.setCellEditor(new InformacionLaboralTableCell(tipoarealaboConstantesFunciones.resaltarInformacionLaboralTipoAreaLabo,this,this.tipoarealaboConstantesFunciones.activarInformacionLaboralTipoAreaLabo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoAreaLabo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAreaLabo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAreaLabo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoarealaboSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAreaLabo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoAreaLabo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAreaLabo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoarealaboSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAreaLabo.moveColumn(this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAreaLabo.moveColumn(this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoarealaboSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoAreaLabo.moveColumn(this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAreaLabo.moveColumn(this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAreaLabo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAreaLabo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAreaLabo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAreaLabo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAreaLabo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAreaLabo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAreaLabo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoarealaboLogic.getTipoAreaLabos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoarealabos.size()-1;
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
		//this.jTableDatosTipoAreaLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAreaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAreaLabo();
			
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
				
				//this.isEsNuevoTipoAreaLabo=false;
					
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
				if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAreaLabo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAreaLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAreaLabo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoarealabo.getsType().equals("DUPLICADO")
				   || this.tipoarealabo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAreaLabo=true;
				
				} else {
					this.isEsNuevoTipoAreaLabo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoarealabo.getId()>=0 && !this.tipoarealabo.getIsNew()) {						
						this.isEsNuevoTipoAreaLabo=false;
						
					} else {
						this.isEsNuevoTipoAreaLabo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAreaLabo(esRelaciones);						
				
				this.seleccionarTipoAreaLabo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoarealabo.getId()<0) {
					this.isEsNuevoTipoAreaLabo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAreaLabo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAreaLabo(evt,rowIndex);
				}	
				
				if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAreaLabo: " + this.dDif); 
					}
				}								
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAreaLabo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoarealabo)) {
					if(this.tipoarealabo.getId()>0) {
						this.tipoarealabo.setIsDeleted(true);
						
						this.tipoarealabosEliminados.add(this.tipoarealabo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoarealaboLogic.getTipoAreaLabos().remove(this.tipoarealabo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoarealabos.remove(this.tipoarealabo);				
					}
					
					
					((TipoAreaLaboModel) this.jTableDatosTipoAreaLabo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAreaLabo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAreaLabo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAreaLabo) {
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAreaLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAreaLabo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAreaLabo(this.tipoarealabo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoarealaboConstantesFunciones.cargarid_empresaTipoAreaLabo || this.tipoarealaboConstantesFunciones.event_dependid_empresaTipoAreaLabo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoarealabo.getid_empresa());
									//this.inicializarActualizarBindingTipoAreaLabo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoarealabo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoarealabo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoarealabo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAreaLabo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAreaLabo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAreaLabo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAreaLabo(TipoAreaLabo tipoarealabo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAreaLabo(tipoarealabo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAreaLabo(TipoAreaLabo tipoarealabo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAreaLabo(tipoarealabo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAreaLabo(tipoarealabo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaLabo(tipoarealabo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAreaLabo(TipoAreaLabo tipoarealabo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setText(tipoarealabo.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setText(tipoarealabo.getcodigo());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setText(tipoarealabo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAreaLabo tipoarealaboLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoarealaboLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAreaLabo tipoarealaboLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoarealaboLocal=this.tipoarealabo;
			} else {
				tipoarealaboLocal=this.tipoarealaboAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoarealaboLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAreaLabo(tipoarealaboLocal,true);
					
					if(tipoarealaboSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoarealaboLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoarealaboLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAreaLabo(TipoAreaLabo tipoarealabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAreaLabo(tipoarealabo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(tipoarealabo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAreaLabo(TipoAreaLabo tipoarealabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAreaLabo(tipoarealabo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAreaLabo(TipoAreaLabo tipoarealabo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.getText()==null || this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.getText()=="" || this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setText("0");
			}

			if(conColumnasBase) {tipoarealabo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaLaboConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelIdTipoAreaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoarealabo.setcodigo(this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaLaboConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelcodigoTipoAreaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoarealabo.setnombre(this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAreaLaboConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAreaLabo.jLabelnombreTipoAreaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAreaLabo(TipoAreaLabo tipoarealaboBean,TipoAreaLabo tipoarealabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAreaLabo(TipoAreaLabo tipoarealaboOrigen,TipoAreaLabo tipoarealabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoarealaboOrigen.getId()!=null && !tipoarealaboOrigen.getId().equals(0L))) {tipoarealabo.setId(tipoarealaboOrigen.getId());}}
			if(conDefault || (!conDefault && tipoarealaboOrigen.getcodigo()!=null && !tipoarealaboOrigen.getcodigo().equals(""))) {tipoarealabo.setcodigo(tipoarealaboOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoarealaboOrigen.getnombre()!=null && !tipoarealaboOrigen.getnombre().equals(""))) {tipoarealabo.setnombre(tipoarealaboOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAreaLabo(TipoAreaLabo tipoarealabo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setText(tipoarealabo.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setText(tipoarealabo.getcodigo());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setText(tipoarealabo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAreaLabo(TipoAreaLaboBean tipoarealaboBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setText(tipoarealaboBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setText(tipoarealaboBean.getcodigo());
			this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setText(tipoarealaboBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAreaLabo(TipoAreaLaboParameterReturnGeneral tipoarealaboReturnGeneral,TipoAreaLaboBean tipoarealaboBean,Boolean conDefault) throws Exception { 
		try {
			TipoAreaLabo tipoarealaboLocal=new TipoAreaLabo();
			
			tipoarealaboLocal=tipoarealaboReturnGeneral.getTipoAreaLabo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoarealaboLocal.getId()!=null && !tipoarealaboLocal.getId().equals(0L))) {tipoarealaboBean.setId(tipoarealaboLocal.getId());}}
			if(conDefault || (!conDefault && tipoarealaboLocal.getcodigo()!=null && !tipoarealaboLocal.getcodigo().equals(""))) {tipoarealaboBean.setcodigo(tipoarealaboLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoarealaboLocal.getnombre()!=null && !tipoarealaboLocal.getnombre().equals(""))) {tipoarealaboBean.setnombre(tipoarealaboLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAreaLaboGenerico(Long idTipoAreaLaboSeleccionado,JComboBox jComboBoxTipoAreaLabo,List<TipoAreaLabo> tipoarealabosLocal)throws Exception {
		try {
			TipoAreaLabo  tipoarealaboTemp=null;

			for(TipoAreaLabo tipoarealaboAux:tipoarealabosLocal) {
				if(tipoarealaboAux.getId()!=null && tipoarealaboAux.getId().equals(idTipoAreaLaboSeleccionado)) {
					tipoarealaboTemp=tipoarealaboAux;
					break;
				}
			}

			jComboBoxTipoAreaLabo.setSelectedItem(tipoarealaboTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAreaLaboGenerico(JComboBox jComboBoxTipoAreaLabo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAreaLabo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAreaLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAreaLabo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAreaLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAreaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAreaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("InformacionLaboral")) {
			jButtonInformacionLaboralActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarealabo=(TipoAreaLabo) tipoarealaboLogic.getTipoAreaLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoarealabo =(TipoAreaLabo) tipoarealabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoarealabo.getIsNew() && !tipoarealabo.getIsChanged() && !tipoarealabo.getIsDeleted()) {
				sDescripcion=tipoarealabo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoarealabo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAreaLabo tipoarealaboRow=new TipoAreaLabo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarealaboRow=(TipoAreaLabo) tipoarealaboLogic.getTipoAreaLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoarealaboRow=(TipoAreaLabo) tipoarealabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonInformacionLaboralActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoAreaLabo tipoarealabo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoAreaLabo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealabo = (TipoAreaLabo)this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoarealabo = (TipoAreaLabo)this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoarealabo!=null) {
						this.tipoarealabo = tipoarealabo;
					} else {
						this.tipoarealabo = new TipoAreaLabo();
					}
				}

				if(this.isTienePermisosInformacionLaboral && this.permiteMantenimiento(this.tipoarealabo)) {
					InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup=new InformacionLaboralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						informacionlaboralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup;
					} else {
						informacionlaboralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame;
					}

					List<TipoAreaLabo> tipoarealabos=new ArrayList<TipoAreaLabo>();
					tipoarealabos.add(this.tipoarealabo);
					if(!esRelacionado) {
						//informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setConGuardarRelaciones(false);
						//informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					informacionlaboralBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoAreaLabo.cargarInformacionLaboralBeanSwingJInternalFrame(tipoarealabos,this.tipoarealabo,informacionlaboralBeanSwingJInternalFrame,/*conInicializar,*/informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getConGuardarRelaciones(),informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado());
					informacionlaboralBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("no_relacionado");

						informacionlaboralBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(InformacionLaboralConstantesFunciones.ITAMANIOFILATABLA + (InformacionLaboralConstantesFunciones.ITAMANIOFILATABLA/2));

						informacionlaboralBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoAreaLabo=(TitledBorder)this.jScrollPanelDatosTipoAreaLabo.getBorder();
						TitledBorder titledBorderInformacionLaboral=(TitledBorder)informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.getBorder();

						titledBorderInformacionLaboral.setTitle(titledBorderTipoAreaLabo.getTitle() + " -> Informacion Laboral");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,informacionlaboralBeanSwingJInternalFrame);
						}

						informacionlaboralBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(informacionlaboralBeanSwingJInternalFrame);

						informacionlaboralBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Informacion Laboral",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAreaLabo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));			
			this.jButtonDuplicarTipoAreaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaLabo && this.isPermisoDuplicarTipoAreaLabo));			
			this.jButtonCopiarTipoAreaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoAreaLabo && this.isPermisoCopiarTipoAreaLabo));
			this.jButtonVerFormTipoAreaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoAreaLabo && this.isPermisoVerFormTipoAreaLabo));
			
			this.jButtonAbrirOrderByTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));			
			
			this.jButtonNuevoRelacionesTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));			
			this.jButtonNuevoGuardarCambiosTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarTipoAreaLabo.setVisible((this.isVisibilidadCeldaModificarTipoAreaLabo && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoAreaLabo && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoAreaLabo && this.isPermisoEliminarTipoAreaLabo));
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoAreaLabo);							
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));						
			this.jButtonDuplicarToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaLabo && this.isPermisoDuplicarTipoAreaLabo));						
			this.jButtonCopiarToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoAreaLabo && this.isPermisoCopiarTipoAreaLabo));			
			this.jButtonVerFormToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoAreaLabo && this.isPermisoVerFormTipoAreaLabo));			
			this.jButtonAbrirOrderByToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));
			this.jButtonNuevoRelacionesToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));			
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaModificarTipoAreaLabo && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoAreaLabo  && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoAreaLabo && this.isPermisoEliminarTipoAreaLabo));
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarToolBarTipoAreaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoAreaLabo);				
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));			
			this.jMenuItemDuplicarTipoAreaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoAreaLabo && this.isPermisoDuplicarTipoAreaLabo));			
			this.jMenuItemCopiarTipoAreaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoAreaLabo && this.isPermisoCopiarTipoAreaLabo));			
			this.jMenuItemVerFormTipoAreaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoAreaLabo && this.isPermisoVerFormTipoAreaLabo));			
			this.jMenuItemAbrirOrderByTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));			
			//this.jMenuItemMostrarOcultarTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));
			this.jMenuItemDetalleAbrirOrderByTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));			
			//this.jMenuItemDetalleMostrarOcultarTipoAreaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoAreaLabo && this.isPermisoOrdenTipoAreaLabo));			
			this.jMenuItemNuevoRelacionesTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo));			
			this.jMenuItemNuevoGuardarCambiosTipoAreaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoAreaLabo && this.isPermisoNuevoTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));									
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemModificarTipoAreaLabo.setVisible((this.isVisibilidadCeldaModificarTipoAreaLabo && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemActualizarTipoAreaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoAreaLabo && this.isPermisoActualizarTipoAreaLabo));	
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemEliminarTipoAreaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoAreaLabo && this.isPermisoEliminarTipoAreaLabo));
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemCancelarTipoAreaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoAreaLabo);				
			}
			
			this.jMenuItemGuardarCambiosTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));						
			this.jMenuItemGuardarCambiosTablaTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=this.jButtonNuevoTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAreaLabo=this.jButtonDuplicarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaCopiarTipoAreaLabo=this.jButtonCopiarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaVerFormTipoAreaLabo=this.jButtonVerFormTipoAreaLabo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAreaLabo=this.jButtonAbrirOrderByTipoAreaLabo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=this.jButtonNuevoRelacionesTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaModificarTipoAreaLabo=this.jButtonModificarTipoAreaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.isVisibilidadCeldaActualizarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaGuardarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=this.jButtonGuardarCambiosTablaTipoAreaLabo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAreaLabo=this.jButtonNuevoToolBarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=this.jButtonNuevoRelacionesToolBarTipoAreaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.isVisibilidadCeldaModificarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarToolBarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarToolBarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarToolBarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarToolBarTipoAreaLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAreaLabo=this.jButtonGuardarCambiosToolBarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAreaLabo=this.jMenuItemNuevoTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=this.jMenuItemNuevoRelacionesTipoAreaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.isVisibilidadCeldaModificarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemModificarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemActualizarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemEliminarTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoAreaLabo=this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemCancelarTipoAreaLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAreaLabo=this.jMenuItemGuardarCambiosTipoAreaLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=this.jMenuItemGuardarCambiosTablaTipoAreaLabo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAreaLabo(Boolean esInicializar) {
		if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAreaLabo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAreaLabo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAreaLabo() {
		this.jButtonNuevoTipoAreaLabo.setVisible(this.isPermisoNuevoTipoAreaLabo);			
		this.jButtonDuplicarTipoAreaLabo.setVisible(this.isPermisoDuplicarTipoAreaLabo);			
		this.jButtonCopiarTipoAreaLabo.setVisible(this.isPermisoCopiarTipoAreaLabo);			
		this.jButtonVerFormTipoAreaLabo.setVisible(this.isPermisoVerFormTipoAreaLabo);			
		
		this.jButtonAbrirOrderByTipoAreaLabo.setVisible(this.isPermisoOrdenTipoAreaLabo);					
		
		this.jButtonNuevoRelacionesTipoAreaLabo.setVisible(this.isPermisoNuevoTipoAreaLabo);			
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarTipoAreaLabo.setVisible(this.isPermisoActualizarTipoAreaLabo);	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.setVisible(this.isPermisoActualizarTipoAreaLabo);	
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.setVisible(this.isPermisoEliminarTipoAreaLabo);
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoAreaLabo);						
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.setVisible(this.isPermisoGuardarCambiosTipoAreaLabo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.setVisible(this.isPermisoActualizarTipoAreaLabo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAreaLabo() {
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarTipoAreaLabo.setVisible(this.isPermisoActualizarTipoAreaLabo);	
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.setVisible(this.isPermisoActualizarTipoAreaLabo);	
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.setVisible(this.isPermisoEliminarTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoAreaLabo);							
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoAreaLabo && this.isPermisoGuardarCambiosTipoAreaLabo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAreaLabo() {
		if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAreaLabo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAreaLabo() {
	}
	
	public void jTableDatosTipoAreaLaboListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAreaLabo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAreaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.gettipoarealabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarealabo==null) {
						this.tipoarealabo = new TipoAreaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				}

				if(this.tipoarealabo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoarealabo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoAreaLaboUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoAreaLabo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAreaLabo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAreaLabo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.gettipoarealabo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoarealaboLogic.getConnexion());

				if(this.tipoarealabo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoarealabo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAreaLabo=(TitledBorder)this.jScrollPanelDatosTipoAreaLabo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoAreaLabo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoAreaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.gettipoarealabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarealabo==null) {
						this.tipoarealabo = new TipoAreaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				}

				if(this.tipoarealabo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoarealabo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoAreaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.gettipoarealabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarealabo==null) {
						this.tipoarealabo = new TipoAreaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				}

				if(this.tipoarealabo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoarealabo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAreaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.gettipoarealabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoarealabo==null) {
						this.tipoarealabo = new TipoAreaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);
				}

				if(this.tipoarealabo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoarealabo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAreaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoAreaLaboActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAreaLabo(false,false);

			this.getTipoAreaLabosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoAreaLabo(false);

			//if(TipoAreaLaboBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAreaLabo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoarealaboLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAreaLabo() {
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
			this.jInternalFrameDetalleFormTipoAreaLabo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAreaLabo.dispose();
			this.jInternalFrameDetalleFormTipoAreaLabo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
			this.jInternalFrameReporteDinamicoTipoAreaLabo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAreaLabo.dispose();
			this.jInternalFrameReporteDinamicoTipoAreaLabo=null;
		}
		
		if(this.jInternalFrameImportacionTipoAreaLabo!=null) {
			this.jInternalFrameImportacionTipoAreaLabo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAreaLabo.dispose();
			this.jInternalFrameImportacionTipoAreaLabo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAreaLabo();
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAreaLabo")) {
				jButtonDuplicarTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAreaLabo")) {
				jButtonCopiarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAreaLabo")) {
				jButtonVerFormTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAreaLabo")) {
				jButtonDuplicarTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAreaLabo")) {
				jButtonDuplicarTipoAreaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAreaLabo")) {
				jButtonModificarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAreaLabo")) {
				jButtonModificarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAreaLabo")) {
				jButtonModificarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAreaLabo")) {
				jButtonActualizarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAreaLabo")) {
				jButtonActualizarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAreaLabo")) {
				jButtonActualizarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAreaLabo")) {
				jButtonEliminarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAreaLabo")) {
				jButtonEliminarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAreaLabo")) {
				jButtonEliminarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAreaLabo")) {
				jButtonCancelarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAreaLabo")) {
				jButtonCancelarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAreaLabo")) {
				jButtonCancelarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAreaLabo")) {
				jButtonCerrarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAreaLabo")) {
				jButtonCerrarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAreaLabo")) {
				jButtonCerrarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAreaLabo")) {
				jButtonMostrarOcultarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAreaLabo")) {
				jButtonCancelarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAreaLabo")) {
				jButtonCopiarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAreaLabo")) {
				jButtonVerFormTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAreaLabo")) {
				jButtonCopiarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAreaLabo")) {
				jButtonVerFormTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAreaLabo")) {
				jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAreaLabo")) {
				jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAreaLabo")) {
				jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAreaLabo")) {
				jButtonAnterioresTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAreaLabo")) {
				jButtonAnterioresTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAreaLabo")) {
				jButtonAnterioresTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAreaLabo")) {
				jButtonSiguientesTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAreaLabo")) {
				jButtonSiguientesTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAreaLabo")) {
				jButtonSiguientesTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAreaLabo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAreaLabo")) {
				jButtonAbrirOrderByTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAreaLabo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAreaLabo")) {
				jButtonMostrarOcultarTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAreaLabo")) {
				jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAreaLabo")) {
				jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAreaLabo")) {
				jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAreaLabo")) {
				jButtonCerrarReporteDinamicoTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAreaLabo")) {
				jButtonGenerarReporteDinamicoTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAreaLabo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAreaLabo")) {
				jButtonCerrarImportacionTipoAreaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAreaLabo")) {
				
				jButtonGenerarImportacionTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAreaLabo")) {
				
				jButtonAbrirImportacionTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAreaLabo")) {
				jComboBoxTiposAccionesTipoAreaLaboActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAreaLabo")) {
				jComboBoxTiposRelacionesTipoAreaLaboActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAreaLabo")) {
				jComboBoxTiposAccionesTipoAreaLaboActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAreaLabo")) {
				
				jComboBoxTiposSeleccionarTipoAreaLaboActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAreaLabo")) {
				jTextFieldValorCampoGeneralTipoAreaLaboActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAreaLabo")) {
				jButtonAbrirOrderByTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAreaLabo")) {
				jButtonAbrirOrderByTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAreaLabo")) {
				jButtonCerrarOrderByTipoAreaLaboActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAreaLaboBusqueda")) {
				this.jButtonidTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAreaLaboUpdate")) {
				this.jButtonid_empresaTipoAreaLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAreaLaboBusqueda")) {
				this.jButtonid_empresaTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAreaLaboBusqueda")) {
				this.jButtoncodigoTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAreaLaboBusqueda")) {
				this.jButtonnombreTipoAreaLaboBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAreaLabo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAreaLabo tipoarealaboLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoarealaboLocal=this.tipoarealabo;
			} else {
				tipoarealaboLocal=this.tipoarealaboAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
							
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
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
			
			


			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
								
						
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
								
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
							
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
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
			
			


			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
								
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAreaLabo")) {
					jCheckBoxSeleccionarTodosTipoAreaLaboItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAreaLabo")) {
					jCheckBoxSeleccionadosTipoAreaLaboItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAreaLabo")) {
					
				}
				
				


				
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
												
				
				


				
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
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
			
			


			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAreaLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoarealabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoarealabo);
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
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
				
				


				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAreaLabo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAreaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAreaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoarealaboAnterior =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAreaLabo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAreaLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAreaLabo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoarealabo =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoarealabo =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoarealabo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAreaLabo")) {
				
				}
				
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAreaLabo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAreaLabo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAreaLabo")) {
			
			}
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAreaLabo();
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAreaLabo")) {
				jButtonDuplicarTipoAreaLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAreaLabo")) {
				jButtonCopiarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAreaLabo")) {
				jButtonVerFormTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAreaLabo")) {
				jButtonNuevoTipoAreaLaboActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAreaLabo")) {
				jButtonModificarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAreaLabo")) {
				jButtonActualizarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAreaLabo")) {
				jButtonEliminarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAreaLabo")) {
				jButtonCancelarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAreaLabo")) {
				jButtonCerrarTipoAreaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAreaLabo")) {
				jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAreaLabo")) {
				jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAreaLabo")) {
				jButtonAbrirOrderByTipoAreaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAreaLabo")) {
				jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAreaLabo")) {
				jButtonAnterioresTipoAreaLaboActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAreaLabo")) {
				jButtonSiguientesTipoAreaLaboActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAreaLaboBusqueda")) {
				this.jButtonidTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAreaLaboUpdate")) {
				this.jButtonid_empresaTipoAreaLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAreaLaboBusqueda")) {
				this.jButtonid_empresaTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAreaLaboBusqueda")) {
				this.jButtoncodigoTipoAreaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAreaLaboBusqueda")) {
				this.jButtonnombreTipoAreaLaboBusquedaActionPerformed(evt);
			}
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAreaLabo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAreaLabo")) {
				closingInternalFrameTipoAreaLabo();
				
			} else if(sTipo.equals("jButtonCancelarTipoAreaLabo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAreaLabo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAreaLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoAreaLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAreaLabo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAreaLaboActionPerformed(null);
			}
			
			TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoarealabo,new Object(),this.tipoarealaboParameterGeneral,this.tipoarealaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAreaLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAreaLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAreaLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoarealabo)) {
			if(!esControlTabla) {
				if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);			
				}
				
				if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAreaLabo(this.tipoarealabo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoarealaboReturnGeneral=tipoarealaboLogic.procesarEventosTipoAreaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarealaboLogic.getTipoAreaLabos(),this.tipoarealabo,this.tipoarealaboParameterGeneral,this.isEsNuevoTipoAreaLabo,classes);//this.tipoarealaboLogic.getTipoAreaLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAreaLabo(this.tipoarealaboReturnGeneral,this.tipoarealaboBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAreaLabo(classes,this.tipoarealaboReturnGeneral,this.tipoarealaboBean,false);
					}
						
					if(this.tipoarealaboReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo());	
					}
						
					if(this.tipoarealaboReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo(),classes);//this.tipoarealaboBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAreaLabo(this.tipoarealabo,classes);//this.tipoarealaboBean);									
				}
			
				if(TipoAreaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAreaLabo(this.tipoarealabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAreaLabo(this.tipoarealabo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoarealaboAnterior!=null) {
						this.tipoarealabo=this.tipoarealaboAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoarealaboReturnGeneral=tipoarealaboLogic.procesarEventosTipoAreaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarealaboLogic.getTipoAreaLabos(),this.tipoarealabo,this.tipoarealaboParameterGeneral,this.isEsNuevoTipoAreaLabo,classes);//this.tipoarealaboLogic.getTipoAreaLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoarealaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoarealaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoarealaboReturnGeneral.getTipoAreaLabo(),tipoarealaboLogic.getTipoAreaLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoarealaboReturnGeneral.getTipoAreaLabo(),this.tipoarealabos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAreaLabo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAreaLabo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAreaLabo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAreaLabo() throws Exception {
		
		TipoAreaLaboModel tipoarealaboModel=(TipoAreaLaboModel)this.jTableDatosTipoAreaLabo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoarealaboModel.tipoarealabos=this.tipoarealaboLogic.getTipoAreaLabos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoarealaboModel.tipoarealabos=this.tipoarealabos;
		}
		
		
		((TipoAreaLaboModel) this.jTableDatosTipoAreaLabo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAreaLabo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoarealaboAnterior(),this.tipoarealaboLogic.getTipoAreaLabos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoarealaboAnterior(),this.tipoarealabos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAreaLabo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAreaLabo(TipoAreaLabo tipoarealabo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(tipoarealabo.getInformacionLaborals());
					this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
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
										
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarealabo,new Object(),generalEntityParameterGeneral,this.tipoarealaboReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoarealaboSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAreaLaboConstantesFunciones.getClassesRelationshipsOfTipoAreaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAreaLaboConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAreaLabo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAreaLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAreaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoarealabo,new Object(),generalEntityParameterGeneral,this.tipoarealaboReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAreaLabo(TipoAreaLaboBean tipoarealaboBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(tipoarealabo.getInformacionLaborals());
					this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAreaLabo(ArrayList<Classe> classes,TipoAreaLaboReturnGeneral tipoarealaboReturnGeneral,TipoAreaLaboBean tipoarealaboBean,Boolean conDefault) throws Exception {
		
			this.tipoarealaboBean.setInformacionLaborals(tipoarealaboReturnGeneral.getTipoAreaLabo().getInformacionLaborals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAreaLabo(TipoAreaLabo tipoarealabo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					tipoarealabo.setInformacionLaborals(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoarealabo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAreaLabo = new TipoAreaLaboDetalleFormJInternalFrame(jDesktopPane,this.tipoarealaboSessionBean.getConGuardarRelaciones(),this.tipoarealaboSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.setVisible(false);
		this.jInternalFrameDetalleFormTipoAreaLabo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAreaLabo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAreaLabo.tipoarealaboLogic=this.tipoarealaboLogic;
		
		this.cargarCombosFrameForeignKeyTipoAreaLabo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAreaLabo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAreaLabo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAreaLabo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAreaLabo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAreaLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAreaLabo"));
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoAreaLabo"));

		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAreaLabo"));
					
		this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemModificarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAreaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoAreaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAreaLabo"));
						
		this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemActualizarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAreaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoAreaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAreaLabo"));
								
		this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemEliminarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAreaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoAreaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAreaLabo"));
					
		this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemCancelarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAreaLabo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemDetalleCerrarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAreaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAreaLabo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonidTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtoncodigoTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonnombreTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaLaboBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAreaLabo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAreaLabo"));
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAreaLabo"));
		}
		
		this.jTableDatosTipoAreaLabo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAreaLabo"));
		
		this.jTableDatosTipoAreaLabo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAreaLabo"));
		
		this.jButtonNuevoTipoAreaLabo.addActionListener(new ButtonActionListener(this,"NuevoTipoAreaLabo"));
		
		this.jButtonDuplicarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"DuplicarTipoAreaLabo"));
		
		this.jButtonCopiarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"CopiarTipoAreaLabo"));
		
		this.jButtonVerFormTipoAreaLabo.addActionListener(new ButtonActionListener(this,"VerFormTipoAreaLabo"));
		
		
		this.jButtonNuevoToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAreaLabo"));
			
		this.jButtonDuplicarToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAreaLabo"));
			
		this.jMenuItemNuevoTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAreaLabo"));
			
		this.jMenuItemDuplicarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAreaLabo"));		
		
		
		this.jButtonNuevoRelacionesTipoAreaLabo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAreaLabo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAreaLabo"));
			
		this.jMenuItemNuevoRelacionesTipoAreaLabo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAreaLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoAreaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonModificarToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAreaLabo"));
			
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemModificarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAreaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoAreaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonActualizarToolBarTipoAreaLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAreaLabo"));
				
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemActualizarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAreaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoAreaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonEliminarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAreaLabo"));
						
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemEliminarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAreaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoAreaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonCancelarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAreaLabo"));
			
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemCancelarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAreaLabo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAreaLabo"));		
		
		
		this.jButtonCerrarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CerrarTipoAreaLabo"));
		
		
		this.jButtonCerrarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAreaLabo"));
			
		this.jMenuItemCerrarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAreaLabo"));
			
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jMenuItemDetalleCerrarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAreaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAreaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAreaLabo"));
		}
		
		this.jButtonCopiarToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAreaLabo"));
			
		this.jButtonVerFormToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAreaLabo"));
		
		this.jMenuItemGuardarCambiosTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAreaLabo"));
			
		this.jMenuItemCopiarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAreaLabo"));		
		
		this.jMenuItemVerFormTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAreaLabo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAreaLabo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAreaLabo"));
			
		this.jMenuItemGuardarCambiosTablaTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAreaLabo"));		
		
		
		
		this.jButtonRecargarInformacionTipoAreaLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAreaLabo"));
					
		this.jButtonRecargarInformacionToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAreaLabo"));
		
		this.jMenuItemRecargarInformacionTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAreaLabo"));		
		
		
		
		this.jButtonAnterioresTipoAreaLabo.addActionListener (new ButtonActionListener(this,"AnterioresTipoAreaLabo"));
		
		
		this.jButtonAnterioresToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAreaLabo"));
		
		this.jMenuItemAnterioresTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAreaLabo"));		
		
		
		this.jButtonSiguientesTipoAreaLabo.addActionListener (new ButtonActionListener(this,"SiguientesTipoAreaLabo"));
		
		
		this.jButtonSiguientesToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAreaLabo"));
			
		this.jMenuItemSiguientesTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAreaLabo"));
			
		this.jMenuItemAbrirOrderByTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAreaLabo"));
			
		this.jMenuItemMostrarOcultarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAreaLabo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAreaLabo"));
			
		this.jMenuItemDetalleMostarOcultarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAreaLabo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAreaLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAreaLabo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAreaLabo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAreaLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAreaLabo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAreaLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAreaLabo"));

		this.jCheckBoxSeleccionadosTipoAreaLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAreaLabo"));
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAreaLabo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAreaLabo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAreaLabo"));
			
		this.jComboBoxTiposAccionesTipoAreaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAreaLabo"));
					
		this.jComboBoxTiposSeleccionarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAreaLabo"));
			
		this.jTextFieldValorCampoGeneralTipoAreaLabo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAreaLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonidTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtoncodigoTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonnombreTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaLaboBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAreaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaLabo"));
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaLabo"));
				this.jInternalFrameReporteDinamicoTipoAreaLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaLabo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAreaLabo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAreaLabo"));				
			//this.jButtonGenerarReporteDinamicoTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAreaLabo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAreaLabo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAreaLabo!=null) {
				this.jInternalFrameImportacionTipoAreaLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAreaLabo"));
				this.jInternalFrameImportacionTipoAreaLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAreaLabo"));
				this.jInternalFrameImportacionTipoAreaLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAreaLabo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAreaLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAreaLabo"));
			
			this.jButtonAbrirOrderByToolBarTipoAreaLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAreaLabo"));			
			
			if(this.jInternalFrameOrderByTipoAreaLabo!=null) {
				this.jInternalFrameOrderByTipoAreaLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAreaLabo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAreaLabo.jTabbedPaneRelacionesTipoAreaLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAreaLabo"));
		
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
            		closingInternalFrameTipoAreaLabo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAreaLabo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAreaLabo = (JInternalFrameBase)event.getSource();
	            	
	            TipoAreaLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoAreaLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAreaLabo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAreaLaboActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAreaLabo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAreaLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAreaLabo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAreaLabo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAreaLabo";
		inputMap = this.jButtonNuevoTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAreaLaboActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAreaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAreaLabo";
		inputMap = this.jButtonNuevoRelacionesTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAreaLaboActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAreaLabo";
		inputMap = this.jButtonModificarTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAreaLabo";
		inputMap = this.jButtonActualizarTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAreaLabo";
		inputMap = this.jButtonEliminarTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAreaLabo";
		inputMap = this.jButtonCancelarTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAreaLabo";
		inputMap = this.jButtonCerrarTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAreaLabo";
		inputMap = this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonGuardarCambiosTipoAreaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAreaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAreaLabo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAreaLaboItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAreaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAreaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAreaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAreaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAreaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAreaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonidTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAreaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonid_empresaTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtoncodigoTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAreaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAreaLabo.jButtonnombreTipoAreaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAreaLaboBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAreaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAreaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAreaLaboActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAreaLabo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAreaLabo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
					tipoarealaboAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaLabo tipoarealaboAux:tipoarealabos) {
					tipoarealaboAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAreaLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
						tipoarealaboAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaLabo tipoarealaboAux:tipoarealabos) {
						tipoarealaboAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaLabo tipoarealaboAux:tipoarealabos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAreaLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAreaLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAreaLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAreaLabo.getSelectedRows();
			
			TipoAreaLabo tipoarealaboLocal=new TipoAreaLabo();
			
			//this.seleccionarTodosTipoAreaLabo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoarealaboLocal =(TipoAreaLabo) this.tipoarealaboLogic.getTipoAreaLabos().toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoarealaboLocal =(TipoAreaLabo) this.tipoarealabos.toArray()[this.jTableDatosTipoAreaLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoarealaboLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
						tipoarealaboAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAreaLabo tipoarealaboAux:tipoarealabos) {
						tipoarealaboAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAreaLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAreaLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAreaLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAreaLaboItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAreaLaboParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAreaLaboActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAreaLabo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAreaLabo tipoarealaboAux:this.tipoarealaboLogic.getTipoAreaLabos()) {
				
						if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoarealaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoarealaboAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaLabo tipoarealaboAux:tipoarealabos) {
					
						if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoarealaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoarealaboAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAreaLaboActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAreaLabo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAreaLabo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAreaLabo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAreaLabo(conSplash);
				
					this.generarReporteTipoAreaLabosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAreaLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAreaLabosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAreaLabosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAreaLabo();
				
				this.exportarTipoAreaLabosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAreaLabos();
				//this.importarTipoAreaLabos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAreaLabo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAreaLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Area Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAreaLabo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAreaLabo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAreaLabo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoAreaLaboBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoAreaLabo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoAreaLabo(conSplash);
					
						//this.actualizarParametrosGeneralTipoAreaLabo();
						
						this.generarReporteProcesoAccionTipoAreaLabosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoAreaLaboBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Area LaboS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Area Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoAreaLabo();
				
						this.actualizarParametrosGeneralTipoAreaLabo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoarealaboReturnGeneral=tipoarealaboLogic.procesarAccionTipoAreaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoarealaboLogic.getTipoAreaLabos(),this.tipoarealaboParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoAreaLaboReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAreaLabo();
					
					TipoAreaLaboBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoAreaLaboReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoAreaLabo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxTiposAccionesFormularioTipoAreaLabo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAreaLabo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAreaLaboActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAreaLabo();
			
			if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
			TipoAreaLabo tipoarealabo=new TipoAreaLabo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAreaLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAreaLabo.getSelectedItem();
			
			
			
			
			tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoarealabosSeleccionados.size()==1) {
				for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
					tipoarealabo=tipoarealaboAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Informacion Laboral")) {
					jButtonInformacionLaboralActionPerformed(null,rowIndex,true,false,tipoarealabo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAreaLabo();
			
      		//this.finishProcessTipoAreaLabo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAreaLaboReturnGeneral() throws Exception {
		if(this.tipoarealaboReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoarealaboReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoarealaboReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoarealaboReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoarealaboReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoarealaboReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAreaLabo(false);
		}
		
		if(this.tipoarealaboReturnGeneral.getConRetornoLista() || this.tipoarealaboReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoarealaboReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoarealaboLogic.setTipoAreaLabos(this.tipoarealaboReturnGeneral.getTipoAreaLabos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoarealaboReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoarealaboLogic.setTipoAreaLabo(this.tipoarealaboReturnGeneral.getTipoAreaLabo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAreaLabo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAreaLabo() throws Exception {
		
		
	}
	
	public ArrayList<TipoAreaLabo> getTipoAreaLabosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAreaLabo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAreaLabo tipoarealaboAux:tipoarealaboLogic.getTipoAreaLabos()) {
					if(tipoarealaboAux.getIsSelected()) {
						tipoarealabosSeleccionados.add(tipoarealaboAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAreaLabo tipoarealaboAux:this.tipoarealabos) {
					if(tipoarealaboAux.getIsSelected()) {
						tipoarealabosSeleccionados.add(tipoarealaboAux);				
					}
				}
			}
			
			if(tipoarealabosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoarealabosSeleccionados.addAll(this.tipoarealaboLogic.getTipoAreaLabos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoarealabosSeleccionados.addAll(this.tipoarealabos);				
					}
				}
			}
		} else {
			tipoarealabosSeleccionados.add(this.tipoarealabo);
		}
		
		return tipoarealabosSeleccionados;
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
	
	public void generarReporteTipoAreaLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAreaLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAreaLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAreaLabosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAreaLabosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoAreaLabosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Area Labo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAreaLabosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAreaLabo();
		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAreaLabo();
		
		
		//this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados ,tipoarealaboImplementable,tipoarealaboImplementableHome);
	}
	
	public void mostrarImportacionTipoAreaLabos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAreaLabo();
		
		this.abrirFrameImportacionTipoAreaLabo();		
		
			
		//this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados ,tipoarealaboImplementable,tipoarealaboImplementableHome);
	}
	
	public void importarTipoAreaLabos() throws Exception {		
	
	}
	
	public void exportarTipoAreaLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAreaLabosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAreaLabosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAreaLabosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Area Labo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAreaLabo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAreaLabo(tipoarealaboAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoarealaboAux.setsDetalleGeneralEntityReporte(tipoarealaboAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAreaLabo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAreaLaboConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaLaboConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaLaboConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAreaLaboConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAreaLabo(TipoAreaLabo tipoarealabo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoarealabo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarealabo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarealabo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarealabo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoarealabo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAreaLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAreaLabo(row);				
				iRow++;
			}				
			
			for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAreaLabo(tipoarealaboAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAreaLabosSeleccionados() throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();		
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoarealabo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoarealabos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoarealabo");
			//elementRoot.appendChild(element);
		
			for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
				element = document.createElement("tipoarealabo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAreaLabo(tipoarealaboAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Area Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAreaLabo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAreaLabo(TipoAreaLabo tipoarealabo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarealabo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarealabo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarealabo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoarealabo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoAreaLabo(TipoAreaLabo tipoarealabo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAreaLaboConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoarealabo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAreaLaboConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoarealabo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoAreaLaboConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoarealabo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoAreaLaboConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoarealabo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoAreaLaboConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoarealabo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoAreaLabosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAreaLabo> tipoarealabosSeleccionados=new ArrayList<TipoAreaLabo>();
		
		tipoarealabosSeleccionados=this.getTipoAreaLabosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAreaLabo(tipoarealabosSeleccionados);
		
		this.generarReporteTipoAreaLabos("Todos",tipoarealabosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAreaLabo(ArrayList<TipoAreaLabo> tipoarealabosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAreaLabo tipoarealaboAux:tipoarealabosSeleccionados) {
				tipoarealaboAux.setsDetalleGeneralEntityReporte(tipoarealaboAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoarealaboAux.setsDescripcionGeneralEntityReporte1(tipoarealaboAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoarealaboAux.setsDescripcionGeneralEntityReporte1(tipoarealaboAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoAreaLaboConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoarealaboAux.setsDescripcionGeneralEntityReporte1(tipoarealaboAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAreaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAreaLabo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAreaLabo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=true;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=true;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=true;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=true;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=true;
			this.isVisibilidadCeldaModificarTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
			this.isVisibilidadCeldaModificarTipoAreaLabo=true;
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
			this.isVisibilidadCeldaCancelarTipoAreaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAreaLabo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAreaLaboJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAreaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=true;
		} else {
			this.actualizarEstadoPanelsTipoAreaLabo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAreaLabo=false;
			//this.isVisibilidadCeldaVerFormTipoAreaLabo=false;
			this.isVisibilidadCeldaDuplicarTipoAreaLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoarealaboSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			if(!tipoarealaboSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;												
			}
			
			this.jButtonCerrarTipoAreaLabo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAreaLabo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoarealabo)) {
			this.isVisibilidadCeldaActualizarTipoAreaLabo=false;
			this.isVisibilidadCeldaEliminarTipoAreaLabo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAreaLabo() {
		this.isVisibilidadCeldaNuevoTipoAreaLabo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoAreaLabo=false;
	}
	
	public void actualizarEstadoPanelsTipoAreaLabo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAreaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoAreaLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAreaLabo!=null) {
				this.jScrollPanelDatosTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAreaLabo!=null) {
				this.jPanelPaginacionTipoAreaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
					this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoarealaboSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAreaLabo!=null) {
				this.jTabbedPaneBusquedasTipoAreaLabo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAreaLabo!=null) {
				this.jPanelParametrosReportesTipoAreaLabo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoAreaLaboParaInformacionLaborales() throws Exception {
		Boolean isPaginaPopupInformacionLaboral=false;

		try {

			if(this.tipoarealaboSessionBean==null) {
				this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean==null) {
				this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setsPathNavegacionActual(tipoarealaboSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupInformacionLaboral=this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral(false);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral(TipoAreaLaboConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionTipoAreaLabo(true);
			this.jInternalFrameDetalleFormTipoAreaLabo.informacionlaboralSessionBean.setlidTipoAreaLaboActual(this.idTipoAreaLaboActual);

			tipoarealaboSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoAreaLabo(true);
			tipoarealaboSessionBean.setlIdTipoAreaLaboActualForeignKey(this.idTipoAreaLaboActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoAreaLaboSessionBean tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		
		if(this.tipoarealaboSessionBean==null) {
			this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		}
		
		this.tipoarealaboSessionBean.setsUltimaBusquedaTipoAreaLabo(this.getsAccionBusqueda());
		this.tipoarealaboSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoarealaboSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoarealaboSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAreaLaboSessionBean tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		
		if(this.tipoarealaboSessionBean==null) {
			this.tipoarealaboSessionBean=new TipoAreaLaboSessionBean();
		}
		
		if(this.tipoarealaboSessionBean.getsUltimaBusquedaTipoAreaLabo()!=null&&!this.tipoarealaboSessionBean.getsUltimaBusquedaTipoAreaLabo().equals("")) {
			this.setsAccionBusqueda(tipoarealaboSessionBean.getsUltimaBusquedaTipoAreaLabo());
			this.setiNumeroPaginacion(tipoarealaboSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoarealaboSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoarealaboSessionBean.getid_empresa());
				tipoarealaboSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoarealaboSessionBean.setsUltimaBusquedaTipoAreaLabo("");
		this.tipoarealaboSessionBean.setiNumeroPaginacion(TipoAreaLaboConstantesFunciones.INUMEROPAGINACION);
		this.tipoarealaboSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAreaLabo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAreaLabo() {
		this.updateBorderResaltarBusquedasFormularioTipoAreaLabo();
		this.updateVisibilidadBusquedasFormularioTipoAreaLabo();
		this.updateHabilitarBusquedasFormularioTipoAreaLabo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAreaLabo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAreaLabo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAreaLabo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAreaLabo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAreaLabo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAreaLabo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAreaLabo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoAreaLabo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAreaLabo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAreaLabo();
		this.updateVisibilidadResaltarControlesFormularioTipoAreaLabo();
		this.updateHabilitarResaltarControlesFormularioTipoAreaLabo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAreaLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoarealaboConstantesFunciones.resaltaridTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo!=null) {this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setBorder(this.tipoarealaboConstantesFunciones.resaltaridTipoAreaLabo);}
		if(this.tipoarealaboConstantesFunciones.resaltarid_empresaTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo!=null) {this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setBorder(this.tipoarealaboConstantesFunciones.resaltarid_empresaTipoAreaLabo);}
		if(this.tipoarealaboConstantesFunciones.resaltarcodigoTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo!=null) {this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setBorder(this.tipoarealaboConstantesFunciones.resaltarcodigoTipoAreaLabo);}
		if(this.tipoarealaboConstantesFunciones.resaltarnombreTipoAreaLabo!=null && this.jInternalFrameDetalleFormTipoAreaLabo!=null) {this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setBorder(this.tipoarealaboConstantesFunciones.resaltarnombreTipoAreaLabo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAreaLabo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
	
		//this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostraridTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jPanelidTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostraridTipoAreaLabo);
		//this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarid_empresaTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jPanelid_empresaTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarid_empresaTipoAreaLabo);
		//this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarcodigoTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jPanelcodigoTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarcodigoTipoAreaLabo);
		//this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarnombreTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jPanelnombreTipoAreaLabo.setVisible(this.tipoarealaboConstantesFunciones.mostrarnombreTipoAreaLabo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAreaLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAreaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAreaLabo!=null) {
	
		this.jInternalFrameDetalleFormTipoAreaLabo.jLabelidTipoAreaLabo.setEnabled(this.tipoarealaboConstantesFunciones.activaridTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jComboBoxid_empresaTipoAreaLabo.setEnabled(this.tipoarealaboConstantesFunciones.activarid_empresaTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jTextFieldcodigoTipoAreaLabo.setEnabled(this.tipoarealaboConstantesFunciones.activarcodigoTipoAreaLabo);
		this.jInternalFrameDetalleFormTipoAreaLabo.jTextAreanombreTipoAreaLabo.setEnabled(this.tipoarealaboConstantesFunciones.activarnombreTipoAreaLabo);
		}
	}
	
		
}