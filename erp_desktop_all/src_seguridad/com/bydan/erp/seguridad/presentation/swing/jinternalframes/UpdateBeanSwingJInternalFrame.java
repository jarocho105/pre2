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

import com.bydan.erp.seguridad.util.UpdateConstantesFunciones;
import com.bydan.erp.seguridad.util.UpdateParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.UpdateParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.UpdateBean;
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
public class UpdateBeanSwingJInternalFrame extends UpdateJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UpdateBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Update> updateValidator = new ClassValidator<Update>(Update.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Update update;	
	public Update updateAux;
	public Update updateAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Update updateTotales;
	public Long idUpdateActual;
	public Long iIdNuevoUpdate=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosUpdateDetalle=false;

	public Boolean getIsTienePermisosUpdateDetalle() {
		return isTienePermisosUpdateDetalle;
	}

	public void setIsTienePermisosUpdateDetalle(Boolean isTienePermisosUpdateDetalle) {
		this.isTienePermisosUpdateDetalle= isTienePermisosUpdateDetalle;
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
	
	public Boolean isPermisoTodoUpdate;
	public Boolean isPermisoNuevoUpdate;
	public Boolean isPermisoActualizarUpdate;
	public Boolean isPermisoActualizarOriginalUpdate;
	public Boolean isPermisoEliminarUpdate;
	public Boolean isPermisoGuardarCambiosUpdate;
	public Boolean isPermisoConsultaUpdate;
	public Boolean isPermisoBusquedaUpdate;
	public Boolean isPermisoReporteUpdate;
	public Boolean isPermisoPaginacionMedioUpdate;
	public Boolean isPermisoPaginacionAltoUpdate;
	public Boolean isPermisoPaginacionTodoUpdate;
	public Boolean isPermisoCopiarUpdate;
	public Boolean isPermisoVerFormUpdate;
	public Boolean isPermisoDuplicarUpdate;
	public Boolean isPermisoOrdenUpdate;
	
	
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
	
	public UpdateParameterReturnGeneral updateReturnGeneral;
	public UpdateParameterReturnGeneral updateParameterGeneral;
	
	

	public UpdateDetalleLogic updatedetalleLogic=null;

	public UpdateDetalleLogic getUpdateDetalleLogic() {
		return updatedetalleLogic;
	}

	public void setUpdateDetalleLogic(UpdateDetalleLogic updatedetalleLogic) {
		this.updatedetalleLogic = updatedetalleLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUpdate=false;
	public Boolean esParaAccionDesdeFormularioUpdate=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UpdateSessionBeanAdditional updateSessionBeanAdditional=null;
	
	public UpdateSessionBeanAdditional getUpdateSessionBeanAdditional() {
		return this.updateSessionBeanAdditional;
	}
	
	public void setUpdateSessionBeanAdditional(UpdateSessionBeanAdditional updateSessionBeanAdditional) {
		try {
			this.updateSessionBeanAdditional=updateSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UpdateBeanSwingJInternalFrameAdditional updateBeanSwingJInternalFrameAdditional=null;
	//public class UpdateBeanSwingJInternalFrame
	
	public UpdateBeanSwingJInternalFrameAdditional getUpdateBeanSwingJInternalFrameAdditional() {
		return this.updateBeanSwingJInternalFrameAdditional;
	}
	
	public void setUpdateBeanSwingJInternalFrameAdditional(UpdateBeanSwingJInternalFrameAdditional updateBeanSwingJInternalFrameAdditional) {
		try {
			this.updateBeanSwingJInternalFrameAdditional=updateBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UpdateLogic updateLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Update updateBean;
	public UpdateConstantesFunciones updateConstantesFunciones;
	//public UpdateParameterReturnGeneral updateReturnGeneral;
	
	//FK
	
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<Update> updates;	
	//public List<Update> updatesEliminados;
	//public List<Update> updatesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUpdate=false;
	public Boolean isVisibilidadCeldaDuplicarUpdate=true;
	public Boolean isVisibilidadCeldaCopiarUpdate=true;
	public Boolean isVisibilidadCeldaVerFormUpdate=true;
	public Boolean isVisibilidadCeldaOrdenUpdate=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUpdate=false;
	public Boolean isVisibilidadCeldaModificarUpdate=false;
	public Boolean isVisibilidadCeldaActualizarUpdate=false;
	public Boolean isVisibilidadCeldaEliminarUpdate=false;
	public Boolean isVisibilidadCeldaCancelarUpdate=false;
	public Boolean isVisibilidadCeldaGuardarUpdate=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUpdate=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoUpdate() {
		return this.iIdNuevoUpdate;
	}

	public void setiIdNuevoUpdate(Long iIdNuevoUpdate) {
		this.iIdNuevoUpdate = iIdNuevoUpdate;
	}
	
	public Long getidUpdateActual() {
		return this.idUpdateActual;
	}

	public void setidUpdateActual(Long idUpdateActual) {
		this.idUpdateActual = idUpdateActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Update getupdate() {
		return this.update;
	}

	public void setupdate(Update update) {
		this.update = update;
	}
	
	public Update getupdateAux() {
		return this.updateAux;
	}

	public void setupdateAux(Update updateAux) {
		this.updateAux = updateAux;
	}				
	
	public Update getupdateAnterior() {
		return this.updateAnterior;
	}

	public void setupdateAnterior(Update updateAnterior) {
		this.updateAnterior = updateAnterior;
	}	
	
	public Update getupdateTotales() {
		return this.updateTotales;
	}

	public void setupdateTotales(Update updateTotales) {
		this.updateTotales = updateTotales;
	}	
	
	public Update getupdateBean() {
		return this.updateBean;
	}

	public void setupdateBean(Update updateBean) {
		this.updateBean = updateBean;
	}	
	
	public UpdateParameterReturnGeneral getupdateReturnGeneral() {
		return this.updateReturnGeneral;
	}

	public void setupdateReturnGeneral(UpdateParameterReturnGeneral updateReturnGeneral) {
		this.updateReturnGeneral = updateReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UpdateLogic getUpdateLogic()	{		
		return updateLogic;
	}

	public void setUpdateLogic(UpdateLogic updateLogic) {
		this.updateLogic = updateLogic;
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
	
	public Boolean getIsEsNuevoUpdate() {
		return isEsNuevoUpdate;
	}

	public void setIsEsNuevoUpdate(Boolean isEsNuevoUpdate) {
		this.isEsNuevoUpdate = isEsNuevoUpdate;
	}

	public Boolean getEsParaAccionDesdeFormularioUpdate() {
		return esParaAccionDesdeFormularioUpdate;
	}
	
	public void setEsParaAccionDesdeFormularioUpdate(Boolean esParaAccionDesdeFormularioUpdate) {
		this.esParaAccionDesdeFormularioUpdate = esParaAccionDesdeFormularioUpdate;
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
	
	
	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.updateSessionBean==null) {
				this.updateSessionBean=new UpdateSessionBean();
			}

			if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(updateSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.updateSessionBean==null) {
				this.updateSessionBean=new UpdateSessionBean();
			}

			if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(updateSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	
	
	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.update!=null) {
						this.update.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormUpdate!=null) {
						this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioUpdate.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormUpdate!=null) {
						if(this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.getItemCount()>0) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioUpdate!=null) {
						jComboBoxid_anioFK_IdAnioUpdate.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioUpdate!=null) {
							//jComboBoxid_anioFK_IdAnioUpdate.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioUpdate.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioUpdate.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioUpdateGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioUpdateGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioUpdateGenerico!=null && jComboBoxid_anioUpdateGenerico.getItemCount()>0) {
					jComboBoxid_anioUpdateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.update!=null) {
						this.update.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormUpdate!=null) {
						this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesUpdate.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormUpdate!=null) {
						if(this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.getItemCount()>0) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesUpdate!=null) {
						jComboBoxid_mesFK_IdMesUpdate.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesUpdate!=null) {
							//jComboBoxid_mesFK_IdMesUpdate.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesUpdate.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesUpdate.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesUpdateGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesUpdateGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesUpdateGenerico!=null && jComboBoxid_mesUpdateGenerico.getItemCount()>0) {
					jComboBoxid_mesUpdateGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Update update,JComboBox jComboBoxid_anioUpdateGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioUpdateGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioUpdateGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				update.setid_anio(anioAux.getId());
				update.setanio_descripcion(UpdateConstantesFunciones.getAnioDescripcion(anioAux));
				update.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(Update update,JComboBox jComboBoxid_mesUpdateGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesUpdateGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesUpdateGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				update.setid_mes(mesAux.getId());
				update.setmes_descripcion(UpdateConstantesFunciones.getMesDescripcion(mesAux));
				update.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUpdate!=null) { 
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUpdate!=null) { 
					}

					if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioUpdate.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioUpdate.addItem(anio);
							}
						}

						if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUpdate!=null) { 
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUpdate!=null) { 
					}

					if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesUpdate.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesUpdate.addItem(mes);
							}
						}

						if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUpdate!=null) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormUpdate!=null) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioUpdate.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioUpdate.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUpdate!=null) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormUpdate!=null) {
							this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesUpdate.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesUpdate.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUpdate() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UpdateConstantesFunciones.refrescarForeignKeysDescripcionesUpdate(this.updateLogic.getUpdates());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UpdateConstantesFunciones.refrescarForeignKeysDescripcionesUpdate(this.updates);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//updateLogic.setUpdates(this.updates);
			updateLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UpdateParameterReturnGeneral getUpdateParameterGeneral() {
		return this.updateParameterGeneral;
	}
	
	public void setUpdateParameterGeneral(UpdateParameterReturnGeneral updateParameterGeneral) {
		this.updateParameterGeneral = updateParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUpdate() {
		return isPermisoTodoUpdate;
	}

	public void setIsPermisoTodoUpdate(Boolean isPermisoTodoUpdate) {
		this.isPermisoTodoUpdate = isPermisoTodoUpdate;
	}

	public Boolean getIsPermisoNuevoUpdate() {
		return isPermisoNuevoUpdate;
	}

	public void setIsPermisoNuevoUpdate(Boolean isPermisoNuevoUpdate) {
		this.isPermisoNuevoUpdate = isPermisoNuevoUpdate;
	}

	public Boolean getIsPermisoActualizarUpdate() {
		return isPermisoActualizarUpdate;
	}

	public void setIsPermisoActualizarUpdate(Boolean isPermisoActualizarUpdate) {
		this.isPermisoActualizarUpdate = isPermisoActualizarUpdate;
	}

	public Boolean getIsPermisoEliminarUpdate() {
		return isPermisoEliminarUpdate;
	}

	public void setIsPermisoEliminarUpdate(Boolean isPermisoEliminarUpdate) {
		this.isPermisoEliminarUpdate = isPermisoEliminarUpdate;
	}

	public Boolean getIsPermisoGuardarCambiosUpdate() {
		return isPermisoGuardarCambiosUpdate;
	}

	public void setIsPermisoGuardarCambiosUpdate(Boolean isPermisoGuardarCambiosUpdate) {
		this.isPermisoGuardarCambiosUpdate = isPermisoGuardarCambiosUpdate;
	}
	
	public Boolean getIsPermisoConsultaUpdate() {
		return isPermisoConsultaUpdate;
	}

	public void setIsPermisoConsultaUpdate(Boolean isPermisoConsultaUpdate) {
		this.isPermisoConsultaUpdate = isPermisoConsultaUpdate;
	}

	public Boolean getIsPermisoBusquedaUpdate() {
		return isPermisoBusquedaUpdate;
	}

	public void setIsPermisoBusquedaUpdate(Boolean isPermisoBusquedaUpdate) {
		this.isPermisoBusquedaUpdate = isPermisoBusquedaUpdate;
	}

	public Boolean getIsPermisoReporteUpdate() {
		return isPermisoReporteUpdate;
	}

	public void setIsPermisoReporteUpdate(Boolean isPermisoReporteUpdate) {
		this.isPermisoReporteUpdate = isPermisoReporteUpdate;
	}
	
	public Boolean getIsPermisoPaginacionMedioUpdate() {
		return isPermisoPaginacionMedioUpdate;
	}

	public void setIsPermisoPaginacionMedioUpdate(Boolean isPermisoPaginacionMedioUpdate) {
		this.isPermisoPaginacionMedioUpdate = isPermisoPaginacionMedioUpdate;
	}
	
	public Boolean getIsPermisoPaginacionTodoUpdate() {
		return isPermisoPaginacionTodoUpdate;
	}

	public void setIsPermisoPaginacionTodoUpdate(Boolean isPermisoPaginacionTodoUpdate) {
		this.isPermisoPaginacionTodoUpdate = isPermisoPaginacionTodoUpdate;
	}
	
	public Boolean getIsPermisoPaginacionAltoUpdate() {
		return isPermisoPaginacionAltoUpdate;
	}

	public void setIsPermisoPaginacionAltoUpdate(Boolean isPermisoPaginacionAltoUpdate) {
		this.isPermisoPaginacionAltoUpdate = isPermisoPaginacionAltoUpdate;
	}
	
	public Boolean getIsPermisoCopiarUpdate() {
		return isPermisoCopiarUpdate;
	}

	public void setIsPermisoCopiarUpdate(Boolean isPermisoCopiarUpdate) {
		this.isPermisoCopiarUpdate = isPermisoCopiarUpdate;
	}
	
	public Boolean getIsPermisoVerFormUpdate() {
		return isPermisoVerFormUpdate;
	}

	public void setIsPermisoVerFormUpdate(Boolean isPermisoVerFormUpdate) {
		this.isPermisoVerFormUpdate = isPermisoVerFormUpdate;
	}
	
	public Boolean getIsPermisoDuplicarUpdate() {
		return isPermisoDuplicarUpdate;
	}

	public void setIsPermisoDuplicarUpdate(Boolean isPermisoDuplicarUpdate) {
		this.isPermisoDuplicarUpdate = isPermisoDuplicarUpdate;
	}
	
	public Boolean getIsPermisoOrdenUpdate() {
		return isPermisoOrdenUpdate;
	}

	public void setIsPermisoOrdenUpdate(Boolean isPermisoOrdenUpdate) {
		this.isPermisoOrdenUpdate = isPermisoOrdenUpdate;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUpdate() {
		return isVisibilidadCeldaNuevoUpdate;
	}

	public void setIsVisibilidadCeldaNuevoUpdate(Boolean isVisibilidadCeldaNuevoUpdate) {
		this.isVisibilidadCeldaNuevoUpdate = isVisibilidadCeldaNuevoUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUpdate() {
		return isVisibilidadCeldaDuplicarUpdate;
	}

	public void setIsVisibilidadCeldaDuplicarUpdate(Boolean isVisibilidadCeldaDuplicarUpdate) {
		this.isVisibilidadCeldaDuplicarUpdate = isVisibilidadCeldaDuplicarUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUpdate() {
		return isVisibilidadCeldaCopiarUpdate;
	}

	public void setIsVisibilidadCeldaCopiarUpdate(Boolean isVisibilidadCeldaCopiarUpdate) {
		this.isVisibilidadCeldaCopiarUpdate = isVisibilidadCeldaCopiarUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUpdate() {
		return isVisibilidadCeldaVerFormUpdate;
	}

	public void setIsVisibilidadCeldaVerFormUpdate(Boolean isVisibilidadCeldaVerFormUpdate) {
		this.isVisibilidadCeldaVerFormUpdate = isVisibilidadCeldaVerFormUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUpdate() {
		return isVisibilidadCeldaOrdenUpdate;
	}

	public void setIsVisibilidadCeldaOrdenUpdate(Boolean isVisibilidadCeldaOrdenUpdate) {
		this.isVisibilidadCeldaOrdenUpdate = isVisibilidadCeldaOrdenUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUpdate() {
		return isVisibilidadCeldaNuevoRelacionesUpdate;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUpdate(Boolean isVisibilidadCeldaNuevoRelacionesUpdate) {
		this.isVisibilidadCeldaNuevoRelacionesUpdate = isVisibilidadCeldaNuevoRelacionesUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUpdate() {
		return isVisibilidadCeldaModificarUpdate;
	}

	public void setIsVisibilidadCeldaModificarUpdate(Boolean isVisibilidadCeldaModificarUpdate) {
		this.isVisibilidadCeldaModificarUpdate = isVisibilidadCeldaModificarUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUpdate() {
		return isVisibilidadCeldaActualizarUpdate;
	}

	public void setIsVisibilidadCeldaActualizarUpdate(Boolean isVisibilidadCeldaActualizarUpdate) {
		this.isVisibilidadCeldaActualizarUpdate = isVisibilidadCeldaActualizarUpdate;
	}

	public Boolean getIsVisibilidadCeldaEliminarUpdate() {
		return isVisibilidadCeldaEliminarUpdate;
	}

	public void setIsVisibilidadCeldaEliminarUpdate(Boolean isVisibilidadCeldaEliminarUpdate) {
		this.isVisibilidadCeldaEliminarUpdate = isVisibilidadCeldaEliminarUpdate;
	}

	public Boolean getIsVisibilidadCeldaCancelarUpdate() {
		return isVisibilidadCeldaCancelarUpdate;
	}

	public void setIsVisibilidadCeldaCancelarUpdate(Boolean isVisibilidadCeldaCancelarUpdate) {
		this.isVisibilidadCeldaCancelarUpdate = isVisibilidadCeldaCancelarUpdate;
	}

	public Boolean getIsVisibilidadCeldaGuardarUpdate() {
		return isVisibilidadCeldaGuardarUpdate;
	}

	public void setIsVisibilidadCeldaGuardarUpdate(Boolean isVisibilidadCeldaGuardarUpdate) {
		this.isVisibilidadCeldaGuardarUpdate = isVisibilidadCeldaGuardarUpdate;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUpdate() {
		return isVisibilidadCeldaGuardarCambiosUpdate;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUpdate(Boolean isVisibilidadCeldaGuardarCambiosUpdate) {
		this.isVisibilidadCeldaGuardarCambiosUpdate = isVisibilidadCeldaGuardarCambiosUpdate;
	}
		
	public UpdateSessionBean getupdateSessionBean() {
		return this.updateSessionBean;
	}
	
	public void setupdateSessionBean(UpdateSessionBean updateSessionBean) {
		this.updateSessionBean=updateSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUpdate(Update update)throws Exception {
		try {
			
				this.setActualParaGuardarAnioForeignKey(update,null);
				this.setActualParaGuardarMesForeignKey(update,null);
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
	
	public void bugActualizarReferenciaActual(Update update,Update updateAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUpdate(update);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		updateAux.setId(update.getId());
		updateAux.setVersionRow(update.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUpdate();
		
			int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = updateValidator.getInvalidValues(this.update);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			updateLogic.setDatosCliente(datosCliente);
			updateLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				updateAux=new  Update();
				
				updateAux.setIsNew(true);
				updateAux.setIsChanged(true);
				
				updateAux.setUpdateOriginal(this.update);
				
				updateAux.setId(this.update.getId());	
				updateAux.setVersionRow(this.update.getVersionRow());	
				updateAux.setid_anio(this.update.getid_anio());	
				updateAux.setid_mes(this.update.getid_mes());	
				updateAux.setcodigo(this.update.getcodigo());	
				updateAux.setcodigo_proceso(this.update.getcodigo_proceso());	
				updateAux.setquery_resumen(this.update.getquery_resumen());	
				updateAux.setnumero_intento(this.update.getnumero_intento());	
				updateAux.setfecha(this.update.getfecha());	
				updateAux.setfecha_archivo(this.update.getfecha_archivo());	
				updateAux.setorden(this.update.getorden());	
				updateAux.setejecutado(this.update.getejecutado());	
				updateAux.setesta_activo(this.update.getesta_activo());	
				updateAux.setdescripcion(this.update.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.updateSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.updateSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(updateAux,updateLogic.getUpdates());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updateAux,updates);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.updateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updateLogic.saveUpdates();//WithConnection
						//updateLogic.getSetVersionRowUpdates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.update,updateAux);
					
					this.refrescarForeignKeysDescripcionesUpdate();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				updateAux=new  Update();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.updateSessionBean.getEsGuardarRelacionado() 
					|| (this.updateSessionBean.getEsGuardarRelacionado() && this.update.getId()>=0)) {
						
					updateAux.setIsNew(false);
				}
				
				updateAux.setIsDeleted(false);
			
				updateAux.setId(this.update.getId());	
				updateAux.setVersionRow(this.update.getVersionRow());	
				updateAux.setid_anio(this.update.getid_anio());	
				updateAux.setid_mes(this.update.getid_mes());	
				updateAux.setcodigo(this.update.getcodigo());	
				updateAux.setcodigo_proceso(this.update.getcodigo_proceso());	
				updateAux.setquery_resumen(this.update.getquery_resumen());	
				updateAux.setnumero_intento(this.update.getnumero_intento());	
				updateAux.setfecha(this.update.getfecha());	
				updateAux.setfecha_archivo(this.update.getfecha_archivo());	
				updateAux.setorden(this.update.getorden());	
				updateAux.setejecutado(this.update.getejecutado());	
				updateAux.setesta_activo(this.update.getesta_activo());	
				updateAux.setdescripcion(this.update.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(updateAux,updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updateAux,updates);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.updateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updateLogic.saveUpdates();//WithConnection
						//updateLogic.getSetVersionRowUpdates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.update,updateAux);
					
					this.refrescarForeignKeysDescripcionesUpdate();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				updateAux=new  Update();
				
				updateAux.setIsNew(false);
				updateAux.setIsChanged(false);
				
				updateAux.setIsDeleted(true);
				
				updateAux.setId(this.update.getId());	
				updateAux.setVersionRow(this.update.getVersionRow());	
				updateAux.setid_anio(this.update.getid_anio());	
				updateAux.setid_mes(this.update.getid_mes());	
				updateAux.setcodigo(this.update.getcodigo());	
				updateAux.setcodigo_proceso(this.update.getcodigo_proceso());	
				updateAux.setquery_resumen(this.update.getquery_resumen());	
				updateAux.setnumero_intento(this.update.getnumero_intento());	
				updateAux.setfecha(this.update.getfecha());	
				updateAux.setfecha_archivo(this.update.getfecha_archivo());	
				updateAux.setorden(this.update.getorden());	
				updateAux.setejecutado(this.update.getejecutado());	
				updateAux.setesta_activo(this.update.getesta_activo());	
				updateAux.setdescripcion(this.update.getdescripcion());	
				
				if(this.updateSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.updateAux.getId()>=0) {	
						this.updatesEliminados.add(updateAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(updateAux,updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updateAux,updates);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.updateSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updateSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updateLogic.saveUpdates();//WithConnection
						//updateLogic.getSetVersionRowUpdates();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updateSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.quitarFilaTotales();}
							updateAux.setUpdateDetalles(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleLogic.getUpdateDetalles());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.updateSessionBean.getEstaModoGuardarRelaciones() 
								|| this.updateSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(updateAux,updateLogic.getUpdates());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(updateAux,updates);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getUpdates().addAll(this.updatesEliminados);
					
					updateLogic.saveUpdates();//WithConnection
					//updateLogic.getSetVersionRowUpdates();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUpdate();
				
				this.updatesEliminados= new ArrayList<Update>();		
			}
			
			if(this.updateSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Update GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.update=updateAux;
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
      		//this.finishProcessUpdate();
      	}
		
	}	
	
	public void actualizarRelaciones(Update updateLocal) throws Exception {
		
		if(this.updateSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				updateLocal.setUpdateDetalles(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleLogic.getUpdateDetalles());
			
			} else {
			
				updateLocal.setUpdateDetalles(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalles);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Update updateLocal) throws Exception {	
		if(this.updateSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				updateLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				updateLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUpdateActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = updateValidator.getInvalidValues(this.update);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Update update,List<Update> updates) throws Exception {
		try	{		
			UpdateConstantesFunciones.actualizarLista(update,updates,this.updateSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Update update,List<Update> updates) throws Exception {
		try	{			
			UpdateConstantesFunciones.actualizarSelectedLista(update,updates);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Update> updatesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				updatesLocal=this.updateLogic.getUpdates();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				updatesLocal=this.updates;
			}
			//ARCHITECTURE
		
			for(Update updateLocal:updatesLocal) {
				if(this.permiteMantenimiento(updateLocal) && updateLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UpdateConstantesFunciones.getUpdateLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelid_anioUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelid_mesUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelcodigoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.CODIGOPROCESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelcodigo_procesoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.QUERYRESUMEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelquery_resumenUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.NUMEROINTENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelnumero_intentoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelfechaUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.FECHAARCHIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelfecha_archivoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelordenUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.EJECUTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelejecutadoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelesta_activoUpdate,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabeldescripcionUpdate,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelid_anioUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelid_mesUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelcodigoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelcodigo_procesoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelquery_resumenUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelnumero_intentoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelfechaUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelfecha_archivoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelordenUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelejecutadoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabelesta_activoUpdate,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdate.jLabeldescripcionUpdate,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("UpdateDetalle")) {
			if(this.update==null) {
				this.update= new Update();
			}

			if(this.updateSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUpdate
				this.setVariablesFormularioToObjetoActualUpdate(this.update,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);

				this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.getupdatedetalle().setUpdate(this.update);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoUpdate--;	
		
		
		this.updateAux=new Update();
		
		this.updateAux.setId(this.iIdNuevoUpdate);
		this.updateAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.updateLogic.getUpdates().add(this.updateAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.updates.add(this.updateAux);
		}
		//ARCHITECTURE
		
		this.update=this.updateAux;
		
		if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUpdate(this.update);
			this.setVariablesObjetoActualToFormularioForeignKeyUpdate(this.update);
		}
				
		//this.setDefaultControlesUpdate();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUpdate();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUpdate();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUpdate();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUpdate(this.updateBean,this.update,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UpdateConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.updateSessionBean.getConGuardarRelaciones()) {
			classes=UpdateConstantesFunciones.getClassesRelationshipsOfUpdate(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.updateReturnGeneral=updateLogic.procesarEventosUpdatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.updateLogic.getUpdates(),this.update,this.updateParameterGeneral,this.isEsNuevoUpdate,classes);//this.updateLogic.getUpdate()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUpdate(this.updateReturnGeneral,this.updateBean,false);
		
		if(this.updateReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUpdate(this.updateReturnGeneral.getUpdate());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUpdate(this.updateReturnGeneral.getUpdate());
		}
		
		if(this.updateReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUpdate(this.updateReturnGeneral.getUpdate(),classes);//this.updateBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUpdate(this.update,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUpdate();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUpdate();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UpdateBeanSwingJInternalFrameAdditional.RecargarFormUpdate(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUpdate(false);
						
			if(updateSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.getEsGuardarRelacionado() && UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUpdateDetalleActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdate();
			}
			
			this.actualizarVisualTableDatosUpdate();
			
			this.jTableDatosUpdate.setRowSelectionInterval(this.getIndiceNuevoUpdate(), this.getIndiceNuevoUpdate());
			
			this.seleccionarFilaTablaUpdateActual();
						
			this.actualizarEstadoCeldasBotonesUpdate("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUpdate(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarcodigoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarcodigo_procesoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarquery_resumenUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarnumero_intentoUpdate);
		this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarfechaUpdate);
		this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarfecha_archivoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarordenUpdate);
		this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarejecutadoUpdate);
		this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activaresta_activoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activardescripcionUpdate);	
		
		this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarid_anioUpdate);
		this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setEnabled(isHabilitar && this.updateConstantesFunciones.activarid_mesUpdate);
	};
	
	public void setDefaultControlesUpdate() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUpdate(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.updateSessionBean.setConGuardarRelaciones(true);			
			this.updateSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.updateSessionBean.setConGuardarRelaciones(false);			
			this.updateSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoUpdate() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Update updateAux:this.updateLogic.getUpdates()) {
				if(updateAux.getId().equals(this.iIdNuevoUpdate)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Update updateAux:this.updates) {
				if(updateAux.getId().equals(this.iIdNuevoUpdate)) {
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
	
	public int getIndiceActualUpdate(Update update,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Update updateAux:this.updateLogic.getUpdates()) {
				if(updateAux.getId().equals(update.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Update updateAux:this.updates) {
				if(updateAux.getId().equals(update.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUpdate(Update updateOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Update updateAux:this.updateLogic.getUpdates()) {
				if(updateAux.getUpdateOriginal().getId().equals(updateOriginal.getId())) {
					existe=true;
					updateOriginal.setId(updateAux.getId());
					updateOriginal.setVersionRow(updateAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Update updateAux:this.updates) {
				if(updateAux.getUpdateOriginal().getId().equals(updateOriginal.getId())) {
					existe=true;
					updateOriginal.setId(updateAux.getId());
					updateOriginal.setVersionRow(updateAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUpdate(Boolean esParaCancelar) throws Exception {
		updatesAux=new ArrayList<Update>();
		updateAux=new Update();
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Update updateAux:this.updateLogic.getUpdates()) {
					if(updateAux.getId()<0) {
						updatesAux.add(updateAux);
					}		
				}
				this.iIdNuevoUpdate=0L;
				this.updateLogic.getUpdates().removeAll(updatesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Update updateAux:this.updates) {
					if(updateAux.getId()<0) {
						updatesAux.add(updateAux);
					}		
				}
				this.iIdNuevoUpdate=0L;
				this.updates.removeAll(updatesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUpdate 
					&& this.updateLogic.getUpdates().size()>0
					) {
					updateAux=this.updateLogic.getUpdates().get(this.updateLogic.getUpdates().size() - 1);
				
					if(updateAux.getId()<0) {
						this.updateLogic.getUpdates().remove(updateAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUpdate && this.updates.size()>0) {
					updateAux=this.updates.get(this.updates.size() - 1);
				
					if(updateAux.getId()<0) {
						this.updates.remove(updateAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUpdate(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(update.getId()<0) {
				this.updateLogic.getUpdates().remove(this.update);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(update.getId()<0) {
				this.updates.remove(this.update);
			}
		}			
	}
	
	public void setEstadosInicialesUpdate(List<Update> updatesAux) throws Exception {
		UpdateConstantesFunciones.setEstadosInicialesUpdate(updatesAux);
	}
	
	public void setEstadosInicialesUpdate(Update updateAux) throws Exception {
		UpdateConstantesFunciones.setEstadosInicialesUpdate(updateAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUpdateActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUpdateActual()) {
				if(!this.isEsNuevoUpdate) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUpdate=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUpdateActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Update ?", "MANTENIMIENTO DE Update", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Update update) throws Exception {
		UpdateConstantesFunciones.seleccionarAsignar(this.update,update);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUpdate=this.isPermisoActualizarOriginalUpdate;
			
			
			this.seleccionarAsignar(update);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UpdateConstantesFunciones.quitarEspaciosUpdate(this.update,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUpdate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.updateSessionBean.setsFuncionBusquedaRapida(this.updateSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUpdate) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUpdate(esParaCancelar);				
				this.cancelarNuevoUpdate(esParaCancelar);								
			}
			
			this.update=new Update();
			
			this.inicializarUpdate();
			
			this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUpdate() throws Exception {
		try {
			UpdateConstantesFunciones.inicializarUpdate(this.update);
			
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
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.updateLogic.getUpdates().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUpdates(String sAccionBusqueda,List<Update> updatesParaReportes) throws Exception {
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
					sPathReporteFinal="Update"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UpdateMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UpdateMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Update"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Updates");		
		parameters.put("busquedapor", UpdateConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(UpdateDetalle.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					UpdateLogic updateLogicAuxiliar=new UpdateLogic();
					updateLogicAuxiliar.setDatosCliente(updateLogic.getDatosCliente());				
					updateLogicAuxiliar.setUpdates(updatesParaReportes);
					
					updateLogicAuxiliar.cargarRelacionesLoteForeignKeyUpdateWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					updatesParaReportes=updateLogicAuxiliar.getUpdates();
					
					//updateLogic.getNewConnexionToDeep();
					
					//for (Update update:updatesParaReportes) {
					//	updateLogic.deepLoad(update, false, DeepLoadType.INCLUDE, classes);
					//}						
					//updateLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//updateLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileUpdateDetalle = AuxiliarReportes.class.getResourceAsStream("UpdateDetalleDetalleRelacionesDesign.jasper");
			parameters.put("subreport_updatedetalle", reportFileUpdateDetalle);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUpdate=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UpdateConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UpdateConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUpdate=new JRBeanArrayDataSource(UpdateJInternalFrame.TraerUpdateBeans(updatesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUpdate);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UpdateConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UpdateConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UpdateBean.TraerUpdateBeans(updatesParaReportes).toArray()));
							
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
				this.generarExcelReporteUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUpdateActionPerformed(null);
					//this.generarExcelReporteUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUpdates(sAccionBusqueda,sTipoArchivoReporte,updatesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUpdates(String sAccionBusqueda,String sTipoArchivoReporte,List<Update> updatesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Updates");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUpdate("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Update update : updatesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UpdateConstantesFunciones.generarExcelReporteDataUpdate("NORMAL",row,workbook,update,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUpdate(String sTipo,Row row,Workbook workbook) {
		
		UpdateConstantesFunciones.generarExcelReporteHeaderUpdate(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUpdates(String sAccionBusqueda,String sTipoArchivoReporte,List<Update> updatesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Updates");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Update update : updatesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UpdateConstantesFunciones.getUpdateDescripcion(update));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_CODIGOPROCESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGOPROCESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getcodigo_proceso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_QUERYRESUMEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_QUERYRESUMEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getquery_resumen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_NUMEROINTENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_NUMEROINTENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getnumero_intento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_FECHAARCHIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHAARCHIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getfecha_archivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_EJECUTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_EJECUTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(update.getejecutado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(update.getesta_activo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(update.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUpdates(String sAccionBusqueda,String sTipoArchivoReporte,List<Update> updatesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Update> updatesRespaldo=null;
		
		classes=UpdateConstantesFunciones.getClassesRelationshipsOfUpdate(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.updateLogic.setDatosCliente(this.datosCliente);
		this.updateLogic.setDatosDeep(this.datosDeep);
		this.updateLogic.setIsConDeep(true);
		
		updatesRespaldo=this.updateLogic.getUpdates();
		
		this.updateLogic.setUpdates(updatesParaReportes);	
		this.updateLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		updatesParaReportes=this.updateLogic.getUpdates();
		this.updateLogic.setUpdates(updatesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Updates");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUpdate("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Update update : updatesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUpdate("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UpdateConstantesFunciones.generarExcelReporteDataUpdate("NORMAL",row,workbook,update,cellStyleDataAux);
		
			
			


				//UpdateDetalle
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO))) {

				if(update.getUpdateDetalles()!=null && update.getUpdateDetalles().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UpdateDetalleConstantesFunciones.generarExcelReporteHeaderUpdateDetalle("RELACIONADO",row,workbook);
				}

				if(update.getUpdateDetalles()!=null) {
					i2=0;
					for(UpdateDetalle updatedetalle : update.getUpdateDetalles()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UpdateDetalleConstantesFunciones.generarExcelReporteDataUpdateDetalle("RELACIONADO",row,workbook,updatedetalle,cellStyleDataAuxHijo);
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
		cell.setCellValue(UpdateConstantesFunciones.getUpdateDescripcion(update));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUpdate.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdate.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUpdate() throws Exception {		
		this.startProcessUpdate(true);
	}
	
	public void startProcessUpdate(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUpdate ,this.jPanelParametrosReportesUpdate, this.jScrollPanelDatosUpdate,this.jPanelPaginacionUpdate, this.jScrollPanelDatosEdicionUpdate, this.jPanelAccionesUpdate,this.jPanelAccionesFormularioUpdate,this.jmenuBarUpdate,this.jmenuBarDetalleUpdate,this.jTtoolBarUpdate,this.jTtoolBarDetalleUpdate);		
		
		final JTabbedPane jTabbedPaneBusquedasUpdate=this.jTabbedPaneBusquedasUpdate; 
		
		final JPanel jPanelParametrosReportesUpdate=this.jPanelParametrosReportesUpdate;
		//final JScrollPane jScrollPanelDatosUpdate=this.jScrollPanelDatosUpdate;
		final JTable jTableDatosUpdate=this.jTableDatosUpdate;		
		final JPanel jPanelPaginacionUpdate=this.jPanelPaginacionUpdate;
		//final JScrollPane jScrollPanelDatosEdicionUpdate=this.jScrollPanelDatosEdicionUpdate;
		final JPanel jPanelAccionesUpdate=this.jPanelAccionesUpdate;
		
		JPanel jPanelCamposAuxiliarUpdate=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUpdate=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
			jPanelCamposAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jPanelCamposUpdate;
			jPanelAccionesFormularioAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jPanelAccionesFormularioUpdate;
		}
		
		final JPanel jPanelCamposUpdate=jPanelCamposAuxiliarUpdate;
		final JPanel jPanelAccionesFormularioUpdate=jPanelAccionesFormularioAuxiliarUpdate;
		
		
		final JMenuBar jmenuBarUpdate=this.jmenuBarUpdate;
		final JToolBar jTtoolBarUpdate=this.jTtoolBarUpdate;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUpdate=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUpdate=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
			jmenuBarDetalleAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jmenuBarDetalleUpdate;
			jTtoolBarDetalleAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jTtoolBarDetalleUpdate;
		}
		
		final JMenuBar jmenuBarDetalleUpdate=jmenuBarDetalleAuxiliarUpdate;
		final JToolBar jTtoolBarDetalleUpdate=jTtoolBarDetalleAuxiliarUpdate;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUpdate;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUpdate;
			processRunnable.jTableDatos=jTableDatosUpdate;
			processRunnable.jPanelCampos=jPanelCamposUpdate;
			processRunnable.jPanelPaginacion=jPanelPaginacionUpdate;
			processRunnable.jPanelAcciones=jPanelAccionesUpdate;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUpdate;
			
			
			processRunnable.jmenuBar=jmenuBarUpdate;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUpdate;
			processRunnable.jTtoolBar=jTtoolBarUpdate;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUpdate;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUpdate ,jPanelParametrosReportesUpdate,jTableDatosUpdate, /*jScrollPanelDatosUpdate,*/jPanelCamposUpdate,jPanelPaginacionUpdate, /*jScrollPanelDatosEdicionUpdate,*/ jPanelAccionesUpdate,jPanelAccionesFormularioUpdate,jmenuBarUpdate,jmenuBarDetalleUpdate,jTtoolBarUpdate,jTtoolBarDetalleUpdate);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUpdate ,jPanelParametrosReportesUpdate, jScrollPanelDatosUpdate,jPanelPaginacionUpdate, jScrollPanelDatosEdicionUpdate, jPanelAccionesUpdate,jPanelAccionesFormularioUpdate,jmenuBarUpdate,jmenuBarDetalleUpdate,jTtoolBarUpdate,jTtoolBarDetalleUpdate);
						
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
	
	public void finishProcessUpdate() {// throws Exception 
		this.finishProcessUpdate(true);
	}
	
	public void finishProcessUpdate(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUpdate ,this.jPanelParametrosReportesUpdate, this.jScrollPanelDatosUpdate,this.jPanelPaginacionUpdate, this.jScrollPanelDatosEdicionUpdate, this.jPanelAccionesUpdate,this.jPanelAccionesFormularioUpdate,this.jmenuBarUpdate,this.jmenuBarDetalleUpdate,this.jTtoolBarUpdate,this.jTtoolBarDetalleUpdate);		
		
		final JTabbedPane jTabbedPaneBusquedasUpdate=this.jTabbedPaneBusquedasUpdate; 
		
		final JPanel jPanelParametrosReportesUpdate=this.jPanelParametrosReportesUpdate;
		//final JScrollPane jScrollPanelDatosUpdate=this.jScrollPanelDatosUpdate;
		final JTable jTableDatosUpdate=this.jTableDatosUpdate;		
		final JPanel jPanelPaginacionUpdate=this.jPanelPaginacionUpdate;
		//final JScrollPane jScrollPanelDatosEdicionUpdate=this.jScrollPanelDatosEdicionUpdate;
		final JPanel jPanelAccionesUpdate=this.jPanelAccionesUpdate;
		
		JPanel jPanelCamposAuxiliarUpdate=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUpdate=new JPanel();
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
			jPanelCamposAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jPanelCamposUpdate;
			jPanelAccionesFormularioAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jPanelAccionesFormularioUpdate;
		}
		
		final JPanel jPanelCamposUpdate=jPanelCamposAuxiliarUpdate;
		final JPanel jPanelAccionesFormularioUpdate=jPanelAccionesFormularioAuxiliarUpdate;
		
		
		final JMenuBar jmenuBarUpdate=this.jmenuBarUpdate;		
		final JToolBar jTtoolBarUpdate=this.jTtoolBarUpdate;
				
		JMenuBar jmenuBarDetalleAuxiliarUpdate=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUpdate=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
			jmenuBarDetalleAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jmenuBarDetalleUpdate;
			jTtoolBarDetalleAuxiliarUpdate=this.jInternalFrameDetalleFormUpdate.jTtoolBarDetalleUpdate;		
		}
		
		final JMenuBar jmenuBarDetalleUpdate=jmenuBarDetalleAuxiliarUpdate;
		final JToolBar jTtoolBarDetalleUpdate=jTtoolBarDetalleAuxiliarUpdate;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUpdate;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUpdate;
			processRunnable.jTableDatos=jTableDatosUpdate;
			processRunnable.jPanelCampos=jPanelCamposUpdate;
			processRunnable.jPanelPaginacion=jPanelPaginacionUpdate;
			processRunnable.jPanelAcciones=jPanelAccionesUpdate;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUpdate;
			
			
			processRunnable.jmenuBar=jmenuBarUpdate;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUpdate;
			processRunnable.jTtoolBar=jTtoolBarUpdate;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUpdate;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUpdate ,jPanelParametrosReportesUpdate, jTableDatosUpdate,/*jScrollPanelDatosUpdate,*/jPanelCamposUpdate,jPanelPaginacionUpdate, /*jScrollPanelDatosEdicionUpdate,*/ jPanelAccionesUpdate,jPanelAccionesFormularioUpdate,jmenuBarUpdate,jmenuBarDetalleUpdate,jTtoolBarUpdate,jTtoolBarDetalleUpdate));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUpdate(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUpdate(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUpdate(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUpdate(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUpdate,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUpdate,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUpdate(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUpdate,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUpdate,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.updateConstantesFunciones.getsFinalQueryUpdate();
		String  finalQueryPaginacionTodos=this.updateConstantesFunciones.getsFinalQueryUpdate();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UpdateConstantesFunciones.getArrayColumnasGlobalesNoUpdate(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UpdateConstantesFunciones.getArrayColumnasGlobalesUpdate(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UpdateConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.updatesEliminados= new ArrayList<Update>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUpdate();
		
				///*UpdateSessionBean*/this.updateSessionBean=new UpdateSessionBean();
			
			if(this.updateSessionBean==null) {
				this.updateSessionBean=new UpdateSessionBean();
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
					this.iNumeroPaginacion=UpdateConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UpdateConstantesFunciones.getClassesForeignKeysOfUpdate(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/update."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			updatesAux= new ArrayList<Update>();
			
				
			updateLogic.setDatosCliente(this.datosCliente);
			updateLogic.setDatosDeep(this.datosDeep);
			updateLogic.setIsConDeep(true);
			
			
			updateLogic.getUpdateDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					updateLogic.getTodosUpdates(finalQueryGlobal,pagination);
					
					//updateLogic.getTodosUpdatesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(updateLogic.getUpdates()==null|| updateLogic.getUpdates().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updatesAux= new ArrayList<Update>();
							updatesAux.addAll(updateLogic.getUpdates());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatesAux= new ArrayList<Update>();
							updatesAux.addAll(updates);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updateLogic.getTodosUpdates(finalQueryGlobal+"",this.pagination);												
							
							//updateLogic.getTodosUpdatesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUpdates("Todos",updateLogic.getUpdates() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updateLogic.setUpdates(new ArrayList<Update>());					
							updateLogic.getUpdates().addAll(updatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updates=new ArrayList<Update>();
							updates.addAll(updatesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUpdate=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUpdate=this.idActual;
				
				} else if(this.idUpdateActual!=null && this.idUpdateActual!=0L) {
					idUpdate=idUpdateActual;
				}
				
					
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndicePorId(idUpdate);
				
				this.updates=new ArrayList<Update>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					updateLogic.getEntity(idUpdate);
					
					//updateLogic.getEntityWithConnection(idUpdate);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLogic.setUpdates(new ArrayList<Update>());
					updateLogic.getUpdates().add(updateLogic.getUpdate());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updates=new ArrayList<Update>();
					this.updates.add(update);
				}
				
				if(updateLogic.getUpdate()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					updateLogic.getUpdatesFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=updateLogic.getUpdates()==null||updateLogic.getUpdates().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=updates==null|| updates.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						updatesAux=new ArrayList<Update>();
						updatesAux.addAll(updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatesAux=new ArrayList<Update>();
							updatesAux.addAll(updates);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							updateLogic.getUpdatesFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUpdates("FK_IdAnio",updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUpdates("FK_IdAnio",updates);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						updateLogic.setUpdates(new ArrayList<Update>());
						updateLogic.getUpdates().addAll(updatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updates=new ArrayList<Update>();
							updates.addAll(updatesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					updateLogic.getUpdatesFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=updateLogic.getUpdates()==null||updateLogic.getUpdates().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=updates==null|| updates.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						updatesAux=new ArrayList<Update>();
						updatesAux.addAll(updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatesAux=new ArrayList<Update>();
							updatesAux.addAll(updates);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							updateLogic.getUpdatesFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUpdates("FK_IdMes",updateLogic.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUpdates("FK_IdMes",updates);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						updateLogic.setUpdates(new ArrayList<Update>());
						updateLogic.getUpdates().addAll(updatesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updates=new ArrayList<Update>();
							updates.addAll(updatesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUpdate();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUpdate();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=updateLogic.getUpdates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updates.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=updateLogic.getUpdates().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updates.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Update update) {
		Boolean permite=true;
		
		if(this.update.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UpdateConstantesFunciones.getOrderByListaUpdate();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UpdateConstantesFunciones.getOrderByListaUpdate();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Update update:updateLogic.getUpdates()) {
				if(update.getsType().equals(Constantes2.S_TOTALES)) {
					updateTotales=update;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Update update:this.updates) {
				if(update.getsType().equals(Constantes2.S_TOTALES)) {
					updateTotales=update;
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
			this.updateAux=new Update();
			this.updateAux.setsType(Constantes2.S_TOTALES);
			this.updateAux.setIsNew(false);
			this.updateAux.setIsChanged(false);
			this.updateAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UpdateConstantesFunciones.TotalizarValoresFilaUpdate(this.updateLogic.getUpdates(),this.updateAux);
				
				this.updateLogic.getUpdates().add(this.updateAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UpdateConstantesFunciones.TotalizarValoresFilaUpdate(this.updates,this.updateAux);
				
				this.updates.add(this.updateAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		updateTotales=new Update();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.updateLogic.getUpdates().remove(updateTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.updates.remove(updateTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		updateTotales=new Update();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Update update:updateLogic.getUpdates()) {
				if(update.getsType().equals(Constantes2.S_TOTALES)) {
					updateTotales=update;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UpdateConstantesFunciones.TotalizarValoresFilaUpdate(this.updateLogic.getUpdates(),updateTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Update update:this.updates) {
				if(update.getsType().equals(Constantes2.S_TOTALES)) {
					updateTotales=update;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UpdateConstantesFunciones.TotalizarValoresFilaUpdate(this.updates,updateTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUpdatesFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUpdatesFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUpdatesFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLogic.getUpdatesFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUpdatesFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLogic.getUpdatesFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosUpdate() {
		this.isPermisoTodoUpdate=false;
		this.isPermisoNuevoUpdate=false;
		this.isPermisoActualizarUpdate=false;
		this.isPermisoActualizarOriginalUpdate=false;
		this.isPermisoEliminarUpdate=false;
		this.isPermisoGuardarCambiosUpdate=false;
		this.isPermisoConsultaUpdate=false;
		this.isPermisoBusquedaUpdate=false;
		this.isPermisoReporteUpdate=false;		
		this.isPermisoOrdenUpdate=false;		
		this.isPermisoPaginacionMedioUpdate=false;		
		this.isPermisoPaginacionAltoUpdate=false;
		this.isPermisoPaginacionTodoUpdate=false;
		this.isPermisoCopiarUpdate=false;		
		this.isPermisoVerFormUpdate=false;		
		this.isPermisoDuplicarUpdate=false;		
		this.isPermisoOrdenUpdate=false;		
	}
	
	public void setPermisosUsuarioUpdate(Boolean isPermiso) {
		this.isPermisoTodoUpdate=isPermiso;
		this.isPermisoNuevoUpdate=isPermiso;
		this.isPermisoActualizarUpdate=isPermiso;
		this.isPermisoActualizarOriginalUpdate=isPermiso;
		this.isPermisoEliminarUpdate=isPermiso;
		this.isPermisoGuardarCambiosUpdate=isPermiso;
		this.isPermisoConsultaUpdate=isPermiso;
		this.isPermisoBusquedaUpdate=isPermiso;
		this.isPermisoReporteUpdate=isPermiso;
		this.isPermisoOrdenUpdate=isPermiso;		
		this.isPermisoPaginacionMedioUpdate=isPermiso;		
		this.isPermisoPaginacionAltoUpdate=isPermiso;		
		this.isPermisoPaginacionTodoUpdate=isPermiso;		
		this.isPermisoCopiarUpdate=isPermiso;		
		this.isPermisoVerFormUpdate=isPermiso;		
		this.isPermisoDuplicarUpdate=isPermiso;
		this.isPermisoOrdenUpdate=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUpdate(Boolean isPermiso) {
		//this.isPermisoTodoUpdate=isPermiso;
		this.isPermisoNuevoUpdate=isPermiso;
		this.isPermisoActualizarUpdate=isPermiso;
		this.isPermisoActualizarOriginalUpdate=isPermiso;
		this.isPermisoEliminarUpdate=isPermiso;
		this.isPermisoGuardarCambiosUpdate=isPermiso;
		//this.isPermisoConsultaUpdate=isPermiso;
		//this.isPermisoBusquedaUpdate=isPermiso;
		//this.isPermisoReporteUpdate=isPermiso;
		//this.isPermisoOrdenUpdate=isPermiso;		
		//this.isPermisoPaginacionMedioUpdate=isPermiso;		
		//this.isPermisoPaginacionAltoUpdate=isPermiso;		
		//this.isPermisoPaginacionTodoUpdate=isPermiso;		
		//this.isPermisoCopiarUpdate=isPermiso;		
		//this.isPermisoDuplicarUpdate=isPermiso;
		//this.isPermisoOrdenUpdate=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUpdateClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(UpdateDetalleConstantesFunciones.SNOMBREOPCION);
		
		if(UpdateJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosUpdateDetalle=false;
		this.isTienePermisosUpdateDetalle=this.verificarGetPermisosUsuarioOpcionUpdateClaseRelacionada(this.opcionsRelacionadas,UpdateDetalleConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebUpdate(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUpdateClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosUpdateDetalle=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioUpdateClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUpdateClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUpdateClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosUpdateDetalle && this.jInternalFrameDetalleFormUpdate!=null && this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.remove(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioUpdate() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UpdateJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.updateSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UpdateConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUpdate=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUpdate=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUpdate=this.isPermisoActualizarUpdate;
			this.isPermisoEliminarUpdate=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUpdate=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUpdate=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUpdate=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUpdate=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUpdate=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUpdate=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUpdate=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUpdate=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUpdate=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUpdate=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUpdate=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUpdate=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUpdate=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.updateSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUpdate.setToolTipText(this.jTableDatosUpdate.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUpdate(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUpdate(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UpdateJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UpdateJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUpdate() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUpdateDetalle && this.updateConstantesFunciones.mostrarUpdateDetalleUpdate && !UpdateConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Update Detalle");
			reporte.setsDescripcion("Update Detalle");
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
	public void inicializarCombosForeignKeyUpdateListas()throws Exception {
		try	{						
			
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUpdateListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UpdateJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUpdateListas(false);
			} else {
			
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUpdateListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UpdateParameterReturnGeneral updateReturnGeneral=new UpdateParameterReturnGeneral();
						
			


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.updateConstantesFunciones.cargarid_anioUpdate)
					 || (this.esRecargarFks && this.updateConstantesFunciones.cargarid_anioUpdate)) {

					if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+updateSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.updateConstantesFunciones.cargarid_mesUpdate)
					 || (this.esRecargarFks && this.updateConstantesFunciones.cargarid_mesUpdate)) {

					if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+updateSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				updateReturnGeneral=updateLogic.cargarCombosLoteForeignKeyUpdate(finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=updateReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=updateReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUpdate()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			if(this.updateSessionBean==null) {
				this.updateSessionBean=new UpdateSessionBean();
			}

			if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.updateSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUpdate()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUpdate(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUpdate()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.update.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.update.setfecha_archivo(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUpdate();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUpdate(Update update)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUpdate(Update update,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUpdate()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUpdate()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUpdate()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUpdate()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUpdate()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUpdate()throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUpdate(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUpdate()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate!=null && this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.getItemCount()>0) {
				this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate!=null && this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.getItemCount()>0) {
				this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public UpdateBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UpdateBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UpdateBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.updateSessionBean=new UpdateSessionBean(); 
		this.updateConstantesFunciones=new UpdateConstantesFunciones(); 
		this.updateBean=new Update();//(this.updateConstantesFunciones); 		
		this.updateReturnGeneral=new UpdateParameterReturnGeneral(); 
		
		this.updateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UpdateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UpdateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UpdateBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUpdate(true);
			
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
			
			this.updateConstantesFunciones=new UpdateConstantesFunciones(); 
			this.updateBean=new Update();//this.updateConstantesFunciones); 			
			this.updateReturnGeneral=new UpdateParameterReturnGeneral(); 
		
			UpdateBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Update Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.update=new Update();
			this.updates = new ArrayList<Update>();
			this.updatesAux = new ArrayList<Update>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic=new UpdateLogic();
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			//this.updateSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.updateSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUpdate);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUpdate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUpdate);	
					}
					
					if(this.jInternalFrameImportacionUpdate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUpdate);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUpdate!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUpdate);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUpdate!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUpdate);
				this.jInternalFrameDetalleFormUpdate.setVisible(false);
				this.jInternalFrameDetalleFormUpdate.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUpdate!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUpdate);
					this.jInternalFrameReporteDinamicoUpdate.setVisible(false);
					this.jInternalFrameReporteDinamicoUpdate.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUpdate!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUpdate);
					this.jInternalFrameImportacionUpdate.setVisible(false);
					this.jInternalFrameImportacionUpdate.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUpdate!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUpdate);
					this.jInternalFrameOrderByUpdate.setVisible(false);
					this.jInternalFrameOrderByUpdate.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUpdateActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UpdateConstantesFunciones.INUMEROPAGINACION;
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
			
			this.updateReturnGeneral=new UpdateParameterReturnGeneral();
			
			this.updateParameterGeneral=new UpdateParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.updateLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.updateSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UpdateJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.updateSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(UpdateDetalleConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UpdateConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.updateSessionBean.getEsGuardarRelacionado(),this.updateSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UpdateConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.updateSessionBean.getEsGuardarRelacionado(),this.updateSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaDuplicarUpdate=true;
			this.isVisibilidadCeldaCopiarUpdate=true;
			this.isVisibilidadCeldaVerFormUpdate=true;
			this.isVisibilidadCeldaOrdenUpdate=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=false;
			this.isVisibilidadCeldaGuardarUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUpdate();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUpdate(false);
			
			this.setPermisosUsuarioUpdate();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updateSessionBean.getEsGuardarRelacionado() 
				|| (this.updateSessionBean.getEsGuardarRelacionado() && this.updateSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUpdateClasesRelacionadas();
			}
			
			if(this.updateSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUpdateClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UpdateJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUpdate();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUpdate();
			}
			
			if(!this.isPermisoBusquedaUpdate) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUpdate.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updateSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUpdate,this.isPermisoPaginacionMedioUpdate,this.isPermisoPaginacionTodoUpdate);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UpdateConstantesFunciones.getTiposSeleccionarUpdate());
				
				this.tiposColumnasSelect=UpdateConstantesFunciones.getTiposSeleccionarUpdate(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectUpdate();				
				//this.tiposRelacionesSelect=UpdateConstantesFunciones.getTiposRelacionesUpdate(true);
				
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
			//if(!this.updateSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUpdate();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUpdate(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUpdate(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdate() ;
			
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
			
			
			this.updatedetalleLogic=new UpdateDetalleLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				updateImplementable= (UpdateImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UpdateConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				updateImplementableHome= (UpdateImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UpdateConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.updates= new ArrayList<Update>();
			this.updatesEliminados= new ArrayList<Update>();
						
			this.isEsNuevoUpdate=false;
			this.esParaAccionDesdeFormularioUpdate=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUpdate(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUpdate();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updateSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UpdateBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UpdateConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUpdate("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUpdate(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUpdate!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUpdate();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUpdate();
			}
			
			UpdateBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUpdate.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUpdate.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUpdate.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUpdate(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Update: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUpdate() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUpdate")) {
				iIndex=this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUpdate.getSelectedRow();	
				
				

				if(sTitle.equals("Update Detalles")) {
					if(!UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUpdate();

						this.cargarParteTabPanelRelacionadaUpdateDetalle(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUpdate();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaUpdateDetalle(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUpdate.cargarSessionConBeanSwingJInternalFrameUpdateDetalle(false,true,iIndex);
		this.jButtonUpdateDetalleActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUpdateDetalle();

		//this.jTabbedPaneRelacionesUpdate.updateUI();
		//this.jTabbedPaneRelacionesUpdate.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUpdate.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("UpdateDetalle")) {
				int row=this.jTableDatosUpdate.getSelectedRow();
				jButtonUpdateDetalleActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Update Detalle")) {

					if(this.isTienePermisosUpdateDetalle && this.updateConstantesFunciones.mostrarUpdateDetalleUpdate && !UpdateConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Update Detalles"+"("+UpdateDetalleConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Update Detalles");

						if(updateConstantesFunciones.resaltarUpdateDetalleUpdate!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(updateConstantesFunciones.resaltarUpdateDetalleUpdate);
						}

						jmenuItem.setEnabled(this.updateConstantesFunciones.activarUpdateDetalleUpdate);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UpdateDetalle"));

						

						this.jInternalFrameDetalleFormUpdate.jmenuDetalleUpdate.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyUpdate(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUpdate(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUpdate(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUpdateListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUpdate();
		
		this.cargarCombosFrameForeignKeyUpdate();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUpdate();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUpdate();
		}
	}
	
	

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUpdateActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.updateSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			
			if(jTableDatosUpdate.getRowCount()>=1) {
				jTableDatosUpdate.removeRowSelectionInterval(0, jTableDatosUpdate.getRowCount()-1);						
			}
			
			this.isEsNuevoUpdate=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUpdate(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUpdate(true);			
			//this.update=new Update();
			//this.update.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdate(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdate() ;
			
			if(UpdateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdate(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.update);	
			this.actualizarInformacion("INFO_PADRE",false,this.update);				
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			if(this.updateSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Update: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUpdateActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUpdate.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUpdate.getSelectedRows().length;			
			}
			
			updatesSeleccionados=this.getUpdatesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUpdate--;			
				//Update updateAux= new Update();			
				//updateAux.setId(this.iIdNuevoUpdate);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Update updateOrigen=new Update();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Update updateOrigen : updatesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							updateOrigen =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updateOrigen =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUpdate();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.update.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUpdate(updateOrigen,this.update,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.updateLogic.getUpdates().add(this.updateAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.updates.add(this.updateAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUpdate(false);
				
				this.jTableDatosUpdate.setRowSelectionInterval(this.getIndiceNuevoUpdate(), this.getIndiceNuevoUpdate());
				
				int iLastRow =  this.jTableDatosUpdate.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUpdate.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUpdate.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdate(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();									
		
			Update updateOrigen=new Update();
			Update updateDestino=new Update();
				
			updatesSeleccionados=this.getUpdatesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUpdate.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || updatesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUpdate.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updateOrigen =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						updateOrigen =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updateDestino =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						updateDestino =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				updateOrigen =updatesSeleccionados.get(0);
				updateDestino =updatesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUpdate(updateOrigen,updateDestino,true,false);
				
				updateDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(updateDestino,updateLogic.getUpdates());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updateDestino,updates);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUpdate(false);
				
				//this.jTableDatosUpdate.setRowSelectionInterval(this.getIndiceNuevoUpdate(), this.getIndiceNuevoUpdate());
				
				int iLastRow =  this.jTableDatosUpdate.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUpdate.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUpdate.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdate(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUpdate.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUpdate.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUpdate.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUpdate.setVisible(!isVisible);
			this.jPanelPaginacionUpdate.setVisible(!isVisible);
			this.jPanelAccionesUpdate.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUpdate();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUpdate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUpdate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUpdate();
			
			this.abrirFrameOrderByUpdate();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUpdate();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUpdate(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUpdate);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUpdate.isMaximum()) {
					this.jInternalFrameDetalleFormUpdate.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUpdate.setSize(this.jInternalFrameDetalleFormUpdate.iWidthFormulario,this.jInternalFrameDetalleFormUpdate.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUpdate.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUpdate.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUpdate.isMaximum()) {
						this.jInternalFrameDetalleFormUpdate.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUpdate.jContentPaneDetalleUpdate.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUpdate.jContentPaneDetalleUpdate.getWidth(),UpdateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUpdate.jContentPaneDetalleUpdate.getWidth(),UpdateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUpdate.jContentPaneDetalleUpdate.getWidth(),UpdateConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUpdateDetalle();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUpdate.setVisible(true);
	        this.jInternalFrameDetalleFormUpdate.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUpdate() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUpdate==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUpdate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdate,false,this);
				} else {
					this.jInternalFrameOrderByUpdate=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdate,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUpdate);
				this.jInternalFrameOrderByUpdate.setVisible(false);
				this.jInternalFrameOrderByUpdate.setSelected(false);
				
				this.jInternalFrameOrderByUpdate.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUpdate"));
				
				this.inicializarActualizarBindingTablaOrderByUpdate();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUpdate() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUpdate==null) {
				
				this.jInternalFrameImportacionUpdate=new ImportacionJInternalFrame(UpdateConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUpdate);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUpdate);
				this.jInternalFrameImportacionUpdate.setVisible(false);
				this.jInternalFrameImportacionUpdate.setSelected(false);


				this.jInternalFrameImportacionUpdate.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUpdate"));
				this.jInternalFrameImportacionUpdate.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUpdate"));
				this.jInternalFrameImportacionUpdate.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUpdate"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUpdate() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUpdate==null) {
				this.jInternalFrameReporteDinamicoUpdate=new ReporteDinamicoJInternalFrame(UpdateConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUpdate);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUpdate);
				this.jInternalFrameReporteDinamicoUpdate.setVisible(false);
				this.jInternalFrameReporteDinamicoUpdate.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUpdate.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdate"));
				this.jInternalFrameReporteDinamicoUpdate.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdate"));
				this.jInternalFrameReporteDinamicoUpdate.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdate"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdate();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaUpdateDetalle() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.jScrollPanelDatosUpdateDetalle.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUpdate.jContentPaneDetalleUpdate.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.jScrollPanelDatosUpdateDetalle.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.jScrollPanelDatosUpdateDetalle.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.jScrollPanelDatosUpdateDetalle.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleUpdate() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUpdate);
			
	       	this.jInternalFrameDetalleFormUpdate.setVisible(false);
	        this.jInternalFrameDetalleFormUpdate.setSelected(false);
			
			//this.jInternalFrameDetalleFormUpdate.dispose();
			//this.jInternalFrameDetalleFormUpdate=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUpdate() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUpdate.setVisible(true);
	        this.jInternalFrameReporteDinamicoUpdate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUpdate() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUpdate.setVisible(true);
	        this.jInternalFrameImportacionUpdate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUpdate() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUpdate.setVisible(true);
	        this.jInternalFrameOrderByUpdate.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUpdate() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUpdate.setVisible(false);
	        this.jInternalFrameOrderByUpdate.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUpdate() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUpdate.setVisible(false);
	        this.jInternalFrameReporteDinamicoUpdate.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUpdate() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUpdate.setVisible(false);
	        this.jInternalFrameImportacionUpdate.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUpdate(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUpdate(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUpdate(true);
			//this.isEsNuevoUpdate=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUpdate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdate(false) ;
			
			if(updateSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.getEsGuardarRelacionado() && UpdateDetalleJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUpdateDetalleActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(UpdateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdate(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdate(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUpdateActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUpdate(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUpdate(true);
			//this.isEsNuevoUpdate=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.update.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUpdate("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUpdate(false) ;
			
			if(UpdateJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdate(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdate(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUpdate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUpdate.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUpdate(false);
			
			//if(!this.isEsNuevoUpdate) {								
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				
			}
			
			if(this.permiteMantenimiento(this.update)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.updateSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUpdate=true;
					this.inicializarActualizarBindingTablaUpdate(false);
					this.isEsNuevoUpdate=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUpdate=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUpdate=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUpdate(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdate(false);
				
				this.habilitarDeshabilitarControlesUpdate(false);
			
												
				
				if(UpdateJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUpdate();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUpdateActionPerformed(evt,updateSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUpdate(this.update,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUpdate.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,updateSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.update.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUpdateActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				this.update.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				this.update.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.update)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.updateSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UpdateModel) this.jTableDatosUpdate.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUpdate=true;
				this.inicializarActualizarBindingTablaUpdate(false);
				this.isEsNuevoUpdate=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUpdate(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdate(false);
				
				this.habilitarDeshabilitarControlesUpdate(false);
				
				
				
				if(UpdateJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUpdate();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUpdateActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUpdate.getRowCount()>=1) {
				jTableDatosUpdate.removeRowSelectionInterval(0, jTableDatosUpdate.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUpdate(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUpdate(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdate(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdate(false) ;
			
			this.isEsNuevoUpdate=false;
			
			if(UpdateJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUpdate();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUpdate(false);
				
				//SI ES MANUAL
				if(UpdateJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUpdate();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUpdate--;			
			//Update updateAux= new Update();			
			//updateAux.setId(this.iIdNuevoUpdate);
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUpdate();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
			
			this.update.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.updateLogic.getUpdates().add(this.updateAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.updates.add(this.updateAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUpdate(false);
			
			this.jTableDatosUpdate.setRowSelectionInterval(this.getIndiceNuevoUpdate(), this.getIndiceNuevoUpdate());
			
			int iLastRow =  this.jTableDatosUpdate.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUpdate.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUpdate.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUpdate(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUpdate(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdate(false);
			
			//SI ES MANUAL
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdate();
			}
			
			//this.abrirFrameTreeUpdate();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUpdateActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE UpdateS ?", "MANTENIMIENTO DE Update", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUpdate.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUpdate();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.updateReturnGeneral=updateLogic.procesarImportacionUpdatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.updateParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUpdateReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUpdateActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUpdate.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUpdate.setFileImportacion(this.jInternalFrameImportacionUpdate.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUpdate.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUpdate.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUpdate.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUpdate.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		

		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UpdateBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UpdateBaseDesign.jrxml";
			
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
			
			this.generarReporteUpdates("Todos",updatesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UpdateConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_CODIGOPROCESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_QUERYRESUMEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eryResumen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eryResumen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eryResumen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eryResumen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_NUMEROINTENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIntento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIntento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIntento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIntento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_FECHAARCHIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaArchivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaArchivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaArchivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaArchivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_EJECUTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecutado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecutado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecutado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecutado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoUpdate.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UpdateConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case UpdateConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case UpdateConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case UpdateConstantesFunciones.LABEL_CODIGOPROCESO:
					sNombreCampoCategoria="codigo_proceso";
					break;

				case UpdateConstantesFunciones.LABEL_QUERYRESUMEN:
					sNombreCampoCategoria="query_resumen";
					break;

				case UpdateConstantesFunciones.LABEL_NUMEROINTENTO:
					sNombreCampoCategoria="numero_intento";
					break;

				case UpdateConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case UpdateConstantesFunciones.LABEL_FECHAARCHIVO:
					sNombreCampoCategoria="fecha_archivo";
					break;

				case UpdateConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case UpdateConstantesFunciones.LABEL_EJECUTADO:
					sNombreCampoCategoria="ejecutado";
					break;

				case UpdateConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;

				case UpdateConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UpdateConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case UpdateConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case UpdateConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case UpdateConstantesFunciones.LABEL_CODIGOPROCESO:
					sNombreCampoCategoriaValor="codigo_proceso";
					break;

				case UpdateConstantesFunciones.LABEL_QUERYRESUMEN:
					sNombreCampoCategoriaValor="query_resumen";
					break;

				case UpdateConstantesFunciones.LABEL_NUMEROINTENTO:
					sNombreCampoCategoriaValor="numero_intento";
					break;

				case UpdateConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case UpdateConstantesFunciones.LABEL_FECHAARCHIVO:
					sNombreCampoCategoriaValor="fecha_archivo";
					break;

				case UpdateConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case UpdateConstantesFunciones.LABEL_EJECUTADO:
					sNombreCampoCategoriaValor="ejecutado";
					break;

				case UpdateConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;

				case UpdateConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUpdate.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdate.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UpdateConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case UpdateConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case UpdateConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case UpdateConstantesFunciones.LABEL_CODIGOPROCESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Proceso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_proceso");
					break;

				case UpdateConstantesFunciones.LABEL_QUERYRESUMEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Query Resumen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"query_resumen");
					break;

				case UpdateConstantesFunciones.LABEL_NUMEROINTENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Intento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_intento");
					break;

				case UpdateConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case UpdateConstantesFunciones.LABEL_FECHAARCHIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Archivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_archivo");
					break;

				case UpdateConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case UpdateConstantesFunciones.LABEL_EJECUTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejecutado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ejecutado");
					break;

				case UpdateConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
					break;

				case UpdateConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoUpdateActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Updates");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UpdateConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_CODIGOPROCESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGOPROCESO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getcodigo_proceso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_QUERYRESUMEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_QUERYRESUMEN);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getquery_resumen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_NUMEROINTENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_NUMEROINTENTO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getnumero_intento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_FECHAARCHIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHAARCHIVO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getfecha_archivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_EJECUTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_EJECUTADO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getejecutado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getesta_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Update update:updatesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(update.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelUpdate(row);				
			//	iRow++;
			//}				
			
			//for(Update updateAux:updatesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUpdate(updateAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
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
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdate(false);
			
			//SI ES MANUAL
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdate();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdate(false);
			
			//SI ES MANUAL
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUpdate();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUpdateActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdate(false);
			
			//SI ES MANUAL
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUpdate();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUpdate() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUpdate.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUpdate.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUpdate.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUpdate.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUpdate.setMinimumSize(dimensionMinimum);
		this.jTableDatosUpdate.setMaximumSize(dimensionMaximum);
		this.jTableDatosUpdate.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUpdate(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUpdate(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUpdate(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUpdate(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUpdate(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUpdate(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdate(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUpdate(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UpdateJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UpdateJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUpdate() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUpdate();
		
		this.inicializarActualizarBindingBotonesManualUpdate(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.updateSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUpdate();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdate() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUpdate(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUpdate(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUpdate.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUpdate.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUpdate.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUpdate!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionNuevoUpdate.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionSinCerrarUpdate.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionSinMensajeUpdate.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUpdate.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUpdate.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUpdate.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUpdate!=null) {
				this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionNuevoUpdate.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionSinCerrarUpdate.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUpdate.jCheckBoxPostAccionSinMensajeUpdate.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUpdate.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUpdate.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUpdate.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUpdate!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUpdate.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUpdate.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUpdate.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUpdate.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUpdate!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUpdate.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUpdate.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUpdate(Boolean esInicializar) throws Exception {
		try	{	
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUpdate(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUpdate() throws Exception {
		try	{
			if(UpdateJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUpdate();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUpdate() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUpdate() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUpdate.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUpdate.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUpdate.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUpdate.addItem(reporte);
			}
			
			
			if(!this.updateSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUpdate.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUpdate.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUpdate.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUpdate.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUpdate.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUpdate.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUpdate.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdate();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdate() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUpdate!=null) {
				this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUpdate!=null) {
				this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUpdate.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUpdate!=null) {
				
				if(this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUpdate.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUpdate.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUpdate.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUpdate.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUpdate()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioUpdate.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioUpdate.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesUpdate.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesUpdate.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUpdate(Boolean esInicializar) throws Exception {				
		if(UpdateJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUpdate();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUpdate() throws Exception {
		this.inicializarActualizarBindingTablaUpdate(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUpdate() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUpdateOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUpdate(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=updateLogic.getUpdates().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=updates.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUpdate.setModel(new UpdateModel(this.updateLogic.getUpdates(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUpdate.setModel(new UpdateModel(this.updates,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUpdate!=null && this.jInternalFrameOrderByUpdate.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUpdate();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UpdateConstantesFunciones.SCLASSWEBTITULO,updateConstantesFunciones.resaltarSeleccionarUpdate,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UpdateConstantesFunciones.SCLASSWEBTITULO,updateConstantesFunciones.resaltarSeleccionarUpdate,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_ID));

		if(this.updateConstantesFunciones.mostraridUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updateConstantesFunciones.resaltaridUpdate,this.updateConstantesFunciones.activaridUpdate,this,true,"idUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltaridUpdate,this.updateConstantesFunciones.activaridUpdate,this,true,"idUpdate","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_IDANIO));

		if(this.updateConstantesFunciones.mostrarid_anioUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.updateConstantesFunciones.resaltarid_anioUpdate,this,this.updateConstantesFunciones.activarid_anioUpdate));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.updateConstantesFunciones.resaltarid_anioUpdate,this,this.updateConstantesFunciones.activarid_anioUpdate,true,"id_anioUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_IDMES));

		if(this.updateConstantesFunciones.mostrarid_mesUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.updateConstantesFunciones.resaltarid_mesUpdate,this,this.updateConstantesFunciones.activarid_mesUpdate));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.updateConstantesFunciones.resaltarid_mesUpdate,this,this.updateConstantesFunciones.activarid_mesUpdate,true,"id_mesUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_CODIGO));

		if(this.updateConstantesFunciones.mostrarcodigoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updateConstantesFunciones.resaltarcodigoUpdate,this.updateConstantesFunciones.activarcodigoUpdate,this,true,"codigoUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltarcodigoUpdate,this.updateConstantesFunciones.activarcodigoUpdate,this,true,"codigoUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_CODIGOPROCESO));

		if(this.updateConstantesFunciones.mostrarcodigo_procesoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_CODIGOPROCESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updateConstantesFunciones.resaltarcodigo_procesoUpdate,this.updateConstantesFunciones.activarcodigo_procesoUpdate,this,true,"codigo_procesoUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltarcodigo_procesoUpdate,this.updateConstantesFunciones.activarcodigo_procesoUpdate,this,true,"codigo_procesoUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_QUERYRESUMEN));

		if(this.updateConstantesFunciones.mostrarquery_resumenUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_QUERYRESUMEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updateConstantesFunciones.resaltarquery_resumenUpdate,this.updateConstantesFunciones.activarquery_resumenUpdate,this,true,"query_resumenUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltarquery_resumenUpdate,this.updateConstantesFunciones.activarquery_resumenUpdate,this,true,"query_resumenUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_NUMEROINTENTO));

		if(this.updateConstantesFunciones.mostrarnumero_intentoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_NUMEROINTENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updateConstantesFunciones.resaltarnumero_intentoUpdate,this.updateConstantesFunciones.activarnumero_intentoUpdate,this,true,"numero_intentoUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltarnumero_intentoUpdate,this.updateConstantesFunciones.activarnumero_intentoUpdate,this,true,"numero_intentoUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_FECHA));

		if(this.updateConstantesFunciones.mostrarfechaUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.updateConstantesFunciones.resaltarfechaUpdate,this.updateConstantesFunciones.activarfechaUpdate,this,true,"fechaUpdate","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.updateConstantesFunciones.resaltarfechaUpdate,this.updateConstantesFunciones.activarfechaUpdate,this,true,"fechaUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_FECHAARCHIVO));

		if(this.updateConstantesFunciones.mostrarfecha_archivoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_FECHAARCHIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.updateConstantesFunciones.resaltarfecha_archivoUpdate,this.updateConstantesFunciones.activarfecha_archivoUpdate,this,true,"fecha_archivoUpdate","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.updateConstantesFunciones.resaltarfecha_archivoUpdate,this.updateConstantesFunciones.activarfecha_archivoUpdate,this,true,"fecha_archivoUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_ORDEN));

		if(this.updateConstantesFunciones.mostrarordenUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updateConstantesFunciones.resaltarordenUpdate,this.updateConstantesFunciones.activarordenUpdate,this,true,"ordenUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltarordenUpdate,this.updateConstantesFunciones.activarordenUpdate,this,true,"ordenUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_EJECUTADO));

		if(this.updateConstantesFunciones.mostrarejecutadoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_EJECUTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.updateConstantesFunciones.resaltarejecutadoUpdate,this.updateConstantesFunciones.activarejecutadoUpdate));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.updateConstantesFunciones.resaltarejecutadoUpdate,this.updateConstantesFunciones.activarejecutadoUpdate,this,true,"ejecutadoUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.updateConstantesFunciones.mostraresta_activoUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.updateConstantesFunciones.resaltaresta_activoUpdate,this.updateConstantesFunciones.activaresta_activoUpdate));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.updateConstantesFunciones.resaltaresta_activoUpdate,this.updateConstantesFunciones.activaresta_activoUpdate,this,true,"esta_activoUpdate","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdate,UpdateConstantesFunciones.LABEL_DESCRIPCION));

		if(this.updateConstantesFunciones.mostrardescripcionUpdate && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updateConstantesFunciones.resaltardescripcionUpdate,this.updateConstantesFunciones.activardescripcionUpdate,this,true,"descripcionUpdate","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updateConstantesFunciones.resaltardescripcionUpdate,this.updateConstantesFunciones.activardescripcionUpdate,this,true,"descripcionUpdate","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdatePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.updateSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUpdateDetalle && this.updateConstantesFunciones.mostrarUpdateDetalleUpdate && !UpdateConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Update Detalles");
				tableColumn.setHeaderValue("Update Detalles");
				tableColumn.setCellRenderer(new UpdateDetalleTableCell(updateConstantesFunciones.resaltarUpdateDetalleUpdate,this,this.updateConstantesFunciones.activarUpdateDetalleUpdate));
				tableColumn.setCellEditor(new UpdateDetalleTableCell(updateConstantesFunciones.resaltarUpdateDetalleUpdate,this,this.updateConstantesFunciones.activarUpdateDetalleUpdate));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUpdate.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.updateSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.updateSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUpdate.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.updateSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.updateSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUpdate.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUpdate && this.isPermisoGuardarCambiosUpdate) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.updateSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.updateSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUpdate.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.updateSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosUpdate.addColumn(tableColumn);
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
			
			this.jTableDatosUpdate.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUpdate && this.isPermisoGuardarCambiosUpdate) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.updateSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUpdate && this.isPermisoGuardarCambiosUpdate) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUpdate.moveColumn(this.jTableDatosUpdate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUpdate.moveColumn(this.jTableDatosUpdate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.updateSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosUpdate.moveColumn(this.jTableDatosUpdate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUpdate.moveColumn(this.jTableDatosUpdate.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUpdate.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUpdate.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUpdate,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUpdate.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUpdate.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUpdate.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUpdate.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUpdate.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=updateLogic.getUpdates().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=updates.size()-1;
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
		//this.jTableDatosUpdate.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUpdate.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUpdate();
			
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
				
				//this.isEsNuevoUpdate=false;
					
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
				if(this.updateSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUpdate==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUpdate.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUpdate.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.update.getsType().equals("DUPLICADO")
				   || this.update.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUpdate=true;
				
				} else {
					this.isEsNuevoUpdate=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.updateSessionBean.getEsGuardarRelacionado()) {
					if(this.update.getId()>=0 && !this.update.getIsNew()) {						
						this.isEsNuevoUpdate=false;
						
					} else {
						this.isEsNuevoUpdate=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUpdate(esRelaciones);						
				
				this.seleccionarUpdate(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.update.getId()<0) {
					this.isEsNuevoUpdate=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUpdate(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUpdate(evt,rowIndex);
				}	
				
				if(this.updateSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Update: " + this.dDif); 
					}
				}								
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUpdate(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.update)) {
					if(this.update.getId()>0) {
						this.update.setIsDeleted(true);
						
						this.updatesEliminados.add(this.update);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.updateLogic.getUpdates().remove(this.update);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.updates.remove(this.update);				
					}
					
					
					((UpdateModel) this.jTableDatosUpdate.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdate(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUpdate(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUpdate) {
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUpdate.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUpdate.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUpdate(this.update);
				}
				
				//ARCHITECTURE
				try {
					

					//Anio
					if(!this.updateConstantesFunciones.cargarid_anioUpdate || this.updateConstantesFunciones.event_dependid_anioUpdate) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.update.getid_anio());
									//this.inicializarActualizarBindingUpdate(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(update.getAnio()!=null) {
							this.aniosForeignKey.add(update.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.update.getid_anio(),false,"Formulario");

					//Mes
					if(!this.updateConstantesFunciones.cargarid_mesUpdate || this.updateConstantesFunciones.event_dependid_mesUpdate) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.update.getid_mes());
									//this.inicializarActualizarBindingUpdate(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(update.getMes()!=null) {
							this.messForeignKey.add(update.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.update.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUpdate("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUpdate(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdate() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUpdate(Update update) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUpdate(update,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUpdate(Update update,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUpdate(update);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUpdate(update,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUpdate(update);
	}
	
	public void setVariablesObjetoActualToFormularioUpdate(Update update) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setText(update.getId().toString());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setText(update.getcodigo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setText(update.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setText(update.getquery_resumen());
			this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setText(update.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setDate(update.getfecha());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setDate(update.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setText(update.getorden().toString());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setSelected(update.getejecutado());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setSelected(update.getesta_activo());
			this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setText(update.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Update updateLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,updateLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Update updateLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				updateLocal=this.update;
			} else {
				updateLocal=this.updateAnterior;
			}
		}
		
		if(this.permiteMantenimiento(updateLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUpdate(updateLocal,true);
					
					if(updateSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(updateLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.updateSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(updateLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUpdate(Update update,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUpdate(update,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUpdate(update);
	}
	
	public void setVariablesFormularioToObjetoActualUpdate(Update update,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUpdate(update,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUpdate(Update update,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.getText()==null || this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.getText()=="" || this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.getText()=="Id") {
				this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setText("0");
			}

			if(conColumnasBase) {update.setId(Long.parseLong(this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelIdUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setcodigo(this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelcodigoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setcodigo_proceso(this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_CODIGOPROCESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelcodigo_procesoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setquery_resumen(this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_QUERYRESUMEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelquery_resumenUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setnumero_intento(Integer.parseInt(this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_NUMEROINTENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelnumero_intentoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setfecha(this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelfechaUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setfecha_archivo(this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_FECHAARCHIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelfecha_archivoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setorden(Integer.parseInt(this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelordenUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setejecutado(this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_EJECUTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelejecutadoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setesta_activo(this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabelesta_activoUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			update.setdescripcion(this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdate.jLabeldescripcionUpdate,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUpdate(Update updateBean,Update update,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUpdate(Update updateOrigen,Update update,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && updateOrigen.getId()!=null && !updateOrigen.getId().equals(0L))) {update.setId(updateOrigen.getId());}}
			if(conDefault || (!conDefault && updateOrigen.getcodigo()!=null && !updateOrigen.getcodigo().equals(""))) {update.setcodigo(updateOrigen.getcodigo());}
			if(conDefault || (!conDefault && updateOrigen.getcodigo_proceso()!=null && !updateOrigen.getcodigo_proceso().equals(""))) {update.setcodigo_proceso(updateOrigen.getcodigo_proceso());}
			if(conDefault || (!conDefault && updateOrigen.getquery_resumen()!=null && !updateOrigen.getquery_resumen().equals(""))) {update.setquery_resumen(updateOrigen.getquery_resumen());}
			if(conDefault || (!conDefault && updateOrigen.getnumero_intento()!=null && !updateOrigen.getnumero_intento().equals(0))) {update.setnumero_intento(updateOrigen.getnumero_intento());}
			if(conDefault || (!conDefault && updateOrigen.getfecha()!=null && !updateOrigen.getfecha().equals(new Date()))) {update.setfecha(updateOrigen.getfecha());}
			if(conDefault || (!conDefault && updateOrigen.getfecha_archivo()!=null && !updateOrigen.getfecha_archivo().equals(new Date()))) {update.setfecha_archivo(updateOrigen.getfecha_archivo());}
			if(conDefault || (!conDefault && updateOrigen.getorden()!=null && !updateOrigen.getorden().equals(0))) {update.setorden(updateOrigen.getorden());}
			if(conDefault || (!conDefault && updateOrigen.getejecutado()!=null && !updateOrigen.getejecutado().equals(false))) {update.setejecutado(updateOrigen.getejecutado());}
			if(conDefault || (!conDefault && updateOrigen.getesta_activo()!=null && !updateOrigen.getesta_activo().equals(false))) {update.setesta_activo(updateOrigen.getesta_activo());}
			if(conDefault || (!conDefault && updateOrigen.getdescripcion()!=null && !updateOrigen.getdescripcion().equals(""))) {update.setdescripcion(updateOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUpdate(Update update) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setText(update.getId().toString());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setText(update.getcodigo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setText(update.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setText(update.getquery_resumen());
			this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setText(update.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setDate(update.getfecha());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setDate(update.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setText(update.getorden().toString());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setSelected(update.getejecutado());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setSelected(update.getesta_activo());
			this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setText(update.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUpdate(UpdateBean updateBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setText(updateBean.getId().toString());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setText(updateBean.getcodigo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setText(updateBean.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setText(updateBean.getquery_resumen());
			this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setText(updateBean.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setDate(updateBean.getfecha());
			this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setDate(updateBean.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setText(updateBean.getorden().toString());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setSelected(updateBean.getejecutado());
			this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setSelected(updateBean.getesta_activo());
			this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setText(updateBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUpdate(UpdateParameterReturnGeneral updateReturnGeneral,UpdateBean updateBean,Boolean conDefault) throws Exception { 
		try {
			Update updateLocal=new Update();
			
			updateLocal=updateReturnGeneral.getUpdate();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && updateLocal.getId()!=null && !updateLocal.getId().equals(0L))) {updateBean.setId(updateLocal.getId());}}
			if(conDefault || (!conDefault && updateLocal.getcodigo()!=null && !updateLocal.getcodigo().equals(""))) {updateBean.setcodigo(updateLocal.getcodigo());}
			if(conDefault || (!conDefault && updateLocal.getcodigo_proceso()!=null && !updateLocal.getcodigo_proceso().equals(""))) {updateBean.setcodigo_proceso(updateLocal.getcodigo_proceso());}
			if(conDefault || (!conDefault && updateLocal.getquery_resumen()!=null && !updateLocal.getquery_resumen().equals(""))) {updateBean.setquery_resumen(updateLocal.getquery_resumen());}
			if(conDefault || (!conDefault && updateLocal.getnumero_intento()!=null && !updateLocal.getnumero_intento().equals(0))) {updateBean.setnumero_intento(updateLocal.getnumero_intento());}
			if(conDefault || (!conDefault && updateLocal.getfecha()!=null && !updateLocal.getfecha().equals(new Date()))) {updateBean.setfecha(updateLocal.getfecha());}
			if(conDefault || (!conDefault && updateLocal.getfecha_archivo()!=null && !updateLocal.getfecha_archivo().equals(new Date()))) {updateBean.setfecha_archivo(updateLocal.getfecha_archivo());}
			if(conDefault || (!conDefault && updateLocal.getorden()!=null && !updateLocal.getorden().equals(0))) {updateBean.setorden(updateLocal.getorden());}
			if(conDefault || (!conDefault && updateLocal.getejecutado()!=null && !updateLocal.getejecutado().equals(false))) {updateBean.setejecutado(updateLocal.getejecutado());}
			if(conDefault || (!conDefault && updateLocal.getesta_activo()!=null && !updateLocal.getesta_activo().equals(false))) {updateBean.setesta_activo(updateLocal.getesta_activo());}
			if(conDefault || (!conDefault && updateLocal.getdescripcion()!=null && !updateLocal.getdescripcion().equals(""))) {updateBean.setdescripcion(updateLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUpdateGenerico(Long idUpdateSeleccionado,JComboBox jComboBoxUpdate,List<Update> updatesLocal)throws Exception {
		try {
			Update  updateTemp=null;

			for(Update updateAux:updatesLocal) {
				if(updateAux.getId()!=null && updateAux.getId().equals(idUpdateSeleccionado)) {
					updateTemp=updateAux;
					break;
				}
			}

			jComboBoxUpdate.setSelectedItem(updateTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUpdateGenerico(JComboBox jComboBoxUpdate,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUpdate.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUpdate.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUpdate.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUpdate.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUpdate.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUpdate.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("UpdateDetalle")) {
			jButtonUpdateDetalleActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			update=(Update) updateLogic.getUpdates().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			update =(Update) updates.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!update.getIsNew() && !update.getIsChanged() && !update.getIsDeleted()) {
				sDescripcion=update.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=update.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!update.getIsNew() && !update.getIsChanged() && !update.getIsDeleted()) {
				sDescripcion=update.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=update.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Update updateRow=new Update();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			updateRow=(Update) updateLogic.getUpdates().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			updateRow=(Update) updates.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonUpdateDetalleActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Update update) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUpdate==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update = (Update)this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.update = (Update)this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(update!=null) {
						this.update = update;
					} else {
						this.update = new Update();
					}
				}

				if(this.isTienePermisosUpdateDetalle && this.permiteMantenimiento(this.update)) {
					UpdateDetalleBeanSwingJInternalFrame updatedetalleBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup=new UpdateDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						updatedetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup;
					} else {
						updatedetalleBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame;
					}

					List<Update> updates=new ArrayList<Update>();
					updates.add(this.update);
					if(!esRelacionado) {
						//updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setConGuardarRelaciones(false);
						//updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					updatedetalleBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUpdate.cargarUpdateDetalleBeanSwingJInternalFrame(updates,this.update,updatedetalleBeanSwingJInternalFrame,/*conInicializar,*/updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.getConGuardarRelaciones(),updatedetalleBeanSwingJInternalFrame.updatedetalleSessionBean.getEsGuardarRelacionado());
					updatedetalleBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						updatedetalleBeanSwingJInternalFrame.actualizarEstadoPanelsUpdateDetalle("no_relacionado");

						updatedetalleBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UpdateDetalleConstantesFunciones.ITAMANIOFILATABLA + (UpdateDetalleConstantesFunciones.ITAMANIOFILATABLA/2));

						updatedetalleBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUpdate=(TitledBorder)this.jScrollPanelDatosUpdate.getBorder();
						TitledBorder titledBorderUpdateDetalle=(TitledBorder)updatedetalleBeanSwingJInternalFrame.jScrollPanelDatosUpdateDetalle.getBorder();

						titledBorderUpdateDetalle.setTitle(titledBorderUpdate.getTitle() + " -> Update Detalle");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,updatedetalleBeanSwingJInternalFrame);
						}

						updatedetalleBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(updatedetalleBeanSwingJInternalFrame);

						updatedetalleBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.updateSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Update Detalle",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUpdate(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate));			
			this.jButtonDuplicarUpdate.setVisible((this.isVisibilidadCeldaDuplicarUpdate && this.isPermisoDuplicarUpdate));			
			this.jButtonCopiarUpdate.setVisible((this.isVisibilidadCeldaCopiarUpdate && this.isPermisoCopiarUpdate));
			this.jButtonVerFormUpdate.setVisible((this.isVisibilidadCeldaVerFormUpdate && this.isPermisoVerFormUpdate));
			
			this.jButtonAbrirOrderByUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));			
			
			this.jButtonNuevoRelacionesUpdate.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdate && this.isPermisoNuevoUpdate));			
			this.jButtonNuevoGuardarCambiosUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate && this.isPermisoGuardarCambiosUpdate));
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.jInternalFrameDetalleFormUpdate.jButtonModificarUpdate.setVisible((this.isVisibilidadCeldaModificarUpdate && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.setVisible((this.isVisibilidadCeldaActualizarUpdate && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.setVisible((this.isVisibilidadCeldaEliminarUpdate && this.isPermisoEliminarUpdate));
			this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.setVisible(this.isVisibilidadCeldaCancelarUpdate);							
			this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.setVisible((this.isVisibilidadCeldaGuardarUpdate && this.isPermisoGuardarCambiosUpdate));			
			
			}
						
			this.jButtonGuardarCambiosTablaUpdate.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdate && this.isPermisoGuardarCambiosUpdate));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate));						
			this.jButtonDuplicarToolBarUpdate.setVisible((this.isVisibilidadCeldaDuplicarUpdate && this.isPermisoDuplicarUpdate));						
			this.jButtonCopiarToolBarUpdate.setVisible((this.isVisibilidadCeldaCopiarUpdate && this.isPermisoCopiarUpdate));			
			this.jButtonVerFormToolBarUpdate.setVisible((this.isVisibilidadCeldaVerFormUpdate && this.isPermisoVerFormUpdate));			
			this.jButtonAbrirOrderByToolBarUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));
			this.jButtonNuevoRelacionesToolBarUpdate.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdate && this.isPermisoNuevoUpdate));			
			this.jButtonNuevoGuardarCambiosToolBarUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate && this.isPermisoGuardarCambiosUpdate));			
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.jInternalFrameDetalleFormUpdate.jButtonModificarToolBarUpdate.setVisible((this.isVisibilidadCeldaModificarUpdate && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jButtonActualizarToolBarUpdate.setVisible((this.isVisibilidadCeldaActualizarUpdate  && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jButtonEliminarToolBarUpdate.setVisible((this.isVisibilidadCeldaEliminarUpdate && this.isPermisoEliminarUpdate));
			this.jInternalFrameDetalleFormUpdate.jButtonCancelarToolBarUpdate.setVisible(this.isVisibilidadCeldaCancelarUpdate);				
			this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosToolBarUpdate.setVisible((this.isVisibilidadCeldaGuardarUpdate && this.isPermisoGuardarCambiosUpdate));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUpdate.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdate && this.isPermisoGuardarCambiosUpdate));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate));			
			this.jMenuItemDuplicarUpdate.setVisible((this.isVisibilidadCeldaDuplicarUpdate && this.isPermisoDuplicarUpdate));			
			this.jMenuItemCopiarUpdate.setVisible((this.isVisibilidadCeldaCopiarUpdate && this.isPermisoCopiarUpdate));			
			this.jMenuItemVerFormUpdate.setVisible((this.isVisibilidadCeldaVerFormUpdate && this.isPermisoVerFormUpdate));			
			this.jMenuItemAbrirOrderByUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));			
			//this.jMenuItemMostrarOcultarUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));
			this.jMenuItemDetalleAbrirOrderByUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));			
			//this.jMenuItemDetalleMostrarOcultarUpdate.setVisible((this.isVisibilidadCeldaOrdenUpdate && this.isPermisoOrdenUpdate));			
			this.jMenuItemNuevoRelacionesUpdate.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdate && this.isPermisoNuevoUpdate));			
			this.jMenuItemNuevoGuardarCambiosUpdate.setVisible((this.isVisibilidadCeldaNuevoUpdate && this.isPermisoNuevoUpdate && this.isPermisoGuardarCambiosUpdate));									
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.jInternalFrameDetalleFormUpdate.jMenuItemModificarUpdate.setVisible((this.isVisibilidadCeldaModificarUpdate && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jMenuItemActualizarUpdate.setVisible((this.isVisibilidadCeldaActualizarUpdate && this.isPermisoActualizarUpdate));	
			this.jInternalFrameDetalleFormUpdate.jMenuItemEliminarUpdate.setVisible((this.isVisibilidadCeldaEliminarUpdate && this.isPermisoEliminarUpdate));
			this.jInternalFrameDetalleFormUpdate.jMenuItemCancelarUpdate.setVisible(this.isVisibilidadCeldaCancelarUpdate);				
			}
			
			this.jMenuItemGuardarCambiosUpdate.setVisible((this.isVisibilidadCeldaGuardarUpdate && this.isPermisoGuardarCambiosUpdate));						
			this.jMenuItemGuardarCambiosTablaUpdate.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdate && this.isPermisoGuardarCambiosUpdate));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUpdate=this.jButtonNuevoUpdate.isVisible();
			this.isVisibilidadCeldaDuplicarUpdate=this.jButtonDuplicarUpdate.isVisible();
			this.isVisibilidadCeldaCopiarUpdate=this.jButtonCopiarUpdate.isVisible();
			this.isVisibilidadCeldaVerFormUpdate=this.jButtonVerFormUpdate.isVisible();
			
			this.isVisibilidadCeldaOrdenUpdate=this.jButtonAbrirOrderByUpdate.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUpdate=this.jButtonNuevoRelacionesUpdate.isVisible();
			this.isVisibilidadCeldaModificarUpdate=this.jButtonModificarUpdate.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.isVisibilidadCeldaActualizarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.isVisible();
			this.isVisibilidadCeldaEliminarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.isVisible();
			this.isVisibilidadCeldaCancelarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.isVisible();
			this.isVisibilidadCeldaGuardarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUpdate=this.jButtonGuardarCambiosTablaUpdate.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUpdate=this.jButtonNuevoToolBarUpdate.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUpdate=this.jButtonNuevoRelacionesToolBarUpdate.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.isVisibilidadCeldaModificarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonModificarToolBarUpdate.isVisible();
			this.isVisibilidadCeldaActualizarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonActualizarToolBarUpdate.isVisible();
			this.isVisibilidadCeldaEliminarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonEliminarToolBarUpdate.isVisible();
			this.isVisibilidadCeldaCancelarUpdate=this.jInternalFrameDetalleFormUpdate.jButtonCancelarToolBarUpdate.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUpdate=this.jButtonGuardarCambiosToolBarUpdate.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUpdate=this.jButtonGuardarCambiosTablaToolBarUpdate.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUpdate=this.jMenuItemNuevoUpdate.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUpdate=this.jMenuItemNuevoRelacionesUpdate.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.isVisibilidadCeldaModificarUpdate=this.jInternalFrameDetalleFormUpdate.jMenuItemModificarUpdate.isVisible();
			this.isVisibilidadCeldaActualizarUpdate=this.jInternalFrameDetalleFormUpdate.jMenuItemActualizarUpdate.isVisible();
			this.isVisibilidadCeldaEliminarUpdate=this.jInternalFrameDetalleFormUpdate.jMenuItemEliminarUpdate.isVisible();
			this.isVisibilidadCeldaCancelarUpdate=this.jInternalFrameDetalleFormUpdate.jMenuItemCancelarUpdate.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUpdate=this.jMenuItemGuardarCambiosUpdate.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUpdate=this.jMenuItemGuardarCambiosTablaUpdate.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUpdate(Boolean esInicializar) {
		if(UpdateJInternalFrame.ISBINDING_MANUAL) {			
			if(this.updateSessionBean.getConGuardarRelaciones()) {
				//if(this.updateSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUpdate();
			}
			
			this.inicializarActualizarBindingBotonesManualUpdate(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUpdate() {
		this.jButtonNuevoUpdate.setVisible(this.isPermisoNuevoUpdate);			
		this.jButtonDuplicarUpdate.setVisible(this.isPermisoDuplicarUpdate);			
		this.jButtonCopiarUpdate.setVisible(this.isPermisoCopiarUpdate);			
		this.jButtonVerFormUpdate.setVisible(this.isPermisoVerFormUpdate);			
		
		this.jButtonAbrirOrderByUpdate.setVisible(this.isPermisoOrdenUpdate);					
		
		this.jButtonNuevoRelacionesUpdate.setVisible(this.isPermisoNuevoUpdate);			
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonModificarUpdate.setVisible(this.isPermisoActualizarUpdate);	
			this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.setVisible(this.isPermisoActualizarUpdate);	
			this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.setVisible(this.isPermisoEliminarUpdate);
			this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.setVisible(this.isVisibilidadCeldaCancelarUpdate);						
			this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.setVisible(this.isPermisoGuardarCambiosUpdate);							
		}
		
		this.jButtonGuardarCambiosTablaUpdate.setVisible(this.isPermisoActualizarUpdate);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUpdate() {
		this.jInternalFrameDetalleFormUpdate.jButtonModificarUpdate.setVisible(this.isPermisoActualizarUpdate);	
		this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.setVisible(this.isPermisoActualizarUpdate);	
		this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.setVisible(this.isPermisoEliminarUpdate);
		this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.setVisible(this.isVisibilidadCeldaCancelarUpdate);							
		this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.setVisible((this.isVisibilidadCeldaGuardarUpdate && this.isPermisoGuardarCambiosUpdate));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUpdate() {
		if(UpdateJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUpdate();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUpdate() {
	}
	
	public void jTableDatosUpdateListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUpdate(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.update.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioUpdateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebUpdate(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUpdate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUpdate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.updateLogic.getConnexion());

				if(this.update.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.update.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUpdate=(TitledBorder)this.jScrollPanelDatosUpdate.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderUpdate.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.update.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesUpdateUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebUpdate(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUpdate.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUpdate.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.updateLogic.getConnexion());

				if(this.update.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.update.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUpdate=(TitledBorder)this.jScrollPanelDatosUpdate.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderUpdate.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.update.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.update.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_procesoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getcodigo_proceso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_proceso like '%"+this.update.getcodigo_proceso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonquery_resumenUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getquery_resumen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where query_resumen like '%"+this.update.getquery_resumen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_intentoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getnumero_intento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_intento = "+this.update.getnumero_intento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.update.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_archivoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getfecha_archivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_archivo = '"+Funciones2.getStringPostgresDate(this.update.getfecha_archivo())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.update.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonejecutadoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getejecutado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ejecutado = "+this.update.getejecutado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.update.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionUpdateBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdate.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdate(this.getupdate(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.update==null) {
						this.update = new Update();
					}

					this.setVariablesFormularioToObjetoActualUpdate(this.update,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);
				}

				if(this.update.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.update.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdate(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioUpdateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUpdate(false,false);

			this.getUpdatesFK_IdAnio();

			this.inicializarActualizarBindingUpdate(false);

			//if(UpdateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUpdate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesUpdateActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUpdate(false,false);

			this.getUpdatesFK_IdMes();

			this.inicializarActualizarBindingUpdate(false);

			//if(UpdateBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUpdate(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updateLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUpdate() {
		if(this.jInternalFrameDetalleFormUpdate!=null) {
		

		if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
			this.jInternalFrameDetalleFormUpdate.setVisible(false);	    			
			this.jInternalFrameDetalleFormUpdate.dispose();
			this.jInternalFrameDetalleFormUpdate=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUpdate!=null) {
			this.jInternalFrameReporteDinamicoUpdate.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUpdate.dispose();
			this.jInternalFrameReporteDinamicoUpdate=null;
		}
		
		if(this.jInternalFrameImportacionUpdate!=null) {
			this.jInternalFrameImportacionUpdate.setVisible(false);	    			
			this.jInternalFrameImportacionUpdate.dispose();
			this.jInternalFrameImportacionUpdate=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUpdate();
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			
			if(sTipo.equals("NuevoUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUpdate")) {
				jButtonDuplicarUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUpdate")) {
				jButtonCopiarUpdateActionPerformed(evt);
			} else if(sTipo.equals("VerFormUpdate")) {
				jButtonVerFormUpdateActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUpdate")) {
				jButtonDuplicarUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUpdate")) {
				jButtonDuplicarUpdateActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUpdate")) {
				jButtonModificarUpdateActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUpdate")) {
				jButtonModificarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUpdate")) {
				jButtonModificarUpdateActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUpdate")) {
				jButtonActualizarUpdateActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUpdate")) {
				jButtonActualizarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUpdate")) {
				jButtonActualizarUpdateActionPerformed(evt);
			} else if(sTipo.equals("EliminarUpdate")) {
				jButtonEliminarUpdateActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUpdate")) {
				jButtonEliminarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUpdate")) {
				jButtonEliminarUpdateActionPerformed(evt);
			} else if(sTipo.equals("CancelarUpdate")) {
				jButtonCancelarUpdateActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUpdate")) {
				jButtonCancelarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUpdate")) {
				jButtonCancelarUpdateActionPerformed(evt);
			} else if(sTipo.equals("CerrarUpdate")) {
				jButtonCerrarUpdateActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUpdate")) {
				jButtonCerrarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUpdate")) {
				jButtonCerrarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUpdate")) {
				jButtonMostrarOcultarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUpdate")) {
				jButtonCancelarUpdateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUpdate")) {
				jButtonCopiarUpdateActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUpdate")) {
				jButtonVerFormUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUpdate")) {
				jButtonCopiarUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUpdate")) {
				jButtonVerFormUpdateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUpdate")) {
				jButtonRecargarInformacionUpdateActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUpdate")) {
				jButtonRecargarInformacionUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUpdate")) {
				jButtonRecargarInformacionUpdateActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUpdate")) {
				jButtonAnterioresUpdateActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUpdate")) {
				jButtonAnterioresUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUpdate")) {
				jButtonAnterioresUpdateActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUpdate")) {
				jButtonSiguientesUpdateActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUpdate")) {
				jButtonSiguientesUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUpdate")) {
				jButtonSiguientesUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUpdate") || sTipo.equals("MenuItemDetalleAbrirOrderByUpdate")) {
				jButtonAbrirOrderByUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUpdate") || sTipo.equals("MenuItemDetalleMostrarOcultarUpdate")) {
				jButtonMostrarOcultarUpdateActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUpdate")) {
				jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUpdate")) {
				jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUpdate")) {
				jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUpdate")) {
				jButtonCerrarReporteDinamicoUpdateActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUpdate")) {
				jButtonGenerarReporteDinamicoUpdateActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUpdate")) {
				
				jButtonGenerarExcelReporteDinamicoUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUpdate")) {
				jButtonCerrarImportacionUpdateActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUpdate")) {
				
				jButtonGenerarImportacionUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUpdate")) {
				
				jButtonAbrirImportacionUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUpdate")) {
				jComboBoxTiposAccionesUpdateActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUpdate")) {
				jComboBoxTiposRelacionesUpdateActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUpdate")) {
				jComboBoxTiposAccionesUpdateActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUpdate")) {
				
				jComboBoxTiposSeleccionarUpdateActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUpdate")) {
				jTextFieldValorCampoGeneralUpdateActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUpdate")) {
				jButtonAbrirOrderByUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUpdate")) {
				jButtonAbrirOrderByUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUpdate")) {
				jButtonCerrarOrderByUpdateActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUpdateBusqueda")) {
				this.jButtonidUpdateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUpdateUpdate")) {
				this.jButtonid_anioUpdateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUpdateBusqueda")) {
				this.jButtonid_anioUpdateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesUpdateUpdate")) {
				this.jButtonid_mesUpdateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesUpdateBusqueda")) {
				this.jButtonid_mesUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoUpdateBusqueda")) {
				this.jButtoncodigoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_procesoUpdateBusqueda")) {
				this.jButtoncodigo_procesoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("query_resumenUpdateBusqueda")) {
				this.jButtonquery_resumenUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentoUpdateBusqueda")) {
				this.jButtonnumero_intentoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaUpdateBusqueda")) {
				this.jButtonfechaUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_archivoUpdateBusqueda")) {
				this.jButtonfecha_archivoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUpdateBusqueda")) {
				this.jButtonordenUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecutadoUpdateBusqueda")) {
				this.jButtonejecutadoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoUpdateBusqueda")) {
				this.jButtonesta_activoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionUpdateBusqueda")) {
				this.jButtondescripcionUpdateBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioUpdate")) {
				this.jButtonFK_IdAnioUpdateActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesUpdate")) {
				this.jButtonFK_IdMesUpdateActionPerformed(evt);
			}
			
			;
			
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUpdate();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Update updateLocal=null;
			
			if(!this.getEsControlTabla()) {
				updateLocal=this.update;
			} else {
				updateLocal=this.updateAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
							
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
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
			
			


			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
								
						
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
								
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
			
			this.actualizarInformacion("INFO_PADRE",false,this.update);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
							
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
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
			
			


			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
			
			this.actualizarInformacion("INFO_PADRE",false,this.update);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
								
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
			
			this.actualizarInformacion("INFO_PADRE",false,this.update);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUpdate")) {
					jCheckBoxSeleccionarTodosUpdateItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUpdate")) {
					jCheckBoxSeleccionadosUpdateItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUpdate")) {
					
				}
				
				


				
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
												
				
				


				
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
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
			
			


			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.update);
				
				this.actualizarInformacion("INFO_PADRE",false,this.update);
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
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
				
				


				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Update.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Update.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updateAnterior =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updateAnterior =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUpdate")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUpdateListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUpdate.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.update =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.update =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.update);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUpdate")) {
				
				}
				
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUpdate")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUpdate.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUpdate")) {
			
			}
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUpdate();
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			if(sTipo.equals("NuevoUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUpdate")) {
				jButtonDuplicarUpdateActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUpdate")) {
				jButtonCopiarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUpdate")) {
				jButtonVerFormUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUpdate")) {
				jButtonNuevoUpdateActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUpdate")) {
				jButtonModificarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUpdate")) {
				jButtonActualizarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUpdate")) {
				jButtonEliminarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUpdate")) {
				jButtonCancelarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUpdate")) {
				jButtonCerrarUpdateActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUpdate")) {
				jButtonGuardarCambiosUpdateActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUpdate")) {
				jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUpdate")) {
				jButtonAbrirOrderByUpdateActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUpdate")) {
				jButtonRecargarInformacionUpdateActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUpdate")) {
				jButtonAnterioresUpdateActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUpdate")) {
				jButtonSiguientesUpdateActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUpdateBusqueda")) {
				this.jButtonidUpdateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUpdateUpdate")) {
				this.jButtonid_anioUpdateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUpdateBusqueda")) {
				this.jButtonid_anioUpdateBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesUpdateUpdate")) {
				this.jButtonid_mesUpdateUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesUpdateBusqueda")) {
				this.jButtonid_mesUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoUpdateBusqueda")) {
				this.jButtoncodigoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_procesoUpdateBusqueda")) {
				this.jButtoncodigo_procesoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("query_resumenUpdateBusqueda")) {
				this.jButtonquery_resumenUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentoUpdateBusqueda")) {
				this.jButtonnumero_intentoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaUpdateBusqueda")) {
				this.jButtonfechaUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_archivoUpdateBusqueda")) {
				this.jButtonfecha_archivoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUpdateBusqueda")) {
				this.jButtonordenUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecutadoUpdateBusqueda")) {
				this.jButtonejecutadoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoUpdateBusqueda")) {
				this.jButtonesta_activoUpdateBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionUpdateBusqueda")) {
				this.jButtondescripcionUpdateBusquedaActionPerformed(evt);
			}
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUpdate();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUpdate")) {
				closingInternalFrameUpdate();
				
			} else if(sTipo.equals("jButtonCancelarUpdate")) {
				JInternalFrameBase jInternalFrameDetalleFormUpdate = (JInternalFrameBase)evt.getSource();
	            	
	            UpdateBeanSwingJInternalFrame jInternalFrameParent=(UpdateBeanSwingJInternalFrame)jInternalFrameDetalleFormUpdate.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUpdateActionPerformed(null);
			}
			
			UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.update,new Object(),this.updateParameterGeneral,this.updateReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUpdate(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUpdate(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUpdate(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.update)) {
			if(!esControlTabla) {
				if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUpdate(this.update,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);			
				}
				
				if(this.updateSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUpdate(this.update,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.updateReturnGeneral=updateLogic.procesarEventosUpdatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updateLogic.getUpdates(),this.update,this.updateParameterGeneral,this.isEsNuevoUpdate,classes);//this.updateLogic.getUpdate()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUpdate(this.updateReturnGeneral,this.updateBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.updateSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUpdate(classes,this.updateReturnGeneral,this.updateBean,false);
					}
						
					if(this.updateReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUpdate(this.updateReturnGeneral.getUpdate());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUpdate(this.updateReturnGeneral.getUpdate());	
					}
						
					if(this.updateReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUpdate(this.updateReturnGeneral.getUpdate(),classes);//this.updateBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUpdate(this.update,classes);//this.updateBean);									
				}
			
				if(UpdateJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUpdate(this.update,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdate(this.update);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.updateAnterior!=null) {
						this.update=this.updateAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.updateReturnGeneral=updateLogic.procesarEventosUpdatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updateLogic.getUpdates(),this.update,this.updateParameterGeneral,this.isEsNuevoUpdate,classes);//this.updateLogic.getUpdate()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.updateSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.updateSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.updateReturnGeneral.getUpdate(),updateLogic.getUpdates());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.updateReturnGeneral.getUpdate(),this.updates);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUpdate.repaint();
				
				//((AbstractTableModel) this.jTableDatosUpdate.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUpdate();
			}
		}
	}
	
	public void actualizarVisualTableDatosUpdate() throws Exception {
		
		UpdateModel updateModel=(UpdateModel)this.jTableDatosUpdate.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			updateModel.updates=this.updateLogic.getUpdates();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			updateModel.updates=this.updates;
		}
		
		
		((UpdateModel) this.jTableDatosUpdate.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUpdate() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getupdateAnterior(),this.updateLogic.getUpdates());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getupdateAnterior(),this.updates);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUpdate();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUpdate(Update update,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UpdateDetalle.class)) {
					this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleLogic.setUpdateDetalles(update.getUpdateDetalles());
					this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaUpdateDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
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
										
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.update,new Object(),generalEntityParameterGeneral,this.updateReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.updateSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UpdateConstantesFunciones.getClassesRelationshipsOfUpdate(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UpdateConstantesFunciones.getClassesRelationshipsFromStringsOfUpdate(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUpdate(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UpdateBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.update,new Object(),generalEntityParameterGeneral,this.updateReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUpdate(UpdateBean updateBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UpdateDetalle.class)) {
					this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleLogic.setUpdateDetalles(update.getUpdateDetalles());
					this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaUpdateDetalle(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUpdate(ArrayList<Classe> classes,UpdateReturnGeneral updateReturnGeneral,UpdateBean updateBean,Boolean conDefault) throws Exception {
		
			this.updateBean.setUpdateDetalles(updateReturnGeneral.getUpdate().getUpdateDetalles());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUpdate(Update update,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(UpdateDetalle.class)) {
					update.setUpdateDetalles(this.jInternalFrameDetalleFormUpdate.updatedetalleBeanSwingJInternalFrame.updatedetalleLogic.getUpdateDetalles());
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
		if(!paraTabla && !this.permiteMantenimiento(this.update)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUpdate = new UpdateDetalleFormJInternalFrame(jDesktopPane,this.updateSessionBean.getConGuardarRelaciones(),this.updateSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUpdate);
		this.jInternalFrameDetalleFormUpdate.setVisible(false);
		this.jInternalFrameDetalleFormUpdate.setSelected(false);						
		
		this.jInternalFrameDetalleFormUpdate.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUpdate.updateLogic=this.updateLogic;
		
		this.cargarCombosFrameForeignKeyUpdate("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUpdate();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUpdate();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUpdate("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUpdate();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUpdate.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUpdate"));
		
		this.jInternalFrameDetalleFormUpdate.jButtonModificarUpdate.addActionListener(new ButtonActionListener(this,"ModificarUpdate"));

		
		this.jInternalFrameDetalleFormUpdate.jButtonModificarToolBarUpdate.addActionListener(new ButtonActionListener(this,"ModificarToolBarUpdate"));
					
		this.jInternalFrameDetalleFormUpdate.jMenuItemModificarUpdate.addActionListener(new ButtonActionListener(this,"MenuItemModificarUpdate"));		
		
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.addActionListener (new ButtonActionListener(this,"ActualizarUpdate"));
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonActualizarToolBarUpdate.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUpdate"));
						
		this.jInternalFrameDetalleFormUpdate.jMenuItemActualizarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUpdate"));		
		
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.addActionListener (new ButtonActionListener(this,"EliminarUpdate"));
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonEliminarToolBarUpdate.addActionListener (new ButtonActionListener(this,"EliminarToolBarUpdate"));
								
		this.jInternalFrameDetalleFormUpdate.jMenuItemEliminarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUpdate"));		
		
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.addActionListener (new ButtonActionListener(this,"CancelarUpdate"));
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonCancelarToolBarUpdate.addActionListener (new ButtonActionListener(this,"CancelarToolBarUpdate"));
					
		this.jInternalFrameDetalleFormUpdate.jMenuItemCancelarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUpdate"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUpdate.jMenuItemDetalleCerrarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUpdate"));		
		
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosToolBarUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdate"));
		
		
		
		this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosToolBarUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdate"));
		
		
		
		this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUpdate"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonidUpdateBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigo_procesoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonquery_resumenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonnumero_intentoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfechaUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfecha_archivoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonordenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonejecutadoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonesta_activoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtondescripcionUpdateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUpdate"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUpdate"));
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUpdate"));
		}
		
		this.jTableDatosUpdate.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUpdate"));
		
		this.jTableDatosUpdate.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUpdate"));
		
		this.jButtonNuevoUpdate.addActionListener(new ButtonActionListener(this,"NuevoUpdate"));
		
		this.jButtonDuplicarUpdate.addActionListener(new ButtonActionListener(this,"DuplicarUpdate"));
		
		this.jButtonCopiarUpdate.addActionListener(new ButtonActionListener(this,"CopiarUpdate"));
		
		this.jButtonVerFormUpdate.addActionListener(new ButtonActionListener(this,"VerFormUpdate"));
		
		
		this.jButtonNuevoToolBarUpdate.addActionListener(new ButtonActionListener(this,"NuevoToolBarUpdate"));
			
		this.jButtonDuplicarToolBarUpdate.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUpdate"));
			
		this.jMenuItemNuevoUpdate.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUpdate"));
			
		this.jMenuItemDuplicarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUpdate"));		
		
		
		this.jButtonNuevoRelacionesUpdate.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUpdate"));
		
		
		this.jButtonNuevoRelacionesToolBarUpdate.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUpdate"));
			
		this.jMenuItemNuevoRelacionesUpdate.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUpdate"));		
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonModificarUpdate.addActionListener(new ButtonActionListener(this,"ModificarUpdate"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonModificarToolBarUpdate.addActionListener(new ButtonActionListener(this,"ModificarToolBarUpdate"));
			
			this.jInternalFrameDetalleFormUpdate.jMenuItemModificarUpdate.addActionListener(new ButtonActionListener(this,"MenuItemModificarUpdate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUpdate.jButtonActualizarUpdate.addActionListener (new ButtonActionListener(this,"ActualizarUpdate"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonActualizarToolBarUpdate.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUpdate"));
				
			this.jInternalFrameDetalleFormUpdate.jMenuItemActualizarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUpdate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonEliminarUpdate.addActionListener (new ButtonActionListener(this,"EliminarUpdate"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonEliminarToolBarUpdate.addActionListener (new ButtonActionListener(this,"EliminarToolBarUpdate"));
						
			this.jInternalFrameDetalleFormUpdate.jMenuItemEliminarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUpdate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonCancelarUpdate.addActionListener (new ButtonActionListener(this,"CancelarUpdate"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonCancelarToolBarUpdate.addActionListener (new ButtonActionListener(this,"CancelarToolBarUpdate"));
			
			this.jInternalFrameDetalleFormUpdate.jMenuItemCancelarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUpdate"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUpdate.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUpdate"));		
		
		
		this.jButtonCerrarUpdate.addActionListener (new ButtonActionListener(this,"CerrarUpdate"));
		
		
		this.jButtonCerrarToolBarUpdate.addActionListener (new ButtonActionListener(this,"CerrarToolBarUpdate"));
			
		this.jMenuItemCerrarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUpdate"));
			
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jMenuItemDetalleCerrarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUpdate"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosUpdate"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosToolBarUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdate"));
		}
		
		this.jButtonCopiarToolBarUpdate.addActionListener (new ButtonActionListener(this,"CopiarToolBarUpdate"));
			
		this.jButtonVerFormToolBarUpdate.addActionListener (new ButtonActionListener(this,"VerFormToolBarUpdate"));
		
		this.jMenuItemGuardarCambiosUpdate.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUpdate"));
			
		this.jMenuItemCopiarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUpdate"));		
		
		this.jMenuItemVerFormUpdate.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUpdate"));		
		
		
		this.jButtonGuardarCambiosTablaUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUpdate"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUpdate"));
			
		this.jMenuItemGuardarCambiosTablaUpdate.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUpdate"));		
		
		
		
		this.jButtonRecargarInformacionUpdate.addActionListener (new ButtonActionListener(this,"RecargarInformacionUpdate"));
					
		this.jButtonRecargarInformacionToolBarUpdate.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUpdate"));
		
		this.jMenuItemRecargarInformacionUpdate.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUpdate"));		
		
		
		
		this.jButtonAnterioresUpdate.addActionListener (new ButtonActionListener(this,"AnterioresUpdate"));
		
		
		this.jButtonAnterioresToolBarUpdate.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUpdate"));
		
		this.jMenuItemAnterioresUpdate.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUpdate"));		
		
		
		this.jButtonSiguientesUpdate.addActionListener (new ButtonActionListener(this,"SiguientesUpdate"));
		
		
		this.jButtonSiguientesToolBarUpdate.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUpdate"));
			
		this.jMenuItemSiguientesUpdate.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUpdate"));
			
		this.jMenuItemAbrirOrderByUpdate.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUpdate"));
			
		this.jMenuItemMostrarOcultarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUpdate"));
			
		this.jMenuItemDetalleAbrirOrderByUpdate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUpdate"));
			
		this.jMenuItemDetalleMostarOcultarUpdate.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUpdate"));		
		
		
		this.jButtonNuevoGuardarCambiosUpdate.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUpdate"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUpdate.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUpdate"));
			
		this.jMenuItemNuevoGuardarCambiosUpdate.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUpdate"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUpdate.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUpdate"));

		this.jCheckBoxSeleccionadosUpdate.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUpdate"));
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUpdate"));
		}
		
		
		this.jComboBoxTiposRelacionesUpdate.addActionListener (new ButtonActionListener(this,"TiposRelacionesUpdate"));
			
		this.jComboBoxTiposAccionesUpdate.addActionListener (new ButtonActionListener(this,"TiposAccionesUpdate"));
					
		this.jComboBoxTiposSeleccionarUpdate.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUpdate"));
			
		this.jTextFieldValorCampoGeneralUpdate.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUpdate"));		
		
		
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonidUpdateBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigo_procesoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonquery_resumenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonnumero_intentoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfechaUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfecha_archivoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonordenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonejecutadoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonesta_activoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtondescripcionUpdateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioUpdate.addActionListener(new ButtonActionListener(this,"FK_IdAnioUpdate"));

			this.jButtonFK_IdMesUpdate.addActionListener(new ButtonActionListener(this,"FK_IdMesUpdate"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUpdate!=null) {
				this.jInternalFrameReporteDinamicoUpdate.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdate"));
				this.jInternalFrameReporteDinamicoUpdate.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdate"));
				this.jInternalFrameReporteDinamicoUpdate.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdate"));
			}
			
			//this.jButtonCerrarReporteDinamicoUpdate.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdate"));				
			//this.jButtonGenerarReporteDinamicoUpdate.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdate"));
			//this.jButtonGenerarExcelReporteDinamicoUpdate.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdate"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUpdate!=null) {
				this.jInternalFrameImportacionUpdate.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUpdate"));
				this.jInternalFrameImportacionUpdate.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUpdate"));
				this.jInternalFrameImportacionUpdate.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUpdate"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUpdate.addActionListener (new ButtonActionListener(this,"AbrirOrderByUpdate"));
			
			this.jButtonAbrirOrderByToolBarUpdate.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUpdate"));			
			
			if(this.jInternalFrameOrderByUpdate!=null) {
				this.jInternalFrameOrderByUpdate.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUpdate"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUpdate!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdate.jTabbedPaneRelacionesUpdate.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUpdate"));
		
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
            		closingInternalFrameUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUpdate.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUpdate = (JInternalFrameBase)event.getSource();
	            	
	            UpdateBeanSwingJInternalFrame jInternalFrameParent=(UpdateBeanSwingJInternalFrame)jInternalFrameDetalleFormUpdate.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUpdateActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUpdate.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUpdateListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUpdate.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUpdate.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUpdate";
		inputMap = this.jButtonNuevoUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUpdateActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUpdate";
		inputMap = this.jButtonNuevoRelacionesUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUpdateActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUpdate";
		inputMap = this.jButtonModificarUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUpdate";
		inputMap = this.jButtonActualizarUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUpdate";
		inputMap = this.jButtonEliminarUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUpdate";
		inputMap = this.jButtonCancelarUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUpdate";
		inputMap = this.jButtonCerrarUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUpdate";
		inputMap = this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUpdate.jButtonGuardarCambiosUpdate.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUpdateActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUpdate.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUpdateItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUpdate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUpdateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUpdate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUpdateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUpdate.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUpdateActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonidUpdateBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_anioUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonid_mesUpdateBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtoncodigo_procesoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonquery_resumenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonnumero_intentoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfechaUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonfecha_archivoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonordenUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonejecutadoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtonesta_activoUpdateBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdate.jButtondescripcionUpdateBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateBusqueda"));
		
		
		this.jButtonFK_IdAnioUpdate.addActionListener(new ButtonActionListener(this,"FK_IdAnioUpdate"));

		this.jButtonFK_IdMesUpdate.addActionListener(new ButtonActionListener(this,"FK_IdMesUpdate"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUpdate.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUpdateActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUpdateActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUpdate.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUpdate(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Update updateAux:this.updateLogic.getUpdates()) {
					updateAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Update updateAux:updates) {
					updateAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUpdateItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUpdate(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Update updateAux:this.updateLogic.getUpdates()) {
						updateAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Update updateAux:updates) {
						updateAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Update updateAux:this.updateLogic.getUpdates()) {
					
						if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_EJECUTADO)) {
							existe=true;
							updateAux.setejecutado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							updateAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Update updateAux:updates) {
						
						if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_EJECUTADO)) {
							existe=true;
							updateAux.setejecutado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							updateAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUpdate(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUpdate.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUpdate.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUpdate,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUpdateItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUpdate(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUpdate.getSelectedRows();
			
			Update updateLocal=new Update();
			
			//this.seleccionarTodosUpdate(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLocal =(Update) this.updateLogic.getUpdates().toArray()[this.jTableDatosUpdate.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					updateLocal =(Update) this.updates.toArray()[this.jTableDatosUpdate.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				updateLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Update updateAux:this.updateLogic.getUpdates()) {
						updateAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Update updateAux:updates) {
						updateAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUpdate(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUpdate.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUpdate.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUpdate,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUpdateItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUpdateParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUpdateActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUpdate(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUpdate.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Update updateAux:this.updateLogic.getUpdates()) {
				
						if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							updateAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGOPROCESO)) {
							existe=true;
							updateAux.setcodigo_proceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_QUERYRESUMEN)) {
							existe=true;
							updateAux.setquery_resumen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_NUMEROINTENTO)) {
							existe=true;
							updateAux.setnumero_intento(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							updateAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHAARCHIVO)) {
							existe=true;
							updateAux.setfecha_archivo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							updateAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							updateAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Update updateAux:updates) {
					
						if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							updateAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGOPROCESO)) {
							existe=true;
							updateAux.setcodigo_proceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_QUERYRESUMEN)) {
							existe=true;
							updateAux.setquery_resumen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_NUMEROINTENTO)) {
							existe=true;
							updateAux.setnumero_intento(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							updateAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHAARCHIVO)) {
							existe=true;
							updateAux.setfecha_archivo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							updateAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							updateAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUpdate(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUpdateActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUpdate(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUpdate=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUpdate.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUpdate) {				
					conSplash=true;//false;										
					
					//this.startProcessUpdate(conSplash);
				
					this.generarReporteUpdatesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUpdatesSeleccionados();
				//this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUpdatesSeleccionados(false);
				//this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUpdatesSeleccionados(true);
				//this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUpdate();
				
				this.exportarUpdatesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUpdates();
				//this.importarUpdates();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUpdate();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUpdatesSeleccionados();
				//this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Update", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUpdate();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUpdate)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUpdate(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
				}	
			} 			
			else if(UpdateBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUpdate) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUpdate(conSplash);
					
						//this.actualizarParametrosGeneralUpdate();
						
						this.generarReporteProcesoAccionUpdatesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UpdateBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO UpdateS SELECCIONADOS?", "MANTENIMIENTO DE Update", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUpdate();
				
						this.actualizarParametrosGeneralUpdate();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.updateReturnGeneral=updateLogic.procesarAccionUpdatesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.updateLogic.getUpdates(),this.updateParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUpdateReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUpdate();
					
					UpdateBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUpdateReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUpdate.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUpdate.jComboBoxTiposAccionesFormularioUpdate.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUpdate(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUpdateActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUpdate();
			
			if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
			Update update=new Update();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUpdate(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUpdate.getSelectedItem();
			
			
			
			
			updatesSeleccionados=this.getUpdatesSeleccionados(true);
			//this.sTipoAccion;
			
			if(updatesSeleccionados.size()==1) {
				for(Update updateAux:updatesSeleccionados) {
					update=updateAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Update Detalle")) {
					jButtonUpdateDetalleActionPerformed(null,rowIndex,true,false,update);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUpdate();
			
      		//this.finishProcessUpdate(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUpdateReturnGeneral() throws Exception {
		if(this.updateReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.updateReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.updateReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.updateReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.updateReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.updateReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUpdate(false);
		}
		
		if(this.updateReturnGeneral.getConRetornoLista() || this.updateReturnGeneral.getConRetornoObjeto()) {
			if(this.updateReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.updateLogic.setUpdates(this.updateReturnGeneral.getUpdates());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.updateReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.updateLogic.setUpdate(this.updateReturnGeneral.getUpdate());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUpdate(false);
		}
	}
	
	public void actualizarParametrosGeneralUpdate() throws Exception {
		
		
	}
	
	public ArrayList<Update> getUpdatesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUpdate) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Update updateAux:updateLogic.getUpdates()) {
					if(updateAux.getIsSelected()) {
						updatesSeleccionados.add(updateAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Update updateAux:this.updates) {
					if(updateAux.getIsSelected()) {
						updatesSeleccionados.add(updateAux);				
					}
				}
			}
			
			if(updatesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						updatesSeleccionados.addAll(this.updateLogic.getUpdates());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						updatesSeleccionados.addAll(this.updates);				
					}
				}
			}
		} else {
			updatesSeleccionados.add(this.update);
		}
		
		return updatesSeleccionados;
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
	
	public void generarReporteUpdatesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUpdatesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUpdatesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUpdatesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUpdatesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesUpdatesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Update",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUpdates("Todos",updatesSeleccionados);
		
	}	
	
	public void generarReporteNormalUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUpdates("Todos",updatesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUpdatesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUpdates("Todos",updatesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUpdate();
		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUpdate();
		
		
		//this.generarReporteUpdates("Todos",updatesSeleccionados ,updateImplementable,updateImplementableHome);
	}
	
	public void mostrarImportacionUpdates() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUpdate();
		
		this.abrirFrameImportacionUpdate();		
		
			
		//this.generarReporteUpdates("Todos",updatesSeleccionados ,updateImplementable,updateImplementableHome);
	}
	
	public void importarUpdates() throws Exception {		
	
	}
	
	public void exportarUpdatesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUpdatesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUpdatesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUpdatesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Update",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUpdate(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Update updateAux:updatesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUpdate(updateAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//updateAux.setsDetalleGeneralEntityReporte(updateAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUpdate(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_CODIGOPROCESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_QUERYRESUMEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_NUMEROINTENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_FECHAARCHIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_EJECUTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_ESTAACTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUpdate(Update update,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=update.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getcodigo_proceso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getquery_resumen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getnumero_intento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getfecha_archivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getejecutado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getesta_activo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=update.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Updates");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUpdate(row);				
				iRow++;
			}				
			
			for(Update updateAux:updatesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUpdate(updateAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUpdatesSeleccionados() throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();		
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"update.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("updates");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("update");
			//elementRoot.appendChild(element);
		
			for(Update updateAux:updatesSeleccionados) {
				element = document.createElement("update");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUpdate(updateAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updateSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUpdate(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_CODIGOPROCESO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_QUERYRESUMEN);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_NUMEROINTENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_FECHAARCHIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_EJECUTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_ESTAACTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUpdate(Update update,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(update.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getcodigo_proceso());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getquery_resumen());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getnumero_intento());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getfecha_archivo());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getejecutado());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getesta_activo());
		cell = row.createCell(iColumn++);cell.setCellValue(update.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlUpdate(Update update,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UpdateConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(update.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UpdateConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(update.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementanio_descripcion = document.createElement(UpdateConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(update.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(UpdateConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(update.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementcodigo = document.createElement(UpdateConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(update.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcodigo_proceso = document.createElement(UpdateConstantesFunciones.CODIGOPROCESO);
		elementcodigo_proceso.appendChild(document.createTextNode(update.getcodigo_proceso().trim()));
		element.appendChild(elementcodigo_proceso);

		Element elementquery_resumen = document.createElement(UpdateConstantesFunciones.QUERYRESUMEN);
		elementquery_resumen.appendChild(document.createTextNode(update.getquery_resumen().trim()));
		element.appendChild(elementquery_resumen);

		Element elementnumero_intento = document.createElement(UpdateConstantesFunciones.NUMEROINTENTO);
		elementnumero_intento.appendChild(document.createTextNode(update.getnumero_intento().toString().trim()));
		element.appendChild(elementnumero_intento);

		Element elementfecha = document.createElement(UpdateConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(update.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_archivo = document.createElement(UpdateConstantesFunciones.FECHAARCHIVO);
		elementfecha_archivo.appendChild(document.createTextNode(update.getfecha_archivo().toString().trim()));
		element.appendChild(elementfecha_archivo);

		Element elementorden = document.createElement(UpdateConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(update.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementejecutado = document.createElement(UpdateConstantesFunciones.EJECUTADO);
		elementejecutado.appendChild(document.createTextNode(update.getejecutado().toString().trim()));
		element.appendChild(elementejecutado);

		Element elementesta_activo = document.createElement(UpdateConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(update.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);

		Element elementdescripcion = document.createElement(UpdateConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(update.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoUpdatesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Update> updatesSeleccionados=new ArrayList<Update>();
		
		updatesSeleccionados=this.getUpdatesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUpdate(updatesSeleccionados);
		
		this.generarReporteUpdates("Todos",updatesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUpdate(ArrayList<Update> updatesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Update updateAux:updatesSeleccionados) {
				updateAux.setsDetalleGeneralEntityReporte(updateAux.toString());
			
				if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_CODIGOPROCESO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getcodigo_proceso());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_QUERYRESUMEN)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getquery_resumen());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_NUMEROINTENTO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getnumero_intento().toString());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(updateAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_FECHAARCHIVO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(updateAux.getfecha_archivo()));
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_EJECUTADO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(updateAux.getejecutado()));
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(updateAux.getesta_activo()));
				}
				 else if(sTipoSeleccionar.equals(UpdateConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					updateAux.setsDescripcionGeneralEntityReporte1(updateAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUpdate(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUpdate=true;
				this.isVisibilidadCeldaNuevoRelacionesUpdate=true;
				this.isVisibilidadCeldaGuardarCambiosUpdate=true;
			}
			
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=true;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=true;
			this.isVisibilidadCeldaEliminarUpdate=true;
			this.isVisibilidadCeldaCancelarUpdate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=true;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUpdate=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=true;
			this.isVisibilidadCeldaGuardarCambiosUpdate=true;
			this.isVisibilidadCeldaModificarUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
			this.isVisibilidadCeldaModificarUpdate=true;
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
			this.isVisibilidadCeldaCancelarUpdate=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdate=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdate=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UpdateJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUpdate=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdate=true;
			this.isVisibilidadCeldaGuardarCambiosUpdate=true;
		} else {
			this.actualizarEstadoPanelsUpdate(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUpdate=false;
			//this.isVisibilidadCeldaVerFormUpdate=false;
			this.isVisibilidadCeldaDuplicarUpdate=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!updateSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
		} else {
			this.isVisibilidadCeldaNuevoUpdate=false;
			this.isVisibilidadCeldaGuardarCambiosUpdate=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(updateSessionBean.getEsGuardarRelacionado()) {
			if(!updateSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUpdate=false;												
			}
			
			this.jButtonCerrarUpdate.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUpdate=false;
		}
		
		if(!this.permiteMantenimiento(this.update)) {
			this.isVisibilidadCeldaActualizarUpdate=false;
			this.isVisibilidadCeldaEliminarUpdate=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUpdate() {
		this.isVisibilidadCeldaNuevoUpdate=false;
		this.isVisibilidadCeldaGuardarCambiosUpdate=false;
	}
	
	public void actualizarEstadoPanelsUpdate(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUpdate!=null) {
				this.jScrollPanelDatosEdicionUpdate.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdate!=null) {
				this.jScrollPanelDatosUpdate.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdate!=null) {
				this.jPanelPaginacionUpdate.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.updateSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUpdate!=null) {
					this.jTabbedPaneBusquedasUpdate.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.updateSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdate!=null) {
				this.jTabbedPaneBusquedasUpdate.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUpdate!=null) {
				this.jPanelParametrosReportesUpdate.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUpdate.remove(jPanelFK_IdAnioUpdate);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasUpdate.remove(jPanelFK_IdMesUpdate);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUpdate.remove(jPanelFK_IdAnioUpdate);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasUpdate.remove(jPanelFK_IdMesUpdate);}
		}
		
	}
	
	

	public String registrarSesionUpdateParaUpdateDetalles() throws Exception {
		Boolean isPaginaPopupUpdateDetalle=false;

		try {

			if(this.updateSessionBean==null) {
				this.updateSessionBean=new UpdateSessionBean();
			}

			if(this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean==null) {
				this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}

			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setsPathNavegacionActual(updateSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUpdateDetalle=this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUpdateDetalle(true);
			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUpdateDetalle(UpdateConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setisBusquedaDesdeForeignKeySesionUpdate(true);
			this.jInternalFrameDetalleFormUpdate.updatedetalleSessionBean.setlidUpdateActual(this.idUpdateActual);

			updateSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUpdate(true);
			updateSessionBean.setlIdUpdateActualForeignKey(this.idUpdateActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UpdateSessionBean updateSessionBean=new UpdateSessionBean();
		
		if(this.updateSessionBean==null) {
			this.updateSessionBean=new UpdateSessionBean();
		}
		
		this.updateSessionBean.setsUltimaBusquedaUpdate(this.getsAccionBusqueda());
		this.updateSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.updateSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			updateSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			updateSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UpdateSessionBean updateSessionBean=new UpdateSessionBean();
		
		if(this.updateSessionBean==null) {
			this.updateSessionBean=new UpdateSessionBean();
		}
		
		if(this.updateSessionBean.getsUltimaBusquedaUpdate()!=null&&!this.updateSessionBean.getsUltimaBusquedaUpdate().equals("")) {
			this.setsAccionBusqueda(updateSessionBean.getsUltimaBusquedaUpdate());
			this.setiNumeroPaginacion(updateSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(updateSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(updateSessionBean.getid_anio());
				updateSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(updateSessionBean.getid_mes());
				updateSessionBean.setid_mes(null);
			}
		}
		
		this.updateSessionBean.setsUltimaBusquedaUpdate("");
		this.updateSessionBean.setiNumeroPaginacion(UpdateConstantesFunciones.INUMEROPAGINACION);
		this.updateSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUpdate(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUpdate() {
		this.updateBorderResaltarBusquedasFormularioUpdate();
		this.updateVisibilidadBusquedasFormularioUpdate();
		this.updateHabilitarBusquedasFormularioUpdate();
	}
	
	public void updateBorderResaltarBusquedasFormularioUpdate() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUpdate.getComponents().length>0) {
	

		if(this.updateConstantesFunciones.resaltarFK_IdAnioUpdate!=null) {
			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdAnioUpdate);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
				jPanel.setBorder(this.updateConstantesFunciones.resaltarFK_IdAnioUpdate);
			}
		}

		if(this.updateConstantesFunciones.resaltarFK_IdMesUpdate!=null) {
			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdMesUpdate);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
				jPanel.setBorder(this.updateConstantesFunciones.resaltarFK_IdMesUpdate);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUpdate() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUpdate.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdAnioUpdate);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.updateConstantesFunciones.mostrarFK_IdAnioUpdate);
			if(!this.updateConstantesFunciones.mostrarFK_IdAnioUpdate && index>-1) {
				this.jTabbedPaneBusquedasUpdate.remove(index);
			}

			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdMesUpdate);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.updateConstantesFunciones.mostrarFK_IdMesUpdate);
			if(!this.updateConstantesFunciones.mostrarFK_IdMesUpdate && index>-1) {
				this.jTabbedPaneBusquedasUpdate.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUpdate() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUpdate.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdAnioUpdate);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.updateConstantesFunciones.activarFK_IdAnioUpdate);
				this.jTabbedPaneBusquedasUpdate.setEnabledAt(index,this.updateConstantesFunciones.activarFK_IdAnioUpdate);
			}

			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdMesUpdate);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.updateConstantesFunciones.activarFK_IdMesUpdate);
				this.jTabbedPaneBusquedasUpdate.setEnabledAt(index,this.updateConstantesFunciones.activarFK_IdMesUpdate);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUpdate(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdAnioUpdate);

			this.jTabbedPaneBusquedasUpdate.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);

			this.updateConstantesFunciones.setResaltarFK_IdAnioUpdate(resaltar);

			jPanel.setBorder(this.updateConstantesFunciones.resaltarFK_IdAnioUpdate);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasUpdate.indexOfComponent(this.jPanelFK_IdMesUpdate);

			this.jTabbedPaneBusquedasUpdate.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdate.getComponent(index);

			this.updateConstantesFunciones.setResaltarFK_IdMesUpdate(resaltar);

			jPanel.setBorder(this.updateConstantesFunciones.resaltarFK_IdMesUpdate);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUpdate.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUpdate() throws Exception {

		if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUpdate();
		this.updateVisibilidadResaltarControlesFormularioUpdate();
		this.updateHabilitarResaltarControlesFormularioUpdate();
		
	}
	
	public void updateBorderResaltarControlesFormularioUpdate() throws Exception {
		if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.updateConstantesFunciones.resaltaridUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setBorder(this.updateConstantesFunciones.resaltaridUpdate);}
		if(this.updateConstantesFunciones.resaltarid_anioUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setBorder(this.updateConstantesFunciones.resaltarid_anioUpdate);}
		if(this.updateConstantesFunciones.resaltarid_mesUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setBorder(this.updateConstantesFunciones.resaltarid_mesUpdate);}
		if(this.updateConstantesFunciones.resaltarcodigoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setBorder(this.updateConstantesFunciones.resaltarcodigoUpdate);}
		if(this.updateConstantesFunciones.resaltarcodigo_procesoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setBorder(this.updateConstantesFunciones.resaltarcodigo_procesoUpdate);}
		if(this.updateConstantesFunciones.resaltarquery_resumenUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setBorder(this.updateConstantesFunciones.resaltarquery_resumenUpdate);}
		if(this.updateConstantesFunciones.resaltarnumero_intentoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setBorder(this.updateConstantesFunciones.resaltarnumero_intentoUpdate);}
		if(this.updateConstantesFunciones.resaltarfechaUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setBorder(this.updateConstantesFunciones.resaltarfechaUpdate);}
		if(this.updateConstantesFunciones.resaltarfecha_archivoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setBorder(this.updateConstantesFunciones.resaltarfecha_archivoUpdate);}
		if(this.updateConstantesFunciones.resaltarordenUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setBorder(this.updateConstantesFunciones.resaltarordenUpdate);}
		if(this.updateConstantesFunciones.resaltarejecutadoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setBorderPainted(true);this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setBorder(this.updateConstantesFunciones.resaltarejecutadoUpdate);}
		if(this.updateConstantesFunciones.resaltaresta_activoUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setBorderPainted(true);this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setBorder(this.updateConstantesFunciones.resaltaresta_activoUpdate);}
		if(this.updateConstantesFunciones.resaltardescripcionUpdate!=null && this.jInternalFrameDetalleFormUpdate!=null) {this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setBorder(this.updateConstantesFunciones.resaltardescripcionUpdate);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUpdate() throws Exception {		
		if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
	
		//this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setVisible(this.updateConstantesFunciones.mostraridUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelidUpdate.setVisible(this.updateConstantesFunciones.mostraridUpdate);
		//this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setVisible(this.updateConstantesFunciones.mostrarid_anioUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelid_anioUpdate.setVisible(this.updateConstantesFunciones.mostrarid_anioUpdate);
		//this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setVisible(this.updateConstantesFunciones.mostrarid_mesUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelid_mesUpdate.setVisible(this.updateConstantesFunciones.mostrarid_mesUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setVisible(this.updateConstantesFunciones.mostrarcodigoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelcodigoUpdate.setVisible(this.updateConstantesFunciones.mostrarcodigoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setVisible(this.updateConstantesFunciones.mostrarcodigo_procesoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelcodigo_procesoUpdate.setVisible(this.updateConstantesFunciones.mostrarcodigo_procesoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setVisible(this.updateConstantesFunciones.mostrarquery_resumenUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelquery_resumenUpdate.setVisible(this.updateConstantesFunciones.mostrarquery_resumenUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setVisible(this.updateConstantesFunciones.mostrarnumero_intentoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelnumero_intentoUpdate.setVisible(this.updateConstantesFunciones.mostrarnumero_intentoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setVisible(this.updateConstantesFunciones.mostrarfechaUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelfechaUpdate.setVisible(this.updateConstantesFunciones.mostrarfechaUpdate);
		//this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setVisible(this.updateConstantesFunciones.mostrarfecha_archivoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelfecha_archivoUpdate.setVisible(this.updateConstantesFunciones.mostrarfecha_archivoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setVisible(this.updateConstantesFunciones.mostrarordenUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelordenUpdate.setVisible(this.updateConstantesFunciones.mostrarordenUpdate);
		//this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setVisible(this.updateConstantesFunciones.mostrarejecutadoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelejecutadoUpdate.setVisible(this.updateConstantesFunciones.mostrarejecutadoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setVisible(this.updateConstantesFunciones.mostraresta_activoUpdate);
		this.jInternalFrameDetalleFormUpdate.jPanelesta_activoUpdate.setVisible(this.updateConstantesFunciones.mostraresta_activoUpdate);
		//this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setVisible(this.updateConstantesFunciones.mostrardescripcionUpdate);
		this.jInternalFrameDetalleFormUpdate.jPaneldescripcionUpdate.setVisible(this.updateConstantesFunciones.mostrardescripcionUpdate);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUpdate() throws Exception {
		if(this.jInternalFrameDetalleFormUpdate==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUpdate!=null) {
	
		this.jInternalFrameDetalleFormUpdate.jTextFieldidUpdate.setEnabled(this.updateConstantesFunciones.activaridUpdate);
		this.jInternalFrameDetalleFormUpdate.jComboBoxid_anioUpdate.setEnabled(this.updateConstantesFunciones.activarid_anioUpdate);
		this.jInternalFrameDetalleFormUpdate.jComboBoxid_mesUpdate.setEnabled(this.updateConstantesFunciones.activarid_mesUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldcodigoUpdate.setEnabled(this.updateConstantesFunciones.activarcodigoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldcodigo_procesoUpdate.setEnabled(this.updateConstantesFunciones.activarcodigo_procesoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextAreaquery_resumenUpdate.setEnabled(this.updateConstantesFunciones.activarquery_resumenUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldnumero_intentoUpdate.setEnabled(this.updateConstantesFunciones.activarnumero_intentoUpdate);
		this.jInternalFrameDetalleFormUpdate.jDateChooserfechaUpdate.setEnabled(this.updateConstantesFunciones.activarfechaUpdate);
		this.jInternalFrameDetalleFormUpdate.jDateChooserfecha_archivoUpdate.setEnabled(this.updateConstantesFunciones.activarfecha_archivoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextFieldordenUpdate.setEnabled(this.updateConstantesFunciones.activarordenUpdate);
		this.jInternalFrameDetalleFormUpdate.jCheckBoxejecutadoUpdate.setEnabled(this.updateConstantesFunciones.activarejecutadoUpdate);
		this.jInternalFrameDetalleFormUpdate.jCheckBoxesta_activoUpdate.setEnabled(this.updateConstantesFunciones.activaresta_activoUpdate);
		this.jInternalFrameDetalleFormUpdate.jTextAreadescripcionUpdate.setEnabled(this.updateConstantesFunciones.activardescripcionUpdate);
		}
	}
	
		
}