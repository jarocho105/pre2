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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.SubSectorConstantesFunciones;
import com.bydan.erp.seguridad.util.SubSectorParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SubSectorParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SubSectorBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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




@SuppressWarnings("unused")
public class SubSectorBeanSwingJInternalFrame extends SubSectorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SubSectorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SubSector> subsectorValidator = new ClassValidator<SubSector>(SubSector.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SubSector subsector;	
	public SubSector subsectorAux;
	public SubSector subsectorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SubSector subsectorTotales;
	public Long idSubSectorActual;
	public Long iIdNuevoSubSector=0L;
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

	public String sFinalQueryComboSector="";

	public List<Sector> sectorsForeignKey;

	public List<Sector> getsectorsForeignKey() {
		return sectorsForeignKey;
	}

	public void setsectorsForeignKey(List<Sector> sectorsForeignKey) {
		this.sectorsForeignKey = sectorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sector sectorForeignKey;

	public Sector getsectorForeignKey() {
		return sectorForeignKey;
	}

	public void setsectorForeignKey(Sector sectorForeignKey) {
		this.sectorForeignKey = sectorForeignKey;
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
	
	public Boolean isPermisoTodoSubSector;
	public Boolean isPermisoNuevoSubSector;
	public Boolean isPermisoActualizarSubSector;
	public Boolean isPermisoActualizarOriginalSubSector;
	public Boolean isPermisoEliminarSubSector;
	public Boolean isPermisoGuardarCambiosSubSector;
	public Boolean isPermisoConsultaSubSector;
	public Boolean isPermisoBusquedaSubSector;
	public Boolean isPermisoReporteSubSector;
	public Boolean isPermisoPaginacionMedioSubSector;
	public Boolean isPermisoPaginacionAltoSubSector;
	public Boolean isPermisoPaginacionTodoSubSector;
	public Boolean isPermisoCopiarSubSector;
	public Boolean isPermisoVerFormSubSector;
	public Boolean isPermisoDuplicarSubSector;
	public Boolean isPermisoOrdenSubSector;
	
	
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
	
	public SubSectorParameterReturnGeneral subsectorReturnGeneral;
	public SubSectorParameterReturnGeneral subsectorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSubSector=false;
	public Boolean esParaAccionDesdeFormularioSubSector=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SubSectorSessionBeanAdditional subsectorSessionBeanAdditional=null;
	
	public SubSectorSessionBeanAdditional getSubSectorSessionBeanAdditional() {
		return this.subsectorSessionBeanAdditional;
	}
	
	public void setSubSectorSessionBeanAdditional(SubSectorSessionBeanAdditional subsectorSessionBeanAdditional) {
		try {
			this.subsectorSessionBeanAdditional=subsectorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SubSectorBeanSwingJInternalFrameAdditional subsectorBeanSwingJInternalFrameAdditional=null;
	//public class SubSectorBeanSwingJInternalFrame
	
	public SubSectorBeanSwingJInternalFrameAdditional getSubSectorBeanSwingJInternalFrameAdditional() {
		return this.subsectorBeanSwingJInternalFrameAdditional;
	}
	
	public void setSubSectorBeanSwingJInternalFrameAdditional(SubSectorBeanSwingJInternalFrameAdditional subsectorBeanSwingJInternalFrameAdditional) {
		try {
			this.subsectorBeanSwingJInternalFrameAdditional=subsectorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SubSectorLogic subsectorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SubSector subsectorBean;
	public SubSectorConstantesFunciones subsectorConstantesFunciones;
	//public SubSectorParameterReturnGeneral subsectorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SectorLogic sectorLogic;
	
	//PARAMETROS
	
	
	//public List<SubSector> subsectors;	
	//public List<SubSector> subsectorsEliminados;
	//public List<SubSector> subsectorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSubSector=false;
	public Boolean isVisibilidadCeldaDuplicarSubSector=true;
	public Boolean isVisibilidadCeldaCopiarSubSector=true;
	public Boolean isVisibilidadCeldaVerFormSubSector=true;
	public Boolean isVisibilidadCeldaOrdenSubSector=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSubSector=false;
	public Boolean isVisibilidadCeldaModificarSubSector=false;
	public Boolean isVisibilidadCeldaActualizarSubSector=false;
	public Boolean isVisibilidadCeldaEliminarSubSector=false;
	public Boolean isVisibilidadCeldaCancelarSubSector=false;
	public Boolean isVisibilidadCeldaGuardarSubSector=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSubSector=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSector=false;
	
	public Long getiIdNuevoSubSector() {
		return this.iIdNuevoSubSector;
	}

	public void setiIdNuevoSubSector(Long iIdNuevoSubSector) {
		this.iIdNuevoSubSector = iIdNuevoSubSector;
	}
	
	public Long getidSubSectorActual() {
		return this.idSubSectorActual;
	}

	public void setidSubSectorActual(Long idSubSectorActual) {
		this.idSubSectorActual = idSubSectorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SubSector getsubsector() {
		return this.subsector;
	}

	public void setsubsector(SubSector subsector) {
		this.subsector = subsector;
	}
	
	public SubSector getsubsectorAux() {
		return this.subsectorAux;
	}

	public void setsubsectorAux(SubSector subsectorAux) {
		this.subsectorAux = subsectorAux;
	}				
	
	public SubSector getsubsectorAnterior() {
		return this.subsectorAnterior;
	}

	public void setsubsectorAnterior(SubSector subsectorAnterior) {
		this.subsectorAnterior = subsectorAnterior;
	}	
	
	public SubSector getsubsectorTotales() {
		return this.subsectorTotales;
	}

	public void setsubsectorTotales(SubSector subsectorTotales) {
		this.subsectorTotales = subsectorTotales;
	}	
	
	public SubSector getsubsectorBean() {
		return this.subsectorBean;
	}

	public void setsubsectorBean(SubSector subsectorBean) {
		this.subsectorBean = subsectorBean;
	}	
	
	public SubSectorParameterReturnGeneral getsubsectorReturnGeneral() {
		return this.subsectorReturnGeneral;
	}

	public void setsubsectorReturnGeneral(SubSectorParameterReturnGeneral subsectorReturnGeneral) {
		this.subsectorReturnGeneral = subsectorReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sectorFK_IdSector=-1L;

	public Long getid_sectorFK_IdSector() {
		return this.id_sectorFK_IdSector;
	}

	public void setid_sectorFK_IdSector(Long id_sectorFK_IdSector) {
		this.id_sectorFK_IdSector = id_sectorFK_IdSector;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SubSectorLogic getSubSectorLogic()	{		
		return subsectorLogic;
	}

	public void setSubSectorLogic(SubSectorLogic subsectorLogic) {
		this.subsectorLogic = subsectorLogic;
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
	
	public Boolean getIsEsNuevoSubSector() {
		return isEsNuevoSubSector;
	}

	public void setIsEsNuevoSubSector(Boolean isEsNuevoSubSector) {
		this.isEsNuevoSubSector = isEsNuevoSubSector;
	}

	public Boolean getEsParaAccionDesdeFormularioSubSector() {
		return esParaAccionDesdeFormularioSubSector;
	}
	
	public void setEsParaAccionDesdeFormularioSubSector(Boolean esParaAccionDesdeFormularioSubSector) {
		this.esParaAccionDesdeFormularioSubSector = esParaAccionDesdeFormularioSubSector;
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

			if(this.subsectorSessionBean==null) {
				this.subsectorSessionBean=new SubSectorSessionBean();
			}

			if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(subsectorSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSectorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sectorsForeignKey=new ArrayList<Sector>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SectorLogic sectorLogic=new SectorLogic();

			//sectorLogic.getSectorDataAccess().setIsForForeingKeyData(true);

			if(this.subsectorSessionBean==null) {
				this.subsectorSessionBean=new SubSectorSessionBean();
			}

			if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionSector()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sectorLogic.getSectorDataAccess().setIsForForeingKeyData(true);

					sectorLogic.getTodosSectorsWithConnection(sFinalQuery,new Pagination());

					this.sectorsForeignKey=sectorLogic.getSectors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSector(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sectorLogic.getEntityWithConnection(subsectorSessionBean.getlidSectorActual());
					this.sectorsForeignKey.add(sectorLogic.getSector());
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

					if(this.subsector!=null) {
						this.subsector.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSubSector!=null) {
						this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSubSector.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSubSector!=null) {
						if(this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSubSectorGenerico)throws Exception
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
				jComboBoxid_empresaSubSectorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSubSectorGenerico!=null && jComboBoxid_empresaSubSectorGenerico.getItemCount()>0) {
					jComboBoxid_empresaSubSectorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSectorForeignKey(Long idSectorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sector  sectorTemp=null;

			for(Sector sectorAux:sectorsForeignKey) {
				if(sectorAux.getId()!=null && sectorAux.getId().equals(idSectorSeleccionado)) {
					sectorTemp=sectorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sectorTemp!=null) {

					if(this.subsector!=null) {
						this.subsector.setSector(sectorTemp);
					}

					if(this.jInternalFrameDetalleFormSubSector!=null) {
						this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setSelectedItem(sectorTemp);
					}
				} else {
					//jComboBoxid_sectorSubSector.setSelectedItem(sectorTemp);
					if(this.jInternalFrameDetalleFormSubSector!=null) {
						if(this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSector") || sFormularioTipoBusqueda.equals("Todos")){
					if(sectorTemp!=null && jComboBoxid_sectorFK_IdSectorSubSector!=null) {
						jComboBoxid_sectorFK_IdSectorSubSector.setSelectedItem(sectorTemp);
					} else {
						if(jComboBoxid_sectorFK_IdSectorSubSector!=null) {
							//jComboBoxid_sectorFK_IdSectorSubSector.setSelectedItem(sectorTemp);
							if(jComboBoxid_sectorFK_IdSectorSubSector.getItemCount()>0) {
								jComboBoxid_sectorFK_IdSectorSubSector.setSelectedIndex(0);
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

	public String getActualSectorForeignKeyDescripcion(Long idSectorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sector  sectorTemp=null;

			for(Sector sectorAux:sectorsForeignKey) {
				if(sectorAux.getId()!=null && sectorAux.getId().equals(idSectorSeleccionado)) {
					sectorTemp=sectorAux;
					break;
				}
			}


			sDescripcion=SectorConstantesFunciones.getSectorDescripcion(sectorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSectorForeignKeyGenerico(Long idSectorSeleccionado,JComboBox jComboBoxid_sectorSubSectorGenerico)throws Exception
	{
		try
		{
			Sector  sectorTemp=null;

			for(Sector sectorAux:sectorsForeignKey) {
				if(sectorAux.getId()!=null && sectorAux.getId().equals(idSectorSeleccionado)) {
					sectorTemp=sectorAux;
					break;
				}
			}

			if(sectorTemp!=null) {
				jComboBoxid_sectorSubSectorGenerico.setSelectedItem(sectorTemp);
			} else {
				if(jComboBoxid_sectorSubSectorGenerico!=null && jComboBoxid_sectorSubSectorGenerico.getItemCount()>0) {
					jComboBoxid_sectorSubSectorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SubSector subsector,JComboBox jComboBoxid_empresaSubSectorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSubSectorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSubSectorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				subsector.setid_empresa(empresaAux.getId());
				subsector.setempresa_descripcion(SubSectorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				subsector.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSectorForeignKey(SubSector subsector,JComboBox jComboBoxid_sectorSubSectorGenerico)throws Exception
	{
		try
		{
			Sector  sectorAux=new Sector();

			if(jComboBoxid_sectorSubSectorGenerico==null) {
				sectorAux=(Sector)this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.getSelectedItem();
			} else {
				sectorAux=(Sector)jComboBoxid_sectorSubSectorGenerico.getSelectedItem();
			}

			if(sectorAux!=null && sectorAux.getId()!=null) {
				subsector.setid_sector(sectorAux.getId());
				subsector.setsector_descripcion(SubSectorConstantesFunciones.getSectorDescripcion(sectorAux));
				subsector.setSector(sectorAux);			}
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

					if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubSector!=null) { 
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubSector!=null) { 
					}

					if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSectorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSector=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubSector!=null) { 
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.removeAllItems();

							for(Sector sector:this.sectorsForeignKey) {
								this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.addItem(sector);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubSector!=null) { 
					}

					if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSector") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sectorFK_IdSectorSubSector.removeAllItems();

							for(Sector sector:this.sectorsForeignKey) {
								this.jComboBoxid_sectorFK_IdSectorSubSector.addItem(sector);
							}
						}

						if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSubSector!=null) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubSector!=null) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSectorForeignKey(Sector sector,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSubSector!=null) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setSelectedItem(sector);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubSector!=null) {
							this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sectorFK_IdSectorSubSector.setSelectedItem(sector);
						} else {
							this.jComboBoxid_sectorFK_IdSectorSubSector.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSubSector() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SubSectorConstantesFunciones.refrescarForeignKeysDescripcionesSubSector(this.subsectorLogic.getSubSectors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SubSectorConstantesFunciones.refrescarForeignKeysDescripcionesSubSector(this.subsectors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sector.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//subsectorLogic.setSubSectors(this.subsectors);
			subsectorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SubSectorParameterReturnGeneral getSubSectorParameterGeneral() {
		return this.subsectorParameterGeneral;
	}
	
	public void setSubSectorParameterGeneral(SubSectorParameterReturnGeneral subsectorParameterGeneral) {
		this.subsectorParameterGeneral = subsectorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSubSector() {
		return isPermisoTodoSubSector;
	}

	public void setIsPermisoTodoSubSector(Boolean isPermisoTodoSubSector) {
		this.isPermisoTodoSubSector = isPermisoTodoSubSector;
	}

	public Boolean getIsPermisoNuevoSubSector() {
		return isPermisoNuevoSubSector;
	}

	public void setIsPermisoNuevoSubSector(Boolean isPermisoNuevoSubSector) {
		this.isPermisoNuevoSubSector = isPermisoNuevoSubSector;
	}

	public Boolean getIsPermisoActualizarSubSector() {
		return isPermisoActualizarSubSector;
	}

	public void setIsPermisoActualizarSubSector(Boolean isPermisoActualizarSubSector) {
		this.isPermisoActualizarSubSector = isPermisoActualizarSubSector;
	}

	public Boolean getIsPermisoEliminarSubSector() {
		return isPermisoEliminarSubSector;
	}

	public void setIsPermisoEliminarSubSector(Boolean isPermisoEliminarSubSector) {
		this.isPermisoEliminarSubSector = isPermisoEliminarSubSector;
	}

	public Boolean getIsPermisoGuardarCambiosSubSector() {
		return isPermisoGuardarCambiosSubSector;
	}

	public void setIsPermisoGuardarCambiosSubSector(Boolean isPermisoGuardarCambiosSubSector) {
		this.isPermisoGuardarCambiosSubSector = isPermisoGuardarCambiosSubSector;
	}
	
	public Boolean getIsPermisoConsultaSubSector() {
		return isPermisoConsultaSubSector;
	}

	public void setIsPermisoConsultaSubSector(Boolean isPermisoConsultaSubSector) {
		this.isPermisoConsultaSubSector = isPermisoConsultaSubSector;
	}

	public Boolean getIsPermisoBusquedaSubSector() {
		return isPermisoBusquedaSubSector;
	}

	public void setIsPermisoBusquedaSubSector(Boolean isPermisoBusquedaSubSector) {
		this.isPermisoBusquedaSubSector = isPermisoBusquedaSubSector;
	}

	public Boolean getIsPermisoReporteSubSector() {
		return isPermisoReporteSubSector;
	}

	public void setIsPermisoReporteSubSector(Boolean isPermisoReporteSubSector) {
		this.isPermisoReporteSubSector = isPermisoReporteSubSector;
	}
	
	public Boolean getIsPermisoPaginacionMedioSubSector() {
		return isPermisoPaginacionMedioSubSector;
	}

	public void setIsPermisoPaginacionMedioSubSector(Boolean isPermisoPaginacionMedioSubSector) {
		this.isPermisoPaginacionMedioSubSector = isPermisoPaginacionMedioSubSector;
	}
	
	public Boolean getIsPermisoPaginacionTodoSubSector() {
		return isPermisoPaginacionTodoSubSector;
	}

	public void setIsPermisoPaginacionTodoSubSector(Boolean isPermisoPaginacionTodoSubSector) {
		this.isPermisoPaginacionTodoSubSector = isPermisoPaginacionTodoSubSector;
	}
	
	public Boolean getIsPermisoPaginacionAltoSubSector() {
		return isPermisoPaginacionAltoSubSector;
	}

	public void setIsPermisoPaginacionAltoSubSector(Boolean isPermisoPaginacionAltoSubSector) {
		this.isPermisoPaginacionAltoSubSector = isPermisoPaginacionAltoSubSector;
	}
	
	public Boolean getIsPermisoCopiarSubSector() {
		return isPermisoCopiarSubSector;
	}

	public void setIsPermisoCopiarSubSector(Boolean isPermisoCopiarSubSector) {
		this.isPermisoCopiarSubSector = isPermisoCopiarSubSector;
	}
	
	public Boolean getIsPermisoVerFormSubSector() {
		return isPermisoVerFormSubSector;
	}

	public void setIsPermisoVerFormSubSector(Boolean isPermisoVerFormSubSector) {
		this.isPermisoVerFormSubSector = isPermisoVerFormSubSector;
	}
	
	public Boolean getIsPermisoDuplicarSubSector() {
		return isPermisoDuplicarSubSector;
	}

	public void setIsPermisoDuplicarSubSector(Boolean isPermisoDuplicarSubSector) {
		this.isPermisoDuplicarSubSector = isPermisoDuplicarSubSector;
	}
	
	public Boolean getIsPermisoOrdenSubSector() {
		return isPermisoOrdenSubSector;
	}

	public void setIsPermisoOrdenSubSector(Boolean isPermisoOrdenSubSector) {
		this.isPermisoOrdenSubSector = isPermisoOrdenSubSector;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSubSector() {
		return isVisibilidadCeldaNuevoSubSector;
	}

	public void setIsVisibilidadCeldaNuevoSubSector(Boolean isVisibilidadCeldaNuevoSubSector) {
		this.isVisibilidadCeldaNuevoSubSector = isVisibilidadCeldaNuevoSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSubSector() {
		return isVisibilidadCeldaDuplicarSubSector;
	}

	public void setIsVisibilidadCeldaDuplicarSubSector(Boolean isVisibilidadCeldaDuplicarSubSector) {
		this.isVisibilidadCeldaDuplicarSubSector = isVisibilidadCeldaDuplicarSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSubSector() {
		return isVisibilidadCeldaCopiarSubSector;
	}

	public void setIsVisibilidadCeldaCopiarSubSector(Boolean isVisibilidadCeldaCopiarSubSector) {
		this.isVisibilidadCeldaCopiarSubSector = isVisibilidadCeldaCopiarSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSubSector() {
		return isVisibilidadCeldaVerFormSubSector;
	}

	public void setIsVisibilidadCeldaVerFormSubSector(Boolean isVisibilidadCeldaVerFormSubSector) {
		this.isVisibilidadCeldaVerFormSubSector = isVisibilidadCeldaVerFormSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSubSector() {
		return isVisibilidadCeldaOrdenSubSector;
	}

	public void setIsVisibilidadCeldaOrdenSubSector(Boolean isVisibilidadCeldaOrdenSubSector) {
		this.isVisibilidadCeldaOrdenSubSector = isVisibilidadCeldaOrdenSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSubSector() {
		return isVisibilidadCeldaNuevoRelacionesSubSector;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSubSector(Boolean isVisibilidadCeldaNuevoRelacionesSubSector) {
		this.isVisibilidadCeldaNuevoRelacionesSubSector = isVisibilidadCeldaNuevoRelacionesSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSubSector() {
		return isVisibilidadCeldaModificarSubSector;
	}

	public void setIsVisibilidadCeldaModificarSubSector(Boolean isVisibilidadCeldaModificarSubSector) {
		this.isVisibilidadCeldaModificarSubSector = isVisibilidadCeldaModificarSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSubSector() {
		return isVisibilidadCeldaActualizarSubSector;
	}

	public void setIsVisibilidadCeldaActualizarSubSector(Boolean isVisibilidadCeldaActualizarSubSector) {
		this.isVisibilidadCeldaActualizarSubSector = isVisibilidadCeldaActualizarSubSector;
	}

	public Boolean getIsVisibilidadCeldaEliminarSubSector() {
		return isVisibilidadCeldaEliminarSubSector;
	}

	public void setIsVisibilidadCeldaEliminarSubSector(Boolean isVisibilidadCeldaEliminarSubSector) {
		this.isVisibilidadCeldaEliminarSubSector = isVisibilidadCeldaEliminarSubSector;
	}

	public Boolean getIsVisibilidadCeldaCancelarSubSector() {
		return isVisibilidadCeldaCancelarSubSector;
	}

	public void setIsVisibilidadCeldaCancelarSubSector(Boolean isVisibilidadCeldaCancelarSubSector) {
		this.isVisibilidadCeldaCancelarSubSector = isVisibilidadCeldaCancelarSubSector;
	}

	public Boolean getIsVisibilidadCeldaGuardarSubSector() {
		return isVisibilidadCeldaGuardarSubSector;
	}

	public void setIsVisibilidadCeldaGuardarSubSector(Boolean isVisibilidadCeldaGuardarSubSector) {
		this.isVisibilidadCeldaGuardarSubSector = isVisibilidadCeldaGuardarSubSector;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSubSector() {
		return isVisibilidadCeldaGuardarCambiosSubSector;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSubSector(Boolean isVisibilidadCeldaGuardarCambiosSubSector) {
		this.isVisibilidadCeldaGuardarCambiosSubSector = isVisibilidadCeldaGuardarCambiosSubSector;
	}
		
	public SubSectorSessionBean getsubsectorSessionBean() {
		return this.subsectorSessionBean;
	}
	
	public void setsubsectorSessionBean(SubSectorSessionBean subsectorSessionBean) {
		this.subsectorSessionBean=subsectorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSector() {
		return this.isVisibilidadFK_IdSector;
	}

	public void setisVisibilidadFK_IdSector(Boolean isVisibilidadFK_IdSector) {
		this.isVisibilidadFK_IdSector=isVisibilidadFK_IdSector;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSubSector(SubSector subsector)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(subsector,null);
				this.setActualParaGuardarSectorForeignKey(subsector,null);
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
	
	public void bugActualizarReferenciaActual(SubSector subsector,SubSector subsectorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSubSector(subsector);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		subsectorAux.setId(subsector.getId());
		subsectorAux.setVersionRow(subsector.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSubSector();
		
			int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = subsectorValidator.getInvalidValues(this.subsector);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			subsectorLogic.setDatosCliente(datosCliente);
			subsectorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				subsectorAux=new  SubSector();
				
				subsectorAux.setIsNew(true);
				subsectorAux.setIsChanged(true);
				
				subsectorAux.setSubSectorOriginal(this.subsector);
				
				subsectorAux.setId(this.subsector.getId());	
				subsectorAux.setVersionRow(this.subsector.getVersionRow());	
				subsectorAux.setid_empresa(this.subsector.getid_empresa());	
				subsectorAux.setid_sector(this.subsector.getid_sector());	
				subsectorAux.setcodigo(this.subsector.getcodigo());	
				subsectorAux.setnombre(this.subsector.getnombre());	
				subsectorAux.setdescripcion(this.subsector.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subsectorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subsectorAux,subsectors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subsectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorLogic.saveSubSectors();//WithConnection
						//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subsector,subsectorAux);
					
					this.refrescarForeignKeysDescripcionesSubSector();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subsectorLogic.saveSubSectorRelaciones(subsectorAux);//WithConnection
								//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subsector,subsectorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subsectorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subsectorAux,subsectors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subsector,subsectorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				subsectorAux=new  SubSector();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.subsectorSessionBean.getEsGuardarRelacionado() 
					|| (this.subsectorSessionBean.getEsGuardarRelacionado() && this.subsector.getId()>=0)) {
						
					subsectorAux.setIsNew(false);
				}
				
				subsectorAux.setIsDeleted(false);
			
				subsectorAux.setId(this.subsector.getId());	
				subsectorAux.setVersionRow(this.subsector.getVersionRow());	
				subsectorAux.setid_empresa(this.subsector.getid_empresa());	
				subsectorAux.setid_sector(this.subsector.getid_sector());	
				subsectorAux.setcodigo(this.subsector.getcodigo());	
				subsectorAux.setnombre(this.subsector.getnombre());	
				subsectorAux.setdescripcion(this.subsector.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subsectorAux,subsectors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subsectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorLogic.saveSubSectors();//WithConnection
						//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subsector,subsectorAux);
					
					this.refrescarForeignKeysDescripcionesSubSector();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subsectorLogic.saveSubSectorRelaciones(subsectorAux);//WithConnection
								//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subsector,subsectorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subsectorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subsectorAux,subsectors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subsector,subsectorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				subsectorAux=new  SubSector();
				
				subsectorAux.setIsNew(false);
				subsectorAux.setIsChanged(false);
				
				subsectorAux.setIsDeleted(true);
				
				subsectorAux.setId(this.subsector.getId());	
				subsectorAux.setVersionRow(this.subsector.getVersionRow());	
				subsectorAux.setid_empresa(this.subsector.getid_empresa());	
				subsectorAux.setid_sector(this.subsector.getid_sector());	
				subsectorAux.setcodigo(this.subsector.getcodigo());	
				subsectorAux.setnombre(this.subsector.getnombre());	
				subsectorAux.setdescripcion(this.subsector.getdescripcion());	
				
				if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.subsectorAux.getId()>=0) {	
						this.subsectorsEliminados.add(subsectorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subsectorAux,subsectors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subsectorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorLogic.saveSubSectors();//WithConnection
						//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subsectorLogic.saveSubSectorRelaciones(subsectorAux);//WithConnection
								//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.subsectorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(subsectorAux,subsectorLogic.getSubSectors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(subsectorAux,subsectors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getSubSectors().addAll(this.subsectorsEliminados);
					
					subsectorLogic.saveSubSectors();//WithConnection
					//subsectorLogic.getSetVersionRowSubSectors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSubSector();
				
				this.subsectorsEliminados= new ArrayList<SubSector>();		
			}
			
			if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sector GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.subsector=subsectorAux;
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
      		//this.finishProcessSubSector();
      	}
		
	}	
	
	public void actualizarRelaciones(SubSector subsectorLocal) throws Exception {
		
		if(this.subsectorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SubSector subsectorLocal) throws Exception {	
		if(this.subsectorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				subsectorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SectorDetalleFormJInternalFrame.class)) {
				SectorBeanSwingJInternalFrame sectorBeanSwingJInternalFrameLocal=(SectorBeanSwingJInternalFrame) ((SectorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sectorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSector(sectorBeanSwingJInternalFrameLocal.getsector(),true);
				sectorBeanSwingJInternalFrameLocal.actualizarLista(sectorBeanSwingJInternalFrameLocal.sector,this.sectorsForeignKey);

				sectorBeanSwingJInternalFrameLocal.actualizarRelaciones(sectorBeanSwingJInternalFrameLocal.sector);

				subsectorLocal.setSector(sectorBeanSwingJInternalFrameLocal.sector);

				this.addItemDefectoCombosForeignKeySector();
				this.cargarCombosFrameSectorsForeignKey("Formulario");
				this.setActualSectorForeignKey(sectorBeanSwingJInternalFrameLocal.sector.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSubSectorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = subsectorValidator.getInvalidValues(this.subsector);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SubSector subsector,List<SubSector> subsectors) throws Exception {
		try	{		
			SubSectorConstantesFunciones.actualizarLista(subsector,subsectors,this.subsectorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SubSector subsector,List<SubSector> subsectors) throws Exception {
		try	{			
			SubSectorConstantesFunciones.actualizarSelectedLista(subsector,subsectors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SubSector> subsectorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				subsectorsLocal=this.subsectorLogic.getSubSectors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				subsectorsLocal=this.subsectors;
			}
			//ARCHITECTURE
		
			for(SubSector subsectorLocal:subsectorsLocal) {
				if(this.permiteMantenimiento(subsectorLocal) && subsectorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SubSectorConstantesFunciones.getSubSectorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SubSectorConstantesFunciones.IDSECTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelid_sectorSubSector,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubSectorConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelcodigoSubSector,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubSectorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelnombreSubSector,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubSectorConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabeldescripcionSubSector,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubSector.jLabelid_sectorSubSector,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubSector.jLabelcodigoSubSector,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubSector.jLabelnombreSubSector,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubSector.jLabeldescripcionSubSector,"");
		
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
		this.iIdNuevoSubSector--;	
		
		
		this.subsectorAux=new SubSector();
		
		this.subsectorAux.setId(this.iIdNuevoSubSector);
		this.subsectorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subsectorLogic.getSubSectors().add(this.subsectorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.subsectors.add(this.subsectorAux);
		}
		//ARCHITECTURE
		
		this.subsector=this.subsectorAux;
		
		if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSubSector(this.subsector);
			this.setVariablesObjetoActualToFormularioForeignKeySubSector(this.subsector);
		}
				
		//this.setDefaultControlesSubSector();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySubSector();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySubSector();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySubSector();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubSector(this.subsectorBean,this.subsector,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SubSectorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.subsectorSessionBean.getConGuardarRelaciones()) {
			classes=SubSectorConstantesFunciones.getClassesRelationshipsOfSubSector(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.subsectorReturnGeneral=subsectorLogic.procesarEventosSubSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subsectorLogic.getSubSectors(),this.subsector,this.subsectorParameterGeneral,this.isEsNuevoSubSector,classes);//this.subsectorLogic.getSubSector()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSubSector(this.subsectorReturnGeneral,this.subsectorBean,false);
		
		if(this.subsectorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySubSector(this.subsectorReturnGeneral.getSubSector());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSubSector(this.subsectorReturnGeneral.getSubSector());
		}
		
		if(this.subsectorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSubSector(this.subsectorReturnGeneral.getSubSector(),classes);//this.subsectorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSubSector(this.subsector,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySubSector();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySubSector();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubSectorBeanSwingJInternalFrameAdditional.RecargarFormSubSector(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSubSector(false);
						
			if(subsectorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubSector();
			}
			
			this.actualizarVisualTableDatosSubSector();
			
			this.jTableDatosSubSector.setRowSelectionInterval(this.getIndiceNuevoSubSector(), this.getIndiceNuevoSubSector());
			
			this.seleccionarFilaTablaSubSectorActual();
						
			this.actualizarEstadoCeldasBotonesSubSector("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSubSector(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setEnabled(isHabilitar && this.subsectorConstantesFunciones.activarcodigoSubSector);
		this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setEnabled(isHabilitar && this.subsectorConstantesFunciones.activarnombreSubSector);
		this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setEnabled(isHabilitar && this.subsectorConstantesFunciones.activardescripcionSubSector);	
		//
		this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setEnabled(isHabilitar && this.subsectorConstantesFunciones.activarid_empresaSubSector);
		this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setEnabled(isHabilitar && this.subsectorConstantesFunciones.activarid_sectorSubSector);
	};
	
	public void setDefaultControlesSubSector() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSubSector(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.subsectorSessionBean.setConGuardarRelaciones(true);			
			this.subsectorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.setVisible(true);
			
					
		} else {
			//this.subsectorSessionBean.setConGuardarRelaciones(false);			
			this.subsectorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSubSector() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
				if(subsectorAux.getId().equals(this.iIdNuevoSubSector)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubSector subsectorAux:this.subsectors) {
				if(subsectorAux.getId().equals(this.iIdNuevoSubSector)) {
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
	
	public int getIndiceActualSubSector(SubSector subsector,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
				if(subsectorAux.getId().equals(subsector.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubSector subsectorAux:this.subsectors) {
				if(subsectorAux.getId().equals(subsector.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSubSector(SubSector subsectorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
				if(subsectorAux.getSubSectorOriginal().getId().equals(subsectorOriginal.getId())) {
					existe=true;
					subsectorOriginal.setId(subsectorAux.getId());
					subsectorOriginal.setVersionRow(subsectorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubSector subsectorAux:this.subsectors) {
				if(subsectorAux.getSubSectorOriginal().getId().equals(subsectorOriginal.getId())) {
					existe=true;
					subsectorOriginal.setId(subsectorAux.getId());
					subsectorOriginal.setVersionRow(subsectorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSubSector(Boolean esParaCancelar) throws Exception {
		subsectorsAux=new ArrayList<SubSector>();
		subsectorAux=new SubSector();
		
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
					if(subsectorAux.getId()<0) {
						subsectorsAux.add(subsectorAux);
					}		
				}
				this.iIdNuevoSubSector=0L;
				this.subsectorLogic.getSubSectors().removeAll(subsectorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubSector subsectorAux:this.subsectors) {
					if(subsectorAux.getId()<0) {
						subsectorsAux.add(subsectorAux);
					}		
				}
				this.iIdNuevoSubSector=0L;
				this.subsectors.removeAll(subsectorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSubSector 
					&& this.subsectorLogic.getSubSectors().size()>0
					) {
					subsectorAux=this.subsectorLogic.getSubSectors().get(this.subsectorLogic.getSubSectors().size() - 1);
				
					if(subsectorAux.getId()<0) {
						this.subsectorLogic.getSubSectors().remove(subsectorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSubSector && this.subsectors.size()>0) {
					subsectorAux=this.subsectors.get(this.subsectors.size() - 1);
				
					if(subsectorAux.getId()<0) {
						this.subsectors.remove(subsectorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSubSector(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(subsector.getId()<0) {
				this.subsectorLogic.getSubSectors().remove(this.subsector);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(subsector.getId()<0) {
				this.subsectors.remove(this.subsector);
			}
		}			
	}
	
	public void setEstadosInicialesSubSector(List<SubSector> subsectorsAux) throws Exception {
		SubSectorConstantesFunciones.setEstadosInicialesSubSector(subsectorsAux);
	}
	
	public void setEstadosInicialesSubSector(SubSector subsectorAux) throws Exception {
		SubSectorConstantesFunciones.setEstadosInicialesSubSector(subsectorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSubSectorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSubSectorActual()) {
				if(!this.isEsNuevoSubSector) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSubSector=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSubSectorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sector ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SubSector subsector) throws Exception {
		SubSectorConstantesFunciones.seleccionarAsignar(this.subsector,subsector);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSubSector=this.isPermisoActualizarOriginalSubSector;
			
			
			this.seleccionarAsignar(subsector);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubSectorConstantesFunciones.quitarEspaciosSubSector(this.subsector,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSubSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.subsectorSessionBean.setsFuncionBusquedaRapida(this.subsectorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSubSector) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSubSector(esParaCancelar);				
				this.cancelarNuevoSubSector(esParaCancelar);								
			}
			
			this.subsector=new SubSector();
			
			this.inicializarSubSector();
			
			this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSubSector() throws Exception {
		try {
			SubSectorConstantesFunciones.inicializarSubSector(this.subsector);
			
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
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.subsectorLogic.getSubSectors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSubSectors(String sAccionBusqueda,List<SubSector> subsectorsParaReportes) throws Exception {
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
					sPathReporteFinal="SubSector"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SubSectorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SubSectorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SubSector"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sectores");		
		parameters.put("busquedapor", SubSectorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSubSector=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SubSectorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SubSectorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSubSector=new JRBeanArrayDataSource(SubSectorJInternalFrame.TraerSubSectorBeans(subsectorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSubSector);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SubSectorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SubSectorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SubSectorBean.TraerSubSectorBeans(subsectorsParaReportes).toArray()));
							
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
				this.generarExcelReporteSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSubSectorActionPerformed(null);
					//this.generarExcelReporteSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSubSectors(sAccionBusqueda,sTipoArchivoReporte,subsectorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSubSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<SubSector> subsectorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubSectors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubSector("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SubSector subsector : subsectorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SubSectorConstantesFunciones.generarExcelReporteDataSubSector("NORMAL",row,workbook,subsector,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSubSector(String sTipo,Row row,Workbook workbook) {
		
		SubSectorConstantesFunciones.generarExcelReporteHeaderSubSector(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSubSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<SubSector> subsectorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubSectors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SubSector subsector : subsectorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SubSectorConstantesFunciones.getSubSectorDescripcion(subsector));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubSectorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subsector.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubSectorConstantesFunciones.LABEL_IDSECTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDSECTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subsector.getsector_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubSectorConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubSectorConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subsector.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubSectorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubSectorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subsector.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubSectorConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubSectorConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subsector.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSubSectors(String sAccionBusqueda,String sTipoArchivoReporte,List<SubSector> subsectorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SubSector> subsectorsRespaldo=null;
		
		classes=SubSectorConstantesFunciones.getClassesRelationshipsOfSubSector(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.subsectorLogic.setDatosCliente(this.datosCliente);
		this.subsectorLogic.setDatosDeep(this.datosDeep);
		this.subsectorLogic.setIsConDeep(true);
		
		subsectorsRespaldo=this.subsectorLogic.getSubSectors();
		
		this.subsectorLogic.setSubSectors(subsectorsParaReportes);	
		this.subsectorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		subsectorsParaReportes=this.subsectorLogic.getSubSectors();
		this.subsectorLogic.setSubSectors(subsectorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubSectors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubSector("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SubSector subsector : subsectorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSubSector("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SubSectorConstantesFunciones.generarExcelReporteDataSubSector("NORMAL",row,workbook,subsector,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SubSectorConstantesFunciones.getSubSectorDescripcion(subsector));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubSector.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubSector.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSubSector() throws Exception {		
		this.startProcessSubSector(true);
	}
	
	public void startProcessSubSector(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSubSector ,this.jPanelParametrosReportesSubSector, this.jScrollPanelDatosSubSector,this.jPanelPaginacionSubSector, this.jScrollPanelDatosEdicionSubSector, this.jPanelAccionesSubSector,this.jPanelAccionesFormularioSubSector,this.jmenuBarSubSector,this.jmenuBarDetalleSubSector,this.jTtoolBarSubSector,this.jTtoolBarDetalleSubSector);		
		
		final JTabbedPane jTabbedPaneBusquedasSubSector=this.jTabbedPaneBusquedasSubSector; 
		
		final JPanel jPanelParametrosReportesSubSector=this.jPanelParametrosReportesSubSector;
		//final JScrollPane jScrollPanelDatosSubSector=this.jScrollPanelDatosSubSector;
		final JTable jTableDatosSubSector=this.jTableDatosSubSector;		
		final JPanel jPanelPaginacionSubSector=this.jPanelPaginacionSubSector;
		//final JScrollPane jScrollPanelDatosEdicionSubSector=this.jScrollPanelDatosEdicionSubSector;
		final JPanel jPanelAccionesSubSector=this.jPanelAccionesSubSector;
		
		JPanel jPanelCamposAuxiliarSubSector=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSubSector=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			jPanelCamposAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jPanelCamposSubSector;
			jPanelAccionesFormularioAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jPanelAccionesFormularioSubSector;
		}
		
		final JPanel jPanelCamposSubSector=jPanelCamposAuxiliarSubSector;
		final JPanel jPanelAccionesFormularioSubSector=jPanelAccionesFormularioAuxiliarSubSector;
		
		
		final JMenuBar jmenuBarSubSector=this.jmenuBarSubSector;
		final JToolBar jTtoolBarSubSector=this.jTtoolBarSubSector;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSubSector=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubSector=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			jmenuBarDetalleAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jmenuBarDetalleSubSector;
			jTtoolBarDetalleAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jTtoolBarDetalleSubSector;
		}
		
		final JMenuBar jmenuBarDetalleSubSector=jmenuBarDetalleAuxiliarSubSector;
		final JToolBar jTtoolBarDetalleSubSector=jTtoolBarDetalleAuxiliarSubSector;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubSector;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubSector;
			processRunnable.jTableDatos=jTableDatosSubSector;
			processRunnable.jPanelCampos=jPanelCamposSubSector;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubSector;
			processRunnable.jPanelAcciones=jPanelAccionesSubSector;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubSector;
			
			
			processRunnable.jmenuBar=jmenuBarSubSector;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubSector;
			processRunnable.jTtoolBar=jTtoolBarSubSector;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubSector;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubSector ,jPanelParametrosReportesSubSector,jTableDatosSubSector, /*jScrollPanelDatosSubSector,*/jPanelCamposSubSector,jPanelPaginacionSubSector, /*jScrollPanelDatosEdicionSubSector,*/ jPanelAccionesSubSector,jPanelAccionesFormularioSubSector,jmenuBarSubSector,jmenuBarDetalleSubSector,jTtoolBarSubSector,jTtoolBarDetalleSubSector);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubSector ,jPanelParametrosReportesSubSector, jScrollPanelDatosSubSector,jPanelPaginacionSubSector, jScrollPanelDatosEdicionSubSector, jPanelAccionesSubSector,jPanelAccionesFormularioSubSector,jmenuBarSubSector,jmenuBarDetalleSubSector,jTtoolBarSubSector,jTtoolBarDetalleSubSector);
						
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
	
	public void finishProcessSubSector() {// throws Exception 
		this.finishProcessSubSector(true);
	}
	
	public void finishProcessSubSector(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSubSector ,this.jPanelParametrosReportesSubSector, this.jScrollPanelDatosSubSector,this.jPanelPaginacionSubSector, this.jScrollPanelDatosEdicionSubSector, this.jPanelAccionesSubSector,this.jPanelAccionesFormularioSubSector,this.jmenuBarSubSector,this.jmenuBarDetalleSubSector,this.jTtoolBarSubSector,this.jTtoolBarDetalleSubSector);		
		
		final JTabbedPane jTabbedPaneBusquedasSubSector=this.jTabbedPaneBusquedasSubSector; 
		
		final JPanel jPanelParametrosReportesSubSector=this.jPanelParametrosReportesSubSector;
		//final JScrollPane jScrollPanelDatosSubSector=this.jScrollPanelDatosSubSector;
		final JTable jTableDatosSubSector=this.jTableDatosSubSector;		
		final JPanel jPanelPaginacionSubSector=this.jPanelPaginacionSubSector;
		//final JScrollPane jScrollPanelDatosEdicionSubSector=this.jScrollPanelDatosEdicionSubSector;
		final JPanel jPanelAccionesSubSector=this.jPanelAccionesSubSector;
		
		JPanel jPanelCamposAuxiliarSubSector=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSubSector=new JPanel();
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			jPanelCamposAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jPanelCamposSubSector;
			jPanelAccionesFormularioAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jPanelAccionesFormularioSubSector;
		}
		
		final JPanel jPanelCamposSubSector=jPanelCamposAuxiliarSubSector;
		final JPanel jPanelAccionesFormularioSubSector=jPanelAccionesFormularioAuxiliarSubSector;
		
		
		final JMenuBar jmenuBarSubSector=this.jmenuBarSubSector;		
		final JToolBar jTtoolBarSubSector=this.jTtoolBarSubSector;
				
		JMenuBar jmenuBarDetalleAuxiliarSubSector=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubSector=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			jmenuBarDetalleAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jmenuBarDetalleSubSector;
			jTtoolBarDetalleAuxiliarSubSector=this.jInternalFrameDetalleFormSubSector.jTtoolBarDetalleSubSector;		
		}
		
		final JMenuBar jmenuBarDetalleSubSector=jmenuBarDetalleAuxiliarSubSector;
		final JToolBar jTtoolBarDetalleSubSector=jTtoolBarDetalleAuxiliarSubSector;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubSector;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubSector;
			processRunnable.jTableDatos=jTableDatosSubSector;
			processRunnable.jPanelCampos=jPanelCamposSubSector;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubSector;
			processRunnable.jPanelAcciones=jPanelAccionesSubSector;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubSector;
			
			
			processRunnable.jmenuBar=jmenuBarSubSector;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubSector;
			processRunnable.jTtoolBar=jTtoolBarSubSector;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubSector;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSubSector ,jPanelParametrosReportesSubSector, jTableDatosSubSector,/*jScrollPanelDatosSubSector,*/jPanelCamposSubSector,jPanelPaginacionSubSector, /*jScrollPanelDatosEdicionSubSector,*/ jPanelAccionesSubSector,jPanelAccionesFormularioSubSector,jmenuBarSubSector,jmenuBarDetalleSubSector,jTtoolBarSubSector,jTtoolBarDetalleSubSector));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSubSector(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSubSector(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSubSector(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSubSector(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSubSector,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSubSector,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSubSector(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSubSector,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSubSector,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.subsectorConstantesFunciones.getsFinalQuerySubSector();
		String  finalQueryPaginacionTodos=this.subsectorConstantesFunciones.getsFinalQuerySubSector();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SubSectorConstantesFunciones.getArrayColumnasGlobalesNoSubSector(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SubSectorConstantesFunciones.getArrayColumnasGlobalesSubSector(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SubSectorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.subsectorsEliminados= new ArrayList<SubSector>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSubSector();
		
				///*SubSectorSessionBean*/this.subsectorSessionBean=new SubSectorSessionBean();
			
			if(this.subsectorSessionBean==null) {
				this.subsectorSessionBean=new SubSectorSessionBean();
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
					this.iNumeroPaginacion=SubSectorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SubSectorConstantesFunciones.getClassesForeignKeysOfSubSector(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/subsector."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			subsectorsAux= new ArrayList<SubSector>();
			
				
			subsectorLogic.setDatosCliente(this.datosCliente);
			subsectorLogic.setDatosDeep(this.datosDeep);
			subsectorLogic.setIsConDeep(true);
			
			
			subsectorLogic.getSubSectorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					subsectorLogic.getTodosSubSectors(finalQueryGlobal,pagination);
					
					//subsectorLogic.getTodosSubSectorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(subsectorLogic.getSubSectors()==null|| subsectorLogic.getSubSectors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subsectorsAux= new ArrayList<SubSector>();
							subsectorsAux.addAll(subsectorLogic.getSubSectors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectorsAux= new ArrayList<SubSector>();
							subsectorsAux.addAll(subsectors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subsectorLogic.getTodosSubSectors(finalQueryGlobal+"",this.pagination);												
							
							//subsectorLogic.getTodosSubSectorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSubSectors("Todos",subsectorLogic.getSubSectors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subsectorLogic.setSubSectors(new ArrayList<SubSector>());					
							subsectorLogic.getSubSectors().addAll(subsectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectors=new ArrayList<SubSector>();
							subsectors.addAll(subsectorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSubSector=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSubSector=this.idActual;
				
				} else if(this.idSubSectorActual!=null && this.idSubSectorActual!=0L) {
					idSubSector=idSubSectorActual;
				}
				
					
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndicePorId(idSubSector);
				
				this.subsectors=new ArrayList<SubSector>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					subsectorLogic.getEntity(idSubSector);
					
					//subsectorLogic.getEntityWithConnection(idSubSector);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subsectorLogic.setSubSectors(new ArrayList<SubSector>());
					subsectorLogic.getSubSectors().add(subsectorLogic.getSubSector());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subsectors=new ArrayList<SubSector>();
					this.subsectors.add(subsector);
				}
				
				if(subsectorLogic.getSubSector()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subsectorLogic.getSubSectorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subsectorLogic.getSubSectors()==null||subsectorLogic.getSubSectors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subsectors==null|| subsectors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorsAux=new ArrayList<SubSector>();
						subsectorsAux.addAll(subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectorsAux=new ArrayList<SubSector>();
							subsectorsAux.addAll(subsectors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subsectorLogic.getSubSectorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubSectors("FK_IdEmpresa",subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubSectors("FK_IdEmpresa",subsectors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorLogic.setSubSectors(new ArrayList<SubSector>());
						subsectorLogic.getSubSectors().addAll(subsectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectors=new ArrayList<SubSector>();
							subsectors.addAll(subsectorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSector")) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdSector(id_sectorFK_IdSector);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subsectorLogic.getSubSectorsFK_IdSector(finalQueryGlobal,pagination,id_sectorFK_IdSector);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdSector(id_sectorFK_IdSector);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdSector(id_sectorFK_IdSector);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subsectorLogic.getSubSectors()==null||subsectorLogic.getSubSectors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subsectors==null|| subsectors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorsAux=new ArrayList<SubSector>();
						subsectorsAux.addAll(subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectorsAux=new ArrayList<SubSector>();
							subsectorsAux.addAll(subsectors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subsectorLogic.getSubSectorsFK_IdSector(finalQueryGlobal,pagination,id_sectorFK_IdSector);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdSector(id_sectorFK_IdSector);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubSectorConstantesFunciones.getDetalleIndiceFK_IdSector(id_sectorFK_IdSector);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubSectors("FK_IdSector",subsectorLogic.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubSectors("FK_IdSector",subsectors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorLogic.setSubSectors(new ArrayList<SubSector>());
						subsectorLogic.getSubSectors().addAll(subsectorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectors=new ArrayList<SubSector>();
							subsectors.addAll(subsectorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSubSector();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSubSector();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subsectorLogic.getSubSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subsectors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subsectorLogic.getSubSectors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subsectors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SubSector subsector) {
		Boolean permite=true;
		
		if(this.subsector.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SubSectorConstantesFunciones.getOrderByListaSubSector();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SubSectorConstantesFunciones.getOrderByListaSubSector();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubSector subsector:subsectorLogic.getSubSectors()) {
				if(subsector.getsType().equals(Constantes2.S_TOTALES)) {
					subsectorTotales=subsector;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubSector subsector:this.subsectors) {
				if(subsector.getsType().equals(Constantes2.S_TOTALES)) {
					subsectorTotales=subsector;
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
			this.subsectorAux=new SubSector();
			this.subsectorAux.setsType(Constantes2.S_TOTALES);
			this.subsectorAux.setIsNew(false);
			this.subsectorAux.setIsChanged(false);
			this.subsectorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SubSectorConstantesFunciones.TotalizarValoresFilaSubSector(this.subsectorLogic.getSubSectors(),this.subsectorAux);
				
				this.subsectorLogic.getSubSectors().add(this.subsectorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SubSectorConstantesFunciones.TotalizarValoresFilaSubSector(this.subsectors,this.subsectorAux);
				
				this.subsectors.add(this.subsectorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		subsectorTotales=new SubSector();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subsectorLogic.getSubSectors().remove(subsectorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subsectors.remove(subsectorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		subsectorTotales=new SubSector();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubSector subsector:subsectorLogic.getSubSectors()) {
				if(subsector.getsType().equals(Constantes2.S_TOTALES)) {
					subsectorTotales=subsector;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubSectorConstantesFunciones.TotalizarValoresFilaSubSector(this.subsectorLogic.getSubSectors(),subsectorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubSector subsector:this.subsectors) {
				if(subsector.getsType().equals(Constantes2.S_TOTALES)) {
					subsectorTotales=subsector;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubSectorConstantesFunciones.TotalizarValoresFilaSubSector(this.subsectors,subsectorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSubSectorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubSectorsFK_IdSector()throws Exception {
		try {
			sAccionBusqueda="FK_IdSector";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSubSectorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subsectorLogic.getSubSectorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubSectorsFK_IdSector(String sFinalQuery,Long id_sector)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subsectorLogic.getSubSectorsFK_IdSector(sFinalQuery,this.pagination,id_sector);
				
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
	
	public void inicializarPermisosSubSector() {
		this.isPermisoTodoSubSector=false;
		this.isPermisoNuevoSubSector=false;
		this.isPermisoActualizarSubSector=false;
		this.isPermisoActualizarOriginalSubSector=false;
		this.isPermisoEliminarSubSector=false;
		this.isPermisoGuardarCambiosSubSector=false;
		this.isPermisoConsultaSubSector=false;
		this.isPermisoBusquedaSubSector=false;
		this.isPermisoReporteSubSector=false;		
		this.isPermisoOrdenSubSector=false;		
		this.isPermisoPaginacionMedioSubSector=false;		
		this.isPermisoPaginacionAltoSubSector=false;
		this.isPermisoPaginacionTodoSubSector=false;
		this.isPermisoCopiarSubSector=false;		
		this.isPermisoVerFormSubSector=false;		
		this.isPermisoDuplicarSubSector=false;		
		this.isPermisoOrdenSubSector=false;		
	}
	
	public void setPermisosUsuarioSubSector(Boolean isPermiso) {
		this.isPermisoTodoSubSector=isPermiso;
		this.isPermisoNuevoSubSector=isPermiso;
		this.isPermisoActualizarSubSector=isPermiso;
		this.isPermisoActualizarOriginalSubSector=isPermiso;
		this.isPermisoEliminarSubSector=isPermiso;
		this.isPermisoGuardarCambiosSubSector=isPermiso;
		this.isPermisoConsultaSubSector=isPermiso;
		this.isPermisoBusquedaSubSector=isPermiso;
		this.isPermisoReporteSubSector=isPermiso;
		this.isPermisoOrdenSubSector=isPermiso;		
		this.isPermisoPaginacionMedioSubSector=isPermiso;		
		this.isPermisoPaginacionAltoSubSector=isPermiso;		
		this.isPermisoPaginacionTodoSubSector=isPermiso;		
		this.isPermisoCopiarSubSector=isPermiso;		
		this.isPermisoVerFormSubSector=isPermiso;		
		this.isPermisoDuplicarSubSector=isPermiso;
		this.isPermisoOrdenSubSector=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSubSector(Boolean isPermiso) {
		//this.isPermisoTodoSubSector=isPermiso;
		this.isPermisoNuevoSubSector=isPermiso;
		this.isPermisoActualizarSubSector=isPermiso;
		this.isPermisoActualizarOriginalSubSector=isPermiso;
		this.isPermisoEliminarSubSector=isPermiso;
		this.isPermisoGuardarCambiosSubSector=isPermiso;
		//this.isPermisoConsultaSubSector=isPermiso;
		//this.isPermisoBusquedaSubSector=isPermiso;
		//this.isPermisoReporteSubSector=isPermiso;
		//this.isPermisoOrdenSubSector=isPermiso;		
		//this.isPermisoPaginacionMedioSubSector=isPermiso;		
		//this.isPermisoPaginacionAltoSubSector=isPermiso;		
		//this.isPermisoPaginacionTodoSubSector=isPermiso;		
		//this.isPermisoCopiarSubSector=isPermiso;		
		//this.isPermisoDuplicarSubSector=isPermiso;
		//this.isPermisoOrdenSubSector=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSubSectorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SubSectorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSubSector(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSubSectorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSubSectorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSubSectorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSubSectorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSubSector() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SubSectorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SubSectorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSubSector=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSubSector=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSubSector=this.isPermisoActualizarSubSector;
			this.isPermisoEliminarSubSector=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSubSector=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSubSector=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSubSector=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSubSector=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSubSector=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubSector=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSubSector=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSubSector=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSubSector=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSubSector=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSubSector=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSubSector=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubSector=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSubSector.setToolTipText(this.jTableDatosSubSector.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSubSector(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSubSector(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SubSectorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SubSectorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSubSector() throws Exception {
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
	public void inicializarCombosForeignKeySubSectorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sectorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySubSectorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SubSectorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySubSectorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySectorListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySectorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sectorsForeignKey==null||this.sectorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SectorConstantesFunciones.SFINALQUERY;

				this.cargarCombosSectorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySubSectorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SubSectorParameterReturnGeneral subsectorReturnGeneral=new SubSectorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.subsectorConstantesFunciones.cargarid_empresaSubSector)
					 || (this.esRecargarFks && this.subsectorConstantesFunciones.cargarid_empresaSubSector)) {

					if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+subsectorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSector="";

				if(((this.sectorsForeignKey==null||this.sectorsForeignKey.size()<=0) && this.subsectorConstantesFunciones.cargarid_sectorSubSector)
					 || (this.esRecargarFks && this.subsectorConstantesFunciones.cargarid_sectorSubSector)) {

					if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionSector()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SectorConstantesFunciones.getArrayColumnasGlobalesSector(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSector=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SectorConstantesFunciones.TABLENAME);

						finalQueryGlobalSector=Funciones.GetFinalQueryAppend(finalQueryGlobalSector, "");
						finalQueryGlobalSector+=SectorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSectorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSector=" WHERE " + ConstantesSql.ID + "="+subsectorSessionBean.getlidSectorActual();
					}
				} else {
					finalQueryGlobalSector="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				subsectorReturnGeneral=subsectorLogic.cargarCombosLoteForeignKeySubSector(finalQueryGlobalEmpresa,finalQueryGlobalSector);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=subsectorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSector.equals("NONE")) {
				this.sectorsForeignKey=subsectorReturnGeneral.getsectorsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySubSector()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySector();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.subsectorSessionBean==null) {
				this.subsectorSessionBean=new SubSectorSessionBean();
			}

			if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySector()throws Exception {
		try {

			if(!this.subsectorSessionBean.getisBusquedaDesdeForeignKeySesionSector()) {
				Sector sector=new Sector();
				SectorConstantesFunciones.setSectorDescripcion(sector,Constantes.SMENSAJE_ESCOJA_OPCION);
				sector.setId(null);

				if(!SectorConstantesFunciones.ExisteEnLista(this.sectorsForeignKey,sector,true)) {

					this.sectorsForeignKey.add(0,sector);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySubSector()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySubSector(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySubSector()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySubSector();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySubSector(SubSector subsector)throws Exception {	
		try {
			
			this.setActualSectorForeignKey(subsector.getid_sector(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySubSector(SubSector subsector,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySubSector()throws Exception {	
		try {
			
			this.setActualSectorForeignKey(this.subsectorConstantesFunciones.getid_sector(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySubSector()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySubSector()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySubSector()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSubSector()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySubSector()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSectorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySubSector(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSectorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySubSector()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector!=null && this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector!=null && this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SubSectorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SubSectorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SubSectorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.subsectorSessionBean=new SubSectorSessionBean(); 
		this.subsectorConstantesFunciones=new SubSectorConstantesFunciones(); 
		this.subsectorBean=new SubSector();//(this.subsectorConstantesFunciones); 		
		this.subsectorReturnGeneral=new SubSectorParameterReturnGeneral(); 
		
		this.subsectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subsectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SubSectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SubSectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SubSectorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSubSector(true);
			
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
			
			this.subsectorConstantesFunciones=new SubSectorConstantesFunciones(); 
			this.subsectorBean=new SubSector();//this.subsectorConstantesFunciones); 			
			this.subsectorReturnGeneral=new SubSectorParameterReturnGeneral(); 
		
			SubSectorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sector Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.subsector=new SubSector();
			this.subsectors = new ArrayList<SubSector>();
			this.subsectorsAux = new ArrayList<SubSector>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic=new SubSectorLogic();
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			//this.subsectorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.subsectorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSubSector);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSubSector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubSector);	
					}
					
					if(this.jInternalFrameImportacionSubSector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubSector);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySubSector!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySubSector);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSubSector!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSubSector);
				this.jInternalFrameDetalleFormSubSector.setVisible(false);
				this.jInternalFrameDetalleFormSubSector.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSubSector!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubSector);
					this.jInternalFrameReporteDinamicoSubSector.setVisible(false);
					this.jInternalFrameReporteDinamicoSubSector.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSubSector!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSubSector);
					this.jInternalFrameImportacionSubSector.setVisible(false);
					this.jInternalFrameImportacionSubSector.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySubSector!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySubSector);
					this.jInternalFrameOrderBySubSector.setVisible(false);
					this.jInternalFrameOrderBySubSector.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSubSectorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SubSectorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.subsectorReturnGeneral=new SubSectorParameterReturnGeneral();
			
			this.subsectorParameterGeneral=new SubSectorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.subsectorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SubSectorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubSectorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subsectorSessionBean.getEsGuardarRelacionado(),this.subsectorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubSectorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subsectorSessionBean.getEsGuardarRelacionado(),this.subsectorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaDuplicarSubSector=true;
			this.isVisibilidadCeldaCopiarSubSector=true;
			this.isVisibilidadCeldaVerFormSubSector=true;
			this.isVisibilidadCeldaOrdenSubSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=false;
			this.isVisibilidadCeldaGuardarSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSector=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSubSector();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSubSector(false);
			
			this.setPermisosUsuarioSubSector();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subsectorSessionBean.getEsGuardarRelacionado() 
				|| (this.subsectorSessionBean.getEsGuardarRelacionado() && this.subsectorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSubSectorClasesRelacionadas();
			}
			
			if(this.subsectorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSubSectorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SubSectorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSubSector();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSubSector();
			}
			
			if(!this.isPermisoBusquedaSubSector) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSubSector.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSubSector,this.isPermisoPaginacionMedioSubSector,this.isPermisoPaginacionTodoSubSector);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SubSectorConstantesFunciones.getTiposSeleccionarSubSector());
				
				this.tiposColumnasSelect=SubSectorConstantesFunciones.getTiposSeleccionarSubSector(true);
				
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
			//if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSubSector();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSubSector(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSubSector(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSubSector() ;
			
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
			this.sectorLogic=new SectorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				subsectorImplementable= (SubSectorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubSectorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				subsectorImplementableHome= (SubSectorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubSectorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.subsectors= new ArrayList<SubSector>();
			this.subsectorsEliminados= new ArrayList<SubSector>();
						
			this.isEsNuevoSubSector=false;
			this.esParaAccionDesdeFormularioSubSector=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sectorsForeignKey=new ArrayList<Sector>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySubSector(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSubSector();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SubSectorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SubSectorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSubSector("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSubSector(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSubSector!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSubSector();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSubSector();
			}
			
			SubSectorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSubSector.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSubSector.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSubSector.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSubSector(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SubSector: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSubSector() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSubSector")) {
				iIndex=this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSubSector.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSubSector();	
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
	
	public void cargarCombosForeignKeySubSector(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySubSector(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySubSector(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySubSectorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySubSector();
		
		this.cargarCombosFrameForeignKeySubSector();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySubSector();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySubSector();
		}
	}
	
	

	public void cargarCombosForeignKeySector(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySectorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySector();
				this.cargarCombosFrameSectorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSector(this.sectorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSubSectorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.subsectorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			
			if(jTableDatosSubSector.getRowCount()>=1) {
				jTableDatosSubSector.removeRowSelectionInterval(0, jTableDatosSubSector.getRowCount()-1);						
			}
			
			this.isEsNuevoSubSector=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSubSector(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSubSector(true);			
			//this.subsector=new SubSector();
			//this.subsector.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubSector(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubSector() ;
			
			if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubSector(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.subsector);	
			this.actualizarInformacion("INFO_PADRE",false,this.subsector);				
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			if(this.subsectorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SubSector: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSubSectorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSubSector.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSubSector.getSelectedRows().length;			
			}
			
			subsectorsSeleccionados=this.getSubSectorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSubSector--;			
				//SubSector subsectorAux= new SubSector();			
				//subsectorAux.setId(this.iIdNuevoSubSector);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SubSector subsectorOrigen=new SubSector();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SubSector subsectorOrigen : subsectorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							subsectorOrigen =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subsectorOrigen =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSubSector();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.subsector.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSubSector(subsectorOrigen,this.subsector,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subsectorLogic.getSubSectors().add(this.subsectorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subsectors.add(this.subsectorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSubSector(false);
				
				this.jTableDatosSubSector.setRowSelectionInterval(this.getIndiceNuevoSubSector(), this.getIndiceNuevoSubSector());
				
				int iLastRow =  this.jTableDatosSubSector.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubSector.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubSector.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubSector(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();									
		
			SubSector subsectorOrigen=new SubSector();
			SubSector subsectorDestino=new SubSector();
				
			subsectorsSeleccionados=this.getSubSectorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSubSector.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || subsectorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSubSector.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorOrigen =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subsectorOrigen =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subsectorDestino =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subsectorDestino =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				subsectorOrigen =subsectorsSeleccionados.get(0);
				subsectorDestino =subsectorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSubSector(subsectorOrigen,subsectorDestino,true,false);
				
				subsectorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subsectorDestino,subsectorLogic.getSubSectors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subsectorDestino,subsectors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSubSector(false);
				
				//this.jTableDatosSubSector.setRowSelectionInterval(this.getIndiceNuevoSubSector(), this.getIndiceNuevoSubSector());
				
				int iLastRow =  this.jTableDatosSubSector.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubSector.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubSector.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubSector(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSubSector.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSubSector.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSubSector.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSubSector.setVisible(!isVisible);
			this.jPanelPaginacionSubSector.setVisible(!isVisible);
			this.jPanelAccionesSubSector.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSubSector();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSubSector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSubSector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySubSector();
			
			this.abrirFrameOrderBySubSector();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySubSector();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSubSector(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubSector);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSubSector.isMaximum()) {
					this.jInternalFrameDetalleFormSubSector.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSubSector.setSize(this.jInternalFrameDetalleFormSubSector.iWidthFormulario,this.jInternalFrameDetalleFormSubSector.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSubSector.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSubSector.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSubSector.isMaximum()) {
						this.jInternalFrameDetalleFormSubSector.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSubSector.jContentPaneDetalleSubSector.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSubSector.jContentPaneDetalleSubSector.getWidth(),SubSectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSubSector.jContentPaneDetalleSubSector.getWidth(),SubSectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSubSector.jContentPaneDetalleSubSector.getWidth(),SubSectorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSubSector.setVisible(true);
	        this.jInternalFrameDetalleFormSubSector.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySubSector() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySubSector==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySubSector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubSector,false,this);
				} else {
					this.jInternalFrameOrderBySubSector=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubSector,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySubSector);
				this.jInternalFrameOrderBySubSector.setVisible(false);
				this.jInternalFrameOrderBySubSector.setSelected(false);
				
				this.jInternalFrameOrderBySubSector.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubSector"));
				
				this.inicializarActualizarBindingTablaOrderBySubSector();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSubSector() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSubSector==null) {
				
				this.jInternalFrameImportacionSubSector=new ImportacionJInternalFrame(SubSectorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubSector);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSubSector);
				this.jInternalFrameImportacionSubSector.setVisible(false);
				this.jInternalFrameImportacionSubSector.setSelected(false);


				this.jInternalFrameImportacionSubSector.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubSector"));
				this.jInternalFrameImportacionSubSector.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubSector"));
				this.jInternalFrameImportacionSubSector.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubSector"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSubSector() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSubSector==null) {
				this.jInternalFrameReporteDinamicoSubSector=new ReporteDinamicoJInternalFrame(SubSectorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubSector);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubSector);
				this.jInternalFrameReporteDinamicoSubSector.setVisible(false);
				this.jInternalFrameReporteDinamicoSubSector.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSubSector.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubSector"));
				this.jInternalFrameReporteDinamicoSubSector.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubSector"));
				this.jInternalFrameReporteDinamicoSubSector.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubSector"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubSector();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSubSector() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubSector);
			
	       	this.jInternalFrameDetalleFormSubSector.setVisible(false);
	        this.jInternalFrameDetalleFormSubSector.setSelected(false);
			
			//this.jInternalFrameDetalleFormSubSector.dispose();
			//this.jInternalFrameDetalleFormSubSector=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSubSector() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSubSector.setVisible(true);
	        this.jInternalFrameReporteDinamicoSubSector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSubSector() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSubSector.setVisible(true);
	        this.jInternalFrameImportacionSubSector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySubSector() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySubSector.setVisible(true);
	        this.jInternalFrameOrderBySubSector.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySubSector() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySubSector.setVisible(false);
	        this.jInternalFrameOrderBySubSector.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSubSector() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSubSector.setVisible(false);
	        this.jInternalFrameReporteDinamicoSubSector.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSubSector() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSubSector.setVisible(false);
	        this.jInternalFrameImportacionSubSector.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSubSector(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSubSector(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSubSector(true);
			//this.isEsNuevoSubSector=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSubSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubSector(false) ;
			
			if(subsectorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubSector(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubSector(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSubSectorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSubSector(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSubSector(true);
			//this.isEsNuevoSubSector=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.subsector.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSubSector("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSubSector(false) ;
			
			if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubSector(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubSector(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaSector(List<Sector> sectorsForeignKey)throws Exception{
		TableColumn tableColumnSector=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_IDSECTOR));
		TableCellEditor tableCellEditorSector =tableColumnSector.getCellEditor();

		SectorTableCell sectorTableCellFk=(SectorTableCell)tableCellEditorSector;

		if(sectorTableCellFk!=null) {
			sectorTableCellFk.setsectorsForeignKey(sectorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSubSector.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sectorTableCellFk.setRowActual(intSelectedRow);
			//sectorTableCellFk.setsectorsForeignKeyActual(sectorsForeignKey);
		//}


		if(sectorTableCellFk!=null) {
			sectorTableCellFk.RecargarSectorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSubSector(false);
			
			//if(!this.isEsNuevoSubSector) {								
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				
			}
			
			if(this.permiteMantenimiento(this.subsector)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.subsectorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSubSector=true;
					this.inicializarActualizarBindingTablaSubSector(false);
					this.isEsNuevoSubSector=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSubSector=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSubSector=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubSector(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubSector(false);
				
				this.habilitarDeshabilitarControlesSubSector(false);
			
												
				
				if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSubSector();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSubSectorActionPerformed(evt,subsectorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSubSector(this.subsector,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSubSector.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,subsectorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.subsector.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSubSectorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				this.subsector.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				this.subsector.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.subsector)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.subsectorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SubSectorModel) this.jTableDatosSubSector.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSubSector=true;
				this.inicializarActualizarBindingTablaSubSector(false);
				this.isEsNuevoSubSector=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubSector(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubSector(false);
				
				this.habilitarDeshabilitarControlesSubSector(false);
				
				
				
				if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSubSector();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSubSectorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSubSector.getRowCount()>=1) {
				jTableDatosSubSector.removeRowSelectionInterval(0, jTableDatosSubSector.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSubSector(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSubSector(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubSector(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubSector(false) ;
			
			this.isEsNuevoSubSector=false;
			
			if(SubSectorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSubSector();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSubSector(false);
				
				//SI ES MANUAL
				if(SubSectorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSubSector();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSubSector--;			
			//SubSector subsectorAux= new SubSector();			
			//subsectorAux.setId(this.iIdNuevoSubSector);
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSubSector();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
			
			this.subsector.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.subsectorLogic.getSubSectors().add(this.subsectorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.subsectors.add(this.subsectorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSubSector(false);
			
			this.jTableDatosSubSector.setRowSelectionInterval(this.getIndiceNuevoSubSector(), this.getIndiceNuevoSubSector());
			
			int iLastRow =  this.jTableDatosSubSector.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSubSector.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSubSector.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSubSector(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSubSector(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubSector(false);
			
			//SI ES MANUAL
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubSector();
			}
			
			//this.abrirFrameTreeSubSector();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSubSectorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SectorES ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSubSector.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSubSector();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.subsectorReturnGeneral=subsectorLogic.procesarImportacionSubSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.subsectorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSubSectorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSubSectorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSubSector.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSubSector.setFileImportacion(this.jInternalFrameImportacionSubSector.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSubSector.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSubSector.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSubSector.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSubSector.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		

		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SubSectorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SubSectorBaseDesign.jrxml";
			
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
			
			this.generarReporteSubSectors("Todos",subsectorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubSectorConstantesFunciones.LABEL_IDSECTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sector_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sector_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sector_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sector_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubSectorConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubSectorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubSectorConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSubSector.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SubSectorConstantesFunciones.LABEL_IDSECTOR:
					sNombreCampoCategoria="id_sector";
					break;

				case SubSectorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SubSectorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case SubSectorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SubSectorConstantesFunciones.LABEL_IDSECTOR:
					sNombreCampoCategoriaValor="id_sector";
					break;

				case SubSectorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SubSectorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case SubSectorConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSubSector.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubSector.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubSectorConstantesFunciones.LABEL_IDSECTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sector",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sector");
					break;

				case SubSectorConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SubSectorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case SubSectorConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoSubSectorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SubSectors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SubSectorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SubSector subsector:subsectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subsector.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubSectorConstantesFunciones.LABEL_IDSECTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDSECTOR);
					iRow++;

					for(SubSector subsector:subsectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subsector.getsector_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubSectorConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubSectorConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(SubSector subsector:subsectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subsector.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubSectorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubSectorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SubSector subsector:subsectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subsector.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubSectorConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubSectorConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(SubSector subsector:subsectorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subsector.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSubSector(row);				
			//	iRow++;
			//}				
			
			//for(SubSector subsectorAux:subsectorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSubSector(subsectorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
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
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubSector(false);
			
			//SI ES MANUAL
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubSector();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubSector(false);
			
			//SI ES MANUAL
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubSector();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSubSectorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubSector(false);
			
			//SI ES MANUAL
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubSector();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSubSector() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSubSector.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSubSector.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSubSector.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSubSector.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSubSector.setMinimumSize(dimensionMinimum);
		this.jTableDatosSubSector.setMaximumSize(dimensionMaximum);
		this.jTableDatosSubSector.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSubSector(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSubSector(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSubSector(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSubSector(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSubSector(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSubSector(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubSector(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSubSector(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SubSectorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSubSector() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSubSector();
		
		this.inicializarActualizarBindingBotonesManualSubSector(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSubSector();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubSector() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSubSector(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSubSector(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSubSector.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSubSector.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSubSector.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSubSector!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionNuevoSubSector.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionSinCerrarSubSector.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionSinMensajeSubSector.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSubSector.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSubSector.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSubSector.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSubSector!=null) {
				this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionNuevoSubSector.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionSinCerrarSubSector.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSubSector.jCheckBoxPostAccionSinMensajeSubSector.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSubSector.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSubSector.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSubSector.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSubSector!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSubSector.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSubSector.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSubSector.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSubSector.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSubSector!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSubSector.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSubSector.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSubSector(Boolean esInicializar) throws Exception {
		try	{	
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSubSector(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSubSector() throws Exception {
		try	{
			if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSubSector();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubSector() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSubSector() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSubSector.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSubSector.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSubSector.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSubSector.addItem(reporte);
			}
			
			
			if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSubSector.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSubSector.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSubSector.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSubSector.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSubSector.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSubSector.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSubSector.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubSector();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubSector() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubSector!=null) {
				this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubSector!=null) {
				this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubSector.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSubSector!=null) {
				
				if(this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubSector.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSubSector.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubSector.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubSector.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSubSector()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_sectorFK_IdSectorSubSector.getSelectedItem()!=null){this.id_sectorFK_IdSector=((Sector)this.jComboBoxid_sectorFK_IdSectorSubSector.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSubSector(Boolean esInicializar) throws Exception {				
		if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSubSector();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSubSector() throws Exception {
		this.inicializarActualizarBindingTablaSubSector(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySubSector() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSubSectorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSectorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSubSector(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=subsectorLogic.getSubSectors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=subsectors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSubSector.setModel(new SubSectorModel(this.subsectorLogic.getSubSectors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSubSector.setModel(new SubSectorModel(this.subsectors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySubSector!=null && this.jInternalFrameOrderBySubSector.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySubSector();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SubSectorConstantesFunciones.SCLASSWEBTITULO,subsectorConstantesFunciones.resaltarSeleccionarSubSector,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SubSectorConstantesFunciones.SCLASSWEBTITULO,subsectorConstantesFunciones.resaltarSeleccionarSubSector,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_ID));

		if(this.subsectorConstantesFunciones.mostraridSubSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubSectorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subsectorConstantesFunciones.resaltaridSubSector,this.subsectorConstantesFunciones.activaridSubSector,this,true,"idSubSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subsectorConstantesFunciones.resaltaridSubSector,this.subsectorConstantesFunciones.activaridSubSector,this,true,"idSubSector","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_IDSECTOR));

		if(this.subsectorConstantesFunciones.mostrarid_sectorSubSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubSectorConstantesFunciones.LABEL_IDSECTOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SectorTableCell(this.sectorsForeignKey,this.subsectorConstantesFunciones.resaltarid_sectorSubSector,this,this.subsectorConstantesFunciones.activarid_sectorSubSector));
			tableColumn.setCellEditor(new SectorTableCell(this.sectorsForeignKey,this.subsectorConstantesFunciones.resaltarid_sectorSubSector,this,this.subsectorConstantesFunciones.activarid_sectorSubSector,true,"id_sectorSubSector","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_CODIGO));

		if(this.subsectorConstantesFunciones.mostrarcodigoSubSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubSectorConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subsectorConstantesFunciones.resaltarcodigoSubSector,this.subsectorConstantesFunciones.activarcodigoSubSector,this,true,"codigoSubSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subsectorConstantesFunciones.resaltarcodigoSubSector,this.subsectorConstantesFunciones.activarcodigoSubSector,this,true,"codigoSubSector","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_NOMBRE));

		if(this.subsectorConstantesFunciones.mostrarnombreSubSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubSectorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subsectorConstantesFunciones.resaltarnombreSubSector,this.subsectorConstantesFunciones.activarnombreSubSector,this,true,"nombreSubSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subsectorConstantesFunciones.resaltarnombreSubSector,this.subsectorConstantesFunciones.activarnombreSubSector,this,true,"nombreSubSector","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubSector,SubSectorConstantesFunciones.LABEL_DESCRIPCION));

		if(this.subsectorConstantesFunciones.mostrardescripcionSubSector && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubSectorConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subsectorConstantesFunciones.resaltardescripcionSubSector,this.subsectorConstantesFunciones.activardescripcionSubSector,this,true,"descripcionSubSector","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subsectorConstantesFunciones.resaltardescripcionSubSector,this.subsectorConstantesFunciones.activardescripcionSubSector,this,true,"descripcionSubSector","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubSectorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.subsectorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subsectorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subsectorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubSector.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subsectorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subsectorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubSector.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSubSector && this.isPermisoGuardarCambiosSubSector) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.subsectorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.subsectorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSubSector.addColumn(tableColumn);
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
			
			this.jTableDatosSubSector.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubSector && this.isPermisoGuardarCambiosSubSector) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubSector && this.isPermisoGuardarCambiosSubSector) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSubSector.moveColumn(this.jTableDatosSubSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSubSector.moveColumn(this.jTableDatosSubSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSubSector.moveColumn(this.jTableDatosSubSector.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSubSector.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSubSector.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSubSector,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSubSector.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSubSector.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSubSector.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSubSector.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSubSector.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=subsectorLogic.getSubSectors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=subsectors.size()-1;
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
		//this.jTableDatosSubSector.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSubSector.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSubSector();
			
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
				
				//this.isEsNuevoSubSector=false;
					
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
				if(this.subsectorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSubSector==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubSector.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubSector.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.subsector.getsType().equals("DUPLICADO")
				   || this.subsector.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSubSector=true;
				
				} else {
					this.isEsNuevoSubSector=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.subsectorSessionBean.getEsGuardarRelacionado()) {
					if(this.subsector.getId()>=0 && !this.subsector.getIsNew()) {						
						this.isEsNuevoSubSector=false;
						
					} else {
						this.isEsNuevoSubSector=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSubSector(esRelaciones);						
				
				this.seleccionarSubSector(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.subsector.getId()<0) {
					this.isEsNuevoSubSector=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSubSector(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSubSector(evt,rowIndex);
				}	
				
				if(this.subsectorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SubSector: " + this.dDif); 
					}
				}								
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSubSector(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.subsector)) {
					if(this.subsector.getId()>0) {
						this.subsector.setIsDeleted(true);
						
						this.subsectorsEliminados.add(this.subsector);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subsectorLogic.getSubSectors().remove(this.subsector);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subsectors.remove(this.subsector);				
					}
					
					
					((SubSectorModel) this.jTableDatosSubSector.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSubSector(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSubSector(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSubSector) {
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubSector.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubSector.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSubSector(this.subsector);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.subsectorConstantesFunciones.cargarid_empresaSubSector || this.subsectorConstantesFunciones.event_dependid_empresaSubSector) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.subsector.getid_empresa());
									//this.inicializarActualizarBindingSubSector(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(subsector.getEmpresa()!=null) {
							this.empresasForeignKey.add(subsector.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.subsector.getid_empresa(),false,"Formulario");

					//Sector
					if(!this.subsectorConstantesFunciones.cargarid_sectorSubSector || this.subsectorConstantesFunciones.event_dependid_sectorSubSector) {
						//this.cargarCombosSectorsForeignKeyLista(" where id="+this.subsector.getid_sector());
									//this.inicializarActualizarBindingSubSector(false,false);
						this.sectorsForeignKey=new ArrayList<Sector>();

						if(subsector.getSector()!=null) {
							this.sectorsForeignKey.add(subsector.getSector());
						}

						this.addItemDefectoCombosForeignKeySector();
						this.cargarCombosFrameSectorsForeignKey("Todos");
					}
					this.setActualSectorForeignKey(this.subsector.getid_sector(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSubSector("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSubSector(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubSector() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubSector(SubSector subsector) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSubSector(subsector,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubSector(SubSector subsector,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSubSector(subsector);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySubSector(subsector,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySubSector(subsector);
	}
	
	public void setVariablesObjetoActualToFormularioSubSector(SubSector subsector) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setText(subsector.getId().toString());
			this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setText(subsector.getcodigo());
			this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setText(subsector.getnombre());
			this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setText(subsector.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SubSector subsectorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,subsectorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SubSector subsectorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				subsectorLocal=this.subsector;
			} else {
				subsectorLocal=this.subsectorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(subsectorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSubSector(subsectorLocal,true);
					
					if(subsectorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(subsectorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(subsectorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSubSector(SubSector subsector,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubSector(subsector,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSubSector(subsector);
	}
	
	public void setVariablesFormularioToObjetoActualSubSector(SubSector subsector,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubSector(subsector,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSubSector(SubSector subsector,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.getText()==null || this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.getText()=="" || this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.getText()=="Id") {
				this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setText("0");
			}

			if(conColumnasBase) {subsector.setId(Long.parseLong(this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubSectorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelIdSubSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subsector.setcodigo(this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubSectorConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelcodigoSubSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subsector.setnombre(this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubSectorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabelnombreSubSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subsector.setdescripcion(this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubSectorConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubSector.jLabeldescripcionSubSector,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubSector(SubSector subsectorBean,SubSector subsector,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && subsectorBean.getid_sector()!=null && !subsectorBean.getid_sector().equals(-1L))) {subsector.setid_sector(subsectorBean.getid_sector());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSubSector(SubSector subsectorOrigen,SubSector subsector,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subsectorOrigen.getId()!=null && !subsectorOrigen.getId().equals(0L))) {subsector.setId(subsectorOrigen.getId());}}
			if(conDefault || (!conDefault && subsectorOrigen.getid_sector()!=null && !subsectorOrigen.getid_sector().equals(-1L))) {subsector.setid_sector(subsectorOrigen.getid_sector());}
			if(conDefault || (!conDefault && subsectorOrigen.getcodigo()!=null && !subsectorOrigen.getcodigo().equals(""))) {subsector.setcodigo(subsectorOrigen.getcodigo());}
			if(conDefault || (!conDefault && subsectorOrigen.getnombre()!=null && !subsectorOrigen.getnombre().equals(""))) {subsector.setnombre(subsectorOrigen.getnombre());}
			if(conDefault || (!conDefault && subsectorOrigen.getdescripcion()!=null && !subsectorOrigen.getdescripcion().equals(""))) {subsector.setdescripcion(subsectorOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubSector(SubSector subsector) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setText(subsector.getId().toString());
			this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setText(subsector.getcodigo());
			this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setText(subsector.getnombre());
			this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setText(subsector.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubSector(SubSectorBean subsectorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setText(subsectorBean.getId().toString());
			this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setText(subsectorBean.getcodigo());
			this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setText(subsectorBean.getnombre());
			this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setText(subsectorBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSubSector(SubSectorParameterReturnGeneral subsectorReturnGeneral,SubSectorBean subsectorBean,Boolean conDefault) throws Exception { 
		try {
			SubSector subsectorLocal=new SubSector();
			
			subsectorLocal=subsectorReturnGeneral.getSubSector();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subsectorLocal.getId()!=null && !subsectorLocal.getId().equals(0L))) {subsectorBean.setId(subsectorLocal.getId());}}
			if(conDefault || (!conDefault && subsectorLocal.getid_sector()!=null && !subsectorLocal.getid_sector().equals(-1L))) {subsectorBean.setid_sector(subsectorLocal.getid_sector());}
			if(conDefault || (!conDefault && subsectorLocal.getcodigo()!=null && !subsectorLocal.getcodigo().equals(""))) {subsectorBean.setcodigo(subsectorLocal.getcodigo());}
			if(conDefault || (!conDefault && subsectorLocal.getnombre()!=null && !subsectorLocal.getnombre().equals(""))) {subsectorBean.setnombre(subsectorLocal.getnombre());}
			if(conDefault || (!conDefault && subsectorLocal.getdescripcion()!=null && !subsectorLocal.getdescripcion().equals(""))) {subsectorBean.setdescripcion(subsectorLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSubSectorGenerico(Long idSubSectorSeleccionado,JComboBox jComboBoxSubSector,List<SubSector> subsectorsLocal)throws Exception {
		try {
			SubSector  subsectorTemp=null;

			for(SubSector subsectorAux:subsectorsLocal) {
				if(subsectorAux.getId()!=null && subsectorAux.getId().equals(idSubSectorSeleccionado)) {
					subsectorTemp=subsectorAux;
					break;
				}
			}

			jComboBoxSubSector.setSelectedItem(subsectorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSubSectorGenerico(JComboBox jComboBoxSubSector,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubSector.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSubSector.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubSector.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSubSector.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSubSector.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSubSector.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subsector=(SubSector) subsectorLogic.getSubSectors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subsector =(SubSector) subsectors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!subsector.getIsNew() && !subsector.getIsChanged() && !subsector.getIsDeleted()) {
				sDescripcion=subsector.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=subsector.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sector")) {
			//sDescripcion=this.getActualSectorForeignKeyDescripcion((Long)value);
			if(!subsector.getIsNew() && !subsector.getIsChanged() && !subsector.getIsDeleted()) {
				sDescripcion=subsector.getsector_descripcion();
			} else {
				//sDescripcion=this.getActualSectorForeignKeyDescripcion((Long)value);
				sDescripcion=subsector.getsector_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SubSector subsectorRow=new SubSector();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subsectorRow=(SubSector) subsectorLogic.getSubSectors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subsectorRow=(SubSector) subsectors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSubSector(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector));			
			this.jButtonDuplicarSubSector.setVisible((this.isVisibilidadCeldaDuplicarSubSector && this.isPermisoDuplicarSubSector));			
			this.jButtonCopiarSubSector.setVisible((this.isVisibilidadCeldaCopiarSubSector && this.isPermisoCopiarSubSector));
			this.jButtonVerFormSubSector.setVisible((this.isVisibilidadCeldaVerFormSubSector && this.isPermisoVerFormSubSector));
			
			this.jButtonAbrirOrderBySubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));			
			
			this.jButtonNuevoRelacionesSubSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubSector && this.isPermisoNuevoSubSector));			
			this.jButtonNuevoGuardarCambiosSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector && this.isPermisoGuardarCambiosSubSector));
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.jInternalFrameDetalleFormSubSector.jButtonModificarSubSector.setVisible((this.isVisibilidadCeldaModificarSubSector && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.setVisible((this.isVisibilidadCeldaActualizarSubSector && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.setVisible((this.isVisibilidadCeldaEliminarSubSector && this.isPermisoEliminarSubSector));
			this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.setVisible(this.isVisibilidadCeldaCancelarSubSector);							
			this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.setVisible((this.isVisibilidadCeldaGuardarSubSector && this.isPermisoGuardarCambiosSubSector));			
			
			}
						
			this.jButtonGuardarCambiosTablaSubSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSubSector && this.isPermisoGuardarCambiosSubSector));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector));						
			this.jButtonDuplicarToolBarSubSector.setVisible((this.isVisibilidadCeldaDuplicarSubSector && this.isPermisoDuplicarSubSector));						
			this.jButtonCopiarToolBarSubSector.setVisible((this.isVisibilidadCeldaCopiarSubSector && this.isPermisoCopiarSubSector));			
			this.jButtonVerFormToolBarSubSector.setVisible((this.isVisibilidadCeldaVerFormSubSector && this.isPermisoVerFormSubSector));			
			this.jButtonAbrirOrderByToolBarSubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));
			this.jButtonNuevoRelacionesToolBarSubSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubSector && this.isPermisoNuevoSubSector));			
			this.jButtonNuevoGuardarCambiosToolBarSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector && this.isPermisoGuardarCambiosSubSector));			
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.jInternalFrameDetalleFormSubSector.jButtonModificarToolBarSubSector.setVisible((this.isVisibilidadCeldaModificarSubSector && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jButtonActualizarToolBarSubSector.setVisible((this.isVisibilidadCeldaActualizarSubSector  && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jButtonEliminarToolBarSubSector.setVisible((this.isVisibilidadCeldaEliminarSubSector && this.isPermisoEliminarSubSector));
			this.jInternalFrameDetalleFormSubSector.jButtonCancelarToolBarSubSector.setVisible(this.isVisibilidadCeldaCancelarSubSector);				
			this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosToolBarSubSector.setVisible((this.isVisibilidadCeldaGuardarSubSector && this.isPermisoGuardarCambiosSubSector));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSubSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSubSector && this.isPermisoGuardarCambiosSubSector));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector));			
			this.jMenuItemDuplicarSubSector.setVisible((this.isVisibilidadCeldaDuplicarSubSector && this.isPermisoDuplicarSubSector));			
			this.jMenuItemCopiarSubSector.setVisible((this.isVisibilidadCeldaCopiarSubSector && this.isPermisoCopiarSubSector));			
			this.jMenuItemVerFormSubSector.setVisible((this.isVisibilidadCeldaVerFormSubSector && this.isPermisoVerFormSubSector));			
			this.jMenuItemAbrirOrderBySubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));			
			//this.jMenuItemMostrarOcultarSubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));
			this.jMenuItemDetalleAbrirOrderBySubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));			
			//this.jMenuItemDetalleMostrarOcultarSubSector.setVisible((this.isVisibilidadCeldaOrdenSubSector && this.isPermisoOrdenSubSector));			
			this.jMenuItemNuevoRelacionesSubSector.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubSector && this.isPermisoNuevoSubSector));			
			this.jMenuItemNuevoGuardarCambiosSubSector.setVisible((this.isVisibilidadCeldaNuevoSubSector && this.isPermisoNuevoSubSector && this.isPermisoGuardarCambiosSubSector));									
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.jInternalFrameDetalleFormSubSector.jMenuItemModificarSubSector.setVisible((this.isVisibilidadCeldaModificarSubSector && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jMenuItemActualizarSubSector.setVisible((this.isVisibilidadCeldaActualizarSubSector && this.isPermisoActualizarSubSector));	
			this.jInternalFrameDetalleFormSubSector.jMenuItemEliminarSubSector.setVisible((this.isVisibilidadCeldaEliminarSubSector && this.isPermisoEliminarSubSector));
			this.jInternalFrameDetalleFormSubSector.jMenuItemCancelarSubSector.setVisible(this.isVisibilidadCeldaCancelarSubSector);				
			}
			
			this.jMenuItemGuardarCambiosSubSector.setVisible((this.isVisibilidadCeldaGuardarSubSector && this.isPermisoGuardarCambiosSubSector));						
			this.jMenuItemGuardarCambiosTablaSubSector.setVisible((this.isVisibilidadCeldaGuardarCambiosSubSector && this.isPermisoGuardarCambiosSubSector));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSubSector=this.jButtonNuevoSubSector.isVisible();
			this.isVisibilidadCeldaDuplicarSubSector=this.jButtonDuplicarSubSector.isVisible();
			this.isVisibilidadCeldaCopiarSubSector=this.jButtonCopiarSubSector.isVisible();
			this.isVisibilidadCeldaVerFormSubSector=this.jButtonVerFormSubSector.isVisible();
			
			this.isVisibilidadCeldaOrdenSubSector=this.jButtonAbrirOrderBySubSector.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSubSector=this.jButtonNuevoRelacionesSubSector.isVisible();
			this.isVisibilidadCeldaModificarSubSector=this.jButtonModificarSubSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.isVisibilidadCeldaActualizarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.isVisible();
			this.isVisibilidadCeldaEliminarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.isVisible();
			this.isVisibilidadCeldaCancelarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.isVisible();
			this.isVisibilidadCeldaGuardarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSubSector=this.jButtonGuardarCambiosTablaSubSector.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSubSector=this.jButtonNuevoToolBarSubSector.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubSector=this.jButtonNuevoRelacionesToolBarSubSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.isVisibilidadCeldaModificarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonModificarToolBarSubSector.isVisible();
			this.isVisibilidadCeldaActualizarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonActualizarToolBarSubSector.isVisible();
			this.isVisibilidadCeldaEliminarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonEliminarToolBarSubSector.isVisible();
			this.isVisibilidadCeldaCancelarSubSector=this.jInternalFrameDetalleFormSubSector.jButtonCancelarToolBarSubSector.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubSector=this.jButtonGuardarCambiosToolBarSubSector.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubSector=this.jButtonGuardarCambiosTablaToolBarSubSector.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSubSector=this.jMenuItemNuevoSubSector.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubSector=this.jMenuItemNuevoRelacionesSubSector.isVisible();
			
			if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.isVisibilidadCeldaModificarSubSector=this.jInternalFrameDetalleFormSubSector.jMenuItemModificarSubSector.isVisible();
			this.isVisibilidadCeldaActualizarSubSector=this.jInternalFrameDetalleFormSubSector.jMenuItemActualizarSubSector.isVisible();
			this.isVisibilidadCeldaEliminarSubSector=this.jInternalFrameDetalleFormSubSector.jMenuItemEliminarSubSector.isVisible();
			this.isVisibilidadCeldaCancelarSubSector=this.jInternalFrameDetalleFormSubSector.jMenuItemCancelarSubSector.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubSector=this.jMenuItemGuardarCambiosSubSector.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubSector=this.jMenuItemGuardarCambiosTablaSubSector.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSubSector(Boolean esInicializar) {
		if(SubSectorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.subsectorSessionBean.getConGuardarRelaciones()) {
				//if(this.subsectorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSubSector();
			}
			
			this.inicializarActualizarBindingBotonesManualSubSector(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSubSector() {
		this.jButtonNuevoSubSector.setVisible(this.isPermisoNuevoSubSector);			
		this.jButtonDuplicarSubSector.setVisible(this.isPermisoDuplicarSubSector);			
		this.jButtonCopiarSubSector.setVisible(this.isPermisoCopiarSubSector);			
		this.jButtonVerFormSubSector.setVisible(this.isPermisoVerFormSubSector);			
		
		this.jButtonAbrirOrderBySubSector.setVisible(this.isPermisoOrdenSubSector);					
		
		this.jButtonNuevoRelacionesSubSector.setVisible(this.isPermisoNuevoSubSector);			
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonModificarSubSector.setVisible(this.isPermisoActualizarSubSector);	
			this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.setVisible(this.isPermisoActualizarSubSector);	
			this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.setVisible(this.isPermisoEliminarSubSector);
			this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.setVisible(this.isVisibilidadCeldaCancelarSubSector);						
			this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.setVisible(this.isPermisoGuardarCambiosSubSector);							
		}
		
		this.jButtonGuardarCambiosTablaSubSector.setVisible(this.isPermisoActualizarSubSector);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSubSector() {
		this.jInternalFrameDetalleFormSubSector.jButtonModificarSubSector.setVisible(this.isPermisoActualizarSubSector);	
		this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.setVisible(this.isPermisoActualizarSubSector);	
		this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.setVisible(this.isPermisoEliminarSubSector);
		this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.setVisible(this.isVisibilidadCeldaCancelarSubSector);							
		this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.setVisible((this.isVisibilidadCeldaGuardarSubSector && this.isPermisoGuardarCambiosSubSector));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSubSector() {
		if(SubSectorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSubSector();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSubSector() {
	}
	
	public void jTableDatosSubSectorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSubSector(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.subsector.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSubSectorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSubSector(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubSector.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubSector.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.subsectorLogic.getConnexion());

				if(this.subsector.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.subsector.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubSector=(TitledBorder)this.jScrollPanelDatosSubSector.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSubSector.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.subsector.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sectorSubSectorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosector=true;

			idTienePermisosector=this.tienePermisosUsuarioEnPaginaWebSubSector(SectorConstantesFunciones.CLASSNAME);

			if(idTienePermisosector) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubSector.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubSector.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);

				this.sectorBeanSwingJInternalFrame=new SectorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sectorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sectorBeanSwingJInternalFrame.getSectorLogic().setConnexion(this.subsectorLogic.getConnexion());

				if(this.subsector.getid_sector()!=null) {
					this.sectorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sectorBeanSwingJInternalFrame.setIdActual(this.subsector.getid_sector());
					this.sectorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sectorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sectorBeanSwingJInternalFrame.inicializarActualizarBindingTablaSector();
				}

				JInternalFrameBase jinternalFrame =this.sectorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubSector=(TitledBorder)this.jScrollPanelDatosSubSector.getBorder();
				TitledBorder titledBordersector=(TitledBorder)this.sectorBeanSwingJInternalFrame.jScrollPanelDatosSector.getBorder();

				titledBordersector.setTitle(titledBorderSubSector.getTitle() + " -> Sector");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sectorSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getid_sector()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sector = "+this.subsector.getid_sector().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.subsector.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.subsector.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSubSectorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubSector.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubSector(this.getsubsector(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subsector==null) {
						this.subsector = new SubSector();
					}

					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);
				}

				if(this.subsector.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.subsector.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubSector(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaSubSectorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubSector(false,false);

			this.getSubSectorsFK_IdEmpresa();

			this.inicializarActualizarBindingSubSector(false);

			//if(SubSectorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubSector(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSectorSubSectorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubSector(false,false);

			this.getSubSectorsFK_IdSector();

			this.inicializarActualizarBindingSubSector(false);

			//if(SubSectorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubSector(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subsectorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSubSector() {
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
			this.jInternalFrameDetalleFormSubSector.setVisible(false);	    			
			this.jInternalFrameDetalleFormSubSector.dispose();
			this.jInternalFrameDetalleFormSubSector=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSubSector!=null) {
			this.jInternalFrameReporteDinamicoSubSector.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSubSector.dispose();
			this.jInternalFrameReporteDinamicoSubSector=null;
		}
		
		if(this.jInternalFrameImportacionSubSector!=null) {
			this.jInternalFrameImportacionSubSector.setVisible(false);	    			
			this.jInternalFrameImportacionSubSector.dispose();
			this.jInternalFrameImportacionSubSector=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSubSector();
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			
			if(sTipo.equals("NuevoSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSubSector")) {
				jButtonDuplicarSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSubSector")) {
				jButtonCopiarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("VerFormSubSector")) {
				jButtonVerFormSubSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSubSector")) {
				jButtonDuplicarSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSubSector")) {
				jButtonDuplicarSubSectorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSubSector")) {
				jButtonModificarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSubSector")) {
				jButtonModificarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSubSector")) {
				jButtonModificarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSubSector")) {
				jButtonActualizarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSubSector")) {
				jButtonActualizarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSubSector")) {
				jButtonActualizarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("EliminarSubSector")) {
				jButtonEliminarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSubSector")) {
				jButtonEliminarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSubSector")) {
				jButtonEliminarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("CancelarSubSector")) {
				jButtonCancelarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSubSector")) {
				jButtonCancelarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSubSector")) {
				jButtonCancelarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("CerrarSubSector")) {
				jButtonCerrarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSubSector")) {
				jButtonCerrarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSubSector")) {
				jButtonCerrarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSubSector")) {
				jButtonMostrarOcultarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSubSector")) {
				jButtonCancelarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSubSector")) {
				jButtonCopiarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSubSector")) {
				jButtonVerFormSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSubSector")) {
				jButtonCopiarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSubSector")) {
				jButtonVerFormSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSubSector")) {
				jButtonRecargarInformacionSubSectorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSubSector")) {
				jButtonRecargarInformacionSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSubSector")) {
				jButtonRecargarInformacionSubSectorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSubSector")) {
				jButtonAnterioresSubSectorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSubSector")) {
				jButtonAnterioresSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSubSector")) {
				jButtonAnterioresSubSectorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSubSector")) {
				jButtonSiguientesSubSectorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSubSector")) {
				jButtonSiguientesSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSubSector")) {
				jButtonSiguientesSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySubSector") || sTipo.equals("MenuItemDetalleAbrirOrderBySubSector")) {
				jButtonAbrirOrderBySubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSubSector") || sTipo.equals("MenuItemDetalleMostrarOcultarSubSector")) {
				jButtonMostrarOcultarSubSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSubSector")) {
				jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSubSector")) {
				jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSubSector")) {
				jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSubSector")) {
				jButtonCerrarReporteDinamicoSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSubSector")) {
				jButtonGenerarReporteDinamicoSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSubSector")) {
				
				jButtonGenerarExcelReporteDinamicoSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSubSector")) {
				jButtonCerrarImportacionSubSectorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSubSector")) {
				
				jButtonGenerarImportacionSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSubSector")) {
				
				jButtonAbrirImportacionSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSubSector")) {
				jComboBoxTiposAccionesSubSectorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSubSector")) {
				jComboBoxTiposRelacionesSubSectorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSubSector")) {
				jComboBoxTiposAccionesSubSectorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSubSector")) {
				
				jComboBoxTiposSeleccionarSubSectorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSubSector")) {
				jTextFieldValorCampoGeneralSubSectorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySubSector")) {
				jButtonAbrirOrderBySubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSubSector")) {
				jButtonAbrirOrderBySubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySubSector")) {
				jButtonCerrarOrderBySubSectorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubSectorBusqueda")) {
				this.jButtonidSubSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubSectorUpdate")) {
				this.jButtonid_empresaSubSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubSectorBusqueda")) {
				this.jButtonid_empresaSubSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sectorSubSectorUpdate")) {
				this.jButtonid_sectorSubSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sectorSubSectorBusqueda")) {
				this.jButtonid_sectorSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSubSectorBusqueda")) {
				this.jButtoncodigoSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubSectorBusqueda")) {
				this.jButtonnombreSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSubSectorBusqueda")) {
				this.jButtondescripcionSubSectorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdSectorSubSector")) {
				this.jButtonFK_IdSectorSubSectorActionPerformed(evt);
			}
			
			;
			
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSubSector();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SubSector subsectorLocal=null;
			
			if(!this.getEsControlTabla()) {
				subsectorLocal=this.subsector;
			} else {
				subsectorLocal=this.subsectorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
							
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
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
			
			


			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
								
						
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
								
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
							
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
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
			
			


			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
								
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSubSector")) {
					jCheckBoxSeleccionarTodosSubSectorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSubSector")) {
					jCheckBoxSeleccionadosSubSectorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSubSector")) {
					
				}
				
				


				
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
												
				
				


				
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
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
			
			


			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubSectorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subsector);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subsector);
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
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
				
				


				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubSector.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubSector.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubSectorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subsectorAnterior =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subsectorAnterior =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSubSector")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSubSectorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSubSector.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.subsector =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.subsector =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.subsector);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSubSector")) {
				
				}
				
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSubSector")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSubSector.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSubSector")) {
			
			}
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSubSector();
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			if(sTipo.equals("NuevoSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSubSector")) {
				jButtonDuplicarSubSectorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSubSector")) {
				jButtonCopiarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSubSector")) {
				jButtonVerFormSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSubSector")) {
				jButtonNuevoSubSectorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSubSector")) {
				jButtonModificarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSubSector")) {
				jButtonActualizarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSubSector")) {
				jButtonEliminarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSubSector")) {
				jButtonCancelarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSubSector")) {
				jButtonCerrarSubSectorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSubSector")) {
				jButtonGuardarCambiosSubSectorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSubSector")) {
				jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySubSector")) {
				jButtonAbrirOrderBySubSectorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSubSector")) {
				jButtonRecargarInformacionSubSectorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSubSector")) {
				jButtonAnterioresSubSectorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSubSector")) {
				jButtonSiguientesSubSectorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubSectorBusqueda")) {
				this.jButtonidSubSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubSectorUpdate")) {
				this.jButtonid_empresaSubSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubSectorBusqueda")) {
				this.jButtonid_empresaSubSectorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sectorSubSectorUpdate")) {
				this.jButtonid_sectorSubSectorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sectorSubSectorBusqueda")) {
				this.jButtonid_sectorSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSubSectorBusqueda")) {
				this.jButtoncodigoSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubSectorBusqueda")) {
				this.jButtonnombreSubSectorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSubSectorBusqueda")) {
				this.jButtondescripcionSubSectorBusquedaActionPerformed(evt);
			}
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSubSector();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSubSector")) {
				closingInternalFrameSubSector();
				
			} else if(sTipo.equals("jButtonCancelarSubSector")) {
				JInternalFrameBase jInternalFrameDetalleFormSubSector = (JInternalFrameBase)evt.getSource();
	            	
	            SubSectorBeanSwingJInternalFrame jInternalFrameParent=(SubSectorBeanSwingJInternalFrame)jInternalFrameDetalleFormSubSector.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSubSectorActionPerformed(null);
			}
			
			SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subsector,new Object(),this.subsectorParameterGeneral,this.subsectorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSubSector(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSubSector(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSubSector(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.subsector)) {
			if(!esControlTabla) {
				if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);			
				}
				
				if(this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSubSector(this.subsector,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subsectorReturnGeneral=subsectorLogic.procesarEventosSubSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subsectorLogic.getSubSectors(),this.subsector,this.subsectorParameterGeneral,this.isEsNuevoSubSector,classes);//this.subsectorLogic.getSubSector()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSubSector(this.subsectorReturnGeneral,this.subsectorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.subsectorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSubSector(classes,this.subsectorReturnGeneral,this.subsectorBean,false);
					}
						
					if(this.subsectorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySubSector(this.subsectorReturnGeneral.getSubSector());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSubSector(this.subsectorReturnGeneral.getSubSector());	
					}
						
					if(this.subsectorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSubSector(this.subsectorReturnGeneral.getSubSector(),classes);//this.subsectorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSubSector(this.subsector,classes);//this.subsectorBean);									
				}
			
				if(SubSectorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSubSector(this.subsector,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubSector(this.subsector);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.subsectorAnterior!=null) {
						this.subsector=this.subsectorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subsectorReturnGeneral=subsectorLogic.procesarEventosSubSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subsectorLogic.getSubSectors(),this.subsector,this.subsectorParameterGeneral,this.isEsNuevoSubSector,classes);//this.subsectorLogic.getSubSector()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subsectorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subsectorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.subsectorReturnGeneral.getSubSector(),subsectorLogic.getSubSectors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.subsectorReturnGeneral.getSubSector(),this.subsectors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSubSector.repaint();
				
				//((AbstractTableModel) this.jTableDatosSubSector.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSubSector();
			}
		}
	}
	
	public void actualizarVisualTableDatosSubSector() throws Exception {
		
		SubSectorModel subsectorModel=(SubSectorModel)this.jTableDatosSubSector.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subsectorModel.subsectors=this.subsectorLogic.getSubSectors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			subsectorModel.subsectors=this.subsectors;
		}
		
		
		((SubSectorModel) this.jTableDatosSubSector.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSubSector() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsubsectorAnterior(),this.subsectorLogic.getSubSectors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsubsectorAnterior(),this.subsectors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSubSector();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSubSector(SubSector subsector,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
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
										
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subsector,new Object(),generalEntityParameterGeneral,this.subsectorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.subsectorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SubSectorConstantesFunciones.getClassesRelationshipsOfSubSector(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SubSectorConstantesFunciones.getClassesRelationshipsFromStringsOfSubSector(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSubSector(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SubSectorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subsector,new Object(),generalEntityParameterGeneral,this.subsectorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSubSector(SubSectorBean subsectorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSubSector(ArrayList<Classe> classes,SubSectorReturnGeneral subsectorReturnGeneral,SubSectorBean subsectorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSubSector(SubSector subsector,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.subsector)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSubSector = new SubSectorDetalleFormJInternalFrame(jDesktopPane,this.subsectorSessionBean.getConGuardarRelaciones(),this.subsectorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSubSector);
		this.jInternalFrameDetalleFormSubSector.setVisible(false);
		this.jInternalFrameDetalleFormSubSector.setSelected(false);						
		
		this.jInternalFrameDetalleFormSubSector.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSubSector.subsectorLogic=this.subsectorLogic;
		
		this.cargarCombosFrameForeignKeySubSector("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSubSector();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubSector();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySubSector("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySubSector();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSubSector.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubSector"));
		
		this.jInternalFrameDetalleFormSubSector.jButtonModificarSubSector.addActionListener(new ButtonActionListener(this,"ModificarSubSector"));

		
		this.jInternalFrameDetalleFormSubSector.jButtonModificarToolBarSubSector.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubSector"));
					
		this.jInternalFrameDetalleFormSubSector.jMenuItemModificarSubSector.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubSector"));		
		
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.addActionListener (new ButtonActionListener(this,"ActualizarSubSector"));
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonActualizarToolBarSubSector.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubSector"));
						
		this.jInternalFrameDetalleFormSubSector.jMenuItemActualizarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubSector"));		
		
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.addActionListener (new ButtonActionListener(this,"EliminarSubSector"));
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonEliminarToolBarSubSector.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubSector"));
								
		this.jInternalFrameDetalleFormSubSector.jMenuItemEliminarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubSector"));		
		
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.addActionListener (new ButtonActionListener(this,"CancelarSubSector"));
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonCancelarToolBarSubSector.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubSector"));
					
		this.jInternalFrameDetalleFormSubSector.jMenuItemCancelarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubSector"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSubSector.jMenuItemDetalleCerrarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubSector"));		
		
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosToolBarSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubSector"));
		
		
		
		this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosToolBarSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubSector"));
		
		
		
		this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubSector"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonidSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtoncodigoSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonnombreSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtondescripcionSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSubSectorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubSector"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSubSector"));
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubSector"));
		}
		
		this.jTableDatosSubSector.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSubSector"));
		
		this.jTableDatosSubSector.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSubSector"));
		
		this.jButtonNuevoSubSector.addActionListener(new ButtonActionListener(this,"NuevoSubSector"));
		
		this.jButtonDuplicarSubSector.addActionListener(new ButtonActionListener(this,"DuplicarSubSector"));
		
		this.jButtonCopiarSubSector.addActionListener(new ButtonActionListener(this,"CopiarSubSector"));
		
		this.jButtonVerFormSubSector.addActionListener(new ButtonActionListener(this,"VerFormSubSector"));
		
		
		this.jButtonNuevoToolBarSubSector.addActionListener(new ButtonActionListener(this,"NuevoToolBarSubSector"));
			
		this.jButtonDuplicarToolBarSubSector.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSubSector"));
			
		this.jMenuItemNuevoSubSector.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSubSector"));
			
		this.jMenuItemDuplicarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSubSector"));		
		
		
		this.jButtonNuevoRelacionesSubSector.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSubSector"));
		
		
		this.jButtonNuevoRelacionesToolBarSubSector.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSubSector"));
			
		this.jMenuItemNuevoRelacionesSubSector.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSubSector"));		
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonModificarSubSector.addActionListener(new ButtonActionListener(this,"ModificarSubSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonModificarToolBarSubSector.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubSector"));
			
			this.jInternalFrameDetalleFormSubSector.jMenuItemModificarSubSector.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSubSector.jButtonActualizarSubSector.addActionListener (new ButtonActionListener(this,"ActualizarSubSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonActualizarToolBarSubSector.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubSector"));
				
			this.jInternalFrameDetalleFormSubSector.jMenuItemActualizarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonEliminarSubSector.addActionListener (new ButtonActionListener(this,"EliminarSubSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonEliminarToolBarSubSector.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubSector"));
						
			this.jInternalFrameDetalleFormSubSector.jMenuItemEliminarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonCancelarSubSector.addActionListener (new ButtonActionListener(this,"CancelarSubSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonCancelarToolBarSubSector.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubSector"));
			
			this.jInternalFrameDetalleFormSubSector.jMenuItemCancelarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubSector"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSubSector.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSubSector"));		
		
		
		this.jButtonCerrarSubSector.addActionListener (new ButtonActionListener(this,"CerrarSubSector"));
		
		
		this.jButtonCerrarToolBarSubSector.addActionListener (new ButtonActionListener(this,"CerrarToolBarSubSector"));
			
		this.jMenuItemCerrarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSubSector"));
			
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jMenuItemDetalleCerrarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubSector"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosSubSector"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosToolBarSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubSector"));
		}
		
		this.jButtonCopiarToolBarSubSector.addActionListener (new ButtonActionListener(this,"CopiarToolBarSubSector"));
			
		this.jButtonVerFormToolBarSubSector.addActionListener (new ButtonActionListener(this,"VerFormToolBarSubSector"));
		
		this.jMenuItemGuardarCambiosSubSector.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSubSector"));
			
		this.jMenuItemCopiarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSubSector"));		
		
		this.jMenuItemVerFormSubSector.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSubSector"));		
		
		
		this.jButtonGuardarCambiosTablaSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubSector"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSubSector"));
			
		this.jMenuItemGuardarCambiosTablaSubSector.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubSector"));		
		
		
		
		this.jButtonRecargarInformacionSubSector.addActionListener (new ButtonActionListener(this,"RecargarInformacionSubSector"));
					
		this.jButtonRecargarInformacionToolBarSubSector.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSubSector"));
		
		this.jMenuItemRecargarInformacionSubSector.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSubSector"));		
		
		
		
		this.jButtonAnterioresSubSector.addActionListener (new ButtonActionListener(this,"AnterioresSubSector"));
		
		
		this.jButtonAnterioresToolBarSubSector.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSubSector"));
		
		this.jMenuItemAnterioresSubSector.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSubSector"));		
		
		
		this.jButtonSiguientesSubSector.addActionListener (new ButtonActionListener(this,"SiguientesSubSector"));
		
		
		this.jButtonSiguientesToolBarSubSector.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSubSector"));
			
		this.jMenuItemSiguientesSubSector.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSubSector"));
			
		this.jMenuItemAbrirOrderBySubSector.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySubSector"));
			
		this.jMenuItemMostrarOcultarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSubSector"));
			
		this.jMenuItemDetalleAbrirOrderBySubSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySubSector"));
			
		this.jMenuItemDetalleMostarOcultarSubSector.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSubSector"));		
		
		
		this.jButtonNuevoGuardarCambiosSubSector.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSubSector"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubSector.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSubSector"));
			
		this.jMenuItemNuevoGuardarCambiosSubSector.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSubSector"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSubSector.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSubSector"));

		this.jCheckBoxSeleccionadosSubSector.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSubSector"));
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubSector"));
		}
		
		
		this.jComboBoxTiposRelacionesSubSector.addActionListener (new ButtonActionListener(this,"TiposRelacionesSubSector"));
			
		this.jComboBoxTiposAccionesSubSector.addActionListener (new ButtonActionListener(this,"TiposAccionesSubSector"));
					
		this.jComboBoxTiposSeleccionarSubSector.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSubSector"));
			
		this.jTextFieldValorCampoGeneralSubSector.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSubSector"));		
		
		
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonidSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtoncodigoSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonnombreSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtondescripcionSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSubSectorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdSectorSubSector.addActionListener(new ButtonActionListener(this,"FK_IdSectorSubSector"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSubSector!=null) {
				this.jInternalFrameReporteDinamicoSubSector.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubSector"));
				this.jInternalFrameReporteDinamicoSubSector.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubSector"));
				this.jInternalFrameReporteDinamicoSubSector.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubSector"));
			}
			
			//this.jButtonCerrarReporteDinamicoSubSector.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubSector"));				
			//this.jButtonGenerarReporteDinamicoSubSector.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubSector"));
			//this.jButtonGenerarExcelReporteDinamicoSubSector.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubSector"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSubSector!=null) {
				this.jInternalFrameImportacionSubSector.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubSector"));
				this.jInternalFrameImportacionSubSector.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubSector"));
				this.jInternalFrameImportacionSubSector.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubSector"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySubSector.addActionListener (new ButtonActionListener(this,"AbrirOrderBySubSector"));
			
			this.jButtonAbrirOrderByToolBarSubSector.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSubSector"));			
			
			if(this.jInternalFrameOrderBySubSector!=null) {
				this.jInternalFrameOrderBySubSector.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubSector"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSubSector!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubSector.jTabbedPaneRelacionesSubSector.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubSector"));
		
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
            		closingInternalFrameSubSector();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSubSector.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSubSector = (JInternalFrameBase)event.getSource();
	            	
	            SubSectorBeanSwingJInternalFrame jInternalFrameParent=(SubSectorBeanSwingJInternalFrame)jInternalFrameDetalleFormSubSector.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSubSectorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSubSector.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSubSectorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSubSector.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSubSector.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSubSector";
		inputMap = this.jButtonNuevoSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubSectorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubSectorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSubSector";
		inputMap = this.jButtonNuevoRelacionesSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubSectorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSubSector";
		inputMap = this.jButtonModificarSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSubSector";
		inputMap = this.jButtonActualizarSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSubSector";
		inputMap = this.jButtonEliminarSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSubSector";
		inputMap = this.jButtonCancelarSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSubSector";
		inputMap = this.jButtonCerrarSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSubSector";
		inputMap = this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSubSector.jButtonGuardarCambiosSubSector.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSubSectorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSubSector.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSubSectorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSubSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSubSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSubSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSubSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSubSector.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSubSectorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonidSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"idSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_empresaSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubSectorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorUpdate.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonid_sectorSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"id_sectorSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtoncodigoSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtonnombreSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubSectorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubSector.jButtondescripcionSubSectorBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSubSectorBusqueda"));
		
		
		this.jButtonFK_IdSectorSubSector.addActionListener(new ButtonActionListener(this,"FK_IdSectorSubSector"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSubSector.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSubSectorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSubSectorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSubSector.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSubSector(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
					subsectorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubSector subsectorAux:subsectors) {
					subsectorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSubSectorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubSector(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
						subsectorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubSector subsectorAux:subsectors) {
						subsectorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubSector subsectorAux:subsectors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSubSector(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubSector.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubSector.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubSector,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSubSectorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubSector(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSubSector.getSelectedRows();
			
			SubSector subsectorLocal=new SubSector();
			
			//this.seleccionarTodosSubSector(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subsectorLocal =(SubSector) this.subsectorLogic.getSubSectors().toArray()[this.jTableDatosSubSector.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					subsectorLocal =(SubSector) this.subsectors.toArray()[this.jTableDatosSubSector.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				subsectorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
						subsectorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubSector subsectorAux:subsectors) {
						subsectorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSubSector(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubSector.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubSector.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubSector,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSubSectorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSubSectorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSubSectorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSubSector(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSubSector.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubSector subsectorAux:this.subsectorLogic.getSubSectors()) {
				
						if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							subsectorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subsectorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							subsectorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubSector subsectorAux:subsectors) {
					
						if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							subsectorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subsectorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							subsectorAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSubSector(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSubSectorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSubSector(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSubSector=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSubSector.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSubSector) {				
					conSplash=true;//false;										
					
					//this.startProcessSubSector(conSplash);
				
					this.generarReporteSubSectorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSubSectorsSeleccionados();
				//this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubSectorsSeleccionados(false);
				//this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubSectorsSeleccionados(true);
				//this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubSector();
				
				this.exportarSubSectorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSubSectors();
				//this.importarSubSectors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubSector();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSubSectorsSeleccionados();
				//this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSubSector();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSubSector)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySubSector(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
				}	
			} 			
			else if(SubSectorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSubSector) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSubSector(conSplash);
					
						//this.actualizarParametrosGeneralSubSector();
						
						this.generarReporteProcesoAccionSubSectorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SubSectorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SectorES SELECCIONADOS?", "MANTENIMIENTO DE Sector", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSubSector();
				
						this.actualizarParametrosGeneralSubSector();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.subsectorReturnGeneral=subsectorLogic.procesarAccionSubSectorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.subsectorLogic.getSubSectors(),this.subsectorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSubSectorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSubSector();
					
					SubSectorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSubSectorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubSector.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubSector.jComboBoxTiposAccionesFormularioSubSector.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSubSector(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSubSectorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSubSector();
			
			if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
			SubSector subsector=new SubSector();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSubSector(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSubSector.getSelectedItem();
			
			
			
			
			subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(subsectorsSeleccionados.size()==1) {
				for(SubSector subsectorAux:subsectorsSeleccionados) {
					subsector=subsectorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSubSector();
			
      		//this.finishProcessSubSector(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSubSectorReturnGeneral() throws Exception {
		if(this.subsectorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.subsectorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.subsectorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.subsectorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.subsectorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.subsectorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSubSector(false);
		}
		
		if(this.subsectorReturnGeneral.getConRetornoLista() || this.subsectorReturnGeneral.getConRetornoObjeto()) {
			if(this.subsectorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subsectorLogic.setSubSectors(this.subsectorReturnGeneral.getSubSectors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.subsectorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subsectorLogic.setSubSector(this.subsectorReturnGeneral.getSubSector());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSubSector(false);
		}
	}
	
	public void actualizarParametrosGeneralSubSector() throws Exception {
		
		
	}
	
	public ArrayList<SubSector> getSubSectorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSubSector) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SubSector subsectorAux:subsectorLogic.getSubSectors()) {
					if(subsectorAux.getIsSelected()) {
						subsectorsSeleccionados.add(subsectorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubSector subsectorAux:this.subsectors) {
					if(subsectorAux.getIsSelected()) {
						subsectorsSeleccionados.add(subsectorAux);				
					}
				}
			}
			
			if(subsectorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						subsectorsSeleccionados.addAll(this.subsectorLogic.getSubSectors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						subsectorsSeleccionados.addAll(this.subsectors);				
					}
				}
			}
		} else {
			subsectorsSeleccionados.add(this.subsector);
		}
		
		return subsectorsSeleccionados;
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
	
	public void generarReporteSubSectorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSubSectorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSubSectorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubSectorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubSectorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sector",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSubSectors("Todos",subsectorsSeleccionados);
		
	}	
	
	public void generarReporteNormalSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSubSectors("Todos",subsectorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSubSectorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSubSectors("Todos",subsectorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSubSector();
		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSubSector();
		
		
		//this.generarReporteSubSectors("Todos",subsectorsSeleccionados ,subsectorImplementable,subsectorImplementableHome);
	}
	
	public void mostrarImportacionSubSectors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSubSector();
		
		this.abrirFrameImportacionSubSector();		
		
			
		//this.generarReporteSubSectors("Todos",subsectorsSeleccionados ,subsectorImplementable,subsectorImplementableHome);
	}
	
	public void importarSubSectors() throws Exception {		
	
	}
	
	public void exportarSubSectorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSubSectorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSubSectorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSubSectorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sector",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSubSector(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SubSector subsectorAux:subsectorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSubSector(subsectorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//subsectorAux.setsDetalleGeneralEntityReporte(subsectorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSubSector(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_IDSECTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubSectorConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSubSector(SubSector subsector,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=subsector.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getsector_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subsector.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SubSectors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSubSector(row);				
				iRow++;
			}				
			
			for(SubSector subsectorAux:subsectorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSubSector(subsectorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSubSectorsSeleccionados() throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();		
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subsector.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("subsectors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("subsector");
			//elementRoot.appendChild(element);
		
			for(SubSector subsectorAux:subsectorsSeleccionados) {
				element = document.createElement("subsector");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSubSector(subsectorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subsectorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sector",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSubSector(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_IDSECTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(SubSectorConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSubSector(SubSector subsector,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getsector_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(subsector.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSubSector(SubSector subsector,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SubSectorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(subsector.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SubSectorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(subsector.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SubSectorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(subsector.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsector_descripcion = document.createElement(SubSectorConstantesFunciones.IDSECTOR);
		elementsector_descripcion.appendChild(document.createTextNode(subsector.getsector_descripcion()));
		element.appendChild(elementsector_descripcion);

		Element elementcodigo = document.createElement(SubSectorConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(subsector.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(SubSectorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(subsector.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(SubSectorConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(subsector.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSubSectorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SubSector> subsectorsSeleccionados=new ArrayList<SubSector>();
		
		subsectorsSeleccionados=this.getSubSectorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSubSector(subsectorsSeleccionados);
		
		this.generarReporteSubSectors("Todos",subsectorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSubSector(ArrayList<SubSector> subsectorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SubSector subsectorAux:subsectorsSeleccionados) {
				subsectorAux.setsDetalleGeneralEntityReporte(subsectorAux.toString());
			
				if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					subsectorAux.setsDescripcionGeneralEntityReporte1(subsectorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_IDSECTOR)) {
					existe=true;
					subsectorAux.setsDescripcionGeneralEntityReporte1(subsectorAux.getsector_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					subsectorAux.setsDescripcionGeneralEntityReporte1(subsectorAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					subsectorAux.setsDescripcionGeneralEntityReporte1(subsectorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(SubSectorConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					subsectorAux.setsDescripcionGeneralEntityReporte1(subsectorAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubSectorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSubSector(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSubSector=true;
				this.isVisibilidadCeldaNuevoRelacionesSubSector=true;
				this.isVisibilidadCeldaGuardarCambiosSubSector=true;
			}
			
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=true;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=true;
			this.isVisibilidadCeldaEliminarSubSector=true;
			this.isVisibilidadCeldaCancelarSubSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=true;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSubSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=true;
			this.isVisibilidadCeldaGuardarCambiosSubSector=true;
			this.isVisibilidadCeldaModificarSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=true;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
			this.isVisibilidadCeldaModificarSubSector=true;
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
			this.isVisibilidadCeldaCancelarSubSector=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubSector=false;
				} else {
					this.isVisibilidadCeldaGuardarSubSector=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SubSectorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSubSector=true;
			this.isVisibilidadCeldaNuevoRelacionesSubSector=true;
			this.isVisibilidadCeldaGuardarCambiosSubSector=true;
		} else {
			this.actualizarEstadoPanelsSubSector(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSubSector=false;
			//this.isVisibilidadCeldaVerFormSubSector=false;
			this.isVisibilidadCeldaDuplicarSubSector=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!subsectorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
		} else {
			this.isVisibilidadCeldaNuevoSubSector=false;
			this.isVisibilidadCeldaGuardarCambiosSubSector=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(subsectorSessionBean.getEsGuardarRelacionado()) {
			if(!subsectorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSubSector=false;												
			}
			
			this.jButtonCerrarSubSector.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSubSector=false;
		}
		
		if(!this.permiteMantenimiento(this.subsector)) {
			this.isVisibilidadCeldaActualizarSubSector=false;
			this.isVisibilidadCeldaEliminarSubSector=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSubSector() {
	}
	
	public void actualizarEstadoPanelsSubSector(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSubSector!=null) {
				this.jScrollPanelDatosEdicionSubSector.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubSector!=null) {
				this.jScrollPanelDatosSubSector.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubSector!=null) {
				this.jPanelPaginacionSubSector.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.subsectorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSubSector!=null) {
					this.jTabbedPaneBusquedasSubSector.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.subsectorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubSector!=null) {
				this.jTabbedPaneBusquedasSubSector.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSubSector!=null) {
				this.jPanelParametrosReportesSubSector.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdSector=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSector) {this.jTabbedPaneBusquedasSubSector.remove(jPanelFK_IdSectorSubSector);}
		}
		
	}

	public void setVisibilidadBusquedasParaSector(Boolean isParaSector){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSectorNegation=!isParaSector;

			this.isVisibilidadFK_IdSector=isParaSector;
			if(!this.isVisibilidadFK_IdSector) {this.jTabbedPaneBusquedasSubSector.remove(jPanelFK_IdSectorSubSector);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SubSectorSessionBean subsectorSessionBean=new SubSectorSessionBean();
		
		if(this.subsectorSessionBean==null) {
			this.subsectorSessionBean=new SubSectorSessionBean();
		}
		
		this.subsectorSessionBean.setsUltimaBusquedaSubSector(this.getsAccionBusqueda());
		this.subsectorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.subsectorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			subsectorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSector")) {
			subsectorSessionBean.setid_sector(this.getid_sectorFK_IdSector());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SubSectorSessionBean subsectorSessionBean=new SubSectorSessionBean();
		
		if(this.subsectorSessionBean==null) {
			this.subsectorSessionBean=new SubSectorSessionBean();
		}
		
		if(this.subsectorSessionBean.getsUltimaBusquedaSubSector()!=null&&!this.subsectorSessionBean.getsUltimaBusquedaSubSector().equals("")) {
			this.setsAccionBusqueda(subsectorSessionBean.getsUltimaBusquedaSubSector());
			this.setiNumeroPaginacion(subsectorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(subsectorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(subsectorSessionBean.getid_empresa());
				subsectorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSector")) {
				this.setid_sectorFK_IdSector(subsectorSessionBean.getid_sector());
				subsectorSessionBean.setid_sector(-1L);
			}
		}
		
		this.subsectorSessionBean.setsUltimaBusquedaSubSector("");
		this.subsectorSessionBean.setiNumeroPaginacion(SubSectorConstantesFunciones.INUMEROPAGINACION);
		this.subsectorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSubSector(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSubSector() {
		this.updateBorderResaltarBusquedasFormularioSubSector();
		this.updateVisibilidadBusquedasFormularioSubSector();
		this.updateHabilitarBusquedasFormularioSubSector();
	}
	
	public void updateBorderResaltarBusquedasFormularioSubSector() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSubSector.getComponents().length>0) {
	

		if(this.subsectorConstantesFunciones.resaltarFK_IdSectorSubSector!=null) {
			index= this.jTabbedPaneBusquedasSubSector.indexOfComponent(this.jPanelFK_IdSectorSubSector);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubSector.getComponent(index);
				jPanel.setBorder(this.subsectorConstantesFunciones.resaltarFK_IdSectorSubSector);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSubSector() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSubSector.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubSector.indexOfComponent(this.jPanelFK_IdSectorSubSector);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSubSector.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.subsectorConstantesFunciones.mostrarFK_IdSectorSubSector);
			if(!this.subsectorConstantesFunciones.mostrarFK_IdSectorSubSector && index>-1) {
				this.jTabbedPaneBusquedasSubSector.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSubSector() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSubSector.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSubSector.indexOfComponent(this.jPanelFK_IdSectorSubSector);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSubSector.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.subsectorConstantesFunciones.activarFK_IdSectorSubSector);
				this.jTabbedPaneBusquedasSubSector.setEnabledAt(index,this.subsectorConstantesFunciones.activarFK_IdSectorSubSector);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSubSector(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdSector")) {
			index= this.jTabbedPaneBusquedasSubSector.indexOfComponent(this.jPanelFK_IdSectorSubSector);

			this.jTabbedPaneBusquedasSubSector.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSubSector.getComponent(index);

			this.subsectorConstantesFunciones.setResaltarFK_IdSectorSubSector(resaltar);

			jPanel.setBorder(this.subsectorConstantesFunciones.resaltarFK_IdSectorSubSector);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSubSector.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSubSector() throws Exception {

		if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSubSector();
		this.updateVisibilidadResaltarControlesFormularioSubSector();
		this.updateHabilitarResaltarControlesFormularioSubSector();
		
	}
	
	public void updateBorderResaltarControlesFormularioSubSector() throws Exception {
		if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.subsectorConstantesFunciones.resaltaridSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setBorder(this.subsectorConstantesFunciones.resaltaridSubSector);}
		if(this.subsectorConstantesFunciones.resaltarid_empresaSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setBorder(this.subsectorConstantesFunciones.resaltarid_empresaSubSector);}
		if(this.subsectorConstantesFunciones.resaltarid_sectorSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setBorder(this.subsectorConstantesFunciones.resaltarid_sectorSubSector);}
		if(this.subsectorConstantesFunciones.resaltarcodigoSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setBorder(this.subsectorConstantesFunciones.resaltarcodigoSubSector);}
		if(this.subsectorConstantesFunciones.resaltarnombreSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setBorder(this.subsectorConstantesFunciones.resaltarnombreSubSector);}
		if(this.subsectorConstantesFunciones.resaltardescripcionSubSector!=null && this.jInternalFrameDetalleFormSubSector!=null) {this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setBorder(this.subsectorConstantesFunciones.resaltardescripcionSubSector);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSubSector() throws Exception {		
		if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
	
		//this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setVisible(this.subsectorConstantesFunciones.mostraridSubSector);
		this.jInternalFrameDetalleFormSubSector.jPanelidSubSector.setVisible(this.subsectorConstantesFunciones.mostraridSubSector);
		//this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setVisible(this.subsectorConstantesFunciones.mostrarid_empresaSubSector);
		this.jInternalFrameDetalleFormSubSector.jPanelid_empresaSubSector.setVisible(this.subsectorConstantesFunciones.mostrarid_empresaSubSector);
		//this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setVisible(this.subsectorConstantesFunciones.mostrarid_sectorSubSector);
		this.jInternalFrameDetalleFormSubSector.jPanelid_sectorSubSector.setVisible(this.subsectorConstantesFunciones.mostrarid_sectorSubSector);
		//this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setVisible(this.subsectorConstantesFunciones.mostrarcodigoSubSector);
		this.jInternalFrameDetalleFormSubSector.jPanelcodigoSubSector.setVisible(this.subsectorConstantesFunciones.mostrarcodigoSubSector);
		//this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setVisible(this.subsectorConstantesFunciones.mostrarnombreSubSector);
		this.jInternalFrameDetalleFormSubSector.jPanelnombreSubSector.setVisible(this.subsectorConstantesFunciones.mostrarnombreSubSector);
		//this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setVisible(this.subsectorConstantesFunciones.mostrardescripcionSubSector);
		this.jInternalFrameDetalleFormSubSector.jPaneldescripcionSubSector.setVisible(this.subsectorConstantesFunciones.mostrardescripcionSubSector);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSubSector() throws Exception {
		if(this.jInternalFrameDetalleFormSubSector==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubSector!=null) {
	
		this.jInternalFrameDetalleFormSubSector.jLabelidSubSector.setEnabled(this.subsectorConstantesFunciones.activaridSubSector);
		this.jInternalFrameDetalleFormSubSector.jComboBoxid_empresaSubSector.setEnabled(this.subsectorConstantesFunciones.activarid_empresaSubSector);
		this.jInternalFrameDetalleFormSubSector.jComboBoxid_sectorSubSector.setEnabled(this.subsectorConstantesFunciones.activarid_sectorSubSector);
		this.jInternalFrameDetalleFormSubSector.jTextFieldcodigoSubSector.setEnabled(this.subsectorConstantesFunciones.activarcodigoSubSector);
		this.jInternalFrameDetalleFormSubSector.jTextAreanombreSubSector.setEnabled(this.subsectorConstantesFunciones.activarnombreSubSector);
		this.jInternalFrameDetalleFormSubSector.jTextAreadescripcionSubSector.setEnabled(this.subsectorConstantesFunciones.activardescripcionSubSector);
		}
	}
	
		
}